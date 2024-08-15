// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServiceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateServiceGroupResponseBody</p>
 */
public class CreateServiceGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateServiceGroupResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateServiceGroupResponseBody build() {
            return new CreateServiceGroupResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("serviceGroupId")
        private Long serviceGroupId;

        private Data(Builder builder) {
            this.serviceGroupId = builder.serviceGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return serviceGroupId
         */
        public Long getServiceGroupId() {
            return this.serviceGroupId;
        }

        public static final class Builder {
            private Long serviceGroupId; 

            /**
             * serviceGroupId.
             */
            public Builder serviceGroupId(Long serviceGroupId) {
                this.serviceGroupId = serviceGroupId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
