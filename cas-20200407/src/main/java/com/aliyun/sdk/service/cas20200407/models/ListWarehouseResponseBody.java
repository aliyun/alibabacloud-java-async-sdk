// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link ListWarehouseResponseBody} extends {@link TeaModel}
 *
 * <p>ListWarehouseResponseBody</p>
 */
public class ListWarehouseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListWarehouseResponseBody(Builder builder) {
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWarehouseResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListWarehouseResponseBody model) {
            this.data = model.data;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListWarehouseResponseBody build() {
            return new ListWarehouseResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWarehouseResponseBody} extends {@link TeaModel}
     *
     * <p>ListWarehouseResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("WarehouseInstanceId")
        private String warehouseInstanceId;

        @com.aliyun.core.annotation.NameInMap("WarehouseName")
        private String warehouseName;

        @com.aliyun.core.annotation.NameInMap("WarehouseType")
        private String warehouseType;

        private Data(Builder builder) {
            this.warehouseInstanceId = builder.warehouseInstanceId;
            this.warehouseName = builder.warehouseName;
            this.warehouseType = builder.warehouseType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return warehouseInstanceId
         */
        public String getWarehouseInstanceId() {
            return this.warehouseInstanceId;
        }

        /**
         * @return warehouseName
         */
        public String getWarehouseName() {
            return this.warehouseName;
        }

        /**
         * @return warehouseType
         */
        public String getWarehouseType() {
            return this.warehouseType;
        }

        public static final class Builder {
            private String warehouseInstanceId; 
            private String warehouseName; 
            private String warehouseType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.warehouseInstanceId = model.warehouseInstanceId;
                this.warehouseName = model.warehouseName;
                this.warehouseType = model.warehouseType;
            } 

            /**
             * WarehouseInstanceId.
             */
            public Builder warehouseInstanceId(String warehouseInstanceId) {
                this.warehouseInstanceId = warehouseInstanceId;
                return this;
            }

            /**
             * WarehouseName.
             */
            public Builder warehouseName(String warehouseName) {
                this.warehouseName = warehouseName;
                return this;
            }

            /**
             * WarehouseType.
             */
            public Builder warehouseType(String warehouseType) {
                this.warehouseType = warehouseType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
