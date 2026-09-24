// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link ListInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceResponseBody</p>
 */
public class ListInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Headers")
    private Headers headers;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    private ListInstanceResponseBody(Builder builder) {
        this.headers = builder.headers;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return headers
     */
    public Headers getHeaders() {
        return this.headers;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List<Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private Headers headers; 
        private String requestId; 
        private java.util.List<Result> result; 

        private Builder() {
        } 

        private Builder(ListInstanceResponseBody model) {
            this.headers = model.headers;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The response headers.</p>
         */
        public Builder headers(Headers headers) {
            this.headers = headers;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned results.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        public ListInstanceResponseBody build() {
            return new ListInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceResponseBody</p>
     */
    public static class Headers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("X-Total-Count")
        private Integer xTotalCount;

        private Headers(Builder builder) {
            this.xTotalCount = builder.xTotalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Headers create() {
            return builder().build();
        }

        /**
         * @return xTotalCount
         */
        public Integer getXTotalCount() {
            return this.xTotalCount;
        }

        public static final class Builder {
            private Integer xTotalCount; 

            private Builder() {
            } 

            private Builder(Headers model) {
                this.xTotalCount = model.xTotalCount;
            } 

            /**
             * <p>The total number of instance records.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder xTotalCount(Integer xTotalCount) {
                this.xTotalCount = xTotalCount;
                return this;
            }

            public Headers build() {
                return new Headers(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceResponseBody</p>
     */
    public static class ClientNodeConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("amount")
        private Integer amount;

        @com.aliyun.core.annotation.NameInMap("disk")
        private Integer disk;

        @com.aliyun.core.annotation.NameInMap("diskType")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("specInfo")
        private String specInfo;

        private ClientNodeConfiguration(Builder builder) {
            this.amount = builder.amount;
            this.disk = builder.disk;
            this.diskType = builder.diskType;
            this.spec = builder.spec;
            this.specInfo = builder.specInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientNodeConfiguration create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Integer getAmount() {
            return this.amount;
        }

        /**
         * @return disk
         */
        public Integer getDisk() {
            return this.disk;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        /**
         * @return specInfo
         */
        public String getSpecInfo() {
            return this.specInfo;
        }

        public static final class Builder {
            private Integer amount; 
            private Integer disk; 
            private String diskType; 
            private String spec; 
            private String specInfo; 

            private Builder() {
            } 

            private Builder(ClientNodeConfiguration model) {
                this.amount = model.amount;
                this.disk = model.disk;
                this.diskType = model.diskType;
                this.spec = model.spec;
                this.specInfo = model.specInfo;
            } 

            /**
             * <p>The number of nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>The storage size of the node. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder disk(Integer disk) {
                this.disk = disk;
                return this;
            }

            /**
             * <p>The storage type of the node. Only ultra disks (cloud_efficiency) are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_efficiency</p>
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * <p>The node specifications. For more information, see <a href="https://help.aliyun.com/document_detail/271718.html">Product specifications</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>elasticsearch.sn2ne.large</p>
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * <p>The node specifications description.</p>
             * 
             * <strong>example:</strong>
             * <p>1C 2G</p>
             */
            public Builder specInfo(String specInfo) {
                this.specInfo = specInfo;
                return this;
            }

            public ClientNodeConfiguration build() {
                return new ClientNodeConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceResponseBody</p>
     */
    public static class ElasticDataNodeConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("amount")
        private Integer amount;

        @com.aliyun.core.annotation.NameInMap("disk")
        private Integer disk;

        @com.aliyun.core.annotation.NameInMap("diskEncryption")
        private Boolean diskEncryption;

        @com.aliyun.core.annotation.NameInMap("diskType")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("specInfo")
        private String specInfo;

        private ElasticDataNodeConfiguration(Builder builder) {
            this.amount = builder.amount;
            this.disk = builder.disk;
            this.diskEncryption = builder.diskEncryption;
            this.diskType = builder.diskType;
            this.spec = builder.spec;
            this.specInfo = builder.specInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ElasticDataNodeConfiguration create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Integer getAmount() {
            return this.amount;
        }

        /**
         * @return disk
         */
        public Integer getDisk() {
            return this.disk;
        }

        /**
         * @return diskEncryption
         */
        public Boolean getDiskEncryption() {
            return this.diskEncryption;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        /**
         * @return specInfo
         */
        public String getSpecInfo() {
            return this.specInfo;
        }

        public static final class Builder {
            private Integer amount; 
            private Integer disk; 
            private Boolean diskEncryption; 
            private String diskType; 
            private String spec; 
            private String specInfo; 

            private Builder() {
            } 

            private Builder(ElasticDataNodeConfiguration model) {
                this.amount = model.amount;
                this.disk = model.disk;
                this.diskEncryption = model.diskEncryption;
                this.diskType = model.diskType;
                this.spec = model.spec;
                this.specInfo = model.specInfo;
            } 

            /**
             * <p>The number of nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>The storage size of the node. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder disk(Integer disk) {
                this.disk = disk;
                return this;
            }

            /**
             * <p>Indicates whether cloud disk encryption is enabled for the node. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder diskEncryption(Boolean diskEncryption) {
                this.diskEncryption = diskEncryption;
                return this;
            }

            /**
             * <p>The storage type of the node. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssd</p>
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * <p>The node specifications. For more information, see <a href="https://help.aliyun.com/document_detail/271718.html">Product specifications</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>elasticsearch.sn2ne.large</p>
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * <p>The node specifications description.</p>
             * 
             * <strong>example:</strong>
             * <p>1C 2G</p>
             */
            public Builder specInfo(String specInfo) {
                this.specInfo = specInfo;
                return this;
            }

            public ElasticDataNodeConfiguration build() {
                return new ElasticDataNodeConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceResponseBody</p>
     */
    public static class KibanaConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("amount")
        private Integer amount;

        @com.aliyun.core.annotation.NameInMap("disk")
        private Integer disk;

        @com.aliyun.core.annotation.NameInMap("diskType")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("specInfo")
        private String specInfo;

        private KibanaConfiguration(Builder builder) {
            this.amount = builder.amount;
            this.disk = builder.disk;
            this.diskType = builder.diskType;
            this.spec = builder.spec;
            this.specInfo = builder.specInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KibanaConfiguration create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Integer getAmount() {
            return this.amount;
        }

        /**
         * @return disk
         */
        public Integer getDisk() {
            return this.disk;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        /**
         * @return specInfo
         */
        public String getSpecInfo() {
            return this.specInfo;
        }

        public static final class Builder {
            private Integer amount; 
            private Integer disk; 
            private String diskType; 
            private String spec; 
            private String specInfo; 

            private Builder() {
            } 

            private Builder(KibanaConfiguration model) {
                this.amount = model.amount;
                this.disk = model.disk;
                this.diskType = model.diskType;
                this.spec = model.spec;
                this.specInfo = model.specInfo;
            } 

            /**
             * <p>The number of nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>The storage size of the node. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder disk(Integer disk) {
                this.disk = disk;
                return this;
            }

            /**
             * <p>The storage type of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssd</p>
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * <p>The node specifications. For more information, see <a href="https://help.aliyun.com/document_detail/271718.html">Product specifications</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>elasticsearch.n4.small</p>
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * <p>The node specifications description.</p>
             * 
             * <strong>example:</strong>
             * <p>1C 2G</p>
             */
            public Builder specInfo(String specInfo) {
                this.specInfo = specInfo;
                return this;
            }

            public KibanaConfiguration build() {
                return new KibanaConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceResponseBody</p>
     */
    public static class MasterConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("amount")
        private Integer amount;

        @com.aliyun.core.annotation.NameInMap("disk")
        private Integer disk;

        @com.aliyun.core.annotation.NameInMap("diskType")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("specInfo")
        private String specInfo;

        private MasterConfiguration(Builder builder) {
            this.amount = builder.amount;
            this.disk = builder.disk;
            this.diskType = builder.diskType;
            this.spec = builder.spec;
            this.specInfo = builder.specInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MasterConfiguration create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Integer getAmount() {
            return this.amount;
        }

        /**
         * @return disk
         */
        public Integer getDisk() {
            return this.disk;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        /**
         * @return specInfo
         */
        public String getSpecInfo() {
            return this.specInfo;
        }

        public static final class Builder {
            private Integer amount; 
            private Integer disk; 
            private String diskType; 
            private String spec; 
            private String specInfo; 

            private Builder() {
            } 

            private Builder(MasterConfiguration model) {
                this.amount = model.amount;
                this.disk = model.disk;
                this.diskType = model.diskType;
                this.spec = model.spec;
                this.specInfo = model.specInfo;
            } 

            /**
             * <p>The number of nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>The storage size of the node. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder disk(Integer disk) {
                this.disk = disk;
                return this;
            }

            /**
             * <p>The storage type of the node. Only cloud_ssd (standard SSD) is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssd</p>
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * <p>The node specifications. For more information, see <a href="https://help.aliyun.com/document_detail/271718.html">Product specifications</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>elasticsearch.sn2ne.large</p>
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * <p>The node specifications description.</p>
             * 
             * <strong>example:</strong>
             * <p>1C 2G</p>
             */
            public Builder specInfo(String specInfo) {
                this.specInfo = specInfo;
                return this;
            }

            public MasterConfiguration build() {
                return new MasterConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceResponseBody</p>
     */
    public static class WhiteIpGroupList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("groupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("ips")
        private java.util.List<String> ips;

        @com.aliyun.core.annotation.NameInMap("whiteIpType")
        private String whiteIpType;

        private WhiteIpGroupList(Builder builder) {
            this.groupName = builder.groupName;
            this.ips = builder.ips;
            this.whiteIpType = builder.whiteIpType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WhiteIpGroupList create() {
            return builder().build();
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return ips
         */
        public java.util.List<String> getIps() {
            return this.ips;
        }

        /**
         * @return whiteIpType
         */
        public String getWhiteIpType() {
            return this.whiteIpType;
        }

        public static final class Builder {
            private String groupName; 
            private java.util.List<String> ips; 
            private String whiteIpType; 

            private Builder() {
            } 

            private Builder(WhiteIpGroupList model) {
                this.groupName = model.groupName;
                this.ips = model.ips;
                this.whiteIpType = model.whiteIpType;
            } 

            /**
             * <p>The group name.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The network whitelist.</p>
             */
            public Builder ips(java.util.List<String> ips) {
                this.ips = ips;
                return this;
            }

            /**
             * <p>The network type. PRIVATE_ES: Elasticsearch private network. PUBLIC_KIBANA: Kibana public network. PUBLIC_ES: Elasticsearch public network. PRIVATE_KIBANA: Kibana private network.</p>
             * 
             * <strong>example:</strong>
             * <p>PUBLIC_KIBANA</p>
             */
            public Builder whiteIpType(String whiteIpType) {
                this.whiteIpType = whiteIpType;
                return this;
            }

            public WhiteIpGroupList build() {
                return new WhiteIpGroupList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceResponseBody</p>
     */
    public static class NetworkConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("vpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("vsArea")
        private String vsArea;

        @com.aliyun.core.annotation.NameInMap("vswitchId")
        private String vswitchId;

        @com.aliyun.core.annotation.NameInMap("whiteIpGroupList")
        private java.util.List<WhiteIpGroupList> whiteIpGroupList;

        private NetworkConfig(Builder builder) {
            this.type = builder.type;
            this.vpcId = builder.vpcId;
            this.vsArea = builder.vsArea;
            this.vswitchId = builder.vswitchId;
            this.whiteIpGroupList = builder.whiteIpGroupList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkConfig create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vsArea
         */
        public String getVsArea() {
            return this.vsArea;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        /**
         * @return whiteIpGroupList
         */
        public java.util.List<WhiteIpGroupList> getWhiteIpGroupList() {
            return this.whiteIpGroupList;
        }

        public static final class Builder {
            private String type; 
            private String vpcId; 
            private String vsArea; 
            private String vswitchId; 
            private java.util.List<WhiteIpGroupList> whiteIpGroupList; 

            private Builder() {
            } 

            private Builder(NetworkConfig model) {
                this.type = model.type;
                this.vpcId = model.vpcId;
                this.vsArea = model.vsArea;
                this.vswitchId = model.vswitchId;
                this.whiteIpGroupList = model.whiteIpGroupList;
            } 

            /**
             * <p>The network type. Only Virtual Private Cloud (VPC) is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-abc</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The zone where the instance is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-e</p>
             */
            public Builder vsArea(String vsArea) {
                this.vsArea = vsArea;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-def</p>
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            /**
             * <p>The whitelist group settings for the public and private networks of the cluster.</p>
             */
            public Builder whiteIpGroupList(java.util.List<WhiteIpGroupList> whiteIpGroupList) {
                this.whiteIpGroupList = whiteIpGroupList;
                return this;
            }

            public NetworkConfig build() {
                return new NetworkConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceResponseBody</p>
     */
    public static class NodeSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("disk")
        private Integer disk;

        @com.aliyun.core.annotation.NameInMap("diskEncryption")
        private Boolean diskEncryption;

        @com.aliyun.core.annotation.NameInMap("diskPreference")
        private String diskPreference;

        @com.aliyun.core.annotation.NameInMap("diskType")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("performanceLevel")
        private String performanceLevel;

        @com.aliyun.core.annotation.NameInMap("spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("specInfo")
        private String specInfo;

        private NodeSpec(Builder builder) {
            this.disk = builder.disk;
            this.diskEncryption = builder.diskEncryption;
            this.diskPreference = builder.diskPreference;
            this.diskType = builder.diskType;
            this.performanceLevel = builder.performanceLevel;
            this.spec = builder.spec;
            this.specInfo = builder.specInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeSpec create() {
            return builder().build();
        }

        /**
         * @return disk
         */
        public Integer getDisk() {
            return this.disk;
        }

        /**
         * @return diskEncryption
         */
        public Boolean getDiskEncryption() {
            return this.diskEncryption;
        }

        /**
         * @return diskPreference
         */
        public String getDiskPreference() {
            return this.diskPreference;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        /**
         * @return specInfo
         */
        public String getSpecInfo() {
            return this.specInfo;
        }

        public static final class Builder {
            private Integer disk; 
            private Boolean diskEncryption; 
            private String diskPreference; 
            private String diskType; 
            private String performanceLevel; 
            private String spec; 
            private String specInfo; 

            private Builder() {
            } 

            private Builder(NodeSpec model) {
                this.disk = model.disk;
                this.diskEncryption = model.diskEncryption;
                this.diskPreference = model.diskPreference;
                this.diskType = model.diskType;
                this.performanceLevel = model.performanceLevel;
                this.spec = model.spec;
                this.specInfo = model.specInfo;
            } 

            /**
             * <p>The storage size of the node. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder disk(Integer disk) {
                this.disk = disk;
                return this;
            }

            /**
             * <p>Indicates whether disk encryption is enabled. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder diskEncryption(Boolean diskEncryption) {
                this.diskEncryption = diskEncryption;
                return this;
            }

            /**
             * diskPreference.
             */
            public Builder diskPreference(String diskPreference) {
                this.diskPreference = diskPreference;
                return this;
            }

            /**
             * <p>The storage type of the node. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssd</p>
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * <p>The performance level (PL) of the ESSD cloud disk. This parameter is required when diskType is set to cloud_essd. Valid values: PL1, PL2, and PL3. When diskType is set to cloud_ssd (standard SSD), this parameter is not required.</p>
             * 
             * <strong>example:</strong>
             * <p>PL1</p>
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * <p>The node specifications. For more information, see <a href="https://help.aliyun.com/document_detail/271718.html">Product specifications</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>elasticsearch.n4.small</p>
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * <p>The node specifications description.</p>
             * 
             * <strong>example:</strong>
             * <p>1C 2G</p>
             */
            public Builder specInfo(String specInfo) {
                this.specInfo = specInfo;
                return this;
            }

            public NodeSpec build() {
                return new NodeSpec(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("tagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("tagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>env</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>dev</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceResponseBody</p>
     */
    public static class ZoneInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("zoneId")
        private String zoneId;

        private ZoneInfos(Builder builder) {
            this.status = builder.status;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZoneInfos create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String status; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(ZoneInfos model) {
                this.status = model.status;
                this.zoneId = model.zoneId;
            } 

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * zoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ZoneInfos build() {
                return new ZoneInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("advancedDedicateMaster")
        private Boolean advancedDedicateMaster;

        @com.aliyun.core.annotation.NameInMap("archType")
        private String archType;

        @com.aliyun.core.annotation.NameInMap("clientNodeConfiguration")
        private ClientNodeConfiguration clientNodeConfiguration;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("dedicateMaster")
        private Boolean dedicateMaster;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("elasticDataNodeConfiguration")
        private ElasticDataNodeConfiguration elasticDataNodeConfiguration;

        @com.aliyun.core.annotation.NameInMap("endTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("esVersion")
        private String esVersion;

        @com.aliyun.core.annotation.NameInMap("extendConfigs")
        private java.util.List<java.util.Map<String, ?>> extendConfigs;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("isNewDeployment")
        private String isNewDeployment;

        @com.aliyun.core.annotation.NameInMap("kibanaConfiguration")
        private KibanaConfiguration kibanaConfiguration;

        @com.aliyun.core.annotation.NameInMap("kibanaIPWhitelist")
        private java.util.List<String> kibanaIPWhitelist;

        @com.aliyun.core.annotation.NameInMap("kibanaPrivateIPWhitelist")
        private java.util.List<String> kibanaPrivateIPWhitelist;

        @com.aliyun.core.annotation.NameInMap("masterConfiguration")
        private MasterConfiguration masterConfiguration;

        @com.aliyun.core.annotation.NameInMap("networkConfig")
        private NetworkConfig networkConfig;

        @com.aliyun.core.annotation.NameInMap("nodeAmount")
        private Integer nodeAmount;

        @com.aliyun.core.annotation.NameInMap("nodeSpec")
        private NodeSpec nodeSpec;

        @com.aliyun.core.annotation.NameInMap("paymentType")
        private String paymentType;

        @com.aliyun.core.annotation.NameInMap("port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("postpaidServiceStatus")
        private String postpaidServiceStatus;

        @com.aliyun.core.annotation.NameInMap("privateNetworkIpWhiteList")
        private java.util.List<String> privateNetworkIpWhiteList;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("publicIpWhitelist")
        private java.util.List<String> publicIpWhitelist;

        @com.aliyun.core.annotation.NameInMap("resourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("serviceVpc")
        private Boolean serviceVpc;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("vpcInstanceId")
        private String vpcInstanceId;

        @com.aliyun.core.annotation.NameInMap("zoneCount")
        private Integer zoneCount;

        @com.aliyun.core.annotation.NameInMap("zoneInfos")
        private java.util.List<ZoneInfos> zoneInfos;

        private Result(Builder builder) {
            this.advancedDedicateMaster = builder.advancedDedicateMaster;
            this.archType = builder.archType;
            this.clientNodeConfiguration = builder.clientNodeConfiguration;
            this.createdAt = builder.createdAt;
            this.dedicateMaster = builder.dedicateMaster;
            this.description = builder.description;
            this.domain = builder.domain;
            this.elasticDataNodeConfiguration = builder.elasticDataNodeConfiguration;
            this.endTime = builder.endTime;
            this.esVersion = builder.esVersion;
            this.extendConfigs = builder.extendConfigs;
            this.instanceId = builder.instanceId;
            this.isNewDeployment = builder.isNewDeployment;
            this.kibanaConfiguration = builder.kibanaConfiguration;
            this.kibanaIPWhitelist = builder.kibanaIPWhitelist;
            this.kibanaPrivateIPWhitelist = builder.kibanaPrivateIPWhitelist;
            this.masterConfiguration = builder.masterConfiguration;
            this.networkConfig = builder.networkConfig;
            this.nodeAmount = builder.nodeAmount;
            this.nodeSpec = builder.nodeSpec;
            this.paymentType = builder.paymentType;
            this.port = builder.port;
            this.postpaidServiceStatus = builder.postpaidServiceStatus;
            this.privateNetworkIpWhiteList = builder.privateNetworkIpWhiteList;
            this.protocol = builder.protocol;
            this.publicIpWhitelist = builder.publicIpWhitelist;
            this.resourceGroupId = builder.resourceGroupId;
            this.serviceVpc = builder.serviceVpc;
            this.status = builder.status;
            this.tags = builder.tags;
            this.updatedAt = builder.updatedAt;
            this.vpcInstanceId = builder.vpcInstanceId;
            this.zoneCount = builder.zoneCount;
            this.zoneInfos = builder.zoneInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return advancedDedicateMaster
         */
        public Boolean getAdvancedDedicateMaster() {
            return this.advancedDedicateMaster;
        }

        /**
         * @return archType
         */
        public String getArchType() {
            return this.archType;
        }

        /**
         * @return clientNodeConfiguration
         */
        public ClientNodeConfiguration getClientNodeConfiguration() {
            return this.clientNodeConfiguration;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return dedicateMaster
         */
        public Boolean getDedicateMaster() {
            return this.dedicateMaster;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return elasticDataNodeConfiguration
         */
        public ElasticDataNodeConfiguration getElasticDataNodeConfiguration() {
            return this.elasticDataNodeConfiguration;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return esVersion
         */
        public String getEsVersion() {
            return this.esVersion;
        }

        /**
         * @return extendConfigs
         */
        public java.util.List<java.util.Map<String, ?>> getExtendConfigs() {
            return this.extendConfigs;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return isNewDeployment
         */
        public String getIsNewDeployment() {
            return this.isNewDeployment;
        }

        /**
         * @return kibanaConfiguration
         */
        public KibanaConfiguration getKibanaConfiguration() {
            return this.kibanaConfiguration;
        }

        /**
         * @return kibanaIPWhitelist
         */
        public java.util.List<String> getKibanaIPWhitelist() {
            return this.kibanaIPWhitelist;
        }

        /**
         * @return kibanaPrivateIPWhitelist
         */
        public java.util.List<String> getKibanaPrivateIPWhitelist() {
            return this.kibanaPrivateIPWhitelist;
        }

        /**
         * @return masterConfiguration
         */
        public MasterConfiguration getMasterConfiguration() {
            return this.masterConfiguration;
        }

        /**
         * @return networkConfig
         */
        public NetworkConfig getNetworkConfig() {
            return this.networkConfig;
        }

        /**
         * @return nodeAmount
         */
        public Integer getNodeAmount() {
            return this.nodeAmount;
        }

        /**
         * @return nodeSpec
         */
        public NodeSpec getNodeSpec() {
            return this.nodeSpec;
        }

        /**
         * @return paymentType
         */
        public String getPaymentType() {
            return this.paymentType;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return postpaidServiceStatus
         */
        public String getPostpaidServiceStatus() {
            return this.postpaidServiceStatus;
        }

        /**
         * @return privateNetworkIpWhiteList
         */
        public java.util.List<String> getPrivateNetworkIpWhiteList() {
            return this.privateNetworkIpWhiteList;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return publicIpWhitelist
         */
        public java.util.List<String> getPublicIpWhitelist() {
            return this.publicIpWhitelist;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return serviceVpc
         */
        public Boolean getServiceVpc() {
            return this.serviceVpc;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        /**
         * @return vpcInstanceId
         */
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

        /**
         * @return zoneCount
         */
        public Integer getZoneCount() {
            return this.zoneCount;
        }

        /**
         * @return zoneInfos
         */
        public java.util.List<ZoneInfos> getZoneInfos() {
            return this.zoneInfos;
        }

        public static final class Builder {
            private Boolean advancedDedicateMaster; 
            private String archType; 
            private ClientNodeConfiguration clientNodeConfiguration; 
            private String createdAt; 
            private Boolean dedicateMaster; 
            private String description; 
            private String domain; 
            private ElasticDataNodeConfiguration elasticDataNodeConfiguration; 
            private Long endTime; 
            private String esVersion; 
            private java.util.List<java.util.Map<String, ?>> extendConfigs; 
            private String instanceId; 
            private String isNewDeployment; 
            private KibanaConfiguration kibanaConfiguration; 
            private java.util.List<String> kibanaIPWhitelist; 
            private java.util.List<String> kibanaPrivateIPWhitelist; 
            private MasterConfiguration masterConfiguration; 
            private NetworkConfig networkConfig; 
            private Integer nodeAmount; 
            private NodeSpec nodeSpec; 
            private String paymentType; 
            private String port; 
            private String postpaidServiceStatus; 
            private java.util.List<String> privateNetworkIpWhiteList; 
            private String protocol; 
            private java.util.List<String> publicIpWhitelist; 
            private String resourceGroupId; 
            private Boolean serviceVpc; 
            private String status; 
            private java.util.List<Tags> tags; 
            private String updatedAt; 
            private String vpcInstanceId; 
            private Integer zoneCount; 
            private java.util.List<ZoneInfos> zoneInfos; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.advancedDedicateMaster = model.advancedDedicateMaster;
                this.archType = model.archType;
                this.clientNodeConfiguration = model.clientNodeConfiguration;
                this.createdAt = model.createdAt;
                this.dedicateMaster = model.dedicateMaster;
                this.description = model.description;
                this.domain = model.domain;
                this.elasticDataNodeConfiguration = model.elasticDataNodeConfiguration;
                this.endTime = model.endTime;
                this.esVersion = model.esVersion;
                this.extendConfigs = model.extendConfigs;
                this.instanceId = model.instanceId;
                this.isNewDeployment = model.isNewDeployment;
                this.kibanaConfiguration = model.kibanaConfiguration;
                this.kibanaIPWhitelist = model.kibanaIPWhitelist;
                this.kibanaPrivateIPWhitelist = model.kibanaPrivateIPWhitelist;
                this.masterConfiguration = model.masterConfiguration;
                this.networkConfig = model.networkConfig;
                this.nodeAmount = model.nodeAmount;
                this.nodeSpec = model.nodeSpec;
                this.paymentType = model.paymentType;
                this.port = model.port;
                this.postpaidServiceStatus = model.postpaidServiceStatus;
                this.privateNetworkIpWhiteList = model.privateNetworkIpWhiteList;
                this.protocol = model.protocol;
                this.publicIpWhitelist = model.publicIpWhitelist;
                this.resourceGroupId = model.resourceGroupId;
                this.serviceVpc = model.serviceVpc;
                this.status = model.status;
                this.tags = model.tags;
                this.updatedAt = model.updatedAt;
                this.vpcInstanceId = model.vpcInstanceId;
                this.zoneCount = model.zoneCount;
                this.zoneInfos = model.zoneInfos;
            } 

            /**
             * <p>Indicates whether the instance contains dedicated master nodes. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder advancedDedicateMaster(Boolean advancedDedicateMaster) {
                this.advancedDedicateMaster = advancedDedicateMaster;
                return this;
            }

            /**
             * <p>The deployment mode. Architecture type:</p>
             * 
             * <strong>example:</strong>
             * <p>public</p>
             */
            public Builder archType(String archType) {
                this.archType = archType;
                return this;
            }

            /**
             * <p>The configuration of client nodes.</p>
             */
            public Builder clientNodeConfiguration(ClientNodeConfiguration clientNodeConfiguration) {
                this.clientNodeConfiguration = clientNodeConfiguration;
                return this;
            }

            /**
             * <p>The time when the instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-07-13T03:58:07.253Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> Indicates whether the instance contains dedicated master nodes. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder dedicateMaster(Boolean dedicateMaster) {
                this.dedicateMaster = dedicateMaster;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>es-cn-abc</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The internal endpoint of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>es-cn-nif1q8auz0005****.elasticsearch.aliyuncs.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The configuration of elastic data nodes.</p>
             */
            public Builder elasticDataNodeConfiguration(ElasticDataNodeConfiguration elasticDataNodeConfiguration) {
                this.elasticDataNodeConfiguration = elasticDataNodeConfiguration;
                return this;
            }

            /**
             * <p>The time when the instance expires.</p>
             * 
             * <strong>example:</strong>
             * <p>1715826092044</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The instance version.</p>
             * 
             * <strong>example:</strong>
             * <p>6.7_with_X-Pack</p>
             */
            public Builder esVersion(String esVersion) {
                this.esVersion = esVersion;
                return this;
            }

            /**
             * <p>The extension parameter settings of the cluster.</p>
             */
            public Builder extendConfigs(java.util.List<java.util.Map<String, ?>> extendConfigs) {
                this.extendConfigs = extendConfigs;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>es-cn-v641a0ta3000g****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Indicates whether the instance uses the new deployment architecture.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isNewDeployment(String isNewDeployment) {
                this.isNewDeployment = isNewDeployment;
                return this;
            }

            /**
             * <p>The configuration of Kibana nodes.</p>
             */
            public Builder kibanaConfiguration(KibanaConfiguration kibanaConfiguration) {
                this.kibanaConfiguration = kibanaConfiguration;
                return this;
            }

            /**
             * <p>The public network access whitelist for the Kibana node of the cluster.</p>
             */
            public Builder kibanaIPWhitelist(java.util.List<String> kibanaIPWhitelist) {
                this.kibanaIPWhitelist = kibanaIPWhitelist;
                return this;
            }

            /**
             * <p>The private network access whitelist for the Kibana node of the cluster.</p>
             */
            public Builder kibanaPrivateIPWhitelist(java.util.List<String> kibanaPrivateIPWhitelist) {
                this.kibanaPrivateIPWhitelist = kibanaPrivateIPWhitelist;
                return this;
            }

            /**
             * <p>The configuration of master nodes.</p>
             */
            public Builder masterConfiguration(MasterConfiguration masterConfiguration) {
                this.masterConfiguration = masterConfiguration;
                return this;
            }

            /**
             * <p>The network configuration.</p>
             */
            public Builder networkConfig(NetworkConfig networkConfig) {
                this.networkConfig = networkConfig;
                return this;
            }

            /**
             * <p>The number of data nodes in the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder nodeAmount(Integer nodeAmount) {
                this.nodeAmount = nodeAmount;
                return this;
            }

            /**
             * <p>The configuration of data nodes.</p>
             */
            public Builder nodeSpec(NodeSpec nodeSpec) {
                this.nodeSpec = nodeSpec;
                return this;
            }

            /**
             * <p>The billing method of the instance. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>postpaid</p>
             */
            public Builder paymentType(String paymentType) {
                this.paymentType = paymentType;
                return this;
            }

            /**
             * <p>The access port of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>9200</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The status of the pay-as-you-go service that is overlaid on the subscription instance. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder postpaidServiceStatus(String postpaidServiceStatus) {
                this.postpaidServiceStatus = postpaidServiceStatus;
                return this;
            }

            /**
             * <p>The private network access IP whitelist for the Elasticsearch cluster.</p>
             */
            public Builder privateNetworkIpWhiteList(java.util.List<String> privateNetworkIpWhiteList) {
                this.privateNetworkIpWhiteList = privateNetworkIpWhiteList;
                return this;
            }

            /**
             * <p>The access protocol. Valid values: HTTP and HTTPS.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The public network access whitelist for the Elasticsearch cluster.</p>
             */
            public Builder publicIpWhitelist(java.util.List<String> publicIpWhitelist) {
                this.publicIpWhitelist = publicIpWhitelist;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aekzvowej3i****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>Indicates whether the instance is a service VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder serviceVpc(Boolean serviceVpc) {
                this.serviceVpc = serviceVpc;
                return this;
            }

            /**
             * <p>The status of the instance. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The instance tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The time when the instance was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-07-18T10:10:04.484Z</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1uag5jj38c****</p>
             */
            public Builder vpcInstanceId(String vpcInstanceId) {
                this.vpcInstanceId = vpcInstanceId;
                return this;
            }

            /**
             * zoneCount.
             */
            public Builder zoneCount(Integer zoneCount) {
                this.zoneCount = zoneCount;
                return this;
            }

            /**
             * zoneInfos.
             */
            public Builder zoneInfos(java.util.List<ZoneInfos> zoneInfos) {
                this.zoneInfos = zoneInfos;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
