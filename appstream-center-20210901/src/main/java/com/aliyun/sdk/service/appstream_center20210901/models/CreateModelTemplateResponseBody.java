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
 * {@link CreateModelTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateModelTemplateResponseBody</p>
 */
public class CreateModelTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateModelTemplateResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateModelTemplateResponseBody create() {
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

        private Builder(CreateModelTemplateResponseBody model) {
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

        public CreateModelTemplateResponseBody build() {
            return new CreateModelTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateModelTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>CreateModelTemplateResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModelTemplateId")
        private String modelTemplateId;

        private Data(Builder builder) {
            this.modelTemplateId = builder.modelTemplateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return modelTemplateId
         */
        public String getModelTemplateId() {
            return this.modelTemplateId;
        }

        public static final class Builder {
            private String modelTemplateId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.modelTemplateId = model.modelTemplateId;
            } 

            /**
             * ModelTemplateId.
             */
            public Builder modelTemplateId(String modelTemplateId) {
                this.modelTemplateId = modelTemplateId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
