// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

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
 * {@link DescribeVendorApiListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVendorApiListResponseBody</p>
 */
public class DescribeVendorApiListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiList")
    private java.util.List<ApiList> apiList;

    @com.aliyun.core.annotation.NameInMap("Page")
    private Page page;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeVendorApiListResponseBody(Builder builder) {
        this.apiList = builder.apiList;
        this.page = builder.page;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVendorApiListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiList
     */
    public java.util.List<ApiList> getApiList() {
        return this.apiList;
    }

    /**
     * @return page
     */
    public Page getPage() {
        return this.page;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ApiList> apiList; 
        private Page page; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeVendorApiListResponseBody model) {
            this.apiList = model.apiList;
            this.page = model.page;
            this.requestId = model.requestId;
        } 

        /**
         * ApiList.
         */
        public Builder apiList(java.util.List<ApiList> apiList) {
            this.apiList = apiList;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Page page) {
            this.page = page;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeVendorApiListResponseBody build() {
            return new DescribeVendorApiListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVendorApiListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVendorApiListResponseBody</p>
     */
    public static class ApiList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdvanceConfig")
        private String advanceConfig;

        @com.aliyun.core.annotation.NameInMap("ApiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("ApiVersion")
        private String apiVersion;

        @com.aliyun.core.annotation.NameInMap("Method")
        private String method;

        @com.aliyun.core.annotation.NameInMap("NeedAdvanceConfig")
        private Boolean needAdvanceConfig;

        @com.aliyun.core.annotation.NameInMap("NeedPageInfo")
        private Boolean needPageInfo;

        @com.aliyun.core.annotation.NameInMap("PageInfo")
        private String pageInfo;

        @com.aliyun.core.annotation.NameInMap("Parameter")
        private String parameter;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("ProductDomain")
        private String productDomain;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("VendorCode")
        private String vendorCode;

        private ApiList(Builder builder) {
            this.advanceConfig = builder.advanceConfig;
            this.apiName = builder.apiName;
            this.apiVersion = builder.apiVersion;
            this.method = builder.method;
            this.needAdvanceConfig = builder.needAdvanceConfig;
            this.needPageInfo = builder.needPageInfo;
            this.pageInfo = builder.pageInfo;
            this.parameter = builder.parameter;
            this.productCode = builder.productCode;
            this.productDomain = builder.productDomain;
            this.productName = builder.productName;
            this.protocol = builder.protocol;
            this.vendorCode = builder.vendorCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiList create() {
            return builder().build();
        }

        /**
         * @return advanceConfig
         */
        public String getAdvanceConfig() {
            return this.advanceConfig;
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
        }

        /**
         * @return apiVersion
         */
        public String getApiVersion() {
            return this.apiVersion;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return needAdvanceConfig
         */
        public Boolean getNeedAdvanceConfig() {
            return this.needAdvanceConfig;
        }

        /**
         * @return needPageInfo
         */
        public Boolean getNeedPageInfo() {
            return this.needPageInfo;
        }

        /**
         * @return pageInfo
         */
        public String getPageInfo() {
            return this.pageInfo;
        }

        /**
         * @return parameter
         */
        public String getParameter() {
            return this.parameter;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return productDomain
         */
        public String getProductDomain() {
            return this.productDomain;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return vendorCode
         */
        public String getVendorCode() {
            return this.vendorCode;
        }

        public static final class Builder {
            private String advanceConfig; 
            private String apiName; 
            private String apiVersion; 
            private String method; 
            private Boolean needAdvanceConfig; 
            private Boolean needPageInfo; 
            private String pageInfo; 
            private String parameter; 
            private String productCode; 
            private String productDomain; 
            private String productName; 
            private String protocol; 
            private String vendorCode; 

            private Builder() {
            } 

            private Builder(ApiList model) {
                this.advanceConfig = model.advanceConfig;
                this.apiName = model.apiName;
                this.apiVersion = model.apiVersion;
                this.method = model.method;
                this.needAdvanceConfig = model.needAdvanceConfig;
                this.needPageInfo = model.needPageInfo;
                this.pageInfo = model.pageInfo;
                this.parameter = model.parameter;
                this.productCode = model.productCode;
                this.productDomain = model.productDomain;
                this.productName = model.productName;
                this.protocol = model.protocol;
                this.vendorCode = model.vendorCode;
            } 

            /**
             * AdvanceConfig.
             */
            public Builder advanceConfig(String advanceConfig) {
                this.advanceConfig = advanceConfig;
                return this;
            }

            /**
             * ApiName.
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * ApiVersion.
             */
            public Builder apiVersion(String apiVersion) {
                this.apiVersion = apiVersion;
                return this;
            }

            /**
             * Method.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * NeedAdvanceConfig.
             */
            public Builder needAdvanceConfig(Boolean needAdvanceConfig) {
                this.needAdvanceConfig = needAdvanceConfig;
                return this;
            }

            /**
             * NeedPageInfo.
             */
            public Builder needPageInfo(Boolean needPageInfo) {
                this.needPageInfo = needPageInfo;
                return this;
            }

            /**
             * PageInfo.
             */
            public Builder pageInfo(String pageInfo) {
                this.pageInfo = pageInfo;
                return this;
            }

            /**
             * Parameter.
             */
            public Builder parameter(String parameter) {
                this.parameter = parameter;
                return this;
            }

            /**
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * ProductDomain.
             */
            public Builder productDomain(String productDomain) {
                this.productDomain = productDomain;
                return this;
            }

            /**
             * ProductName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * VendorCode.
             */
            public Builder vendorCode(String vendorCode) {
                this.vendorCode = vendorCode;
                return this;
            }

            public ApiList build() {
                return new ApiList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVendorApiListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVendorApiListResponseBody</p>
     */
    public static class Page extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Page(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Page create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long pageNumber; 
            private Integer pageSize; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Page model) {
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * PageNumber.
             */
            public Builder pageNumber(Long pageNumber) {
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
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Page build() {
                return new Page(this);
            } 

        } 

    }
}
