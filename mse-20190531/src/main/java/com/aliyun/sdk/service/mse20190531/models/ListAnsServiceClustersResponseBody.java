// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAnsServiceClustersResponseBody} extends {@link TeaModel}
 *
 * <p>ListAnsServiceClustersResponseBody</p>
 */
public class ListAnsServiceClustersResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListAnsServiceClustersResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAnsServiceClustersResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListAnsServiceClustersResponseBody build() {
            return new ListAnsServiceClustersResponseBody(this);
        } 

    } 

    public static class Clusters extends TeaModel {
        @NameInMap("DefaultCheckPort")
        private Integer defaultCheckPort;

        @NameInMap("DefaultPort")
        private Integer defaultPort;

        @NameInMap("HealthCheckerType")
        private String healthCheckerType;

        @NameInMap("Metadata")
        private java.util.Map < String, ? > metadata;

        @NameInMap("Name")
        private String name;

        @NameInMap("ServiceName")
        private String serviceName;

        @NameInMap("UseIPPort4Check")
        private Boolean useIPPort4Check;

        private Clusters(Builder builder) {
            this.defaultCheckPort = builder.defaultCheckPort;
            this.defaultPort = builder.defaultPort;
            this.healthCheckerType = builder.healthCheckerType;
            this.metadata = builder.metadata;
            this.name = builder.name;
            this.serviceName = builder.serviceName;
            this.useIPPort4Check = builder.useIPPort4Check;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Clusters create() {
            return builder().build();
        }

        /**
         * @return defaultCheckPort
         */
        public Integer getDefaultCheckPort() {
            return this.defaultCheckPort;
        }

        /**
         * @return defaultPort
         */
        public Integer getDefaultPort() {
            return this.defaultPort;
        }

        /**
         * @return healthCheckerType
         */
        public String getHealthCheckerType() {
            return this.healthCheckerType;
        }

        /**
         * @return metadata
         */
        public java.util.Map < String, ? > getMetadata() {
            return this.metadata;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return useIPPort4Check
         */
        public Boolean getUseIPPort4Check() {
            return this.useIPPort4Check;
        }

        public static final class Builder {
            private Integer defaultCheckPort; 
            private Integer defaultPort; 
            private String healthCheckerType; 
            private java.util.Map < String, ? > metadata; 
            private String name; 
            private String serviceName; 
            private Boolean useIPPort4Check; 

            /**
             * DefaultCheckPort.
             */
            public Builder defaultCheckPort(Integer defaultCheckPort) {
                this.defaultCheckPort = defaultCheckPort;
                return this;
            }

            /**
             * DefaultPort.
             */
            public Builder defaultPort(Integer defaultPort) {
                this.defaultPort = defaultPort;
                return this;
            }

            /**
             * HealthCheckerType.
             */
            public Builder healthCheckerType(String healthCheckerType) {
                this.healthCheckerType = healthCheckerType;
                return this;
            }

            /**
             * Metadata.
             */
            public Builder metadata(java.util.Map < String, ? > metadata) {
                this.metadata = metadata;
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
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * UseIPPort4Check.
             */
            public Builder useIPPort4Check(Boolean useIPPort4Check) {
                this.useIPPort4Check = useIPPort4Check;
                return this;
            }

            public Clusters build() {
                return new Clusters(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Clusters")
        private java.util.List < Clusters> clusters;

        @NameInMap("Ephemeral")
        private Boolean ephemeral;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("Metadata")
        private java.util.Map < String, ? > metadata;

        @NameInMap("Name")
        private String name;

        @NameInMap("ProtectThreshold")
        private Float protectThreshold;

        @NameInMap("SelectorType")
        private String selectorType;

        private Data(Builder builder) {
            this.clusters = builder.clusters;
            this.ephemeral = builder.ephemeral;
            this.groupName = builder.groupName;
            this.metadata = builder.metadata;
            this.name = builder.name;
            this.protectThreshold = builder.protectThreshold;
            this.selectorType = builder.selectorType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return clusters
         */
        public java.util.List < Clusters> getClusters() {
            return this.clusters;
        }

        /**
         * @return ephemeral
         */
        public Boolean getEphemeral() {
            return this.ephemeral;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return metadata
         */
        public java.util.Map < String, ? > getMetadata() {
            return this.metadata;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return protectThreshold
         */
        public Float getProtectThreshold() {
            return this.protectThreshold;
        }

        /**
         * @return selectorType
         */
        public String getSelectorType() {
            return this.selectorType;
        }

        public static final class Builder {
            private java.util.List < Clusters> clusters; 
            private Boolean ephemeral; 
            private String groupName; 
            private java.util.Map < String, ? > metadata; 
            private String name; 
            private Float protectThreshold; 
            private String selectorType; 

            /**
             * Clusters.
             */
            public Builder clusters(java.util.List < Clusters> clusters) {
                this.clusters = clusters;
                return this;
            }

            /**
             * Ephemeral.
             */
            public Builder ephemeral(Boolean ephemeral) {
                this.ephemeral = ephemeral;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * Metadata.
             */
            public Builder metadata(java.util.Map < String, ? > metadata) {
                this.metadata = metadata;
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
             * ProtectThreshold.
             */
            public Builder protectThreshold(Float protectThreshold) {
                this.protectThreshold = protectThreshold;
                return this;
            }

            /**
             * SelectorType.
             */
            public Builder selectorType(String selectorType) {
                this.selectorType = selectorType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
