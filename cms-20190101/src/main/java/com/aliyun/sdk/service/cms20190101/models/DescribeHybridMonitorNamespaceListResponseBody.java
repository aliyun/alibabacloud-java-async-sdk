// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
 * {@link DescribeHybridMonitorNamespaceListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHybridMonitorNamespaceListResponseBody</p>
 */
public class DescribeHybridMonitorNamespaceListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DescribeHybridMonitorNamespace")
    private java.util.List<DescribeHybridMonitorNamespace> describeHybridMonitorNamespace;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private DescribeHybridMonitorNamespaceListResponseBody(Builder builder) {
        this.code = builder.code;
        this.describeHybridMonitorNamespace = builder.describeHybridMonitorNamespace;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHybridMonitorNamespaceListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return describeHybridMonitorNamespace
     */
    public java.util.List<DescribeHybridMonitorNamespace> getDescribeHybridMonitorNamespace() {
        return this.describeHybridMonitorNamespace;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<DescribeHybridMonitorNamespace> describeHybridMonitorNamespace; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private String success; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(DescribeHybridMonitorNamespaceListResponseBody model) {
            this.code = model.code;
            this.describeHybridMonitorNamespace = model.describeHybridMonitorNamespace;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The details of the namespaces.</p>
         */
        public Builder describeHybridMonitorNamespace(java.util.List<DescribeHybridMonitorNamespace> describeHybridMonitorNamespace) {
            this.describeHybridMonitorNamespace = describeHybridMonitorNamespace;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Specified parameter PageSize is not valid.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1EC450A4-3221-5148-B77E-2827576CFE48</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful. Valid values:</p>
         * <ul>
         * <li><p>true: The operation was successful.</p>
         * </li>
         * <li><p>false: The operation failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeHybridMonitorNamespaceListResponseBody build() {
            return new DescribeHybridMonitorNamespaceListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHybridMonitorNamespaceListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHybridMonitorNamespaceListResponseBody</p>
     */
    public static class MetricList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<String> list;

        @com.aliyun.core.annotation.NameInMap("Period")
        private Long period;

        private MetricList(Builder builder) {
            this.list = builder.list;
            this.period = builder.period;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetricList create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List<String> getList() {
            return this.list;
        }

        /**
         * @return period
         */
        public Long getPeriod() {
            return this.period;
        }

        public static final class Builder {
            private java.util.List<String> list; 
            private Long period; 

            private Builder() {
            } 

            private Builder(MetricList model) {
                this.list = model.list;
                this.period = model.period;
            } 

            /**
             * <p>The list of metrics.</p>
             */
            public Builder list(java.util.List<String> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The collection period of the metric.</p>
             * <p>Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder period(Long period) {
                this.period = period;
                return this;
            }

            public MetricList build() {
                return new MetricList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeHybridMonitorNamespaceListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHybridMonitorNamespaceListResponseBody</p>
     */
    public static class NamespaceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MetricList")
        private java.util.List<MetricList> metricList;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        private NamespaceList(Builder builder) {
            this.metricList = builder.metricList;
            this.namespace = builder.namespace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NamespaceList create() {
            return builder().build();
        }

        /**
         * @return metricList
         */
        public java.util.List<MetricList> getMetricList() {
            return this.metricList;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        public static final class Builder {
            private java.util.List<MetricList> metricList; 
            private String namespace; 

            private Builder() {
            } 

            private Builder(NamespaceList model) {
                this.metricList = model.metricList;
                this.namespace = model.namespace;
            } 

            /**
             * <p>The list of metrics for the Alibaba Cloud service.</p>
             */
            public Builder metricList(java.util.List<MetricList> metricList) {
                this.metricList = metricList;
                return this;
            }

            /**
             * <p>The data namespace of the Alibaba Cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>acs_ecs_dashboard</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            public NamespaceList build() {
                return new NamespaceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeHybridMonitorNamespaceListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHybridMonitorNamespaceListResponseBody</p>
     */
    public static class AliyunProductMetricList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NamespaceList")
        private java.util.List<NamespaceList> namespaceList;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private Long userId;

        @com.aliyun.core.annotation.NameInMap("YAMLConfig")
        private String YAMLConfig;

        private AliyunProductMetricList(Builder builder) {
            this.namespaceList = builder.namespaceList;
            this.userId = builder.userId;
            this.YAMLConfig = builder.YAMLConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AliyunProductMetricList create() {
            return builder().build();
        }

        /**
         * @return namespaceList
         */
        public java.util.List<NamespaceList> getNamespaceList() {
            return this.namespaceList;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        /**
         * @return YAMLConfig
         */
        public String getYAMLConfig() {
            return this.YAMLConfig;
        }

        public static final class Builder {
            private java.util.List<NamespaceList> namespaceList; 
            private Long userId; 
            private String YAMLConfig; 

            private Builder() {
            } 

            private Builder(AliyunProductMetricList model) {
                this.namespaceList = model.namespaceList;
                this.userId = model.userId;
                this.YAMLConfig = model.YAMLConfig;
            } 

            /**
             * <p>The list of namespaces.</p>
             */
            public Builder namespaceList(java.util.List<NamespaceList> namespaceList) {
                this.namespaceList = namespaceList;
                return this;
            }

            /**
             * <p>The account that is used to create the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>120886317861****</p>
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The configuration file for the Alibaba Cloud service that is connected to Hybrid Cloud Monitoring.</p>
             * <ul>
             * <li><p>namespace: the namespace of the Alibaba Cloud service.</p>
             * </li>
             * <li><p>metric_list: the metrics of the Alibaba Cloud service.</p>
             * </li>
             * <li><p>dimension: the resources of the Alibaba Cloud service that can be queried in Hybrid Cloud Monitoring. If this parameter is empty, all resources are monitored.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>products:- namespace: acs_ecs_dashboard metric_info: - metric_list: - cpu_total dimension: \&quot;\&quot;</p>
             */
            public Builder YAMLConfig(String YAMLConfig) {
                this.YAMLConfig = YAMLConfig;
                return this;
            }

            public AliyunProductMetricList build() {
                return new AliyunProductMetricList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeHybridMonitorNamespaceListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHybridMonitorNamespaceListResponseBody</p>
     */
    public static class Detail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NamespaceRegion")
        private String namespaceRegion;

        @com.aliyun.core.annotation.NameInMap("PrometheusInstanceId")
        private String prometheusInstanceId;

        @com.aliyun.core.annotation.NameInMap("SLSProject")
        private String SLSProject;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private String spec;

        private Detail(Builder builder) {
            this.namespaceRegion = builder.namespaceRegion;
            this.prometheusInstanceId = builder.prometheusInstanceId;
            this.SLSProject = builder.SLSProject;
            this.spec = builder.spec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Detail create() {
            return builder().build();
        }

        /**
         * @return namespaceRegion
         */
        public String getNamespaceRegion() {
            return this.namespaceRegion;
        }

        /**
         * @return prometheusInstanceId
         */
        public String getPrometheusInstanceId() {
            return this.prometheusInstanceId;
        }

        /**
         * @return SLSProject
         */
        public String getSLSProject() {
            return this.SLSProject;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        public static final class Builder {
            private String namespaceRegion; 
            private String prometheusInstanceId; 
            private String SLSProject; 
            private String spec; 

            private Builder() {
            } 

            private Builder(Detail model) {
                this.namespaceRegion = model.namespaceRegion;
                this.prometheusInstanceId = model.prometheusInstanceId;
                this.SLSProject = model.SLSProject;
                this.spec = model.spec;
            } 

            /**
             * <p>The region where the monitoring data is stored.</p>
             * <blockquote>
             * <p>This parameter is returned if you set <code>NamespaceType</code> to <code>m_prom_user</code> when you create the namespace.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder namespaceRegion(String namespaceRegion) {
                this.namespaceRegion = namespaceRegion;
                return this;
            }

            /**
             * <p>The Prometheus instance where the monitoring data is stored.</p>
             * <blockquote>
             * <p>This parameter is returned if you set <code>NamespaceType</code> to <code>aliyun_prometheus</code> when you create the namespace.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>rw-57******************7f</p>
             */
            public Builder prometheusInstanceId(String prometheusInstanceId) {
                this.prometheusInstanceId = prometheusInstanceId;
                return this;
            }

            /**
             * <p>The Simple Log Service (SLS) project where the monitoring data is stored.</p>
             * <blockquote>
             * <p>This parameter is returned if you set <code>NamespaceType</code> to <code>m_prom_user</code> when you create the namespace.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cms-hybrid-120886317861****-cn-hangzhou-a83d</p>
             */
            public Builder SLSProject(String SLSProject) {
                this.SLSProject = SLSProject;
                return this;
            }

            /**
             * <p>The data storage duration. Valid values:</p>
             * <ul>
             * <li><p>cms.s1.large: 15 days.</p>
             * </li>
             * <li><p>cms.s1.xlarge: 32 days.</p>
             * </li>
             * <li><p>cms.s1.2xlarge: 63 days.</p>
             * </li>
             * <li><p>cms.s1.3xlarge: 93 days.</p>
             * </li>
             * <li><p>cms.s1.6xlarge: 185 days.</p>
             * </li>
             * <li><p>cms.s1.12xlarge: 376 days.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cms.s1.3xlarge</p>
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            public Detail build() {
                return new Detail(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeHybridMonitorNamespaceListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHybridMonitorNamespaceListResponseBody</p>
     */
    public static class DescribeHybridMonitorNamespace extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunProductMetricList")
        private java.util.List<AliyunProductMetricList> aliyunProductMetricList;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Detail")
        private Detail detail;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IsDelete")
        private Integer isDelete;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("NamespaceType")
        private String namespaceType;

        @com.aliyun.core.annotation.NameInMap("NotAliyunTaskNumber")
        private Long notAliyunTaskNumber;

        private DescribeHybridMonitorNamespace(Builder builder) {
            this.aliyunProductMetricList = builder.aliyunProductMetricList;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.detail = builder.detail;
            this.id = builder.id;
            this.isDelete = builder.isDelete;
            this.modifyTime = builder.modifyTime;
            this.namespace = builder.namespace;
            this.namespaceType = builder.namespaceType;
            this.notAliyunTaskNumber = builder.notAliyunTaskNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DescribeHybridMonitorNamespace create() {
            return builder().build();
        }

        /**
         * @return aliyunProductMetricList
         */
        public java.util.List<AliyunProductMetricList> getAliyunProductMetricList() {
            return this.aliyunProductMetricList;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return detail
         */
        public Detail getDetail() {
            return this.detail;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return isDelete
         */
        public Integer getIsDelete() {
            return this.isDelete;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return namespaceType
         */
        public String getNamespaceType() {
            return this.namespaceType;
        }

        /**
         * @return notAliyunTaskNumber
         */
        public Long getNotAliyunTaskNumber() {
            return this.notAliyunTaskNumber;
        }

        public static final class Builder {
            private java.util.List<AliyunProductMetricList> aliyunProductMetricList; 
            private String createTime; 
            private String description; 
            private Detail detail; 
            private String id; 
            private Integer isDelete; 
            private String modifyTime; 
            private String namespace; 
            private String namespaceType; 
            private Long notAliyunTaskNumber; 

            private Builder() {
            } 

            private Builder(DescribeHybridMonitorNamespace model) {
                this.aliyunProductMetricList = model.aliyunProductMetricList;
                this.createTime = model.createTime;
                this.description = model.description;
                this.detail = model.detail;
                this.id = model.id;
                this.isDelete = model.isDelete;
                this.modifyTime = model.modifyTime;
                this.namespace = model.namespace;
                this.namespaceType = model.namespaceType;
                this.notAliyunTaskNumber = model.notAliyunTaskNumber;
            } 

            /**
             * <p>The configuration details of data import tasks for Alibaba Cloud services.</p>
             */
            public Builder aliyunProductMetricList(java.util.List<AliyunProductMetricList> aliyunProductMetricList) {
                this.aliyunProductMetricList = aliyunProductMetricList;
                return this;
            }

            /**
             * <p>The timestamp when the namespace was created.</p>
             * <p>Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1652682744000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun-test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The details of the data storage duration.</p>
             */
            public Builder detail(Detail detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The namespace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether the namespace is deleted. Valid values:</p>
             * <ul>
             * <li><p>0: The namespace is not deleted.</p>
             * </li>
             * <li><p>1: The namespace is deleted.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder isDelete(Integer isDelete) {
                this.isDelete = isDelete;
                return this;
            }

            /**
             * <p>The timestamp when the namespace was last modified. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1652682744000</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The name of the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun-test</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The storage solution for monitoring data. Valid values:</p>
             * <ul>
             * <li><p>m_prom_user: The monitoring data is stored in SLS.</p>
             * </li>
             * <li><p>m_prom_pool: The monitoring data is stored in the storage space provided by Cloud Monitor.</p>
             * </li>
             * <li><p>aliyun_prometheus: The monitoring data is stored in a Prometheus instance.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>aliyun_prometheus</p>
             */
            public Builder namespaceType(String namespaceType) {
                this.namespaceType = namespaceType;
                return this;
            }

            /**
             * <p>The number of data import tasks for non-Alibaba Cloud services.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder notAliyunTaskNumber(Long notAliyunTaskNumber) {
                this.notAliyunTaskNumber = notAliyunTaskNumber;
                return this;
            }

            public DescribeHybridMonitorNamespace build() {
                return new DescribeHybridMonitorNamespace(this);
            } 

        } 

    }
}
