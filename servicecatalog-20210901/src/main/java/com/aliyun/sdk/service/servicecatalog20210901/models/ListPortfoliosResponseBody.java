// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

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
 * {@link ListPortfoliosResponseBody} extends {@link TeaModel}
 *
 * <p>ListPortfoliosResponseBody</p>
 */
public class ListPortfoliosResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("PortfolioDetails")
    private java.util.List<PortfolioDetails> portfolioDetails;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListPortfoliosResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.portfolioDetails = builder.portfolioDetails;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPortfoliosResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return portfolioDetails
     */
    public java.util.List<PortfolioDetails> getPortfolioDetails() {
        return this.portfolioDetails;
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
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List<PortfolioDetails> portfolioDetails; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListPortfoliosResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.portfolioDetails = model.portfolioDetails;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PortfolioDetails.
         */
        public Builder portfolioDetails(java.util.List<PortfolioDetails> portfolioDetails) {
            this.portfolioDetails = portfolioDetails;
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

        public ListPortfoliosResponseBody build() {
            return new ListPortfoliosResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPortfoliosResponseBody} extends {@link TeaModel}
     *
     * <p>ListPortfoliosResponseBody</p>
     */
    public static class PortfolioDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("PortfolioArn")
        private String portfolioArn;

        @com.aliyun.core.annotation.NameInMap("PortfolioId")
        private String portfolioId;

        @com.aliyun.core.annotation.NameInMap("PortfolioName")
        private String portfolioName;

        @com.aliyun.core.annotation.NameInMap("ProviderName")
        private String providerName;

        private PortfolioDetails(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.portfolioArn = builder.portfolioArn;
            this.portfolioId = builder.portfolioId;
            this.portfolioName = builder.portfolioName;
            this.providerName = builder.providerName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PortfolioDetails create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return portfolioArn
         */
        public String getPortfolioArn() {
            return this.portfolioArn;
        }

        /**
         * @return portfolioId
         */
        public String getPortfolioId() {
            return this.portfolioId;
        }

        /**
         * @return portfolioName
         */
        public String getPortfolioName() {
            return this.portfolioName;
        }

        /**
         * @return providerName
         */
        public String getProviderName() {
            return this.providerName;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String portfolioArn; 
            private String portfolioId; 
            private String portfolioName; 
            private String providerName; 

            private Builder() {
            } 

            private Builder(PortfolioDetails model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.portfolioArn = model.portfolioArn;
                this.portfolioId = model.portfolioId;
                this.portfolioName = model.portfolioName;
                this.providerName = model.providerName;
            } 

            /**
             * <p>代表创建时间的资源属性字段</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-12T06:11:12Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>产品组合描述</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * PortfolioArn.
             */
            public Builder portfolioArn(String portfolioArn) {
                this.portfolioArn = portfolioArn;
                return this;
            }

            /**
             * <p>代表资源一级ID的资源属性字段</p>
             * 
             * <strong>example:</strong>
             * <p>port-bp1yt7582g****</p>
             */
            public Builder portfolioId(String portfolioId) {
                this.portfolioId = portfolioId;
                return this;
            }

            /**
             * <p>代表资源名称的资源属性字段</p>
             */
            public Builder portfolioName(String portfolioName) {
                this.portfolioName = portfolioName;
                return this;
            }

            /**
             * <p>产品组合提供方</p>
             */
            public Builder providerName(String providerName) {
                this.providerName = providerName;
                return this;
            }

            public PortfolioDetails build() {
                return new PortfolioDetails(this);
            } 

        } 

    }
}
