// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDataLimitRequest} extends {@link RequestModel}
 *
 * <p>CreateDataLimitRequest</p>
 */
public class CreateDataLimitRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditStatus")
    private Integer auditStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoScan")
    private Integer autoScan;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertificatePermission")
    private String certificatePermission;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enable")
    private Integer enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineType")
    private String engineType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventStatus")
    private Integer eventStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeatureType")
    private Integer featureType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogStoreDay")
    private Integer logStoreDay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OcrStatus")
    private Integer ocrStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentId")
    private String parentId;

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
    @com.aliyun.core.annotation.NameInMap("ServiceRegionId")
    private String serviceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    private CreateDataLimitRequest(Builder builder) {
        super(builder);
        this.auditStatus = builder.auditStatus;
        this.autoScan = builder.autoScan;
        this.certificatePermission = builder.certificatePermission;
        this.enable = builder.enable;
        this.engineType = builder.engineType;
        this.eventStatus = builder.eventStatus;
        this.featureType = builder.featureType;
        this.lang = builder.lang;
        this.logStoreDay = builder.logStoreDay;
        this.ocrStatus = builder.ocrStatus;
        this.parentId = builder.parentId;
        this.password = builder.password;
        this.port = builder.port;
        this.resourceType = builder.resourceType;
        this.samplingSize = builder.samplingSize;
        this.serviceRegionId = builder.serviceRegionId;
        this.sourceIp = builder.sourceIp;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataLimitRequest create() {
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
     * @return certificatePermission
     */
    public String getCertificatePermission() {
        return this.certificatePermission;
    }

    /**
     * @return enable
     */
    public Integer getEnable() {
        return this.enable;
    }

    /**
     * @return engineType
     */
    public String getEngineType() {
        return this.engineType;
    }

    /**
     * @return eventStatus
     */
    public Integer getEventStatus() {
        return this.eventStatus;
    }

    /**
     * @return featureType
     */
    public Integer getFeatureType() {
        return this.featureType;
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
     * @return ocrStatus
     */
    public Integer getOcrStatus() {
        return this.ocrStatus;
    }

    /**
     * @return parentId
     */
    public String getParentId() {
        return this.parentId;
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
     * @return serviceRegionId
     */
    public String getServiceRegionId() {
        return this.serviceRegionId;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<CreateDataLimitRequest, Builder> {
        private Integer auditStatus; 
        private Integer autoScan; 
        private String certificatePermission; 
        private Integer enable; 
        private String engineType; 
        private Integer eventStatus; 
        private Integer featureType; 
        private String lang; 
        private Integer logStoreDay; 
        private Integer ocrStatus; 
        private String parentId; 
        private String password; 
        private Integer port; 
        private Integer resourceType; 
        private Integer samplingSize; 
        private String serviceRegionId; 
        private String sourceIp; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataLimitRequest request) {
            super(request);
            this.auditStatus = request.auditStatus;
            this.autoScan = request.autoScan;
            this.certificatePermission = request.certificatePermission;
            this.enable = request.enable;
            this.engineType = request.engineType;
            this.eventStatus = request.eventStatus;
            this.featureType = request.featureType;
            this.lang = request.lang;
            this.logStoreDay = request.logStoreDay;
            this.ocrStatus = request.ocrStatus;
            this.parentId = request.parentId;
            this.password = request.password;
            this.port = request.port;
            this.resourceType = request.resourceType;
            this.samplingSize = request.samplingSize;
            this.serviceRegionId = request.serviceRegionId;
            this.sourceIp = request.sourceIp;
            this.userName = request.userName;
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
         * The permissions. Valid values:
         * <p>
         * 
         * *   **ReadOnly**: read-only permissions
         * *   **ReadWrite**: read and write permissions
         */
        public Builder certificatePermission(String certificatePermission) {
            this.putQueryParameter("CertificatePermission", certificatePermission);
            this.certificatePermission = certificatePermission;
            return this;
        }

        /**
         * Specifies whether to enable sensitive data detection. Valid values:
         * <p>
         * 
         * *   **1**: yes
         * *   **0**: no
         * 
         * > If this is your first time to authorize DSC to access the data asset, the default value is 1. If this is not your first time to authorize DSC to access the data asset, the default value is the same as that used in the last authorization operation. Both 1 and 0 are possible.
         */
        public Builder enable(Integer enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
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
         * Specifies whether to enable anomalous event detection. Valid values:
         * <p>
         * 
         * *   **0**: no
         * *   **1**: yes (default)
         */
        public Builder eventStatus(Integer eventStatus) {
            this.putQueryParameter("EventStatus", eventStatus);
            this.eventStatus = eventStatus;
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
         * The language of the content within the request and response. Default value: **zh_cn**. Valid values:
         * <p>
         * 
         * *   **zh_cn**: Chinese
         * *   **en_us**: English
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
         * Specifies whether to enable optical character recognition (OCR). Valid values:
         * <p>
         * 
         * *   **1**: yes
         * *   **0**: no
         */
        public Builder ocrStatus(Integer ocrStatus) {
            this.putQueryParameter("OcrStatus", ocrStatus);
            this.ocrStatus = ocrStatus;
            return this;
        }

        /**
         * The name of the data asset.
         */
        public Builder parentId(String parentId) {
            this.putQueryParameter("ParentId", parentId);
            this.parentId = parentId;
            return this;
        }

        /**
         * The password that is used to access the database.
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
         * The type of service to which the data asset belongs. Valid values:
         * <p>
         * 
         * *   **1** :MaxCompute
         * *   **2**: Object Storage Service (OSS)
         * *   **3**: AnalyticDB for MySQL
         * *   **4** :Tablestore
         * *   **5**: ApsaraDB RDS
         */
        public Builder resourceType(Integer resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * The number of sensitive data samples that are collected after sensitive data detection is enabled. Valid values:
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
         * The region in which the data asset resides. Valid values:
         * <p>
         * 
         * *   **cn-beijing**: China (Beijing).
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
         * This parameter is deprecated.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The username that is used to access the database.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public CreateDataLimitRequest build() {
            return new CreateDataLimitRequest(this);
        } 

    } 

}
