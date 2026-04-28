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
         * <p>C61892A4-0850-4516-9E26-44D96C1782DE</p>
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
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
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
             * ModelApiId.
             */
            public Builder modelApiId(String modelApiId) {
                this.modelApiId = modelApiId;
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
             * PathPrefix.
             */
            public Builder pathPrefix(String pathPrefix) {
                this.pathPrefix = pathPrefix;
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
             * RecordInput.
             */
            public Builder recordInput(String recordInput) {
                this.recordInput = recordInput;
                return this;
            }

            /**
             * RecordOutput.
             */
            public Builder recordOutput(String recordOutput) {
                this.recordOutput = recordOutput;
                return this;
            }

            /**
             * RouteRules.
             */
            public Builder routeRules(String routeRules) {
                this.routeRules = routeRules;
                return this;
            }

            /**
             * Status.
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
