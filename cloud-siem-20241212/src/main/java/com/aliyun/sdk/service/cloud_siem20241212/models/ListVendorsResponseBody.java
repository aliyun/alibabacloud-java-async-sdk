// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link ListVendorsResponseBody} extends {@link TeaModel}
 *
 * <p>ListVendorsResponseBody</p>
 */
public class ListVendorsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("Vendors")
    private java.util.List<Vendors> vendors;

    private ListVendorsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vendors = builder.vendors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVendorsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return vendors
     */
    public java.util.List<Vendors> getVendors() {
        return this.vendors;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<Vendors> vendors; 

        private Builder() {
        } 

        private Builder(ListVendorsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.vendors = model.vendors;
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
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Vendors.
         */
        public Builder vendors(java.util.List<Vendors> vendors) {
            this.vendors = vendors;
            return this;
        }

        public ListVendorsResponseBody build() {
            return new ListVendorsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVendorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListVendorsResponseBody</p>
     */
    public static class Vendors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("VendorId")
        private String vendorId;

        @com.aliyun.core.annotation.NameInMap("VendorName")
        private String vendorName;

        @com.aliyun.core.annotation.NameInMap("VendorType")
        private String vendorType;

        private Vendors(Builder builder) {
            this.createTime = builder.createTime;
            this.updateTime = builder.updateTime;
            this.vendorId = builder.vendorId;
            this.vendorName = builder.vendorName;
            this.vendorType = builder.vendorType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vendors create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return vendorId
         */
        public String getVendorId() {
            return this.vendorId;
        }

        /**
         * @return vendorName
         */
        public String getVendorName() {
            return this.vendorName;
        }

        /**
         * @return vendorType
         */
        public String getVendorType() {
            return this.vendorType;
        }

        public static final class Builder {
            private Long createTime; 
            private Long updateTime; 
            private String vendorId; 
            private String vendorName; 
            private String vendorType; 

            private Builder() {
            } 

            private Builder(Vendors model) {
                this.createTime = model.createTime;
                this.updateTime = model.updateTime;
                this.vendorId = model.vendorId;
                this.vendorName = model.vendorName;
                this.vendorType = model.vendorType;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * VendorId.
             */
            public Builder vendorId(String vendorId) {
                this.vendorId = vendorId;
                return this;
            }

            /**
             * VendorName.
             */
            public Builder vendorName(String vendorName) {
                this.vendorName = vendorName;
                return this;
            }

            /**
             * VendorType.
             */
            public Builder vendorType(String vendorType) {
                this.vendorType = vendorType;
                return this;
            }

            public Vendors build() {
                return new Vendors(this);
            } 

        } 

    }
}
