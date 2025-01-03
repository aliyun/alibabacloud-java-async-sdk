// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link CreateHostGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateHostGroupRequest</p>
 */
public class CreateHostGroupRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("aliyunRegion")
    private String aliyunRegion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ecsLabelKey")
    private String ecsLabelKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ecsLabelValue")
    private String ecsLabelValue;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ecsType")
    private String ecsType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("envId")
    private String envId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("machineInfos")
    private String machineInfos;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceConnectionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long serviceConnectionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tagIds")
    private String tagIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateHostGroupRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.aliyunRegion = builder.aliyunRegion;
        this.ecsLabelKey = builder.ecsLabelKey;
        this.ecsLabelValue = builder.ecsLabelValue;
        this.ecsType = builder.ecsType;
        this.envId = builder.envId;
        this.machineInfos = builder.machineInfos;
        this.name = builder.name;
        this.serviceConnectionId = builder.serviceConnectionId;
        this.tagIds = builder.tagIds;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHostGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return aliyunRegion
     */
    public String getAliyunRegion() {
        return this.aliyunRegion;
    }

    /**
     * @return ecsLabelKey
     */
    public String getEcsLabelKey() {
        return this.ecsLabelKey;
    }

    /**
     * @return ecsLabelValue
     */
    public String getEcsLabelValue() {
        return this.ecsLabelValue;
    }

    /**
     * @return ecsType
     */
    public String getEcsType() {
        return this.ecsType;
    }

    /**
     * @return envId
     */
    public String getEnvId() {
        return this.envId;
    }

    /**
     * @return machineInfos
     */
    public String getMachineInfos() {
        return this.machineInfos;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return serviceConnectionId
     */
    public Long getServiceConnectionId() {
        return this.serviceConnectionId;
    }

    /**
     * @return tagIds
     */
    public String getTagIds() {
        return this.tagIds;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateHostGroupRequest, Builder> {
        private String organizationId; 
        private String aliyunRegion; 
        private String ecsLabelKey; 
        private String ecsLabelValue; 
        private String ecsType; 
        private String envId; 
        private String machineInfos; 
        private String name; 
        private Long serviceConnectionId; 
        private String tagIds; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateHostGroupRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.aliyunRegion = request.aliyunRegion;
            this.ecsLabelKey = request.ecsLabelKey;
            this.ecsLabelValue = request.ecsLabelValue;
            this.ecsType = request.ecsType;
            this.envId = request.envId;
            this.machineInfos = request.machineInfos;
            this.name = request.name;
            this.serviceConnectionId = request.serviceConnectionId;
            this.tagIds = request.tagIds;
            this.type = request.type;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5ebbc0228123212b59xxxxx</p>
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * aliyunRegion.
         */
        public Builder aliyunRegion(String aliyunRegion) {
            this.putBodyParameter("aliyunRegion", aliyunRegion);
            this.aliyunRegion = aliyunRegion;
            return this;
        }

        /**
         * ecsLabelKey.
         */
        public Builder ecsLabelKey(String ecsLabelKey) {
            this.putBodyParameter("ecsLabelKey", ecsLabelKey);
            this.ecsLabelKey = ecsLabelKey;
            return this;
        }

        /**
         * ecsLabelValue.
         */
        public Builder ecsLabelValue(String ecsLabelValue) {
            this.putBodyParameter("ecsLabelValue", ecsLabelValue);
            this.ecsLabelValue = ecsLabelValue;
            return this;
        }

        /**
         * ecsType.
         */
        public Builder ecsType(String ecsType) {
            this.putBodyParameter("ecsType", ecsType);
            this.ecsType = ecsType;
            return this;
        }

        /**
         * envId.
         */
        public Builder envId(String envId) {
            this.putBodyParameter("envId", envId);
            this.envId = envId;
            return this;
        }

        /**
         * machineInfos.
         */
        public Builder machineInfos(String machineInfos) {
            this.putBodyParameter("machineInfos", machineInfos);
            this.machineInfos = machineInfos;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder serviceConnectionId(Long serviceConnectionId) {
            this.putBodyParameter("serviceConnectionId", serviceConnectionId);
            this.serviceConnectionId = serviceConnectionId;
            return this;
        }

        /**
         * tagIds.
         */
        public Builder tagIds(String tagIds) {
            this.putBodyParameter("tagIds", tagIds);
            this.tagIds = tagIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateHostGroupRequest build() {
            return new CreateHostGroupRequest(this);
        } 

    } 

}
