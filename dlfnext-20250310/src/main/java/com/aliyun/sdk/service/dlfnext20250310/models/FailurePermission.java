// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link FailurePermission} extends {@link TeaModel}
 *
 * <p>FailurePermission</p>
 */
public class FailurePermission extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("permission")
    private Permission permission;

    private FailurePermission(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.permission = builder.permission;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FailurePermission create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return permission
     */
    public Permission getPermission() {
        return this.permission;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private Permission permission; 

        private Builder() {
        } 

        private Builder(FailurePermission model) {
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.permission = model.permission;
        } 

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * permission.
         */
        public Builder permission(Permission permission) {
            this.permission = permission;
            return this;
        }

        public FailurePermission build() {
            return new FailurePermission(this);
        } 

    } 

}
