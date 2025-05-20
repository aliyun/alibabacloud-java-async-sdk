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
 * {@link BatchRevokePermissionsResponseBody} extends {@link TeaModel}
 *
 * <p>BatchRevokePermissionsResponseBody</p>
 */
public class BatchRevokePermissionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("failurePermissions")
    private java.util.List<FailurePermission> failurePermissions;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private BatchRevokePermissionsResponseBody(Builder builder) {
        this.errorMessage = builder.errorMessage;
        this.failurePermissions = builder.failurePermissions;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchRevokePermissionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return failurePermissions
     */
    public java.util.List<FailurePermission> getFailurePermissions() {
        return this.failurePermissions;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorMessage; 
        private java.util.List<FailurePermission> failurePermissions; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(BatchRevokePermissionsResponseBody model) {
            this.errorMessage = model.errorMessage;
            this.failurePermissions = model.failurePermissions;
            this.success = model.success;
        } 

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * failurePermissions.
         */
        public Builder failurePermissions(java.util.List<FailurePermission> failurePermissions) {
            this.failurePermissions = failurePermissions;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public BatchRevokePermissionsResponseBody build() {
            return new BatchRevokePermissionsResponseBody(this);
        } 

    } 

}
