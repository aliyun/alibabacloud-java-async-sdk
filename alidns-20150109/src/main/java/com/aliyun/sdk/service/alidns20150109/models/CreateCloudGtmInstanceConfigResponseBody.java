// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCloudGtmInstanceConfigResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCloudGtmInstanceConfigResponseBody</p>
 */
public class CreateCloudGtmInstanceConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigId")
    private Boolean configId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateCloudGtmInstanceConfigResponseBody(Builder builder) {
        this.configId = builder.configId;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCloudGtmInstanceConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return configId
     */
    public Boolean getConfigId() {
        return this.configId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Boolean configId; 
        private String requestId; 
        private Boolean success; 

        /**
         * ConfigId.
         */
        public Builder configId(Boolean configId) {
            this.configId = configId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateCloudGtmInstanceConfigResponseBody build() {
            return new CreateCloudGtmInstanceConfigResponseBody(this);
        } 

    } 

}
