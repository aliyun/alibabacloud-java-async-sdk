// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RecoveryContent} extends {@link TeaModel}
 *
 * <p>RecoveryContent</p>
 */
public class RecoveryContent extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthReportInterval")
    private AuthReportInterval authReportInterval;

    @com.aliyun.core.annotation.NameInMap("RecoveryActions")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> recoveryActions;

    private RecoveryContent(Builder builder) {
        this.authReportInterval = builder.authReportInterval;
        this.recoveryActions = builder.recoveryActions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecoveryContent create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authReportInterval
     */
    public AuthReportInterval getAuthReportInterval() {
        return this.authReportInterval;
    }

    /**
     * @return recoveryActions
     */
    public java.util.List<String> getRecoveryActions() {
        return this.recoveryActions;
    }

    public static final class Builder {
        private AuthReportInterval authReportInterval; 
        private java.util.List<String> recoveryActions; 

        private Builder() {
        } 

        private Builder(RecoveryContent model) {
            this.authReportInterval = model.authReportInterval;
            this.recoveryActions = model.recoveryActions;
        } 

        /**
         * <p>The validity period configuration after authentication-based recovery. This parameter is used when RecoveryActions includes auth.</p>
         */
        public Builder authReportInterval(AuthReportInterval authReportInterval) {
            this.authReportInterval = authReportInterval;
            return this;
        }

        /**
         * <p>The set of recovery methods after mitigation. Valid values:</p>
         * <ul>
         * <li><strong>auto</strong>: Automatic recovery.</li>
         * <li><strong>auth</strong>: Recovery after the user completes authentication.</li>
         * <li><strong>console</strong>: Manual recovery by an administrator in the console.</li>
         * </ul>
         * <p>This parameter is required.</p>
         */
        public Builder recoveryActions(java.util.List<String> recoveryActions) {
            this.recoveryActions = recoveryActions;
            return this;
        }

        public RecoveryContent build() {
            return new RecoveryContent(this);
        } 

    } 

}
