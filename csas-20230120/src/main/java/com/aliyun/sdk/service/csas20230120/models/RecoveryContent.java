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

        /**
         * AuthReportInterval.
         */
        public Builder authReportInterval(AuthReportInterval authReportInterval) {
            this.authReportInterval = authReportInterval;
            return this;
        }

        /**
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
