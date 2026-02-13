// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

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
 * {@link AISearchResourceGetListResponseBody} extends {@link TeaModel}
 *
 * <p>AISearchResourceGetListResponseBody</p>
 */
public class AISearchResourceGetListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private AISearchResourceGetListResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AISearchResourceGetListResponseBody create() {
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

        private Builder(AISearchResourceGetListResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>A8AEC6D9-A359-5169-BD1A-BD848BA60D65</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AISearchResourceGetListResponseBody build() {
            return new AISearchResourceGetListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AISearchResourceGetListResponseBody} extends {@link TeaModel}
     *
     * <p>AISearchResourceGetListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("currentPage")
        private String currentPage;

        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<?> items;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private String pageSize;

        @com.aliyun.core.annotation.NameInMap("total")
        private Long total;

        private Data(Builder builder) {
            this.currentPage = builder.currentPage;
            this.items = builder.items;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public String getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return items
         */
        public java.util.List<?> getItems() {
            return this.items;
        }

        /**
         * @return pageSize
         */
        public String getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private String currentPage; 
            private java.util.List<?> items; 
            private String pageSize; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.currentPage = model.currentPage;
                this.items = model.items;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * currentPage.
             */
            public Builder currentPage(String currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * items.
             */
            public Builder items(java.util.List<?> items) {
                this.items = items;
                return this;
            }

            /**
             * pageSize.
             */
            public Builder pageSize(String pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
