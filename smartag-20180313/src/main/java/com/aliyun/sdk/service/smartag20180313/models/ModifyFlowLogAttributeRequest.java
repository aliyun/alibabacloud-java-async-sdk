// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link ModifyFlowLogAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyFlowLogAttributeRequest</p>
 */
public class ModifyFlowLogAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActiveAging")
    private Integer activeAging;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowLogId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowLogId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InactiveAging")
    private Integer inactiveAging;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogstoreName")
    private String logstoreName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetflowServerIp")
    private String netflowServerIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetflowServerPort")
    private Integer netflowServerPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetflowVersion")
    private String netflowVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputType")
    private String outputType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlsRegionId")
    private String slsRegionId;

    private ModifyFlowLogAttributeRequest(Builder builder) {
        super(builder);
        this.activeAging = builder.activeAging;
        this.description = builder.description;
        this.flowLogId = builder.flowLogId;
        this.inactiveAging = builder.inactiveAging;
        this.logstoreName = builder.logstoreName;
        this.name = builder.name;
        this.netflowServerIp = builder.netflowServerIp;
        this.netflowServerPort = builder.netflowServerPort;
        this.netflowVersion = builder.netflowVersion;
        this.outputType = builder.outputType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.projectName = builder.projectName;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.slsRegionId = builder.slsRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyFlowLogAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return activeAging
     */
    public Integer getActiveAging() {
        return this.activeAging;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return flowLogId
     */
    public String getFlowLogId() {
        return this.flowLogId;
    }

    /**
     * @return inactiveAging
     */
    public Integer getInactiveAging() {
        return this.inactiveAging;
    }

    /**
     * @return logstoreName
     */
    public String getLogstoreName() {
        return this.logstoreName;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return netflowServerIp
     */
    public String getNetflowServerIp() {
        return this.netflowServerIp;
    }

    /**
     * @return netflowServerPort
     */
    public Integer getNetflowServerPort() {
        return this.netflowServerPort;
    }

    /**
     * @return netflowVersion
     */
    public String getNetflowVersion() {
        return this.netflowVersion;
    }

    /**
     * @return outputType
     */
    public String getOutputType() {
        return this.outputType;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return slsRegionId
     */
    public String getSlsRegionId() {
        return this.slsRegionId;
    }

    public static final class Builder extends Request.Builder<ModifyFlowLogAttributeRequest, Builder> {
        private Integer activeAging; 
        private String description; 
        private String flowLogId; 
        private Integer inactiveAging; 
        private String logstoreName; 
        private String name; 
        private String netflowServerIp; 
        private Integer netflowServerPort; 
        private String netflowVersion; 
        private String outputType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String projectName; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String slsRegionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyFlowLogAttributeRequest request) {
            super(request);
            this.activeAging = request.activeAging;
            this.description = request.description;
            this.flowLogId = request.flowLogId;
            this.inactiveAging = request.inactiveAging;
            this.logstoreName = request.logstoreName;
            this.name = request.name;
            this.netflowServerIp = request.netflowServerIp;
            this.netflowServerPort = request.netflowServerPort;
            this.netflowVersion = request.netflowVersion;
            this.outputType = request.outputType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.projectName = request.projectName;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.slsRegionId = request.slsRegionId;
        } 

        /**
         * <p>The interval at which log data of active network connections is collected. Default value: <strong>300</strong>. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder activeAging(Integer activeAging) {
            this.putQueryParameter("ActiveAging", activeAging);
            this.activeAging = activeAging;
            return this;
        }

        /**
         * <p>The description of the flow log.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the flow log.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fl-7a56mar1kfw9vj****</p>
         */
        public Builder flowLogId(String flowLogId) {
            this.putQueryParameter("FlowLogId", flowLogId);
            this.flowLogId = flowLogId;
            return this;
        }

        /**
         * <p>The interval at which log data of inactive network connections is collected. Default value: <strong>15</strong>. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder inactiveAging(Integer inactiveAging) {
            this.putQueryParameter("InactiveAging", inactiveAging);
            this.inactiveAging = inactiveAging;
            return this;
        }

        /**
         * <p>The Logstore of Log Service. This parameter is required when OutputType is set to <strong>sls</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>ssfghgh</p>
         */
        public Builder logstoreName(String logstoreName) {
            this.putQueryParameter("LogstoreName", logstoreName);
            this.logstoreName = logstoreName;
            return this;
        }

        /**
         * <p>The name of the flow log.</p>
         * 
         * <strong>example:</strong>
         * <p>DDE</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The IP address of the NetFlow collector where the flow log is stored. This parameter is required when OutputType is set to <strong>netflow</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.2</p>
         */
        public Builder netflowServerIp(String netflowServerIp) {
            this.putQueryParameter("NetflowServerIp", netflowServerIp);
            this.netflowServerIp = netflowServerIp;
            return this;
        }

        /**
         * <p>The port of the NetFlow collector. Default value: <strong>9995</strong>. This parameter is required when OutputType is set to <strong>netflow</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>9995</p>
         */
        public Builder netflowServerPort(Integer netflowServerPort) {
            this.putQueryParameter("NetflowServerPort", netflowServerPort);
            this.netflowServerPort = netflowServerPort;
            return this;
        }

        /**
         * <p>The NetFlow version. Valid values: <strong>V5</strong>, <strong>V9</strong>, and <strong>V10</strong>. Default value: <strong>V9</strong>. This parameter is required when OutputType is set to <strong>netflow</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>V9</p>
         */
        public Builder netflowVersion(String netflowVersion) {
            this.putQueryParameter("NetflowVersion", netflowVersion);
            this.netflowVersion = netflowVersion;
            return this;
        }

        /**
         * <p>The location where the flow log is stored. Valid values:</p>
         * <ul>
         * <li><strong>sls</strong>: The flow log is stored in Log Service.</li>
         * <li><strong>netflow</strong>: The flow log is stored on a NetFlow collector.</li>
         * <li><strong>all</strong>: The flow log is stored both in Log Service and on a NetFlow collector.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sls</p>
         */
        public Builder outputType(String outputType) {
            this.putQueryParameter("OutputType", outputType);
            this.outputType = outputType;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The project to which the Logstore of Log Service belongs. This parameter is required when OutputType is set to <strong>sls</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>ddrrgt</p>
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The ID of the region where the flow log is deployed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The ID of the region where Log Service is deployed. This parameter is required when OutputType is set to <strong>sls</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder slsRegionId(String slsRegionId) {
            this.putQueryParameter("SlsRegionId", slsRegionId);
            this.slsRegionId = slsRegionId;
            return this;
        }

        @Override
        public ModifyFlowLogAttributeRequest build() {
            return new ModifyFlowLogAttributeRequest(this);
        } 

    } 

}
