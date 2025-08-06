// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DescribePlayMetricDataRequest} extends {@link RequestModel}
 *
 * <p>DescribePlayMetricDataRequest</p>
 */
public class DescribePlayMetricDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BeginTs")
    @com.aliyun.core.annotation.Validation(required = true)
    private String beginTs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Definition")
    private String definition;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTs")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExperienceLevel")
    private String experienceLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ItemConfigs")
    private String itemConfigs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MetricType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metricType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Network")
    private String network;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Os")
    private String os;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SdkVersion")
    private String sdkVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TerminalType")
    private String terminalType;

    private DescribePlayMetricDataRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.beginTs = builder.beginTs;
        this.definition = builder.definition;
        this.endTs = builder.endTs;
        this.experienceLevel = builder.experienceLevel;
        this.itemConfigs = builder.itemConfigs;
        this.metricType = builder.metricType;
        this.network = builder.network;
        this.os = builder.os;
        this.sdkVersion = builder.sdkVersion;
        this.terminalType = builder.terminalType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePlayMetricDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return beginTs
     */
    public String getBeginTs() {
        return this.beginTs;
    }

    /**
     * @return definition
     */
    public String getDefinition() {
        return this.definition;
    }

    /**
     * @return endTs
     */
    public String getEndTs() {
        return this.endTs;
    }

    /**
     * @return experienceLevel
     */
    public String getExperienceLevel() {
        return this.experienceLevel;
    }

    /**
     * @return itemConfigs
     */
    public String getItemConfigs() {
        return this.itemConfigs;
    }

    /**
     * @return metricType
     */
    public String getMetricType() {
        return this.metricType;
    }

    /**
     * @return network
     */
    public String getNetwork() {
        return this.network;
    }

    /**
     * @return os
     */
    public String getOs() {
        return this.os;
    }

    /**
     * @return sdkVersion
     */
    public String getSdkVersion() {
        return this.sdkVersion;
    }

    /**
     * @return terminalType
     */
    public String getTerminalType() {
        return this.terminalType;
    }

    public static final class Builder extends Request.Builder<DescribePlayMetricDataRequest, Builder> {
        private String appName; 
        private String beginTs; 
        private String definition; 
        private String endTs; 
        private String experienceLevel; 
        private String itemConfigs; 
        private String metricType; 
        private String network; 
        private String os; 
        private String sdkVersion; 
        private String terminalType; 

        private Builder() {
            super();
        } 

        private Builder(DescribePlayMetricDataRequest request) {
            super(request);
            this.appName = request.appName;
            this.beginTs = request.beginTs;
            this.definition = request.definition;
            this.endTs = request.endTs;
            this.experienceLevel = request.experienceLevel;
            this.itemConfigs = request.itemConfigs;
            this.metricType = request.metricType;
            this.network = request.network;
            this.os = request.os;
            this.sdkVersion = request.sdkVersion;
            this.terminalType = request.terminalType;
        } 

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder beginTs(String beginTs) {
            this.putBodyParameter("BeginTs", beginTs);
            this.beginTs = beginTs;
            return this;
        }

        /**
         * Definition.
         */
        public Builder definition(String definition) {
            this.putQueryParameter("Definition", definition);
            this.definition = definition;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder endTs(String endTs) {
            this.putBodyParameter("EndTs", endTs);
            this.endTs = endTs;
            return this;
        }

        /**
         * ExperienceLevel.
         */
        public Builder experienceLevel(String experienceLevel) {
            this.putBodyParameter("ExperienceLevel", experienceLevel);
            this.experienceLevel = experienceLevel;
            return this;
        }

        /**
         * ItemConfigs.
         */
        public Builder itemConfigs(String itemConfigs) {
            this.putQueryParameter("ItemConfigs", itemConfigs);
            this.itemConfigs = itemConfigs;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder metricType(String metricType) {
            this.putBodyParameter("MetricType", metricType);
            this.metricType = metricType;
            return this;
        }

        /**
         * Network.
         */
        public Builder network(String network) {
            this.putQueryParameter("Network", network);
            this.network = network;
            return this;
        }

        /**
         * Os.
         */
        public Builder os(String os) {
            this.putQueryParameter("Os", os);
            this.os = os;
            return this;
        }

        /**
         * SdkVersion.
         */
        public Builder sdkVersion(String sdkVersion) {
            this.putQueryParameter("SdkVersion", sdkVersion);
            this.sdkVersion = sdkVersion;
            return this;
        }

        /**
         * TerminalType.
         */
        public Builder terminalType(String terminalType) {
            this.putQueryParameter("TerminalType", terminalType);
            this.terminalType = terminalType;
            return this;
        }

        @Override
        public DescribePlayMetricDataRequest build() {
            return new DescribePlayMetricDataRequest(this);
        } 

    } 

}
