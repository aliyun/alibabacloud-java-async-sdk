// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link ListEnterpriseCodeResponseBody} extends {@link TeaModel}
 *
 * <p>ListEnterpriseCodeResponseBody</p>
 */
public class ListEnterpriseCodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EnterpriseCodes")
    private java.util.List<EnterpriseCodes> enterpriseCodes;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListEnterpriseCodeResponseBody(Builder builder) {
        this.enterpriseCodes = builder.enterpriseCodes;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnterpriseCodeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enterpriseCodes
     */
    public java.util.List<EnterpriseCodes> getEnterpriseCodes() {
        return this.enterpriseCodes;
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

    public static final class Builder {
        private java.util.List<EnterpriseCodes> enterpriseCodes; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListEnterpriseCodeResponseBody model) {
            this.enterpriseCodes = model.enterpriseCodes;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The information about enterprise codes.</p>
         */
        public Builder enterpriseCodes(java.util.List<EnterpriseCodes> enterpriseCodes) {
            this.enterpriseCodes = enterpriseCodes;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token for returning the next page when the data is returned in more than one page.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0*****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1A57EF84-D587-4CF9-B0C8-307488BF52C9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListEnterpriseCodeResponseBody build() {
            return new ListEnterpriseCodeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEnterpriseCodeResponseBody} extends {@link TeaModel}
     *
     * <p>ListEnterpriseCodeResponseBody</p>
     */
    public static class EnterpriseCodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnterpriseCode")
        private String enterpriseCode;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        private EnterpriseCodes(Builder builder) {
            this.enterpriseCode = builder.enterpriseCode;
            this.isDefault = builder.isDefault;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnterpriseCodes create() {
            return builder().build();
        }

        /**
         * @return enterpriseCode
         */
        public String getEnterpriseCode() {
            return this.enterpriseCode;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public static final class Builder {
            private String enterpriseCode; 
            private Boolean isDefault; 

            private Builder() {
            } 

            private Builder(EnterpriseCodes model) {
                this.enterpriseCode = model.enterpriseCode;
                this.isDefault = model.isDefault;
            } 

            /**
             * <p>The enterprise code.</p>
             * 
             * <strong>example:</strong>
             * <p>12P**</p>
             */
            public Builder enterpriseCode(String enterpriseCode) {
                this.enterpriseCode = enterpriseCode;
                return this;
            }

            /**
             * <p>Indicates whether the enterprise code is the default one.</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            public EnterpriseCodes build() {
                return new EnterpriseCodes(this);
            } 

        } 

    }
}
