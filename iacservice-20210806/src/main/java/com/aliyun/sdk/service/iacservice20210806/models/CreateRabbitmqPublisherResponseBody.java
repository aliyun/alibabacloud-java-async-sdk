// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRabbitmqPublisherResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRabbitmqPublisherResponseBody</p>
 */
public class CreateRabbitmqPublisherResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("publisherId")
    private String publisherId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateRabbitmqPublisherResponseBody(Builder builder) {
        this.publisherId = builder.publisherId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRabbitmqPublisherResponseBody create() {
        return builder().build();
    }

    /**
     * @return publisherId
     */
    public String getPublisherId() {
        return this.publisherId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String publisherId; 
        private String requestId; 

        /**
         * publisherId.
         */
        public Builder publisherId(String publisherId) {
            this.publisherId = publisherId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateRabbitmqPublisherResponseBody build() {
            return new CreateRabbitmqPublisherResponseBody(this);
        } 

    } 

}
