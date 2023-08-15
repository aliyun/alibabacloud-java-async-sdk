// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSslVpnClientsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSslVpnClientsResponseBody</p>
 */
public class DescribeSslVpnClientsResponseBody extends TeaModel {
    @NameInMap("ClientInfoList")
    private java.util.List < ClientInfoList> clientInfoList;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("VpnGatewayId")
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

    /**
     * @return clientInfoList
     */
    public java.util.List < ClientInfoList> getClientInfoList() {
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
        private java.util.List < ClientInfoList> clientInfoList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String requestId; 
        private Integer totalCount; 
        private String vpnGatewayId; 

        /**
         * The list of clients.
         */
        public Builder clientInfoList(java.util.List < ClientInfoList> clientInfoList) {
            this.clientInfoList = clientInfoList;
            return this;
        }

        /**
         * The number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The region ID of the VPN gateway.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The ID of the VPN gateway.
         */
        public Builder vpnGatewayId(String vpnGatewayId) {
            this.vpnGatewayId = vpnGatewayId;
            return this;
        }

        public DescribeSslVpnClientsResponseBody build() {
            return new DescribeSslVpnClientsResponseBody(this);
        } 

    } 

    public static class ClientInfoList extends TeaModel {
        @NameInMap("CommonName")
        private String commonName;

        @NameInMap("ConnectedTime")
        private Long connectedTime;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("Port")
        private String port;

        @NameInMap("PrivateIp")
        private String privateIp;

        @NameInMap("ReceiveBytes")
        private Long receiveBytes;

        @NameInMap("SendBytes")
        private Long sendBytes;

        @NameInMap("Status")
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

            /**
             * The SSL client certificate used by the client.
             * <p>
             * 
             * > If the client uses two-factor authentication to establish an SSL-VPN connection to Alibaba Cloud, the value is the username of the client.
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * The timestamp that indicates when the client connected to Alibaba Cloud through an SSL-VPN connection. Unit: milliseconds. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
             */
            public Builder connectedTime(Long connectedTime) {
                this.connectedTime = connectedTime;
                return this;
            }

            /**
             * The actual public IP address used by the client when the client established an SSL-VPN connection to Alibaba Cloud.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The port used by the client when the client established an SSL-VPN connection to Alibaba Cloud.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The private IP address allocated to the client by the VPN gateway when the client established an SSL-VPN connection to Alibaba Cloud.
             */
            public Builder privateIp(String privateIp) {
                this.privateIp = privateIp;
                return this;
            }

            /**
             * The amount of data transferred from the client to the VPN gateway through the SSL-VPN connection. Unit: bytes.
             */
            public Builder receiveBytes(Long receiveBytes) {
                this.receiveBytes = receiveBytes;
                return this;
            }

            /**
             * The amount of data transferred from the VPN gateway to the client through the SSL-VPN connection. Unit: bytes.
             */
            public Builder sendBytes(Long sendBytes) {
                this.sendBytes = sendBytes;
                return this;
            }

            /**
             * The status of the SSL-VPN connection. The value is set to **online**, which indicates that the client has connected to Alibaba Cloud through an SSL-VPN connection.
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
