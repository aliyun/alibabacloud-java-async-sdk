// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeployAppRequest} extends {@link RequestModel}
 *
 * <p>DeployAppRequest</p>
 */
public class DeployAppRequest extends Request {
    @Query
    @NameInMap("ArmsFlag")
    private Boolean armsFlag;

    @Query
    @NameInMap("ContainerImageList")
    private java.util.List < String > containerImageList;

    @Query
    @NameInMap("DefaultPacketOfAppGroup")
    private String defaultPacketOfAppGroup;

    @Query
    @NameInMap("DeployPacketId")
    private Long deployPacketId;

    @Query
    @NameInMap("DeployPacketUrl")
    private String deployPacketUrl;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("EnvId")
    @Validation(required = true)
    private Long envId;

    @Query
    @NameInMap("InitContainerImageList")
    private java.util.List < String > initContainerImageList;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("PauseType")
    private String pauseType;

    @Query
    @NameInMap("TotalPartitions")
    @Validation(required = true)
    private Integer totalPartitions;

    @Query
    @NameInMap("UpdateStrategyType")
    private String updateStrategyType;

    private DeployAppRequest(Builder builder) {
        super(builder);
        this.armsFlag = builder.armsFlag;
        this.containerImageList = builder.containerImageList;
        this.defaultPacketOfAppGroup = builder.defaultPacketOfAppGroup;
        this.deployPacketId = builder.deployPacketId;
        this.deployPacketUrl = builder.deployPacketUrl;
        this.description = builder.description;
        this.envId = builder.envId;
        this.initContainerImageList = builder.initContainerImageList;
        this.name = builder.name;
        this.pauseType = builder.pauseType;
        this.totalPartitions = builder.totalPartitions;
        this.updateStrategyType = builder.updateStrategyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeployAppRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return armsFlag
     */
    public Boolean getArmsFlag() {
        return this.armsFlag;
    }

    /**
     * @return containerImageList
     */
    public java.util.List < String > getContainerImageList() {
        return this.containerImageList;
    }

    /**
     * @return defaultPacketOfAppGroup
     */
    public String getDefaultPacketOfAppGroup() {
        return this.defaultPacketOfAppGroup;
    }

    /**
     * @return deployPacketId
     */
    public Long getDeployPacketId() {
        return this.deployPacketId;
    }

    /**
     * @return deployPacketUrl
     */
    public String getDeployPacketUrl() {
        return this.deployPacketUrl;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return envId
     */
    public Long getEnvId() {
        return this.envId;
    }

    /**
     * @return initContainerImageList
     */
    public java.util.List < String > getInitContainerImageList() {
        return this.initContainerImageList;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pauseType
     */
    public String getPauseType() {
        return this.pauseType;
    }

    /**
     * @return totalPartitions
     */
    public Integer getTotalPartitions() {
        return this.totalPartitions;
    }

    /**
     * @return updateStrategyType
     */
    public String getUpdateStrategyType() {
        return this.updateStrategyType;
    }

    public static final class Builder extends Request.Builder<DeployAppRequest, Builder> {
        private Boolean armsFlag; 
        private java.util.List < String > containerImageList; 
        private String defaultPacketOfAppGroup; 
        private Long deployPacketId; 
        private String deployPacketUrl; 
        private String description; 
        private Long envId; 
        private java.util.List < String > initContainerImageList; 
        private String name; 
        private String pauseType; 
        private Integer totalPartitions; 
        private String updateStrategyType; 

        private Builder() {
            super();
        } 

        private Builder(DeployAppRequest request) {
            super(request);
            this.armsFlag = request.armsFlag;
            this.containerImageList = request.containerImageList;
            this.defaultPacketOfAppGroup = request.defaultPacketOfAppGroup;
            this.deployPacketId = request.deployPacketId;
            this.deployPacketUrl = request.deployPacketUrl;
            this.description = request.description;
            this.envId = request.envId;
            this.initContainerImageList = request.initContainerImageList;
            this.name = request.name;
            this.pauseType = request.pauseType;
            this.totalPartitions = request.totalPartitions;
            this.updateStrategyType = request.updateStrategyType;
        } 

        /**
         * ArmsFlag.
         */
        public Builder armsFlag(Boolean armsFlag) {
            this.putQueryParameter("ArmsFlag", armsFlag);
            this.armsFlag = armsFlag;
            return this;
        }

        /**
         * ContainerImageList.
         */
        public Builder containerImageList(java.util.List < String > containerImageList) {
            this.putQueryParameter("ContainerImageList", containerImageList);
            this.containerImageList = containerImageList;
            return this;
        }

        /**
         * DefaultPacketOfAppGroup.
         */
        public Builder defaultPacketOfAppGroup(String defaultPacketOfAppGroup) {
            this.putQueryParameter("DefaultPacketOfAppGroup", defaultPacketOfAppGroup);
            this.defaultPacketOfAppGroup = defaultPacketOfAppGroup;
            return this;
        }

        /**
         * DeployPacketId.
         */
        public Builder deployPacketId(Long deployPacketId) {
            this.putQueryParameter("DeployPacketId", deployPacketId);
            this.deployPacketId = deployPacketId;
            return this;
        }

        /**
         * DeployPacketUrl.
         */
        public Builder deployPacketUrl(String deployPacketUrl) {
            this.putQueryParameter("DeployPacketUrl", deployPacketUrl);
            this.deployPacketUrl = deployPacketUrl;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EnvId.
         */
        public Builder envId(Long envId) {
            this.putQueryParameter("EnvId", envId);
            this.envId = envId;
            return this;
        }

        /**
         * InitContainerImageList.
         */
        public Builder initContainerImageList(java.util.List < String > initContainerImageList) {
            this.putQueryParameter("InitContainerImageList", initContainerImageList);
            this.initContainerImageList = initContainerImageList;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PauseType.
         */
        public Builder pauseType(String pauseType) {
            this.putQueryParameter("PauseType", pauseType);
            this.pauseType = pauseType;
            return this;
        }

        /**
         * TotalPartitions.
         */
        public Builder totalPartitions(Integer totalPartitions) {
            this.putQueryParameter("TotalPartitions", totalPartitions);
            this.totalPartitions = totalPartitions;
            return this;
        }

        /**
         * UpdateStrategyType.
         */
        public Builder updateStrategyType(String updateStrategyType) {
            this.putQueryParameter("UpdateStrategyType", updateStrategyType);
            this.updateStrategyType = updateStrategyType;
            return this;
        }

        @Override
        public DeployAppRequest build() {
            return new DeployAppRequest(this);
        } 

    } 

}
