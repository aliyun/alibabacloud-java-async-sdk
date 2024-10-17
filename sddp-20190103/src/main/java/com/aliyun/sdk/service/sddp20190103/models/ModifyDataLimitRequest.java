// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>Specifies whether to enable the security audit feature. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: no</li>
         * <li><strong>1</strong>: yes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder auditStatus(Integer auditStatus) {
            this.putQueryParameter("AuditStatus", auditStatus);
            this.auditStatus = auditStatus;
            return this;
        }

        /**
         * <p>Specifies whether to automatically trigger a re-scan after a rule is modified. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: no</li>
         * <li><strong>1</strong>: yes</li>
         * </ul>
         * <blockquote>
         * <p>When a re-scan is triggered, DSC scans all data in your data asset.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder autoScan(Integer autoScan) {
            this.putQueryParameter("AutoScan", autoScan);
            this.autoScan = autoScan;
            return this;
        }

        /**
         * <p>The database engine that is run by the instance. Valid values:</p>
         * <ul>
         * <li><strong>MySQL</strong></li>
         * <li><strong>SQLServer</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder engineType(String engineType) {
            this.putQueryParameter("EngineType", engineType);
            this.engineType = engineType;
            return this;
        }

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder featureType(Integer featureType) {
            this.putQueryParameter("FeatureType", featureType);
            this.featureType = featureType;
            return this;
        }

        /**
         * <p>The unique ID of the data asset for which you want to modify configuration items.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeDataLimits~~">DescribeDataLimits</a> operation to query the ID of the data asset.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese (default)</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The retention period of raw logs after you enable the security audit feature. Unit: days. Valid values:</p>
         * <ul>
         * <li><strong>30</strong></li>
         * <li><strong>90</strong></li>
         * <li><strong>180</strong></li>
         * <li><strong>365</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder logStoreDay(Integer logStoreDay) {
            this.putQueryParameter("LogStoreDay", logStoreDay);
            this.logStoreDay = logStoreDay;
            return this;
        }

        /**
         * <p>Specifies whether to change the username and password that are used to log on to the ApsaraDB RDS database. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder modifyPassword(Boolean modifyPassword) {
            this.putQueryParameter("ModifyPassword", modifyPassword);
            this.modifyPassword = modifyPassword;
            return this;
        }

        /**
         * <p>The password used to log on to the ApsaraDB RDS database that you authorize DSC to access.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The port that is used to connect to the database.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        public Builder port(Integer port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>The name of the service to which the data asset belongs. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: MaxCompute</li>
         * <li><strong>2</strong>: Object Storage Service (OSS)</li>
         * <li><strong>3</strong>: AnalyticDB for MySQL</li>
         * <li><strong>4</strong>: Tablestore</li>
         * <li><strong>5</strong>: ApsaraDB RDS</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder resourceType(Integer resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The number of sensitive data samples tht are collected after sensitive data detection is enabled. Valid values:</p>
         * <ul>
         * <li><strong>0</strong></li>
         * <li><strong>5</strong></li>
         * <li><strong>10</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder samplingSize(Integer samplingSize) {
            this.putQueryParameter("SamplingSize", samplingSize);
            this.samplingSize = samplingSize;
            return this;
        }

        /**
         * <p>The security group that is used by PrivateLink when you install the DSC agent.</p>
         */
        public Builder securityGroupIdList(java.util.List < String > securityGroupIdList) {
            this.putQueryParameter("SecurityGroupIdList", securityGroupIdList);
            this.securityGroupIdList = securityGroupIdList;
            return this;
        }

        /**
         * <p>The region in which the data asset resides. Valid values:</p>
         * <ul>
         * <li><strong>cn-beijing</strong>: China (Beijing)</li>
         * <li><strong>cn-zhangjiakou</strong>: China (Zhangjiakou)</li>
         * <li><strong>cn-huhehaote</strong>: China (Hohhot)</li>
         * <li><strong>cn-hangzhou</strong>: China (Hangzhou)</li>
         * <li><strong>cn-shanghai</strong>: China (Shanghai)</li>
         * <li><strong>cn-shenzhen</strong>: China (Shenzhen)</li>
         * <li><strong>cn-hongkong</strong>: China (Hong Kong)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder serviceRegionId(String serviceRegionId) {
            this.putQueryParameter("ServiceRegionId", serviceRegionId);
            this.serviceRegionId = serviceRegionId;
            return this;
        }

        /**
         * <p>The username used to log on to the ApsaraDB RDS database that you authorize DSC to access.</p>
         * 
         * <strong>example:</strong>
         * <p>User01</p>
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * <p>The vSwitch that is used by PrivateLink when you install the DSC agent.</p>
         */
        public Builder vSwitchIdList(java.util.List < String > vSwitchIdList) {
            this.putQueryParameter("VSwitchIdList", vSwitchIdList);
            this.vSwitchIdList = vSwitchIdList;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC) to which the data asset belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zevcqke6hh09c41****</p>
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
