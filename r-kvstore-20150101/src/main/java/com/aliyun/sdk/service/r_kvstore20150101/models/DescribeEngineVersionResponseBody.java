// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEngineVersionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEngineVersionResponseBody</p>
 */
public class DescribeEngineVersionResponseBody extends TeaModel {
    @NameInMap("DBVersionRelease")
    private String DBVersionRelease;

    @NameInMap("EnableUpgradeMajorVersion")
    private Boolean enableUpgradeMajorVersion;

    @NameInMap("EnableUpgradeMinorVersion")
    private Boolean enableUpgradeMinorVersion;

    @NameInMap("Engine")
    private String engine;

    @NameInMap("IsLatestVersion")
    private Boolean isLatestVersion;

    @NameInMap("IsRedisCompatibleVersion")
    private Boolean isRedisCompatibleVersion;

    @NameInMap("MajorVersion")
    private String majorVersion;

    @NameInMap("MinorVersion")
    private String minorVersion;

    @NameInMap("ProxyMinorVersion")
    private String proxyMinorVersion;

    @NameInMap("ProxyVersionRelease")
    private String proxyVersionRelease;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeEngineVersionResponseBody(Builder builder) {
        this.DBVersionRelease = builder.DBVersionRelease;
        this.enableUpgradeMajorVersion = builder.enableUpgradeMajorVersion;
        this.enableUpgradeMinorVersion = builder.enableUpgradeMinorVersion;
        this.engine = builder.engine;
        this.isLatestVersion = builder.isLatestVersion;
        this.isRedisCompatibleVersion = builder.isRedisCompatibleVersion;
        this.majorVersion = builder.majorVersion;
        this.minorVersion = builder.minorVersion;
        this.proxyMinorVersion = builder.proxyMinorVersion;
        this.proxyVersionRelease = builder.proxyVersionRelease;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEngineVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBVersionRelease
     */
    public String getDBVersionRelease() {
        return this.DBVersionRelease;
    }

    /**
     * @return enableUpgradeMajorVersion
     */
    public Boolean getEnableUpgradeMajorVersion() {
        return this.enableUpgradeMajorVersion;
    }

    /**
     * @return enableUpgradeMinorVersion
     */
    public Boolean getEnableUpgradeMinorVersion() {
        return this.enableUpgradeMinorVersion;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return isLatestVersion
     */
    public Boolean getIsLatestVersion() {
        return this.isLatestVersion;
    }

    /**
     * @return isRedisCompatibleVersion
     */
    public Boolean getIsRedisCompatibleVersion() {
        return this.isRedisCompatibleVersion;
    }

    /**
     * @return majorVersion
     */
    public String getMajorVersion() {
        return this.majorVersion;
    }

    /**
     * @return minorVersion
     */
    public String getMinorVersion() {
        return this.minorVersion;
    }

    /**
     * @return proxyMinorVersion
     */
    public String getProxyMinorVersion() {
        return this.proxyMinorVersion;
    }

    /**
     * @return proxyVersionRelease
     */
    public String getProxyVersionRelease() {
        return this.proxyVersionRelease;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String DBVersionRelease; 
        private Boolean enableUpgradeMajorVersion; 
        private Boolean enableUpgradeMinorVersion; 
        private String engine; 
        private Boolean isLatestVersion; 
        private Boolean isRedisCompatibleVersion; 
        private String majorVersion; 
        private String minorVersion; 
        private String proxyMinorVersion; 
        private String proxyVersionRelease; 
        private String requestId; 

        /**
         * DBVersionRelease.
         */
        public Builder DBVersionRelease(String DBVersionRelease) {
            this.DBVersionRelease = DBVersionRelease;
            return this;
        }

        /**
         * EnableUpgradeMajorVersion.
         */
        public Builder enableUpgradeMajorVersion(Boolean enableUpgradeMajorVersion) {
            this.enableUpgradeMajorVersion = enableUpgradeMajorVersion;
            return this;
        }

        /**
         * EnableUpgradeMinorVersion.
         */
        public Builder enableUpgradeMinorVersion(Boolean enableUpgradeMinorVersion) {
            this.enableUpgradeMinorVersion = enableUpgradeMinorVersion;
            return this;
        }

        /**
         * Engine.
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * IsLatestVersion.
         */
        public Builder isLatestVersion(Boolean isLatestVersion) {
            this.isLatestVersion = isLatestVersion;
            return this;
        }

        /**
         * IsRedisCompatibleVersion.
         */
        public Builder isRedisCompatibleVersion(Boolean isRedisCompatibleVersion) {
            this.isRedisCompatibleVersion = isRedisCompatibleVersion;
            return this;
        }

        /**
         * MajorVersion.
         */
        public Builder majorVersion(String majorVersion) {
            this.majorVersion = majorVersion;
            return this;
        }

        /**
         * MinorVersion.
         */
        public Builder minorVersion(String minorVersion) {
            this.minorVersion = minorVersion;
            return this;
        }

        /**
         * ProxyMinorVersion.
         */
        public Builder proxyMinorVersion(String proxyMinorVersion) {
            this.proxyMinorVersion = proxyMinorVersion;
            return this;
        }

        /**
         * ProxyVersionRelease.
         */
        public Builder proxyVersionRelease(String proxyVersionRelease) {
            this.proxyVersionRelease = proxyVersionRelease;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEngineVersionResponseBody build() {
            return new DescribeEngineVersionResponseBody(this);
        } 

    } 

}
