// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateGroupMetricRulesRequest} extends {@link RequestModel}
 *
 * <p>CreateGroupMetricRulesRequest</p>
 */
public class CreateGroupMetricRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupMetricRules")
    private java.util.List < GroupMetricRules> groupMetricRules;

    private CreateGroupMetricRulesRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.groupMetricRules = builder.groupMetricRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGroupMetricRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return groupMetricRules
     */
    public java.util.List < GroupMetricRules> getGroupMetricRules() {
        return this.groupMetricRules;
    }

    public static final class Builder extends Request.Builder<CreateGroupMetricRulesRequest, Builder> {
        private Long groupId; 
        private java.util.List < GroupMetricRules> groupMetricRules; 

        private Builder() {
            super();
        } 

        private Builder(CreateGroupMetricRulesRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.groupMetricRules = request.groupMetricRules;
        } 

        /**
         * <p>The ID of the application group.</p>
         * <p>For information about how to obtain the ID of an application group, see <a href="https://help.aliyun.com/document_detail/115032.html">DescribeMonitorGroups</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * GroupMetricRules.
         */
        public Builder groupMetricRules(java.util.List < GroupMetricRules> groupMetricRules) {
            this.putQueryParameter("GroupMetricRules", groupMetricRules);
            this.groupMetricRules = groupMetricRules;
            return this;
        }

        @Override
        public CreateGroupMetricRulesRequest build() {
            return new CreateGroupMetricRulesRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateGroupMetricRulesRequest} extends {@link TeaModel}
     *
     * <p>CreateGroupMetricRulesRequest</p>
     */
    public static class Critical extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @com.aliyun.core.annotation.NameInMap("N")
        private String n;

        @com.aliyun.core.annotation.NameInMap("PreCondition")
        private String preCondition;

        @com.aliyun.core.annotation.NameInMap("Statistics")
        private String statistics;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private String threshold;

        @com.aliyun.core.annotation.NameInMap("Times")
        private Integer times;

        private Critical(Builder builder) {
            this.comparisonOperator = builder.comparisonOperator;
            this.n = builder.n;
            this.preCondition = builder.preCondition;
            this.statistics = builder.statistics;
            this.threshold = builder.threshold;
            this.times = builder.times;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Critical create() {
            return builder().build();
        }

        /**
         * @return comparisonOperator
         */
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        /**
         * @return n
         */
        public String getN() {
            return this.n;
        }

        /**
         * @return preCondition
         */
        public String getPreCondition() {
            return this.preCondition;
        }

        /**
         * @return statistics
         */
        public String getStatistics() {
            return this.statistics;
        }

        /**
         * @return threshold
         */
        public String getThreshold() {
            return this.threshold;
        }

        /**
         * @return times
         */
        public Integer getTimes() {
            return this.times;
        }

        public static final class Builder {
            private String comparisonOperator; 
            private String n; 
            private String preCondition; 
            private String statistics; 
            private String threshold; 
            private Integer times; 

            /**
             * ComparisonOperator.
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * N.
             */
            public Builder n(String n) {
                this.n = n;
                return this;
            }

            /**
             * PreCondition.
             */
            public Builder preCondition(String preCondition) {
                this.preCondition = preCondition;
                return this;
            }

            /**
             * Statistics.
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * Threshold.
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * Times.
             */
            public Builder times(Integer times) {
                this.times = times;
                return this;
            }

            public Critical build() {
                return new Critical(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateGroupMetricRulesRequest} extends {@link TeaModel}
     *
     * <p>CreateGroupMetricRulesRequest</p>
     */
    public static class Info extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @com.aliyun.core.annotation.NameInMap("N")
        private String n;

        @com.aliyun.core.annotation.NameInMap("PreCondition")
        private String preCondition;

        @com.aliyun.core.annotation.NameInMap("Statistics")
        private String statistics;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private String threshold;

        @com.aliyun.core.annotation.NameInMap("Times")
        private Integer times;

        private Info(Builder builder) {
            this.comparisonOperator = builder.comparisonOperator;
            this.n = builder.n;
            this.preCondition = builder.preCondition;
            this.statistics = builder.statistics;
            this.threshold = builder.threshold;
            this.times = builder.times;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Info create() {
            return builder().build();
        }

        /**
         * @return comparisonOperator
         */
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        /**
         * @return n
         */
        public String getN() {
            return this.n;
        }

        /**
         * @return preCondition
         */
        public String getPreCondition() {
            return this.preCondition;
        }

        /**
         * @return statistics
         */
        public String getStatistics() {
            return this.statistics;
        }

        /**
         * @return threshold
         */
        public String getThreshold() {
            return this.threshold;
        }

        /**
         * @return times
         */
        public Integer getTimes() {
            return this.times;
        }

        public static final class Builder {
            private String comparisonOperator; 
            private String n; 
            private String preCondition; 
            private String statistics; 
            private String threshold; 
            private Integer times; 

            /**
             * ComparisonOperator.
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * N.
             */
            public Builder n(String n) {
                this.n = n;
                return this;
            }

            /**
             * PreCondition.
             */
            public Builder preCondition(String preCondition) {
                this.preCondition = preCondition;
                return this;
            }

            /**
             * Statistics.
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * Threshold.
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * Times.
             */
            public Builder times(Integer times) {
                this.times = times;
                return this;
            }

            public Info build() {
                return new Info(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateGroupMetricRulesRequest} extends {@link TeaModel}
     *
     * <p>CreateGroupMetricRulesRequest</p>
     */
    public static class Warn extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @com.aliyun.core.annotation.NameInMap("N")
        private String n;

        @com.aliyun.core.annotation.NameInMap("PreCondition")
        private String preCondition;

        @com.aliyun.core.annotation.NameInMap("Statistics")
        private String statistics;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private String threshold;

        @com.aliyun.core.annotation.NameInMap("Times")
        private Integer times;

        private Warn(Builder builder) {
            this.comparisonOperator = builder.comparisonOperator;
            this.n = builder.n;
            this.preCondition = builder.preCondition;
            this.statistics = builder.statistics;
            this.threshold = builder.threshold;
            this.times = builder.times;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Warn create() {
            return builder().build();
        }

        /**
         * @return comparisonOperator
         */
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        /**
         * @return n
         */
        public String getN() {
            return this.n;
        }

        /**
         * @return preCondition
         */
        public String getPreCondition() {
            return this.preCondition;
        }

        /**
         * @return statistics
         */
        public String getStatistics() {
            return this.statistics;
        }

        /**
         * @return threshold
         */
        public String getThreshold() {
            return this.threshold;
        }

        /**
         * @return times
         */
        public Integer getTimes() {
            return this.times;
        }

        public static final class Builder {
            private String comparisonOperator; 
            private String n; 
            private String preCondition; 
            private String statistics; 
            private String threshold; 
            private Integer times; 

            /**
             * ComparisonOperator.
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * N.
             */
            public Builder n(String n) {
                this.n = n;
                return this;
            }

            /**
             * PreCondition.
             */
            public Builder preCondition(String preCondition) {
                this.preCondition = preCondition;
                return this;
            }

            /**
             * Statistics.
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * Threshold.
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * Times.
             */
            public Builder times(Integer times) {
                this.times = times;
                return this;
            }

            public Warn build() {
                return new Warn(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateGroupMetricRulesRequest} extends {@link TeaModel}
     *
     * <p>CreateGroupMetricRulesRequest</p>
     */
    public static class Escalations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Critical")
        @com.aliyun.core.annotation.Validation(required = true)
        private Critical critical;

        @com.aliyun.core.annotation.NameInMap("Info")
        @com.aliyun.core.annotation.Validation(required = true)
        private Info info;

        @com.aliyun.core.annotation.NameInMap("Warn")
        @com.aliyun.core.annotation.Validation(required = true)
        private Warn warn;

        private Escalations(Builder builder) {
            this.critical = builder.critical;
            this.info = builder.info;
            this.warn = builder.warn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Escalations create() {
            return builder().build();
        }

        /**
         * @return critical
         */
        public Critical getCritical() {
            return this.critical;
        }

        /**
         * @return info
         */
        public Info getInfo() {
            return this.info;
        }

        /**
         * @return warn
         */
        public Warn getWarn() {
            return this.warn;
        }

        public static final class Builder {
            private Critical critical; 
            private Info info; 
            private Warn warn; 

            /**
             * Critical.
             */
            public Builder critical(Critical critical) {
                this.critical = critical;
                return this;
            }

            /**
             * Info.
             */
            public Builder info(Info info) {
                this.info = info;
                return this;
            }

            /**
             * Warn.
             */
            public Builder warn(Warn warn) {
                this.warn = warn;
                return this;
            }

            public Escalations build() {
                return new Escalations(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateGroupMetricRulesRequest} extends {@link TeaModel}
     *
     * <p>CreateGroupMetricRulesRequest</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Labels(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
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
             * <p>The tag key of the alert rule. The specified tag is contained in alert notifications.</p>
             * <p>Valid values of N: 1 to 200.</p>
             * 
             * <strong>example:</strong>
             * <p>key1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the alert rule. The specified tag is contained in alert notifications.</p>
             * <p>Valid values of N: 1 to 200.</p>
             * 
             * <strong>example:</strong>
             * <p>value1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateGroupMetricRulesRequest} extends {@link TeaModel}
     *
     * <p>CreateGroupMetricRulesRequest</p>
     */
    public static class GroupMetricRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Escalations")
        @com.aliyun.core.annotation.Validation(required = true)
        private Escalations escalations;

        @com.aliyun.core.annotation.NameInMap("Category")
        @com.aliyun.core.annotation.Validation(required = true)
        private String category;

        @com.aliyun.core.annotation.NameInMap("ContactGroups")
        private String contactGroups;

        @com.aliyun.core.annotation.NameInMap("Dimensions")
        private String dimensions;

        @com.aliyun.core.annotation.NameInMap("EffectiveInterval")
        private String effectiveInterval;

        @com.aliyun.core.annotation.NameInMap("EmailSubject")
        private String emailSubject;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private String interval;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.List < Labels> labels;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        @com.aliyun.core.annotation.Validation(required = true)
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("NoDataPolicy")
        private String noDataPolicy;

        @com.aliyun.core.annotation.NameInMap("NoEffectiveInterval")
        private String noEffectiveInterval;

        @com.aliyun.core.annotation.NameInMap("Options")
        private String options;

        @com.aliyun.core.annotation.NameInMap("Period")
        private String period;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("SilenceTime")
        private Integer silenceTime;

        @com.aliyun.core.annotation.NameInMap("Webhook")
        private String webhook;

        private GroupMetricRules(Builder builder) {
            this.escalations = builder.escalations;
            this.category = builder.category;
            this.contactGroups = builder.contactGroups;
            this.dimensions = builder.dimensions;
            this.effectiveInterval = builder.effectiveInterval;
            this.emailSubject = builder.emailSubject;
            this.interval = builder.interval;
            this.labels = builder.labels;
            this.metricName = builder.metricName;
            this.namespace = builder.namespace;
            this.noDataPolicy = builder.noDataPolicy;
            this.noEffectiveInterval = builder.noEffectiveInterval;
            this.options = builder.options;
            this.period = builder.period;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.silenceTime = builder.silenceTime;
            this.webhook = builder.webhook;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupMetricRules create() {
            return builder().build();
        }

        /**
         * @return escalations
         */
        public Escalations getEscalations() {
            return this.escalations;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return contactGroups
         */
        public String getContactGroups() {
            return this.contactGroups;
        }

        /**
         * @return dimensions
         */
        public String getDimensions() {
            return this.dimensions;
        }

        /**
         * @return effectiveInterval
         */
        public String getEffectiveInterval() {
            return this.effectiveInterval;
        }

        /**
         * @return emailSubject
         */
        public String getEmailSubject() {
            return this.emailSubject;
        }

        /**
         * @return interval
         */
        public String getInterval() {
            return this.interval;
        }

        /**
         * @return labels
         */
        public java.util.List < Labels> getLabels() {
            return this.labels;
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return noDataPolicy
         */
        public String getNoDataPolicy() {
            return this.noDataPolicy;
        }

        /**
         * @return noEffectiveInterval
         */
        public String getNoEffectiveInterval() {
            return this.noEffectiveInterval;
        }

        /**
         * @return options
         */
        public String getOptions() {
            return this.options;
        }

        /**
         * @return period
         */
        public String getPeriod() {
            return this.period;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return silenceTime
         */
        public Integer getSilenceTime() {
            return this.silenceTime;
        }

        /**
         * @return webhook
         */
        public String getWebhook() {
            return this.webhook;
        }

        public static final class Builder {
            private Escalations escalations; 
            private String category; 
            private String contactGroups; 
            private String dimensions; 
            private String effectiveInterval; 
            private String emailSubject; 
            private String interval; 
            private java.util.List < Labels> labels; 
            private String metricName; 
            private String namespace; 
            private String noDataPolicy; 
            private String noEffectiveInterval; 
            private String options; 
            private String period; 
            private String ruleId; 
            private String ruleName; 
            private Integer silenceTime; 
            private String webhook; 

            /**
             * Escalations.
             */
            public Builder escalations(Escalations escalations) {
                this.escalations = escalations;
                return this;
            }

            /**
             * <p>The name of the cloud service. Valid values of N: 1 to 200. Valid value:</p>
             * <ul>
             * <li>PolarDB: PolarDB</li>
             * <li>NewBGPDDoS: Anti-DDoS Pro</li>
             * <li>IoTDevice: IoT Platform</li>
             * <li>DRDS: Distributed Relational Database Service (DRDS)</li>
             * <li>VS: Video Surveillance System</li>
             * <li>AMQP: Alibaba Cloud Message Queue for AMQP</li>
             * <li>ADS: AnalyticDB</li>
             * <li>APIGateway: API Gateway</li>
             * <li>InternetSharedBandwidth: EIP Bandwidth Plan</li>
             * <li>CDN: Alibaba Cloud Content Delivery Network (CDN)</li>
             * <li>CEN: Cloud Enterprise Network (CEN)</li>
             * <li>DCDN: Dynamic Route for CDN (DCDN)</li>
             * <li>DDoS: Anti-DDoS</li>
             * <li>ECS: Elastic Compute Service (ECS)</li>
             * <li>DirectMail: Direct Mail</li>
             * <li>Elasticsearch: Elasticsearch</li>
             * <li>EMR: E-MapReduce (EMR)</li>
             * <li>ESS: Auto Scaling</li>
             * <li>FunctionCompute: Function Compute</li>
             * <li>RealtimeCompute: Realtime Compute for Apache Flink</li>
             * <li>GlobalAcceleration: Global Accelerator (GA)</li>
             * <li>Hbase: ApsaraDB for HBase</li>
             * <li>TSDB: Time Series Database (TSDB)</li>
             * <li>IPv6trans: IPv6 Translation Service</li>
             * <li>Kafka: Message Queue for Apache Kafka</li>
             * <li>Kubernetes: Container Service for Kubernetes (ACK)</li>
             * <li>KVstore: ApsaraDB for Redis</li>
             * <li>MNS: Message Service (MNS)</li>
             * <li>MongoDB: ApsaraDB for MongoDB</li>
             * <li>MQ: Message Queue</li>
             * <li>NAT: NAT Gateway</li>
             * <li>OpenAd: Open Ad</li>
             * <li>OpenSearch: Open Search</li>
             * <li>OSS: Object Storage Service (OSS)</li>
             * <li>PCDN: P2P CDN</li>
             * <li>petadata: HybridDB for MySQL</li>
             * <li>RDS: ApsaraDB RDS</li>
             * <li>SCDN: Secure CDN</li>
             * <li>SLB: Server Load Balancer (SLB)</li>
             * <li>SLS: Log Service</li>
             * <li>VideoLive: ApsaraVideo Live</li>
             * <li>VOD: ApsaraVideo VOD</li>
             * <li>EIP: Elastic IP Address (EIP)</li>
             * <li>VPN: VPN Gateway</li>
             * <li>AIRec: Artificial Intelligence Recommendation</li>
             * <li>GPDB: AnalyticDB for PostgreSQL</li>
             * <li>DBS: Database Backup (DBS)</li>
             * <li>SAG: Smart Access Gateway (SAG)</li>
             * <li>Memcache: ApsaraDB for Memcache</li>
             * <li>IOT_EDGE: Link IoT Edge</li>
             * <li>OCS: ApsaraDB for Memcache (previous version)</li>
             * <li>VPC: Express Connect</li>
             * <li>EHPC: Elastic High Performance Computing (E-HPC)</li>
             * <li>MPS: ApsaraVideo Media Processing</li>
             * <li>ENS: Edge Node Service (ENS)</li>
             * <li>MaxCompute_Prepay: MaxCompute</li>
             * <li>IoT_Kubernetes: Edge Application Hosting</li>
             * <li>CMS: CloudMonitor</li>
             * <li>batchcomputenew: Batch Compute</li>
             * <li>HBaseUE: ApsaraDB for HBase Performance-enhanced Edition</li>
             * <li>UIS: Ultimate Internet Service (UIS)</li>
             * <li>nls: Intelligent Speech Interaction</li>
             * <li>ots: Tablestore</li>
             * <li>NAS: File Storage NAS</li>
             * <li>ECI: Elastic Container Instance (ECI)</li>
             * <li>OpenAPI: OpenAPI Explorer</li>
             * <li>pvtzpost: Alibaba Cloud DNS PrivateZone</li>
             * <li>blinkonk8s: Flink on Kubernetes</li>
             * <li>FunctionFlow: Serverless Workflow (SWF)</li>
             * <li>SMC: Server Migration Center (SMC)</li>
             * <li>ddosbgp: Anti-DDoS Origin</li>
             * <li>baas: Blockchain as a Service</li>
             * <li>privatelink: PrivateLink</li>
             * <li>cds: ApsaraDB for Cassandra</li>
             * <li>DDH: Dedicated Host</li>
             * <li>RocketMQ: Message Queue for Apache RocketMQ</li>
             * <li>ECC: Express Cloud Connect</li>
             * <li>hbaseserverless: ApsaraDB for HBase Serverless Edition</li>
             * <li>mns_tmp: Message Service</li>
             * <li>hdr: Hybrid Disaster Recovery (HDR)</li>
             * <li>hbr: Hybrid Backup Recovery (HBR)</li>
             * <li>ADB: AnalyticDB for MySQL V3.0</li>
             * <li>tag: Tag Service</li>
             * <li>GDB: Graph Database</li>
             * <li>WAF: Web Application Firewall (WAF)</li>
             * <li>hcs_sgw: Cloud Storage Gateway (CSG)</li>
             * <li>ipv6gateway: IPv6 Gateway</li>
             * <li>RDS_SAR: ApsaraDB Exclusive Host Group</li>
             * <li>learn: Machine Learning Platform for AI</li>
             * <li>ROS: Resource Orchestration Service (ROS)</li>
             * <li>OOS: Operation Orchestration Service (OOS)</li>
             * <li>bds: Data Synchronization for HBase</li>
             * <li>cfw: Cloud Firewall</li>
             * <li>ddosDip: Anti-DDoS Premium</li>
             * <li>datahub: DataHub</li>
             * <li>hologres: Hologres</li>
             * <li>ExpressConnect: Express Connect</li>
             * <li>dbfs: Database File System (DBFS)</li>
             * <li>clickhouse: ApsaraDB for ClickHouse</li>
             * <li>k8s: Container Service for Kubernetes (ACK)</li>
             * <li>DTS: Data Transmission Service (DTS)</li>
             * <li>AnycastEIP: Anycast Elastic IP Address</li>
             * <li>Lindorm: ApsaraDB for Lindorm</li>
             * <li>config: Cloud Config</li>
             * <li>spark: Databricks DataInsight (DDI)</li>
             * <li>serverless: Serverless App Engine (SAE)</li>
             * <li>alb: Application Load Balancer (ALB)</li>
             * <li>oceanbase: ApsaraDB for OceanBase</li>
             * <li>KMS: Key Management Service (KMS)</li>
             * <li>lvwang: Content Moderation</li>
             * <li>LinkVisual: LinkVisual</li>
             * <li>tair: ApsaraDB for Redis Enhanced Edition (Tair)</li>
             * <li>dlf: Data Lake Formation (DLF)</li>
             * <li>networkmonitor: Site Monitoring</li>
             * <li>pnc: Physical Network Change</li>
             * <li>AIS: Alibaba Cloud Infrastructure</li>
             * <li>cloudgame: Cloud Gaming Platform</li>
             * <li>RTC: Real-Time Communication</li>
             * <li>cloudbox: CloudBox</li>
             * <li>actiontrail: ActionTrail</li>
             * <li>cc: Cloud Connector</li>
             * <li>disk: Elastic Block Storage (EBS)</li>
             * <li>easygene: Genomics Computing Platform</li>
             * <li>cloudphone: Elastic Cloud Phone</li>
             * <li>BMS: Bare Metal Management Service</li>
             * <li>swas: Simple Application Server</li>
             * <li>AvailabilityMonitoring: Availability Monitoring of CloudMonitor</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The alert contact groups. Valid values of N: 1 to 200.</p>
             * <p>For information about how to obtain alert contact groups, see <a href="https://help.aliyun.com/document_detail/114922.html">DescribeContactGroupList</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS_Group</p>
             */
            public Builder contactGroups(String contactGroups) {
                this.contactGroups = contactGroups;
                return this;
            }

            /**
             * <p>The dimension of the alert rule. Valid values of N: 1 to 200.</p>
             * <p>Set the value to a set of key-value pairs, for example, <code>userId:120886317861****</code> or <code>instanceId:i-m5e1qg6uo38rztr4****</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;instanceId&quot;:&quot;i-m5e1qg6uo38rztr4****&quot;}]</p>
             */
            public Builder dimensions(String dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * <p>The time period during which the alert rule is effective. Valid values of N: 1 to 200.</p>
             * 
             * <strong>example:</strong>
             * <p>05:31-23:59</p>
             */
            public Builder effectiveInterval(String effectiveInterval) {
                this.effectiveInterval = effectiveInterval;
                return this;
            }

            /**
             * <p>The subject of the alert notification email. Valid values of N: 1 to 200.</p>
             */
            public Builder emailSubject(String emailSubject) {
                this.emailSubject = emailSubject;
                return this;
            }

            /**
             * <p>The interval at which CloudMonitor checks whether the alert rule is triggered. Valid values of N: 1 to 200.</p>
             * <p>Unit: seconds. The default value is the lowest frequency at which the metric is polled.</p>
             * <blockquote>
             * <p> We recommend that you set the interval to the data aggregation period. If the interval is shorter than the data aggregation period, alerts cannot be triggered due to insufficient data.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder interval(String interval) {
                this.interval = interval;
                return this;
            }

            /**
             * Labels.
             */
            public Builder labels(java.util.List < Labels> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The name of the metric. Valid values of N: 1 to 200.</p>
             * <p>For information about how to obtain the name of a metric, see <a href="https://help.aliyun.com/document_detail/98846.html">DescribeMetricMetaList</a> or <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cpu_total</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The namespace of the cloud service. Valid values of N: 1 to 200.</p>
             * <p>For information about how to obtain the namespace of a cloud service, see <a href="https://help.aliyun.com/document_detail/98846.html">DescribeMetricMetaList</a> or <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>acs_ecs_dashboard</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The method that is used to handle alerts when no monitoring data is found. Valid values of N: 1 to 200. Valid value:</p>
             * <ul>
             * <li>KEEP_LAST_STATE (default value): No operation is performed.</li>
             * <li>INSUFFICIENT_DATA: An alert whose content is &quot;Insufficient data&quot; is triggered.</li>
             * <li>OK: The alert rule has no active alerts.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>KEEP_LAST_STATE</p>
             */
            public Builder noDataPolicy(String noDataPolicy) {
                this.noDataPolicy = noDataPolicy;
                return this;
            }

            /**
             * <p>The time period during which the alert rule is ineffective. Valid values of N: 1 to 200.</p>
             * 
             * <strong>example:</strong>
             * <p>00:00-05:30</p>
             */
            public Builder noEffectiveInterval(String noEffectiveInterval) {
                this.noEffectiveInterval = noEffectiveInterval;
                return this;
            }

            /**
             * Options.
             */
            public Builder options(String options) {
                this.options = options;
                return this;
            }

            /**
             * <p>The aggregation period of the metric data. Valid values of N: 1 to 200.</p>
             * <p>Set the <code>Period</code> parameter to an integral multiple of 60. Unit: seconds. Default value: 300.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder period(String period) {
                this.period = period;
                return this;
            }

            /**
             * <p>The ID of the alert rule. Valid values of N: 1 to 200.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>456789</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The name of the alert rule. Valid values of N: 1 to 200.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS_Rule1</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The mute period during which new alerts are not sent even if the trigger conditions are met. Valid values of N: 1 to 200.</p>
             * <p>Unit: seconds. Default value: 86400. Minimum value: 3600.</p>
             * 
             * <strong>example:</strong>
             * <p>86400</p>
             */
            public Builder silenceTime(Integer silenceTime) {
                this.silenceTime = silenceTime;
                return this;
            }

            /**
             * <p>The callback URL. Valid values of N: 1 to 200.</p>
             * <p>The callback URL must be accessible over the Internet. CloudMonitor pushes an alert notification to the specified callback URL by sending an HTTP POST request. Only the HTTP protocol is supported.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
             */
            public Builder webhook(String webhook) {
                this.webhook = webhook;
                return this;
            }

            public GroupMetricRules build() {
                return new GroupMetricRules(this);
            } 

        } 

    }
}
