// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTimingSyntheticTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateTimingSyntheticTaskRequest</p>
 */
public class CreateTimingSyntheticTaskRequest extends Request {
    @Query
    @NameInMap("AvailableAssertions")
    private java.util.List < AvailableAssertions> availableAssertions;

    @Query
    @NameInMap("CommonSetting")
    private CommonSetting commonSetting;

    @Query
    @NameInMap("CustomPeriod")
    private CustomPeriod customPeriod;

    @Query
    @NameInMap("Frequency")
    @Validation(required = true)
    private String frequency;

    @Query
    @NameInMap("MonitorCategory")
    @Validation(required = true)
    private Integer monitorCategory;

    @Query
    @NameInMap("MonitorConf")
    @Validation(required = true)
    private MonitorConf monitorConf;

    @Query
    @NameInMap("Monitors")
    @Validation(required = true)
    private java.util.List < Monitors> monitors;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    @Query
    @NameInMap("TaskType")
    @Validation(required = true)
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
         * AvailableAssertions.
         */
        public Builder availableAssertions(java.util.List < AvailableAssertions> availableAssertions) {
            String availableAssertionsShrink = shrink(availableAssertions, "AvailableAssertions", "json");
            this.putQueryParameter("AvailableAssertions", availableAssertionsShrink);
            this.availableAssertions = availableAssertions;
            return this;
        }

        /**
         * CommonSetting.
         */
        public Builder commonSetting(CommonSetting commonSetting) {
            String commonSettingShrink = shrink(commonSetting, "CommonSetting", "json");
            this.putQueryParameter("CommonSetting", commonSettingShrink);
            this.commonSetting = commonSetting;
            return this;
        }

        /**
         * CustomPeriod.
         */
        public Builder customPeriod(CustomPeriod customPeriod) {
            String customPeriodShrink = shrink(customPeriod, "CustomPeriod", "json");
            this.putQueryParameter("CustomPeriod", customPeriodShrink);
            this.customPeriod = customPeriod;
            return this;
        }

        /**
         * Frequency.
         */
        public Builder frequency(String frequency) {
            this.putQueryParameter("Frequency", frequency);
            this.frequency = frequency;
            return this;
        }

        /**
         * MonitorCategory.
         */
        public Builder monitorCategory(Integer monitorCategory) {
            this.putQueryParameter("MonitorCategory", monitorCategory);
            this.monitorCategory = monitorCategory;
            return this;
        }

        /**
         * MonitorConf.
         */
        public Builder monitorConf(MonitorConf monitorConf) {
            String monitorConfShrink = shrink(monitorConf, "MonitorConf", "json");
            this.putQueryParameter("MonitorConf", monitorConfShrink);
            this.monitorConf = monitorConf;
            return this;
        }

        /**
         * Monitors.
         */
        public Builder monitors(java.util.List < Monitors> monitors) {
            String monitorsShrink = shrink(monitors, "Monitors", "json");
            this.putQueryParameter("Monitors", monitorsShrink);
            this.monitors = monitors;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * Tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * TaskType.
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
        @NameInMap("Expect")
        @Validation(required = true)
        private String expect;

        @NameInMap("Operator")
        @Validation(required = true)
        private String operator;

        @NameInMap("Target")
        private String target;

        @NameInMap("Type")
        @Validation(required = true)
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
             * Expect.
             */
            public Builder expect(String expect) {
                this.expect = expect;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * Target.
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * Type.
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
        @NameInMap("Domain")
        @Validation(required = true)
        private String domain;

        @NameInMap("IpType")
        @Validation(required = true)
        private Integer ipType;

        @NameInMap("Ips")
        @Validation(required = true)
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
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * IpType.
             */
            public Builder ipType(Integer ipType) {
                this.ipType = ipType;
                return this;
            }

            /**
             * Ips.
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
        @NameInMap("Hosts")
        @Validation(required = true)
        private java.util.List < Hosts> hosts;

        @NameInMap("SelectType")
        @Validation(required = true)
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
             * Hosts.
             */
            public Builder hosts(java.util.List < Hosts> hosts) {
                this.hosts = hosts;
                return this;
            }

            /**
             * SelectType.
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
        @NameInMap("PrometheusClusterId")
        private String prometheusClusterId;

        @NameInMap("PrometheusClusterRegion")
        private String prometheusClusterRegion;

        @NameInMap("PrometheusLabels")
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
             * PrometheusClusterId.
             */
            public Builder prometheusClusterId(String prometheusClusterId) {
                this.prometheusClusterId = prometheusClusterId;
                return this;
            }

            /**
             * PrometheusClusterRegion.
             */
            public Builder prometheusClusterRegion(String prometheusClusterRegion) {
                this.prometheusClusterRegion = prometheusClusterRegion;
                return this;
            }

            /**
             * PrometheusLabels.
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
        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SecureGroupId")
        private String secureGroupId;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcId")
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
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * SecureGroupId.
             */
            public Builder secureGroupId(String secureGroupId) {
                this.secureGroupId = secureGroupId;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VpcId.
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
        @NameInMap("CustomHost")
        private CustomHost customHost;

        @NameInMap("CustomPrometheusSetting")
        private CustomPrometheusSetting customPrometheusSetting;

        @NameInMap("CustomVPCSetting")
        private CustomVPCSetting customVPCSetting;

        @NameInMap("IpType")
        private Integer ipType;

        @NameInMap("IsOpenTrace")
        private Boolean isOpenTrace;

        @NameInMap("MonitorSamples")
        private Integer monitorSamples;

        @NameInMap("TraceClientType")
        private Integer traceClientType;

        @NameInMap("XtraceRegion")
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
             * CustomHost.
             */
            public Builder customHost(CustomHost customHost) {
                this.customHost = customHost;
                return this;
            }

            /**
             * CustomPrometheusSetting.
             */
            public Builder customPrometheusSetting(CustomPrometheusSetting customPrometheusSetting) {
                this.customPrometheusSetting = customPrometheusSetting;
                return this;
            }

            /**
             * CustomVPCSetting.
             */
            public Builder customVPCSetting(CustomVPCSetting customVPCSetting) {
                this.customVPCSetting = customVPCSetting;
                return this;
            }

            /**
             * IpType.
             */
            public Builder ipType(Integer ipType) {
                this.ipType = ipType;
                return this;
            }

            /**
             * IsOpenTrace.
             */
            public Builder isOpenTrace(Boolean isOpenTrace) {
                this.isOpenTrace = isOpenTrace;
                return this;
            }

            /**
             * MonitorSamples.
             */
            public Builder monitorSamples(Integer monitorSamples) {
                this.monitorSamples = monitorSamples;
                return this;
            }

            /**
             * TraceClientType.
             */
            public Builder traceClientType(Integer traceClientType) {
                this.traceClientType = traceClientType;
                return this;
            }

            /**
             * XtraceRegion.
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
        @NameInMap("EndHour")
        @Validation(required = true)
        private Integer endHour;

        @NameInMap("StartHour")
        @Validation(required = true)
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
             * EndHour.
             */
            public Builder endHour(Integer endHour) {
                this.endHour = endHour;
                return this;
            }

            /**
             * StartHour.
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
        @NameInMap("Content")
        private String content;

        @NameInMap("Type")
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
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Type.
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
        @NameInMap("CheckCert")
        private Boolean checkCert;

        @NameInMap("ConnectTimeout")
        private Long connectTimeout;

        @NameInMap("Method")
        private String method;

        @NameInMap("ProtocolAlpnProtocol")
        private Integer protocolAlpnProtocol;

        @NameInMap("RequestBody")
        private RequestBody requestBody;

        @NameInMap("RequestHeaders")
        private java.util.Map < String, String > requestHeaders;

        @NameInMap("TargetUrl")
        @Validation(required = true)
        private String targetUrl;

        @NameInMap("Timeout")
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
             * CheckCert.
             */
            public Builder checkCert(Boolean checkCert) {
                this.checkCert = checkCert;
                return this;
            }

            /**
             * ConnectTimeout.
             */
            public Builder connectTimeout(Long connectTimeout) {
                this.connectTimeout = connectTimeout;
                return this;
            }

            /**
             * Method.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * ProtocolAlpnProtocol.
             */
            public Builder protocolAlpnProtocol(Integer protocolAlpnProtocol) {
                this.protocolAlpnProtocol = protocolAlpnProtocol;
                return this;
            }

            /**
             * RequestBody.
             */
            public Builder requestBody(RequestBody requestBody) {
                this.requestBody = requestBody;
                return this;
            }

            /**
             * RequestHeaders.
             */
            public Builder requestHeaders(java.util.Map < String, String > requestHeaders) {
                this.requestHeaders = requestHeaders;
                return this;
            }

            /**
             * TargetUrl.
             */
            public Builder targetUrl(String targetUrl) {
                this.targetUrl = targetUrl;
                return this;
            }

            /**
             * Timeout.
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
        @NameInMap("ConnectionTimeout")
        private Long connectionTimeout;

        @NameInMap("CustomHeaderContent")
        private java.util.Map < String, String > customHeaderContent;

        @NameInMap("DownloadKernel")
        private Integer downloadKernel;

        @NameInMap("IgnoreCertificateAuthError")
        private Integer ignoreCertificateAuthError;

        @NameInMap("IgnoreCertificateCanceledError")
        private Integer ignoreCertificateCanceledError;

        @NameInMap("IgnoreCertificateOutOfDateError")
        private Integer ignoreCertificateOutOfDateError;

        @NameInMap("IgnoreCertificateStatusError")
        private Integer ignoreCertificateStatusError;

        @NameInMap("IgnoreCertificateUntrustworthyError")
        private Integer ignoreCertificateUntrustworthyError;

        @NameInMap("IgnoreCertificateUsingError")
        private Integer ignoreCertificateUsingError;

        @NameInMap("IgnoreInvalidHostError")
        private Integer ignoreInvalidHostError;

        @NameInMap("MonitorTimeout")
        private Long monitorTimeout;

        @NameInMap("QuickProtocol")
        private Integer quickProtocol;

        @NameInMap("Redirection")
        private Integer redirection;

        @NameInMap("TargetUrl")
        @Validation(required = true)
        private String targetUrl;

        @NameInMap("TransmissionSize")
        private Long transmissionSize;

        @NameInMap("ValidateKeywords")
        private String validateKeywords;

        @NameInMap("VerifyWay")
        private Integer verifyWay;

        @NameInMap("WhiteList")
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
             * ConnectionTimeout.
             */
            public Builder connectionTimeout(Long connectionTimeout) {
                this.connectionTimeout = connectionTimeout;
                return this;
            }

            /**
             * CustomHeaderContent.
             */
            public Builder customHeaderContent(java.util.Map < String, String > customHeaderContent) {
                this.customHeaderContent = customHeaderContent;
                return this;
            }

            /**
             * DownloadKernel.
             */
            public Builder downloadKernel(Integer downloadKernel) {
                this.downloadKernel = downloadKernel;
                return this;
            }

            /**
             * IgnoreCertificateAuthError.
             */
            public Builder ignoreCertificateAuthError(Integer ignoreCertificateAuthError) {
                this.ignoreCertificateAuthError = ignoreCertificateAuthError;
                return this;
            }

            /**
             * IgnoreCertificateCanceledError.
             */
            public Builder ignoreCertificateCanceledError(Integer ignoreCertificateCanceledError) {
                this.ignoreCertificateCanceledError = ignoreCertificateCanceledError;
                return this;
            }

            /**
             * IgnoreCertificateOutOfDateError.
             */
            public Builder ignoreCertificateOutOfDateError(Integer ignoreCertificateOutOfDateError) {
                this.ignoreCertificateOutOfDateError = ignoreCertificateOutOfDateError;
                return this;
            }

            /**
             * IgnoreCertificateStatusError.
             */
            public Builder ignoreCertificateStatusError(Integer ignoreCertificateStatusError) {
                this.ignoreCertificateStatusError = ignoreCertificateStatusError;
                return this;
            }

            /**
             * IgnoreCertificateUntrustworthyError.
             */
            public Builder ignoreCertificateUntrustworthyError(Integer ignoreCertificateUntrustworthyError) {
                this.ignoreCertificateUntrustworthyError = ignoreCertificateUntrustworthyError;
                return this;
            }

            /**
             * IgnoreCertificateUsingError.
             */
            public Builder ignoreCertificateUsingError(Integer ignoreCertificateUsingError) {
                this.ignoreCertificateUsingError = ignoreCertificateUsingError;
                return this;
            }

            /**
             * IgnoreInvalidHostError.
             */
            public Builder ignoreInvalidHostError(Integer ignoreInvalidHostError) {
                this.ignoreInvalidHostError = ignoreInvalidHostError;
                return this;
            }

            /**
             * MonitorTimeout.
             */
            public Builder monitorTimeout(Long monitorTimeout) {
                this.monitorTimeout = monitorTimeout;
                return this;
            }

            /**
             * QuickProtocol.
             */
            public Builder quickProtocol(Integer quickProtocol) {
                this.quickProtocol = quickProtocol;
                return this;
            }

            /**
             * Redirection.
             */
            public Builder redirection(Integer redirection) {
                this.redirection = redirection;
                return this;
            }

            /**
             * TargetUrl.
             */
            public Builder targetUrl(String targetUrl) {
                this.targetUrl = targetUrl;
                return this;
            }

            /**
             * TransmissionSize.
             */
            public Builder transmissionSize(Long transmissionSize) {
                this.transmissionSize = transmissionSize;
                return this;
            }

            /**
             * ValidateKeywords.
             */
            public Builder validateKeywords(String validateKeywords) {
                this.validateKeywords = validateKeywords;
                return this;
            }

            /**
             * VerifyWay.
             */
            public Builder verifyWay(Integer verifyWay) {
                this.verifyWay = verifyWay;
                return this;
            }

            /**
             * WhiteList.
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
        @NameInMap("DnsServerIpType")
        private Integer dnsServerIpType;

        @NameInMap("NsServer")
        private String nsServer;

        @NameInMap("QueryMethod")
        private Integer queryMethod;

        @NameInMap("TargetUrl")
        @Validation(required = true)
        private String targetUrl;

        @NameInMap("Timeout")
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
             * DnsServerIpType.
             */
            public Builder dnsServerIpType(Integer dnsServerIpType) {
                this.dnsServerIpType = dnsServerIpType;
                return this;
            }

            /**
             * NsServer.
             */
            public Builder nsServer(String nsServer) {
                this.nsServer = nsServer;
                return this;
            }

            /**
             * QueryMethod.
             */
            public Builder queryMethod(Integer queryMethod) {
                this.queryMethod = queryMethod;
                return this;
            }

            /**
             * TargetUrl.
             */
            public Builder targetUrl(String targetUrl) {
                this.targetUrl = targetUrl;
                return this;
            }

            /**
             * Timeout.
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
        @NameInMap("Interval")
        private Long interval;

        @NameInMap("PackageNum")
        private Integer packageNum;

        @NameInMap("PackageSize")
        private Integer packageSize;

        @NameInMap("SplitPackage")
        private Boolean splitPackage;

        @NameInMap("TargetUrl")
        @Validation(required = true)
        private String targetUrl;

        @NameInMap("Timeout")
        private Long timeout;

        @NameInMap("TracertEnable")
        private Boolean tracertEnable;

        @NameInMap("TracertNumMax")
        private Integer tracertNumMax;

        @NameInMap("TracertTimeout")
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
             * Interval.
             */
            public Builder interval(Long interval) {
                this.interval = interval;
                return this;
            }

            /**
             * PackageNum.
             */
            public Builder packageNum(Integer packageNum) {
                this.packageNum = packageNum;
                return this;
            }

            /**
             * PackageSize.
             */
            public Builder packageSize(Integer packageSize) {
                this.packageSize = packageSize;
                return this;
            }

            /**
             * SplitPackage.
             */
            public Builder splitPackage(Boolean splitPackage) {
                this.splitPackage = splitPackage;
                return this;
            }

            /**
             * TargetUrl.
             */
            public Builder targetUrl(String targetUrl) {
                this.targetUrl = targetUrl;
                return this;
            }

            /**
             * Timeout.
             */
            public Builder timeout(Long timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * TracertEnable.
             */
            public Builder tracertEnable(Boolean tracertEnable) {
                this.tracertEnable = tracertEnable;
                return this;
            }

            /**
             * TracertNumMax.
             */
            public Builder tracertNumMax(Integer tracertNumMax) {
                this.tracertNumMax = tracertNumMax;
                return this;
            }

            /**
             * TracertTimeout.
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
        @NameInMap("ConnectTimes")
        private Integer connectTimes;

        @NameInMap("Interval")
        private Long interval;

        @NameInMap("TargetUrl")
        @Validation(required = true)
        private String targetUrl;

        @NameInMap("Timeout")
        private Long timeout;

        @NameInMap("TracertEnable")
        private Boolean tracertEnable;

        @NameInMap("TracertNumMax")
        private Integer tracertNumMax;

        @NameInMap("TracertTimeout")
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
             * ConnectTimes.
             */
            public Builder connectTimes(Integer connectTimes) {
                this.connectTimes = connectTimes;
                return this;
            }

            /**
             * Interval.
             */
            public Builder interval(Long interval) {
                this.interval = interval;
                return this;
            }

            /**
             * TargetUrl.
             */
            public Builder targetUrl(String targetUrl) {
                this.targetUrl = targetUrl;
                return this;
            }

            /**
             * Timeout.
             */
            public Builder timeout(Long timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * TracertEnable.
             */
            public Builder tracertEnable(Boolean tracertEnable) {
                this.tracertEnable = tracertEnable;
                return this;
            }

            /**
             * TracertNumMax.
             */
            public Builder tracertNumMax(Integer tracertNumMax) {
                this.tracertNumMax = tracertNumMax;
                return this;
            }

            /**
             * TracertTimeout.
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
        @NameInMap("CustomHeaderContent")
        private java.util.Map < String, String > customHeaderContent;

        @NameInMap("PlayerType")
        private Integer playerType;

        @NameInMap("StreamAddressType")
        private Integer streamAddressType;

        @NameInMap("StreamMonitorTimeout")
        private Integer streamMonitorTimeout;

        @NameInMap("StreamType")
        private Integer streamType;

        @NameInMap("TargetUrl")
        private String targetUrl;

        @NameInMap("WhiteList")
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
             * CustomHeaderContent.
             */
            public Builder customHeaderContent(java.util.Map < String, String > customHeaderContent) {
                this.customHeaderContent = customHeaderContent;
                return this;
            }

            /**
             * PlayerType.
             */
            public Builder playerType(Integer playerType) {
                this.playerType = playerType;
                return this;
            }

            /**
             * StreamAddressType.
             */
            public Builder streamAddressType(Integer streamAddressType) {
                this.streamAddressType = streamAddressType;
                return this;
            }

            /**
             * StreamMonitorTimeout.
             */
            public Builder streamMonitorTimeout(Integer streamMonitorTimeout) {
                this.streamMonitorTimeout = streamMonitorTimeout;
                return this;
            }

            /**
             * StreamType.
             */
            public Builder streamType(Integer streamType) {
                this.streamType = streamType;
                return this;
            }

            /**
             * TargetUrl.
             */
            public Builder targetUrl(String targetUrl) {
                this.targetUrl = targetUrl;
                return this;
            }

            /**
             * WhiteList.
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
        @NameInMap("AutomaticScrolling")
        private Integer automaticScrolling;

        @NameInMap("CustomHeader")
        private Integer customHeader;

        @NameInMap("CustomHeaderContent")
        private java.util.Map < String, String > customHeaderContent;

        @NameInMap("DNSHijackWhitelist")
        private String DNSHijackWhitelist;

        @NameInMap("DisableCache")
        private Integer disableCache;

        @NameInMap("DisableCompression")
        private Integer disableCompression;

        @NameInMap("ElementBlacklist")
        private String elementBlacklist;

        @NameInMap("FilterInvalidIP")
        private Integer filterInvalidIP;

        @NameInMap("FlowHijackJumpTimes")
        private Integer flowHijackJumpTimes;

        @NameInMap("FlowHijackLogo")
        private String flowHijackLogo;

        @NameInMap("IgnoreCertificateError")
        private Integer ignoreCertificateError;

        @NameInMap("MonitorTimeout")
        private Long monitorTimeout;

        @NameInMap("PageTamper")
        private String pageTamper;

        @NameInMap("Redirection")
        private Integer redirection;

        @NameInMap("SlowElementThreshold")
        private Long slowElementThreshold;

        @NameInMap("TargetUrl")
        @Validation(required = true)
        private String targetUrl;

        @NameInMap("VerifyStringBlacklist")
        private String verifyStringBlacklist;

        @NameInMap("VerifyStringWhitelist")
        private String verifyStringWhitelist;

        @NameInMap("WaitCompletionTime")
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
             * AutomaticScrolling.
             */
            public Builder automaticScrolling(Integer automaticScrolling) {
                this.automaticScrolling = automaticScrolling;
                return this;
            }

            /**
             * CustomHeader.
             */
            public Builder customHeader(Integer customHeader) {
                this.customHeader = customHeader;
                return this;
            }

            /**
             * CustomHeaderContent.
             */
            public Builder customHeaderContent(java.util.Map < String, String > customHeaderContent) {
                this.customHeaderContent = customHeaderContent;
                return this;
            }

            /**
             * DNSHijackWhitelist.
             */
            public Builder DNSHijackWhitelist(String DNSHijackWhitelist) {
                this.DNSHijackWhitelist = DNSHijackWhitelist;
                return this;
            }

            /**
             * DisableCache.
             */
            public Builder disableCache(Integer disableCache) {
                this.disableCache = disableCache;
                return this;
            }

            /**
             * DisableCompression.
             */
            public Builder disableCompression(Integer disableCompression) {
                this.disableCompression = disableCompression;
                return this;
            }

            /**
             * ElementBlacklist.
             */
            public Builder elementBlacklist(String elementBlacklist) {
                this.elementBlacklist = elementBlacklist;
                return this;
            }

            /**
             * FilterInvalidIP.
             */
            public Builder filterInvalidIP(Integer filterInvalidIP) {
                this.filterInvalidIP = filterInvalidIP;
                return this;
            }

            /**
             * FlowHijackJumpTimes.
             */
            public Builder flowHijackJumpTimes(Integer flowHijackJumpTimes) {
                this.flowHijackJumpTimes = flowHijackJumpTimes;
                return this;
            }

            /**
             * FlowHijackLogo.
             */
            public Builder flowHijackLogo(String flowHijackLogo) {
                this.flowHijackLogo = flowHijackLogo;
                return this;
            }

            /**
             * IgnoreCertificateError.
             */
            public Builder ignoreCertificateError(Integer ignoreCertificateError) {
                this.ignoreCertificateError = ignoreCertificateError;
                return this;
            }

            /**
             * MonitorTimeout.
             */
            public Builder monitorTimeout(Long monitorTimeout) {
                this.monitorTimeout = monitorTimeout;
                return this;
            }

            /**
             * PageTamper.
             */
            public Builder pageTamper(String pageTamper) {
                this.pageTamper = pageTamper;
                return this;
            }

            /**
             * Redirection.
             */
            public Builder redirection(Integer redirection) {
                this.redirection = redirection;
                return this;
            }

            /**
             * SlowElementThreshold.
             */
            public Builder slowElementThreshold(Long slowElementThreshold) {
                this.slowElementThreshold = slowElementThreshold;
                return this;
            }

            /**
             * TargetUrl.
             */
            public Builder targetUrl(String targetUrl) {
                this.targetUrl = targetUrl;
                return this;
            }

            /**
             * VerifyStringBlacklist.
             */
            public Builder verifyStringBlacklist(String verifyStringBlacklist) {
                this.verifyStringBlacklist = verifyStringBlacklist;
                return this;
            }

            /**
             * VerifyStringWhitelist.
             */
            public Builder verifyStringWhitelist(String verifyStringWhitelist) {
                this.verifyStringWhitelist = verifyStringWhitelist;
                return this;
            }

            /**
             * WaitCompletionTime.
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
        @NameInMap("ApiHTTP")
        private ApiHTTP apiHTTP;

        @NameInMap("FileDownload")
        private FileDownload fileDownload;

        @NameInMap("NetDNS")
        private NetDNS netDNS;

        @NameInMap("NetICMP")
        private NetICMP netICMP;

        @NameInMap("NetTCP")
        private NetTCP netTCP;

        @NameInMap("Stream")
        private Stream stream;

        @NameInMap("Website")
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
             * ApiHTTP.
             */
            public Builder apiHTTP(ApiHTTP apiHTTP) {
                this.apiHTTP = apiHTTP;
                return this;
            }

            /**
             * FileDownload.
             */
            public Builder fileDownload(FileDownload fileDownload) {
                this.fileDownload = fileDownload;
                return this;
            }

            /**
             * NetDNS.
             */
            public Builder netDNS(NetDNS netDNS) {
                this.netDNS = netDNS;
                return this;
            }

            /**
             * NetICMP.
             */
            public Builder netICMP(NetICMP netICMP) {
                this.netICMP = netICMP;
                return this;
            }

            /**
             * NetTCP.
             */
            public Builder netTCP(NetTCP netTCP) {
                this.netTCP = netTCP;
                return this;
            }

            /**
             * Stream.
             */
            public Builder stream(Stream stream) {
                this.stream = stream;
                return this;
            }

            /**
             * Website.
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
        @NameInMap("CityCode")
        @Validation(required = true)
        private String cityCode;

        @NameInMap("ClientType")
        @Validation(required = true)
        private Integer clientType;

        @NameInMap("OperatorCode")
        @Validation(required = true)
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
             * CityCode.
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * ClientType.
             */
            public Builder clientType(Integer clientType) {
                this.clientType = clientType;
                return this;
            }

            /**
             * OperatorCode.
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
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
