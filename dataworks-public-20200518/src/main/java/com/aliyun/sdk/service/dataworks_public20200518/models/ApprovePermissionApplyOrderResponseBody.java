// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link ApprovePermissionApplyOrderResponseBody} extends {@link TeaModel}
 *
 * <p>ApprovePermissionApplyOrderResponseBody</p>
 */
public class ApprovePermissionApplyOrderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApproveSuccess")
    private Boolean approveSuccess;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ApprovePermissionApplyOrderResponseBody(Builder builder) {
        this.approveSuccess = builder.approveSuccess;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApprovePermissionApplyOrderResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return approveSuccess
     */
    public Boolean getApproveSuccess() {
        return this.approveSuccess;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean approveSuccess; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ApprovePermissionApplyOrderResponseBody model) {
            this.approveSuccess = model.approveSuccess;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Indicates whether the permission request order is processed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder approveSuccess(Boolean approveSuccess) {
            this.approveSuccess = approveSuccess;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0bc1ec92159376****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ApprovePermissionApplyOrderResponseBody build() {
            return new ApprovePermissionApplyOrderResponseBody(this);
        } 

    } 

}
