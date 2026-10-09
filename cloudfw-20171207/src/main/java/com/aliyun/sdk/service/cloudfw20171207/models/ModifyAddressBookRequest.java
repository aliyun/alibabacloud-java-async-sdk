// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link ModifyAddressBookRequest} extends {@link RequestModel}
 *
 * <p>ModifyAddressBookRequest</p>
 */
public class ModifyAddressBookRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AckLabels")
    private java.util.List<AckLabels> ackLabels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AckNamespaces")
    private java.util.List<String> ackNamespaces;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressList")
    private String addressList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetMemberUids")
    private java.util.List<Long> assetMemberUids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetRegionResourceTypes")
    private java.util.List<AssetRegionResourceTypes> assetRegionResourceTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoAddTagEcs")
    private String autoAddTagEcs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 256, minLength = 2)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 2)
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModifyMode")
    private String modifyMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    @Deprecated
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagList")
    private java.util.List<TagList> tagList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagRelation")
    private String tagRelation;

    private ModifyAddressBookRequest(Builder builder) {
        super(builder);
        this.ackLabels = builder.ackLabels;
        this.ackNamespaces = builder.ackNamespaces;
        this.addressList = builder.addressList;
        this.assetMemberUids = builder.assetMemberUids;
        this.assetRegionResourceTypes = builder.assetRegionResourceTypes;
        this.autoAddTagEcs = builder.autoAddTagEcs;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.dryRun = builder.dryRun;
        this.groupName = builder.groupName;
        this.groupUuid = builder.groupUuid;
        this.lang = builder.lang;
        this.modifyMode = builder.modifyMode;
        this.sourceIp = builder.sourceIp;
        this.tagList = builder.tagList;
        this.tagRelation = builder.tagRelation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAddressBookRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ackLabels
     */
    public java.util.List<AckLabels> getAckLabels() {
        return this.ackLabels;
    }

    /**
     * @return ackNamespaces
     */
    public java.util.List<String> getAckNamespaces() {
        return this.ackNamespaces;
    }

    /**
     * @return addressList
     */
    public String getAddressList() {
        return this.addressList;
    }

    /**
     * @return assetMemberUids
     */
    public java.util.List<Long> getAssetMemberUids() {
        return this.assetMemberUids;
    }

    /**
     * @return assetRegionResourceTypes
     */
    public java.util.List<AssetRegionResourceTypes> getAssetRegionResourceTypes() {
        return this.assetRegionResourceTypes;
    }

    /**
     * @return autoAddTagEcs
     */
    public String getAutoAddTagEcs() {
        return this.autoAddTagEcs;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return groupUuid
     */
    public String getGroupUuid() {
        return this.groupUuid;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return modifyMode
     */
    public String getModifyMode() {
        return this.modifyMode;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return tagList
     */
    public java.util.List<TagList> getTagList() {
        return this.tagList;
    }

    /**
     * @return tagRelation
     */
    public String getTagRelation() {
        return this.tagRelation;
    }

    public static final class Builder extends Request.Builder<ModifyAddressBookRequest, Builder> {
        private java.util.List<AckLabels> ackLabels; 
        private java.util.List<String> ackNamespaces; 
        private String addressList; 
        private java.util.List<Long> assetMemberUids; 
        private java.util.List<AssetRegionResourceTypes> assetRegionResourceTypes; 
        private String autoAddTagEcs; 
        private String clientToken; 
        private String description; 
        private Boolean dryRun; 
        private String groupName; 
        private String groupUuid; 
        private String lang; 
        private String modifyMode; 
        private String sourceIp; 
        private java.util.List<TagList> tagList; 
        private String tagRelation; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAddressBookRequest request) {
            super(request);
            this.ackLabels = request.ackLabels;
            this.ackNamespaces = request.ackNamespaces;
            this.addressList = request.addressList;
            this.assetMemberUids = request.assetMemberUids;
            this.assetRegionResourceTypes = request.assetRegionResourceTypes;
            this.autoAddTagEcs = request.autoAddTagEcs;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.dryRun = request.dryRun;
            this.groupName = request.groupName;
            this.groupUuid = request.groupUuid;
            this.lang = request.lang;
            this.modifyMode = request.modifyMode;
            this.sourceIp = request.sourceIp;
            this.tagList = request.tagList;
            this.tagRelation = request.tagRelation;
        } 

        /**
         * <p>The list of pod labels in the ACK cluster.</p>
         * <blockquote>
         * <p>A maximum of 10 labels are supported.</p>
         * </blockquote>
         */
        public Builder ackLabels(java.util.List<AckLabels> ackLabels) {
            this.putQueryParameter("AckLabels", ackLabels);
            this.ackLabels = ackLabels;
            return this;
        }

        /**
         * <p>The list of pod namespaces in the ACK cluster.</p>
         * <blockquote>
         * <p>A maximum of 10 namespaces are supported.</p>
         * </blockquote>
         */
        public Builder ackNamespaces(java.util.List<String> ackNamespaces) {
            this.putQueryParameter("AckNamespaces", ackNamespaces);
            this.ackNamespaces = ackNamespaces;
            return this;
        }

        /**
         * <p>The list of addresses in the address book. Separate multiple addresses with commas (,). For each address element, separate the address and the description with a space. You must specify this parameter when GroupType is set to <strong>ip</strong>, <strong>port</strong>, or <strong>domain</strong>.</p>
         * <ul>
         * <li><p>If GroupType is set to <strong>ip</strong>, enter IP addresses in the address list. Example: 1.2.XX.XX/32 Development CIDR block,10.0.0.X/24,1.2.XX.XX/24 Test CIDR block.</p>
         * </li>
         * <li><p>If GroupType is set to <strong>port</strong>, enter ports or port ranges in the address list. Example: 80/80 HTTP port,100/200,3306 Database port.</p>
         * </li>
         * <li><p>If GroupType is set to <strong>domain</strong>, enter domain names in the address list. Example: demo1.aliyun.com Test domain name,demo2.aliyun.com,<a href="http://www.aliyun.com">www.aliyun.com</a> Alibaba Cloud official website.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX/32 ,192.0.XX.XX/24</p>
         */
        public Builder addressList(String addressList) {
            this.putQueryParameter("AddressList", addressList);
            this.addressList = addressList;
            return this;
        }

        /**
         * <p>The list of member accounts in the asset address book.</p>
         */
        public Builder assetMemberUids(java.util.List<Long> assetMemberUids) {
            String assetMemberUidsShrink = shrink(assetMemberUids, "AssetMemberUids", "json");
            this.putQueryParameter("AssetMemberUids", assetMemberUidsShrink);
            this.assetMemberUids = assetMemberUids;
            return this;
        }

        /**
         * <p>The asset address book, region, and resource type list.</p>
         */
        public Builder assetRegionResourceTypes(java.util.List<AssetRegionResourceTypes> assetRegionResourceTypes) {
            String assetRegionResourceTypesShrink = shrink(assetRegionResourceTypes, "AssetRegionResourceTypes", "json");
            this.putQueryParameter("AssetRegionResourceTypes", assetRegionResourceTypesShrink);
            this.assetRegionResourceTypes = assetRegionResourceTypes;
            return this;
        }

        /**
         * <p>Specifies if the automatic addition of the public IP addresses of Elastic Compute Service (ECS) instances that match the new labels to the address book is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder autoAddTagEcs(String autoAddTagEcs) {
            this.putQueryParameter("AutoAddTagEcs", autoAddTagEcs);
            this.autoAddTagEcs = autoAddTagEcs;
            return this;
        }

        /**
         * <p>The idempotency token.</p>
         * 
         * <strong>example:</strong>
         * <p>ddadxefexxxx</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the address book.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bj-001</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The dry run mode.</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The name of the address book.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bj-001</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>The UUID of the address book.</p>
         * <blockquote>
         * <p>To obtain the value, call the <a href="~~DescribeAddressBook~~">DescribeAddressBook</a> operation.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0657ab9d-fe8b-4174-b2a6-6baf358e****</p>
         */
        public Builder groupUuid(String groupUuid) {
            this.putQueryParameter("GroupUuid", groupUuid);
            this.groupUuid = groupUuid;
            return this;
        }

        /**
         * <p>The language type.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The modification mode.</p>
         * <blockquote>
         * <p>If GroupType is set to <strong>ip</strong>, <strong>ipv6</strong>, <strong>port</strong>, or <strong>domain</strong> and this parameter is not specified, the <strong>Cover</strong> mode is used by default to modify the address book.
         * Notice: If GroupType is set to <strong>tag</strong>, this parameter must be left empty.</notice></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Cover</p>
         */
        public Builder modifyMode(String modifyMode) {
            this.putQueryParameter("ModifyMode", modifyMode);
            this.modifyMode = modifyMode;
            return this;
        }

        /**
         * <p>The source IP address of the requester.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The list of ECS tags.</p>
         */
        public Builder tagList(java.util.List<TagList> tagList) {
            this.putQueryParameter("TagList", tagList);
            this.tagList = tagList;
            return this;
        }

        /**
         * <p>The relationship between multiple ECS tags.</p>
         * 
         * <strong>example:</strong>
         * <p>and</p>
         */
        public Builder tagRelation(String tagRelation) {
            this.putQueryParameter("TagRelation", tagRelation);
            this.tagRelation = tagRelation;
            return this;
        }

        @Override
        public ModifyAddressBookRequest build() {
            return new ModifyAddressBookRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyAddressBookRequest} extends {@link TeaModel}
     *
     * <p>ModifyAddressBookRequest</p>
     */
    public static class AckLabels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private AckLabels(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AckLabels create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(AckLabels model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the pod label in the ACK cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>app</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the pod label in the ACK cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>storage-operator</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public AckLabels build() {
                return new AckLabels(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyAddressBookRequest} extends {@link TeaModel}
     *
     * <p>ModifyAddressBookRequest</p>
     */
    public static class Ipv4 extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AiGatewayEIP")
        private Boolean aiGatewayEIP;

        @com.aliyun.core.annotation.NameInMap("AlbEIP")
        private Boolean albEIP;

        @com.aliyun.core.annotation.NameInMap("ApiGatewayEIP")
        private Boolean apiGatewayEIP;

        @com.aliyun.core.annotation.NameInMap("BastionHostEgressIP")
        private Boolean bastionHostEgressIP;

        @com.aliyun.core.annotation.NameInMap("BastionHostIP")
        private Boolean bastionHostIP;

        @com.aliyun.core.annotation.NameInMap("BastionHostIngressIP")
        private Boolean bastionHostIngressIP;

        @com.aliyun.core.annotation.NameInMap("EIP")
        private Boolean EIP;

        @com.aliyun.core.annotation.NameInMap("EcsEIP")
        private Boolean ecsEIP;

        @com.aliyun.core.annotation.NameInMap("EcsPublicIP")
        private Boolean ecsPublicIP;

        @com.aliyun.core.annotation.NameInMap("EniEIP")
        private Boolean eniEIP;

        @com.aliyun.core.annotation.NameInMap("GaEIP")
        private Boolean gaEIP;

        @com.aliyun.core.annotation.NameInMap("HAVIP")
        private Boolean HAVIP;

        @com.aliyun.core.annotation.NameInMap("NatEIP")
        private Boolean natEIP;

        @com.aliyun.core.annotation.NameInMap("NatPublicIP")
        private Boolean natPublicIP;

        @com.aliyun.core.annotation.NameInMap("NlbEIP")
        private Boolean nlbEIP;

        @com.aliyun.core.annotation.NameInMap("SlbEIP")
        private Boolean slbEIP;

        @com.aliyun.core.annotation.NameInMap("SlbPublicIP")
        private Boolean slbPublicIP;

        private Ipv4(Builder builder) {
            this.aiGatewayEIP = builder.aiGatewayEIP;
            this.albEIP = builder.albEIP;
            this.apiGatewayEIP = builder.apiGatewayEIP;
            this.bastionHostEgressIP = builder.bastionHostEgressIP;
            this.bastionHostIP = builder.bastionHostIP;
            this.bastionHostIngressIP = builder.bastionHostIngressIP;
            this.EIP = builder.EIP;
            this.ecsEIP = builder.ecsEIP;
            this.ecsPublicIP = builder.ecsPublicIP;
            this.eniEIP = builder.eniEIP;
            this.gaEIP = builder.gaEIP;
            this.HAVIP = builder.HAVIP;
            this.natEIP = builder.natEIP;
            this.natPublicIP = builder.natPublicIP;
            this.nlbEIP = builder.nlbEIP;
            this.slbEIP = builder.slbEIP;
            this.slbPublicIP = builder.slbPublicIP;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv4 create() {
            return builder().build();
        }

        /**
         * @return aiGatewayEIP
         */
        public Boolean getAiGatewayEIP() {
            return this.aiGatewayEIP;
        }

        /**
         * @return albEIP
         */
        public Boolean getAlbEIP() {
            return this.albEIP;
        }

        /**
         * @return apiGatewayEIP
         */
        public Boolean getApiGatewayEIP() {
            return this.apiGatewayEIP;
        }

        /**
         * @return bastionHostEgressIP
         */
        public Boolean getBastionHostEgressIP() {
            return this.bastionHostEgressIP;
        }

        /**
         * @return bastionHostIP
         */
        public Boolean getBastionHostIP() {
            return this.bastionHostIP;
        }

        /**
         * @return bastionHostIngressIP
         */
        public Boolean getBastionHostIngressIP() {
            return this.bastionHostIngressIP;
        }

        /**
         * @return EIP
         */
        public Boolean getEIP() {
            return this.EIP;
        }

        /**
         * @return ecsEIP
         */
        public Boolean getEcsEIP() {
            return this.ecsEIP;
        }

        /**
         * @return ecsPublicIP
         */
        public Boolean getEcsPublicIP() {
            return this.ecsPublicIP;
        }

        /**
         * @return eniEIP
         */
        public Boolean getEniEIP() {
            return this.eniEIP;
        }

        /**
         * @return gaEIP
         */
        public Boolean getGaEIP() {
            return this.gaEIP;
        }

        /**
         * @return HAVIP
         */
        public Boolean getHAVIP() {
            return this.HAVIP;
        }

        /**
         * @return natEIP
         */
        public Boolean getNatEIP() {
            return this.natEIP;
        }

        /**
         * @return natPublicIP
         */
        public Boolean getNatPublicIP() {
            return this.natPublicIP;
        }

        /**
         * @return nlbEIP
         */
        public Boolean getNlbEIP() {
            return this.nlbEIP;
        }

        /**
         * @return slbEIP
         */
        public Boolean getSlbEIP() {
            return this.slbEIP;
        }

        /**
         * @return slbPublicIP
         */
        public Boolean getSlbPublicIP() {
            return this.slbPublicIP;
        }

        public static final class Builder {
            private Boolean aiGatewayEIP; 
            private Boolean albEIP; 
            private Boolean apiGatewayEIP; 
            private Boolean bastionHostEgressIP; 
            private Boolean bastionHostIP; 
            private Boolean bastionHostIngressIP; 
            private Boolean EIP; 
            private Boolean ecsEIP; 
            private Boolean ecsPublicIP; 
            private Boolean eniEIP; 
            private Boolean gaEIP; 
            private Boolean HAVIP; 
            private Boolean natEIP; 
            private Boolean natPublicIP; 
            private Boolean nlbEIP; 
            private Boolean slbEIP; 
            private Boolean slbPublicIP; 

            private Builder() {
            } 

            private Builder(Ipv4 model) {
                this.aiGatewayEIP = model.aiGatewayEIP;
                this.albEIP = model.albEIP;
                this.apiGatewayEIP = model.apiGatewayEIP;
                this.bastionHostEgressIP = model.bastionHostEgressIP;
                this.bastionHostIP = model.bastionHostIP;
                this.bastionHostIngressIP = model.bastionHostIngressIP;
                this.EIP = model.EIP;
                this.ecsEIP = model.ecsEIP;
                this.ecsPublicIP = model.ecsPublicIP;
                this.eniEIP = model.eniEIP;
                this.gaEIP = model.gaEIP;
                this.HAVIP = model.HAVIP;
                this.natEIP = model.natEIP;
                this.natPublicIP = model.natPublicIP;
                this.nlbEIP = model.nlbEIP;
                this.slbEIP = model.slbEIP;
                this.slbPublicIP = model.slbPublicIP;
            } 

            /**
             * <p>The asset type: AIGatewayEIP.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder aiGatewayEIP(Boolean aiGatewayEIP) {
                this.aiGatewayEIP = aiGatewayEIP;
                return this;
            }

            /**
             * <p>The asset type: AlbEIP.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder albEIP(Boolean albEIP) {
                this.albEIP = albEIP;
                return this;
            }

            /**
             * <p>The asset type: ApigEIP.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder apiGatewayEIP(Boolean apiGatewayEIP) {
                this.apiGatewayEIP = apiGatewayEIP;
                return this;
            }

            /**
             * <p>The asset type: BastionHostEgressIP.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder bastionHostEgressIP(Boolean bastionHostEgressIP) {
                this.bastionHostEgressIP = bastionHostEgressIP;
                return this;
            }

            /**
             * <p>The asset type: BastionHostIP.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder bastionHostIP(Boolean bastionHostIP) {
                this.bastionHostIP = bastionHostIP;
                return this;
            }

            /**
             * <p>The asset type: BastionHostIngressIP.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder bastionHostIngressIP(Boolean bastionHostIngressIP) {
                this.bastionHostIngressIP = bastionHostIngressIP;
                return this;
            }

            /**
             * <p>The asset type: EIP.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder EIP(Boolean EIP) {
                this.EIP = EIP;
                return this;
            }

            /**
             * <p>The asset type: EcsEIP.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder ecsEIP(Boolean ecsEIP) {
                this.ecsEIP = ecsEIP;
                return this;
            }

            /**
             * <p>The asset type: EcsPublicIP.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder ecsPublicIP(Boolean ecsPublicIP) {
                this.ecsPublicIP = ecsPublicIP;
                return this;
            }

            /**
             * <p>The asset type: EniEIP.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder eniEIP(Boolean eniEIP) {
                this.eniEIP = eniEIP;
                return this;
            }

            /**
             * <p>The asset type: GaEIP.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder gaEIP(Boolean gaEIP) {
                this.gaEIP = gaEIP;
                return this;
            }

            /**
             * <p>The asset type: HAVIP.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder HAVIP(Boolean HAVIP) {
                this.HAVIP = HAVIP;
                return this;
            }

            /**
             * <p>The asset type: NatEIP.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder natEIP(Boolean natEIP) {
                this.natEIP = natEIP;
                return this;
            }

            /**
             * <p>The asset type: NatPublicIP.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder natPublicIP(Boolean natPublicIP) {
                this.natPublicIP = natPublicIP;
                return this;
            }

            /**
             * <p>The asset type: NlbEIP.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder nlbEIP(Boolean nlbEIP) {
                this.nlbEIP = nlbEIP;
                return this;
            }

            /**
             * <p>The asset type: SlbEIP.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder slbEIP(Boolean slbEIP) {
                this.slbEIP = slbEIP;
                return this;
            }

            /**
             * <p>The asset type: SlbPublicIP.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder slbPublicIP(Boolean slbPublicIP) {
                this.slbPublicIP = slbPublicIP;
                return this;
            }

            public Ipv4 build() {
                return new Ipv4(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyAddressBookRequest} extends {@link TeaModel}
     *
     * <p>ModifyAddressBookRequest</p>
     */
    public static class Ipv6 extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AiGatewayEIPv6")
        private Boolean aiGatewayEIPv6;

        @com.aliyun.core.annotation.NameInMap("AlbIPv6")
        private Boolean albIPv6;

        @com.aliyun.core.annotation.NameInMap("ApiGatewayEIPv6")
        private Boolean apiGatewayEIPv6;

        @com.aliyun.core.annotation.NameInMap("EcsIPv6")
        private Boolean ecsIPv6;

        @com.aliyun.core.annotation.NameInMap("EniEIPv6")
        private Boolean eniEIPv6;

        @com.aliyun.core.annotation.NameInMap("GaEIPv6")
        private Boolean gaEIPv6;

        @com.aliyun.core.annotation.NameInMap("NlbIPv6")
        private Boolean nlbIPv6;

        @com.aliyun.core.annotation.NameInMap("SlbIPv6")
        private Boolean slbIPv6;

        private Ipv6(Builder builder) {
            this.aiGatewayEIPv6 = builder.aiGatewayEIPv6;
            this.albIPv6 = builder.albIPv6;
            this.apiGatewayEIPv6 = builder.apiGatewayEIPv6;
            this.ecsIPv6 = builder.ecsIPv6;
            this.eniEIPv6 = builder.eniEIPv6;
            this.gaEIPv6 = builder.gaEIPv6;
            this.nlbIPv6 = builder.nlbIPv6;
            this.slbIPv6 = builder.slbIPv6;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6 create() {
            return builder().build();
        }

        /**
         * @return aiGatewayEIPv6
         */
        public Boolean getAiGatewayEIPv6() {
            return this.aiGatewayEIPv6;
        }

        /**
         * @return albIPv6
         */
        public Boolean getAlbIPv6() {
            return this.albIPv6;
        }

        /**
         * @return apiGatewayEIPv6
         */
        public Boolean getApiGatewayEIPv6() {
            return this.apiGatewayEIPv6;
        }

        /**
         * @return ecsIPv6
         */
        public Boolean getEcsIPv6() {
            return this.ecsIPv6;
        }

        /**
         * @return eniEIPv6
         */
        public Boolean getEniEIPv6() {
            return this.eniEIPv6;
        }

        /**
         * @return gaEIPv6
         */
        public Boolean getGaEIPv6() {
            return this.gaEIPv6;
        }

        /**
         * @return nlbIPv6
         */
        public Boolean getNlbIPv6() {
            return this.nlbIPv6;
        }

        /**
         * @return slbIPv6
         */
        public Boolean getSlbIPv6() {
            return this.slbIPv6;
        }

        public static final class Builder {
            private Boolean aiGatewayEIPv6; 
            private Boolean albIPv6; 
            private Boolean apiGatewayEIPv6; 
            private Boolean ecsIPv6; 
            private Boolean eniEIPv6; 
            private Boolean gaEIPv6; 
            private Boolean nlbIPv6; 
            private Boolean slbIPv6; 

            private Builder() {
            } 

            private Builder(Ipv6 model) {
                this.aiGatewayEIPv6 = model.aiGatewayEIPv6;
                this.albIPv6 = model.albIPv6;
                this.apiGatewayEIPv6 = model.apiGatewayEIPv6;
                this.ecsIPv6 = model.ecsIPv6;
                this.eniEIPv6 = model.eniEIPv6;
                this.gaEIPv6 = model.gaEIPv6;
                this.nlbIPv6 = model.nlbIPv6;
                this.slbIPv6 = model.slbIPv6;
            } 

            /**
             * <p>The asset type: AIGatewayEIPv6.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder aiGatewayEIPv6(Boolean aiGatewayEIPv6) {
                this.aiGatewayEIPv6 = aiGatewayEIPv6;
                return this;
            }

            /**
             * <p>The asset type: AlbIPv6.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder albIPv6(Boolean albIPv6) {
                this.albIPv6 = albIPv6;
                return this;
            }

            /**
             * <p>The asset type: ApigEIPv6.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder apiGatewayEIPv6(Boolean apiGatewayEIPv6) {
                this.apiGatewayEIPv6 = apiGatewayEIPv6;
                return this;
            }

            /**
             * <p>The asset type: EcsIPv6.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder ecsIPv6(Boolean ecsIPv6) {
                this.ecsIPv6 = ecsIPv6;
                return this;
            }

            /**
             * <p>The asset type: EniEIPv6.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder eniEIPv6(Boolean eniEIPv6) {
                this.eniEIPv6 = eniEIPv6;
                return this;
            }

            /**
             * <p>The asset type: GaEIPv6.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder gaEIPv6(Boolean gaEIPv6) {
                this.gaEIPv6 = gaEIPv6;
                return this;
            }

            /**
             * <p>The asset type: NlbIPv6.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder nlbIPv6(Boolean nlbIPv6) {
                this.nlbIPv6 = nlbIPv6;
                return this;
            }

            /**
             * <p>The asset type: SlbIPv6.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder slbIPv6(Boolean slbIPv6) {
                this.slbIPv6 = slbIPv6;
                return this;
            }

            public Ipv6 build() {
                return new Ipv6(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyAddressBookRequest} extends {@link TeaModel}
     *
     * <p>ModifyAddressBookRequest</p>
     */
    public static class ResourceType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ipv4")
        private Ipv4 ipv4;

        @com.aliyun.core.annotation.NameInMap("Ipv6")
        private Ipv6 ipv6;

        private ResourceType(Builder builder) {
            this.ipv4 = builder.ipv4;
            this.ipv6 = builder.ipv6;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceType create() {
            return builder().build();
        }

        /**
         * @return ipv4
         */
        public Ipv4 getIpv4() {
            return this.ipv4;
        }

        /**
         * @return ipv6
         */
        public Ipv6 getIpv6() {
            return this.ipv6;
        }

        public static final class Builder {
            private Ipv4 ipv4; 
            private Ipv6 ipv6; 

            private Builder() {
            } 

            private Builder(ResourceType model) {
                this.ipv4 = model.ipv4;
                this.ipv6 = model.ipv6;
            } 

            /**
             * <p>The IPv4 asset type.</p>
             */
            public Builder ipv4(Ipv4 ipv4) {
                this.ipv4 = ipv4;
                return this;
            }

            /**
             * <p>The IPv6 asset type.</p>
             */
            public Builder ipv6(Ipv6 ipv6) {
                this.ipv6 = ipv6;
                return this;
            }

            public ResourceType build() {
                return new ResourceType(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyAddressBookRequest} extends {@link TeaModel}
     *
     * <p>ModifyAddressBookRequest</p>
     */
    public static class AssetRegionResourceTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetRegionId")
        private String assetRegionId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private ResourceType resourceType;

        private AssetRegionResourceTypes(Builder builder) {
            this.assetRegionId = builder.assetRegionId;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssetRegionResourceTypes create() {
            return builder().build();
        }

        /**
         * @return assetRegionId
         */
        public String getAssetRegionId() {
            return this.assetRegionId;
        }

        /**
         * @return resourceType
         */
        public ResourceType getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String assetRegionId; 
            private ResourceType resourceType; 

            private Builder() {
            } 

            private Builder(AssetRegionResourceTypes model) {
                this.assetRegionId = model.assetRegionId;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>The asset region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>all</p>
             */
            public Builder assetRegionId(String assetRegionId) {
                this.assetRegionId = assetRegionId;
                return this;
            }

            /**
             * <p>The asset type.</p>
             */
            public Builder resourceType(ResourceType resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public AssetRegionResourceTypes build() {
                return new AssetRegionResourceTypes(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyAddressBookRequest} extends {@link TeaModel}
     *
     * <p>ModifyAddressBookRequest</p>
     */
    public static class TagList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private TagList(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagList create() {
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

            private Builder(TagList model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The key of the ECS tag.</p>
             * 
             * <strong>example:</strong>
             * <p>TXY</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The value of the ECS tag.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public TagList build() {
                return new TagList(this);
            } 

        } 

    }
}
