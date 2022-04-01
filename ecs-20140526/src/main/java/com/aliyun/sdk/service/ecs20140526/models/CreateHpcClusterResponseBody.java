// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHpcClusterResponseBody} extends {@link TeaModel}
 *
 * <p>CreateHpcClusterResponseBody</p>
 */
public class CreateHpcClusterResponseBody extends TeaModel {
    @NameInMap("HpcClusterId")
    private String hpcClusterId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateHpcClusterResponseBody(Builder builder) {
        this.hpcClusterId = builder.hpcClusterId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHpcClusterResponseBody create() {
        return builder().build();
    }

    /**
     * @return hpcClusterId
     */
    public String getHpcClusterId() {
        return this.hpcClusterId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String hpcClusterId; 
        private String requestId; 

        /**
         * HpcClusterId.
         */
        public Builder hpcClusterId(String hpcClusterId) {
            this.hpcClusterId = hpcClusterId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateHpcClusterResponseBody build() {
            return new CreateHpcClusterResponseBody(this);
        } 

    } 

}
