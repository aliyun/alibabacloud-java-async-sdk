// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
         * <p>The start time of change tracking, in the format of a UNIX timestamp. Unit: seconds.</p>
         * <blockquote>
         * <p>You can use a search engine to find a UNIX timestamp converter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1616902385</p>
         */
        public Builder checkpoint(String checkpoint) {
            this.putQueryParameter("Checkpoint", checkpoint);
            this.checkpoint = checkpoint;
            return this;
        }

        /**
         * <p>The objects to be tracked, in JSON format. For more information, see <a href="https://help.aliyun.com/document_detail/209545.html">Objects of DTS tasks</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;dtstest&quot;:{&quot;name&quot;:&quot;dtstest&quot;,&quot;all&quot;:true}}</p>
         */
        public Builder dbList(String dbList) {
            this.putQueryParameter("DbList", dbList);
            this.dbList = dbList;
            return this;
        }

        /**
         * <p>The ID of the DTS dedicated cluster. This parameter is used to schedule the change tracking task to the specified DTS dedicated cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>dtscluster_atyl3b5214uk***</p>
         */
        public Builder dedicatedClusterId(String dedicatedClusterId) {
            this.putQueryParameter("DedicatedClusterId", dedicatedClusterId);
            this.dedicatedClusterId = dedicatedClusterId;
            return this;
        }

        /**
         * <p>Specifies whether to monitor the latency status. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: monitors the latency status.</li>
         * <li><strong>false</strong>: does not monitor the latency status.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder delayNotice(Boolean delayNotice) {
            this.putQueryParameter("DelayNotice", delayNotice);
            this.delayNotice = delayNotice;
            return this;
        }

        /**
         * <p>The mobile phone numbers for receiving latency alerts. Separate multiple phone numbers with commas (,).</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is supported only on the China site (aliyun.com). Only Chinese mainland phone numbers are supported, and you can specify up to 10 phone numbers.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>The China site (Chinese mainland) does not support phone alerts. You can only <a href="https://help.aliyun.com/document_detail/175876.html">configure alert rules for DTS tasks in CloudMonitor</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1361234****,1371234****</p>
         */
        public Builder delayPhone(String delayPhone) {
            this.putQueryParameter("DelayPhone", delayPhone);
            this.delayPhone = delayPhone;
            return this;
        }

        /**
         * <p>The threshold for triggering latency alerts. Unit: seconds. The value must be an integer. Set the threshold based on your business requirements. To avoid alert fluctuations caused by network conditions or database loads, set the threshold to 10 seconds or more.</p>
         * <blockquote>
         * <p>This parameter is required when <strong>DelayNotice</strong> is set to <strong>true</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder delayRuleTime(Long delayRuleTime) {
            this.putQueryParameter("DelayRuleTime", delayRuleTime);
            this.delayRuleTime = delayRuleTime;
            return this;
        }

        /**
         * <p>The environment tag of the DTS instance. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: normal</li>
         * <li><strong>online</strong>: online.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder dtsBisLabel(String dtsBisLabel) {
            this.putQueryParameter("DtsBisLabel", dtsBisLabel);
            this.dtsBisLabel = dtsBisLabel;
            return this;
        }

        /**
         * <p>The ID of the change tracking instance. You can call <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> to query the instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dtsy0zz3t13h7d****</p>
         */
        public Builder dtsInstanceId(String dtsInstanceId) {
            this.putQueryParameter("DtsInstanceId", dtsInstanceId);
            this.dtsInstanceId = dtsInstanceId;
            return this;
        }

        /**
         * <p>The ID of the change tracking task. You can call <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> to query the task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>y0zz3t13h7d****</p>
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * <p>The name of the change tracking task.</p>
         * <blockquote>
         * <p>Specify a descriptive name that makes it easy to identify the task. The name does not need to be unique.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL订阅</p>
         */
        public Builder dtsJobName(String dtsJobName) {
            this.putQueryParameter("DtsJobName", dtsJobName);
            this.dtsJobName = dtsJobName;
            return this;
        }

        /**
         * <p>Specifies whether to monitor the error status. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: monitors the error status.</li>
         * <li><strong>false</strong>: does not monitor the error status.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder errorNotice(Boolean errorNotice) {
            this.putQueryParameter("ErrorNotice", errorNotice);
            this.errorNotice = errorNotice;
            return this;
        }

        /**
         * <p>The mobile phone numbers for receiving error alerts. Separate multiple phone numbers with commas (,).</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is supported only on the China site (aliyun.com). Only Chinese mainland phone numbers are supported, and you can specify up to 10 phone numbers.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>The China site (Chinese mainland) does not support phone alerts. You can only <a href="https://help.aliyun.com/document_detail/175876.html">configure alert rules for DTS tasks in CloudMonitor</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1361234****,1371234****</p>
         */
        public Builder errorPhone(String errorPhone) {
            this.putQueryParameter("ErrorPhone", errorPhone);
            this.errorPhone = errorPhone;
            return this;
        }

        /**
         * <p>The maximum number of DUs for a serverless instance. Valid values: 2, 4, 8, and 16.
         * &lt;props=&quot;intl&quot;&gt;</p>
         * <blockquote>
         * <p>This feature is currently not supported. Do not specify this parameter..</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        public Builder maxDu(Double maxDu) {
            this.putQueryParameter("MaxDu", maxDu);
            this.maxDu = maxDu;
            return this;
        }

        /**
         * <p>The minimum number of DTS Units (DUs) for a serverless instance. Valid values: 1, 2, 4, 8, and 16.
         * &lt;props=&quot;intl&quot;&gt;</p>
         * <blockquote>
         * <p>This feature is currently not supported. Do not specify this parameter..</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder minDu(Double minDu) {
            this.putQueryParameter("MinDu", minDu);
            this.minDu = minDu;
            return this;
        }

        /**
         * <p>The region in which the change tracking instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The reserved parameter of DTS, in JSON format. You can specify this parameter to add information about the source and destination databases, such as the data storage format of the destination Kafka database or the CEN instance ID. For more information, see the <a href="https://help.aliyun.com/document_detail/176470.html">Reserve metric description</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{      &quot;srcInstanceId&quot;: &quot;cen-9kqshqum*******&quot;  }</p>
         */
        public Builder reserve(String reserve) {
            this.putQueryParameter("Reserve", reserve);
            this.reserve = reserve;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzawhxxc****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The name of the database to be tracked.</p>
         * 
         * <strong>example:</strong>
         * <p>dtstestdata</p>
         */
        public Builder sourceEndpointDatabaseName(String sourceEndpointDatabaseName) {
            this.putQueryParameter("SourceEndpointDatabaseName", sourceEndpointDatabaseName);
            this.sourceEndpointDatabaseName = sourceEndpointDatabaseName;
            return this;
        }

        /**
         * <p>The engine type of the source database. Valid values: <strong>MySQL</strong>, <strong>PostgreSQL</strong>, and <strong>Oracle</strong>.</p>
         * <blockquote>
         * <p>This parameter is required if the source database is a self-managed database.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>PostgreSQL</p>
         */
        public Builder sourceEndpointEngineName(String sourceEndpointEngineName) {
            this.putQueryParameter("SourceEndpointEngineName", sourceEndpointEngineName);
            this.sourceEndpointEngineName = sourceEndpointEngineName;
            return this;
        }

        /**
         * <p>The endpoint of the source database.</p>
         * <blockquote>
         * <p>This parameter is available and required only when the source database is a self-managed database.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>172.16.8*.***</p>
         */
        public Builder sourceEndpointIP(String sourceEndpointIP) {
            this.putQueryParameter("SourceEndpointIP", sourceEndpointIP);
            this.sourceEndpointIP = sourceEndpointIP;
            return this;
        }

        /**
         * <p>The instance ID of the source instance.</p>
         * <blockquote>
         * <p>This parameter is active and required only when the source database is an ApsaraDB RDS for MySQL instance, a PolarDB-X 1.0 instance, or a PolarDB for MySQL cluster.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1zc3iyqe3qw****</p>
         */
        public Builder sourceEndpointInstanceID(String sourceEndpointInstanceID) {
            this.putQueryParameter("SourceEndpointInstanceID", sourceEndpointInstanceID);
            this.sourceEndpointInstanceID = sourceEndpointInstanceID;
            return this;
        }

        /**
         * <p>The instance type of the source database. Valid values:</p>
         * <ul>
         * <li><strong>RDS</strong>: ApsaraDB RDS instance.</li>
         * <li><strong>PolarDB</strong>: PolarDB for MySQL cluster.</li>
         * <li><strong>DRDS</strong>: PolarDB-X 1.0 instance.</li>
         * <li><strong>LocalInstance</strong>: self-managed database with a public IP address.</li>
         * <li><strong>ECS</strong>: self-managed database hosted on an ECS instance.</li>
         * <li><strong>Express</strong>: self-managed database connected over Express Connect.</li>
         * <li><strong>CEN</strong>: self-managed database connected over Cloud Enterprise Network (CEN).</li>
         * <li><strong>dg</strong>: self-managed database connected over Database Gateway.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        public Builder sourceEndpointInstanceType(String sourceEndpointInstanceType) {
            this.putQueryParameter("SourceEndpointInstanceType", sourceEndpointInstanceType);
            this.sourceEndpointInstanceType = sourceEndpointInstanceType;
            return this;
        }

        /**
         * <p>The SID of the Oracle database.</p>
         * <blockquote>
         * <p>This parameter is available and required only when the source database is a self-managed Oracle database that is not a Real Application Cluster (RAC) instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testsid</p>
         */
        public Builder sourceEndpointOracleSID(String sourceEndpointOracleSID) {
            this.putQueryParameter("SourceEndpointOracleSID", sourceEndpointOracleSID);
            this.sourceEndpointOracleSID = sourceEndpointOracleSID;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account ID of the account to which the source instance belongs.</p>
         * <blockquote>
         * <p>This parameter is active and required only when you configure cross-Alibaba Cloud account change tracking. You must subscribe to the task.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>140692647406****</p>
         */
        public Builder sourceEndpointOwnerID(String sourceEndpointOwnerID) {
            this.putQueryParameter("SourceEndpointOwnerID", sourceEndpointOwnerID);
            this.sourceEndpointOwnerID = sourceEndpointOwnerID;
            return this;
        }

        /**
         * <p>The password of the database account for the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Test123456</p>
         */
        public Builder sourceEndpointPassword(String sourceEndpointPassword) {
            this.putQueryParameter("SourceEndpointPassword", sourceEndpointPassword);
            this.sourceEndpointPassword = sourceEndpointPassword;
            return this;
        }

        /**
         * <p>The service port of the source database.</p>
         * <blockquote>
         * <p>This parameter is available and required only when the source database is a self-managed database.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        public Builder sourceEndpointPort(String sourceEndpointPort) {
            this.putQueryParameter("SourceEndpointPort", sourceEndpointPort);
            this.sourceEndpointPort = sourceEndpointPort;
            return this;
        }

        /**
         * <p>The region of the source instance. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
         * <blockquote>
         * <p>If the source instance is a self-managed database with a public IP address, you can set this parameter to <strong>cn-hangzhou</strong> or the region ID closest to the self-managed database.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder sourceEndpointRegion(String sourceEndpointRegion) {
            this.putQueryParameter("SourceEndpointRegion", sourceEndpointRegion);
            this.sourceEndpointRegion = sourceEndpointRegion;
            return this;
        }

        /**
         * <p>The authorized role of the source instance. If the source instance and the change tracking task belong to different Alibaba Cloud accounts, specify this parameter to allow the Alibaba Cloud account that owns the change tracking task to access the source instance.</p>
         * <blockquote>
         * <p>For more information about the permissions and authorization methods required for the role, see <a href="https://help.aliyun.com/document_detail/48468.html">Configure RAM authorization for cross-account data migration or synchronization</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ram-for-dts</p>
         */
        public Builder sourceEndpointRole(String sourceEndpointRole) {
            this.putQueryParameter("SourceEndpointRole", sourceEndpointRole);
            this.sourceEndpointRole = sourceEndpointRole;
            return this;
        }

        /**
         * <p>The database account of the source instance.</p>
         * <blockquote>
         * <p>The permissions required for change tracking vary depending on the database type. For more information, see the account permissions section in <a href="https://help.aliyun.com/document_detail/212653.html">Prepare database accounts for change tracking</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>dtstest</p>
         */
        public Builder sourceEndpointUserName(String sourceEndpointUserName) {
            this.putQueryParameter("SourceEndpointUserName", sourceEndpointUserName);
            this.sourceEndpointUserName = sourceEndpointUserName;
            return this;
        }

        /**
         * <p>The path of the CA certificate when the source database uses an SSL connection.</p>
         * <blockquote>
         * <p>This feature is currently not supported. Do not specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder srcCaCertificateOssUrl(String srcCaCertificateOssUrl) {
            this.putQueryParameter("SrcCaCertificateOssUrl", srcCaCertificateOssUrl);
            this.srcCaCertificateOssUrl = srcCaCertificateOssUrl;
            return this;
        }

        /**
         * <p>The key of the CA certificate when the source database uses an SSL connection.</p>
         * <blockquote>
         * <p>This feature is currently not supported. Do not specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder srcCaCertificatePassword(String srcCaCertificatePassword) {
            this.putQueryParameter("SrcCaCertificatePassword", srcCaCertificatePassword);
            this.srcCaCertificatePassword = srcCaCertificatePassword;
            return this;
        }

        /**
         * <p>The path of the client certificate when the source database uses an SSL connection.</p>
         * <blockquote>
         * <p>This feature is currently not supported. Do not specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder srcClientCertOssUrl(String srcClientCertOssUrl) {
            this.putQueryParameter("SrcClientCertOssUrl", srcClientCertOssUrl);
            this.srcClientCertOssUrl = srcClientCertOssUrl;
            return this;
        }

        /**
         * <p>The path of the client certificate private key when the source database uses an SSL connection.</p>
         * <blockquote>
         * <p>This feature is currently not supported. Do not specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder srcClientKeyOssUrl(String srcClientKeyOssUrl) {
            this.putQueryParameter("SrcClientKeyOssUrl", srcClientKeyOssUrl);
            this.srcClientKeyOssUrl = srcClientKeyOssUrl;
            return this;
        }

        /**
         * <p>The password of the client certificate private key when the source database uses an SSL connection.</p>
         * <blockquote>
         * <p>This feature is currently not supported. Do not specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder srcClientPassword(String srcClientPassword) {
            this.putQueryParameter("SrcClientPassword", srcClientPassword);
            this.srcClientPassword = srcClientPassword;
            return this;
        }

        /**
         * <p>Specifies whether to track DDL data. Valid values:</p>
         * <ul>
         * <li><strong>true</strong> (default): tracks DDL data.</li>
         * <li><strong>false</strong>: does not track DDL data.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder subscriptionDataTypeDDL(Boolean subscriptionDataTypeDDL) {
            this.putQueryParameter("SubscriptionDataTypeDDL", subscriptionDataTypeDDL);
            this.subscriptionDataTypeDDL = subscriptionDataTypeDDL;
            return this;
        }

        /**
         * <p>Specifies whether to track DML data. Valid values:</p>
         * <ul>
         * <li><strong>true</strong> (default): tracks DML data.</li>
         * <li><strong>false</strong>: does not track DML data.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder subscriptionDataTypeDML(Boolean subscriptionDataTypeDML) {
            this.putQueryParameter("SubscriptionDataTypeDML", subscriptionDataTypeDML);
            this.subscriptionDataTypeDML = subscriptionDataTypeDML;
            return this;
        }

        /**
         * <p>The network type of the change tracking task. The only valid value is <strong>vpc</strong>, which indicates virtual private cloud (VPC).</p>
         * <blockquote>
         * <ul>
         * <li>If you specify this parameter, the change tracking task is defined as the new version. You must also correctly set the <strong>SubscriptionInstanceVPCId</strong> and <strong>SubscriptionInstanceVSwitchID</strong> parameters. If you do not specify this parameter, the change tracking task is defined as the legacy version.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>Legacy change tracking tasks support tracking data from self-managed MySQL, ApsaraDB RDS for MySQL, and PolarDB-X 1.0. New-version change tracking tasks support tracking data from self-managed MySQL, ApsaraDB RDS for MySQL, PolarDB for MySQL, and Oracle.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        public Builder subscriptionInstanceNetworkType(String subscriptionInstanceNetworkType) {
            this.putQueryParameter("SubscriptionInstanceNetworkType", subscriptionInstanceNetworkType);
            this.subscriptionInstanceNetworkType = subscriptionInstanceNetworkType;
            return this;
        }

        /**
         * <p>The VPC ID of the change tracking instance.</p>
         * <blockquote>
         * <p>This parameter is available and required only when <strong>SubscriptionInstanceNetworkType</strong> is set to <strong>vpc</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1vwnn14rqpyiczj****</p>
         */
        public Builder subscriptionInstanceVPCId(String subscriptionInstanceVPCId) {
            this.putQueryParameter("SubscriptionInstanceVPCId", subscriptionInstanceVPCId);
            this.subscriptionInstanceVPCId = subscriptionInstanceVPCId;
            return this;
        }

        /**
         * <p>The vSwitch ID of the change tracking instance.</p>
         * <blockquote>
         * <p>This parameter is available and required only when <strong>SubscriptionInstanceNetworkType</strong> is set to <strong>vpc</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp10df3mxae6lpmku****</p>
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
