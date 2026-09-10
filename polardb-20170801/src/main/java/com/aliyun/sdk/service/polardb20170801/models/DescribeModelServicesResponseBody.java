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
         * <p>The details of the model services.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of records on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The number of records to return on each page. Valid values:</p>
         * <ul>
         * <li><p><strong>30</strong></p>
         * </li>
         * <li><p><strong>50</strong></p>
         * </li>
         * <li><p><strong>100</strong></p>
         * </li>
         * </ul>
         * <p>Default value: <strong>30</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>24A1990B-4F6E-482B-B8CB-75C612******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
             * <p>The API key for the model service.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxx</p>
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * <p>The base URL of the upstream service.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxxxxx">https://xxxxxx</a></p>
             */
            public Builder baseUrl(String baseUrl) {
                this.baseUrl = baseUrl;
                return this;
            }

            /**
             * <p>The time when the model service was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-03-31T14:40:48Z</p>
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * <p>The cost in points per million input tokens.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder inputCostPointsPerMillion(String inputCostPointsPerMillion) {
                this.inputCostPointsPerMillion = inputCostPointsPerMillion;
                return this;
            }

            /**
             * <p>The model category.</p>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder modelCategory(String modelCategory) {
                this.modelCategory = modelCategory;
                return this;
            }

            /**
             * <p>The model service ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ms-xxxxxx</p>
             */
            public Builder modelServiceId(String modelServiceId) {
                this.modelServiceId = modelServiceId;
                return this;
            }

            /**
             * <p>The model service name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The cost in points per million output tokens.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder outputCostPointsPerMillion(String outputCostPointsPerMillion) {
                this.outputCostPointsPerMillion = outputCostPointsPerMillion;
                return this;
            }

            /**
             * <p>The protocol. Valid values:</p>
             * <ul>
             * <li><p><strong>OpenAI</strong></p>
             * </li>
             * <li><p><strong>Anthropic</strong></p>
             * </li>
             * <li><p><strong>bailian</strong>: Alibaba Cloud Model Studio.</p>
             * </li>
             * <li><p><strong>vLLM</strong></p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>openai</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The cost in points per request.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder requestCostPoints(String requestCostPoints) {
                this.requestCostPoints = requestCostPoints;
                return this;
            }

            /**
             * <p>The status of the model service.</p>
             * 
             * <strong>example:</strong>
             * <p>Enable</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The vendor of the model service.</p>
             * 
             * <strong>example:</strong>
             * <p>bailian</p>
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
