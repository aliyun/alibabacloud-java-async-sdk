// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterServiceQuickLinkResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterServiceQuickLinkResponseBody</p>
 */
public class ListClusterServiceQuickLinkResponseBody extends TeaModel {
    @NameInMap("QuickLinkList")
    private QuickLinkList quickLinkList;

    @NameInMap("RequestId")
    private String requestId;

    private ListClusterServiceQuickLinkResponseBody(Builder builder) {
        this.quickLinkList = builder.quickLinkList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterServiceQuickLinkResponseBody create() {
        return builder().build();
    }

    /**
     * @return quickLinkList
     */
    public QuickLinkList getQuickLinkList() {
        return this.quickLinkList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private QuickLinkList quickLinkList; 
        private String requestId; 

        /**
         * QuickLinkList.
         */
        public Builder quickLinkList(QuickLinkList quickLinkList) {
            this.quickLinkList = quickLinkList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListClusterServiceQuickLinkResponseBody build() {
            return new ListClusterServiceQuickLinkResponseBody(this);
        } 

    } 

    public static class QuickLink extends TeaModel {
        @NameInMap("Port")
        private String port;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("QuickLinkAddress")
        private String quickLinkAddress;

        @NameInMap("ServiceDisplayName")
        private String serviceDisplayName;

        @NameInMap("ServiceName")
        private String serviceName;

        @NameInMap("Type")
        private String type;

        private QuickLink(Builder builder) {
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.quickLinkAddress = builder.quickLinkAddress;
            this.serviceDisplayName = builder.serviceDisplayName;
            this.serviceName = builder.serviceName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuickLink create() {
            return builder().build();
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return quickLinkAddress
         */
        public String getQuickLinkAddress() {
            return this.quickLinkAddress;
        }

        /**
         * @return serviceDisplayName
         */
        public String getServiceDisplayName() {
            return this.serviceDisplayName;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String port; 
            private String protocol; 
            private String quickLinkAddress; 
            private String serviceDisplayName; 
            private String serviceName; 
            private String type; 

            /**
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * QuickLinkAddress.
             */
            public Builder quickLinkAddress(String quickLinkAddress) {
                this.quickLinkAddress = quickLinkAddress;
                return this;
            }

            /**
             * ServiceDisplayName.
             */
            public Builder serviceDisplayName(String serviceDisplayName) {
                this.serviceDisplayName = serviceDisplayName;
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public QuickLink build() {
                return new QuickLink(this);
            } 

        } 

    }
    public static class QuickLinkList extends TeaModel {
        @NameInMap("QuickLink")
        private java.util.List < QuickLink> quickLink;

        private QuickLinkList(Builder builder) {
            this.quickLink = builder.quickLink;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuickLinkList create() {
            return builder().build();
        }

        /**
         * @return quickLink
         */
        public java.util.List < QuickLink> getQuickLink() {
            return this.quickLink;
        }

        public static final class Builder {
            private java.util.List < QuickLink> quickLink; 

            /**
             * QuickLink.
             */
            public Builder quickLink(java.util.List < QuickLink> quickLink) {
                this.quickLink = quickLink;
                return this;
            }

            public QuickLinkList build() {
                return new QuickLinkList(this);
            } 

        } 

    }
}
