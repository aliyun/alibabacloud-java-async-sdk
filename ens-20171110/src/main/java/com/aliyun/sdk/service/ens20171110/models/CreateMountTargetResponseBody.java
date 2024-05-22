// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMountTargetResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMountTargetResponseBody</p>
 */
public class CreateMountTargetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private CreateMountTargetResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMountTargetResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String requestId; 
        private String status; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The state of the mount target. Valid values:
         * <p>
         * 
         * *   active
         * *   inactive
         * *   pending
         * *   deleting
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public CreateMountTargetResponseBody build() {
            return new CreateMountTargetResponseBody(this);
        } 

    } 

}
