// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeAddressesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAddressesResponseBody</p>
 */
public class DescribeAddressesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AddressList")
    private java.util.List<AddressList> addressList;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeAddressesResponseBody(Builder builder) {
        this.addressList = builder.addressList;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAddressesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addressList
     */
    public java.util.List<AddressList> getAddressList() {
        return this.addressList;
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
        private java.util.List<AddressList> addressList; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeAddressesResponseBody model) {
            this.addressList = model.addressList;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * AddressList.
         */
        public Builder addressList(java.util.List<AddressList> addressList) {
            this.addressList = addressList;
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

        public DescribeAddressesResponseBody build() {
            return new DescribeAddressesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAddressesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAddressesResponseBody</p>
     */
    public static class AddressList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        private AddressList(Builder builder) {
            this.address = builder.address;
            this.gmtModified = builder.gmtModified;
            this.ruleId = builder.ruleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddressList create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        public static final class Builder {
            private String address; 
            private Long gmtModified; 
            private Long ruleId; 

            private Builder() {
            } 

            private Builder(AddressList model) {
                this.address = model.address;
                this.gmtModified = model.gmtModified;
                this.ruleId = model.ruleId;
            } 

            /**
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            public AddressList build() {
                return new AddressList(this);
            } 

        } 

    }
}
