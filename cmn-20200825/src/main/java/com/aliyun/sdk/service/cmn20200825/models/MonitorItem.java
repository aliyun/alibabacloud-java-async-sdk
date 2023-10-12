// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MonitorItem} extends {@link TeaModel}
 *
 * <p>MonitorItem</p>
 */
public class MonitorItem extends TeaModel {
    @NameInMap("AnalysisCode")
    private String analysisCode;

    @NameInMap("CollectionType")
    private String collectionType;

    @NameInMap("Config")
    private String config;

    @NameInMap("Enable")
    @Validation(maximum = 1)
    private Integer enable;

    @NameInMap("ExecInterval")
    private String execInterval;

    @NameInMap("GmtCreate")
    private String gmtCreate;

    @NameInMap("GmtModified")
    private String gmtModified;

    @NameInMap("MonitorItemDescription")
    private String monitorItemDescription;

    @NameInMap("MonitorItemId")
    private String monitorItemId;

    @NameInMap("MonitorItemName")
    private String monitorItemName;

    @NameInMap("SecurityDomain")
    private String securityDomain;

    private MonitorItem(Builder builder) {
        this.analysisCode = builder.analysisCode;
        this.collectionType = builder.collectionType;
        this.config = builder.config;
        this.enable = builder.enable;
        this.execInterval = builder.execInterval;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.monitorItemDescription = builder.monitorItemDescription;
        this.monitorItemId = builder.monitorItemId;
        this.monitorItemName = builder.monitorItemName;
        this.securityDomain = builder.securityDomain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MonitorItem create() {
        return builder().build();
    }

    /**
     * @return analysisCode
     */
    public String getAnalysisCode() {
        return this.analysisCode;
    }

    /**
     * @return collectionType
     */
    public String getCollectionType() {
        return this.collectionType;
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return enable
     */
    public Integer getEnable() {
        return this.enable;
    }

    /**
     * @return execInterval
     */
    public String getExecInterval() {
        return this.execInterval;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return monitorItemDescription
     */
    public String getMonitorItemDescription() {
        return this.monitorItemDescription;
    }

    /**
     * @return monitorItemId
     */
    public String getMonitorItemId() {
        return this.monitorItemId;
    }

    /**
     * @return monitorItemName
     */
    public String getMonitorItemName() {
        return this.monitorItemName;
    }

    /**
     * @return securityDomain
     */
    public String getSecurityDomain() {
        return this.securityDomain;
    }

    public static final class Builder {
        private String analysisCode; 
        private String collectionType; 
        private String config; 
        private Integer enable; 
        private String execInterval; 
        private String gmtCreate; 
        private String gmtModified; 
        private String monitorItemDescription; 
        private String monitorItemId; 
        private String monitorItemName; 
        private String securityDomain; 

        /**
         * AnalysisCode.
         */
        public Builder analysisCode(String analysisCode) {
            this.analysisCode = analysisCode;
            return this;
        }

        /**
         * CollectionType.
         */
        public Builder collectionType(String collectionType) {
            this.collectionType = collectionType;
            return this;
        }

        /**
         * Config.
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * Enable.
         */
        public Builder enable(Integer enable) {
            this.enable = enable;
            return this;
        }

        /**
         * ExecInterval.
         */
        public Builder execInterval(String execInterval) {
            this.execInterval = execInterval;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * MonitorItemDescription.
         */
        public Builder monitorItemDescription(String monitorItemDescription) {
            this.monitorItemDescription = monitorItemDescription;
            return this;
        }

        /**
         * MonitorItemId.
         */
        public Builder monitorItemId(String monitorItemId) {
            this.monitorItemId = monitorItemId;
            return this;
        }

        /**
         * MonitorItemName.
         */
        public Builder monitorItemName(String monitorItemName) {
            this.monitorItemName = monitorItemName;
            return this;
        }

        /**
         * SecurityDomain.
         */
        public Builder securityDomain(String securityDomain) {
            this.securityDomain = securityDomain;
            return this;
        }

        public MonitorItem build() {
            return new MonitorItem(this);
        } 

    } 

}
