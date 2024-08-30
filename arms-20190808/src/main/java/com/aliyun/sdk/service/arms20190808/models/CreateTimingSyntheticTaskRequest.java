// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTimingSyntheticTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateTimingSyntheticTaskRequest</p>
 */
public class CreateTimingSyntheticTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AvailableAssertions")
    private java.util.List < AvailableAssertions> availableAssertions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommonSetting")
    private CommonSetting commonSetting;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomPeriod")
    private CustomPeriod customPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Frequency")
    @com.aliyun.core.annotation.Validation(required = true)
    private String frequency;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MonitorCategory")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer monitorCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MonitorConf")
    @com.aliyun.core.annotation.Validation(required = true)
    private MonitorConf monitorConf;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Monitors")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Monitors> monitors;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List < Tags> tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer taskType;

    private CreateTimingSyntheticTaskRequest(Builder builder) {
        super(builder);
        this.availableAssertions = builder.availableAssertions;
        this.commonSetting = builder.commonSetting;
        this.customPeriod = builder.customPeriod;
        this.frequency = builder.frequency;
        this.monitorCategory = builder.monitorCategory;
        this.monitorConf = builder.monitorConf;
        this.monitors = builder.monitors;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.tags = builder.tags;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTimingSyntheticTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return availableAssertions
     */
    public java.util.List < AvailableAssertions> getAvailableAssertions() {
        return this.availableAssertions;
    }

    /**
     * @return commonSetting
     */
    public CommonSetting getCommonSetting() {
        return this.commonSetting;
    }

    /**
     * @return customPeriod
     */
    public CustomPeriod getCustomPeriod() {
        return this.customPeriod;
    }

    /**
     * @return frequency
     */
    public String getFrequency() {
        return this.frequency;
    }

    /**
     * @return monitorCategory
     */
    public Integer getMonitorCategory() {
        return this.monitorCategory;
    }

    /**
     * @return monitorConf
     */
    public MonitorConf getMonitorConf() {
        return this.monitorConf;
    }

    /**
     * @return monitors
     */
    public java.util.List < Monitors> getMonitors() {
        return this.monitors;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    /**
     * @return taskType
     */
    public Integer getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<CreateTimingSyntheticTaskRequest, Builder> {
        private java.util.List < AvailableAssertions> availableAssertions; 
        private CommonSetting commonSetting; 
        private CustomPeriod customPeriod; 
        private String frequency; 
        private Integer monitorCategory; 
        private MonitorConf monitorConf; 
        private java.util.List < Monitors> monitors; 
        private String name; 
        private String regionId; 
        private String resourceGroupId; 
        private java.util.List < Tags> tags; 
        private Integer taskType; 

        private Builder() {
            super();
        } 

        private Builder(CreateTimingSyntheticTaskRequest request) {
            super(request);
            this.availableAssertions = request.availableAssertions;
            this.commonSetting = request.commonSetting;
            this.customPeriod = request.customPeriod;
            this.frequency = request.frequency;
            this.monitorCategory = request.monitorCategory;
            this.monitorConf = request.monitorConf;
            this.monitors = request.monitors;
            this.name = request.name;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.tags = request.tags;
            this.taskType = request.taskType;
        } 

        /**
         * The list of assertions.
         */
        public Builder availableAssertions(java.util.List < AvailableAssertions> availableAssertions) {
            String availableAssertionsShrink = shrink(availableAssertions, "AvailableAssertions", "json");
            this.putQueryParameter("AvailableAssertions", availableAssertionsShrink);
            this.availableAssertions = availableAssertions;
            return this;
        }

        /**
         * The general settings.
         */
        public Builder commonSetting(CommonSetting commonSetting) {
            String commonSettingShrink = shrink(commonSetting, "CommonSetting", "json");
            this.putQueryParameter("CommonSetting", commonSettingShrink);
            this.commonSetting = commonSetting;
            return this;
        }

        /**
         * The general settings.
         */
        public Builder customPeriod(CustomPeriod customPeriod) {
            String customPeriodShrink = shrink(customPeriod, "CustomPeriod", "json");
            this.putQueryParameter("CustomPeriod", customPeriodShrink);
            this.customPeriod = customPeriod;
            return this;
        }

        /**
         * The detection frequency. Valid values: 1m, 5m, 10m, 15m, 20m, 30m, 1h, 2h, 3h, 4h, 6h, 8h, 12h, and 24h.
         */
        public Builder frequency(String frequency) {
            this.putQueryParameter("Frequency", frequency);
            this.frequency = frequency;
            return this;
        }

        /**
         * The detection point type. Valid values:
         * <p>
         * 
         * - 1: PC
         * - 2: mobile device
         */
        public Builder monitorCategory(Integer monitorCategory) {
            this.putQueryParameter("MonitorCategory", monitorCategory);
            this.monitorCategory = monitorCategory;
            return this;
        }

        /**
         * The monitoring configurations.
         */
        public Builder monitorConf(MonitorConf monitorConf) {
            String monitorConfShrink = shrink(monitorConf, "MonitorConf", "json");
            this.putQueryParameter("MonitorConf", monitorConfShrink);
            this.monitorConf = monitorConf;
            return this;
        }

        /**
         * The list of detection points.
         */
        public Builder monitors(java.util.List < Monitors> monitors) {
            String monitorsShrink = shrink(monitors, "Monitors", "json");
            this.putQueryParameter("Monitors", monitorsShrink);
            this.monitors = monitors;
            return this;
        }

        /**
         * The name of the task.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The parameter is optional.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The tag list.
         */
        public Builder tags(java.util.List < Tags> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * The type of the task. Valid values:
         * <p>
         * 
         * 1: ICMP. 2: TCP. 3: DNS. 4: HTTP. 5: website speed measurement. 6: file download.
         */
        public Builder taskType(Integer taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public CreateTimingSyntheticTaskRequest build() {
            return new CreateTimingSyntheticTaskRequest(this);
        } 

    } 

    public static class AvailableAssertions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Expect")
        @com.aliyun.core.annotation.Validation(required = true)
        private String expect;

        @com.aliyun.core.annotation.NameInMap("Operator")
        @com.aliyun.core.annotation.Validation(required = true)
        private String operator;

        @com.aliyun.core.annotation.NameInMap("Target")
        private String target;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private AvailableAssertions(Builder builder) {
            this.expect = builder.expect;
            this.operator = builder.operator;
            this.target = builder.target;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableAssertions create() {
            return builder().build();
        }

        /**
         * @return expect
         */
        public String getExpect() {
            return this.expect;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String expect; 
            private String operator; 
            private String target; 
            private String type; 

            /**
             * The expected value.
             */
            public Builder expect(String expect) {
                this.expect = expect;
                return this;
            }

            /**
             * The condition. gt: greater than. gte: greater than or equal to. lt: less than. lte: less than or equal to. eq: equal to. neq: not equal to. ctn: contain. nctn: does not contain. exist: exist. n_exist: does not exist. belong: belong to. n_belong: does not belong to. reg_match: regular expression.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * The check target. If you set the type parameter to HttpResCode, HttpResBody, or HttpResponseTime, you do not need to set the target parameter. If you set the type parameter to HttpResHead, you must specify the key in the header. If you set the type parameter to HttpResBodyJson, use jsonPath.
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * The assertion type. Valid values: HttpResCode, HttpResHead, HttpResBody, HttpResBodyJson, HttpResponseTime, IcmpPackLoss (packet loss rate), IcmpPackMaxLatency (maximum packet latency), IcmpPackAvgLatency (average packet latency), TraceRouteHops (number of hops), DnsARecord (A record), DnsCName (CNAME), websiteTTFB (time to first packet), websiteTTLB (time to last packet), websiteFST (first paint time), websiteFFST (first meaningful paint), websiteOnload (full loaded time). For more information, see the following description.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public AvailableAssertions build() {
                return new AvailableAssertions(this);
            } 

        } 

    }
    public static class Hosts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        @com.aliyun.core.annotation.Validation(required = true)
        private String domain;

        @com.aliyun.core.annotation.NameInMap("IpType")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer ipType;

        @com.aliyun.core.annotation.NameInMap("Ips")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < String > ips;

        private Hosts(Builder builder) {
            this.domain = builder.domain;
            this.ipType = builder.ipType;
            this.ips = builder.ips;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Hosts create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return ipType
         */
        public Integer getIpType() {
            return this.ipType;
        }

        /**
         * @return ips
         */
        public java.util.List < String > getIps() {
            return this.ips;
        }

        public static final class Builder {
            private String domain; 
            private Integer ipType; 
            private java.util.List < String > ips; 

            /**
             * The domain name.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * The IP version. Valid values:
             * <p>
             * 
             * *   0: A version is automatically selected.
             * *   1: IPv4.
             * *   2: IPv6.
             */
            public Builder ipType(Integer ipType) {
                this.ipType = ipType;
                return this;
            }

            /**
             * The list of IP addresses.
             */
            public Builder ips(java.util.List < String > ips) {
                this.ips = ips;
                return this;
            }

            public Hosts build() {
                return new Hosts(this);
            } 

        } 

    }
    public static class CustomHost extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Hosts")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < Hosts> hosts;

        @com.aliyun.core.annotation.NameInMap("SelectType")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer selectType;

        private CustomHost(Builder builder) {
            this.hosts = builder.hosts;
            this.selectType = builder.selectType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomHost create() {
            return builder().build();
        }

        /**
         * @return hosts
         */
        public java.util.List < Hosts> getHosts() {
            return this.hosts;
        }

        /**
         * @return selectType
         */
        public Integer getSelectType() {
            return this.selectType;
        }

        public static final class Builder {
            private java.util.List < Hosts> hosts; 
            private Integer selectType; 

            /**
             * The list of hosts.
             */
            public Builder hosts(java.util.List < Hosts> hosts) {
                this.hosts = hosts;
                return this;
            }

            /**
             * The selection mode. Valid values:
             * <p>
             * 
             * *   0: random
             * *   1: polling
             */
            public Builder selectType(Integer selectType) {
                this.selectType = selectType;
                return this;
            }

            public CustomHost build() {
                return new CustomHost(this);
            } 

        } 

    }
    public static class CustomPrometheusSetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrometheusClusterId")
        private String prometheusClusterId;

        @com.aliyun.core.annotation.NameInMap("PrometheusClusterRegion")
        private String prometheusClusterRegion;

        @com.aliyun.core.annotation.NameInMap("PrometheusLabels")
        private java.util.Map < String, String > prometheusLabels;

        private CustomPrometheusSetting(Builder builder) {
            this.prometheusClusterId = builder.prometheusClusterId;
            this.prometheusClusterRegion = builder.prometheusClusterRegion;
            this.prometheusLabels = builder.prometheusLabels;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomPrometheusSetting create() {
            return builder().build();
        }

        /**
         * @return prometheusClusterId
         */
        public String getPrometheusClusterId() {
            return this.prometheusClusterId;
        }

        /**
         * @return prometheusClusterRegion
         */
        public String getPrometheusClusterRegion() {
            return this.prometheusClusterRegion;
        }

        /**
         * @return prometheusLabels
         */
        public java.util.Map < String, String > getPrometheusLabels() {
            return this.prometheusLabels;
        }

        public static final class Builder {
            private String prometheusClusterId; 
            private String prometheusClusterRegion; 
            private java.util.Map < String, String > prometheusLabels; 

            /**
             * A reserved parameter.
             */
            public Builder prometheusClusterId(String prometheusClusterId) {
                this.prometheusClusterId = prometheusClusterId;
                return this;
            }

            /**
             * A reserved parameter.
             */
            public Builder prometheusClusterRegion(String prometheusClusterRegion) {
                this.prometheusClusterRegion = prometheusClusterRegion;
                return this;
            }

            /**
             * A reserved parameter.
             */
            public Builder prometheusLabels(java.util.Map < String, String > prometheusLabels) {
                this.prometheusLabels = prometheusLabels;
                return this;
            }

            public CustomPrometheusSetting build() {
                return new CustomPrometheusSetting(this);
            } 

        } 

    }
    public static class CustomVPCSetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SecureGroupId")
        private String secureGroupId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private CustomVPCSetting(Builder builder) {
            this.regionId = builder.regionId;
            this.secureGroupId = builder.secureGroupId;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomVPCSetting create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return secureGroupId
         */
        public String getSecureGroupId() {
            return this.secureGroupId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String regionId; 
            private String secureGroupId; 
            private String vSwitchId; 
            private String vpcId; 

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the security group to which the client belongs. The security group specifies the inbound and outbound rules of the client for the VPC. You need to allow the security group to which the client belongs to access the security group to which the VPC belongs. Otherwise, the client cannot access resources in the VPC.
             */
            public Builder secureGroupId(String secureGroupId) {
                this.secureGroupId = secureGroupId;
                return this;
            }

            /**
             * The vSwitch ID.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VPC ID.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public CustomVPCSetting build() {
                return new CustomVPCSetting(this);
            } 

        } 

    }
    public static class CommonSetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomHost")
        private CustomHost customHost;

        @com.aliyun.core.annotation.NameInMap("CustomPrometheusSetting")
        private CustomPrometheusSetting customPrometheusSetting;

        @com.aliyun.core.annotation.NameInMap("CustomVPCSetting")
        private CustomVPCSetting customVPCSetting;

        @com.aliyun.core.annotation.NameInMap("IpType")
        private Integer ipType;

        @com.aliyun.core.annotation.NameInMap("IsOpenTrace")
        private Boolean isOpenTrace;

        @com.aliyun.core.annotation.NameInMap("MonitorSamples")
        private Integer monitorSamples;

        @com.aliyun.core.annotation.NameInMap("TraceClientType")
        private Integer traceClientType;

        @com.aliyun.core.annotation.NameInMap("XtraceRegion")
        private String xtraceRegion;

        private CommonSetting(Builder builder) {
            this.customHost = builder.customHost;
            this.customPrometheusSetting = builder.customPrometheusSetting;
            this.customVPCSetting = builder.customVPCSetting;
            this.ipType = builder.ipType;
            this.isOpenTrace = builder.isOpenTrace;
            this.monitorSamples = builder.monitorSamples;
            this.traceClientType = builder.traceClientType;
            this.xtraceRegion = builder.xtraceRegion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommonSetting create() {
            return builder().build();
        }

        /**
         * @return customHost
         */
        public CustomHost getCustomHost() {
            return this.customHost;
        }

        /**
         * @return customPrometheusSetting
         */
        public CustomPrometheusSetting getCustomPrometheusSetting() {
            return this.customPrometheusSetting;
        }

        /**
         * @return customVPCSetting
         */
        public CustomVPCSetting getCustomVPCSetting() {
            return this.customVPCSetting;
        }

        /**
         * @return ipType
         */
        public Integer getIpType() {
            return this.ipType;
        }

        /**
         * @return isOpenTrace
         */
        public Boolean getIsOpenTrace() {
            return this.isOpenTrace;
        }

        /**
         * @return monitorSamples
         */
        public Integer getMonitorSamples() {
            return this.monitorSamples;
        }

        /**
         * @return traceClientType
         */
        public Integer getTraceClientType() {
            return this.traceClientType;
        }

        /**
         * @return xtraceRegion
         */
        public String getXtraceRegion() {
            return this.xtraceRegion;
        }

        public static final class Builder {
            private CustomHost customHost; 
            private CustomPrometheusSetting customPrometheusSetting; 
            private CustomVPCSetting customVPCSetting; 
            private Integer ipType; 
            private Boolean isOpenTrace; 
            private Integer monitorSamples; 
            private Integer traceClientType; 
            private String xtraceRegion; 

            /**
             * The custom host settings.
             */
            public Builder customHost(CustomHost customHost) {
                this.customHost = customHost;
                return this;
            }

            /**
             * The reserved parameters.
             */
            public Builder customPrometheusSetting(CustomPrometheusSetting customPrometheusSetting) {
                this.customPrometheusSetting = customPrometheusSetting;
                return this;
            }

            /**
             * The information about the virtual private cloud (VPC). If the destination URL is an Alibaba Cloud internal endpoint, you need to configure a VPC.
             */
            public Builder customVPCSetting(CustomVPCSetting customVPCSetting) {
                this.customVPCSetting = customVPCSetting;
                return this;
            }

            /**
             * The IP version. Valid values:
             * <p>
             * 
             * *   0: A version is automatically selected.
             * *   1: IPv4.
             * *   2: IPv6.
             */
            public Builder ipType(Integer ipType) {
                this.ipType = ipType;
                return this;
            }

            /**
             * Specifies whether to enable tracing.
             */
            public Builder isOpenTrace(Boolean isOpenTrace) {
                this.isOpenTrace = isOpenTrace;
                return this;
            }

            /**
             * Specifies whether to evenly distribute monitoring samples. Valid values:
             * <p>
             * 
             * *   0: no
             * *   1: yes
             */
            public Builder monitorSamples(Integer monitorSamples) {
                this.monitorSamples = monitorSamples;
                return this;
            }

            /**
             * The type of the client for tracing. Valid values:
             * <p>
             * 
             * *   0: ARMS agent
             * *   1: OpenTelemetry
             * *   2: Jaeger
             */
            public Builder traceClientType(Integer traceClientType) {
                this.traceClientType = traceClientType;
                return this;
            }

            /**
             * The region to which trace data is reported.
             */
            public Builder xtraceRegion(String xtraceRegion) {
                this.xtraceRegion = xtraceRegion;
                return this;
            }

            public CommonSetting build() {
                return new CommonSetting(this);
            } 

        } 

    }
    public static class CustomPeriod extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndHour")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer endHour;

        @com.aliyun.core.annotation.NameInMap("StartHour")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer startHour;

        private CustomPeriod(Builder builder) {
            this.endHour = builder.endHour;
            this.startHour = builder.startHour;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomPeriod create() {
            return builder().build();
        }

        /**
         * @return endHour
         */
        public Integer getEndHour() {
            return this.endHour;
        }

        /**
         * @return startHour
         */
        public Integer getStartHour() {
            return this.startHour;
        }

        public static final class Builder {
            private Integer endHour; 
            private Integer startHour; 

            /**
             * The custom host settings.
             */
            public Builder endHour(Integer endHour) {
                this.endHour = endHour;
                return this;
            }

            /**
             * The list of hosts.
             */
            public Builder startHour(Integer startHour) {
                this.startHour = startHour;
                return this;
            }

            public CustomPeriod build() {
                return new CustomPeriod(this);
            } 

        } 

    }
    public static class RequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private RequestBody(Builder builder) {
            this.content = builder.content;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestBody create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String content; 
            private String type; 

            /**
             * The content of the request body. Format: JSON string. The parameter is required if the Type parameter is set to text/plain, application/json, application/xml, or text/html. Format: JSON string.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The type of the request body. Valid values: text/plain, application/json, application/x-www-form-urlencoded, multipart/form-data, application/xml, and text/html.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RequestBody build() {
                return new RequestBody(this);
            } 

        } 

    }
    public static class ApiHTTP extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckCert")
        private Boolean checkCert;

        @com.aliyun.core.annotation.NameInMap("ConnectTimeout")
        private Long connectTimeout;

        @com.aliyun.core.annotation.NameInMap("Method")
        private String method;

        @com.aliyun.core.annotation.NameInMap("ProtocolAlpnProtocol")
        private Integer protocolAlpnProtocol;

        @com.aliyun.core.annotation.NameInMap("RequestBody")
        private RequestBody requestBody;

        @com.aliyun.core.annotation.NameInMap("RequestHeaders")
        private java.util.Map < String, String > requestHeaders;

        @com.aliyun.core.annotation.NameInMap("TargetUrl")
        @com.aliyun.core.annotation.Validation(required = true)
        private String targetUrl;

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private Long timeout;

        private ApiHTTP(Builder builder) {
            this.checkCert = builder.checkCert;
            this.connectTimeout = builder.connectTimeout;
            this.method = builder.method;
            this.protocolAlpnProtocol = builder.protocolAlpnProtocol;
            this.requestBody = builder.requestBody;
            this.requestHeaders = builder.requestHeaders;
            this.targetUrl = builder.targetUrl;
            this.timeout = builder.timeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiHTTP create() {
            return builder().build();
        }

        /**
         * @return checkCert
         */
        public Boolean getCheckCert() {
            return this.checkCert;
        }

        /**
         * @return connectTimeout
         */
        public Long getConnectTimeout() {
            return this.connectTimeout;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return protocolAlpnProtocol
         */
        public Integer getProtocolAlpnProtocol() {
            return this.protocolAlpnProtocol;
        }

        /**
         * @return requestBody
         */
        public RequestBody getRequestBody() {
            return this.requestBody;
        }

        /**
         * @return requestHeaders
         */
        public java.util.Map < String, String > getRequestHeaders() {
            return this.requestHeaders;
        }

        /**
         * @return targetUrl
         */
        public String getTargetUrl() {
            return this.targetUrl;
        }

        /**
         * @return timeout
         */
        public Long getTimeout() {
            return this.timeout;
        }

        public static final class Builder {
            private Boolean checkCert; 
            private Long connectTimeout; 
            private String method; 
            private Integer protocolAlpnProtocol; 
            private RequestBody requestBody; 
            private java.util.Map < String, String > requestHeaders; 
            private String targetUrl; 
            private Long timeout; 

            /**
             * Specifies whether to verify the certificate. Default value: no.
             */
            public Builder checkCert(Boolean checkCert) {
                this.checkCert = checkCert;
                return this;
            }

            /**
             * The connection timeout period. Unit: milliseconds. Default value: 5000. Minimum value: 1000. Maximum value: 300000.
             */
            public Builder connectTimeout(Long connectTimeout) {
                this.connectTimeout = connectTimeout;
                return this;
            }

            /**
             * The request method. Valid values: GET and POST.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * The ALPN protocol version. You can configure this parameter when you perform an HTTPS synthetic test on a WAP mobile client. Valid values:
             * <p>
             * 
             * 0: default
             * 
             * 1: http/1.1
             * 
             * 2: h2
             * 
             * 3: disables the ALPN protocol
             */
            public Builder protocolAlpnProtocol(Integer protocolAlpnProtocol) {
                this.protocolAlpnProtocol = protocolAlpnProtocol;
                return this;
            }

            /**
             * The HTTP request body.
             */
            public Builder requestBody(RequestBody requestBody) {
                this.requestBody = requestBody;
                return this;
            }

            /**
             * The HTTP request header.
             */
            public Builder requestHeaders(java.util.Map < String, String > requestHeaders) {
                this.requestHeaders = requestHeaders;
                return this;
            }

            /**
             * The URL or request path for synthetic monitoring.
             */
            public Builder targetUrl(String targetUrl) {
                this.targetUrl = targetUrl;
                return this;
            }

            /**
             * The timeout period. Unit: milliseconds. Default value: 10000. Minimum value: 1000. Maximum value: 300000.
             */
            public Builder timeout(Long timeout) {
                this.timeout = timeout;
                return this;
            }

            public ApiHTTP build() {
                return new ApiHTTP(this);
            } 

        } 

    }
    public static class FileDownload extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionTimeout")
        private Long connectionTimeout;

        @com.aliyun.core.annotation.NameInMap("CustomHeaderContent")
        private java.util.Map < String, String > customHeaderContent;

        @com.aliyun.core.annotation.NameInMap("DownloadKernel")
        private Integer downloadKernel;

        @com.aliyun.core.annotation.NameInMap("IgnoreCertificateAuthError")
        private Integer ignoreCertificateAuthError;

        @com.aliyun.core.annotation.NameInMap("IgnoreCertificateCanceledError")
        private Integer ignoreCertificateCanceledError;

        @com.aliyun.core.annotation.NameInMap("IgnoreCertificateOutOfDateError")
        private Integer ignoreCertificateOutOfDateError;

        @com.aliyun.core.annotation.NameInMap("IgnoreCertificateStatusError")
        private Integer ignoreCertificateStatusError;

        @com.aliyun.core.annotation.NameInMap("IgnoreCertificateUntrustworthyError")
        private Integer ignoreCertificateUntrustworthyError;

        @com.aliyun.core.annotation.NameInMap("IgnoreCertificateUsingError")
        private Integer ignoreCertificateUsingError;

        @com.aliyun.core.annotation.NameInMap("IgnoreInvalidHostError")
        private Integer ignoreInvalidHostError;

        @com.aliyun.core.annotation.NameInMap("MonitorTimeout")
        private Long monitorTimeout;

        @com.aliyun.core.annotation.NameInMap("QuickProtocol")
        private Integer quickProtocol;

        @com.aliyun.core.annotation.NameInMap("Redirection")
        private Integer redirection;

        @com.aliyun.core.annotation.NameInMap("TargetUrl")
        @com.aliyun.core.annotation.Validation(required = true)
        private String targetUrl;

        @com.aliyun.core.annotation.NameInMap("TransmissionSize")
        private Long transmissionSize;

        @com.aliyun.core.annotation.NameInMap("ValidateKeywords")
        private String validateKeywords;

        @com.aliyun.core.annotation.NameInMap("VerifyWay")
        private Integer verifyWay;

        @com.aliyun.core.annotation.NameInMap("WhiteList")
        private String whiteList;

        private FileDownload(Builder builder) {
            this.connectionTimeout = builder.connectionTimeout;
            this.customHeaderContent = builder.customHeaderContent;
            this.downloadKernel = builder.downloadKernel;
            this.ignoreCertificateAuthError = builder.ignoreCertificateAuthError;
            this.ignoreCertificateCanceledError = builder.ignoreCertificateCanceledError;
            this.ignoreCertificateOutOfDateError = builder.ignoreCertificateOutOfDateError;
            this.ignoreCertificateStatusError = builder.ignoreCertificateStatusError;
            this.ignoreCertificateUntrustworthyError = builder.ignoreCertificateUntrustworthyError;
            this.ignoreCertificateUsingError = builder.ignoreCertificateUsingError;
            this.ignoreInvalidHostError = builder.ignoreInvalidHostError;
            this.monitorTimeout = builder.monitorTimeout;
            this.quickProtocol = builder.quickProtocol;
            this.redirection = builder.redirection;
            this.targetUrl = builder.targetUrl;
            this.transmissionSize = builder.transmissionSize;
            this.validateKeywords = builder.validateKeywords;
            this.verifyWay = builder.verifyWay;
            this.whiteList = builder.whiteList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileDownload create() {
            return builder().build();
        }

        /**
         * @return connectionTimeout
         */
        public Long getConnectionTimeout() {
            return this.connectionTimeout;
        }

        /**
         * @return customHeaderContent
         */
        public java.util.Map < String, String > getCustomHeaderContent() {
            return this.customHeaderContent;
        }

        /**
         * @return downloadKernel
         */
        public Integer getDownloadKernel() {
            return this.downloadKernel;
        }

        /**
         * @return ignoreCertificateAuthError
         */
        public Integer getIgnoreCertificateAuthError() {
            return this.ignoreCertificateAuthError;
        }

        /**
         * @return ignoreCertificateCanceledError
         */
        public Integer getIgnoreCertificateCanceledError() {
            return this.ignoreCertificateCanceledError;
        }

        /**
         * @return ignoreCertificateOutOfDateError
         */
        public Integer getIgnoreCertificateOutOfDateError() {
            return this.ignoreCertificateOutOfDateError;
        }

        /**
         * @return ignoreCertificateStatusError
         */
        public Integer getIgnoreCertificateStatusError() {
            return this.ignoreCertificateStatusError;
        }

        /**
         * @return ignoreCertificateUntrustworthyError
         */
        public Integer getIgnoreCertificateUntrustworthyError() {
            return this.ignoreCertificateUntrustworthyError;
        }

        /**
         * @return ignoreCertificateUsingError
         */
        public Integer getIgnoreCertificateUsingError() {
            return this.ignoreCertificateUsingError;
        }

        /**
         * @return ignoreInvalidHostError
         */
        public Integer getIgnoreInvalidHostError() {
            return this.ignoreInvalidHostError;
        }

        /**
         * @return monitorTimeout
         */
        public Long getMonitorTimeout() {
            return this.monitorTimeout;
        }

        /**
         * @return quickProtocol
         */
        public Integer getQuickProtocol() {
            return this.quickProtocol;
        }

        /**
         * @return redirection
         */
        public Integer getRedirection() {
            return this.redirection;
        }

        /**
         * @return targetUrl
         */
        public String getTargetUrl() {
            return this.targetUrl;
        }

        /**
         * @return transmissionSize
         */
        public Long getTransmissionSize() {
            return this.transmissionSize;
        }

        /**
         * @return validateKeywords
         */
        public String getValidateKeywords() {
            return this.validateKeywords;
        }

        /**
         * @return verifyWay
         */
        public Integer getVerifyWay() {
            return this.verifyWay;
        }

        /**
         * @return whiteList
         */
        public String getWhiteList() {
            return this.whiteList;
        }

        public static final class Builder {
            private Long connectionTimeout; 
            private java.util.Map < String, String > customHeaderContent; 
            private Integer downloadKernel; 
            private Integer ignoreCertificateAuthError; 
            private Integer ignoreCertificateCanceledError; 
            private Integer ignoreCertificateOutOfDateError; 
            private Integer ignoreCertificateStatusError; 
            private Integer ignoreCertificateUntrustworthyError; 
            private Integer ignoreCertificateUsingError; 
            private Integer ignoreInvalidHostError; 
            private Long monitorTimeout; 
            private Integer quickProtocol; 
            private Integer redirection; 
            private String targetUrl; 
            private Long transmissionSize; 
            private String validateKeywords; 
            private Integer verifyWay; 
            private String whiteList; 

            /**
             * Unit: milliseconds. Minimum value: 1000. Maximum value: 120000. Default value: 5000.
             */
            public Builder connectionTimeout(Long connectionTimeout) {
                this.connectionTimeout = connectionTimeout;
                return this;
            }

            /**
             * The content of the custom request header.
             */
            public Builder customHeaderContent(java.util.Map < String, String > customHeaderContent) {
                this.customHeaderContent = customHeaderContent;
                return this;
            }

            /**
             * The kernel type. Valid values:
             * <p>
             * 
             * *   1: curl
             * *   0: WinInet
             * 
             * Default value: 1
             */
            public Builder downloadKernel(Integer downloadKernel) {
                this.downloadKernel = downloadKernel;
                return this;
            }

            /**
             * Specifies whether to ignore CA certificate authentication errors. Valid values: 0: no. 1: yes. Default value: 1.
             */
            public Builder ignoreCertificateAuthError(Integer ignoreCertificateAuthError) {
                this.ignoreCertificateAuthError = ignoreCertificateAuthError;
                return this;
            }

            /**
             * Specifies whether to ignore certificate revocation errors. Valid values: 0: no. 1: yes. Default value: 1.
             */
            public Builder ignoreCertificateCanceledError(Integer ignoreCertificateCanceledError) {
                this.ignoreCertificateCanceledError = ignoreCertificateCanceledError;
                return this;
            }

            /**
             * Specifies whether to ignore certificate invalidity. Valid values: 0: no. 1: yes. Default value: 1.
             */
            public Builder ignoreCertificateOutOfDateError(Integer ignoreCertificateOutOfDateError) {
                this.ignoreCertificateOutOfDateError = ignoreCertificateOutOfDateError;
                return this;
            }

            /**
             * Specifies whether to ignore certificate status errors. Valid values: 0: no. 1: yes. Default value: 1.
             */
            public Builder ignoreCertificateStatusError(Integer ignoreCertificateStatusError) {
                this.ignoreCertificateStatusError = ignoreCertificateStatusError;
                return this;
            }

            /**
             * Specifies whether to ignore certificate incredibility. Valid values: 0: no. 1: yes. Default value: 1.
             */
            public Builder ignoreCertificateUntrustworthyError(Integer ignoreCertificateUntrustworthyError) {
                this.ignoreCertificateUntrustworthyError = ignoreCertificateUntrustworthyError;
                return this;
            }

            /**
             * Specifies whether to ignore certificate usage errors. Valid values: 0: no. 1: yes. Default value: 1.
             */
            public Builder ignoreCertificateUsingError(Integer ignoreCertificateUsingError) {
                this.ignoreCertificateUsingError = ignoreCertificateUsingError;
                return this;
            }

            /**
             * Specifies whether to ignore host invalidity. Valid values: 0: no. 1: yes. Default value: 1.
             */
            public Builder ignoreInvalidHostError(Integer ignoreInvalidHostError) {
                this.ignoreInvalidHostError = ignoreInvalidHostError;
                return this;
            }

            /**
             * The monitoring timeout period. Unit: milliseconds. Minimum value: 1000. Maximum value: 120000. Default value: 60000.
             */
            public Builder monitorTimeout(Long monitorTimeout) {
                this.monitorTimeout = monitorTimeout;
                return this;
            }

            /**
             * The QUIC protocol type. Valid values:
             * <p>
             * 
             * *   1: HTTP/1
             * *   2: HTTP/2
             * *   3: HTTP/3
             * 
             * Default value: 1
             */
            public Builder quickProtocol(Integer quickProtocol) {
                this.quickProtocol = quickProtocol;
                return this;
            }

            /**
             * Specifies whether to support redirection. Valid values: 0: no. 1: yes. Default value: 1.
             */
            public Builder redirection(Integer redirection) {
                this.redirection = redirection;
                return this;
            }

            /**
             * The URL that is used to download the file.
             */
            public Builder targetUrl(String targetUrl) {
                this.targetUrl = targetUrl;
                return this;
            }

            /**
             * The maximum file size of a single transfer. Unit: KB. Minimum value: 1. Maximum value: 20480. Valid values: 2048.
             */
            public Builder transmissionSize(Long transmissionSize) {
                this.transmissionSize = transmissionSize;
                return this;
            }

            /**
             * The keyword that is used in verification.
             */
            public Builder validateKeywords(String validateKeywords) {
                this.validateKeywords = validateKeywords;
                return this;
            }

            /**
             * The verification method. Valid values:
             * <p>
             * 
             * *   0: no verification
             * *   1: string verification
             * *   2: MD5 verification
             */
            public Builder verifyWay(Integer verifyWay) {
                this.verifyWay = verifyWay;
                return this;
            }

            /**
             * The whitelisted objects that are used to avoid DNS hijacking. The objects can be IP addresses, wildcard mask, subnet mask, or CNAME records. Separate multiple objects with vertical bars (|). Example: www.aliyun.com:203.0.3.55|203.3.44.67. It indicates that all IP addresses that belong to the www.aliyun.com domain name except 203.0.3.55 and 203.3.44.67 are hijacked.
             */
            public Builder whiteList(String whiteList) {
                this.whiteList = whiteList;
                return this;
            }

            public FileDownload build() {
                return new FileDownload(this);
            } 

        } 

    }
    public static class NetDNS extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DnsServerIpType")
        private Integer dnsServerIpType;

        @com.aliyun.core.annotation.NameInMap("NsServer")
        private String nsServer;

        @com.aliyun.core.annotation.NameInMap("QueryMethod")
        private Integer queryMethod;

        @com.aliyun.core.annotation.NameInMap("TargetUrl")
        @com.aliyun.core.annotation.Validation(required = true)
        private String targetUrl;

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private Long timeout;

        private NetDNS(Builder builder) {
            this.dnsServerIpType = builder.dnsServerIpType;
            this.nsServer = builder.nsServer;
            this.queryMethod = builder.queryMethod;
            this.targetUrl = builder.targetUrl;
            this.timeout = builder.timeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetDNS create() {
            return builder().build();
        }

        /**
         * @return dnsServerIpType
         */
        public Integer getDnsServerIpType() {
            return this.dnsServerIpType;
        }

        /**
         * @return nsServer
         */
        public String getNsServer() {
            return this.nsServer;
        }

        /**
         * @return queryMethod
         */
        public Integer getQueryMethod() {
            return this.queryMethod;
        }

        /**
         * @return targetUrl
         */
        public String getTargetUrl() {
            return this.targetUrl;
        }

        /**
         * @return timeout
         */
        public Long getTimeout() {
            return this.timeout;
        }

        public static final class Builder {
            private Integer dnsServerIpType; 
            private String nsServer; 
            private Integer queryMethod; 
            private String targetUrl; 
            private Long timeout; 

            /**
             * The IP version of the DNS server.
             * <p>
             * 
             * *   0 (default): IPv4.
             * *   1: IPv6.
             * *   2: A version is automatically selected.
             */
            public Builder dnsServerIpType(Integer dnsServerIpType) {
                this.dnsServerIpType = dnsServerIpType;
                return this;
            }

            /**
             * The IP address of the DNS server. Default value: 114.114.114.114.
             */
            public Builder nsServer(String nsServer) {
                this.nsServer = nsServer;
                return this;
            }

            /**
             * The DNS query method. Valid values:
             * <p>
             * 
             * *   0 (default): recursive
             * *   1: iterative
             */
            public Builder queryMethod(Integer queryMethod) {
                this.queryMethod = queryMethod;
                return this;
            }

            /**
             * The destination domain name.
             */
            public Builder targetUrl(String targetUrl) {
                this.targetUrl = targetUrl;
                return this;
            }

            /**
             * The timeout period for the DNS synthetic test. Unit: milliseconds. Minimum value: 1000. Maximum value: 45000. Default value: 5000.
             */
            public Builder timeout(Long timeout) {
                this.timeout = timeout;
                return this;
            }

            public NetDNS build() {
                return new NetDNS(this);
            } 

        } 

    }
    public static class NetICMP extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Interval")
        private Long interval;

        @com.aliyun.core.annotation.NameInMap("PackageNum")
        private Integer packageNum;

        @com.aliyun.core.annotation.NameInMap("PackageSize")
        private Integer packageSize;

        @com.aliyun.core.annotation.NameInMap("SplitPackage")
        private Boolean splitPackage;

        @com.aliyun.core.annotation.NameInMap("TargetUrl")
        @com.aliyun.core.annotation.Validation(required = true)
        private String targetUrl;

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private Long timeout;

        @com.aliyun.core.annotation.NameInMap("TracertEnable")
        private Boolean tracertEnable;

        @com.aliyun.core.annotation.NameInMap("TracertNumMax")
        private Integer tracertNumMax;

        @com.aliyun.core.annotation.NameInMap("TracertTimeout")
        private Long tracertTimeout;

        private NetICMP(Builder builder) {
            this.interval = builder.interval;
            this.packageNum = builder.packageNum;
            this.packageSize = builder.packageSize;
            this.splitPackage = builder.splitPackage;
            this.targetUrl = builder.targetUrl;
            this.timeout = builder.timeout;
            this.tracertEnable = builder.tracertEnable;
            this.tracertNumMax = builder.tracertNumMax;
            this.tracertTimeout = builder.tracertTimeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetICMP create() {
            return builder().build();
        }

        /**
         * @return interval
         */
        public Long getInterval() {
            return this.interval;
        }

        /**
         * @return packageNum
         */
        public Integer getPackageNum() {
            return this.packageNum;
        }

        /**
         * @return packageSize
         */
        public Integer getPackageSize() {
            return this.packageSize;
        }

        /**
         * @return splitPackage
         */
        public Boolean getSplitPackage() {
            return this.splitPackage;
        }

        /**
         * @return targetUrl
         */
        public String getTargetUrl() {
            return this.targetUrl;
        }

        /**
         * @return timeout
         */
        public Long getTimeout() {
            return this.timeout;
        }

        /**
         * @return tracertEnable
         */
        public Boolean getTracertEnable() {
            return this.tracertEnable;
        }

        /**
         * @return tracertNumMax
         */
        public Integer getTracertNumMax() {
            return this.tracertNumMax;
        }

        /**
         * @return tracertTimeout
         */
        public Long getTracertTimeout() {
            return this.tracertTimeout;
        }

        public static final class Builder {
            private Long interval; 
            private Integer packageNum; 
            private Integer packageSize; 
            private Boolean splitPackage; 
            private String targetUrl; 
            private Long timeout; 
            private Boolean tracertEnable; 
            private Integer tracertNumMax; 
            private Long tracertTimeout; 

            /**
             * The interval at which ICMP packets are sent. Unit: milliseconds. Minimum value: 200. Maximum value: 2000. Default value: 200.
             */
            public Builder interval(Long interval) {
                this.interval = interval;
                return this;
            }

            /**
             * The number of ICMP packets that are sent. Minimum value: 1. Maximum value: 50. Default value: 4.
             */
            public Builder packageNum(Integer packageNum) {
                this.packageNum = packageNum;
                return this;
            }

            /**
             * The size of each ICMP packet. Unit: bytes. Valid values: 32, 64, 128, 256, 512, 1024, 1080, and 1450.
             */
            public Builder packageSize(Integer packageSize) {
                this.packageSize = packageSize;
                return this;
            }

            /**
             * Specifies whether to split ICMP packets. Default value: true.
             */
            public Builder splitPackage(Boolean splitPackage) {
                this.splitPackage = splitPackage;
                return this;
            }

            /**
             * The destination IP address or domain name.
             */
            public Builder targetUrl(String targetUrl) {
                this.targetUrl = targetUrl;
                return this;
            }

            /**
             * The timeout period for the ICMP synthetic test. Unit: milliseconds. Minimum value: 1000. Maximum value: 300000. Default value: 20000.
             */
            public Builder timeout(Long timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * Specifies whether to enable the tracert command. Default value: true.
             */
            public Builder tracertEnable(Boolean tracertEnable) {
                this.tracertEnable = tracertEnable;
                return this;
            }

            /**
             * The maximum number of hops for the tracert command. Minimum value: 1. Maximum value: 128. Default value: 20.
             */
            public Builder tracertNumMax(Integer tracertNumMax) {
                this.tracertNumMax = tracertNumMax;
                return this;
            }

            /**
             * The timeout period of the tracert command. Unit: milliseconds. Minimum value: 1000. Maximum value: 300000. Default value: 60000.
             */
            public Builder tracertTimeout(Long tracertTimeout) {
                this.tracertTimeout = tracertTimeout;
                return this;
            }

            public NetICMP build() {
                return new NetICMP(this);
            } 

        } 

    }
    public static class NetTCP extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectTimes")
        private Integer connectTimes;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private Long interval;

        @com.aliyun.core.annotation.NameInMap("TargetUrl")
        @com.aliyun.core.annotation.Validation(required = true)
        private String targetUrl;

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private Long timeout;

        @com.aliyun.core.annotation.NameInMap("TracertEnable")
        private Boolean tracertEnable;

        @com.aliyun.core.annotation.NameInMap("TracertNumMax")
        private Integer tracertNumMax;

        @com.aliyun.core.annotation.NameInMap("TracertTimeout")
        private Long tracertTimeout;

        private NetTCP(Builder builder) {
            this.connectTimes = builder.connectTimes;
            this.interval = builder.interval;
            this.targetUrl = builder.targetUrl;
            this.timeout = builder.timeout;
            this.tracertEnable = builder.tracertEnable;
            this.tracertNumMax = builder.tracertNumMax;
            this.tracertTimeout = builder.tracertTimeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetTCP create() {
            return builder().build();
        }

        /**
         * @return connectTimes
         */
        public Integer getConnectTimes() {
            return this.connectTimes;
        }

        /**
         * @return interval
         */
        public Long getInterval() {
            return this.interval;
        }

        /**
         * @return targetUrl
         */
        public String getTargetUrl() {
            return this.targetUrl;
        }

        /**
         * @return timeout
         */
        public Long getTimeout() {
            return this.timeout;
        }

        /**
         * @return tracertEnable
         */
        public Boolean getTracertEnable() {
            return this.tracertEnable;
        }

        /**
         * @return tracertNumMax
         */
        public Integer getTracertNumMax() {
            return this.tracertNumMax;
        }

        /**
         * @return tracertTimeout
         */
        public Long getTracertTimeout() {
            return this.tracertTimeout;
        }

        public static final class Builder {
            private Integer connectTimes; 
            private Long interval; 
            private String targetUrl; 
            private Long timeout; 
            private Boolean tracertEnable; 
            private Integer tracertNumMax; 
            private Long tracertTimeout; 

            /**
             * The number of TCP connections that are established. Minimum value: 1. Maximum value: 16. Default value: 4.
             */
            public Builder connectTimes(Integer connectTimes) {
                this.connectTimes = connectTimes;
                return this;
            }

            /**
             * The interval at which TCP connections are established. Unit: milliseconds. Minimum value: 200. Maximum value: 10000. Default value: 200.
             */
            public Builder interval(Long interval) {
                this.interval = interval;
                return this;
            }

            /**
             * The IP address of the destination host.
             */
            public Builder targetUrl(String targetUrl) {
                this.targetUrl = targetUrl;
                return this;
            }

            /**
             * The timeout period for the TCP synthetic test. Unit: milliseconds. Minimum value: 1000. Maximum value: 300000. Default value: 20000.
             */
            public Builder timeout(Long timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * Specifies whether to enable the tracert command. Default value: true.
             */
            public Builder tracertEnable(Boolean tracertEnable) {
                this.tracertEnable = tracertEnable;
                return this;
            }

            /**
             * The maximum number of hops for the tracert command. Minimum value: 1. Maximum value: 128. Default value: 20.
             */
            public Builder tracertNumMax(Integer tracertNumMax) {
                this.tracertNumMax = tracertNumMax;
                return this;
            }

            /**
             * The timeout period of the tracert command. Unit: milliseconds. Minimum value: 1000. Maximum value: 300000. Default value: 60000.
             */
            public Builder tracertTimeout(Long tracertTimeout) {
                this.tracertTimeout = tracertTimeout;
                return this;
            }

            public NetTCP build() {
                return new NetTCP(this);
            } 

        } 

    }
    public static class Stream extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomHeaderContent")
        private java.util.Map < String, String > customHeaderContent;

        @com.aliyun.core.annotation.NameInMap("PlayerType")
        private Integer playerType;

        @com.aliyun.core.annotation.NameInMap("StreamAddressType")
        private Integer streamAddressType;

        @com.aliyun.core.annotation.NameInMap("StreamMonitorTimeout")
        private Integer streamMonitorTimeout;

        @com.aliyun.core.annotation.NameInMap("StreamType")
        private Integer streamType;

        @com.aliyun.core.annotation.NameInMap("TargetUrl")
        private String targetUrl;

        @com.aliyun.core.annotation.NameInMap("WhiteList")
        private String whiteList;

        private Stream(Builder builder) {
            this.customHeaderContent = builder.customHeaderContent;
            this.playerType = builder.playerType;
            this.streamAddressType = builder.streamAddressType;
            this.streamMonitorTimeout = builder.streamMonitorTimeout;
            this.streamType = builder.streamType;
            this.targetUrl = builder.targetUrl;
            this.whiteList = builder.whiteList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Stream create() {
            return builder().build();
        }

        /**
         * @return customHeaderContent
         */
        public java.util.Map < String, String > getCustomHeaderContent() {
            return this.customHeaderContent;
        }

        /**
         * @return playerType
         */
        public Integer getPlayerType() {
            return this.playerType;
        }

        /**
         * @return streamAddressType
         */
        public Integer getStreamAddressType() {
            return this.streamAddressType;
        }

        /**
         * @return streamMonitorTimeout
         */
        public Integer getStreamMonitorTimeout() {
            return this.streamMonitorTimeout;
        }

        /**
         * @return streamType
         */
        public Integer getStreamType() {
            return this.streamType;
        }

        /**
         * @return targetUrl
         */
        public String getTargetUrl() {
            return this.targetUrl;
        }

        /**
         * @return whiteList
         */
        public String getWhiteList() {
            return this.whiteList;
        }

        public static final class Builder {
            private java.util.Map < String, String > customHeaderContent; 
            private Integer playerType; 
            private Integer streamAddressType; 
            private Integer streamMonitorTimeout; 
            private Integer streamType; 
            private String targetUrl; 
            private String whiteList; 

            /**
             * The custom header. Format: JSON map.
             */
            public Builder customHeaderContent(java.util.Map < String, String > customHeaderContent) {
                this.customHeaderContent = customHeaderContent;
                return this;
            }

            /**
             * The player. Default value: 12. Valid values:
             * <p>
             * 
             * *   12: VLC
             * *   2: Flash Player
             */
            public Builder playerType(Integer playerType) {
                this.playerType = playerType;
                return this;
            }

            /**
             * The address type of the resource. Valid values:
             * <p>
             * 
             * *   1: resource URL
             * *   0 (default): page URL
             */
            public Builder streamAddressType(Integer streamAddressType) {
                this.streamAddressType = streamAddressType;
                return this;
            }

            /**
             * The monitoring duration. Unit: seconds. Maximum and default value: 60.
             */
            public Builder streamMonitorTimeout(Integer streamMonitorTimeout) {
                this.streamMonitorTimeout = streamMonitorTimeout;
                return this;
            }

            /**
             * Specifies whether the resource is a video or audio. Valid values: 0: video. 1: audio.
             */
            public Builder streamType(Integer streamType) {
                this.streamType = streamType;
                return this;
            }

            /**
             * The resource URL of the streaming media.
             */
            public Builder targetUrl(String targetUrl) {
                this.targetUrl = targetUrl;
                return this;
            }

            /**
             * The whitelisted objects that are used to avoid DNS hijacking. The objects can be IP addresses, wildcard mask, subnet mask, or CNAME records. Separate multiple objects with vertical bars (|). Example: www.aliyun.com:203.0.3.55|203.3.44.67. It indicates that all IP addresses that belong to the www.aliyun.com domain name except 203.0.3.55 and 203.3.44.67 are hijacked.
             */
            public Builder whiteList(String whiteList) {
                this.whiteList = whiteList;
                return this;
            }

            public Stream build() {
                return new Stream(this);
            } 

        } 

    }
    public static class Website extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutomaticScrolling")
        private Integer automaticScrolling;

        @com.aliyun.core.annotation.NameInMap("CustomHeader")
        private Integer customHeader;

        @com.aliyun.core.annotation.NameInMap("CustomHeaderContent")
        private java.util.Map < String, String > customHeaderContent;

        @com.aliyun.core.annotation.NameInMap("DNSHijackWhitelist")
        private String DNSHijackWhitelist;

        @com.aliyun.core.annotation.NameInMap("DisableCache")
        private Integer disableCache;

        @com.aliyun.core.annotation.NameInMap("DisableCompression")
        private Integer disableCompression;

        @com.aliyun.core.annotation.NameInMap("ElementBlacklist")
        private String elementBlacklist;

        @com.aliyun.core.annotation.NameInMap("FilterInvalidIP")
        private Integer filterInvalidIP;

        @com.aliyun.core.annotation.NameInMap("FlowHijackJumpTimes")
        private Integer flowHijackJumpTimes;

        @com.aliyun.core.annotation.NameInMap("FlowHijackLogo")
        private String flowHijackLogo;

        @com.aliyun.core.annotation.NameInMap("IgnoreCertificateError")
        private Integer ignoreCertificateError;

        @com.aliyun.core.annotation.NameInMap("MonitorTimeout")
        private Long monitorTimeout;

        @com.aliyun.core.annotation.NameInMap("PageTamper")
        private String pageTamper;

        @com.aliyun.core.annotation.NameInMap("Redirection")
        private Integer redirection;

        @com.aliyun.core.annotation.NameInMap("SlowElementThreshold")
        private Long slowElementThreshold;

        @com.aliyun.core.annotation.NameInMap("TargetUrl")
        @com.aliyun.core.annotation.Validation(required = true)
        private String targetUrl;

        @com.aliyun.core.annotation.NameInMap("VerifyStringBlacklist")
        private String verifyStringBlacklist;

        @com.aliyun.core.annotation.NameInMap("VerifyStringWhitelist")
        private String verifyStringWhitelist;

        @com.aliyun.core.annotation.NameInMap("WaitCompletionTime")
        private Long waitCompletionTime;

        private Website(Builder builder) {
            this.automaticScrolling = builder.automaticScrolling;
            this.customHeader = builder.customHeader;
            this.customHeaderContent = builder.customHeaderContent;
            this.DNSHijackWhitelist = builder.DNSHijackWhitelist;
            this.disableCache = builder.disableCache;
            this.disableCompression = builder.disableCompression;
            this.elementBlacklist = builder.elementBlacklist;
            this.filterInvalidIP = builder.filterInvalidIP;
            this.flowHijackJumpTimes = builder.flowHijackJumpTimes;
            this.flowHijackLogo = builder.flowHijackLogo;
            this.ignoreCertificateError = builder.ignoreCertificateError;
            this.monitorTimeout = builder.monitorTimeout;
            this.pageTamper = builder.pageTamper;
            this.redirection = builder.redirection;
            this.slowElementThreshold = builder.slowElementThreshold;
            this.targetUrl = builder.targetUrl;
            this.verifyStringBlacklist = builder.verifyStringBlacklist;
            this.verifyStringWhitelist = builder.verifyStringWhitelist;
            this.waitCompletionTime = builder.waitCompletionTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Website create() {
            return builder().build();
        }

        /**
         * @return automaticScrolling
         */
        public Integer getAutomaticScrolling() {
            return this.automaticScrolling;
        }

        /**
         * @return customHeader
         */
        public Integer getCustomHeader() {
            return this.customHeader;
        }

        /**
         * @return customHeaderContent
         */
        public java.util.Map < String, String > getCustomHeaderContent() {
            return this.customHeaderContent;
        }

        /**
         * @return DNSHijackWhitelist
         */
        public String getDNSHijackWhitelist() {
            return this.DNSHijackWhitelist;
        }

        /**
         * @return disableCache
         */
        public Integer getDisableCache() {
            return this.disableCache;
        }

        /**
         * @return disableCompression
         */
        public Integer getDisableCompression() {
            return this.disableCompression;
        }

        /**
         * @return elementBlacklist
         */
        public String getElementBlacklist() {
            return this.elementBlacklist;
        }

        /**
         * @return filterInvalidIP
         */
        public Integer getFilterInvalidIP() {
            return this.filterInvalidIP;
        }

        /**
         * @return flowHijackJumpTimes
         */
        public Integer getFlowHijackJumpTimes() {
            return this.flowHijackJumpTimes;
        }

        /**
         * @return flowHijackLogo
         */
        public String getFlowHijackLogo() {
            return this.flowHijackLogo;
        }

        /**
         * @return ignoreCertificateError
         */
        public Integer getIgnoreCertificateError() {
            return this.ignoreCertificateError;
        }

        /**
         * @return monitorTimeout
         */
        public Long getMonitorTimeout() {
            return this.monitorTimeout;
        }

        /**
         * @return pageTamper
         */
        public String getPageTamper() {
            return this.pageTamper;
        }

        /**
         * @return redirection
         */
        public Integer getRedirection() {
            return this.redirection;
        }

        /**
         * @return slowElementThreshold
         */
        public Long getSlowElementThreshold() {
            return this.slowElementThreshold;
        }

        /**
         * @return targetUrl
         */
        public String getTargetUrl() {
            return this.targetUrl;
        }

        /**
         * @return verifyStringBlacklist
         */
        public String getVerifyStringBlacklist() {
            return this.verifyStringBlacklist;
        }

        /**
         * @return verifyStringWhitelist
         */
        public String getVerifyStringWhitelist() {
            return this.verifyStringWhitelist;
        }

        /**
         * @return waitCompletionTime
         */
        public Long getWaitCompletionTime() {
            return this.waitCompletionTime;
        }

        public static final class Builder {
            private Integer automaticScrolling; 
            private Integer customHeader; 
            private java.util.Map < String, String > customHeaderContent; 
            private String DNSHijackWhitelist; 
            private Integer disableCache; 
            private Integer disableCompression; 
            private String elementBlacklist; 
            private Integer filterInvalidIP; 
            private Integer flowHijackJumpTimes; 
            private String flowHijackLogo; 
            private Integer ignoreCertificateError; 
            private Long monitorTimeout; 
            private String pageTamper; 
            private Integer redirection; 
            private Long slowElementThreshold; 
            private String targetUrl; 
            private String verifyStringBlacklist; 
            private String verifyStringWhitelist; 
            private Long waitCompletionTime; 

            /**
             * Specifies whether to automatically scroll up and down the screen to load a page.
             * <p>
             * 
             * *   0 (default): no
             * *   1: yes
             */
            public Builder automaticScrolling(Integer automaticScrolling) {
                this.automaticScrolling = automaticScrolling;
                return this;
            }

            /**
             * Specifies whether to create a custom header.
             * <p>
             * 
             * *   0 (default): No custom header is created.
             * *   1: A custom header is created for the first packet.
             * *   2: A custom header is created for all packets.
             */
            public Builder customHeader(Integer customHeader) {
                this.customHeader = customHeader;
                return this;
            }

            /**
             * The custom header. Format: JSON map.
             */
            public Builder customHeaderContent(java.util.Map < String, String > customHeaderContent) {
                this.customHeaderContent = customHeaderContent;
                return this;
            }

            /**
             * If the IP address or CNAME record resolved from a domain name is not included in the DNS whitelist, you cannot access the domain name, or an IP address that belongs to a different domain name is returned. If the IP address or CNAME record is included in the DNS whitelist, DNS hijacking does not occur.
             * <p>
             * 
             * Format: \<domain name>:\<objects>. The objects can be IP addresses, wildcard mask, subnet mask, or CNAME records. Separate multiple objects with vertical bars (|). Example: www.aliyun.com:203.0.3.55|203.3.44.67. It indicates that all IP addresses that belong to the www.aliyun.com domain name except 203.0.3.55 and 203.3.44.67 are hijacked.
             */
            public Builder DNSHijackWhitelist(String DNSHijackWhitelist) {
                this.DNSHijackWhitelist = DNSHijackWhitelist;
                return this;
            }

            /**
             * Specifies whether to disable caching.
             * <p>
             * 
             * *   0: no
             * *   1 (default): yes
             */
            public Builder disableCache(Integer disableCache) {
                this.disableCache = disableCache;
                return this;
            }

            /**
             * Specifies whether to accept compressed files based on the HTTP Accept-Encoding request header. Valid values: 0: no. 1: yes. Default value: 0.
             */
            public Builder disableCompression(Integer disableCompression) {
                this.disableCompression = disableCompression;
                return this;
            }

            /**
             * The elements not to be loaded in the page loading process.
             */
            public Builder elementBlacklist(String elementBlacklist) {
                this.elementBlacklist = elementBlacklist;
                return this;
            }

            /**
             * Specifies whether to exclude invalid IP addresses. Valid values: 0: yes. 1: no. Default value: 0.
             */
            public Builder filterInvalidIP(Integer filterInvalidIP) {
                this.filterInvalidIP = filterInvalidIP;
                return this;
            }

            /**
             * The total number of elements on the page.
             */
            public Builder flowHijackJumpTimes(Integer flowHijackJumpTimes) {
                this.flowHijackJumpTimes = flowHijackJumpTimes;
                return this;
            }

            /**
             * The keyword that is used to identify hijacking. Asterisks (\*) are allowed.
             */
            public Builder flowHijackLogo(String flowHijackLogo) {
                this.flowHijackLogo = flowHijackLogo;
                return this;
            }

            /**
             * Specifies whether to ignore certificate errors during certificate verification in the SSL handshake process and continue browsing. Valid values: 0: no. 1: yes. Default value: 1.
             */
            public Builder ignoreCertificateError(Integer ignoreCertificateError) {
                this.ignoreCertificateError = ignoreCertificateError;
                return this;
            }

            /**
             * The monitoring timeout period. Unit: milliseconds. This parameter is optional. Default value: 20000.
             */
            public Builder monitorTimeout(Long monitorTimeout) {
                this.monitorTimeout = monitorTimeout;
                return this;
            }

            /**
             * Elements that are not included in the whitelist and appear on the page are tampered with. These elements can be pop-up ads, floating ads, and page redirection.
             * <p>
             * 
             * Format: \<domain name>:\<elements>. The elements can be wildcard masks. Separate multiple elements with vertical bars (|). Example: www.aliyun.com:|/cc/bb/a.gif|/vv/bb/cc.jpg. It indicates that all elements that belong to the www.aliyun.com domain name except the basic documents, /cc/bb/a.gif, and /vv/bb/cc.jpg are tampered with.
             */
            public Builder pageTamper(String pageTamper) {
                this.pageTamper = pageTamper;
                return this;
            }

            /**
             * Specifies whether to continue browsing after redirection. Valid values: 0: no. 1: yes. Default value: 1.
             */
            public Builder redirection(Integer redirection) {
                this.redirection = redirection;
                return this;
            }

            /**
             * The time threshold that is used to define a slow element. Unit: milliseconds. Default value: 5000. Minimum value: 1. Maximum value: 300000.
             */
            public Builder slowElementThreshold(Long slowElementThreshold) {
                this.slowElementThreshold = slowElementThreshold;
                return this;
            }

            /**
             * The URL of the website.
             */
            public Builder targetUrl(String targetUrl) {
                this.targetUrl = targetUrl;
                return this;
            }

            /**
             * An arbitrary string in the source code of the page for verification. If the source code returned by the client contains a string that is in the blacklist, the 650 error code is reported, which indicates that the string fails to be verified. Separate multiple strings with vertical bars (|).
             */
            public Builder verifyStringBlacklist(String verifyStringBlacklist) {
                this.verifyStringBlacklist = verifyStringBlacklist;
                return this;
            }

            /**
             * An arbitrary string in the source code of the page for verification. If the source code returned by the client contains a string that is not in the whitelist, the 650 error code is reported, which indicates that the string fails to be verified. Separate multiple strings with vertical bars (|).
             */
            public Builder verifyStringWhitelist(String verifyStringWhitelist) {
                this.verifyStringWhitelist = verifyStringWhitelist;
                return this;
            }

            /**
             * The maximum waiting time. Unit: milliseconds. Default value: 5000. Minimum value: 5000. Maximum value: 300000.
             */
            public Builder waitCompletionTime(Long waitCompletionTime) {
                this.waitCompletionTime = waitCompletionTime;
                return this;
            }

            public Website build() {
                return new Website(this);
            } 

        } 

    }
    public static class MonitorConf extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiHTTP")
        private ApiHTTP apiHTTP;

        @com.aliyun.core.annotation.NameInMap("FileDownload")
        private FileDownload fileDownload;

        @com.aliyun.core.annotation.NameInMap("NetDNS")
        private NetDNS netDNS;

        @com.aliyun.core.annotation.NameInMap("NetICMP")
        private NetICMP netICMP;

        @com.aliyun.core.annotation.NameInMap("NetTCP")
        private NetTCP netTCP;

        @com.aliyun.core.annotation.NameInMap("Stream")
        private Stream stream;

        @com.aliyun.core.annotation.NameInMap("Website")
        private Website website;

        private MonitorConf(Builder builder) {
            this.apiHTTP = builder.apiHTTP;
            this.fileDownload = builder.fileDownload;
            this.netDNS = builder.netDNS;
            this.netICMP = builder.netICMP;
            this.netTCP = builder.netTCP;
            this.stream = builder.stream;
            this.website = builder.website;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonitorConf create() {
            return builder().build();
        }

        /**
         * @return apiHTTP
         */
        public ApiHTTP getApiHTTP() {
            return this.apiHTTP;
        }

        /**
         * @return fileDownload
         */
        public FileDownload getFileDownload() {
            return this.fileDownload;
        }

        /**
         * @return netDNS
         */
        public NetDNS getNetDNS() {
            return this.netDNS;
        }

        /**
         * @return netICMP
         */
        public NetICMP getNetICMP() {
            return this.netICMP;
        }

        /**
         * @return netTCP
         */
        public NetTCP getNetTCP() {
            return this.netTCP;
        }

        /**
         * @return stream
         */
        public Stream getStream() {
            return this.stream;
        }

        /**
         * @return website
         */
        public Website getWebsite() {
            return this.website;
        }

        public static final class Builder {
            private ApiHTTP apiHTTP; 
            private FileDownload fileDownload; 
            private NetDNS netDNS; 
            private NetICMP netICMP; 
            private NetTCP netTCP; 
            private Stream stream; 
            private Website website; 

            /**
             * The parameters of the HTTP(S) synthetic test.
             */
            public Builder apiHTTP(ApiHTTP apiHTTP) {
                this.apiHTTP = apiHTTP;
                return this;
            }

            /**
             * The parameters of file downloading.
             */
            public Builder fileDownload(FileDownload fileDownload) {
                this.fileDownload = fileDownload;
                return this;
            }

            /**
             * The parameters of the DNS synthetic test. This parameter is required if the TaskType parameter is set to 3.
             */
            public Builder netDNS(NetDNS netDNS) {
                this.netDNS = netDNS;
                return this;
            }

            /**
             * The parameters of the ICMP synthetic test. This parameter is required if the TaskType parameter is set to 1.
             */
            public Builder netICMP(NetICMP netICMP) {
                this.netICMP = netICMP;
                return this;
            }

            /**
             * The parameters of the TCP synthetic test. This parameter is required if the TaskType parameter is set to 2.
             */
            public Builder netTCP(NetTCP netTCP) {
                this.netTCP = netTCP;
                return this;
            }

            /**
             * The parameters of the streaming-media synthetic test.
             */
            public Builder stream(Stream stream) {
                this.stream = stream;
                return this;
            }

            /**
             * The parameters of the website speed measurement.
             */
            public Builder website(Website website) {
                this.website = website;
                return this;
            }

            public MonitorConf build() {
                return new MonitorConf(this);
            } 

        } 

    }
    public static class Monitors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CityCode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String cityCode;

        @com.aliyun.core.annotation.NameInMap("ClientType")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer clientType;

        @com.aliyun.core.annotation.NameInMap("OperatorCode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String operatorCode;

        private Monitors(Builder builder) {
            this.cityCode = builder.cityCode;
            this.clientType = builder.clientType;
            this.operatorCode = builder.operatorCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Monitors create() {
            return builder().build();
        }

        /**
         * @return cityCode
         */
        public String getCityCode() {
            return this.cityCode;
        }

        /**
         * @return clientType
         */
        public Integer getClientType() {
            return this.clientType;
        }

        /**
         * @return operatorCode
         */
        public String getOperatorCode() {
            return this.operatorCode;
        }

        public static final class Builder {
            private String cityCode; 
            private Integer clientType; 
            private String operatorCode; 

            /**
             * The city code.
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * The client type of the detection point. Valid values:
             * <p>
             * 
             * - 1: data center
             * - 2: Internet
             * - 3: mobile device
             * - 4: ECS instance
             */
            public Builder clientType(Integer clientType) {
                this.clientType = clientType;
                return this;
            }

            /**
             * The carrier code.
             */
            public Builder operatorCode(String operatorCode) {
                this.operatorCode = operatorCode;
                return this;
            }

            public Monitors build() {
                return new Monitors(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The key of the tag.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
