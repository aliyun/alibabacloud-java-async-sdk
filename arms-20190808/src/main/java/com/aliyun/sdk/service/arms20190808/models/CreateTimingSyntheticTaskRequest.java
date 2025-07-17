// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link CreateTimingSyntheticTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateTimingSyntheticTaskRequest</p>
 */
public class CreateTimingSyntheticTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AvailableAssertions")
    private java.util.List<AvailableAssertions> availableAssertions;

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
    private java.util.List<Monitors> monitors;

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
    private java.util.List<Tags> tags;

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
    public java.util.List<AvailableAssertions> getAvailableAssertions() {
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
    public java.util.List<Monitors> getMonitors() {
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
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return taskType
     */
    public Integer getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<CreateTimingSyntheticTaskRequest, Builder> {
        private java.util.List<AvailableAssertions> availableAssertions; 
        private CommonSetting commonSetting; 
        private CustomPeriod customPeriod; 
        private String frequency; 
        private Integer monitorCategory; 
        private MonitorConf monitorConf; 
        private java.util.List<Monitors> monitors; 
        private String name; 
        private String regionId; 
        private String resourceGroupId; 
        private java.util.List<Tags> tags; 
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
         * <p>The list of assertions.</p>
         */
        public Builder availableAssertions(java.util.List<AvailableAssertions> availableAssertions) {
            String availableAssertionsShrink = shrink(availableAssertions, "AvailableAssertions", "json");
            this.putQueryParameter("AvailableAssertions", availableAssertionsShrink);
            this.availableAssertions = availableAssertions;
            return this;
        }

        /**
         * <p>The general settings.</p>
         */
        public Builder commonSetting(CommonSetting commonSetting) {
            String commonSettingShrink = shrink(commonSetting, "CommonSetting", "json");
            this.putQueryParameter("CommonSetting", commonSettingShrink);
            this.commonSetting = commonSetting;
            return this;
        }

        /**
         * <p>The general settings.</p>
         */
        public Builder customPeriod(CustomPeriod customPeriod) {
            String customPeriodShrink = shrink(customPeriod, "CustomPeriod", "json");
            this.putQueryParameter("CustomPeriod", customPeriodShrink);
            this.customPeriod = customPeriod;
            return this;
        }

        /**
         * <p>The detection frequency. Valid values: 1m, 5m, 10m, 15m, 20m, 30m, 1h, 2h, 3h, 4h, 6h, 8h, 12h, and 24h.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5m</p>
         */
        public Builder frequency(String frequency) {
            this.putQueryParameter("Frequency", frequency);
            this.frequency = frequency;
            return this;
        }

        /**
         * <p>The detection point type. Valid values:</p>
         * <ul>
         * <li>1: PC</li>
         * <li>2: mobile device</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder monitorCategory(Integer monitorCategory) {
            this.putQueryParameter("MonitorCategory", monitorCategory);
            this.monitorCategory = monitorCategory;
            return this;
        }

        /**
         * <p>The monitoring configurations.</p>
         * <p>This parameter is required.</p>
         */
        public Builder monitorConf(MonitorConf monitorConf) {
            String monitorConfShrink = shrink(monitorConf, "MonitorConf", "json");
            this.putQueryParameter("MonitorConf", monitorConfShrink);
            this.monitorConf = monitorConf;
            return this;
        }

        /**
         * <p>The list of detection points.</p>
         * <p>This parameter is required.</p>
         */
        public Builder monitors(java.util.List<Monitors> monitors) {
            String monitorsShrink = shrink(monitors, "Monitors", "json");
            this.putQueryParameter("Monitors", monitorsShrink);
            this.monitors = monitors;
            return this;
        }

        /**
         * <p>The name of the task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>demo-test</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The region ID.</p>
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
         * <p>The parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The tag list.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The type of the task. Valid values:</p>
         * <p>1: ICMP. 2: TCP. 3: DNS. 4: HTTP. 5: website speed measurement. 6: file download.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
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

    /**
     * 
     * {@link CreateTimingSyntheticTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTimingSyntheticTaskRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(AvailableAssertions model) {
                this.expect = model.expect;
                this.operator = model.operator;
                this.target = model.target;
                this.type = model.type;
            } 

            /**
             * <p>The expected value.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder expect(String expect) {
                this.expect = expect;
                return this;
            }

            /**
             * <p>The condition. gt: greater than. gte: greater than or equal to. lt: less than. lte: less than or equal to. eq: equal to. neq: not equal to. ctn: contain. nctn: does not contain. exist: exist. n_exist: does not exist. belong: belong to. n_belong: does not belong to. reg_match: regular expression.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>eq</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The check target. If you set the type parameter to HttpResCode, HttpResBody, or HttpResponseTime, you do not need to set the target parameter. If you set the type parameter to HttpResHead, you must specify the key in the header. If you set the type parameter to HttpResBodyJson, use jsonPath.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * <p>The assertion type. Valid values: HttpResCode, HttpResHead, HttpResBody, HttpResBodyJson, HttpResponseTime, IcmpPackLoss (packet loss rate), IcmpPackMaxLatency (maximum packet latency), IcmpPackAvgLatency (average packet latency), TraceRouteHops (number of hops), DnsARecord (A record), DnsCName (CNAME), websiteTTFB (time to first packet), websiteTTLB (time to last packet), websiteFST (first paint time), websiteFFST (first meaningful paint), websiteOnload (full loaded time). For more information, see the following description.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>DnsARecord</p>
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
    /**
     * 
     * {@link CreateTimingSyntheticTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTimingSyntheticTaskRequest</p>
     */
    public static class Hosts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        @com.aliyun.core.annotation.Validation(required = true)
        private String domain;

        @com.aliyun.core.annotation.NameInMap("IpType")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer ipType;

        @com.aliyun.core.annotation.NameInMap("Ips")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> ips;

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
        public java.util.List<String> getIps() {
            return this.ips;
        }

        public static final class Builder {
            private String domain; 
            private Integer ipType; 
            private java.util.List<String> ips; 

            private Builder() {
            } 

            private Builder(Hosts model) {
                this.domain = model.domain;
                this.ipType = model.ipType;
                this.ips = model.ips;
            } 

            /**
             * <p>The domain name.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The IP version. Valid values:</p>
             * <ul>
             * <li>0: A version is automatically selected.</li>
             * <li>1: IPv4.</li>
             * <li>2: IPv6.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ipType(Integer ipType) {
                this.ipType = ipType;
                return this;
            }

            /**
             * <p>The list of IP addresses.</p>
             * <p>This parameter is required.</p>
             */
            public Builder ips(java.util.List<String> ips) {
                this.ips = ips;
                return this;
            }

            public Hosts build() {
                return new Hosts(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTimingSyntheticTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTimingSyntheticTaskRequest</p>
     */
    public static class CustomHost extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Hosts")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Hosts> hosts;

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
        public java.util.List<Hosts> getHosts() {
            return this.hosts;
        }

        /**
         * @return selectType
         */
        public Integer getSelectType() {
            return this.selectType;
        }

        public static final class Builder {
            private java.util.List<Hosts> hosts; 
            private Integer selectType; 

            private Builder() {
            } 

            private Builder(CustomHost model) {
                this.hosts = model.hosts;
                this.selectType = model.selectType;
            } 

            /**
             * <p>The list of hosts.</p>
             * <p>This parameter is required.</p>
             */
            public Builder hosts(java.util.List<Hosts> hosts) {
                this.hosts = hosts;
                return this;
            }

            /**
             * <p>The selection mode. Valid values:</p>
             * <ul>
             * <li>0: random</li>
             * <li>1: polling</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link CreateTimingSyntheticTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTimingSyntheticTaskRequest</p>
     */
    public static class CustomPrometheusSetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrometheusClusterId")
        private String prometheusClusterId;

        @com.aliyun.core.annotation.NameInMap("PrometheusClusterRegion")
        private String prometheusClusterRegion;

        @com.aliyun.core.annotation.NameInMap("PrometheusLabels")
        private java.util.Map<String, String> prometheusLabels;

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
        public java.util.Map<String, String> getPrometheusLabels() {
            return this.prometheusLabels;
        }

        public static final class Builder {
            private String prometheusClusterId; 
            private String prometheusClusterRegion; 
            private java.util.Map<String, String> prometheusLabels; 

            private Builder() {
            } 

            private Builder(CustomPrometheusSetting model) {
                this.prometheusClusterId = model.prometheusClusterId;
                this.prometheusClusterRegion = model.prometheusClusterRegion;
                this.prometheusLabels = model.prometheusLabels;
            } 

            /**
             * <p>A reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder prometheusClusterId(String prometheusClusterId) {
                this.prometheusClusterId = prometheusClusterId;
                return this;
            }

            /**
             * <p>A reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder prometheusClusterRegion(String prometheusClusterRegion) {
                this.prometheusClusterRegion = prometheusClusterRegion;
                return this;
            }

            /**
             * <p>A reserved parameter.</p>
             */
            public Builder prometheusLabels(java.util.Map<String, String> prometheusLabels) {
                this.prometheusLabels = prometheusLabels;
                return this;
            }

            public CustomPrometheusSetting build() {
                return new CustomPrometheusSetting(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTimingSyntheticTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTimingSyntheticTaskRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(CustomVPCSetting model) {
                this.regionId = model.regionId;
                this.secureGroupId = model.secureGroupId;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the security group to which the client belongs. The security group specifies the inbound and outbound rules of the client for the VPC. You need to allow the security group to which the client belongs to access the security group to which the VPC belongs. Otherwise, the client cannot access resources in the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-bp13wzf9vuwegmpxxxxx</p>
             */
            public Builder secureGroupId(String secureGroupId) {
                this.secureGroupId = secureGroupId;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp14crq29vpycxp8xxxxx</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1muectbr8f90vjxxxxx</p>
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
    /**
     * 
     * {@link CreateTimingSyntheticTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTimingSyntheticTaskRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(CommonSetting model) {
                this.customHost = model.customHost;
                this.customPrometheusSetting = model.customPrometheusSetting;
                this.customVPCSetting = model.customVPCSetting;
                this.ipType = model.ipType;
                this.isOpenTrace = model.isOpenTrace;
                this.monitorSamples = model.monitorSamples;
                this.traceClientType = model.traceClientType;
                this.xtraceRegion = model.xtraceRegion;
            } 

            /**
             * <p>The custom host settings.</p>
             */
            public Builder customHost(CustomHost customHost) {
                this.customHost = customHost;
                return this;
            }

            /**
             * <p>The reserved parameters.</p>
             */
            public Builder customPrometheusSetting(CustomPrometheusSetting customPrometheusSetting) {
                this.customPrometheusSetting = customPrometheusSetting;
                return this;
            }

            /**
             * <p>The information about the virtual private cloud (VPC). If the destination URL is an Alibaba Cloud internal endpoint, you need to configure a VPC.</p>
             */
            public Builder customVPCSetting(CustomVPCSetting customVPCSetting) {
                this.customVPCSetting = customVPCSetting;
                return this;
            }

            /**
             * <p>The IP version. Valid values:</p>
             * <ul>
             * <li>0: A version is automatically selected.</li>
             * <li>1: IPv4.</li>
             * <li>2: IPv6.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ipType(Integer ipType) {
                this.ipType = ipType;
                return this;
            }

            /**
             * <p>Specifies whether to enable tracing.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isOpenTrace(Boolean isOpenTrace) {
                this.isOpenTrace = isOpenTrace;
                return this;
            }

            /**
             * <p>Specifies whether to evenly distribute monitoring samples. Valid values:</p>
             * <ul>
             * <li>0: no</li>
             * <li>1: yes</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder monitorSamples(Integer monitorSamples) {
                this.monitorSamples = monitorSamples;
                return this;
            }

            /**
             * <p>The type of the client for tracing. Valid values:</p>
             * <ul>
             * <li>0: ARMS agent</li>
             * <li>1: OpenTelemetry</li>
             * <li>2: Jaeger</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder traceClientType(Integer traceClientType) {
                this.traceClientType = traceClientType;
                return this;
            }

            /**
             * <p>The region to which trace data is reported.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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
    /**
     * 
     * {@link CreateTimingSyntheticTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTimingSyntheticTaskRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(CustomPeriod model) {
                this.endHour = model.endHour;
                this.startHour = model.startHour;
            } 

            /**
             * <p>The custom host settings.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder endHour(Integer endHour) {
                this.endHour = endHour;
                return this;
            }

            /**
             * <p>The list of hosts.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
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
    /**
     * 
     * {@link CreateTimingSyntheticTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTimingSyntheticTaskRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(RequestBody model) {
                this.content = model.content;
                this.type = model.type;
            } 

            /**
             * <p>The content of the request body. Format: JSON string. The parameter is required if the Type parameter is set to text/plain, application/json, application/xml, or text/html. Format: JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;key1&quot;: &quot;value1&quot;,
             *   &quot;key2&quot;: &quot;value2&quot;
             * }</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The type of the request body. Valid values: text/plain, application/json, application/x-www-form-urlencoded, multipart/form-data, application/xml, and text/html.</p>
             * 
             * <strong>example:</strong>
             * <p>application/json</p>
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
    /**
     * 
     * {@link CreateTimingSyntheticTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTimingSyntheticTaskRequest</p>
     */
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
        private java.util.Map<String, String> requestHeaders;

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
        public java.util.Map<String, String> getRequestHeaders() {
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
            private java.util.Map<String, String> requestHeaders; 
            private String targetUrl; 
            private Long timeout; 

            private Builder() {
            } 

            private Builder(ApiHTTP model) {
                this.checkCert = model.checkCert;
                this.connectTimeout = model.connectTimeout;
                this.method = model.method;
                this.protocolAlpnProtocol = model.protocolAlpnProtocol;
                this.requestBody = model.requestBody;
                this.requestHeaders = model.requestHeaders;
                this.targetUrl = model.targetUrl;
                this.timeout = model.timeout;
            } 

            /**
             * <p>Specifies whether to verify the certificate. Default value: no.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder checkCert(Boolean checkCert) {
                this.checkCert = checkCert;
                return this;
            }

            /**
             * <p>The connection timeout period. Unit: milliseconds. Default value: 5000. Minimum value: 1000. Maximum value: 300000.</p>
             * 
             * <strong>example:</strong>
             * <p>5000</p>
             */
            public Builder connectTimeout(Long connectTimeout) {
                this.connectTimeout = connectTimeout;
                return this;
            }

            /**
             * <p>The request method. Valid values: GET and POST.</p>
             * 
             * <strong>example:</strong>
             * <p>GET</p>
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * <p>The ALPN protocol version. You can configure this parameter when you perform an HTTPS synthetic test on a WAP mobile client. Valid values:</p>
             * <p>0: default</p>
             * <p>1: http/1.1</p>
             * <p>2: h2</p>
             * <p>3: disables the ALPN protocol</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder protocolAlpnProtocol(Integer protocolAlpnProtocol) {
                this.protocolAlpnProtocol = protocolAlpnProtocol;
                return this;
            }

            /**
             * <p>The HTTP request body.</p>
             */
            public Builder requestBody(RequestBody requestBody) {
                this.requestBody = requestBody;
                return this;
            }

            /**
             * <p>The HTTP request header.</p>
             */
            public Builder requestHeaders(java.util.Map<String, String> requestHeaders) {
                this.requestHeaders = requestHeaders;
                return this;
            }

            /**
             * <p>The URL or request path for synthetic monitoring.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.demo.com/api/list">http://www.demo.com/api/list</a></p>
             */
            public Builder targetUrl(String targetUrl) {
                this.targetUrl = targetUrl;
                return this;
            }

            /**
             * <p>The timeout period. Unit: milliseconds. Default value: 10000. Minimum value: 1000. Maximum value: 300000.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
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
    /**
     * 
     * {@link CreateTimingSyntheticTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTimingSyntheticTaskRequest</p>
     */
    public static class FileDownload extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionTimeout")
        private Long connectionTimeout;

        @com.aliyun.core.annotation.NameInMap("CustomHeaderContent")
        private java.util.Map<String, String> customHeaderContent;

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
        public java.util.Map<String, String> getCustomHeaderContent() {
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
            private java.util.Map<String, String> customHeaderContent; 
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

            private Builder() {
            } 

            private Builder(FileDownload model) {
                this.connectionTimeout = model.connectionTimeout;
                this.customHeaderContent = model.customHeaderContent;
                this.downloadKernel = model.downloadKernel;
                this.ignoreCertificateAuthError = model.ignoreCertificateAuthError;
                this.ignoreCertificateCanceledError = model.ignoreCertificateCanceledError;
                this.ignoreCertificateOutOfDateError = model.ignoreCertificateOutOfDateError;
                this.ignoreCertificateStatusError = model.ignoreCertificateStatusError;
                this.ignoreCertificateUntrustworthyError = model.ignoreCertificateUntrustworthyError;
                this.ignoreCertificateUsingError = model.ignoreCertificateUsingError;
                this.ignoreInvalidHostError = model.ignoreInvalidHostError;
                this.monitorTimeout = model.monitorTimeout;
                this.quickProtocol = model.quickProtocol;
                this.redirection = model.redirection;
                this.targetUrl = model.targetUrl;
                this.transmissionSize = model.transmissionSize;
                this.validateKeywords = model.validateKeywords;
                this.verifyWay = model.verifyWay;
                this.whiteList = model.whiteList;
            } 

            /**
             * <p>Unit: milliseconds. Minimum value: 1000. Maximum value: 120000. Default value: 5000.</p>
             * 
             * <strong>example:</strong>
             * <p>5000</p>
             */
            public Builder connectionTimeout(Long connectionTimeout) {
                this.connectionTimeout = connectionTimeout;
                return this;
            }

            /**
             * <p>The content of the custom request header.</p>
             */
            public Builder customHeaderContent(java.util.Map<String, String> customHeaderContent) {
                this.customHeaderContent = customHeaderContent;
                return this;
            }

            /**
             * <p>The kernel type. Valid values:</p>
             * <ul>
             * <li>1: curl</li>
             * <li>0: WinInet</li>
             * </ul>
             * <p>Default value: 1</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder downloadKernel(Integer downloadKernel) {
                this.downloadKernel = downloadKernel;
                return this;
            }

            /**
             * <p>Specifies whether to ignore CA certificate authentication errors. Valid values: 0: no. 1: yes. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ignoreCertificateAuthError(Integer ignoreCertificateAuthError) {
                this.ignoreCertificateAuthError = ignoreCertificateAuthError;
                return this;
            }

            /**
             * <p>Specifies whether to ignore certificate revocation errors. Valid values: 0: no. 1: yes. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ignoreCertificateCanceledError(Integer ignoreCertificateCanceledError) {
                this.ignoreCertificateCanceledError = ignoreCertificateCanceledError;
                return this;
            }

            /**
             * <p>Specifies whether to ignore certificate invalidity. Valid values: 0: no. 1: yes. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ignoreCertificateOutOfDateError(Integer ignoreCertificateOutOfDateError) {
                this.ignoreCertificateOutOfDateError = ignoreCertificateOutOfDateError;
                return this;
            }

            /**
             * <p>Specifies whether to ignore certificate status errors. Valid values: 0: no. 1: yes. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ignoreCertificateStatusError(Integer ignoreCertificateStatusError) {
                this.ignoreCertificateStatusError = ignoreCertificateStatusError;
                return this;
            }

            /**
             * <p>Specifies whether to ignore certificate incredibility. Valid values: 0: no. 1: yes. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ignoreCertificateUntrustworthyError(Integer ignoreCertificateUntrustworthyError) {
                this.ignoreCertificateUntrustworthyError = ignoreCertificateUntrustworthyError;
                return this;
            }

            /**
             * <p>Specifies whether to ignore certificate usage errors. Valid values: 0: no. 1: yes. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ignoreCertificateUsingError(Integer ignoreCertificateUsingError) {
                this.ignoreCertificateUsingError = ignoreCertificateUsingError;
                return this;
            }

            /**
             * <p>Specifies whether to ignore host invalidity. Valid values: 0: no. 1: yes. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ignoreInvalidHostError(Integer ignoreInvalidHostError) {
                this.ignoreInvalidHostError = ignoreInvalidHostError;
                return this;
            }

            /**
             * <p>The monitoring timeout period. Unit: milliseconds. Minimum value: 1000. Maximum value: 120000. Default value: 60000.</p>
             * 
             * <strong>example:</strong>
             * <p>60000</p>
             */
            public Builder monitorTimeout(Long monitorTimeout) {
                this.monitorTimeout = monitorTimeout;
                return this;
            }

            /**
             * <p>The QUIC protocol type. Valid values:</p>
             * <ul>
             * <li>1: HTTP/1</li>
             * <li>2: HTTP/2</li>
             * <li>3: HTTP/3</li>
             * </ul>
             * <p>Default value: 1</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder quickProtocol(Integer quickProtocol) {
                this.quickProtocol = quickProtocol;
                return this;
            }

            /**
             * <p>Specifies whether to support redirection. Valid values: 0: no. 1: yes. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder redirection(Integer redirection) {
                this.redirection = redirection;
                return this;
            }

            /**
             * <p>The URL that is used to download the file.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://img.alicdn.com/tfs/TB13DzOjXP7gK0jSZFjXXc5aXXa-212-48.png">https://img.alicdn.com/tfs/TB13DzOjXP7gK0jSZFjXXc5aXXa-212-48.png</a></p>
             */
            public Builder targetUrl(String targetUrl) {
                this.targetUrl = targetUrl;
                return this;
            }

            /**
             * <p>The maximum file size of a single transfer. Unit: KB. Minimum value: 1. Maximum value: 20480. Valid values: 2048.</p>
             * 
             * <strong>example:</strong>
             * <p>2048</p>
             */
            public Builder transmissionSize(Long transmissionSize) {
                this.transmissionSize = transmissionSize;
                return this;
            }

            /**
             * <p>The keyword that is used in verification.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun</p>
             */
            public Builder validateKeywords(String validateKeywords) {
                this.validateKeywords = validateKeywords;
                return this;
            }

            /**
             * <p>The verification method. Valid values:</p>
             * <ul>
             * <li>0: no verification</li>
             * <li>1: string verification</li>
             * <li>2: MD5 verification</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder verifyWay(Integer verifyWay) {
                this.verifyWay = verifyWay;
                return this;
            }

            /**
             * <p>The whitelisted objects that are used to avoid DNS hijacking. The objects can be IP addresses, wildcard mask, subnet mask, or CNAME records. Separate multiple objects with vertical bars (|). Example: <a href="http://www.aliyun.com:203.0.3.55%7C203.3.44.67">www.aliyun.com:203.0.3.55|203.3.44.67</a>. It indicates that all IP addresses that belong to the <a href="http://www.aliyun.com">www.aliyun.com</a> domain name except 203.0.3.55 and 203.3.44.67 are hijacked.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.aliyun.com:203.0.3.55%7C203.3.44.67">www.aliyun.com:203.0.3.55|203.3.44.67</a></p>
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
    /**
     * 
     * {@link CreateTimingSyntheticTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTimingSyntheticTaskRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(NetDNS model) {
                this.dnsServerIpType = model.dnsServerIpType;
                this.nsServer = model.nsServer;
                this.queryMethod = model.queryMethod;
                this.targetUrl = model.targetUrl;
                this.timeout = model.timeout;
            } 

            /**
             * <p>The IP version of the DNS server.</p>
             * <ul>
             * <li>0 (default): IPv4.</li>
             * <li>1: IPv6.</li>
             * <li>2: A version is automatically selected.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dnsServerIpType(Integer dnsServerIpType) {
                this.dnsServerIpType = dnsServerIpType;
                return this;
            }

            /**
             * <p>The IP address of the DNS server. Default value: 114.114.114.114.</p>
             * 
             * <strong>example:</strong>
             * <p>114.114.114.114</p>
             */
            public Builder nsServer(String nsServer) {
                this.nsServer = nsServer;
                return this;
            }

            /**
             * <p>The DNS query method. Valid values:</p>
             * <ul>
             * <li>0 (default): recursive</li>
             * <li>1: iterative</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder queryMethod(Integer queryMethod) {
                this.queryMethod = queryMethod;
                return this;
            }

            /**
             * <p>The destination domain name.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
             */
            public Builder targetUrl(String targetUrl) {
                this.targetUrl = targetUrl;
                return this;
            }

            /**
             * <p>The timeout period for the DNS synthetic test. Unit: milliseconds. Minimum value: 1000. Maximum value: 45000. Default value: 5000.</p>
             * 
             * <strong>example:</strong>
             * <p>5000</p>
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
    /**
     * 
     * {@link CreateTimingSyntheticTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTimingSyntheticTaskRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(NetICMP model) {
                this.interval = model.interval;
                this.packageNum = model.packageNum;
                this.packageSize = model.packageSize;
                this.splitPackage = model.splitPackage;
                this.targetUrl = model.targetUrl;
                this.timeout = model.timeout;
                this.tracertEnable = model.tracertEnable;
                this.tracertNumMax = model.tracertNumMax;
                this.tracertTimeout = model.tracertTimeout;
            } 

            /**
             * <p>The interval at which ICMP packets are sent. Unit: milliseconds. Minimum value: 200. Maximum value: 2000. Default value: 200.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder interval(Long interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>The number of ICMP packets that are sent. Minimum value: 1. Maximum value: 50. Default value: 4.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder packageNum(Integer packageNum) {
                this.packageNum = packageNum;
                return this;
            }

            /**
             * <p>The size of each ICMP packet. Unit: bytes. Valid values: 32, 64, 128, 256, 512, 1024, 1080, and 1450.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder packageSize(Integer packageSize) {
                this.packageSize = packageSize;
                return this;
            }

            /**
             * <p>Specifies whether to split ICMP packets. Default value: true.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder splitPackage(Boolean splitPackage) {
                this.splitPackage = splitPackage;
                return this;
            }

            /**
             * <p>The destination IP address or domain name.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder targetUrl(String targetUrl) {
                this.targetUrl = targetUrl;
                return this;
            }

            /**
             * <p>The timeout period for the ICMP synthetic test. Unit: milliseconds. Minimum value: 1000. Maximum value: 300000. Default value: 20000.</p>
             * 
             * <strong>example:</strong>
             * <p>20000</p>
             */
            public Builder timeout(Long timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * <p>Specifies whether to enable the tracert command. Default value: true.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder tracertEnable(Boolean tracertEnable) {
                this.tracertEnable = tracertEnable;
                return this;
            }

            /**
             * <p>The maximum number of hops for the tracert command. Minimum value: 1. Maximum value: 128. Default value: 20.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder tracertNumMax(Integer tracertNumMax) {
                this.tracertNumMax = tracertNumMax;
                return this;
            }

            /**
             * <p>The timeout period of the tracert command. Unit: milliseconds. Minimum value: 1000. Maximum value: 300000. Default value: 60000.</p>
             * 
             * <strong>example:</strong>
             * <p>60000</p>
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
    /**
     * 
     * {@link CreateTimingSyntheticTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTimingSyntheticTaskRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(NetTCP model) {
                this.connectTimes = model.connectTimes;
                this.interval = model.interval;
                this.targetUrl = model.targetUrl;
                this.timeout = model.timeout;
                this.tracertEnable = model.tracertEnable;
                this.tracertNumMax = model.tracertNumMax;
                this.tracertTimeout = model.tracertTimeout;
            } 

            /**
             * <p>The number of TCP connections that are established. Minimum value: 1. Maximum value: 16. Default value: 4.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder connectTimes(Integer connectTimes) {
                this.connectTimes = connectTimes;
                return this;
            }

            /**
             * <p>The interval at which TCP connections are established. Unit: milliseconds. Minimum value: 200. Maximum value: 10000. Default value: 200.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder interval(Long interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>The IP address of the destination host.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder targetUrl(String targetUrl) {
                this.targetUrl = targetUrl;
                return this;
            }

            /**
             * <p>The timeout period for the TCP synthetic test. Unit: milliseconds. Minimum value: 1000. Maximum value: 300000. Default value: 20000.</p>
             * 
             * <strong>example:</strong>
             * <p>20000</p>
             */
            public Builder timeout(Long timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * <p>Specifies whether to enable the tracert command. Default value: true.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder tracertEnable(Boolean tracertEnable) {
                this.tracertEnable = tracertEnable;
                return this;
            }

            /**
             * <p>The maximum number of hops for the tracert command. Minimum value: 1. Maximum value: 128. Default value: 20.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder tracertNumMax(Integer tracertNumMax) {
                this.tracertNumMax = tracertNumMax;
                return this;
            }

            /**
             * <p>The timeout period of the tracert command. Unit: milliseconds. Minimum value: 1000. Maximum value: 300000. Default value: 60000.</p>
             * 
             * <strong>example:</strong>
             * <p>60000</p>
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
    /**
     * 
     * {@link CreateTimingSyntheticTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTimingSyntheticTaskRequest</p>
     */
    public static class Stream extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomHeaderContent")
        private java.util.Map<String, String> customHeaderContent;

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
        public java.util.Map<String, String> getCustomHeaderContent() {
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
            private java.util.Map<String, String> customHeaderContent; 
            private Integer playerType; 
            private Integer streamAddressType; 
            private Integer streamMonitorTimeout; 
            private Integer streamType; 
            private String targetUrl; 
            private String whiteList; 

            private Builder() {
            } 

            private Builder(Stream model) {
                this.customHeaderContent = model.customHeaderContent;
                this.playerType = model.playerType;
                this.streamAddressType = model.streamAddressType;
                this.streamMonitorTimeout = model.streamMonitorTimeout;
                this.streamType = model.streamType;
                this.targetUrl = model.targetUrl;
                this.whiteList = model.whiteList;
            } 

            /**
             * <p>The custom header. Format: JSON map.</p>
             */
            public Builder customHeaderContent(java.util.Map<String, String> customHeaderContent) {
                this.customHeaderContent = customHeaderContent;
                return this;
            }

            /**
             * <p>The player. Default value: 12. Valid values:</p>
             * <ul>
             * <li>12: VLC</li>
             * <li>2: Flash Player</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder playerType(Integer playerType) {
                this.playerType = playerType;
                return this;
            }

            /**
             * <p>The address type of the resource. Valid values:</p>
             * <ul>
             * <li>1: resource URL</li>
             * <li>0 (default): page URL</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder streamAddressType(Integer streamAddressType) {
                this.streamAddressType = streamAddressType;
                return this;
            }

            /**
             * <p>The monitoring duration. Unit: seconds. Maximum and default value: 60.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder streamMonitorTimeout(Integer streamMonitorTimeout) {
                this.streamMonitorTimeout = streamMonitorTimeout;
                return this;
            }

            /**
             * <p>Specifies whether the resource is a video or audio. Valid values: 0: video. 1: audio.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder streamType(Integer streamType) {
                this.streamType = streamType;
                return this;
            }

            /**
             * <p>The resource URL of the streaming media.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.aliyun.com/stream/test.mp4">http://www.aliyun.com/stream/test.mp4</a></p>
             */
            public Builder targetUrl(String targetUrl) {
                this.targetUrl = targetUrl;
                return this;
            }

            /**
             * <p>The whitelisted objects that are used to avoid DNS hijacking. The objects can be IP addresses, wildcard mask, subnet mask, or CNAME records. Separate multiple objects with vertical bars (|). Example: <a href="http://www.aliyun.com:203.0.3.55%7C203.3.44.67">www.aliyun.com:203.0.3.55|203.3.44.67</a>. It indicates that all IP addresses that belong to the <a href="http://www.aliyun.com">www.aliyun.com</a> domain name except 203.0.3.55 and 203.3.44.67 are hijacked.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.aliyun.com:203.0.3.55%7C203.3.44.67">www.aliyun.com:203.0.3.55|203.3.44.67</a></p>
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
    /**
     * 
     * {@link CreateTimingSyntheticTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTimingSyntheticTaskRequest</p>
     */
    public static class Website extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutomaticScrolling")
        private Integer automaticScrolling;

        @com.aliyun.core.annotation.NameInMap("CustomHeader")
        private Integer customHeader;

        @com.aliyun.core.annotation.NameInMap("CustomHeaderContent")
        private java.util.Map<String, String> customHeaderContent;

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
        public java.util.Map<String, String> getCustomHeaderContent() {
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
            private java.util.Map<String, String> customHeaderContent; 
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

            private Builder() {
            } 

            private Builder(Website model) {
                this.automaticScrolling = model.automaticScrolling;
                this.customHeader = model.customHeader;
                this.customHeaderContent = model.customHeaderContent;
                this.DNSHijackWhitelist = model.DNSHijackWhitelist;
                this.disableCache = model.disableCache;
                this.disableCompression = model.disableCompression;
                this.elementBlacklist = model.elementBlacklist;
                this.filterInvalidIP = model.filterInvalidIP;
                this.flowHijackJumpTimes = model.flowHijackJumpTimes;
                this.flowHijackLogo = model.flowHijackLogo;
                this.ignoreCertificateError = model.ignoreCertificateError;
                this.monitorTimeout = model.monitorTimeout;
                this.pageTamper = model.pageTamper;
                this.redirection = model.redirection;
                this.slowElementThreshold = model.slowElementThreshold;
                this.targetUrl = model.targetUrl;
                this.verifyStringBlacklist = model.verifyStringBlacklist;
                this.verifyStringWhitelist = model.verifyStringWhitelist;
                this.waitCompletionTime = model.waitCompletionTime;
            } 

            /**
             * <p>Specifies whether to automatically scroll up and down the screen to load a page.</p>
             * <ul>
             * <li>0 (default): no</li>
             * <li>1: yes</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder automaticScrolling(Integer automaticScrolling) {
                this.automaticScrolling = automaticScrolling;
                return this;
            }

            /**
             * <p>Specifies whether to create a custom header.</p>
             * <ul>
             * <li>0 (default): No custom header is created.</li>
             * <li>1: A custom header is created for the first packet.</li>
             * <li>2: A custom header is created for all packets.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder customHeader(Integer customHeader) {
                this.customHeader = customHeader;
                return this;
            }

            /**
             * <p>The custom header. Format: JSON map.</p>
             */
            public Builder customHeaderContent(java.util.Map<String, String> customHeaderContent) {
                this.customHeaderContent = customHeaderContent;
                return this;
            }

            /**
             * <p>If the IP address or CNAME record resolved from a domain name is not included in the DNS whitelist, you cannot access the domain name, or an IP address that belongs to a different domain name is returned. If the IP address or CNAME record is included in the DNS whitelist, DNS hijacking does not occur.</p>
             * <p>Format: &lt;domain name&gt;:&lt;objects&gt;. The objects can be IP addresses, wildcard mask, subnet mask, or CNAME records. Separate multiple objects with vertical bars (|). Example: <a href="http://www.aliyun.com:203.0.3.55%7C203.3.44.67">www.aliyun.com:203.0.3.55|203.3.44.67</a>. It indicates that all IP addresses that belong to the <a href="http://www.aliyun.com">www.aliyun.com</a> domain name except 203.0.3.55 and 203.3.44.67 are hijacked.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.aliyun.com:203.0.3.55%7C203.3.44.67">www.aliyun.com:203.0.3.55|203.3.44.67</a></p>
             */
            public Builder DNSHijackWhitelist(String DNSHijackWhitelist) {
                this.DNSHijackWhitelist = DNSHijackWhitelist;
                return this;
            }

            /**
             * <p>Specifies whether to disable caching.</p>
             * <ul>
             * <li>0: no</li>
             * <li>1 (default): yes</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder disableCache(Integer disableCache) {
                this.disableCache = disableCache;
                return this;
            }

            /**
             * <p>Specifies whether to accept compressed files based on the HTTP Accept-Encoding request header. Valid values: 0: no. 1: yes. Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder disableCompression(Integer disableCompression) {
                this.disableCompression = disableCompression;
                return this;
            }

            /**
             * <p>The elements not to be loaded in the page loading process.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com/a.jpg">www.example.com/a.jpg</a></p>
             */
            public Builder elementBlacklist(String elementBlacklist) {
                this.elementBlacklist = elementBlacklist;
                return this;
            }

            /**
             * <p>Specifies whether to exclude invalid IP addresses. Valid values: 0: yes. 1: no. Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder filterInvalidIP(Integer filterInvalidIP) {
                this.filterInvalidIP = filterInvalidIP;
                return this;
            }

            /**
             * <p>The total number of elements on the page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder flowHijackJumpTimes(Integer flowHijackJumpTimes) {
                this.flowHijackJumpTimes = flowHijackJumpTimes;
                return this;
            }

            /**
             * <p>The keyword that is used to identify hijacking. Asterisks (*) are allowed.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun</p>
             */
            public Builder flowHijackLogo(String flowHijackLogo) {
                this.flowHijackLogo = flowHijackLogo;
                return this;
            }

            /**
             * <p>Specifies whether to ignore certificate errors during certificate verification in the SSL handshake process and continue browsing. Valid values: 0: no. 1: yes. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ignoreCertificateError(Integer ignoreCertificateError) {
                this.ignoreCertificateError = ignoreCertificateError;
                return this;
            }

            /**
             * <p>The monitoring timeout period. Unit: milliseconds. This parameter is optional. Default value: 20000.</p>
             * 
             * <strong>example:</strong>
             * <p>20000</p>
             */
            public Builder monitorTimeout(Long monitorTimeout) {
                this.monitorTimeout = monitorTimeout;
                return this;
            }

            /**
             * <p>Elements that are not included in the whitelist and appear on the page are tampered with. These elements can be pop-up ads, floating ads, and page redirection.</p>
             * <p>Format: &lt;domain name&gt;:&lt;elements&gt;. The elements can be wildcard masks. Separate multiple elements with vertical bars (|). Example: <a href="http://www.aliyun.com:%7C/cc/bb/a.gif%7C/vv/bb/cc.jpg">www.aliyun.com:|/cc/bb/a.gif|/vv/bb/cc.jpg</a>. It indicates that all elements that belong to the <a href="http://www.aliyun.com">www.aliyun.com</a> domain name except the basic documents, /cc/bb/a.gif, and /vv/bb/cc.jpg are tampered with.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.aliyun.com:%7C/cc/bb/a.gif%7C/vv/bb/cc.jpg">www.aliyun.com:|/cc/bb/a.gif|/vv/bb/cc.jpg</a></p>
             */
            public Builder pageTamper(String pageTamper) {
                this.pageTamper = pageTamper;
                return this;
            }

            /**
             * <p>Specifies whether to continue browsing after redirection. Valid values: 0: no. 1: yes. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder redirection(Integer redirection) {
                this.redirection = redirection;
                return this;
            }

            /**
             * <p>The time threshold that is used to define a slow element. Unit: milliseconds. Default value: 5000. Minimum value: 1. Maximum value: 300000.</p>
             * 
             * <strong>example:</strong>
             * <p>5000</p>
             */
            public Builder slowElementThreshold(Long slowElementThreshold) {
                this.slowElementThreshold = slowElementThreshold;
                return this;
            }

            /**
             * <p>The URL of the website.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
             */
            public Builder targetUrl(String targetUrl) {
                this.targetUrl = targetUrl;
                return this;
            }

            /**
             * <p>An arbitrary string in the source code of the page for verification. If the source code returned by the client contains a string that is in the blacklist, the 650 error code is reported, which indicates that the string fails to be verified. Separate multiple strings with vertical bars (|).</p>
             * 
             * <strong>example:</strong>
             * <p>error</p>
             */
            public Builder verifyStringBlacklist(String verifyStringBlacklist) {
                this.verifyStringBlacklist = verifyStringBlacklist;
                return this;
            }

            /**
             * <p>An arbitrary string in the source code of the page for verification. If the source code returned by the client contains a string that is not in the whitelist, the 650 error code is reported, which indicates that the string fails to be verified. Separate multiple strings with vertical bars (|).</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder verifyStringWhitelist(String verifyStringWhitelist) {
                this.verifyStringWhitelist = verifyStringWhitelist;
                return this;
            }

            /**
             * <p>The maximum waiting time. Unit: milliseconds. Default value: 5000. Minimum value: 5000. Maximum value: 300000.</p>
             * 
             * <strong>example:</strong>
             * <p>5000</p>
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
    /**
     * 
     * {@link CreateTimingSyntheticTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTimingSyntheticTaskRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(MonitorConf model) {
                this.apiHTTP = model.apiHTTP;
                this.fileDownload = model.fileDownload;
                this.netDNS = model.netDNS;
                this.netICMP = model.netICMP;
                this.netTCP = model.netTCP;
                this.stream = model.stream;
                this.website = model.website;
            } 

            /**
             * <p>The parameters of the HTTP(S) synthetic test.</p>
             */
            public Builder apiHTTP(ApiHTTP apiHTTP) {
                this.apiHTTP = apiHTTP;
                return this;
            }

            /**
             * <p>The parameters of file downloading.</p>
             */
            public Builder fileDownload(FileDownload fileDownload) {
                this.fileDownload = fileDownload;
                return this;
            }

            /**
             * <p>The parameters of the DNS synthetic test. This parameter is required if the TaskType parameter is set to 3.</p>
             */
            public Builder netDNS(NetDNS netDNS) {
                this.netDNS = netDNS;
                return this;
            }

            /**
             * <p>The parameters of the ICMP synthetic test. This parameter is required if the TaskType parameter is set to 1.</p>
             */
            public Builder netICMP(NetICMP netICMP) {
                this.netICMP = netICMP;
                return this;
            }

            /**
             * <p>The parameters of the TCP synthetic test. This parameter is required if the TaskType parameter is set to 2.</p>
             */
            public Builder netTCP(NetTCP netTCP) {
                this.netTCP = netTCP;
                return this;
            }

            /**
             * <p>The parameters of the streaming-media synthetic test.</p>
             */
            public Builder stream(Stream stream) {
                this.stream = stream;
                return this;
            }

            /**
             * <p>The parameters of the website speed measurement.</p>
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
    /**
     * 
     * {@link CreateTimingSyntheticTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTimingSyntheticTaskRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(Monitors model) {
                this.cityCode = model.cityCode;
                this.clientType = model.clientType;
                this.operatorCode = model.operatorCode;
            } 

            /**
             * <p>The city code.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>100023</p>
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * <p>The client type of the detection point. Valid values:</p>
             * <ul>
             * <li>1: data center</li>
             * <li>2: Internet</li>
             * <li>3: mobile device</li>
             * <li>4: ECS instance</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder clientType(Integer clientType) {
                this.clientType = clientType;
                return this;
            }

            /**
             * <p>The carrier code.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link CreateTimingSyntheticTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateTimingSyntheticTaskRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>Key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
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
