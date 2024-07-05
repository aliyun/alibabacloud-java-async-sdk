// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserDevicesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserDevicesResponseBody</p>
 */
public class DescribeUserDevicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("List")
    private java.util.List < List> list;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeUserDevicesResponseBody(Builder builder) {
        this.list = builder.list;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserDevicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return list
     */
    public java.util.List < List> getList() {
        return this.list;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < List> list; 
        private String requestId; 

        /**
         * List.
         */
        public Builder list(java.util.List < List> list) {
            this.list = list;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUserDevicesResponseBody build() {
            return new DescribeUserDevicesResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private String aliUid;

        @com.aliyun.core.annotation.NameInMap("EdgeNodeName")
        private String edgeNodeName;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("MacAddress")
        private String macAddress;

        @com.aliyun.core.annotation.NameInMap("MatrixId")
        private String matrixId;

        @com.aliyun.core.annotation.NameInMap("Server")
        private String server;

        @com.aliyun.core.annotation.NameInMap("Specification")
        private String specification;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private List(Builder builder) {
            this.aliUid = builder.aliUid;
            this.edgeNodeName = builder.edgeNodeName;
            this.instanceId = builder.instanceId;
            this.macAddress = builder.macAddress;
            this.matrixId = builder.matrixId;
            this.server = builder.server;
            this.specification = builder.specification;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public String getAliUid() {
            return this.aliUid;
        }

        /**
         * @return edgeNodeName
         */
        public String getEdgeNodeName() {
            return this.edgeNodeName;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return macAddress
         */
        public String getMacAddress() {
            return this.macAddress;
        }

        /**
         * @return matrixId
         */
        public String getMatrixId() {
            return this.matrixId;
        }

        /**
         * @return server
         */
        public String getServer() {
            return this.server;
        }

        /**
         * @return specification
         */
        public String getSpecification() {
            return this.specification;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String aliUid; 
            private String edgeNodeName; 
            private String instanceId; 
            private String macAddress; 
            private String matrixId; 
            private String server; 
            private String specification; 
            private String status; 

            /**
             * AliUid.
             */
            public Builder aliUid(String aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * EdgeNodeName.
             */
            public Builder edgeNodeName(String edgeNodeName) {
                this.edgeNodeName = edgeNodeName;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * MacAddress.
             */
            public Builder macAddress(String macAddress) {
                this.macAddress = macAddress;
                return this;
            }

            /**
             * MatrixId.
             */
            public Builder matrixId(String matrixId) {
                this.matrixId = matrixId;
                return this;
            }

            /**
             * Server.
             */
            public Builder server(String server) {
                this.server = server;
                return this;
            }

            /**
             * Specification.
             */
            public Builder specification(String specification) {
                this.specification = specification;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
