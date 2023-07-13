// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExporterRuleListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExporterRuleListResponseBody</p>
 */
public class DescribeExporterRuleListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Datapoints")
    private Datapoints datapoints;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Total")
    private Integer total;

    private DescribeExporterRuleListResponseBody(Builder builder) {
        this.code = builder.code;
        this.datapoints = builder.datapoints;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExporterRuleListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return datapoints
     */
    public Datapoints getDatapoints() {
        return this.datapoints;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
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
        private Datapoints datapoints; 
        private String message; 
        private Integer pageNumber; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        /**
         * The HTTP status code.
         * <p>
         * 
         * > The status code 200 indicates that the request was successful. Other status codes indicate that the request failed.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The details of the data export rules.
         */
        public Builder datapoints(Datapoints datapoints) {
            this.datapoints = datapoints;
            return this;
        }

        /**
         * The returned message.
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   `true`
         * *   `false`
         */
        public Builder success(Boolean success) {
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

        public DescribeExporterRuleListResponseBody build() {
            return new DescribeExporterRuleListResponseBody(this);
        } 

    } 

    public static class DstName extends TeaModel {
        @NameInMap("DstName")
        private java.util.List < String > dstName;

        private DstName(Builder builder) {
            this.dstName = builder.dstName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DstName create() {
            return builder().build();
        }

        /**
         * @return dstName
         */
        public java.util.List < String > getDstName() {
            return this.dstName;
        }

        public static final class Builder {
            private java.util.List < String > dstName; 

            /**
             * DstName.
             */
            public Builder dstName(java.util.List < String > dstName) {
                this.dstName = dstName;
                return this;
            }

            public DstName build() {
                return new DstName(this);
            } 

        } 

    }
    public static class Datapoint extends TeaModel {
        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Describe")
        private String describe;

        @NameInMap("Dimension")
        private String dimension;

        @NameInMap("DstName")
        private DstName dstName;

        @NameInMap("Enabled")
        private Boolean enabled;

        @NameInMap("MetricName")
        private String metricName;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("TargetWindows")
        private String targetWindows;

        private Datapoint(Builder builder) {
            this.createTime = builder.createTime;
            this.describe = builder.describe;
            this.dimension = builder.dimension;
            this.dstName = builder.dstName;
            this.enabled = builder.enabled;
            this.metricName = builder.metricName;
            this.namespace = builder.namespace;
            this.ruleName = builder.ruleName;
            this.targetWindows = builder.targetWindows;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Datapoint create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return describe
         */
        public String getDescribe() {
            return this.describe;
        }

        /**
         * @return dimension
         */
        public String getDimension() {
            return this.dimension;
        }

        /**
         * @return dstName
         */
        public DstName getDstName() {
            return this.dstName;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
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
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return targetWindows
         */
        public String getTargetWindows() {
            return this.targetWindows;
        }

        public static final class Builder {
            private Long createTime; 
            private String describe; 
            private String dimension; 
            private DstName dstName; 
            private Boolean enabled; 
            private String metricName; 
            private String namespace; 
            private String ruleName; 
            private String targetWindows; 

            /**
             * The time when the rule was created. The value is a UNIX timestamp.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the rule.
             */
            public Builder describe(String describe) {
                this.describe = describe;
                return this;
            }

            /**
             * The associated dimensions.
             */
            public Builder dimension(String dimension) {
                this.dimension = dimension;
                return this;
            }

            /**
             * DstName.
             */
            public Builder dstName(DstName dstName) {
                this.dstName = dstName;
                return this;
            }

            /**
             * Indicates whether the rule is enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * The name of the metric.
             * <p>
             * 
             * > For more information, see [DescribeMetricMetaList](~~98846~~) or [Appendix 1: Metrics](~~28619~~).
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * The namespace of the service.
             * <p>
             * 
             * > For more information, see [DescribeMetricMetaList](~~98846~~) or [Appendix 1: Metrics](~~28619~~).
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The name of the data export rule.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * The time window of the exported data.\
             * <p>
             * Multiple windows are separated with commas (,).
             * 
             * > Data in a time window of less than 60 seconds cannot be exported.
             */
            public Builder targetWindows(String targetWindows) {
                this.targetWindows = targetWindows;
                return this;
            }

            public Datapoint build() {
                return new Datapoint(this);
            } 

        } 

    }
    public static class Datapoints extends TeaModel {
        @NameInMap("Datapoint")
        private java.util.List < Datapoint> datapoint;

        private Datapoints(Builder builder) {
            this.datapoint = builder.datapoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Datapoints create() {
            return builder().build();
        }

        /**
         * @return datapoint
         */
        public java.util.List < Datapoint> getDatapoint() {
            return this.datapoint;
        }

        public static final class Builder {
            private java.util.List < Datapoint> datapoint; 

            /**
             * Datapoint.
             */
            public Builder datapoint(java.util.List < Datapoint> datapoint) {
                this.datapoint = datapoint;
                return this;
            }

            public Datapoints build() {
                return new Datapoints(this);
            } 

        } 

    }
}
