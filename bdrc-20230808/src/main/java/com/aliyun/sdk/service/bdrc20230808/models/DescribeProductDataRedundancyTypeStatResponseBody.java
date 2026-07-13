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
 * {@link DescribeProductDataRedundancyTypeStatResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProductDataRedundancyTypeStatResponseBody</p>
 */
public class DescribeProductDataRedundancyTypeStatResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeProductDataRedundancyTypeStatResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProductDataRedundancyTypeStatResponseBody create() {
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

        private Builder(DescribeProductDataRedundancyTypeStatResponseBody model) {
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

        public DescribeProductDataRedundancyTypeStatResponseBody build() {
            return new DescribeProductDataRedundancyTypeStatResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeProductDataRedundancyTypeStatResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProductDataRedundancyTypeStatResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataRedundancyType")
        private String dataRedundancyType;

        @com.aliyun.core.annotation.NameInMap("ResourceCount")
        private Long resourceCount;

        @com.aliyun.core.annotation.NameInMap("StorageClass")
        private String storageClass;

        private Content(Builder builder) {
            this.dataRedundancyType = builder.dataRedundancyType;
            this.resourceCount = builder.resourceCount;
            this.storageClass = builder.storageClass;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return dataRedundancyType
         */
        public String getDataRedundancyType() {
            return this.dataRedundancyType;
        }

        /**
         * @return resourceCount
         */
        public Long getResourceCount() {
            return this.resourceCount;
        }

        /**
         * @return storageClass
         */
        public String getStorageClass() {
            return this.storageClass;
        }

        public static final class Builder {
            private String dataRedundancyType; 
            private Long resourceCount; 
            private String storageClass; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.dataRedundancyType = model.dataRedundancyType;
                this.resourceCount = model.resourceCount;
                this.storageClass = model.storageClass;
            } 

            /**
             * DataRedundancyType.
             */
            public Builder dataRedundancyType(String dataRedundancyType) {
                this.dataRedundancyType = dataRedundancyType;
                return this;
            }

            /**
             * ResourceCount.
             */
            public Builder resourceCount(Long resourceCount) {
                this.resourceCount = resourceCount;
                return this;
            }

            /**
             * StorageClass.
             */
            public Builder storageClass(String storageClass) {
                this.storageClass = storageClass;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeProductDataRedundancyTypeStatResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProductDataRedundancyTypeStatResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private java.util.List<Content> content;

        private Data(Builder builder) {
            this.content = builder.content;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public java.util.List<Content> getContent() {
            return this.content;
        }

        public static final class Builder {
            private java.util.List<Content> content; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.content = model.content;
            } 

            /**
             * Content.
             */
            public Builder content(java.util.List<Content> content) {
                this.content = content;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
