// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link ListRenderingDataPackagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRenderingDataPackagesResponseBody</p>
 */
public class ListRenderingDataPackagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataPackages")
    private java.util.List<DataPackages> dataPackages;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListRenderingDataPackagesResponseBody(Builder builder) {
        this.dataPackages = builder.dataPackages;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRenderingDataPackagesResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataPackages
     */
    public java.util.List<DataPackages> getDataPackages() {
        return this.dataPackages;
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
        private java.util.List<DataPackages> dataPackages; 
        private String requestId; 
        private Long totalCount; 

        /**
         * DataPackages.
         */
        public Builder dataPackages(java.util.List<DataPackages> dataPackages) {
            this.dataPackages = dataPackages;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
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

        public ListRenderingDataPackagesResponseBody build() {
            return new ListRenderingDataPackagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRenderingDataPackagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRenderingDataPackagesResponseBody</p>
     */
    public static class DataPackages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DataPackageId")
        private String dataPackageId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("RenderingInstanceId")
        private String renderingInstanceId;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private DataPackages(Builder builder) {
            this.category = builder.category;
            this.creationTime = builder.creationTime;
            this.dataPackageId = builder.dataPackageId;
            this.description = builder.description;
            this.renderingInstanceId = builder.renderingInstanceId;
            this.size = builder.size;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataPackages create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return dataPackageId
         */
        public String getDataPackageId() {
            return this.dataPackageId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return renderingInstanceId
         */
        public String getRenderingInstanceId() {
            return this.renderingInstanceId;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String category; 
            private String creationTime; 
            private String dataPackageId; 
            private String description; 
            private String renderingInstanceId; 
            private Integer size; 
            private String status; 
            private String updateTime; 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * DataPackageId.
             */
            public Builder dataPackageId(String dataPackageId) {
                this.dataPackageId = dataPackageId;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * RenderingInstanceId.
             */
            public Builder renderingInstanceId(String renderingInstanceId) {
                this.renderingInstanceId = renderingInstanceId;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Integer size) {
                this.size = size;
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
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public DataPackages build() {
                return new DataPackages(this);
            } 

        } 

    }
}
