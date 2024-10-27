package com.lbh_trades_server.modal;

import com.lbh_trades_server.domain.VerificationType;

import lombok.Data;

@Data
public class TwoFactorAuthentication {

	private boolean isEnabled = false;

	private VerificationType verification;
}
