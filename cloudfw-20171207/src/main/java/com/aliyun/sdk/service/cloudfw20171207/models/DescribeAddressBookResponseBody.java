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
 * {@link DescribeAddressBookResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAddressBookResponseBody</p>
 */
public class DescribeAddressBookResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Acls")
    private java.util.List<Acls> acls;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private String pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private DescribeAddressBookResponseBody(Builder builder) {
        this.acls = builder.acls;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAddressBookResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acls
     */
    public java.util.List<Acls> getAcls() {
        return this.acls;
    }

    /**
     * @return pageNo
     */
    public String getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
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
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Acls> acls; 
        private String pageNo; 
        private String pageSize; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(DescribeAddressBookResponseBody model) {
            this.acls = model.acls;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The information about the address book.</p>
         */
        public Builder acls(java.util.List<Acls> acls) {
            this.acls = acls;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(String pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B36F150A-1E27-43AA-B72C-D2AC712F09DA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of the returned address books.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAddressBookResponseBody build() {
            return new DescribeAddressBookResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAddressBookResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAddressBookResponseBody</p>
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
     * {@link DescribeAddressBookResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAddressBookResponseBody</p>
     */
    public static class Addresses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("Note")
        private String note;

        private Addresses(Builder builder) {
            this.address = builder.address;
            this.note = builder.note;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Addresses create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return note
         */
        public String getNote() {
            return this.note;
        }

        public static final class Builder {
            private String address; 
            private String note; 

            private Builder() {
            } 

            private Builder(Addresses model) {
                this.address = model.address;
                this.note = model.note;
            } 

            /**
             * <p>Address information in the address book.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.1/32</p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>Single address description.</p>
             * 
             * <strong>example:</strong>
             * <p>description</p>
             */
            public Builder note(String note) {
                this.note = note;
                return this;
            }

            public Addresses build() {
                return new Addresses(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAddressBookResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAddressBookResponseBody</p>
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
             * AiGatewayEIP.
             */
            public Builder aiGatewayEIP(Boolean aiGatewayEIP) {
                this.aiGatewayEIP = aiGatewayEIP;
                return this;
            }

            /**
             * AlbEIP.
             */
            public Builder albEIP(Boolean albEIP) {
                this.albEIP = albEIP;
                return this;
            }

            /**
             * ApiGatewayEIP.
             */
            public Builder apiGatewayEIP(Boolean apiGatewayEIP) {
                this.apiGatewayEIP = apiGatewayEIP;
                return this;
            }

            /**
             * BastionHostEgressIP.
             */
            public Builder bastionHostEgressIP(Boolean bastionHostEgressIP) {
                this.bastionHostEgressIP = bastionHostEgressIP;
                return this;
            }

            /**
             * BastionHostIP.
             */
            public Builder bastionHostIP(Boolean bastionHostIP) {
                this.bastionHostIP = bastionHostIP;
                return this;
            }

            /**
             * BastionHostIngressIP.
             */
            public Builder bastionHostIngressIP(Boolean bastionHostIngressIP) {
                this.bastionHostIngressIP = bastionHostIngressIP;
                return this;
            }

            /**
             * EIP.
             */
            public Builder EIP(Boolean EIP) {
                this.EIP = EIP;
                return this;
            }

            /**
             * EcsEIP.
             */
            public Builder ecsEIP(Boolean ecsEIP) {
                this.ecsEIP = ecsEIP;
                return this;
            }

            /**
             * EcsPublicIP.
             */
            public Builder ecsPublicIP(Boolean ecsPublicIP) {
                this.ecsPublicIP = ecsPublicIP;
                return this;
            }

            /**
             * EniEIP.
             */
            public Builder eniEIP(Boolean eniEIP) {
                this.eniEIP = eniEIP;
                return this;
            }

            /**
             * GaEIP.
             */
            public Builder gaEIP(Boolean gaEIP) {
                this.gaEIP = gaEIP;
                return this;
            }

            /**
             * HAVIP.
             */
            public Builder HAVIP(Boolean HAVIP) {
                this.HAVIP = HAVIP;
                return this;
            }

            /**
             * NatEIP.
             */
            public Builder natEIP(Boolean natEIP) {
                this.natEIP = natEIP;
                return this;
            }

            /**
             * NatPublicIP.
             */
            public Builder natPublicIP(Boolean natPublicIP) {
                this.natPublicIP = natPublicIP;
                return this;
            }

            /**
             * NlbEIP.
             */
            public Builder nlbEIP(Boolean nlbEIP) {
                this.nlbEIP = nlbEIP;
                return this;
            }

            /**
             * SlbEIP.
             */
            public Builder slbEIP(Boolean slbEIP) {
                this.slbEIP = slbEIP;
                return this;
            }

            /**
             * SlbPublicIP.
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
     * {@link DescribeAddressBookResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAddressBookResponseBody</p>
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
             * AiGatewayEIPv6.
             */
            public Builder aiGatewayEIPv6(Boolean aiGatewayEIPv6) {
                this.aiGatewayEIPv6 = aiGatewayEIPv6;
                return this;
            }

            /**
             * AlbIPv6.
             */
            public Builder albIPv6(Boolean albIPv6) {
                this.albIPv6 = albIPv6;
                return this;
            }

            /**
             * ApiGatewayEIPv6.
             */
            public Builder apiGatewayEIPv6(Boolean apiGatewayEIPv6) {
                this.apiGatewayEIPv6 = apiGatewayEIPv6;
                return this;
            }

            /**
             * EcsIPv6.
             */
            public Builder ecsIPv6(Boolean ecsIPv6) {
                this.ecsIPv6 = ecsIPv6;
                return this;
            }

            /**
             * EniEIPv6.
             */
            public Builder eniEIPv6(Boolean eniEIPv6) {
                this.eniEIPv6 = eniEIPv6;
                return this;
            }

            /**
             * GaEIPv6.
             */
            public Builder gaEIPv6(Boolean gaEIPv6) {
                this.gaEIPv6 = gaEIPv6;
                return this;
            }

            /**
             * NlbIPv6.
             */
            public Builder nlbIPv6(Boolean nlbIPv6) {
                this.nlbIPv6 = nlbIPv6;
                return this;
            }

            /**
             * SlbIPv6.
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
     * {@link DescribeAddressBookResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAddressBookResponseBody</p>
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
             * Ipv4.
             */
            public Builder ipv4(Ipv4 ipv4) {
                this.ipv4 = ipv4;
                return this;
            }

            /**
             * Ipv6.
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
     * {@link DescribeAddressBookResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAddressBookResponseBody</p>
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
             * AssetRegionId.
             */
            public Builder assetRegionId(String assetRegionId) {
                this.assetRegionId = assetRegionId;
                return this;
            }

            /**
             * ResourceType.
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
     * {@link DescribeAddressBookResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAddressBookResponseBody</p>
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
             * <p>company</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The value of the ECS tag.</p>
             * 
             * <strong>example:</strong>
             * <p>admin</p>
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
    /**
     * 
     * {@link DescribeAddressBookResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAddressBookResponseBody</p>
     */
    public static class Acls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AckClusterConnectorId")
        private String ackClusterConnectorId;

        @com.aliyun.core.annotation.NameInMap("AckClusterConnectorName")
        private String ackClusterConnectorName;

        @com.aliyun.core.annotation.NameInMap("AckLabels")
        private java.util.List<AckLabels> ackLabels;

        @com.aliyun.core.annotation.NameInMap("AckNamespaces")
        private java.util.List<String> ackNamespaces;

        @com.aliyun.core.annotation.NameInMap("AddressList")
        private java.util.List<String> addressList;

        @com.aliyun.core.annotation.NameInMap("AddressListCount")
        private Integer addressListCount;

        @com.aliyun.core.annotation.NameInMap("Addresses")
        private java.util.List<Addresses> addresses;

        @com.aliyun.core.annotation.NameInMap("AssetMemberUids")
        private java.util.List<Long> assetMemberUids;

        @com.aliyun.core.annotation.NameInMap("AssetRegionResourceTypes")
        private java.util.List<AssetRegionResourceTypes> assetRegionResourceTypes;

        @com.aliyun.core.annotation.NameInMap("AutoAddTagEcs")
        private Integer autoAddTagEcs;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("GroupType")
        private String groupType;

        @com.aliyun.core.annotation.NameInMap("GroupUuid")
        private String groupUuid;

        @com.aliyun.core.annotation.NameInMap("ReferenceCount")
        private Integer referenceCount;

        @com.aliyun.core.annotation.NameInMap("RegionNo")
        private String regionNo;

        @com.aliyun.core.annotation.NameInMap("TagList")
        private java.util.List<TagList> tagList;

        @com.aliyun.core.annotation.NameInMap("TagRelation")
        private String tagRelation;

        private Acls(Builder builder) {
            this.ackClusterConnectorId = builder.ackClusterConnectorId;
            this.ackClusterConnectorName = builder.ackClusterConnectorName;
            this.ackLabels = builder.ackLabels;
            this.ackNamespaces = builder.ackNamespaces;
            this.addressList = builder.addressList;
            this.addressListCount = builder.addressListCount;
            this.addresses = builder.addresses;
            this.assetMemberUids = builder.assetMemberUids;
            this.assetRegionResourceTypes = builder.assetRegionResourceTypes;
            this.autoAddTagEcs = builder.autoAddTagEcs;
            this.description = builder.description;
            this.groupName = builder.groupName;
            this.groupType = builder.groupType;
            this.groupUuid = builder.groupUuid;
            this.referenceCount = builder.referenceCount;
            this.regionNo = builder.regionNo;
            this.tagList = builder.tagList;
            this.tagRelation = builder.tagRelation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Acls create() {
            return builder().build();
        }

        /**
         * @return ackClusterConnectorId
         */
        public String getAckClusterConnectorId() {
            return this.ackClusterConnectorId;
        }

        /**
         * @return ackClusterConnectorName
         */
        public String getAckClusterConnectorName() {
            return this.ackClusterConnectorName;
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
        public java.util.List<String> getAddressList() {
            return this.addressList;
        }

        /**
         * @return addressListCount
         */
        public Integer getAddressListCount() {
            return this.addressListCount;
        }

        /**
         * @return addresses
         */
        public java.util.List<Addresses> getAddresses() {
            return this.addresses;
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
        public Integer getAutoAddTagEcs() {
            return this.autoAddTagEcs;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return groupType
         */
        public String getGroupType() {
            return this.groupType;
        }

        /**
         * @return groupUuid
         */
        public String getGroupUuid() {
            return this.groupUuid;
        }

        /**
         * @return referenceCount
         */
        public Integer getReferenceCount() {
            return this.referenceCount;
        }

        /**
         * @return regionNo
         */
        public String getRegionNo() {
            return this.regionNo;
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

        public static final class Builder {
            private String ackClusterConnectorId; 
            private String ackClusterConnectorName; 
            private java.util.List<AckLabels> ackLabels; 
            private java.util.List<String> ackNamespaces; 
            private java.util.List<String> addressList; 
            private Integer addressListCount; 
            private java.util.List<Addresses> addresses; 
            private java.util.List<Long> assetMemberUids; 
            private java.util.List<AssetRegionResourceTypes> assetRegionResourceTypes; 
            private Integer autoAddTagEcs; 
            private String description; 
            private String groupName; 
            private String groupType; 
            private String groupUuid; 
            private Integer referenceCount; 
            private String regionNo; 
            private java.util.List<TagList> tagList; 
            private String tagRelation; 

            private Builder() {
            } 

            private Builder(Acls model) {
                this.ackClusterConnectorId = model.ackClusterConnectorId;
                this.ackClusterConnectorName = model.ackClusterConnectorName;
                this.ackLabels = model.ackLabels;
                this.ackNamespaces = model.ackNamespaces;
                this.addressList = model.addressList;
                this.addressListCount = model.addressListCount;
                this.addresses = model.addresses;
                this.assetMemberUids = model.assetMemberUids;
                this.assetRegionResourceTypes = model.assetRegionResourceTypes;
                this.autoAddTagEcs = model.autoAddTagEcs;
                this.description = model.description;
                this.groupName = model.groupName;
                this.groupType = model.groupType;
                this.groupUuid = model.groupUuid;
                this.referenceCount = model.referenceCount;
                this.regionNo = model.regionNo;
                this.tagList = model.tagList;
                this.tagRelation = model.tagRelation;
            } 

            /**
             * AckClusterConnectorId.
             */
            public Builder ackClusterConnectorId(String ackClusterConnectorId) {
                this.ackClusterConnectorId = ackClusterConnectorId;
                return this;
            }

            /**
             * AckClusterConnectorName.
             */
            public Builder ackClusterConnectorName(String ackClusterConnectorName) {
                this.ackClusterConnectorName = ackClusterConnectorName;
                return this;
            }

            /**
             * AckLabels.
             */
            public Builder ackLabels(java.util.List<AckLabels> ackLabels) {
                this.ackLabels = ackLabels;
                return this;
            }

            /**
             * AckNamespaces.
             */
            public Builder ackNamespaces(java.util.List<String> ackNamespaces) {
                this.ackNamespaces = ackNamespaces;
                return this;
            }

            /**
             * <p>The addresses in the address book.</p>
             */
            public Builder addressList(java.util.List<String> addressList) {
                this.addressList = addressList;
                return this;
            }

            /**
             * <p>The number of addresses in the address book.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder addressListCount(Integer addressListCount) {
                this.addressListCount = addressListCount;
                return this;
            }

            /**
             * <p>A list of addresses in the address book, each with a single address description.</p>
             */
            public Builder addresses(java.util.List<Addresses> addresses) {
                this.addresses = addresses;
                return this;
            }

            /**
             * AssetMemberUids.
             */
            public Builder assetMemberUids(java.util.List<Long> assetMemberUids) {
                this.assetMemberUids = assetMemberUids;
                return this;
            }

            /**
             * AssetRegionResourceTypes.
             */
            public Builder assetRegionResourceTypes(java.util.List<AssetRegionResourceTypes> assetRegionResourceTypes) {
                this.assetRegionResourceTypes = assetRegionResourceTypes;
                return this;
            }

            /**
             * <p>Indicates whether the public IP addresses of ECS instances are automatically added to the address book if the instances match the specified tags. The setting takes effect on both newly purchased ECS instances whose tag settings are complete and ECS instances whose tag settings are modified. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: yes</li>
             * <li><strong>0</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder autoAddTagEcs(Integer autoAddTagEcs) {
                this.autoAddTagEcs = autoAddTagEcs;
                return this;
            }

            /**
             * <p>The description of the address book.</p>
             * 
             * <strong>example:</strong>
             * <p>my address book</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the address book.</p>
             * 
             * <strong>example:</strong>
             * <p>demo_address_book</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The type of the address book. Valid values:</p>
             * <ul>
             * <li><strong>ip</strong>: IP address book</li>
             * <li><strong>domain</strong>: domain address book</li>
             * <li><strong>port</strong>: port address book</li>
             * <li><strong>tag</strong>: ECS tag-based address book</li>
             * <li><strong>allCloud</strong>: cloud service address book</li>
             * <li><strong>threat</strong>: threat intelligence address book</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ip</p>
             */
            public Builder groupType(String groupType) {
                this.groupType = groupType;
                return this;
            }

            /**
             * <p>The UUID of the address book.</p>
             * 
             * <strong>example:</strong>
             * <p>f04ac7ce-628b-4cb7-be61-310222b7****</p>
             */
            public Builder groupUuid(String groupUuid) {
                this.groupUuid = groupUuid;
                return this;
            }

            /**
             * <p>The number of times that the address book is referenced.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder referenceCount(Integer referenceCount) {
                this.referenceCount = referenceCount;
                return this;
            }

            /**
             * RegionNo.
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * <p>The details about the ECS tags that can be automatically added to the address book.</p>
             */
            public Builder tagList(java.util.List<TagList> tagList) {
                this.tagList = tagList;
                return this;
            }

            /**
             * <p>The logical relationship among ECS tags. Valid values:</p>
             * <ul>
             * <li><strong>and</strong>: Only the public IP addresses of ECS instances that match all the specified tags can be added to the address book.</li>
             * <li><strong>or</strong>: The public IP addresses of ECS instances that match any of the specified tags can be added to the address book.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>and</p>
             */
            public Builder tagRelation(String tagRelation) {
                this.tagRelation = tagRelation;
                return this;
            }

            public Acls build() {
                return new Acls(this);
            } 

        } 

    }
}
