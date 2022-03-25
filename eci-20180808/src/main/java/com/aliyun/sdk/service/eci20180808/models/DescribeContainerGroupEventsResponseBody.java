// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeContainerGroupEventsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeContainerGroupEventsResponseBody</p>
 */
public class DescribeContainerGroupEventsResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeContainerGroupEventsResponseBody build() {
            return new DescribeContainerGroupEventsResponseBody(this);
        } 

    } 

    public static class Metadata extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Namespace")
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Namespace.
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
    public static class Source extends TeaModel {
        @NameInMap("Component")
        private String component;

        @NameInMap("Host")
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
             * Component.
             */
            public Builder component(String component) {
                this.component = component;
                return this;
            }

            /**
             * Host.
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
    public static class InvolvedObject extends TeaModel {
        @NameInMap("ApiVersion")
        private String apiVersion;

        @NameInMap("Kind")
        private String kind;

        @NameInMap("Name")
        private String name;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("Uid")
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
             * ApiVersion.
             */
            public Builder apiVersion(String apiVersion) {
                this.apiVersion = apiVersion;
                return this;
            }

            /**
             * Kind.
             */
            public Builder kind(String kind) {
                this.kind = kind;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * Uid.
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
    public static class Events extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("FirstTimestamp")
        private String firstTimestamp;

        @NameInMap("LastTimestamp")
        private String lastTimestamp;

        @NameInMap("Message")
        private String message;

        @NameInMap("Metadata")
        private Metadata metadata;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("ReportingComponent")
        private String reportingComponent;

        @NameInMap("ReportingInstance")
        private String reportingInstance;

        @NameInMap("Source")
        private Source source;

        @NameInMap("Type")
        private String type;

        @NameInMap("involvedObject")
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
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * FirstTimestamp.
             */
            public Builder firstTimestamp(String firstTimestamp) {
                this.firstTimestamp = firstTimestamp;
                return this;
            }

            /**
             * LastTimestamp.
             */
            public Builder lastTimestamp(String lastTimestamp) {
                this.lastTimestamp = lastTimestamp;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * Metadata.
             */
            public Builder metadata(Metadata metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * ReportingComponent.
             */
            public Builder reportingComponent(String reportingComponent) {
                this.reportingComponent = reportingComponent;
                return this;
            }

            /**
             * ReportingInstance.
             */
            public Builder reportingInstance(String reportingInstance) {
                this.reportingInstance = reportingInstance;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(Source source) {
                this.source = source;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * involvedObject.
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
    public static class Data extends TeaModel {
        @NameInMap("ContainerGroupId")
        private String containerGroupId;

        @NameInMap("Events")
        private java.util.List < Events> events;

        private Data(Builder builder) {
            this.containerGroupId = builder.containerGroupId;
            this.events = builder.events;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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

        public static final class Builder {
            private String containerGroupId; 
            private java.util.List < Events> events; 

            /**
             * ContainerGroupId.
             */
            public Builder containerGroupId(String containerGroupId) {
                this.containerGroupId = containerGroupId;
                return this;
            }

            /**
             * Events.
             */
            public Builder events(java.util.List < Events> events) {
                this.events = events;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
