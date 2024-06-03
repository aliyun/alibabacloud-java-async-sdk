// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDataLimitRequest} extends {@link RequestModel}
 *
 * <p>ModifyDataLimitRequest</p>
 */
public class ModifyDataLimitRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditStatus")
    private Integer auditStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoScan")
    private Integer autoScan;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineType")
    private String engineType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeatureType")
    private Integer featureType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogStoreDay")
    private Integer logStoreDay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModifyPassword")
    private Boolean modifyPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    private Integer port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SamplingSize")
    private Integer samplingSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupIdList")
    private java.util.List < String > securityGroupIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceRegionId")
    private String serviceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchIdList")
    private java.util.List < String > vSwitchIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private ModifyDataLimitRequest(Builder builder) {
        super(builder);
        this.auditStatus = builder.auditStatus;
        this.autoScan = builder.autoScan;
        this.engineType = builder.engineType;
        this.featureType = builder.featureType;
        this.id = builder.id;
        this.lang = builder.lang;
        this.logStoreDay = builder.logStoreDay;
        this.modifyPassword = builder.modifyPassword;
        this.password = builder.password;
        this.port = builder.port;
        this.resourceType = builder.resourceType;
        this.samplingSize = builder.samplingSize;
        this.securityGroupIdList = builder.securityGroupIdList;
        this.serviceRegionId = builder.serviceRegionId;
        this.userName = builder.userName;
        this.vSwitchIdList = builder.vSwitchIdList;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDataLimitRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return auditStatus
     */
    public Integer getAuditStatus() {
        return this.auditStatus;
    }

    /**
     * @return autoScan
     */
    public Integer getAutoScan() {
        return this.autoScan;
    }

    /**
     * @return engineType
     */
    public String getEngineType() {
        return this.engineType;
    }

    /**
     * @return featureType
     */
    public Integer getFeatureType() {
        return this.featureType;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return logStoreDay
     */
    public Integer getLogStoreDay() {
        return this.logStoreDay;
    }

    /**
     * @return modifyPassword
     */
    public Boolean getModifyPassword() {
        return this.modifyPassword;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * @return resourceType
     */
    public Integer getResourceType() {
        return this.resourceType;
    }

    /**
     * @return samplingSize
     */
    public Integer getSamplingSize() {
        return this.samplingSize;
    }

    /**
     * @return securityGroupIdList
     */
    public java.util.List < String > getSecurityGroupIdList() {
        return this.securityGroupIdList;
    }

    /**
     * @return serviceRegionId
     */
    public String getServiceRegionId() {
        return this.serviceRegionId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return vSwitchIdList
     */
    public java.util.List < String > getVSwitchIdList() {
        return this.vSwitchIdList;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<ModifyDataLimitRequest, Builder> {
        private Integer auditStatus; 
        private Integer autoScan; 
        private String engineType; 
        private Integer featureType; 
        private Long id; 
        private String lang; 
        private Integer logStoreDay; 
        private Boolean modifyPassword; 
        private String password; 
        private Integer port; 
        private Integer resourceType; 
        private Integer samplingSize; 
        private java.util.List < String > securityGroupIdList; 
        private String serviceRegionId; 
        private String userName; 
        private java.util.List < String > vSwitchIdList; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDataLimitRequest request) {
            super(request);
            this.auditStatus = request.auditStatus;
            this.autoScan = request.autoScan;
            this.engineType = request.engineType;
            this.featureType = request.featureType;
            this.id = request.id;
            this.lang = request.lang;
            this.logStoreDay = request.logStoreDay;
            this.modifyPassword = request.modifyPassword;
            this.password = request.password;
            this.port = request.port;
            this.resourceType = request.resourceType;
            this.samplingSize = request.samplingSize;
            this.securityGroupIdList = request.securityGroupIdList;
            this.serviceRegionId = request.serviceRegionId;
            this.userName = request.userName;
            this.vSwitchIdList = request.vSwitchIdList;
            this.vpcId = request.vpcId;
        } 

        /**
         * Specifies whether to enable the security audit feature. Valid values:
         * <p>
         * 
         * *   **0**: no
         * *   **1**: yes
         */
        public Builder auditStatus(Integer auditStatus) {
            this.putQueryParameter("AuditStatus", auditStatus);
            this.auditStatus = auditStatus;
            return this;
        }

        /**
         * Specifies whether to automatically trigger a re-scan after a rule is modified. Valid values:
         * <p>
         * 
         * *   **0**: no
         * *   **1**: yes
         * 
         * > When a re-scan is triggered, DSC scans all data in your data asset.
         */
        public Builder autoScan(Integer autoScan) {
            this.putQueryParameter("AutoScan", autoScan);
            this.autoScan = autoScan;
            return this;
        }

        /**
         * The database engine that is run by the instance. Valid values:
         * <p>
         * 
         * *   **MySQL**
         * *   **SQLServer**
         */
        public Builder engineType(String engineType) {
            this.putQueryParameter("EngineType", engineType);
            this.engineType = engineType;
            return this;
        }

        /**
         * This parameter is deprecated.
         */
        public Builder featureType(Integer featureType) {
            this.putQueryParameter("FeatureType", featureType);
            this.featureType = featureType;
            return this;
        }

        /**
         * The unique ID of the data asset for which you want to modify configuration items.
         * <p>
         * 
         * > You can call the [DescribeDataLimits](~~DescribeDataLimits~~) operation to query the ID of the data asset.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The language of the content within the request and response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese (default)
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The retention period of raw logs after you enable the security audit feature. Unit: days. Valid values:
         * <p>
         * 
         * *   **30**
         * *   **90**
         * *   **180**
         * *   **365**
         */
        public Builder logStoreDay(Integer logStoreDay) {
            this.putQueryParameter("LogStoreDay", logStoreDay);
            this.logStoreDay = logStoreDay;
            return this;
        }

        /**
         * Specifies whether to change the username and password that are used to log on to the ApsaraDB RDS database. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no
         */
        public Builder modifyPassword(Boolean modifyPassword) {
            this.putQueryParameter("ModifyPassword", modifyPassword);
            this.modifyPassword = modifyPassword;
            return this;
        }

        /**
         * The password used to log on to the ApsaraDB RDS database that you authorize DSC to access.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * The port that is used to connect to the database.
         */
        public Builder port(Integer port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * The name of the service to which the data asset belongs. Valid values:
         * <p>
         * 
         * *   **1**: MaxCompute
         * *   **2**: Object Storage Service (OSS)
         * *   **3**: AnalyticDB for MySQL
         * *   **4**: Tablestore
         * *   **5**: ApsaraDB RDS
         */
        public Builder resourceType(Integer resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * The number of sensitive data samples tht are collected after sensitive data detection is enabled. Valid values:
         * <p>
         * 
         * *   **0**
         * *   **5**
         * *   **10**
         */
        public Builder samplingSize(Integer samplingSize) {
            this.putQueryParameter("SamplingSize", samplingSize);
            this.samplingSize = samplingSize;
            return this;
        }

        /**
         * The security group that is used by PrivateLink when you install the DSC agent.
         */
        public Builder securityGroupIdList(java.util.List < String > securityGroupIdList) {
            this.putQueryParameter("SecurityGroupIdList", securityGroupIdList);
            this.securityGroupIdList = securityGroupIdList;
            return this;
        }

        /**
         * The region in which the data asset resides. Valid values:
         * <p>
         * 
         * *   **cn-beijing**: China (Beijing)
         * *   **cn-zhangjiakou**: China (Zhangjiakou)
         * *   **cn-huhehaote**: China (Hohhot)
         * *   **cn-hangzhou**: China (Hangzhou)
         * *   **cn-shanghai**: China (Shanghai)
         * *   **cn-shenzhen**: China (Shenzhen)
         * *   **cn-hongkong**: China (Hong Kong)
         */
        public Builder serviceRegionId(String serviceRegionId) {
            this.putQueryParameter("ServiceRegionId", serviceRegionId);
            this.serviceRegionId = serviceRegionId;
            return this;
        }

        /**
         * The username used to log on to the ApsaraDB RDS database that you authorize DSC to access.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * The vSwitch that is used by PrivateLink when you install the DSC agent.
         */
        public Builder vSwitchIdList(java.util.List < String > vSwitchIdList) {
            this.putQueryParameter("VSwitchIdList", vSwitchIdList);
            this.vSwitchIdList = vSwitchIdList;
            return this;
        }

        /**
         * The ID of the virtual private cloud (VPC) to which the data asset belongs.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public ModifyDataLimitRequest build() {
            return new ModifyDataLimitRequest(this);
        } 

    } 

}
