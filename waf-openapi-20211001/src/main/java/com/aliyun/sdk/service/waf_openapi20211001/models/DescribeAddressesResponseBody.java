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
         * <p>The list of addresses.</p>
         */
        public Builder addressList(java.util.List<AddressList> addressList) {
            this.addressList = addressList;
            return this;
        }

        /**
         * <p>The number of entries per page for paging. Valid values: 1 to 500. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token for the next page. If a next page exists, this field contains a value.</p>
         * <blockquote>
         * <p>If this parameter has a return value, a next page exists. You can pass the returned <strong>NextToken</strong> as a request parameter to retrieve the next page of data. Repeat this process until no value is returned, which indicates that all data has been retrieved.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>AAAAAGBgV9tolsLfijC4wam2htS*****D/46H3X2wIS</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8D8EBFB7-E1EB-5236-952A-092EDC72***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
             * <p>The address.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1.1.1</p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>The most recent modification time of the address. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1760408233000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The address book ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12345678</p>
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
