// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link CreateModelProviderTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateModelProviderTemplateResponseBody</p>
 */
public class CreateModelProviderTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateModelProviderTemplateResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateModelProviderTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateModelProviderTemplateResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateModelProviderTemplateResponseBody build() {
            return new CreateModelProviderTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateModelProviderTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>CreateModelProviderTemplateResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProviderTemplateId")
        private String providerTemplateId;

        private Data(Builder builder) {
            this.providerTemplateId = builder.providerTemplateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return providerTemplateId
         */
        public String getProviderTemplateId() {
            return this.providerTemplateId;
        }

        public static final class Builder {
            private String providerTemplateId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.providerTemplateId = model.providerTemplateId;
            } 

            /**
             * ProviderTemplateId.
             */
            public Builder providerTemplateId(String providerTemplateId) {
                this.providerTemplateId = providerTemplateId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
