// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIntegrationConfigResponseBody} extends {@link TeaModel}
 *
 * <p>CreateIntegrationConfigResponseBody</p>
 */
public class CreateIntegrationConfigResponseBody extends TeaModel {
    @NameInMap("data")
    private Data data;

    @NameInMap("requestId")
    private String requestId;

    private CreateIntegrationConfigResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIntegrationConfigResponseBody create() {
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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateIntegrationConfigResponseBody build() {
            return new CreateIntegrationConfigResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("integrationConfigId")
        private Long integrationConfigId;

        private Data(Builder builder) {
            this.integrationConfigId = builder.integrationConfigId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return integrationConfigId
         */
        public Long getIntegrationConfigId() {
            return this.integrationConfigId;
        }

        public static final class Builder {
            private Long integrationConfigId; 

            /**
             * 集成配置id
             */
            public Builder integrationConfigId(Long integrationConfigId) {
                this.integrationConfigId = integrationConfigId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
