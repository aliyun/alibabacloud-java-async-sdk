// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20180308.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link NodeListResponseBody} extends {@link TeaModel}
 *
 * <p>NodeListResponseBody</p>
 */
public class NodeListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private Integer errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("Nodes")
    private Nodes nodes;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("PageTotal")
    private Integer pageTotal;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private NodeListResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.nodes = builder.nodes;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.pageTotal = builder.pageTotal;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NodeListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return nodes
     */
    public Nodes getNodes() {
        return this.nodes;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pageTotal
     */
    public Integer getPageTotal() {
        return this.pageTotal;
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
        private Integer errorCode; 
        private String errorMessage; 
        private Nodes nodes; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Integer pageTotal; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(NodeListResponseBody model) {
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.nodes = model.nodes;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.pageTotal = model.pageTotal;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * ErrorCode.
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * Nodes.
         */
        public Builder nodes(Nodes nodes) {
            this.nodes = nodes;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PageTotal.
         */
        public Builder pageTotal(Integer pageTotal) {
            this.pageTotal = pageTotal;
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

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public NodeListResponseBody build() {
            return new NodeListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link NodeListResponseBody} extends {@link TeaModel}
     *
     * <p>NodeListResponseBody</p>
     */
    public static class Node extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("AliyunHost")
        private Boolean aliyunHost;

        @com.aliyun.core.annotation.NameInMap("EipAddress")
        private String eipAddress;

        @com.aliyun.core.annotation.NameInMap("EipId")
        private String eipId;

        @com.aliyun.core.annotation.NameInMap("HostName")
        private String hostName;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceTypeFamily")
        private String instanceTypeFamily;

        @com.aliyun.core.annotation.NameInMap("IpGroup")
        private String ipGroup;

        @com.aliyun.core.annotation.NameInMap("NatIp")
        private String natIp;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("OperatingSystem")
        private String operatingSystem;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("SerialNumber")
        private String serialNumber;

        @com.aliyun.core.annotation.NameInMap("TianjimonVersion")
        private String tianjimonVersion;

        private Node(Builder builder) {
            this.aliUid = builder.aliUid;
            this.aliyunHost = builder.aliyunHost;
            this.eipAddress = builder.eipAddress;
            this.eipId = builder.eipId;
            this.hostName = builder.hostName;
            this.instanceId = builder.instanceId;
            this.instanceTypeFamily = builder.instanceTypeFamily;
            this.ipGroup = builder.ipGroup;
            this.natIp = builder.natIp;
            this.networkType = builder.networkType;
            this.operatingSystem = builder.operatingSystem;
            this.region = builder.region;
            this.serialNumber = builder.serialNumber;
            this.tianjimonVersion = builder.tianjimonVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Node create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return aliyunHost
         */
        public Boolean getAliyunHost() {
            return this.aliyunHost;
        }

        /**
         * @return eipAddress
         */
        public String getEipAddress() {
            return this.eipAddress;
        }

        /**
         * @return eipId
         */
        public String getEipId() {
            return this.eipId;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceTypeFamily
         */
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        /**
         * @return ipGroup
         */
        public String getIpGroup() {
            return this.ipGroup;
        }

        /**
         * @return natIp
         */
        public String getNatIp() {
            return this.natIp;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return operatingSystem
         */
        public String getOperatingSystem() {
            return this.operatingSystem;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return serialNumber
         */
        public String getSerialNumber() {
            return this.serialNumber;
        }

        /**
         * @return tianjimonVersion
         */
        public String getTianjimonVersion() {
            return this.tianjimonVersion;
        }

        public static final class Builder {
            private Long aliUid; 
            private Boolean aliyunHost; 
            private String eipAddress; 
            private String eipId; 
            private String hostName; 
            private String instanceId; 
            private String instanceTypeFamily; 
            private String ipGroup; 
            private String natIp; 
            private String networkType; 
            private String operatingSystem; 
            private String region; 
            private String serialNumber; 
            private String tianjimonVersion; 

            private Builder() {
            } 

            private Builder(Node model) {
                this.aliUid = model.aliUid;
                this.aliyunHost = model.aliyunHost;
                this.eipAddress = model.eipAddress;
                this.eipId = model.eipId;
                this.hostName = model.hostName;
                this.instanceId = model.instanceId;
                this.instanceTypeFamily = model.instanceTypeFamily;
                this.ipGroup = model.ipGroup;
                this.natIp = model.natIp;
                this.networkType = model.networkType;
                this.operatingSystem = model.operatingSystem;
                this.region = model.region;
                this.serialNumber = model.serialNumber;
                this.tianjimonVersion = model.tianjimonVersion;
            } 

            /**
             * AliUid.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * AliyunHost.
             */
            public Builder aliyunHost(Boolean aliyunHost) {
                this.aliyunHost = aliyunHost;
                return this;
            }

            /**
             * EipAddress.
             */
            public Builder eipAddress(String eipAddress) {
                this.eipAddress = eipAddress;
                return this;
            }

            /**
             * EipId.
             */
            public Builder eipId(String eipId) {
                this.eipId = eipId;
                return this;
            }

            /**
             * HostName.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
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
             * InstanceTypeFamily.
             */
            public Builder instanceTypeFamily(String instanceTypeFamily) {
                this.instanceTypeFamily = instanceTypeFamily;
                return this;
            }

            /**
             * IpGroup.
             */
            public Builder ipGroup(String ipGroup) {
                this.ipGroup = ipGroup;
                return this;
            }

            /**
             * NatIp.
             */
            public Builder natIp(String natIp) {
                this.natIp = natIp;
                return this;
            }

            /**
             * NetworkType.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * OperatingSystem.
             */
            public Builder operatingSystem(String operatingSystem) {
                this.operatingSystem = operatingSystem;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * SerialNumber.
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * TianjimonVersion.
             */
            public Builder tianjimonVersion(String tianjimonVersion) {
                this.tianjimonVersion = tianjimonVersion;
                return this;
            }

            public Node build() {
                return new Node(this);
            } 

        } 

    }
    /**
     * 
     * {@link NodeListResponseBody} extends {@link TeaModel}
     *
     * <p>NodeListResponseBody</p>
     */
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Node")
        private java.util.List<Node> node;

        private Nodes(Builder builder) {
            this.node = builder.node;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return node
         */
        public java.util.List<Node> getNode() {
            return this.node;
        }

        public static final class Builder {
            private java.util.List<Node> node; 

            private Builder() {
            } 

            private Builder(Nodes model) {
                this.node = model.node;
            } 

            /**
             * Node.
             */
            public Builder node(java.util.List<Node> node) {
                this.node = node;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
}
