// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

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
    @com.aliyun.core.annotation.NameInMap("InstantlyScan")
    private Boolean instantlyScan;

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
        this.instantlyScan = builder.instantlyScan;
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
     * @return instantlyScan
     */
    public Boolean getInstantlyScan() {
        return this.instantlyScan;
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
        private Boolean instantlyScan; 
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
            this.instantlyScan = request.instantlyScan;
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
         * <p>The permissions. Valid values:</p>
         * <ul>
         * <li><strong>ReadOnly</strong>: read-only permissions</li>
         * <li><strong>ReadWrite</strong>: read and write permissions</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ReadOnly</p>
         */
        public Builder certificatePermission(String certificatePermission) {
            this.putQueryParameter("CertificatePermission", certificatePermission);
            this.certificatePermission = certificatePermission;
            return this;
        }

        /**
         * <p>Specifies whether to enable sensitive data detection. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: yes</li>
         * <li><strong>0</strong>: no</li>
         * </ul>
         * <blockquote>
         * <p>If this is your first time to authorize DSC to access the data asset, the default value is 1. If this is not your first time to authorize DSC to access the data asset, the default value is the same as that used in the last authorization operation. Both 1 and 0 are possible.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder enable(Integer enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
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
         * <p>Specifies whether to enable anomalous event detection. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: no</li>
         * <li><strong>1</strong>: yes (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder eventStatus(Integer eventStatus) {
            this.putQueryParameter("EventStatus", eventStatus);
            this.eventStatus = eventStatus;
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
         * InstantlyScan.
         */
        public Builder instantlyScan(Boolean instantlyScan) {
            this.putQueryParameter("InstantlyScan", instantlyScan);
            this.instantlyScan = instantlyScan;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh_cn</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh_cn</strong>: Chinese</li>
         * <li><strong>en_us</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh_cn</p>
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
         * <p>Specifies whether to enable optical character recognition (OCR). Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: yes</li>
         * <li><strong>0</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder ocrStatus(Integer ocrStatus) {
            this.putQueryParameter("OcrStatus", ocrStatus);
            this.ocrStatus = ocrStatus;
            return this;
        }

        /**
         * <p>The name of the data asset.</p>
         * 
         * <strong>example:</strong>
         * <p>test-11**</p>
         */
        public Builder parentId(String parentId) {
            this.putQueryParameter("ParentId", parentId);
            this.parentId = parentId;
            return this;
        }

        /**
         * <p>The password that is used to access the database.</p>
         * 
         * <strong>example:</strong>
         * <p>passwd</p>
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
         * <p>The type of service to which the data asset belongs. Valid values:</p>
         * <ul>
         * <li><strong>1</strong> :MaxCompute</li>
         * <li><strong>2</strong>: Object Storage Service (OSS)</li>
         * <li><strong>3</strong>: AnalyticDB for MySQL</li>
         * <li><strong>4</strong> :Tablestore</li>
         * <li><strong>5</strong>: ApsaraDB RDS</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder resourceType(Integer resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The number of sensitive data samples that are collected after sensitive data detection is enabled. Valid values:</p>
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
         * <p>The region in which the data asset resides. Valid values:</p>
         * <ul>
         * <li><strong>cn-beijing</strong>: China (Beijing).</li>
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
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>39.170.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The username that is used to access the database.</p>
         * 
         * <strong>example:</strong>
         * <p>yhm</p>
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
