// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePlayMetricDataRequest} extends {@link RequestModel}
 *
 * <p>DescribePlayMetricDataRequest</p>
 */
public class DescribePlayMetricDataRequest extends Request {
    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("BeginTs")
    @Validation(required = true)
    private Long beginTs;

    @Query
    @NameInMap("Definition")
    private String definition;

    @Query
    @NameInMap("EndTs")
    @Validation(required = true)
    private Long endTs;

    @Query
    @NameInMap("ExperienceLevel")
    private String experienceLevel;

    @Query
    @NameInMap("ItemConfigs")
    private String itemConfigs;

    @Query
    @NameInMap("MetricType")
    @Validation(required = true)
    private String metricType;

    @Query
    @NameInMap("Network")
    private String network;

    @Query
    @NameInMap("Os")
    private String os;

    @Query
    @NameInMap("SdkVersion")
    private String sdkVersion;

    @Query
    @NameInMap("TerminalType")
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
    public Long getBeginTs() {
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
    public Long getEndTs() {
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
        private Long beginTs; 
        private String definition; 
        private Long endTs; 
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
         * BeginTs.
         */
        public Builder beginTs(Long beginTs) {
            this.putQueryParameter("BeginTs", beginTs);
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
         * EndTs.
         */
        public Builder endTs(Long endTs) {
            this.putQueryParameter("EndTs", endTs);
            this.endTs = endTs;
            return this;
        }

        /**
         * ExperienceLevel.
         */
        public Builder experienceLevel(String experienceLevel) {
            this.putQueryParameter("ExperienceLevel", experienceLevel);
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
         * MetricType.
         */
        public Builder metricType(String metricType) {
            this.putQueryParameter("MetricType", metricType);
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
