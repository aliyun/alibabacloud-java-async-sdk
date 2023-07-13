// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyMetricRuleTemplateRequest} extends {@link RequestModel}
 *
 * <p>ModifyMetricRuleTemplateRequest</p>
 */
public class ModifyMetricRuleTemplateRequest extends Request {
    @Query
    @NameInMap("AlertTemplates")
    private java.util.List < AlertTemplates> alertTemplates;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("RestVersion")
    @Validation(required = true)
    private Long restVersion;

    @Query
    @NameInMap("TemplateId")
    @Validation(required = true)
    private Long templateId;

    private ModifyMetricRuleTemplateRequest(Builder builder) {
        super(builder);
        this.alertTemplates = builder.alertTemplates;
        this.description = builder.description;
        this.name = builder.name;
        this.restVersion = builder.restVersion;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyMetricRuleTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertTemplates
     */
    public java.util.List < AlertTemplates> getAlertTemplates() {
        return this.alertTemplates;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return restVersion
     */
    public Long getRestVersion() {
        return this.restVersion;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<ModifyMetricRuleTemplateRequest, Builder> {
        private java.util.List < AlertTemplates> alertTemplates; 
        private String description; 
        private String name; 
        private Long restVersion; 
        private Long templateId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyMetricRuleTemplateRequest request) {
            super(request);
            this.alertTemplates = request.alertTemplates;
            this.description = request.description;
            this.name = request.name;
            this.restVersion = request.restVersion;
            this.templateId = request.templateId;
        } 

        /**
         * AlertTemplates.
         */
        public Builder alertTemplates(java.util.List < AlertTemplates> alertTemplates) {
            this.putQueryParameter("AlertTemplates", alertTemplates);
            this.alertTemplates = alertTemplates;
            return this;
        }

        /**
         * The description of the alert template.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The name of the alert rule. Valid values of N: 1 to 200.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call was successful.
         */
        public Builder restVersion(Long restVersion) {
            this.putQueryParameter("RestVersion", restVersion);
            this.restVersion = restVersion;
            return this;
        }

        /**
         * The callback URL. Valid values of N: 1 to 200.
         * <p>
         * 
         * The callback URL must be accessible over the Internet. CloudMonitor sends a POST request to push an alert notification to the callback URL that you specify. Only HTTP requests are supported.
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public ModifyMetricRuleTemplateRequest build() {
            return new ModifyMetricRuleTemplateRequest(this);
        } 

    } 

    public static class Critical extends TeaModel {
        @NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @NameInMap("N")
        private Integer n;

        @NameInMap("Statistics")
        private String statistics;

        @NameInMap("Threshold")
        private String threshold;

        @NameInMap("Times")
        private Integer times;

        private Critical(Builder builder) {
            this.comparisonOperator = builder.comparisonOperator;
            this.n = builder.n;
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
        public Integer getN() {
            return this.n;
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
            private Integer n; 
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
            public Builder n(Integer n) {
                this.n = n;
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
        private Integer n;

        @NameInMap("Statistics")
        private String statistics;

        @NameInMap("Threshold")
        private String threshold;

        @NameInMap("Times")
        private Integer times;

        private Info(Builder builder) {
            this.comparisonOperator = builder.comparisonOperator;
            this.n = builder.n;
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
        public Integer getN() {
            return this.n;
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
            private Integer n; 
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
            public Builder n(Integer n) {
                this.n = n;
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
        private Integer n;

        @NameInMap("Statistics")
        private String statistics;

        @NameInMap("Threshold")
        private String threshold;

        @NameInMap("Times")
        private Integer times;

        private Warn(Builder builder) {
            this.comparisonOperator = builder.comparisonOperator;
            this.n = builder.n;
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
        public Integer getN() {
            return this.n;
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
            private Integer n; 
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
            public Builder n(Integer n) {
                this.n = n;
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
    public static class AlertTemplates extends TeaModel {
        @NameInMap("Escalations")
        @Validation(required = true)
        private Escalations escalations;

        @NameInMap("Category")
        private String category;

        @NameInMap("MetricName")
        private String metricName;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("Period")
        private Integer period;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("Selector")
        private String selector;

        @NameInMap("Webhook")
        private String webhook;

        private AlertTemplates(Builder builder) {
            this.escalations = builder.escalations;
            this.category = builder.category;
            this.metricName = builder.metricName;
            this.namespace = builder.namespace;
            this.period = builder.period;
            this.ruleName = builder.ruleName;
            this.selector = builder.selector;
            this.webhook = builder.webhook;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertTemplates create() {
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
         * @return period
         */
        public Integer getPeriod() {
            return this.period;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return selector
         */
        public String getSelector() {
            return this.selector;
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
            private String metricName; 
            private String namespace; 
            private Integer period; 
            private String ruleName; 
            private String selector; 
            private String webhook; 

            /**
             * Escalations.
             */
            public Builder escalations(Escalations escalations) {
                this.escalations = escalations;
                return this;
            }

            /**
             * The statistical period of monitoring data. Valid values of N: 1 to 200.
             * <p>
             * 
             * >  If the value is set to 300 seconds, the monitoring data is collected every 300 seconds. If the monitoring data is reported every 1 minute, the alert system calculates the average, maximum, and minimum values of the monitoring data of 5 minutes and checks whether the aggregated values exceed the threshold. To prevent unexpected alerts, we recommend that you set this parameter together with other parameters.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The operation that you want to perform. Set the value to ModifyMetricRuleTemplate.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * The ID of the alert template.
             * <p>
             * 
             * For information about how to obtain the ID of an alert template, see [DescribeMetricRuleTemplateList](~~114982~~).
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The dimension of the alert. It is an extended field. Valid values of N: 1 to 200.
             * <p>
             * 
             * For example, an alert template is applied to an application group, this parameter is set to `{"disk":"/"}`, and the MetricName parameter is set to `DiskUtilization`. In this case, the generated alert rule is applied to the root disk partition (`"/"`) of all instances in the application group to which the alert template is applied.
             * 
             * >  For more information about the values of extended fields, see [DescribeMetricRuleTemplateAttribute](~~114979~~).
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * The namespace of the cloud service. Valid values of N: 1 to 200.
             * <p>
             * 
             * For information about how to obtain the namespace of a cloud service, see [DescribeMetricMetaList](~~98846~~) or [Appendix 1: Metrics](~~163515~~).
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * The abbreviation of the service name. Valid values of N: 1 to 200. Valid values:
             * <p>
             * 
             * *   PolarDB: PolarDB
             * *   NewBGPDDoS: Anti-DDoS Pro
             * *   IoTDevice: IoT Platform
             * *   DRDS: PolarDB-X
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
             * *   AIRec: Artificial Intelligence Recommendation (AIRec)
             * *   GPDB: AnalyticDB for PostgreSQL
             * *   DBS: Database Backup (DBS)
             * *   SAG: Smart Access Gateway (SAG)
             * *   Memcache: ApsaraDB for Memcache
             * *   IOT_EDGE: Link IoT Edge
             * *   OCS: ApsaraDB for Memcache (previous version)
             * *   VPC: Express Connect
             * *   EHPC: Elastic High Performance Computing (E-HPC)
             * *   MPS: ApsaraVideo Media Processing (MPS)
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
            public Builder selector(String selector) {
                this.selector = selector;
                return this;
            }

            /**
             * The error message.
             */
            public Builder webhook(String webhook) {
                this.webhook = webhook;
                return this;
            }

            public AlertTemplates build() {
                return new AlertTemplates(this);
            } 

        } 

    }
}
