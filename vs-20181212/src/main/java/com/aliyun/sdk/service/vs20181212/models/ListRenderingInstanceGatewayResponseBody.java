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
 * {@link ListRenderingInstanceGatewayResponseBody} extends {@link TeaModel}
 *
 * <p>ListRenderingInstanceGatewayResponseBody</p>
 */
public class ListRenderingInstanceGatewayResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GatewayConfigurationInfos")
    private java.util.List<GatewayConfigurationInfos> gatewayConfigurationInfos;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private ListRenderingInstanceGatewayResponseBody(Builder builder) {
        this.gatewayConfigurationInfos = builder.gatewayConfigurationInfos;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRenderingInstanceGatewayResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayConfigurationInfos
     */
    public java.util.List<GatewayConfigurationInfos> getGatewayConfigurationInfos() {
        return this.gatewayConfigurationInfos;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
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
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<GatewayConfigurationInfos> gatewayConfigurationInfos; 
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(ListRenderingInstanceGatewayResponseBody model) {
            this.gatewayConfigurationInfos = model.gatewayConfigurationInfos;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>A list of custom gateway information.</p>
         */
        public Builder gatewayConfigurationInfos(java.util.List<GatewayConfigurationInfos> gatewayConfigurationInfos) {
            this.gatewayConfigurationInfos = gatewayConfigurationInfos;
            return this;
        }

        /**
         * <p>The page number of the query results list</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRenderingInstanceGatewayResponseBody build() {
            return new ListRenderingInstanceGatewayResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRenderingInstanceGatewayResponseBody} extends {@link TeaModel}
     *
     * <p>ListRenderingInstanceGatewayResponseBody</p>
     */
    public static class GatewayConfigurationInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("GatewayInstanceId")
        private String gatewayInstanceId;

        @com.aliyun.core.annotation.NameInMap("RenderingInstanceId")
        private String renderingInstanceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private GatewayConfigurationInfos(Builder builder) {
            this.creationTime = builder.creationTime;
            this.gatewayInstanceId = builder.gatewayInstanceId;
            this.renderingInstanceId = builder.renderingInstanceId;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GatewayConfigurationInfos create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return gatewayInstanceId
         */
        public String getGatewayInstanceId() {
            return this.gatewayInstanceId;
        }

        /**
         * @return renderingInstanceId
         */
        public String getRenderingInstanceId() {
            return this.renderingInstanceId;
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
            private String creationTime; 
            private String gatewayInstanceId; 
            private String renderingInstanceId; 
            private String status; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(GatewayConfigurationInfos model) {
                this.creationTime = model.creationTime;
                this.gatewayInstanceId = model.gatewayInstanceId;
                this.renderingInstanceId = model.renderingInstanceId;
                this.status = model.status;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The time when the cloud application service instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-15 10:19:13</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The ID of the custom gateway instance.</p>
             * 
             * <strong>example:</strong>
             * <p>render-xxx</p>
             */
            public Builder gatewayInstanceId(String gatewayInstanceId) {
                this.gatewayInstanceId = gatewayInstanceId;
                return this;
            }

            /**
             * <p>The ID of the cloud application service instance.</p>
             * 
             * <strong>example:</strong>
             * <p>render-342012a227dc4ddf91f024639e43051a</p>
             */
            public Builder renderingInstanceId(String renderingInstanceId) {
                this.renderingInstanceId = renderingInstanceId;
                return this;
            }

            /**
             * <p>The status of the custom gateway. Valid values:</p>
             * <ol>
             * <li><p>Transitional states: creating, deleting</p>
             * </li>
             * <li><p>Desired states: available, failed</p>
             * </li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the information was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-02 12:08:26</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public GatewayConfigurationInfos build() {
                return new GatewayConfigurationInfos(this);
            } 

        } 

    }
}
