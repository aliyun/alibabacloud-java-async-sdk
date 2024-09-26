// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeContainerGroupEventsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeContainerGroupEventsResponseBody</p>
 */
public class DescribeContainerGroupEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeContainerGroupEventsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContainerGroupEventsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>Details of the events.</p>
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1340C38D-6189-54D1-86F6-7D5ECF3E0088</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries of returned events.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeContainerGroupEventsResponseBody build() {
            return new DescribeContainerGroupEventsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeContainerGroupEventsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupEventsResponseBody</p>
     */
    public static class Metadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        private Metadata(Builder builder) {
            this.name = builder.name;
            this.namespace = builder.namespace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metadata create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        public static final class Builder {
            private String name; 
            private String namespace; 

            /**
             * <p>The event name.</p>
             * 
             * <strong>example:</strong>
             * <p>eci-uto-created-eci-for-ubuntu.167e3fb73cc7f9cb</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            public Metadata build() {
                return new Metadata(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeContainerGroupEventsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupEventsResponseBody</p>
     */
    public static class Source extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Component")
        private String component;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        private Source(Builder builder) {
            this.component = builder.component;
            this.host = builder.host;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Source create() {
            return builder().build();
        }

        /**
         * @return component
         */
        public String getComponent() {
            return this.component;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        public static final class Builder {
            private String component; 
            private String host; 

            /**
             * <p>The component.</p>
             * 
             * <strong>example:</strong>
             * <p>kubelet</p>
             */
            public Builder component(String component) {
                this.component = component;
                return this;
            }

            /**
             * <p>The host.</p>
             * 
             * <strong>example:</strong>
             * <p>eci</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            public Source build() {
                return new Source(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeContainerGroupEventsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupEventsResponseBody</p>
     */
    public static class InvolvedObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiVersion")
        private String apiVersion;

        @com.aliyun.core.annotation.NameInMap("Kind")
        private String kind;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("Uid")
        private String uid;

        private InvolvedObject(Builder builder) {
            this.apiVersion = builder.apiVersion;
            this.kind = builder.kind;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvolvedObject create() {
            return builder().build();
        }

        /**
         * @return apiVersion
         */
        public String getApiVersion() {
            return this.apiVersion;
        }

        /**
         * @return kind
         */
        public String getKind() {
            return this.kind;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        public static final class Builder {
            private String apiVersion; 
            private String kind; 
            private String name; 
            private String namespace; 
            private String uid; 

            /**
             * <p>The version of Kubernetes.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder apiVersion(String apiVersion) {
                this.apiVersion = apiVersion;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>Pod</p>
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * <p>The resource name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The namespace where the resource resides.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>eci-8vb5nkcq3a5cu0p3****</p>
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            public InvolvedObject build() {
                return new InvolvedObject(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeContainerGroupEventsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupEventsResponseBody</p>
     */
    public static class Events extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("FirstTimestamp")
        private String firstTimestamp;

        @com.aliyun.core.annotation.NameInMap("LastTimestamp")
        private String lastTimestamp;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Metadata")
        private Metadata metadata;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("ReportingComponent")
        private String reportingComponent;

        @com.aliyun.core.annotation.NameInMap("ReportingInstance")
        private String reportingInstance;

        @com.aliyun.core.annotation.NameInMap("Source")
        private Source source;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("involvedObject")
        private InvolvedObject involvedObject;

        private Events(Builder builder) {
            this.count = builder.count;
            this.firstTimestamp = builder.firstTimestamp;
            this.lastTimestamp = builder.lastTimestamp;
            this.message = builder.message;
            this.metadata = builder.metadata;
            this.reason = builder.reason;
            this.reportingComponent = builder.reportingComponent;
            this.reportingInstance = builder.reportingInstance;
            this.source = builder.source;
            this.type = builder.type;
            this.involvedObject = builder.involvedObject;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Events create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return firstTimestamp
         */
        public String getFirstTimestamp() {
            return this.firstTimestamp;
        }

        /**
         * @return lastTimestamp
         */
        public String getLastTimestamp() {
            return this.lastTimestamp;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return metadata
         */
        public Metadata getMetadata() {
            return this.metadata;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return reportingComponent
         */
        public String getReportingComponent() {
            return this.reportingComponent;
        }

        /**
         * @return reportingInstance
         */
        public String getReportingInstance() {
            return this.reportingInstance;
        }

        /**
         * @return source
         */
        public Source getSource() {
            return this.source;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return involvedObject
         */
        public InvolvedObject getInvolvedObject() {
            return this.involvedObject;
        }

        public static final class Builder {
            private Integer count; 
            private String firstTimestamp; 
            private String lastTimestamp; 
            private String message; 
            private Metadata metadata; 
            private String reason; 
            private String reportingComponent; 
            private String reportingInstance; 
            private Source source; 
            private String type; 
            private InvolvedObject involvedObject; 

            /**
             * <p>The number of events.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The first occurrence time of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-10-04T09:08:04Z</p>
             */
            public Builder firstTimestamp(String firstTimestamp) {
                this.firstTimestamp = firstTimestamp;
                return this;
            }

            /**
             * <p>The most recent occurrence time of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-10-04T09:08:04Z</p>
             */
            public Builder lastTimestamp(String lastTimestamp) {
                this.lastTimestamp = lastTimestamp;
                return this;
            }

            /**
             * <p>The message about the event.</p>
             * 
             * <strong>example:</strong>
             * <p>Started container</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The metadata of the event.</p>
             */
            public Builder metadata(Metadata metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The cause of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>Started</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The component from which the event is reported.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder reportingComponent(String reportingComponent) {
                this.reportingComponent = reportingComponent;
                return this;
            }

            /**
             * <p>The instance from which the event is reported.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder reportingInstance(String reportingInstance) {
                this.reportingInstance = reportingInstance;
                return this;
            }

            /**
             * <p>The source.</p>
             */
            public Builder source(Source source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The event type. Valid values:</p>
             * <ul>
             * <li>Normal</li>
             * <li>Warning</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The resource object that the event is about.</p>
             */
            public Builder involvedObject(InvolvedObject involvedObject) {
                this.involvedObject = involvedObject;
                return this;
            }

            public Events build() {
                return new Events(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeContainerGroupEventsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupEventsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Annotations")
        private String annotations;

        @com.aliyun.core.annotation.NameInMap("ContainerGroupId")
        private String containerGroupId;

        @com.aliyun.core.annotation.NameInMap("Events")
        private java.util.List < Events> events;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("uuid")
        private String uuid;

        private Data(Builder builder) {
            this.annotations = builder.annotations;
            this.containerGroupId = builder.containerGroupId;
            this.events = builder.events;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return annotations
         */
        public String getAnnotations() {
            return this.annotations;
        }

        /**
         * @return containerGroupId
         */
        public String getContainerGroupId() {
            return this.containerGroupId;
        }

        /**
         * @return events
         */
        public java.util.List < Events> getEvents() {
            return this.events;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String annotations; 
            private String containerGroupId; 
            private java.util.List < Events> events; 
            private String name; 
            private String namespace; 
            private String uuid; 

            /**
             * <p>The annotations of the elastic container instance.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;{&quot;tenancy.x-k8s.io/namespace&quot;:&quot;redis&quot;}&quot;</p>
             */
            public Builder annotations(String annotations) {
                this.annotations = annotations;
                return this;
            }

            /**
             * <p>The ID of the elastic container instance.</p>
             * 
             * <strong>example:</strong>
             * <p>eci-uf6fonnghi50v6nq****</p>
             */
            public Builder containerGroupId(String containerGroupId) {
                this.containerGroupId = containerGroupId;
                return this;
            }

            /**
             * <p>The events.</p>
             */
            public Builder events(java.util.List < Events> events) {
                this.events = events;
                return this;
            }

            /**
             * <p>The name of the elastic container instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The namespace where the elastic container instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>redis</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The UUID of the elastic container instance.</p>
             * 
             * <strong>example:</strong>
             * <p>3fc6b309-<strong><strong>-</strong></strong></p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
