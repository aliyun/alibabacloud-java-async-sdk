// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceAccessDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceAccessDetailResponseBody</p>
 */
public class DescribeServiceAccessDetailResponseBody extends TeaModel {
    @NameInMap("AccessDetail")
    private AccessDetail accessDetail;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeServiceAccessDetailResponseBody(Builder builder) {
        this.accessDetail = builder.accessDetail;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceAccessDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDetail
     */
    public AccessDetail getAccessDetail() {
        return this.accessDetail;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AccessDetail accessDetail; 
        private String requestId; 

        /**
         * AccessDetail.
         */
        public Builder accessDetail(AccessDetail accessDetail) {
            this.accessDetail = accessDetail;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeServiceAccessDetailResponseBody build() {
            return new DescribeServiceAccessDetailResponseBody(this);
        } 

    } 

    public static class AccessDetail extends TeaModel {
        @NameInMap("ClusterIP")
        private String clusterIP;

        @NameInMap("Name")
        private String name;

        @NameInMap("Ports")
        private String ports;

        @NameInMap("Type")
        private String type;

        private AccessDetail(Builder builder) {
            this.clusterIP = builder.clusterIP;
            this.name = builder.name;
            this.ports = builder.ports;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessDetail create() {
            return builder().build();
        }

        /**
         * @return clusterIP
         */
        public String getClusterIP() {
            return this.clusterIP;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ports
         */
        public String getPorts() {
            return this.ports;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String clusterIP; 
            private String name; 
            private String ports; 
            private String type; 

            /**
             * ClusterIP.
             */
            public Builder clusterIP(String clusterIP) {
                this.clusterIP = clusterIP;
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
             * Ports.
             */
            public Builder ports(String ports) {
                this.ports = ports;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public AccessDetail build() {
                return new AccessDetail(this);
            } 

        } 

    }
}
