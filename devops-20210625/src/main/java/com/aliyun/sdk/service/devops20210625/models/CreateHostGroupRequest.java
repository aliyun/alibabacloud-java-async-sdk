// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHostGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateHostGroupRequest</p>
 */
public class CreateHostGroupRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Body
    @NameInMap("aliyunRegion")
    private String aliyunRegion;

    @Body
    @NameInMap("ecsLabelKey")
    private String ecsLabelKey;

    @Body
    @NameInMap("ecsLabelValue")
    private String ecsLabelValue;

    @Body
    @NameInMap("ecsType")
    private String ecsType;

    @Body
    @NameInMap("envId")
    private String envId;

    @Body
    @NameInMap("machineInfos")
    private String machineInfos;

    @Body
    @NameInMap("name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("serviceConnectionId")
    @Validation(required = true)
    private Long serviceConnectionId;

    @Body
    @NameInMap("tagIds")
    private String tagIds;

    @Body
    @NameInMap("type")
    @Validation(required = true)
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

        private Builder(CreateHostGroupRequest response) {
            super(response);
            this.organizationId = response.organizationId;
            this.aliyunRegion = response.aliyunRegion;
            this.ecsLabelKey = response.ecsLabelKey;
            this.ecsLabelValue = response.ecsLabelValue;
            this.ecsType = response.ecsType;
            this.envId = response.envId;
            this.machineInfos = response.machineInfos;
            this.name = response.name;
            this.serviceConnectionId = response.serviceConnectionId;
            this.tagIds = response.tagIds;
            this.type = response.type;
        } 

        /**
         * organizationId.
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
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * serviceConnectionId.
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
         * type.
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
