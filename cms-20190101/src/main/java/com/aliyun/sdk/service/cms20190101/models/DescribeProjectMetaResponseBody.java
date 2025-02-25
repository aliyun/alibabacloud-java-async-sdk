// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeProjectMetaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProjectMetaResponseBody</p>
 */
public class DescribeProjectMetaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Resources")
    private Resources resources;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private String total;

    private DescribeProjectMetaResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.resources = builder.resources;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProjectMetaResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resources
     */
    public Resources getResources() {
        return this.resources;
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
    public String getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 
        private Resources resources; 
        private Boolean success; 
        private String total; 

        /**
         * <p>The status code.</p>
         * <blockquote>
         * <p>The status code 200 indicates that the request was successful.</p>
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
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The Request is not authorization.</p>
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
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4C2061B2-3B1B-43BF-A4A4-C53426F479C0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the cloud service.</p>
         */
        public Builder resources(Resources resources) {
            this.resources = resources;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values: true: The request was successful. false: The request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder total(String total) {
            this.total = total;
            return this;
        }

        public DescribeProjectMetaResponseBody build() {
            return new DescribeProjectMetaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeProjectMetaResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProjectMetaResponseBody</p>
     */
    public static class Resource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private String labels;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        private Resource(Builder builder) {
            this.description = builder.description;
            this.labels = builder.labels;
            this.namespace = builder.namespace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resource create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return labels
         */
        public String getLabels() {
            return this.labels;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        public static final class Builder {
            private String description; 
            private String labels; 
            private String namespace; 

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>CDN</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The tags. Tags are used to filter services.</p>
             * <p>Tags are returned in the following format: <code>[{&quot;name&quot;:&quot;Tag key&quot;,&quot;value&quot;:&quot;Tag value&quot;}, {&quot;name&quot;:&quot;Tag key&quot;,&quot;value&quot;:&quot;Tag value&quot;}]</code>. The following tags are commonly used:</p>
             * <ul>
             * <li>alertUnit: the unit of the metric value in alerts. If the unit is small, the original metric value may be too large. In this case, you can use the <code>alertUnit</code> tag to specify an appropriate unit. This tag is used in CloudMonitor.</li>
             * <li>minAlertPeriod: the minimum time interval to report a new alert. The interval at which monitoring data is reported. The value is usually 1 minute.</li>
             * <li>metricCategory: the service specification. Example: kvstore_sharding. Some Alibaba Cloud services have multiple specifications that are defined in the same namespace. This parameter is used to identify the specifications.</li>
             * <li>is_alarm: indicates whether an alert rule can be configured. We recommend that you do not use the special tags in the CloudMonitor console.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;groupFlag&quot;:true}]</p>
             */
            public Builder labels(String labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The namespace of the cloud service. Format: <code>acs_Service name abbreviation</code>. For more information about namespaces, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>acs_cdn</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            public Resource build() {
                return new Resource(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeProjectMetaResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProjectMetaResponseBody</p>
     */
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Resource")
        private java.util.List < Resource> resource;

        private Resources(Builder builder) {
            this.resource = builder.resource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return resource
         */
        public java.util.List < Resource> getResource() {
            return this.resource;
        }

        public static final class Builder {
            private java.util.List < Resource> resource; 

            /**
             * Resource.
             */
            public Builder resource(java.util.List < Resource> resource) {
                this.resource = resource;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
}
