// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeExporterRuleListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExporterRuleListResponseBody</p>
 */
public class DescribeExporterRuleListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Datapoints")
    private Datapoints datapoints;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
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
         * <p>The HTTP status code.</p>
         * <blockquote>
         * <p>The status code 200 indicates that the request was successful. Other status codes indicate that the request failed.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The details of the data export rules.</p>
         */
        public Builder datapoints(Datapoints datapoints) {
            this.datapoints = datapoints;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>susscess</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6BA047CA-8BC6-40BC-BC8F-FBECF35F1993</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeExporterRuleListResponseBody build() {
            return new DescribeExporterRuleListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeExporterRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeExporterRuleListResponseBody</p>
     */
    public static class DstName extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DstName")
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
    /**
     * 
     * {@link DescribeExporterRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeExporterRuleListResponseBody</p>
     */
    public static class Datapoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Describe")
        private String describe;

        @com.aliyun.core.annotation.NameInMap("Dimension")
        private String dimension;

        @com.aliyun.core.annotation.NameInMap("DstName")
        private DstName dstName;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("TargetWindows")
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
             * <p>The time when the rule was created. The value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1584024616228</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Export monitoring data</p>
             */
            public Builder describe(String describe) {
                this.describe = describe;
                return this;
            }

            /**
             * <p>The associated dimensions.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;instanceId&quot;:&quot;xxxxx&quot;}</p>
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
             * <p>Indicates whether the rule is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * <blockquote>
             * <p>For more information, see <a href="https://help.aliyun.com/document_detail/98846.html">DescribeMetricMetaList</a> or <a href="https://help.aliyun.com/document_detail/28619.html">Appendix 1: Metrics</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cpu_total</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The namespace of the service.</p>
             * <blockquote>
             * <p>For more information, see <a href="https://help.aliyun.com/document_detail/98846.html">DescribeMetricMetaList</a> or <a href="https://help.aliyun.com/document_detail/28619.html">Appendix 1: Metrics</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>acs_ecs_dashboard</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The name of the data export rule.</p>
             * 
             * <strong>example:</strong>
             * <p>myRuleName</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The time window of the exported data.<br>Multiple windows are separated with commas (,).</p>
             * <blockquote>
             * <p>Data in a time window of less than 60 seconds cannot be exported.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>60,300</p>
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
    /**
     * 
     * {@link DescribeExporterRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeExporterRuleListResponseBody</p>
     */
    public static class Datapoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Datapoint")
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
