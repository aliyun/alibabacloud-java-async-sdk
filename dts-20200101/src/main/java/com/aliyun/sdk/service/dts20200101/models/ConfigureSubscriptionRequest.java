// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigureSubscriptionRequest} extends {@link RequestModel}
 *
 * <p>ConfigureSubscriptionRequest</p>
 */
public class ConfigureSubscriptionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Checkpoint")
    private String checkpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DedicatedClusterId")
    private String dedicatedClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DelayNotice")
    private Boolean delayNotice;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DelayPhone")
    private String delayPhone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DelayRuleTime")
    private Long delayRuleTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtsBisLabel")
    private String dtsBisLabel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtsInstanceId")
    private String dtsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtsJobId")
    private String dtsJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtsJobName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dtsJobName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ErrorNotice")
    private Boolean errorNotice;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ErrorPhone")
    private String errorPhone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxDu")
    private Double maxDu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinDu")
    private Double minDu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Reserve")
    private String reserve;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointDatabaseName")
    private String sourceEndpointDatabaseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointEngineName")
    private String sourceEndpointEngineName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointIP")
    private String sourceEndpointIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointInstanceID")
    private String sourceEndpointInstanceID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointInstanceType")
    private String sourceEndpointInstanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointOracleSID")
    private String sourceEndpointOracleSID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointOwnerID")
    private String sourceEndpointOwnerID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointPassword")
    private String sourceEndpointPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointPort")
    private String sourceEndpointPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointRegion")
    private String sourceEndpointRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointRole")
    private String sourceEndpointRole;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpointUserName")
    private String sourceEndpointUserName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcCaCertificateOssUrl")
    private String srcCaCertificateOssUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcCaCertificatePassword")
    private String srcCaCertificatePassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcClientCertOssUrl")
    private String srcClientCertOssUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcClientKeyOssUrl")
    private String srcClientKeyOssUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcClientPassword")
    private String srcClientPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscriptionDataTypeDDL")
    private Boolean subscriptionDataTypeDDL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscriptionDataTypeDML")
    private Boolean subscriptionDataTypeDML;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscriptionInstanceNetworkType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subscriptionInstanceNetworkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscriptionInstanceVPCId")
    private String subscriptionInstanceVPCId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscriptionInstanceVSwitchId")
    private String subscriptionInstanceVSwitchId;

    private ConfigureSubscriptionRequest(Builder builder) {
        super(builder);
        this.checkpoint = builder.checkpoint;
        this.dbList = builder.dbList;
        this.dedicatedClusterId = builder.dedicatedClusterId;
        this.delayNotice = builder.delayNotice;
        this.delayPhone = builder.delayPhone;
        this.delayRuleTime = builder.delayRuleTime;
        this.dtsBisLabel = builder.dtsBisLabel;
        this.dtsInstanceId = builder.dtsInstanceId;
        this.dtsJobId = builder.dtsJobId;
        this.dtsJobName = builder.dtsJobName;
        this.errorNotice = builder.errorNotice;
        this.errorPhone = builder.errorPhone;
        this.maxDu = builder.maxDu;
        this.minDu = builder.minDu;
        this.regionId = builder.regionId;
        this.reserve = builder.reserve;
        this.resourceGroupId = builder.resourceGroupId;
        this.sourceEndpointDatabaseName = builder.sourceEndpointDatabaseName;
        this.sourceEndpointEngineName = builder.sourceEndpointEngineName;
        this.sourceEndpointIP = builder.sourceEndpointIP;
        this.sourceEndpointInstanceID = builder.sourceEndpointInstanceID;
        this.sourceEndpointInstanceType = builder.sourceEndpointInstanceType;
        this.sourceEndpointOracleSID = builder.sourceEndpointOracleSID;
        this.sourceEndpointOwnerID = builder.sourceEndpointOwnerID;
        this.sourceEndpointPassword = builder.sourceEndpointPassword;
        this.sourceEndpointPort = builder.sourceEndpointPort;
        this.sourceEndpointRegion = builder.sourceEndpointRegion;
        this.sourceEndpointRole = builder.sourceEndpointRole;
        this.sourceEndpointUserName = builder.sourceEndpointUserName;
        this.srcCaCertificateOssUrl = builder.srcCaCertificateOssUrl;
        this.srcCaCertificatePassword = builder.srcCaCertificatePassword;
        this.srcClientCertOssUrl = builder.srcClientCertOssUrl;
        this.srcClientKeyOssUrl = builder.srcClientKeyOssUrl;
        this.srcClientPassword = builder.srcClientPassword;
        this.subscriptionDataTypeDDL = builder.subscriptionDataTypeDDL;
        this.subscriptionDataTypeDML = builder.subscriptionDataTypeDML;
        this.subscriptionInstanceNetworkType = builder.subscriptionInstanceNetworkType;
        this.subscriptionInstanceVPCId = builder.subscriptionInstanceVPCId;
        this.subscriptionInstanceVSwitchId = builder.subscriptionInstanceVSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigureSubscriptionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkpoint
     */
    public String getCheckpoint() {
        return this.checkpoint;
    }

    /**
     * @return dbList
     */
    public String getDbList() {
        return this.dbList;
    }

    /**
     * @return dedicatedClusterId
     */
    public String getDedicatedClusterId() {
        return this.dedicatedClusterId;
    }

    /**
     * @return delayNotice
     */
    public Boolean getDelayNotice() {
        return this.delayNotice;
    }

    /**
     * @return delayPhone
     */
    public String getDelayPhone() {
        return this.delayPhone;
    }

    /**
     * @return delayRuleTime
     */
    public Long getDelayRuleTime() {
        return this.delayRuleTime;
    }

    /**
     * @return dtsBisLabel
     */
    public String getDtsBisLabel() {
        return this.dtsBisLabel;
    }

    /**
     * @return dtsInstanceId
     */
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    /**
     * @return dtsJobId
     */
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    /**
     * @return dtsJobName
     */
    public String getDtsJobName() {
        return this.dtsJobName;
    }

    /**
     * @return errorNotice
     */
    public Boolean getErrorNotice() {
        return this.errorNotice;
    }

    /**
     * @return errorPhone
     */
    public String getErrorPhone() {
        return this.errorPhone;
    }

    /**
     * @return maxDu
     */
    public Double getMaxDu() {
        return this.maxDu;
    }

    /**
     * @return minDu
     */
    public Double getMinDu() {
        return this.minDu;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return reserve
     */
    public String getReserve() {
        return this.reserve;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return sourceEndpointDatabaseName
     */
    public String getSourceEndpointDatabaseName() {
        return this.sourceEndpointDatabaseName;
    }

    /**
     * @return sourceEndpointEngineName
     */
    public String getSourceEndpointEngineName() {
        return this.sourceEndpointEngineName;
    }

    /**
     * @return sourceEndpointIP
     */
    public String getSourceEndpointIP() {
        return this.sourceEndpointIP;
    }

    /**
     * @return sourceEndpointInstanceID
     */
    public String getSourceEndpointInstanceID() {
        return this.sourceEndpointInstanceID;
    }

    /**
     * @return sourceEndpointInstanceType
     */
    public String getSourceEndpointInstanceType() {
        return this.sourceEndpointInstanceType;
    }

    /**
     * @return sourceEndpointOracleSID
     */
    public String getSourceEndpointOracleSID() {
        return this.sourceEndpointOracleSID;
    }

    /**
     * @return sourceEndpointOwnerID
     */
    public String getSourceEndpointOwnerID() {
        return this.sourceEndpointOwnerID;
    }

    /**
     * @return sourceEndpointPassword
     */
    public String getSourceEndpointPassword() {
        return this.sourceEndpointPassword;
    }

    /**
     * @return sourceEndpointPort
     */
    public String getSourceEndpointPort() {
        return this.sourceEndpointPort;
    }

    /**
     * @return sourceEndpointRegion
     */
    public String getSourceEndpointRegion() {
        return this.sourceEndpointRegion;
    }

    /**
     * @return sourceEndpointRole
     */
    public String getSourceEndpointRole() {
        return this.sourceEndpointRole;
    }

    /**
     * @return sourceEndpointUserName
     */
    public String getSourceEndpointUserName() {
        return this.sourceEndpointUserName;
    }

    /**
     * @return srcCaCertificateOssUrl
     */
    public String getSrcCaCertificateOssUrl() {
        return this.srcCaCertificateOssUrl;
    }

    /**
     * @return srcCaCertificatePassword
     */
    public String getSrcCaCertificatePassword() {
        return this.srcCaCertificatePassword;
    }

    /**
     * @return srcClientCertOssUrl
     */
    public String getSrcClientCertOssUrl() {
        return this.srcClientCertOssUrl;
    }

    /**
     * @return srcClientKeyOssUrl
     */
    public String getSrcClientKeyOssUrl() {
        return this.srcClientKeyOssUrl;
    }

    /**
     * @return srcClientPassword
     */
    public String getSrcClientPassword() {
        return this.srcClientPassword;
    }

    /**
     * @return subscriptionDataTypeDDL
     */
    public Boolean getSubscriptionDataTypeDDL() {
        return this.subscriptionDataTypeDDL;
    }

    /**
     * @return subscriptionDataTypeDML
     */
    public Boolean getSubscriptionDataTypeDML() {
        return this.subscriptionDataTypeDML;
    }

    /**
     * @return subscriptionInstanceNetworkType
     */
    public String getSubscriptionInstanceNetworkType() {
        return this.subscriptionInstanceNetworkType;
    }

    /**
     * @return subscriptionInstanceVPCId
     */
    public String getSubscriptionInstanceVPCId() {
        return this.subscriptionInstanceVPCId;
    }

    /**
     * @return subscriptionInstanceVSwitchId
     */
    public String getSubscriptionInstanceVSwitchId() {
        return this.subscriptionInstanceVSwitchId;
    }

    public static final class Builder extends Request.Builder<ConfigureSubscriptionRequest, Builder> {
        private String checkpoint; 
        private String dbList; 
        private String dedicatedClusterId; 
        private Boolean delayNotice; 
        private String delayPhone; 
        private Long delayRuleTime; 
        private String dtsBisLabel; 
        private String dtsInstanceId; 
        private String dtsJobId; 
        private String dtsJobName; 
        private Boolean errorNotice; 
        private String errorPhone; 
        private Double maxDu; 
        private Double minDu; 
        private String regionId; 
        private String reserve; 
        private String resourceGroupId; 
        private String sourceEndpointDatabaseName; 
        private String sourceEndpointEngineName; 
        private String sourceEndpointIP; 
        private String sourceEndpointInstanceID; 
        private String sourceEndpointInstanceType; 
        private String sourceEndpointOracleSID; 
        private String sourceEndpointOwnerID; 
        private String sourceEndpointPassword; 
        private String sourceEndpointPort; 
        private String sourceEndpointRegion; 
        private String sourceEndpointRole; 
        private String sourceEndpointUserName; 
        private String srcCaCertificateOssUrl; 
        private String srcCaCertificatePassword; 
        private String srcClientCertOssUrl; 
        private String srcClientKeyOssUrl; 
        private String srcClientPassword; 
        private Boolean subscriptionDataTypeDDL; 
        private Boolean subscriptionDataTypeDML; 
        private String subscriptionInstanceNetworkType; 
        private String subscriptionInstanceVPCId; 
        private String subscriptionInstanceVSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(ConfigureSubscriptionRequest request) {
            super(request);
            this.checkpoint = request.checkpoint;
            this.dbList = request.dbList;
            this.dedicatedClusterId = request.dedicatedClusterId;
            this.delayNotice = request.delayNotice;
            this.delayPhone = request.delayPhone;
            this.delayRuleTime = request.delayRuleTime;
            this.dtsBisLabel = request.dtsBisLabel;
            this.dtsInstanceId = request.dtsInstanceId;
            this.dtsJobId = request.dtsJobId;
            this.dtsJobName = request.dtsJobName;
            this.errorNotice = request.errorNotice;
            this.errorPhone = request.errorPhone;
            this.maxDu = request.maxDu;
            this.minDu = request.minDu;
            this.regionId = request.regionId;
            this.reserve = request.reserve;
            this.resourceGroupId = request.resourceGroupId;
            this.sourceEndpointDatabaseName = request.sourceEndpointDatabaseName;
            this.sourceEndpointEngineName = request.sourceEndpointEngineName;
            this.sourceEndpointIP = request.sourceEndpointIP;
            this.sourceEndpointInstanceID = request.sourceEndpointInstanceID;
            this.sourceEndpointInstanceType = request.sourceEndpointInstanceType;
            this.sourceEndpointOracleSID = request.sourceEndpointOracleSID;
            this.sourceEndpointOwnerID = request.sourceEndpointOwnerID;
            this.sourceEndpointPassword = request.sourceEndpointPassword;
            this.sourceEndpointPort = request.sourceEndpointPort;
            this.sourceEndpointRegion = request.sourceEndpointRegion;
            this.sourceEndpointRole = request.sourceEndpointRole;
            this.sourceEndpointUserName = request.sourceEndpointUserName;
            this.srcCaCertificateOssUrl = request.srcCaCertificateOssUrl;
            this.srcCaCertificatePassword = request.srcCaCertificatePassword;
            this.srcClientCertOssUrl = request.srcClientCertOssUrl;
            this.srcClientKeyOssUrl = request.srcClientKeyOssUrl;
            this.srcClientPassword = request.srcClientPassword;
            this.subscriptionDataTypeDDL = request.subscriptionDataTypeDDL;
            this.subscriptionDataTypeDML = request.subscriptionDataTypeDML;
            this.subscriptionInstanceNetworkType = request.subscriptionInstanceNetworkType;
            this.subscriptionInstanceVPCId = request.subscriptionInstanceVPCId;
            this.subscriptionInstanceVSwitchId = request.subscriptionInstanceVSwitchId;
        } 

        /**
         * The UNIX timestamp that represents the start time of change tracking. Unit: seconds.
         * <p>
         * 
         * >  You can use a search engine to obtain a UNIX timestamp converter.
         */
        public Builder checkpoint(String checkpoint) {
            this.putQueryParameter("Checkpoint", checkpoint);
            this.checkpoint = checkpoint;
            return this;
        }

        /**
         * The objects for which you want to track data changes. The value must be a JSON string. For more information, see [Objects of DTS tasks](~~209545~~).
         */
        public Builder dbList(String dbList) {
            this.putQueryParameter("DbList", dbList);
            this.dbList = dbList;
            return this;
        }

        /**
         * The ID of the DTS dedicated cluster on which the change tracking task is scheduled to run.
         */
        public Builder dedicatedClusterId(String dedicatedClusterId) {
            this.putQueryParameter("DedicatedClusterId", dedicatedClusterId);
            this.dedicatedClusterId = dedicatedClusterId;
            return this;
        }

        /**
         * Specifies whether to monitor the task latency. Valid values:
         * <p>
         * 
         * *   **true**: monitors the task latency.
         * *   **false**: does not monitor the task latency.
         */
        public Builder delayNotice(Boolean delayNotice) {
            this.putQueryParameter("DelayNotice", delayNotice);
            this.delayNotice = delayNotice;
            return this;
        }

        /**
         * The mobile numbers to which latency-related alerts are sent. Separate multiple mobile numbers with commas (,).
         * <p>
         * 
         * > 
         * *   This parameter is available only for users of the China site (aliyun.com). Only mobile numbers in the Chinese mainland are supported. You can specify up to 10 mobile numbers.
         * *   Users of the international site (alibabacloud.com) cannot receive alerts by using mobile phones, but can [configure alert rules for DTS tasks in the CloudMonitor console](~~175876~~).
         */
        public Builder delayPhone(String delayPhone) {
            this.putQueryParameter("DelayPhone", delayPhone);
            this.delayPhone = delayPhone;
            return this;
        }

        /**
         * The threshold for triggering latency-related alerts. Unit: seconds. The value must be an integer. You can set the threshold based on your business needs. To prevent jitters caused by network and database overloads, we recommend that you set the threshold to more than 10 seconds.
         * <p>
         * 
         * >  If the **DelayNotice** parameter is set to **true**, this parameter is required.
         */
        public Builder delayRuleTime(Long delayRuleTime) {
            this.putQueryParameter("DelayRuleTime", delayRuleTime);
            this.delayRuleTime = delayRuleTime;
            return this;
        }

        /**
         * DtsBisLabel.
         */
        public Builder dtsBisLabel(String dtsBisLabel) {
            this.putQueryParameter("DtsBisLabel", dtsBisLabel);
            this.dtsBisLabel = dtsBisLabel;
            return this;
        }

        /**
         * The ID of the change tracking instance. You can call the [DescribeDtsJobs](~~209702~~) operation to query the instance ID.
         */
        public Builder dtsInstanceId(String dtsInstanceId) {
            this.putQueryParameter("DtsInstanceId", dtsInstanceId);
            this.dtsInstanceId = dtsInstanceId;
            return this;
        }

        /**
         * The ID of the change tracking task. You can call the [DescribeDtsJobs](~~209702~~) operation to query the task ID.
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * The name of the change tracking task.
         * <p>
         * 
         * >  We recommend that you specify a descriptive name for easy identification. You do not need to use a unique name.
         */
        public Builder dtsJobName(String dtsJobName) {
            this.putQueryParameter("DtsJobName", dtsJobName);
            this.dtsJobName = dtsJobName;
            return this;
        }

        /**
         * Specifies whether to monitor the task status. Valid values:
         * <p>
         * 
         * *   **true**: monitors the task status.
         * *   **false**: does not monitor the task status.
         */
        public Builder errorNotice(Boolean errorNotice) {
            this.putQueryParameter("ErrorNotice", errorNotice);
            this.errorNotice = errorNotice;
            return this;
        }

        /**
         * The mobile numbers to which status-related alerts are sent. Separate multiple mobile numbers with commas (,).
         * <p>
         * 
         * > 
         * *   This parameter is available only for users of the China site (aliyun.com). Only mobile numbers in the Chinese mainland are supported. You can specify up to 10 mobile numbers.
         * *   Users of the international site (alibabacloud.com) cannot receive alerts by using mobile phones, but can [configure alert rules for DTS tasks in the CloudMonitor console](~~175876~~).
         */
        public Builder errorPhone(String errorPhone) {
            this.putQueryParameter("ErrorPhone", errorPhone);
            this.errorPhone = errorPhone;
            return this;
        }

        /**
         * MaxDu.
         */
        public Builder maxDu(Double maxDu) {
            this.putQueryParameter("MaxDu", maxDu);
            this.maxDu = maxDu;
            return this;
        }

        /**
         * MinDu.
         */
        public Builder minDu(Double minDu) {
            this.putQueryParameter("MinDu", minDu);
            this.minDu = minDu;
            return this;
        }

        /**
         * The ID of the region in which the Data Transmission Service (DTS) instance resides. For more information, see [List of supported regions](~~141033~~).
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The reserved parameter of DTS. The value must be a JSON string. You can specify this parameter to add more configurations of the source or destination database to the DTS task. For example, you can specify the data storage format of the destination Kafka database and the ID of the CEN instance. For more information, see [MigrationReserved](~~176470~~).
         */
        public Builder reserve(String reserve) {
            this.putQueryParameter("Reserve", reserve);
            this.reserve = reserve;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The name of the source database.
         */
        public Builder sourceEndpointDatabaseName(String sourceEndpointDatabaseName) {
            this.putQueryParameter("SourceEndpointDatabaseName", sourceEndpointDatabaseName);
            this.sourceEndpointDatabaseName = sourceEndpointDatabaseName;
            return this;
        }

        /**
         * The engine of the source database. Valid values: **MySQL**, **PostgreSQL**, and **Oracle**.
         * <p>
         * 
         * >  If the source database is a self-managed database, you must specify this parameter.
         */
        public Builder sourceEndpointEngineName(String sourceEndpointEngineName) {
            this.putQueryParameter("SourceEndpointEngineName", sourceEndpointEngineName);
            this.sourceEndpointEngineName = sourceEndpointEngineName;
            return this;
        }

        /**
         * The endpoint of the source database.
         * <p>
         * 
         * >  This parameter is required only when the source database is a self-managed database.
         */
        public Builder sourceEndpointIP(String sourceEndpointIP) {
            this.putQueryParameter("SourceEndpointIP", sourceEndpointIP);
            this.sourceEndpointIP = sourceEndpointIP;
            return this;
        }

        /**
         * The ID of the source database.
         * <p>
         * 
         * >  This parameter is required only when the source database is an ApsaraDB RDS for MySQL instance, a PolarDB-X 1.0 instance, or a PolarDB for MySQL cluster.
         */
        public Builder sourceEndpointInstanceID(String sourceEndpointInstanceID) {
            this.putQueryParameter("SourceEndpointInstanceID", sourceEndpointInstanceID);
            this.sourceEndpointInstanceID = sourceEndpointInstanceID;
            return this;
        }

        /**
         * The type of the source database. Valid values:
         * <p>
         * 
         * *   **RDS**: ApsaraDB RDS for MySQL instance
         * *   **PolarDB**: PolarDB for MySQL cluster
         * *   **DRDS**: PolarDB-X 1.0 instance
         * *   **LocalInstance**: self-managed database with a public IP address
         * *   **ECS**: self-managed database hosted on an Elastic Compute Service (ECS) instance
         * *   **Express**: self-managed database connected over Express Connect
         * *   **CEN**: self-managed database connected over Cloud Enterprise Network (CEN)
         * *   **dg**: self-managed database connected over Database Gateway
         */
        public Builder sourceEndpointInstanceType(String sourceEndpointInstanceType) {
            this.putQueryParameter("SourceEndpointInstanceType", sourceEndpointInstanceType);
            this.sourceEndpointInstanceType = sourceEndpointInstanceType;
            return this;
        }

        /**
         * The system ID (SID) of the Oracle database.
         * <p>
         * 
         * >  This parameter is required only when the source database is a self-managed Oracle database and is not deployed in the Real Application Clusters (RAC) architecture.
         */
        public Builder sourceEndpointOracleSID(String sourceEndpointOracleSID) {
            this.putQueryParameter("SourceEndpointOracleSID", sourceEndpointOracleSID);
            this.sourceEndpointOracleSID = sourceEndpointOracleSID;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account to which the source database belongs.
         * <p>
         * 
         * >  This parameter is required only when you track data changes across different Alibaba Cloud accounts.
         */
        public Builder sourceEndpointOwnerID(String sourceEndpointOwnerID) {
            this.putQueryParameter("SourceEndpointOwnerID", sourceEndpointOwnerID);
            this.sourceEndpointOwnerID = sourceEndpointOwnerID;
            return this;
        }

        /**
         * The password of the account that is used to connect to the source database.
         */
        public Builder sourceEndpointPassword(String sourceEndpointPassword) {
            this.putQueryParameter("SourceEndpointPassword", sourceEndpointPassword);
            this.sourceEndpointPassword = sourceEndpointPassword;
            return this;
        }

        /**
         * The service port number of the source database.
         * <p>
         * 
         * >  This parameter is required only when the source database is a self-managed database.
         */
        public Builder sourceEndpointPort(String sourceEndpointPort) {
            this.putQueryParameter("SourceEndpointPort", sourceEndpointPort);
            this.sourceEndpointPort = sourceEndpointPort;
            return this;
        }

        /**
         * The ID of the region in which the source database resides. For more information, see [List of supported regions](~~141033~~).
         * <p>
         * 
         * >  If the source database is a self-managed database with a public IP address, you can set the value of this parameter to **cn-hangzhou** or the ID of the region that is closest to the region in which the self-managed database resides.
         */
        public Builder sourceEndpointRegion(String sourceEndpointRegion) {
            this.putQueryParameter("SourceEndpointRegion", sourceEndpointRegion);
            this.sourceEndpointRegion = sourceEndpointRegion;
            return this;
        }

        /**
         * The RAM role that is authorized to access the source database. This parameter is required if the source database does not belong to the Alibaba Cloud account that you use to configure the change tracking task. In this case, you must authorize the Alibaba Cloud account to access the source database by using a RAM role.
         * <p>
         * 
         * >  For more information about the permissions that are required for the RAM role and how to grant the permissions to the RAM role, see [Configure RAM authorization for cross-account data migration and synchronization](~~48468~~).
         */
        public Builder sourceEndpointRole(String sourceEndpointRole) {
            this.putQueryParameter("SourceEndpointRole", sourceEndpointRole);
            this.sourceEndpointRole = sourceEndpointRole;
            return this;
        }

        /**
         * The username of the account that is used to connect to the source database.
         * <p>
         * 
         * >  The permissions that are required for the database account vary with the change tracking scenario. For more information, see [Prepare the source database account for change tracking](~~212653~~).
         */
        public Builder sourceEndpointUserName(String sourceEndpointUserName) {
            this.putQueryParameter("SourceEndpointUserName", sourceEndpointUserName);
            this.sourceEndpointUserName = sourceEndpointUserName;
            return this;
        }

        /**
         * SrcCaCertificateOssUrl.
         */
        public Builder srcCaCertificateOssUrl(String srcCaCertificateOssUrl) {
            this.putQueryParameter("SrcCaCertificateOssUrl", srcCaCertificateOssUrl);
            this.srcCaCertificateOssUrl = srcCaCertificateOssUrl;
            return this;
        }

        /**
         * SrcCaCertificatePassword.
         */
        public Builder srcCaCertificatePassword(String srcCaCertificatePassword) {
            this.putQueryParameter("SrcCaCertificatePassword", srcCaCertificatePassword);
            this.srcCaCertificatePassword = srcCaCertificatePassword;
            return this;
        }

        /**
         * SrcClientCertOssUrl.
         */
        public Builder srcClientCertOssUrl(String srcClientCertOssUrl) {
            this.putQueryParameter("SrcClientCertOssUrl", srcClientCertOssUrl);
            this.srcClientCertOssUrl = srcClientCertOssUrl;
            return this;
        }

        /**
         * SrcClientKeyOssUrl.
         */
        public Builder srcClientKeyOssUrl(String srcClientKeyOssUrl) {
            this.putQueryParameter("SrcClientKeyOssUrl", srcClientKeyOssUrl);
            this.srcClientKeyOssUrl = srcClientKeyOssUrl;
            return this;
        }

        /**
         * SrcClientPassword.
         */
        public Builder srcClientPassword(String srcClientPassword) {
            this.putQueryParameter("SrcClientPassword", srcClientPassword);
            this.srcClientPassword = srcClientPassword;
            return this;
        }

        /**
         * Specifies whether to track DDL statements. Default value: true. Valid values:
         * <p>
         * 
         * *   **true**: tracks DDL statements.
         * *   **false**: does not track DDL statements.
         */
        public Builder subscriptionDataTypeDDL(Boolean subscriptionDataTypeDDL) {
            this.putQueryParameter("SubscriptionDataTypeDDL", subscriptionDataTypeDDL);
            this.subscriptionDataTypeDDL = subscriptionDataTypeDDL;
            return this;
        }

        /**
         * Specifies whether to track DML statements. Default value: true. Valid values:
         * <p>
         * 
         * *   **true**: tracks DML statements.
         * *   **false**: does not track DML statements.
         */
        public Builder subscriptionDataTypeDML(Boolean subscriptionDataTypeDML) {
            this.putQueryParameter("SubscriptionDataTypeDML", subscriptionDataTypeDML);
            this.subscriptionDataTypeDML = subscriptionDataTypeDML;
            return this;
        }

        /**
         * The network type of the change tracking task. Set the value to **vpc**. A value of vpc indicates the Virtual Private Cloud (VPC) network type.
         * <p>
         * 
         * > 
         * *   To use the new version of the change tracking feature, you must specify the SubscriptionInstanceNetworkType parameter. You must also specify the **SubscriptionInstanceVPCId** and **SubscriptionInstanceVSwitchID** parameters. If you do not specify the SubscriptionInstanceNetworkType parameter, the previous version of the change tracking feature is used.
         * *   The previous version of the change tracking feature supports self-managed MySQL databases, ApsaraDB RDS for MySQL instances, and PolarDB-X 1.0 instances. The new version of the change tracking feature supports self-managed MySQL databases, ApsaraDB RDS for MySQL instances, PolarDB for MySQL clusters, and Oracle databases.
         */
        public Builder subscriptionInstanceNetworkType(String subscriptionInstanceNetworkType) {
            this.putQueryParameter("SubscriptionInstanceNetworkType", subscriptionInstanceNetworkType);
            this.subscriptionInstanceNetworkType = subscriptionInstanceNetworkType;
            return this;
        }

        /**
         * The ID of the VPC in which the change tracking instance is deployed.
         * <p>
         * 
         * >  This parameter is required only when the **SubscriptionInstanceNetworkType** parameter is set to **vpc**.
         */
        public Builder subscriptionInstanceVPCId(String subscriptionInstanceVPCId) {
            this.putQueryParameter("SubscriptionInstanceVPCId", subscriptionInstanceVPCId);
            this.subscriptionInstanceVPCId = subscriptionInstanceVPCId;
            return this;
        }

        /**
         * The ID of the vSwitch in the specified VPC.
         * <p>
         * 
         * >  This parameter is required only when the **SubscriptionInstanceNetworkType** parameter is set to **vpc**.
         */
        public Builder subscriptionInstanceVSwitchId(String subscriptionInstanceVSwitchId) {
            this.putQueryParameter("SubscriptionInstanceVSwitchId", subscriptionInstanceVSwitchId);
            this.subscriptionInstanceVSwitchId = subscriptionInstanceVSwitchId;
            return this;
        }

        @Override
        public ConfigureSubscriptionRequest build() {
            return new ConfigureSubscriptionRequest(this);
        } 

    } 

}
