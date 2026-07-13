// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bdrc20230808.models;

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
 * {@link CreateResourceCategoryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateResourceCategoryResponseBody</p>
 */
public class CreateResourceCategoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateResourceCategoryResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateResourceCategoryResponseBody create() {
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

        private Builder(CreateResourceCategoryResponseBody model) {
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

        public CreateResourceCategoryResponseBody build() {
            return new CreateResourceCategoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateResourceCategoryResponseBody} extends {@link TeaModel}
     *
     * <p>CreateResourceCategoryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceCategoryId")
        private String resourceCategoryId;

        private Data(Builder builder) {
            this.resourceCategoryId = builder.resourceCategoryId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return resourceCategoryId
         */
        public String getResourceCategoryId() {
            return this.resourceCategoryId;
        }

        public static final class Builder {
            private String resourceCategoryId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.resourceCategoryId = model.resourceCategoryId;
            } 

            /**
             * ResourceCategoryId.
             */
            public Builder resourceCategoryId(String resourceCategoryId) {
                this.resourceCategoryId = resourceCategoryId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
