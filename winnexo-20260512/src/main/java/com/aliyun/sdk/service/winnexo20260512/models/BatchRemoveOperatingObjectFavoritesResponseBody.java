// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link BatchRemoveOperatingObjectFavoritesResponseBody} extends {@link TeaModel}
 *
 * <p>BatchRemoveOperatingObjectFavoritesResponseBody</p>
 */
public class BatchRemoveOperatingObjectFavoritesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("graphName")
    private String graphName;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("objectType")
    private String objectType;

    @com.aliyun.core.annotation.NameInMap("operatingObjectName")
    private String operatingObjectName;

    @com.aliyun.core.annotation.NameInMap("remainingCount")
    private Long remainingCount;

    @com.aliyun.core.annotation.NameInMap("removedCount")
    private Long removedCount;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("requestedCount")
    private Long requestedCount;

    @com.aliyun.core.annotation.NameInMap("results")
    private java.util.List<Results> results;

    private BatchRemoveOperatingObjectFavoritesResponseBody(Builder builder) {
        this.code = builder.code;
        this.graphName = builder.graphName;
        this.message = builder.message;
        this.objectType = builder.objectType;
        this.operatingObjectName = builder.operatingObjectName;
        this.remainingCount = builder.remainingCount;
        this.removedCount = builder.removedCount;
        this.requestId = builder.requestId;
        this.requestedCount = builder.requestedCount;
        this.results = builder.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchRemoveOperatingObjectFavoritesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return graphName
     */
    public String getGraphName() {
        return this.graphName;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return objectType
     */
    public String getObjectType() {
        return this.objectType;
    }

    /**
     * @return operatingObjectName
     */
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    /**
     * @return remainingCount
     */
    public Long getRemainingCount() {
        return this.remainingCount;
    }

    /**
     * @return removedCount
     */
    public Long getRemovedCount() {
        return this.removedCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return requestedCount
     */
    public Long getRequestedCount() {
        return this.requestedCount;
    }

    /**
     * @return results
     */
    public java.util.List<Results> getResults() {
        return this.results;
    }

    public static final class Builder {
        private String code; 
        private String graphName; 
        private String message; 
        private String objectType; 
        private String operatingObjectName; 
        private Long remainingCount; 
        private Long removedCount; 
        private String requestId; 
        private Long requestedCount; 
        private java.util.List<Results> results; 

        private Builder() {
        } 

        private Builder(BatchRemoveOperatingObjectFavoritesResponseBody model) {
            this.code = model.code;
            this.graphName = model.graphName;
            this.message = model.message;
            this.objectType = model.objectType;
            this.operatingObjectName = model.operatingObjectName;
            this.remainingCount = model.remainingCount;
            this.removedCount = model.removedCount;
            this.requestId = model.requestId;
            this.requestedCount = model.requestedCount;
            this.results = model.results;
        } 

        /**
         * <p>业务状态码：成功为 200</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * graphName.
         */
        public Builder graphName(String graphName) {
            this.graphName = graphName;
            return this;
        }

        /**
         * <p>错误描述，成功时为空</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * objectType.
         */
        public Builder objectType(String objectType) {
            this.objectType = objectType;
            return this;
        }

        /**
         * operatingObjectName.
         */
        public Builder operatingObjectName(String operatingObjectName) {
            this.operatingObjectName = operatingObjectName;
            return this;
        }

        /**
         * <p>精确范围内剩余关注对象数量</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder remainingCount(Long remainingCount) {
            this.remainingCount = remainingCount;
            return this;
        }

        /**
         * <p>实际删除的物理关注记录数量</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder removedCount(Long removedCount) {
            this.removedCount = removedCount;
            return this;
        }

        /**
         * <p>请求追踪 ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>去重后的请求对象数量</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder requestedCount(Long requestedCount) {
            this.requestedCount = requestedCount;
            return this;
        }

        /**
         * results.
         */
        public Builder results(java.util.List<Results> results) {
            this.results = results;
            return this;
        }

        public BatchRemoveOperatingObjectFavoritesResponseBody build() {
            return new BatchRemoveOperatingObjectFavoritesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchRemoveOperatingObjectFavoritesResponseBody} extends {@link TeaModel}
     *
     * <p>BatchRemoveOperatingObjectFavoritesResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("isFavorited")
        private Boolean isFavorited;

        @com.aliyun.core.annotation.NameInMap("objectId")
        private String objectId;

        @com.aliyun.core.annotation.NameInMap("processed")
        private Boolean processed;

        private Results(Builder builder) {
            this.isFavorited = builder.isFavorited;
            this.objectId = builder.objectId;
            this.processed = builder.processed;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return isFavorited
         */
        public Boolean getIsFavorited() {
            return this.isFavorited;
        }

        /**
         * @return objectId
         */
        public String getObjectId() {
            return this.objectId;
        }

        /**
         * @return processed
         */
        public Boolean getProcessed() {
            return this.processed;
        }

        public static final class Builder {
            private Boolean isFavorited; 
            private String objectId; 
            private Boolean processed; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.isFavorited = model.isFavorited;
                this.objectId = model.objectId;
                this.processed = model.processed;
            } 

            /**
             * isFavorited.
             */
            public Builder isFavorited(Boolean isFavorited) {
                this.isFavorited = isFavorited;
                return this;
            }

            /**
             * objectId.
             */
            public Builder objectId(String objectId) {
                this.objectId = objectId;
                return this;
            }

            /**
             * processed.
             */
            public Builder processed(Boolean processed) {
                this.processed = processed;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
