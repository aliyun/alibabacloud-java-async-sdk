// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListPolicyAttachmentRequest} extends {@link RequestModel}
 *
 * <p>ListPolicyAttachmentRequest</p>
 */
public class ListPolicyAttachmentRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpPortProtocolList")
    private java.util.List < IpPortProtocolList> ipPortProtocolList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    private String policyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyType")
    private String policyType;

    private ListPolicyAttachmentRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.ipPortProtocolList = builder.ipPortProtocolList;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.policyId = builder.policyId;
        this.policyType = builder.policyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPolicyAttachmentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return ipPortProtocolList
     */
    public java.util.List < IpPortProtocolList> getIpPortProtocolList() {
        return this.ipPortProtocolList;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * @return policyType
     */
    public String getPolicyType() {
        return this.policyType;
    }

    public static final class Builder extends Request.Builder<ListPolicyAttachmentRequest, Builder> {
        private String regionId; 
        private java.util.List < IpPortProtocolList> ipPortProtocolList; 
        private Long pageNo; 
        private Long pageSize; 
        private String policyId; 
        private String policyType; 

        private Builder() {
            super();
        } 

        private Builder(ListPolicyAttachmentRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.ipPortProtocolList = request.ipPortProtocolList;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.policyId = request.policyId;
            this.policyType = request.policyType;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The protected objects.</p>
         */
        public Builder ipPortProtocolList(java.util.List < IpPortProtocolList> ipPortProtocolList) {
            String ipPortProtocolListShrink = shrink(ipPortProtocolList, "IpPortProtocolList", "json");
            this.putQueryParameter("IpPortProtocolList", ipPortProtocolListShrink);
            this.ipPortProtocolList = ipPortProtocolList;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>f38f6520-92b7-451e-b520-9ab3********</p>
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>The type of the policy. Valid values:</p>
         * <ul>
         * <li><strong>default</strong>: the default mitigation policies.</li>
         * <li><strong>l3</strong>: IP-specific mitigation policies.</li>
         * <li><strong>l4</strong>: port-specific mitigation policies.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>l3</p>
         */
        public Builder policyType(String policyType) {
            this.putQueryParameter("PolicyType", policyType);
            this.policyType = policyType;
            return this;
        }

        @Override
        public ListPolicyAttachmentRequest build() {
            return new ListPolicyAttachmentRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListPolicyAttachmentRequest} extends {@link TeaModel}
     *
     * <p>ListPolicyAttachmentRequest</p>
     */
    public static class IpPortProtocolList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ip")
        @com.aliyun.core.annotation.Validation(required = true)
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Port")
        @com.aliyun.core.annotation.Validation(maximum = 65535, minimum = 1)
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        private IpPortProtocolList(Builder builder) {
            this.ip = builder.ip;
            this.port = builder.port;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpPortProtocolList create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private String ip; 
            private Integer port; 
            private String protocol; 

            /**
             * <p>The IP address of the protected object.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>47.118.172.***</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The port number of the protected object.</p>
             * 
             * <strong>example:</strong>
             * <p>8*</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The protocol type of the protected object. Valid values:</p>
             * <ul>
             * <li><strong>tcp</strong></li>
             * <li><strong>udp</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>tcp</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public IpPortProtocolList build() {
                return new IpPortProtocolList(this);
            } 

        } 

    }
}
