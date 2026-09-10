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
         * <ul>
         * <li><p>If success is false, a business error message is returned.</p>
         * </li>
         * <li><p>If success is true, an empty value is returned.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>空</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The results of permissions that failed to be revoked in batches.</p>
         */
        public Builder failurePermissions(java.util.List<FailurePermission> failurePermissions) {
            this.failurePermissions = failurePermissions;
            return this;
        }

        /**
         * <p>Indicates whether the API call is successful. Valid values:</p>
         * <ul>
         * <li>true: The API call is successful.</li>
         * <li>false: The API call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
