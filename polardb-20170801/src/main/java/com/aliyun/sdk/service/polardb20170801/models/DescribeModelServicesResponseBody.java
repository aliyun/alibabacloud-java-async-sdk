// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeModelServicesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeModelServicesResponseBody</p>
 */
public class DescribeModelServicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeModelServicesResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeModelServicesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeModelServicesResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * Items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageRecordCount.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>24A1990B-4F6E-482B-B8CB-75C612******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalRecordCount.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeModelServicesResponseBody build() {
            return new DescribeModelServicesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeModelServicesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeModelServicesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("BaseUrl")
        private String baseUrl;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("InputCostPointsPerMillion")
        private String inputCostPointsPerMillion;

        @com.aliyun.core.annotation.NameInMap("ModelCategory")
        private String modelCategory;

        @com.aliyun.core.annotation.NameInMap("ModelServiceId")
        private String modelServiceId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OutputCostPointsPerMillion")
        private String outputCostPointsPerMillion;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("RequestCostPoints")
        private String requestCostPoints;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private String vendor;

        private Items(Builder builder) {
            this.apiKey = builder.apiKey;
            this.baseUrl = builder.baseUrl;
            this.gmtCreated = builder.gmtCreated;
            this.inputCostPointsPerMillion = builder.inputCostPointsPerMillion;
            this.modelCategory = builder.modelCategory;
            this.modelServiceId = builder.modelServiceId;
            this.name = builder.name;
            this.outputCostPointsPerMillion = builder.outputCostPointsPerMillion;
            this.protocol = builder.protocol;
            this.requestCostPoints = builder.requestCostPoints;
            this.status = builder.status;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return apiKey
         */
        public String getApiKey() {
            return this.apiKey;
        }

        /**
         * @return baseUrl
         */
        public String getBaseUrl() {
            return this.baseUrl;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return inputCostPointsPerMillion
         */
        public String getInputCostPointsPerMillion() {
            return this.inputCostPointsPerMillion;
        }

        /**
         * @return modelCategory
         */
        public String getModelCategory() {
            return this.modelCategory;
        }

        /**
         * @return modelServiceId
         */
        public String getModelServiceId() {
            return this.modelServiceId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return outputCostPointsPerMillion
         */
        public String getOutputCostPointsPerMillion() {
            return this.outputCostPointsPerMillion;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return requestCostPoints
         */
        public String getRequestCostPoints() {
            return this.requestCostPoints;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vendor
         */
        public String getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private String apiKey; 
            private String baseUrl; 
            private String gmtCreated; 
            private String inputCostPointsPerMillion; 
            private String modelCategory; 
            private String modelServiceId; 
            private String name; 
            private String outputCostPointsPerMillion; 
            private String protocol; 
            private String requestCostPoints; 
            private String status; 
            private String vendor; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.apiKey = model.apiKey;
                this.baseUrl = model.baseUrl;
                this.gmtCreated = model.gmtCreated;
                this.inputCostPointsPerMillion = model.inputCostPointsPerMillion;
                this.modelCategory = model.modelCategory;
                this.modelServiceId = model.modelServiceId;
                this.name = model.name;
                this.outputCostPointsPerMillion = model.outputCostPointsPerMillion;
                this.protocol = model.protocol;
                this.requestCostPoints = model.requestCostPoints;
                this.status = model.status;
                this.vendor = model.vendor;
            } 

            /**
             * ApiKey.
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * BaseUrl.
             */
            public Builder baseUrl(String baseUrl) {
                this.baseUrl = baseUrl;
                return this;
            }

            /**
             * GmtCreated.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * InputCostPointsPerMillion.
             */
            public Builder inputCostPointsPerMillion(String inputCostPointsPerMillion) {
                this.inputCostPointsPerMillion = inputCostPointsPerMillion;
                return this;
            }

            /**
             * ModelCategory.
             */
            public Builder modelCategory(String modelCategory) {
                this.modelCategory = modelCategory;
                return this;
            }

            /**
             * ModelServiceId.
             */
            public Builder modelServiceId(String modelServiceId) {
                this.modelServiceId = modelServiceId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OutputCostPointsPerMillion.
             */
            public Builder outputCostPointsPerMillion(String outputCostPointsPerMillion) {
                this.outputCostPointsPerMillion = outputCostPointsPerMillion;
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
             * RequestCostPoints.
             */
            public Builder requestCostPoints(String requestCostPoints) {
                this.requestCostPoints = requestCostPoints;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Vendor.
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
