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

        /**
         * GatewayConfigurationInfos.
         */
        public Builder gatewayConfigurationInfos(java.util.List<GatewayConfigurationInfos> gatewayConfigurationInfos) {
            this.gatewayConfigurationInfos = gatewayConfigurationInfos;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
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

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * GatewayInstanceId.
             */
            public Builder gatewayInstanceId(String gatewayInstanceId) {
                this.gatewayInstanceId = gatewayInstanceId;
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

            public GatewayConfigurationInfos build() {
                return new GatewayConfigurationInfos(this);
            } 

        } 

    }
}
