// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
    private java.util.List < DescribeHybridMonitorNamespace> describeHybridMonitorNamespace;

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

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return describeHybridMonitorNamespace
     */
    public java.util.List < DescribeHybridMonitorNamespace> getDescribeHybridMonitorNamespace() {
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
        private java.util.List < DescribeHybridMonitorNamespace> describeHybridMonitorNamespace; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private String success; 
        private Integer total; 

        /**
         * <p>The response code.</p>
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
        public Builder describeHybridMonitorNamespace(java.util.List < DescribeHybridMonitorNamespace> describeHybridMonitorNamespace) {
            this.describeHybridMonitorNamespace = describeHybridMonitorNamespace;
            return this;
        }

        /**
         * <p>The returned message.</p>
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
         * <p>The number of entries per page.</p>
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
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
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
         * <p>The total number of entries returned.</p>
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
        private java.util.List < String > list;

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
        public java.util.List < String > getList() {
            return this.list;
        }

        /**
         * @return period
         */
        public Long getPeriod() {
            return this.period;
        }

        public static final class Builder {
            private java.util.List < String > list; 
            private Long period; 

            /**
             * <p>The metrics.</p>
             */
            public Builder list(java.util.List < String > list) {
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
        private java.util.List < MetricList> metricList;

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
        public java.util.List < MetricList> getMetricList() {
            return this.metricList;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        public static final class Builder {
            private java.util.List < MetricList> metricList; 
            private String namespace; 

            /**
             * <p>The metrics for the Alibaba Cloud service.</p>
             */
            public Builder metricList(java.util.List < MetricList> metricList) {
                this.metricList = metricList;
                return this;
            }

            /**
             * <p>The namespace for the Alibaba Cloud service.</p>
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
        private java.util.List < NamespaceList> namespaceList;

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
        public java.util.List < NamespaceList> getNamespaceList() {
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
            private java.util.List < NamespaceList> namespaceList; 
            private Long userId; 
            private String YAMLConfig; 

            /**
             * <p>The namespaces.</p>
             */
            public Builder namespaceList(java.util.List < NamespaceList> namespaceList) {
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
             * <p>The configuration file of the Alibaba Cloud service that you want to monitor by using Hybrid Cloud Monitoring.</p>
             * <ul>
             * <li>namespace: the namespace of the Alibaba Cloud service.</li>
             * <li>metric_list: the metrics of the Alibaba Cloud service.</li>
             * <li>dimension: the resources of the Alibaba Cloud service that you want to monitor by using Hybrid Cloud Monitoring. If you do not specify a dimension, all resources of the Alibaba Cloud service are monitored.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>products:- namespace: acs_ecs_dashboard metric_info: - metric_list: - cpu_total dimension: &quot;&quot;</p>
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

        @com.aliyun.core.annotation.NameInMap("SLSProject")
        private String SLSProject;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private String spec;

        private Detail(Builder builder) {
            this.namespaceRegion = builder.namespaceRegion;
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
            private String SLSProject; 
            private String spec; 

            /**
             * <p>The region where the metric data is stored.</p>
             * <blockquote>
             * <p> This parameter is returned if you select <code>m_prom_user</code> for <code>NamespaceType</code> when you create a namespace.</p>
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
             * <p>The project where the metric data is located.</p>
             * <blockquote>
             * <p> This parameter is returned if you select <code>m_prom_user</code> for <code>NamespaceType</code> when you create a namespace.</p>
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
             * <p>The data retention period. Valid values:</p>
             * <ul>
             * <li>cms.s1.large (Retention Period 15 Days)</li>
             * <li>cms.s1.xlarge (Retention Period 32 Days)</li>
             * <li>cms.s1.2xlarge (Retention Period 63 Days)</li>
             * <li>cms.s1.3xlarge (Retention Period 93 Days)</li>
             * <li>cms.s1.6xlarge (Retention Period 185 Days)</li>
             * <li>cms.s1.12xlarge (Retention Period 367 Days)</li>
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
        private java.util.List < AliyunProductMetricList> aliyunProductMetricList;

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
        public java.util.List < AliyunProductMetricList> getAliyunProductMetricList() {
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
            private java.util.List < AliyunProductMetricList> aliyunProductMetricList; 
            private String createTime; 
            private String description; 
            private Detail detail; 
            private String id; 
            private Integer isDelete; 
            private String modifyTime; 
            private String namespace; 
            private String namespaceType; 
            private Long notAliyunTaskNumber; 

            /**
             * <p>The configuration details of metric import tasks for Alibaba Cloud services.</p>
             */
            public Builder aliyunProductMetricList(java.util.List < AliyunProductMetricList> aliyunProductMetricList) {
                this.aliyunProductMetricList = aliyunProductMetricList;
                return this;
            }

            /**
             * <p>The timestamp that was generated when the namespace was created.</p>
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
             * <p>The details of the data retention period.</p>
             */
            public Builder detail(Detail detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The ID of the namespace.</p>
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
             * <li>0: The namespace is not deleted.</li>
             * <li>1: The namespace is deleted.</li>
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
             * <p>The timestamp that was generated when the namespace was last modified.</p>
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
             * <p>The storage scheme of metric data. Valid values:</p>
             * <ul>
             * <li>m_prom_user: The metric data is stored in Simple Log Service.</li>
             * <li>m_prom_pool: The metric data is stored in the storage space provided by CloudMonitor.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>m_prom_user</p>
             */
            public Builder namespaceType(String namespaceType) {
                this.namespaceType = namespaceType;
                return this;
            }

            /**
             * <p>The number of metric import tasks for third-party services.</p>
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
