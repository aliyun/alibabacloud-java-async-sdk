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
 * {@link ListRenderingInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRenderingInstancesResponseBody</p>
 */
public class ListRenderingInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RenderingInstances")
    private java.util.List<RenderingInstances> renderingInstances;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListRenderingInstancesResponseBody(Builder builder) {
        this.renderingInstances = builder.renderingInstances;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRenderingInstancesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return renderingInstances
     */
    public java.util.List<RenderingInstances> getRenderingInstances() {
        return this.renderingInstances;
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
        private java.util.List<RenderingInstances> renderingInstances; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListRenderingInstancesResponseBody model) {
            this.renderingInstances = model.renderingInstances;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * RenderingInstances.
         */
        public Builder renderingInstances(java.util.List<RenderingInstances> renderingInstances) {
            this.renderingInstances = renderingInstances;
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
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRenderingInstancesResponseBody build() {
            return new ListRenderingInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRenderingInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRenderingInstancesResponseBody</p>
     */
    public static class RenderingInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("RenderingInstanceId")
        private String renderingInstanceId;

        @com.aliyun.core.annotation.NameInMap("RenderingSpec")
        private String renderingSpec;

        @com.aliyun.core.annotation.NameInMap("StorageSize")
        private Integer storageSize;

        private RenderingInstances(Builder builder) {
            this.creationTime = builder.creationTime;
            this.renderingInstanceId = builder.renderingInstanceId;
            this.renderingSpec = builder.renderingSpec;
            this.storageSize = builder.storageSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RenderingInstances create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return renderingInstanceId
         */
        public String getRenderingInstanceId() {
            return this.renderingInstanceId;
        }

        /**
         * @return renderingSpec
         */
        public String getRenderingSpec() {
            return this.renderingSpec;
        }

        /**
         * @return storageSize
         */
        public Integer getStorageSize() {
            return this.storageSize;
        }

        public static final class Builder {
            private String creationTime; 
            private String renderingInstanceId; 
            private String renderingSpec; 
            private Integer storageSize; 

            private Builder() {
            } 

            private Builder(RenderingInstances model) {
                this.creationTime = model.creationTime;
                this.renderingInstanceId = model.renderingInstanceId;
                this.renderingSpec = model.renderingSpec;
                this.storageSize = model.storageSize;
            } 

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
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
             * RenderingSpec.
             */
            public Builder renderingSpec(String renderingSpec) {
                this.renderingSpec = renderingSpec;
                return this;
            }

            /**
             * StorageSize.
             */
            public Builder storageSize(Integer storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            public RenderingInstances build() {
                return new RenderingInstances(this);
            } 

        } 

    }
}
