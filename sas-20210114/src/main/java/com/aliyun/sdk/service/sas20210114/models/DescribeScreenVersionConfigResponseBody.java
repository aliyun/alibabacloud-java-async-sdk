// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20210114.models;

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
 * {@link DescribeScreenVersionConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScreenVersionConfigResponseBody</p>
 */
public class DescribeScreenVersionConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssetLevel")
    private Integer assetLevel;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("IsTrialVersion")
    private Integer isTrialVersion;

    @com.aliyun.core.annotation.NameInMap("ReleaseTime")
    private Long releaseTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SasLog")
    private Integer sasLog;

    @com.aliyun.core.annotation.NameInMap("SasScreen")
    private Integer sasScreen;

    @com.aliyun.core.annotation.NameInMap("Version")
    private Integer version;

    private DescribeScreenVersionConfigResponseBody(Builder builder) {
        this.assetLevel = builder.assetLevel;
        this.instanceId = builder.instanceId;
        this.isTrialVersion = builder.isTrialVersion;
        this.releaseTime = builder.releaseTime;
        this.requestId = builder.requestId;
        this.sasLog = builder.sasLog;
        this.sasScreen = builder.sasScreen;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScreenVersionConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetLevel
     */
    public Integer getAssetLevel() {
        return this.assetLevel;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return isTrialVersion
     */
    public Integer getIsTrialVersion() {
        return this.isTrialVersion;
    }

    /**
     * @return releaseTime
     */
    public Long getReleaseTime() {
        return this.releaseTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sasLog
     */
    public Integer getSasLog() {
        return this.sasLog;
    }

    /**
     * @return sasScreen
     */
    public Integer getSasScreen() {
        return this.sasScreen;
    }

    /**
     * @return version
     */
    public Integer getVersion() {
        return this.version;
    }

    public static final class Builder {
        private Integer assetLevel; 
        private String instanceId; 
        private Integer isTrialVersion; 
        private Long releaseTime; 
        private String requestId; 
        private Integer sasLog; 
        private Integer sasScreen; 
        private Integer version; 

        private Builder() {
        } 

        private Builder(DescribeScreenVersionConfigResponseBody model) {
            this.assetLevel = model.assetLevel;
            this.instanceId = model.instanceId;
            this.isTrialVersion = model.isTrialVersion;
            this.releaseTime = model.releaseTime;
            this.requestId = model.requestId;
            this.sasLog = model.sasLog;
            this.sasScreen = model.sasScreen;
            this.version = model.version;
        } 

        /**
         * AssetLevel.
         */
        public Builder assetLevel(Integer assetLevel) {
            this.assetLevel = assetLevel;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IsTrialVersion.
         */
        public Builder isTrialVersion(Integer isTrialVersion) {
            this.isTrialVersion = isTrialVersion;
            return this;
        }

        /**
         * ReleaseTime.
         */
        public Builder releaseTime(Long releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SasLog.
         */
        public Builder sasLog(Integer sasLog) {
            this.sasLog = sasLog;
            return this;
        }

        /**
         * SasScreen.
         */
        public Builder sasScreen(Integer sasScreen) {
            this.sasScreen = sasScreen;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(Integer version) {
            this.version = version;
            return this;
        }

        public DescribeScreenVersionConfigResponseBody build() {
            return new DescribeScreenVersionConfigResponseBody(this);
        } 

    } 

}
