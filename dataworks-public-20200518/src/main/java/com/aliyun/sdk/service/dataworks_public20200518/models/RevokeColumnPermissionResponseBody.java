// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokeColumnPermissionResponseBody} extends {@link TeaModel}
 *
 * <p>RevokeColumnPermissionResponseBody</p>
 */
public class RevokeColumnPermissionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RevokeSuccess")
    private Boolean revokeSuccess;

    private RevokeColumnPermissionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.revokeSuccess = builder.revokeSuccess;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeColumnPermissionResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return revokeSuccess
     */
    public Boolean getRevokeSuccess() {
        return this.revokeSuccess;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean revokeSuccess; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder revokeSuccess(Boolean revokeSuccess) {
            this.revokeSuccess = revokeSuccess;
            return this;
        }

        public RevokeColumnPermissionResponseBody build() {
            return new RevokeColumnPermissionResponseBody(this);
        } 

    } 

}
