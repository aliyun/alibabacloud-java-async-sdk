// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetHostResponseBody} extends {@link TeaModel}
 *
 * <p>GetHostResponseBody</p>
 */
public class GetHostResponseBody extends TeaModel {
    @NameInMap("Host")
    private Host host;

    @NameInMap("RequestId")
    private String requestId;


    private GetHostResponseBody(Builder builder) {
        this.host = builder.host;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHostResponseBody create() {
        return builder().build();
    }

    /**
     * @return host
     */
    public Host getHost() {
        return this.host;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Host host; 
        private String requestId; 

        /**
         * <p>Host.</p>
         */
        public Builder host(Host host) {
            this.host = host;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetHostResponseBody build() {
            return new GetHostResponseBody(this);
        } 

    } 

    public static class Protocols extends TeaModel {
        @NameInMap("HostFingerPrint")
        private String hostFingerPrint;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("ProtocolName")
        private String protocolName;


        private Protocols(Builder builder) {
            this.hostFingerPrint = builder.hostFingerPrint;
            this.port = builder.port;
            this.protocolName = builder.protocolName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Protocols create() {
            return builder().build();
        }

        /**
         * @return hostFingerPrint
         */
        public String getHostFingerPrint() {
            return this.hostFingerPrint;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return protocolName
         */
        public String getProtocolName() {
            return this.protocolName;
        }

        public static final class Builder {
            private String hostFingerPrint; 
            private Integer port; 
            private String protocolName; 

            /**
             * <p>HostFingerPrint.</p>
             */
            public Builder hostFingerPrint(String hostFingerPrint) {
                this.hostFingerPrint = hostFingerPrint;
                return this;
            }

            /**
             * <p>Port.</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>ProtocolName.</p>
             */
            public Builder protocolName(String protocolName) {
                this.protocolName = protocolName;
                return this;
            }

            public Protocols build() {
                return new Protocols(this);
            } 

        } 

    }
    public static class Host extends TeaModel {
        @NameInMap("ActiveAddressType")
        private String activeAddressType;

        @NameInMap("Comment")
        private String comment;

        @NameInMap("HostId")
        private String hostId;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("HostPrivateAddress")
        private String hostPrivateAddress;

        @NameInMap("HostPublicAddress")
        private String hostPublicAddress;

        @NameInMap("OSType")
        private String OSType;

        @NameInMap("Protocols")
        private java.util.List < Protocols> protocols;

        @NameInMap("Source")
        private String source;

        @NameInMap("SourceInstanceId")
        private String sourceInstanceId;

        @NameInMap("SourceInstanceState")
        private String sourceInstanceState;


        private Host(Builder builder) {
            this.activeAddressType = builder.activeAddressType;
            this.comment = builder.comment;
            this.hostId = builder.hostId;
            this.hostName = builder.hostName;
            this.hostPrivateAddress = builder.hostPrivateAddress;
            this.hostPublicAddress = builder.hostPublicAddress;
            this.OSType = builder.OSType;
            this.protocols = builder.protocols;
            this.source = builder.source;
            this.sourceInstanceId = builder.sourceInstanceId;
            this.sourceInstanceState = builder.sourceInstanceState;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Host create() {
            return builder().build();
        }

        /**
         * @return activeAddressType
         */
        public String getActiveAddressType() {
            return this.activeAddressType;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return hostId
         */
        public String getHostId() {
            return this.hostId;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return hostPrivateAddress
         */
        public String getHostPrivateAddress() {
            return this.hostPrivateAddress;
        }

        /**
         * @return hostPublicAddress
         */
        public String getHostPublicAddress() {
            return this.hostPublicAddress;
        }

        /**
         * @return OSType
         */
        public String getOSType() {
            return this.OSType;
        }

        /**
         * @return protocols
         */
        public java.util.List < Protocols> getProtocols() {
            return this.protocols;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return sourceInstanceId
         */
        public String getSourceInstanceId() {
            return this.sourceInstanceId;
        }

        /**
         * @return sourceInstanceState
         */
        public String getSourceInstanceState() {
            return this.sourceInstanceState;
        }

        public static final class Builder {
            private String activeAddressType; 
            private String comment; 
            private String hostId; 
            private String hostName; 
            private String hostPrivateAddress; 
            private String hostPublicAddress; 
            private String OSType; 
            private java.util.List < Protocols> protocols; 
            private String source; 
            private String sourceInstanceId; 
            private String sourceInstanceState; 

            /**
             * <p>ActiveAddressType.</p>
             */
            public Builder activeAddressType(String activeAddressType) {
                this.activeAddressType = activeAddressType;
                return this;
            }

            /**
             * <p>Comment.</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>HostId.</p>
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            /**
             * <p>HostName.</p>
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * <p>HostPrivateAddress.</p>
             */
            public Builder hostPrivateAddress(String hostPrivateAddress) {
                this.hostPrivateAddress = hostPrivateAddress;
                return this;
            }

            /**
             * <p>HostPublicAddress.</p>
             */
            public Builder hostPublicAddress(String hostPublicAddress) {
                this.hostPublicAddress = hostPublicAddress;
                return this;
            }

            /**
             * <p>OSType.</p>
             */
            public Builder OSType(String OSType) {
                this.OSType = OSType;
                return this;
            }

            /**
             * <p>Protocols.</p>
             */
            public Builder protocols(java.util.List < Protocols> protocols) {
                this.protocols = protocols;
                return this;
            }

            /**
             * <p>Source.</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>SourceInstanceId.</p>
             */
            public Builder sourceInstanceId(String sourceInstanceId) {
                this.sourceInstanceId = sourceInstanceId;
                return this;
            }

            /**
             * <p>SourceInstanceState.</p>
             */
            public Builder sourceInstanceState(String sourceInstanceState) {
                this.sourceInstanceState = sourceInstanceState;
                return this;
            }

            public Host build() {
                return new Host(this);
            } 

        } 

    }
}
