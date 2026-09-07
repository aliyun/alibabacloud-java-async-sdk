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
         * <p>A list of warehouse objects.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The maximum number of entries returned on each page. The default value is 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token to retrieve the next page of results. If this parameter is not returned, all results have been retrieved.</p>
         * 
         * <strong>example:</strong>
         * <p>1d2db86sca4384811e0b5e8707e68181f</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5979d897-d69f-4fc9-87dd-f3bb73c40b80</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries in the result set.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
             * <p>The warehouse instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cas-wh-Q7ID6V</p>
             */
            public Builder warehouseInstanceId(String warehouseInstanceId) {
                this.warehouseInstanceId = warehouseInstanceId;
                return this;
            }

            /**
             * <p>The warehouse name.</p>
             * 
             * <strong>example:</strong>
             * <p>default_warehouse</p>
             */
            public Builder warehouseName(String warehouseName) {
                this.warehouseName = warehouseName;
                return this;
            }

            /**
             * <p>The warehouse type.</p>
             * 
             * <strong>example:</strong>
             * <p>pcaCaCert</p>
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
