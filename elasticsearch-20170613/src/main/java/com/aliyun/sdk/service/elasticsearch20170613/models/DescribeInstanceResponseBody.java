// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceResponseBody</p>
 */
public class DescribeInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private DescribeInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceResponseBody create() {
        return builder().build();
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
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DescribeInstanceResponseBody build() {
            return new DescribeInstanceResponseBody(this);
        } 

    } 

    public static class AdvancedSetting extends TeaModel {
        @NameInMap("gcName")
        private String gcName;

        private AdvancedSetting(Builder builder) {
            this.gcName = builder.gcName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdvancedSetting create() {
            return builder().build();
        }

        /**
         * @return gcName
         */
        public String getGcName() {
            return this.gcName;
        }

        public static final class Builder {
            private String gcName; 

            /**
             * gcName.
             */
            public Builder gcName(String gcName) {
                this.gcName = gcName;
                return this;
            }

            public AdvancedSetting build() {
                return new AdvancedSetting(this);
            } 

        } 

    }
    public static class AliwsDicts extends TeaModel {
        @NameInMap("fileSize")
        private Long fileSize;

        @NameInMap("name")
        private String name;

        @NameInMap("sourceType")
        private String sourceType;

        @NameInMap("type")
        private String type;

        private AliwsDicts(Builder builder) {
            this.fileSize = builder.fileSize;
            this.name = builder.name;
            this.sourceType = builder.sourceType;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AliwsDicts create() {
            return builder().build();
        }

        /**
         * @return fileSize
         */
        public Long getFileSize() {
            return this.fileSize;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long fileSize; 
            private String name; 
            private String sourceType; 
            private String type; 

            /**
             * fileSize.
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * sourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public AliwsDicts build() {
                return new AliwsDicts(this);
            } 

        } 

    }
    public static class ClientNodeConfiguration extends TeaModel {
        @NameInMap("amount")
        private Integer amount;

        @NameInMap("disk")
        private Integer disk;

        @NameInMap("diskType")
        private String diskType;

        @NameInMap("spec")
        private String spec;

        private ClientNodeConfiguration(Builder builder) {
            this.amount = builder.amount;
            this.disk = builder.disk;
            this.diskType = builder.diskType;
            this.spec = builder.spec;
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

        public static final class Builder {
            private Integer amount; 
            private Integer disk; 
            private String diskType; 
            private String spec; 

            /**
             * amount.
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * disk.
             */
            public Builder disk(Integer disk) {
                this.disk = disk;
                return this;
            }

            /**
             * diskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * spec.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            public ClientNodeConfiguration build() {
                return new ClientNodeConfiguration(this);
            } 

        } 

    }
    public static class DictList extends TeaModel {
        @NameInMap("fileSize")
        private Long fileSize;

        @NameInMap("name")
        private String name;

        @NameInMap("sourceType")
        private String sourceType;

        @NameInMap("type")
        private String type;

        private DictList(Builder builder) {
            this.fileSize = builder.fileSize;
            this.name = builder.name;
            this.sourceType = builder.sourceType;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DictList create() {
            return builder().build();
        }

        /**
         * @return fileSize
         */
        public Long getFileSize() {
            return this.fileSize;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long fileSize; 
            private String name; 
            private String sourceType; 
            private String type; 

            /**
             * fileSize.
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * sourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DictList build() {
                return new DictList(this);
            } 

        } 

    }
    public static class ElasticDataNodeConfiguration extends TeaModel {
        @NameInMap("amount")
        private Integer amount;

        @NameInMap("disk")
        private Integer disk;

        @NameInMap("diskEncryption")
        private Boolean diskEncryption;

        @NameInMap("diskType")
        private String diskType;

        @NameInMap("spec")
        private String spec;

        private ElasticDataNodeConfiguration(Builder builder) {
            this.amount = builder.amount;
            this.disk = builder.disk;
            this.diskEncryption = builder.diskEncryption;
            this.diskType = builder.diskType;
            this.spec = builder.spec;
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

        public static final class Builder {
            private Integer amount; 
            private Integer disk; 
            private Boolean diskEncryption; 
            private String diskType; 
            private String spec; 

            /**
             * amount.
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * disk.
             */
            public Builder disk(Integer disk) {
                this.disk = disk;
                return this;
            }

            /**
             * diskEncryption.
             */
            public Builder diskEncryption(Boolean diskEncryption) {
                this.diskEncryption = diskEncryption;
                return this;
            }

            /**
             * diskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * spec.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            public ElasticDataNodeConfiguration build() {
                return new ElasticDataNodeConfiguration(this);
            } 

        } 

    }
    public static class KibanaConfiguration extends TeaModel {
        @NameInMap("amount")
        private Integer amount;

        @NameInMap("spec")
        private String spec;

        private KibanaConfiguration(Builder builder) {
            this.amount = builder.amount;
            this.spec = builder.spec;
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
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        public static final class Builder {
            private Integer amount; 
            private String spec; 

            /**
             * amount.
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * spec.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            public KibanaConfiguration build() {
                return new KibanaConfiguration(this);
            } 

        } 

    }
    public static class MasterConfiguration extends TeaModel {
        @NameInMap("amount")
        private Integer amount;

        @NameInMap("disk")
        private Integer disk;

        @NameInMap("diskType")
        private String diskType;

        @NameInMap("spec")
        private String spec;

        private MasterConfiguration(Builder builder) {
            this.amount = builder.amount;
            this.disk = builder.disk;
            this.diskType = builder.diskType;
            this.spec = builder.spec;
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

        public static final class Builder {
            private Integer amount; 
            private Integer disk; 
            private String diskType; 
            private String spec; 

            /**
             * amount.
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * disk.
             */
            public Builder disk(Integer disk) {
                this.disk = disk;
                return this;
            }

            /**
             * diskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * spec.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            public MasterConfiguration build() {
                return new MasterConfiguration(this);
            } 

        } 

    }
    public static class WhiteIpGroupList extends TeaModel {
        @NameInMap("groupName")
        private String groupName;

        @NameInMap("ips")
        private java.util.List < String > ips;

        @NameInMap("whiteIpType")
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
        public java.util.List < String > getIps() {
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
            private java.util.List < String > ips; 
            private String whiteIpType; 

            /**
             * groupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * ips.
             */
            public Builder ips(java.util.List < String > ips) {
                this.ips = ips;
                return this;
            }

            /**
             * whiteIpType.
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
    public static class NetworkConfig extends TeaModel {
        @NameInMap("type")
        private String type;

        @NameInMap("vpcId")
        private String vpcId;

        @NameInMap("vsArea")
        private String vsArea;

        @NameInMap("vswitchId")
        private String vswitchId;

        @NameInMap("whiteIpGroupList")
        private java.util.List < WhiteIpGroupList> whiteIpGroupList;

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
        public java.util.List < WhiteIpGroupList> getWhiteIpGroupList() {
            return this.whiteIpGroupList;
        }

        public static final class Builder {
            private String type; 
            private String vpcId; 
            private String vsArea; 
            private String vswitchId; 
            private java.util.List < WhiteIpGroupList> whiteIpGroupList; 

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * vpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * vsArea.
             */
            public Builder vsArea(String vsArea) {
                this.vsArea = vsArea;
                return this;
            }

            /**
             * vswitchId.
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            /**
             * whiteIpGroupList.
             */
            public Builder whiteIpGroupList(java.util.List < WhiteIpGroupList> whiteIpGroupList) {
                this.whiteIpGroupList = whiteIpGroupList;
                return this;
            }

            public NetworkConfig build() {
                return new NetworkConfig(this);
            } 

        } 

    }
    public static class NodeSpec extends TeaModel {
        @NameInMap("disk")
        private Integer disk;

        @NameInMap("diskEncryption")
        private Boolean diskEncryption;

        @NameInMap("diskType")
        private String diskType;

        @NameInMap("spec")
        private String spec;

        private NodeSpec(Builder builder) {
            this.disk = builder.disk;
            this.diskEncryption = builder.diskEncryption;
            this.diskType = builder.diskType;
            this.spec = builder.spec;
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

        public static final class Builder {
            private Integer disk; 
            private Boolean diskEncryption; 
            private String diskType; 
            private String spec; 

            /**
             * disk.
             */
            public Builder disk(Integer disk) {
                this.disk = disk;
                return this;
            }

            /**
             * diskEncryption.
             */
            public Builder diskEncryption(Boolean diskEncryption) {
                this.diskEncryption = diskEncryption;
                return this;
            }

            /**
             * diskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * spec.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            public NodeSpec build() {
                return new NodeSpec(this);
            } 

        } 

    }
    public static class SynonymsDicts extends TeaModel {
        @NameInMap("fileSize")
        private Long fileSize;

        @NameInMap("name")
        private String name;

        @NameInMap("sourceType")
        private String sourceType;

        @NameInMap("type")
        private String type;

        private SynonymsDicts(Builder builder) {
            this.fileSize = builder.fileSize;
            this.name = builder.name;
            this.sourceType = builder.sourceType;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SynonymsDicts create() {
            return builder().build();
        }

        /**
         * @return fileSize
         */
        public Long getFileSize() {
            return this.fileSize;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long fileSize; 
            private String name; 
            private String sourceType; 
            private String type; 

            /**
             * fileSize.
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * sourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public SynonymsDicts build() {
                return new SynonymsDicts(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("tagKey")
        private String tagKey;

        @NameInMap("tagValue")
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

            /**
             * tagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * tagValue.
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
    public static class WarmNodeConfiguration extends TeaModel {
        @NameInMap("amount")
        private Integer amount;

        @NameInMap("disk")
        private Integer disk;

        @NameInMap("diskEncryption")
        private Boolean diskEncryption;

        @NameInMap("diskType")
        private String diskType;

        @NameInMap("spec")
        private String spec;

        private WarmNodeConfiguration(Builder builder) {
            this.amount = builder.amount;
            this.disk = builder.disk;
            this.diskEncryption = builder.diskEncryption;
            this.diskType = builder.diskType;
            this.spec = builder.spec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WarmNodeConfiguration create() {
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

        public static final class Builder {
            private Integer amount; 
            private Integer disk; 
            private Boolean diskEncryption; 
            private String diskType; 
            private String spec; 

            /**
             * amount.
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * disk.
             */
            public Builder disk(Integer disk) {
                this.disk = disk;
                return this;
            }

            /**
             * diskEncryption.
             */
            public Builder diskEncryption(Boolean diskEncryption) {
                this.diskEncryption = diskEncryption;
                return this;
            }

            /**
             * diskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * spec.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            public WarmNodeConfiguration build() {
                return new WarmNodeConfiguration(this);
            } 

        } 

    }
    public static class ZoneInfos extends TeaModel {
        @NameInMap("status")
        private String status;

        @NameInMap("zoneId")
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
    public static class Result extends TeaModel {
        @NameInMap("advancedDedicateMaster")
        private Boolean advancedDedicateMaster;

        @NameInMap("advancedSetting")
        private AdvancedSetting advancedSetting;

        @NameInMap("aliwsDicts")
        private java.util.List < AliwsDicts> aliwsDicts;

        @NameInMap("clientNodeConfiguration")
        private ClientNodeConfiguration clientNodeConfiguration;

        @NameInMap("createdAt")
        private String createdAt;

        @NameInMap("dedicateMaster")
        private Boolean dedicateMaster;

        @NameInMap("description")
        private String description;

        @NameInMap("dictList")
        private java.util.List < DictList> dictList;

        @NameInMap("domain")
        private String domain;

        @NameInMap("elasticDataNodeConfiguration")
        private ElasticDataNodeConfiguration elasticDataNodeConfiguration;

        @NameInMap("enableKibanaPrivateNetwork")
        private Boolean enableKibanaPrivateNetwork;

        @NameInMap("enableKibanaPublicNetwork")
        private Boolean enableKibanaPublicNetwork;

        @NameInMap("enablePublic")
        private Boolean enablePublic;

        @NameInMap("esConfig")
        private java.util.Map < String, ? > esConfig;

        @NameInMap("esIPBlacklist")
        private java.util.List < String > esIPBlacklist;

        @NameInMap("esIPWhitelist")
        private java.util.List < String > esIPWhitelist;

        @NameInMap("esVersion")
        private String esVersion;

        @NameInMap("extendConfigs")
        private java.util.List < java.util.Map<String, ?>> extendConfigs;

        @NameInMap("haveClientNode")
        private Boolean haveClientNode;

        @NameInMap("haveKibana")
        private Boolean haveKibana;

        @NameInMap("instanceId")
        private String instanceId;

        @NameInMap("isNewDeployment")
        private Boolean isNewDeployment;

        @NameInMap("kibanaConfiguration")
        private KibanaConfiguration kibanaConfiguration;

        @NameInMap("kibanaDomain")
        private String kibanaDomain;

        @NameInMap("kibanaIPWhitelist")
        private java.util.List < String > kibanaIPWhitelist;

        @NameInMap("kibanaPort")
        private Integer kibanaPort;

        @NameInMap("kibanaPrivateIPWhitelist")
        private java.util.List < String > kibanaPrivateIPWhitelist;

        @NameInMap("masterConfiguration")
        private MasterConfiguration masterConfiguration;

        @NameInMap("networkConfig")
        private NetworkConfig networkConfig;

        @NameInMap("nodeAmount")
        private Integer nodeAmount;

        @NameInMap("nodeSpec")
        private NodeSpec nodeSpec;

        @NameInMap("paymentType")
        private String paymentType;

        @NameInMap("port")
        private Integer port;

        @NameInMap("postpaidServiceStatus")
        private String postpaidServiceStatus;

        @NameInMap("privateNetworkIpWhiteList")
        private java.util.List < String > privateNetworkIpWhiteList;

        @NameInMap("protocol")
        private String protocol;

        @NameInMap("publicDomain")
        private String publicDomain;

        @NameInMap("publicIpWhitelist")
        private java.util.List < String > publicIpWhitelist;

        @NameInMap("publicPort")
        private Integer publicPort;

        @NameInMap("resourceGroupId")
        private String resourceGroupId;

        @NameInMap("serviceVpc")
        private Boolean serviceVpc;

        @NameInMap("status")
        private String status;

        @NameInMap("synonymsDicts")
        private java.util.List < SynonymsDicts> synonymsDicts;

        @NameInMap("tags")
        private java.util.List < Tags> tags;

        @NameInMap("updatedAt")
        private String updatedAt;

        @NameInMap("vpcInstanceId")
        private String vpcInstanceId;

        @NameInMap("warmNode")
        private Boolean warmNode;

        @NameInMap("warmNodeConfiguration")
        private WarmNodeConfiguration warmNodeConfiguration;

        @NameInMap("zoneCount")
        private Integer zoneCount;

        @NameInMap("zoneInfos")
        private java.util.List < ZoneInfos> zoneInfos;

        private Result(Builder builder) {
            this.advancedDedicateMaster = builder.advancedDedicateMaster;
            this.advancedSetting = builder.advancedSetting;
            this.aliwsDicts = builder.aliwsDicts;
            this.clientNodeConfiguration = builder.clientNodeConfiguration;
            this.createdAt = builder.createdAt;
            this.dedicateMaster = builder.dedicateMaster;
            this.description = builder.description;
            this.dictList = builder.dictList;
            this.domain = builder.domain;
            this.elasticDataNodeConfiguration = builder.elasticDataNodeConfiguration;
            this.enableKibanaPrivateNetwork = builder.enableKibanaPrivateNetwork;
            this.enableKibanaPublicNetwork = builder.enableKibanaPublicNetwork;
            this.enablePublic = builder.enablePublic;
            this.esConfig = builder.esConfig;
            this.esIPBlacklist = builder.esIPBlacklist;
            this.esIPWhitelist = builder.esIPWhitelist;
            this.esVersion = builder.esVersion;
            this.extendConfigs = builder.extendConfigs;
            this.haveClientNode = builder.haveClientNode;
            this.haveKibana = builder.haveKibana;
            this.instanceId = builder.instanceId;
            this.isNewDeployment = builder.isNewDeployment;
            this.kibanaConfiguration = builder.kibanaConfiguration;
            this.kibanaDomain = builder.kibanaDomain;
            this.kibanaIPWhitelist = builder.kibanaIPWhitelist;
            this.kibanaPort = builder.kibanaPort;
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
            this.publicDomain = builder.publicDomain;
            this.publicIpWhitelist = builder.publicIpWhitelist;
            this.publicPort = builder.publicPort;
            this.resourceGroupId = builder.resourceGroupId;
            this.serviceVpc = builder.serviceVpc;
            this.status = builder.status;
            this.synonymsDicts = builder.synonymsDicts;
            this.tags = builder.tags;
            this.updatedAt = builder.updatedAt;
            this.vpcInstanceId = builder.vpcInstanceId;
            this.warmNode = builder.warmNode;
            this.warmNodeConfiguration = builder.warmNodeConfiguration;
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
         * @return advancedSetting
         */
        public AdvancedSetting getAdvancedSetting() {
            return this.advancedSetting;
        }

        /**
         * @return aliwsDicts
         */
        public java.util.List < AliwsDicts> getAliwsDicts() {
            return this.aliwsDicts;
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
         * @return dictList
         */
        public java.util.List < DictList> getDictList() {
            return this.dictList;
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
         * @return enableKibanaPrivateNetwork
         */
        public Boolean getEnableKibanaPrivateNetwork() {
            return this.enableKibanaPrivateNetwork;
        }

        /**
         * @return enableKibanaPublicNetwork
         */
        public Boolean getEnableKibanaPublicNetwork() {
            return this.enableKibanaPublicNetwork;
        }

        /**
         * @return enablePublic
         */
        public Boolean getEnablePublic() {
            return this.enablePublic;
        }

        /**
         * @return esConfig
         */
        public java.util.Map < String, ? > getEsConfig() {
            return this.esConfig;
        }

        /**
         * @return esIPBlacklist
         */
        public java.util.List < String > getEsIPBlacklist() {
            return this.esIPBlacklist;
        }

        /**
         * @return esIPWhitelist
         */
        public java.util.List < String > getEsIPWhitelist() {
            return this.esIPWhitelist;
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
        public java.util.List < java.util.Map<String, ?>> getExtendConfigs() {
            return this.extendConfigs;
        }

        /**
         * @return haveClientNode
         */
        public Boolean getHaveClientNode() {
            return this.haveClientNode;
        }

        /**
         * @return haveKibana
         */
        public Boolean getHaveKibana() {
            return this.haveKibana;
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
        public Boolean getIsNewDeployment() {
            return this.isNewDeployment;
        }

        /**
         * @return kibanaConfiguration
         */
        public KibanaConfiguration getKibanaConfiguration() {
            return this.kibanaConfiguration;
        }

        /**
         * @return kibanaDomain
         */
        public String getKibanaDomain() {
            return this.kibanaDomain;
        }

        /**
         * @return kibanaIPWhitelist
         */
        public java.util.List < String > getKibanaIPWhitelist() {
            return this.kibanaIPWhitelist;
        }

        /**
         * @return kibanaPort
         */
        public Integer getKibanaPort() {
            return this.kibanaPort;
        }

        /**
         * @return kibanaPrivateIPWhitelist
         */
        public java.util.List < String > getKibanaPrivateIPWhitelist() {
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
        public Integer getPort() {
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
        public java.util.List < String > getPrivateNetworkIpWhiteList() {
            return this.privateNetworkIpWhiteList;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return publicDomain
         */
        public String getPublicDomain() {
            return this.publicDomain;
        }

        /**
         * @return publicIpWhitelist
         */
        public java.util.List < String > getPublicIpWhitelist() {
            return this.publicIpWhitelist;
        }

        /**
         * @return publicPort
         */
        public Integer getPublicPort() {
            return this.publicPort;
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
         * @return synonymsDicts
         */
        public java.util.List < SynonymsDicts> getSynonymsDicts() {
            return this.synonymsDicts;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
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
         * @return warmNode
         */
        public Boolean getWarmNode() {
            return this.warmNode;
        }

        /**
         * @return warmNodeConfiguration
         */
        public WarmNodeConfiguration getWarmNodeConfiguration() {
            return this.warmNodeConfiguration;
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
        public java.util.List < ZoneInfos> getZoneInfos() {
            return this.zoneInfos;
        }

        public static final class Builder {
            private Boolean advancedDedicateMaster; 
            private AdvancedSetting advancedSetting; 
            private java.util.List < AliwsDicts> aliwsDicts; 
            private ClientNodeConfiguration clientNodeConfiguration; 
            private String createdAt; 
            private Boolean dedicateMaster; 
            private String description; 
            private java.util.List < DictList> dictList; 
            private String domain; 
            private ElasticDataNodeConfiguration elasticDataNodeConfiguration; 
            private Boolean enableKibanaPrivateNetwork; 
            private Boolean enableKibanaPublicNetwork; 
            private Boolean enablePublic; 
            private java.util.Map < String, ? > esConfig; 
            private java.util.List < String > esIPBlacklist; 
            private java.util.List < String > esIPWhitelist; 
            private String esVersion; 
            private java.util.List < java.util.Map<String, ?>> extendConfigs; 
            private Boolean haveClientNode; 
            private Boolean haveKibana; 
            private String instanceId; 
            private Boolean isNewDeployment; 
            private KibanaConfiguration kibanaConfiguration; 
            private String kibanaDomain; 
            private java.util.List < String > kibanaIPWhitelist; 
            private Integer kibanaPort; 
            private java.util.List < String > kibanaPrivateIPWhitelist; 
            private MasterConfiguration masterConfiguration; 
            private NetworkConfig networkConfig; 
            private Integer nodeAmount; 
            private NodeSpec nodeSpec; 
            private String paymentType; 
            private Integer port; 
            private String postpaidServiceStatus; 
            private java.util.List < String > privateNetworkIpWhiteList; 
            private String protocol; 
            private String publicDomain; 
            private java.util.List < String > publicIpWhitelist; 
            private Integer publicPort; 
            private String resourceGroupId; 
            private Boolean serviceVpc; 
            private String status; 
            private java.util.List < SynonymsDicts> synonymsDicts; 
            private java.util.List < Tags> tags; 
            private String updatedAt; 
            private String vpcInstanceId; 
            private Boolean warmNode; 
            private WarmNodeConfiguration warmNodeConfiguration; 
            private Integer zoneCount; 
            private java.util.List < ZoneInfos> zoneInfos; 

            /**
             * advancedDedicateMaster.
             */
            public Builder advancedDedicateMaster(Boolean advancedDedicateMaster) {
                this.advancedDedicateMaster = advancedDedicateMaster;
                return this;
            }

            /**
             * advancedSetting.
             */
            public Builder advancedSetting(AdvancedSetting advancedSetting) {
                this.advancedSetting = advancedSetting;
                return this;
            }

            /**
             * aliwsDicts.
             */
            public Builder aliwsDicts(java.util.List < AliwsDicts> aliwsDicts) {
                this.aliwsDicts = aliwsDicts;
                return this;
            }

            /**
             * clientNodeConfiguration.
             */
            public Builder clientNodeConfiguration(ClientNodeConfiguration clientNodeConfiguration) {
                this.clientNodeConfiguration = clientNodeConfiguration;
                return this;
            }

            /**
             * createdAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * dedicateMaster.
             */
            public Builder dedicateMaster(Boolean dedicateMaster) {
                this.dedicateMaster = dedicateMaster;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * dictList.
             */
            public Builder dictList(java.util.List < DictList> dictList) {
                this.dictList = dictList;
                return this;
            }

            /**
             * domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * elasticDataNodeConfiguration.
             */
            public Builder elasticDataNodeConfiguration(ElasticDataNodeConfiguration elasticDataNodeConfiguration) {
                this.elasticDataNodeConfiguration = elasticDataNodeConfiguration;
                return this;
            }

            /**
             * enableKibanaPrivateNetwork.
             */
            public Builder enableKibanaPrivateNetwork(Boolean enableKibanaPrivateNetwork) {
                this.enableKibanaPrivateNetwork = enableKibanaPrivateNetwork;
                return this;
            }

            /**
             * enableKibanaPublicNetwork.
             */
            public Builder enableKibanaPublicNetwork(Boolean enableKibanaPublicNetwork) {
                this.enableKibanaPublicNetwork = enableKibanaPublicNetwork;
                return this;
            }

            /**
             * enablePublic.
             */
            public Builder enablePublic(Boolean enablePublic) {
                this.enablePublic = enablePublic;
                return this;
            }

            /**
             * esConfig.
             */
            public Builder esConfig(java.util.Map < String, ? > esConfig) {
                this.esConfig = esConfig;
                return this;
            }

            /**
             * esIPBlacklist.
             */
            public Builder esIPBlacklist(java.util.List < String > esIPBlacklist) {
                this.esIPBlacklist = esIPBlacklist;
                return this;
            }

            /**
             * esIPWhitelist.
             */
            public Builder esIPWhitelist(java.util.List < String > esIPWhitelist) {
                this.esIPWhitelist = esIPWhitelist;
                return this;
            }

            /**
             * esVersion.
             */
            public Builder esVersion(String esVersion) {
                this.esVersion = esVersion;
                return this;
            }

            /**
             * extendConfigs.
             */
            public Builder extendConfigs(java.util.List < java.util.Map<String, ?>> extendConfigs) {
                this.extendConfigs = extendConfigs;
                return this;
            }

            /**
             * haveClientNode.
             */
            public Builder haveClientNode(Boolean haveClientNode) {
                this.haveClientNode = haveClientNode;
                return this;
            }

            /**
             * haveKibana.
             */
            public Builder haveKibana(Boolean haveKibana) {
                this.haveKibana = haveKibana;
                return this;
            }

            /**
             * instanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * isNewDeployment.
             */
            public Builder isNewDeployment(Boolean isNewDeployment) {
                this.isNewDeployment = isNewDeployment;
                return this;
            }

            /**
             * kibanaConfiguration.
             */
            public Builder kibanaConfiguration(KibanaConfiguration kibanaConfiguration) {
                this.kibanaConfiguration = kibanaConfiguration;
                return this;
            }

            /**
             * kibanaDomain.
             */
            public Builder kibanaDomain(String kibanaDomain) {
                this.kibanaDomain = kibanaDomain;
                return this;
            }

            /**
             * kibanaIPWhitelist.
             */
            public Builder kibanaIPWhitelist(java.util.List < String > kibanaIPWhitelist) {
                this.kibanaIPWhitelist = kibanaIPWhitelist;
                return this;
            }

            /**
             * kibanaPort.
             */
            public Builder kibanaPort(Integer kibanaPort) {
                this.kibanaPort = kibanaPort;
                return this;
            }

            /**
             * kibanaPrivateIPWhitelist.
             */
            public Builder kibanaPrivateIPWhitelist(java.util.List < String > kibanaPrivateIPWhitelist) {
                this.kibanaPrivateIPWhitelist = kibanaPrivateIPWhitelist;
                return this;
            }

            /**
             * masterConfiguration.
             */
            public Builder masterConfiguration(MasterConfiguration masterConfiguration) {
                this.masterConfiguration = masterConfiguration;
                return this;
            }

            /**
             * networkConfig.
             */
            public Builder networkConfig(NetworkConfig networkConfig) {
                this.networkConfig = networkConfig;
                return this;
            }

            /**
             * nodeAmount.
             */
            public Builder nodeAmount(Integer nodeAmount) {
                this.nodeAmount = nodeAmount;
                return this;
            }

            /**
             * nodeSpec.
             */
            public Builder nodeSpec(NodeSpec nodeSpec) {
                this.nodeSpec = nodeSpec;
                return this;
            }

            /**
             * paymentType.
             */
            public Builder paymentType(String paymentType) {
                this.paymentType = paymentType;
                return this;
            }

            /**
             * port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * postpaidServiceStatus.
             */
            public Builder postpaidServiceStatus(String postpaidServiceStatus) {
                this.postpaidServiceStatus = postpaidServiceStatus;
                return this;
            }

            /**
             * privateNetworkIpWhiteList.
             */
            public Builder privateNetworkIpWhiteList(java.util.List < String > privateNetworkIpWhiteList) {
                this.privateNetworkIpWhiteList = privateNetworkIpWhiteList;
                return this;
            }

            /**
             * protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * publicDomain.
             */
            public Builder publicDomain(String publicDomain) {
                this.publicDomain = publicDomain;
                return this;
            }

            /**
             * publicIpWhitelist.
             */
            public Builder publicIpWhitelist(java.util.List < String > publicIpWhitelist) {
                this.publicIpWhitelist = publicIpWhitelist;
                return this;
            }

            /**
             * publicPort.
             */
            public Builder publicPort(Integer publicPort) {
                this.publicPort = publicPort;
                return this;
            }

            /**
             * resourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * serviceVpc.
             */
            public Builder serviceVpc(Boolean serviceVpc) {
                this.serviceVpc = serviceVpc;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * synonymsDicts.
             */
            public Builder synonymsDicts(java.util.List < SynonymsDicts> synonymsDicts) {
                this.synonymsDicts = synonymsDicts;
                return this;
            }

            /**
             * tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * updatedAt.
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * vpcInstanceId.
             */
            public Builder vpcInstanceId(String vpcInstanceId) {
                this.vpcInstanceId = vpcInstanceId;
                return this;
            }

            /**
             * warmNode.
             */
            public Builder warmNode(Boolean warmNode) {
                this.warmNode = warmNode;
                return this;
            }

            /**
             * warmNodeConfiguration.
             */
            public Builder warmNodeConfiguration(WarmNodeConfiguration warmNodeConfiguration) {
                this.warmNodeConfiguration = warmNodeConfiguration;
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
            public Builder zoneInfos(java.util.List < ZoneInfos> zoneInfos) {
                this.zoneInfos = zoneInfos;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
