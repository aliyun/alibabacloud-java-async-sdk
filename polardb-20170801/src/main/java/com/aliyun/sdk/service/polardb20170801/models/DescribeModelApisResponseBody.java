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
 * {@link DescribeModelApisResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeModelApisResponseBody</p>
 */
public class DescribeModelApisResponseBody extends TeaModel {
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

    private DescribeModelApisResponseBody(Builder builder) {
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

    public static DescribeModelApisResponseBody create() {
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

        private Builder(DescribeModelApisResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The list of model APIs.</p>
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
         * <p>The number of entries per page. Valid values: <strong>30</strong>, <strong>50</strong>, or <strong>100</strong>.</p>
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>C61892A4-0850-4516-9E26-44D96C1782DE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeModelApisResponseBody build() {
            return new DescribeModelApisResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeModelApisResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeModelApisResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("ModelApiId")
        private String modelApiId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PathPrefix")
        private String pathPrefix;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("RecordInput")
        private String recordInput;

        @com.aliyun.core.annotation.NameInMap("RecordOutput")
        private String recordOutput;

        @com.aliyun.core.annotation.NameInMap("RouteRules")
        private String routeRules;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Items(Builder builder) {
            this.category = builder.category;
            this.config = builder.config;
            this.gmtCreated = builder.gmtCreated;
            this.modelApiId = builder.modelApiId;
            this.name = builder.name;
            this.pathPrefix = builder.pathPrefix;
            this.protocol = builder.protocol;
            this.recordInput = builder.recordInput;
            this.recordOutput = builder.recordOutput;
            this.routeRules = builder.routeRules;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return modelApiId
         */
        public String getModelApiId() {
            return this.modelApiId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pathPrefix
         */
        public String getPathPrefix() {
            return this.pathPrefix;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return recordInput
         */
        public String getRecordInput() {
            return this.recordInput;
        }

        /**
         * @return recordOutput
         */
        public String getRecordOutput() {
            return this.recordOutput;
        }

        /**
         * @return routeRules
         */
        public String getRouteRules() {
            return this.routeRules;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String category; 
            private String config; 
            private String gmtCreated; 
            private String modelApiId; 
            private String name; 
            private String pathPrefix; 
            private String protocol; 
            private String recordInput; 
            private String recordOutput; 
            private String routeRules; 
            private String status; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.category = model.category;
                this.config = model.config;
                this.gmtCreated = model.gmtCreated;
                this.modelApiId = model.modelApiId;
                this.name = model.name;
                this.pathPrefix = model.pathPrefix;
                this.protocol = model.protocol;
                this.recordInput = model.recordInput;
                this.recordOutput = model.recordOutput;
                this.routeRules = model.routeRules;
                this.status = model.status;
            } 

            /**
             * <p>The model category. Valid values:</p>
             * <ul>
             * <li><strong>text</strong></li>
             * <li><strong>embedding</strong></li>
             * <li><strong>rerank</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-16 16:46:20</p>
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * <p>The model API IDs.</p>
             * 
             * <strong>example:</strong>
             * <p>mi-xxxx</p>
             */
            public Builder modelApiId(String modelApiId) {
                this.modelApiId = modelApiId;
                return this;
            }

            /**
             * <p>The model API name.</p>
             * 
             * <strong>example:</strong>
             * <p>testName</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The API path prefix.</p>
             * 
             * <strong>example:</strong>
             * <p>tests/models/</p>
             */
            public Builder pathPrefix(String pathPrefix) {
                this.pathPrefix = pathPrefix;
                return this;
            }

            /**
             * <p>The protocol. Valid values:</p>
             * <ul>
             * <li><strong>openai</strong></li>
             * <li><strong>anthropic</strong></li>
             * <li><strong>bailian</strong></li>
             * <li><strong>vllm</strong></li>
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
             * <p>The number of input tokens.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder recordInput(String recordInput) {
                this.recordInput = recordInput;
                return this;
            }

            /**
             * <p>The number of output tokens.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder recordOutput(String recordOutput) {
                this.recordOutput = recordOutput;
                return this;
            }

            /**
             * <p>The routing rules list (JSON array string).</p>
             * 
             * <strong>example:</strong>
             * <p>[
             *   {
             *     &quot;RuleName&quot;: &quot;string&quot;,
             *     &quot;FallbackMode&quot;: &quot;failover&quot;,
             *     &quot;MatchModelListJson&quot;: &quot;[]&quot;,
             *     &quot;providerBalancerAlgorithm&quot;: &quot;round-robin&quot;,
             *     &quot;Providers&quot;: [
             *       {
             *         &quot;ModelServiceName&quot;: &quot;string&quot;,
             *         &quot;Weight&quot;: &quot;0&quot;,
             *         &quot;model_protocol&quot;: &quot;vllm&quot;
             *         &quot;ModelList&quot;: &quot;[]&quot;
             *       }
             *     ],
             *     &quot;FallbackProviders&quot;: [
             *       {
             *         &quot;ModelServiceName&quot;: &quot;string&quot;,
             *         &quot;model_protocol&quot;: &quot;anthropic&quot;,
             *         &quot;Weight&quot;: &quot;10&quot;,
             *         &quot;ModelList&quot;: &quot;[]&quot;
             *       }
             *     ]
             *   }
             * ]</p>
             */
            public Builder routeRules(String routeRules) {
                this.routeRules = routeRules;
                return this;
            }

            /**
             * <p>The model API status.</p>
             * 
             * <strong>example:</strong>
             * <p>Enable</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
