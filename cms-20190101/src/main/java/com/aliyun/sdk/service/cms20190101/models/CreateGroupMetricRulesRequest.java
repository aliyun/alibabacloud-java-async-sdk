// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGroupMetricRulesRequest} extends {@link RequestModel}
 *
 * <p>CreateGroupMetricRulesRequest</p>
 */
public class CreateGroupMetricRulesRequest extends Request {
    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private Long groupId;

    @Query
    @NameInMap("GroupMetricRules")
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
         * The ID of the application group.
         * <p>
         * 
         * For information about how to obtain the ID of an application group, see [DescribeMonitorGroups](~~115032~~).
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

    public static class Critical extends TeaModel {
        @NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @NameInMap("N")
        private String n;

        @NameInMap("PreCondition")
        private String preCondition;

        @NameInMap("Statistics")
        private String statistics;

        @NameInMap("Threshold")
        private String threshold;

        @NameInMap("Times")
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
    public static class Info extends TeaModel {
        @NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @NameInMap("N")
        private String n;

        @NameInMap("PreCondition")
        private String preCondition;

        @NameInMap("Statistics")
        private String statistics;

        @NameInMap("Threshold")
        private String threshold;

        @NameInMap("Times")
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
    public static class Warn extends TeaModel {
        @NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @NameInMap("N")
        private String n;

        @NameInMap("PreCondition")
        private String preCondition;

        @NameInMap("Statistics")
        private String statistics;

        @NameInMap("Threshold")
        private String threshold;

        @NameInMap("Times")
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
    public static class Escalations extends TeaModel {
        @NameInMap("Critical")
        @Validation(required = true)
        private Critical critical;

        @NameInMap("Info")
        @Validation(required = true)
        private Info info;

        @NameInMap("Warn")
        @Validation(required = true)
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
    public static class Labels extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * The tag key of the alert rule. The specified tag is contained in alert notifications.
             * <p>
             * 
             * Valid values of N: 1 to 200.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value of the alert rule. The specified tag is contained in alert notifications.
             * <p>
             * 
             * Valid values of N: 1 to 200.
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
    public static class GroupMetricRules extends TeaModel {
        @NameInMap("Escalations")
        @Validation(required = true)
        private Escalations escalations;

        @NameInMap("Category")
        @Validation(required = true)
        private String category;

        @NameInMap("ContactGroups")
        private String contactGroups;

        @NameInMap("Dimensions")
        private String dimensions;

        @NameInMap("EffectiveInterval")
        private String effectiveInterval;

        @NameInMap("EmailSubject")
        private String emailSubject;

        @NameInMap("Interval")
        private String interval;

        @NameInMap("Labels")
        private java.util.List < Labels> labels;

        @NameInMap("MetricName")
        @Validation(required = true)
        private String metricName;

        @NameInMap("Namespace")
        @Validation(required = true)
        private String namespace;

        @NameInMap("NoDataPolicy")
        private String noDataPolicy;

        @NameInMap("NoEffectiveInterval")
        private String noEffectiveInterval;

        @NameInMap("Period")
        private String period;

        @NameInMap("RuleId")
        @Validation(required = true)
        private String ruleId;

        @NameInMap("RuleName")
        @Validation(required = true)
        private String ruleName;

        @NameInMap("SilenceTime")
        private Integer silenceTime;

        @NameInMap("Webhook")
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
             * The name of the cloud service. Valid values of N: 1 to 200. Valid value:
             * <p>
             * 
             * *   PolarDB: PolarDB
             * *   NewBGPDDoS: Anti-DDoS Pro
             * *   IoTDevice: IoT Platform
             * *   DRDS: Distributed Relational Database Service (DRDS)
             * *   VS: Video Surveillance System
             * *   AMQP: Alibaba Cloud Message Queue for AMQP
             * *   ADS: AnalyticDB
             * *   APIGateway: API Gateway
             * *   InternetSharedBandwidth: EIP Bandwidth Plan
             * *   CDN: Alibaba Cloud Content Delivery Network (CDN)
             * *   CEN: Cloud Enterprise Network (CEN)
             * *   DCDN: Dynamic Route for CDN (DCDN)
             * *   DDoS: Anti-DDoS
             * *   ECS: Elastic Compute Service (ECS)
             * *   DirectMail: Direct Mail
             * *   Elasticsearch: Elasticsearch
             * *   EMR: E-MapReduce (EMR)
             * *   ESS: Auto Scaling
             * *   FunctionCompute: Function Compute
             * *   RealtimeCompute: Realtime Compute for Apache Flink
             * *   GlobalAcceleration: Global Accelerator (GA)
             * *   Hbase: ApsaraDB for HBase
             * *   TSDB: Time Series Database (TSDB)
             * *   IPv6trans: IPv6 Translation Service
             * *   Kafka: Message Queue for Apache Kafka
             * *   Kubernetes: Container Service for Kubernetes (ACK)
             * *   KVstore: ApsaraDB for Redis
             * *   MNS: Message Service (MNS)
             * *   MongoDB: ApsaraDB for MongoDB
             * *   MQ: Message Queue
             * *   NAT: NAT Gateway
             * *   OpenAd: Open Ad
             * *   OpenSearch: Open Search
             * *   OSS: Object Storage Service (OSS)
             * *   PCDN: P2P CDN
             * *   petadata: HybridDB for MySQL
             * *   RDS: ApsaraDB RDS
             * *   SCDN: Secure CDN
             * *   SLB: Server Load Balancer (SLB)
             * *   SLS: Log Service
             * *   VideoLive: ApsaraVideo Live
             * *   VOD: ApsaraVideo VOD
             * *   EIP: Elastic IP Address (EIP)
             * *   VPN: VPN Gateway
             * *   AIRec: Artificial Intelligence Recommendation
             * *   GPDB: AnalyticDB for PostgreSQL
             * *   DBS: Database Backup (DBS)
             * *   SAG: Smart Access Gateway (SAG)
             * *   Memcache: ApsaraDB for Memcache
             * *   IOT_EDGE: Link IoT Edge
             * *   OCS: ApsaraDB for Memcache (previous version)
             * *   VPC: Express Connect
             * *   EHPC: Elastic High Performance Computing (E-HPC)
             * *   MPS: ApsaraVideo Media Processing
             * *   ENS: Edge Node Service (ENS)
             * *   MaxCompute_Prepay: MaxCompute
             * *   IoT_Kubernetes: Edge Application Hosting
             * *   CMS: CloudMonitor
             * *   batchcomputenew: Batch Compute
             * *   HBaseUE: ApsaraDB for HBase Performance-enhanced Edition
             * *   UIS: Ultimate Internet Service (UIS)
             * *   nls: Intelligent Speech Interaction
             * *   ots: Tablestore
             * *   NAS: Apsara File Storage NAS
             * *   ECI: Elastic Container Instance (ECI)
             * *   OpenAPI: OpenAPI Explorer
             * *   pvtzpost: Alibaba Cloud DNS PrivateZone
             * *   blinkonk8s: Flink on Kubernetes
             * *   FunctionFlow: Serverless Workflow (SWF)
             * *   SMC: Server Migration Center (SMC)
             * *   ddosbgp: Anti-DDoS Origin
             * *   baas: Blockchain as a Service
             * *   privatelink: PrivateLink
             * *   cds: ApsaraDB for Cassandra
             * *   DDH: Dedicated Host
             * *   RocketMQ: Message Queue for Apache RocketMQ
             * *   ECC: Express Cloud Connect
             * *   hbaseserverless: ApsaraDB for HBase Serverless Edition
             * *   mns_tmp: Message Service
             * *   hdr: Hybrid Disaster Recovery (HDR)
             * *   hbr: Hybrid Backup Recovery (HBR)
             * *   ADB: AnalyticDB for MySQL V3.0
             * *   tag: Tag Service
             * *   GDB: Graph Database
             * *   WAF: Web Application Firewall (WAF)
             * *   hcs_sgw: Cloud Storage Gateway (CSG)
             * *   ipv6gateway: IPv6 Gateway
             * *   RDS_SAR: ApsaraDB Exclusive Host Group
             * *   learn: Machine Learning Platform for AI
             * *   ROS: Resource Orchestration Service (ROS)
             * *   OOS: Operation Orchestration Service (OOS)
             * *   bds: Data Synchronization for HBase
             * *   cfw: Cloud Firewall
             * *   ddosDip: Anti-DDoS Premium
             * *   datahub: DataHub
             * *   hologres: Hologres
             * *   ExpressConnect: Express Connect
             * *   dbfs: Database File System (DBFS)
             * *   clickhouse: ApsaraDB for ClickHouse
             * *   k8s: Container Service for Kubernetes (ACK)
             * *   DTS: Data Transmission Service (DTS)
             * *   AnycastEIP: Anycast Elastic IP Address
             * *   Lindorm: ApsaraDB for Lindorm
             * *   config: Cloud Config
             * *   spark: Databricks DataInsight (DDI)
             * *   serverless: Serverless App Engine (SAE)
             * *   alb: Application Load Balancer (ALB)
             * *   oceanbase: ApsaraDB for OceanBase
             * *   KMS: Key Management Service (KMS)
             * *   lvwang: Content Moderation
             * *   LinkVisual: LinkVisual
             * *   tair: ApsaraDB for Redis Enhanced Edition (Tair)
             * *   dlf: Data Lake Formation (DLF)
             * *   networkmonitor: Site Monitoring
             * *   pnc: Physical Network Change
             * *   AIS: Alibaba Cloud Infrastructure
             * *   cloudgame: Cloud Gaming Platform
             * *   RTC: Real-Time Communication
             * *   cloudbox: CloudBox
             * *   actiontrail: ActionTrail
             * *   cc: Cloud Connector
             * *   disk: Elastic Block Storage (EBS)
             * *   easygene: Genomics Computing Platform
             * *   cloudphone: Elastic Cloud Phone
             * *   BMS: Bare Metal Management Service
             * *   swas: Simple Application Server
             * *   AvailabilityMonitoring: Availability Monitoring of CloudMonitor
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The alert contact groups. Valid values of N: 1 to 200.
             * <p>
             * 
             * For information about how to obtain alert contact groups, see [DescribeContactGroupList](~~114922~~).
             */
            public Builder contactGroups(String contactGroups) {
                this.contactGroups = contactGroups;
                return this;
            }

            /**
             * The dimension of the alert rule. Valid values of N: 1 to 200.
             * <p>
             * 
             * Set the value to a set of key-value pairs, for example, `userId:120886317861****` or `instanceId:i-m5e1qg6uo38rztr4****`.
             */
            public Builder dimensions(String dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * The time period during which the alert rule is effective. Valid values of N: 1 to 200.
             */
            public Builder effectiveInterval(String effectiveInterval) {
                this.effectiveInterval = effectiveInterval;
                return this;
            }

            /**
             * The subject of the alert notification email. Valid values of N: 1 to 200.
             */
            public Builder emailSubject(String emailSubject) {
                this.emailSubject = emailSubject;
                return this;
            }

            /**
             * The interval at which CloudMonitor checks whether the alert rule is triggered. Valid values of N: 1 to 200.
             * <p>
             * 
             * Unit: seconds. The default value is the lowest frequency at which the metric is polled.
             * 
             * >  We recommend that you set the interval to the data aggregation period. If the interval is shorter than the data aggregation period, alerts cannot be triggered due to insufficient data.
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
             * The name of the metric. Valid values of N: 1 to 200.
             * <p>
             * 
             * For information about how to obtain the name of a metric, see [DescribeMetricMetaList](~~98846~~) or [Appendix 1: Metrics](~~163515~~).
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * The namespace of the cloud service. Valid values of N: 1 to 200.
             * <p>
             * 
             * For information about how to obtain the namespace of a cloud service, see [DescribeMetricMetaList](~~98846~~) or [Appendix 1: Metrics](~~163515~~).
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The method that is used to handle alerts when no monitoring data is found. Valid values of N: 1 to 200. Valid value:
             * <p>
             * 
             * *   KEEP_LAST_STATE (default value): No operation is performed.
             * *   INSUFFICIENT_DATA: An alert whose content is "Insufficient data" is triggered.
             * *   OK: The alert rule has no active alerts.
             */
            public Builder noDataPolicy(String noDataPolicy) {
                this.noDataPolicy = noDataPolicy;
                return this;
            }

            /**
             * The time period during which the alert rule is ineffective. Valid values of N: 1 to 200.
             */
            public Builder noEffectiveInterval(String noEffectiveInterval) {
                this.noEffectiveInterval = noEffectiveInterval;
                return this;
            }

            /**
             * The aggregation period of the metric data. Valid values of N: 1 to 200.
             * <p>
             * 
             * Set the `Period` parameter to an integral multiple of 60. Unit: seconds. Default value: 300.
             */
            public Builder period(String period) {
                this.period = period;
                return this;
            }

            /**
             * The ID of the alert rule. Valid values of N: 1 to 200.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * The name of the alert rule. Valid values of N: 1 to 200.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * The mute period during which new alerts are not sent even if the trigger conditions are met. Valid values of N: 1 to 200.
             * <p>
             * 
             * Unit: seconds. Default value: 86400. Minimum value: 3600.
             */
            public Builder silenceTime(Integer silenceTime) {
                this.silenceTime = silenceTime;
                return this;
            }

            /**
             * The callback URL. Valid values of N: 1 to 200.
             * <p>
             * 
             * The callback URL must be accessible over the Internet. CloudMonitor pushes an alert notification to the specified callback URL by sending an HTTP POST request. Only the HTTP protocol is supported.
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
