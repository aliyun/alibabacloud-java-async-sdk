// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHybridMonitorNamespaceListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHybridMonitorNamespaceListResponseBody</p>
 */
public class DescribeHybridMonitorNamespaceListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("DescribeHybridMonitorNamespace")
    private java.util.List < DescribeHybridMonitorNamespace> describeHybridMonitorNamespace;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    @NameInMap("Total")
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
         * The returned message.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The details of the namespaces.
         */
        public Builder describeHybridMonitorNamespace(java.util.List < DescribeHybridMonitorNamespace> describeHybridMonitorNamespace) {
            this.describeHybridMonitorNamespace = describeHybridMonitorNamespace;
            return this;
        }

        /**
         * The error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the call was successful. Valid values:
         * <p>
         * 
         * *   true: The call was successful.
         * *   false: The call failed.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of returned entries.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeHybridMonitorNamespaceListResponseBody build() {
            return new DescribeHybridMonitorNamespaceListResponseBody(this);
        } 

    } 

    public static class MetricList extends TeaModel {
        @NameInMap("List")
        private java.util.List < String > list;

        @NameInMap("Period")
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
             * The metrics.
             */
            public Builder list(java.util.List < String > list) {
                this.list = list;
                return this;
            }

            /**
             * The interval at which metrics are collected.
             * <p>
             * 
             * Unit: seconds.
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
    public static class NamespaceList extends TeaModel {
        @NameInMap("MetricList")
        private java.util.List < MetricList> metricList;

        @NameInMap("Namespace")
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
             * The list of metrics for the Alibaba Cloud service.
             */
            public Builder metricList(java.util.List < MetricList> metricList) {
                this.metricList = metricList;
                return this;
            }

            /**
             * The namespace for the Alibaba Cloud service.
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
    public static class AliyunProductMetricList extends TeaModel {
        @NameInMap("NamespaceList")
        private java.util.List < NamespaceList> namespaceList;

        @NameInMap("UserId")
        private Long userId;

        @NameInMap("YAMLConfig")
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
             * The list of namespaces.
             */
            public Builder namespaceList(java.util.List < NamespaceList> namespaceList) {
                this.namespaceList = namespaceList;
                return this;
            }

            /**
             * The account that is used to create the namespace.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * YAMLConfig.
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
    public static class Detail extends TeaModel {
        @NameInMap("Spec")
        private String spec;

        private Detail(Builder builder) {
            this.spec = builder.spec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Detail create() {
            return builder().build();
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        public static final class Builder {
            private String spec; 

            /**
             * The data retention period. Valid values:
             * <p>
             * 
             * *   cms.s1.large: Data is stored for 15 days.
             * *   cms.s1.xlarge: Data is stored for 32 days.
             * *   cms.s1.2xlarge: Data is stored for 63 days.
             * *   cms.s1.3xlarge: Data is stored for 93 days.
             * *   cms.s1.6xlarge: Data is stored for 185 days.
             * *   cms.s1.12xlarge: Data is stored for 376 days.
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
    public static class DescribeHybridMonitorNamespace extends TeaModel {
        @NameInMap("AliyunProductMetricList")
        private java.util.List < AliyunProductMetricList> aliyunProductMetricList;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("Detail")
        private Detail detail;

        @NameInMap("Id")
        private String id;

        @NameInMap("IsDelete")
        private Integer isDelete;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("NotAliyunTaskNumber")
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
            private Long notAliyunTaskNumber; 

            /**
             * The configuration details of metric import tasks for Alibaba Cloud services.
             */
            public Builder aliyunProductMetricList(java.util.List < AliyunProductMetricList> aliyunProductMetricList) {
                this.aliyunProductMetricList = aliyunProductMetricList;
                return this;
            }

            /**
             * The timestamp that was generated when the namespace was created.
             * <p>
             * 
             * Unit: milliseconds.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the namespace.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The details of the data retention period.
             */
            public Builder detail(Detail detail) {
                this.detail = detail;
                return this;
            }

            /**
             * The ID of the namespace.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Indicates whether the namespace is deleted. Valid values:
             * <p>
             * 
             * *   0: The namespace is not deleted.
             * *   1: The namespace is deleted.
             */
            public Builder isDelete(Integer isDelete) {
                this.isDelete = isDelete;
                return this;
            }

            /**
             * The timestamp that was generated when the namespace was last modified.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * The name of the namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The number of metric import tasks for third-party services.
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
