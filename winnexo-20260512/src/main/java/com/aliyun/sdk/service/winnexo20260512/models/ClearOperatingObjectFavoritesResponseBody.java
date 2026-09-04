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
 * {@link ClearOperatingObjectFavoritesResponseBody} extends {@link TeaModel}
 *
 * <p>ClearOperatingObjectFavoritesResponseBody</p>
 */
public class ClearOperatingObjectFavoritesResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("verified")
    private Boolean verified;

    private ClearOperatingObjectFavoritesResponseBody(Builder builder) {
        this.code = builder.code;
        this.graphName = builder.graphName;
        this.message = builder.message;
        this.objectType = builder.objectType;
        this.operatingObjectName = builder.operatingObjectName;
        this.remainingCount = builder.remainingCount;
        this.removedCount = builder.removedCount;
        this.requestId = builder.requestId;
        this.verified = builder.verified;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClearOperatingObjectFavoritesResponseBody create() {
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
     * @return verified
     */
    public Boolean getVerified() {
        return this.verified;
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
        private Boolean verified; 

        private Builder() {
        } 

        private Builder(ClearOperatingObjectFavoritesResponseBody model) {
            this.code = model.code;
            this.graphName = model.graphName;
            this.message = model.message;
            this.objectType = model.objectType;
            this.operatingObjectName = model.operatingObjectName;
            this.remainingCount = model.remainingCount;
            this.removedCount = model.removedCount;
            this.requestId = model.requestId;
            this.verified = model.verified;
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
         * <p>canonical 图谱技术名</p>
         * 
         * <strong>example:</strong>
         * <p>crm</p>
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
         * <p>对象类型技术名</p>
         * 
         * <strong>example:</strong>
         * <p>contract</p>
         */
        public Builder objectType(String objectType) {
            this.objectType = objectType;
            return this;
        }

        /**
         * <p>canonical 数字员工技术名</p>
         * 
         * <strong>example:</strong>
         * <p>customer_assistant</p>
         */
        public Builder operatingObjectName(String operatingObjectName) {
            this.operatingObjectName = operatingObjectName;
            return this;
        }

        /**
         * <p>同一事务内复核的未过滤剩余物理记录数量</p>
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
         * <p>是否已确认剩余物理记录为零</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder verified(Boolean verified) {
            this.verified = verified;
            return this;
        }

        public ClearOperatingObjectFavoritesResponseBody build() {
            return new ClearOperatingObjectFavoritesResponseBody(this);
        } 

    } 

}
