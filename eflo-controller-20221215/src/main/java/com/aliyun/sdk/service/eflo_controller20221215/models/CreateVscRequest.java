// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link CreateVscRequest} extends {@link RequestModel}
 *
 * <p>CreateVscRequest</p>
 */
public class CreateVscRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VscName")
    private String vscName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VscType")
    private String vscType;

    private CreateVscRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.nodeId = builder.nodeId;
        this.resourceGroupId = builder.resourceGroupId;
        this.tag = builder.tag;
        this.vscName = builder.vscName;
        this.vscType = builder.vscType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVscRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return vscName
     */
    public String getVscName() {
        return this.vscName;
    }

    /**
     * @return vscType
     */
    public String getVscType() {
        return this.vscType;
    }

    public static final class Builder extends Request.Builder<CreateVscRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private String nodeId; 
        private String resourceGroupId; 
        private java.util.List<Tag> tag; 
        private String vscName; 
        private String vscType; 

        private Builder() {
            super();
        } 

        private Builder(CreateVscRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.nodeId = request.nodeId;
            this.resourceGroupId = request.resourceGroupId;
            this.tag = request.tag;
            this.vscName = request.vscName;
            this.vscType = request.vscType;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Idempotent parameter</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Node ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e01-cn-zvp2tgykr08</p>
         */
        public Builder nodeId(String nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>Resource group ID</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2xdkc6icwfha</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Resource tags</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putBodyParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>User-defined name for vscId, unique on a single compute node</p>
         * 
         * <strong>example:</strong>
         * <p>test_name</p>
         */
        public Builder vscName(String vscName) {
            this.putBodyParameter("VscName", vscName);
            this.vscName = vscName;
            return this;
        }

        /**
         * <p>Set VSC type, primary/standard, default value is primary</p>
         * 
         * <strong>example:</strong>
         * <p>primary</p>
         */
        public Builder vscType(String vscType) {
            this.putBodyParameter("VscType", vscType);
            this.vscType = vscType;
            return this;
        }

        @Override
        public CreateVscRequest build() {
            return new CreateVscRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateVscRequest} extends {@link TeaModel}
     *
     * <p>CreateVscRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>Resource tag key</p>
             * 
             * <strong>example:</strong>
             * <p>key001</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>Resource tag value</p>
             * 
             * <strong>example:</strong>
             * <p>value001</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
