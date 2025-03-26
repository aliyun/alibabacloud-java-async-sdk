// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link DescribeSslVpnClientsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSslVpnClientsResponseBody</p>
 */
public class DescribeSslVpnClientsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClientInfoList")
    private java.util.List<ClientInfoList> clientInfoList;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("VpnGatewayId")
    private String vpnGatewayId;

    private DescribeSslVpnClientsResponseBody(Builder builder) {
        this.clientInfoList = builder.clientInfoList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vpnGatewayId = builder.vpnGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSslVpnClientsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientInfoList
     */
    public java.util.List<ClientInfoList> getClientInfoList() {
        return this.clientInfoList;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return vpnGatewayId
     */
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public static final class Builder {
        private java.util.List<ClientInfoList> clientInfoList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String requestId; 
        private Integer totalCount; 
        private String vpnGatewayId; 

        private Builder() {
        } 

        private Builder(DescribeSslVpnClientsResponseBody model) {
            this.clientInfoList = model.clientInfoList;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.vpnGatewayId = model.vpnGatewayId;
        } 

        /**
         * <p>The list of clients.</p>
         */
        public Builder clientInfoList(java.util.List<ClientInfoList> clientInfoList) {
            this.clientInfoList = clientInfoList;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>eu-central-1</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>885E117D-06A9-38A3-8DD2-40BDAC429FFC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The ID of the VPN gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>vpn-gw8gfb947ctddabja****</p>
         */
        public Builder vpnGatewayId(String vpnGatewayId) {
            this.vpnGatewayId = vpnGatewayId;
            return this;
        }

        public DescribeSslVpnClientsResponseBody build() {
            return new DescribeSslVpnClientsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSslVpnClientsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSslVpnClientsResponseBody</p>
     */
    public static class ClientInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommonName")
        private String commonName;

        @com.aliyun.core.annotation.NameInMap("ConnectedTime")
        private Long connectedTime;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("PrivateIp")
        private String privateIp;

        @com.aliyun.core.annotation.NameInMap("ReceiveBytes")
        private Long receiveBytes;

        @com.aliyun.core.annotation.NameInMap("SendBytes")
        private Long sendBytes;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ClientInfoList(Builder builder) {
            this.commonName = builder.commonName;
            this.connectedTime = builder.connectedTime;
            this.ip = builder.ip;
            this.port = builder.port;
            this.privateIp = builder.privateIp;
            this.receiveBytes = builder.receiveBytes;
            this.sendBytes = builder.sendBytes;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientInfoList create() {
            return builder().build();
        }

        /**
         * @return commonName
         */
        public String getCommonName() {
            return this.commonName;
        }

        /**
         * @return connectedTime
         */
        public Long getConnectedTime() {
            return this.connectedTime;
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
        public String getPort() {
            return this.port;
        }

        /**
         * @return privateIp
         */
        public String getPrivateIp() {
            return this.privateIp;
        }

        /**
         * @return receiveBytes
         */
        public Long getReceiveBytes() {
            return this.receiveBytes;
        }

        /**
         * @return sendBytes
         */
        public Long getSendBytes() {
            return this.sendBytes;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String commonName; 
            private Long connectedTime; 
            private String ip; 
            private String port; 
            private String privateIp; 
            private Long receiveBytes; 
            private Long sendBytes; 
            private String status; 

            private Builder() {
            } 

            private Builder(ClientInfoList model) {
                this.commonName = model.commonName;
                this.connectedTime = model.connectedTime;
                this.ip = model.ip;
                this.port = model.port;
                this.privateIp = model.privateIp;
                this.receiveBytes = model.receiveBytes;
                this.sendBytes = model.sendBytes;
                this.status = model.status;
            } 

            /**
             * <p>The SSL client certificate used by the client.</p>
             * <blockquote>
             * <p> If the client uses two-factor authentication to establish an SSL-VPN connection to Alibaba Cloud, the return value is the username of the client.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>CN=vsc-gw8gkh6gtilf1whgc****</p>
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * <p>The timestamp that indicates when the client connected to Alibaba Cloud through an SSL-VPN connection. Unit: milliseconds.</p>
             * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1670985008000</p>
             */
            public Builder connectedTime(Long connectedTime) {
                this.connectedTime = connectedTime;
                return this;
            }

            /**
             * <p>The actual public IP address used by the client when the client established an SSL-VPN connection to Alibaba Cloud.</p>
             * 
             * <strong>example:</strong>
             * <p>8.XX.XX.15</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The port used by the client when the client established an SSL-VPN connection to Alibaba Cloud.</p>
             * 
             * <strong>example:</strong>
             * <p>4****</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The private IP address allocated to the client by the VPN gateway when the client established an SSL-VPN connection to Alibaba Cloud.</p>
             * 
             * <strong>example:</strong>
             * <p>10.10.10.10</p>
             */
            public Builder privateIp(String privateIp) {
                this.privateIp = privateIp;
                return this;
            }

            /**
             * <p>The amount of data transferred from the client to the VPN gateway through the SSL-VPN connection. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>60782</p>
             */
            public Builder receiveBytes(Long receiveBytes) {
                this.receiveBytes = receiveBytes;
                return this;
            }

            /**
             * <p>The amount of data transferred from the VPN gateway to the client through the SSL-VPN connection. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>57144</p>
             */
            public Builder sendBytes(Long sendBytes) {
                this.sendBytes = sendBytes;
                return this;
            }

            /**
             * <p>The status of the SSL-VPN connection.</p>
             * <p>The value is set to <strong>online</strong>, which indicates that the client has connected to Alibaba Cloud through an SSL-VPN connection.</p>
             * 
             * <strong>example:</strong>
             * <p>online</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ClientInfoList build() {
                return new ClientInfoList(this);
            } 

        } 

    }
}
