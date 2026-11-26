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
 * {@link ReplaceKnowledgeBaseSourceObjectBindingsRequest} extends {@link RequestModel}
 *
 * <p>ReplaceKnowledgeBaseSourceObjectBindingsRequest</p>
 */
public class ReplaceKnowledgeBaseSourceObjectBindingsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("appToken")
    private String appToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("objectBindings")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ObjectBindings> objectBindings;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("opsUserCode")
    private String opsUserCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("opsUserId")
    private String opsUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceId")
    @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
    private String sourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private ReplaceKnowledgeBaseSourceObjectBindingsRequest(Builder builder) {
        super(builder);
        this.appToken = builder.appToken;
        this.objectBindings = builder.objectBindings;
        this.opsUserCode = builder.opsUserCode;
        this.opsUserId = builder.opsUserId;
        this.sourceId = builder.sourceId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReplaceKnowledgeBaseSourceObjectBindingsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appToken
     */
    public String getAppToken() {
        return this.appToken;
    }

    /**
     * @return objectBindings
     */
    public java.util.List<ObjectBindings> getObjectBindings() {
        return this.objectBindings;
    }

    /**
     * @return opsUserCode
     */
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    /**
     * @return opsUserId
     */
    public String getOpsUserId() {
        return this.opsUserId;
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

    public static final class Builder extends Request.Builder<ReplaceKnowledgeBaseSourceObjectBindingsRequest, Builder> {
        private String appToken; 
        private java.util.List<ObjectBindings> objectBindings; 
        private String opsUserCode; 
        private String opsUserId; 
        private String sourceId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ReplaceKnowledgeBaseSourceObjectBindingsRequest request) {
            super(request);
            this.appToken = request.appToken;
            this.objectBindings = request.objectBindings;
            this.opsUserCode = request.opsUserCode;
            this.opsUserId = request.opsUserId;
            this.sourceId = request.sourceId;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>token</p>
         * 
         * <strong>example:</strong>
         * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
         */
        public Builder appToken(String appToken) {
            this.putQueryParameter("appToken", appToken);
            this.appToken = appToken;
            return this;
        }

        /**
         * <p>The object bindings.</p>
         * <p>This parameter is required.</p>
         */
        public Builder objectBindings(java.util.List<ObjectBindings> objectBindings) {
            String objectBindingsShrink = shrink(objectBindings, "objectBindings", "json");
            this.putBodyParameter("objectBindings", objectBindingsShrink);
            this.objectBindings = objectBindings;
            return this;
        }

        /**
         * <p>The code of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder opsUserCode(String opsUserCode) {
            this.putQueryParameter("opsUserCode", opsUserCode);
            this.opsUserCode = opsUserCode;
            return this;
        }

        /**
         * <p>The ID of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder opsUserId(String opsUserId) {
            this.putQueryParameter("opsUserId", opsUserId);
            this.opsUserId = opsUserId;
            return this;
        }

        /**
         * <p>The ID of the data source to be re-parsed. The ID is unique within the tenant.</p>
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
         * <p>The tenant ID. This is a common parameter. For winnexo-cli, pass this parameter explicitly by using --tenant-id.</p>
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
        public ReplaceKnowledgeBaseSourceObjectBindingsRequest build() {
            return new ReplaceKnowledgeBaseSourceObjectBindingsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ReplaceKnowledgeBaseSourceObjectBindingsRequest} extends {@link TeaModel}
     *
     * <p>ReplaceKnowledgeBaseSourceObjectBindingsRequest</p>
     */
    public static class ObjectBindings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("graphName")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 256, minLength = 1)
        private String graphName;

        @com.aliyun.core.annotation.NameInMap("objectId")
        @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
        private String objectId;

        @com.aliyun.core.annotation.NameInMap("objectType")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
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
             * <p>The name of the semantic graph to which the bound object belongs. The object ID is unique within this graph. This parameter is required.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>string_value</p>
             */
            public Builder graphName(String graphName) {
                this.graphName = graphName;
                return this;
            }

            /**
             * <p>The ID of the bound object.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleObjectId</p>
             */
            public Builder objectId(String objectId) {
                this.objectId = objectId;
                return this;
            }

            /**
             * <p>The object type to attach, such as customer or project.</p>
             * <p>This parameter is required.</p>
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
