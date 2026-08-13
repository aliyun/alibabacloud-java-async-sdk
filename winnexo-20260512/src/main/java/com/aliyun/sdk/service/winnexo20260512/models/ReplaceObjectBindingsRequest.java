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
 * {@link ReplaceObjectBindingsRequest} extends {@link RequestModel}
 *
 * <p>ReplaceObjectBindingsRequest</p>
 */
public class ReplaceObjectBindingsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("objectBindings")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ObjectBindings> objectBindings;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private ReplaceObjectBindingsRequest(Builder builder) {
        super(builder);
        this.objectBindings = builder.objectBindings;
        this.sourceId = builder.sourceId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReplaceObjectBindingsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return objectBindings
     */
    public java.util.List<ObjectBindings> getObjectBindings() {
        return this.objectBindings;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<ReplaceObjectBindingsRequest, Builder> {
        private java.util.List<ObjectBindings> objectBindings; 
        private String sourceId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ReplaceObjectBindingsRequest request) {
            super(request);
            this.objectBindings = request.objectBindings;
            this.sourceId = request.sourceId;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>新的对象绑定列表（全量替换；传空列表表示清空所有绑定）</p>
         * <p>This parameter is required.</p>
         */
        public Builder objectBindings(java.util.List<ObjectBindings> objectBindings) {
            String objectBindingsShrink = shrink(objectBindings, "objectBindings", "json");
            this.putBodyParameter("objectBindings", objectBindingsShrink);
            this.objectBindings = objectBindings;
            return this;
        }

        /**
         * <p>数据源 ID（租户内唯一）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleSourceId</p>
         */
        public Builder sourceId(String sourceId) {
            this.putBodyParameter("sourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public ReplaceObjectBindingsRequest build() {
            return new ReplaceObjectBindingsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ReplaceObjectBindingsRequest} extends {@link TeaModel}
     *
     * <p>ReplaceObjectBindingsRequest</p>
     */
    public static class ObjectBindings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("graphName")
        private String graphName;

        @com.aliyun.core.annotation.NameInMap("objectId")
        private String objectId;

        @com.aliyun.core.annotation.NameInMap("objectType")
        private String objectType;

        private ObjectBindings(Builder builder) {
            this.graphName = builder.graphName;
            this.objectId = builder.objectId;
            this.objectType = builder.objectType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ObjectBindings create() {
            return builder().build();
        }

        /**
         * @return graphName
         */
        public String getGraphName() {
            return this.graphName;
        }

        /**
         * @return objectId
         */
        public String getObjectId() {
            return this.objectId;
        }

        /**
         * @return objectType
         */
        public String getObjectType() {
            return this.objectType;
        }

        public static final class Builder {
            private String graphName; 
            private String objectId; 
            private String objectType; 

            private Builder() {
            } 

            private Builder(ObjectBindings model) {
                this.graphName = model.graphName;
                this.objectId = model.objectId;
                this.objectType = model.objectType;
            } 

            /**
             * <p>绑定对象归属的语义图谱名（object_id 在该 graph 下唯一，必填）</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder graphName(String graphName) {
                this.graphName = graphName;
                return this;
            }

            /**
             * <p>绑定对象 ID</p>
             * 
             * <strong>example:</strong>
             * <p>exampleObjectId</p>
             */
            public Builder objectId(String objectId) {
                this.objectId = objectId;
                return this;
            }

            /**
             * <p>绑定对象类型（如 customer / project）</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            public ObjectBindings build() {
                return new ObjectBindings(this);
            } 

        } 

    }
}
