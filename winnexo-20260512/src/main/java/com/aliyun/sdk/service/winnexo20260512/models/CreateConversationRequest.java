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
 * {@link CreateConversationRequest} extends {@link RequestModel}
 *
 * <p>CreateConversationRequest</p>
 */
public class CreateConversationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("metadata")
    private String metadata;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("objectId")
    private String objectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operatingObjectName")
    private java.util.List<?> operatingObjectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private CreateConversationRequest(Builder builder) {
        super(builder);
        this.metadata = builder.metadata;
        this.objectId = builder.objectId;
        this.operatingObjectName = builder.operatingObjectName;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConversationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return metadata
     */
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * @return objectId
     */
    public String getObjectId() {
        return this.objectId;
    }

    /**
     * @return operatingObjectName
     */
    public java.util.List<?> getOperatingObjectName() {
        return this.operatingObjectName;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<CreateConversationRequest, Builder> {
        private String metadata; 
        private String objectId; 
        private java.util.List<?> operatingObjectName; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(CreateConversationRequest request) {
            super(request);
            this.metadata = request.metadata;
            this.objectId = request.objectId;
            this.operatingObjectName = request.operatingObjectName;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>会话元数据，可含 model 等透传字段（model 需为合法抽象模型名，否则回退默认）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder metadata(String metadata) {
            this.putBodyParameter("metadata", metadata);
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>关联业务对象ID</p>
         * 
         * <strong>example:</strong>
         * <p>2676</p>
         */
        public Builder objectId(String objectId) {
            this.putBodyParameter("objectId", objectId);
            this.objectId = objectId;
            return this;
        }

        /**
         * <p>operatingObjectName</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder operatingObjectName(java.util.List<?> operatingObjectName) {
            String operatingObjectNameShrink = shrink(operatingObjectName, "operatingObjectName", "json");
            this.putBodyParameter("operatingObjectName", operatingObjectNameShrink);
            this.operatingObjectName = operatingObjectName;
            return this;
        }

        /**
         * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public CreateConversationRequest build() {
            return new CreateConversationRequest(this);
        } 

    } 

}
