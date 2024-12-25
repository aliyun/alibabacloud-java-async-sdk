// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeSnatAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSnatAttributeResponseBody</p>
 */
public class DescribeSnatAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreationTime")
    private String creationTime;

    @com.aliyun.core.annotation.NameInMap("DestCIDR")
    private String destCIDR;

    @com.aliyun.core.annotation.NameInMap("IdleTimeout")
    private Integer idleTimeout;

    @com.aliyun.core.annotation.NameInMap("IspAffinity")
    private Boolean ispAffinity;

    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    private String natGatewayId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SnatEntryId")
    private String snatEntryId;

    @com.aliyun.core.annotation.NameInMap("SnatEntryName")
    private String snatEntryName;

    @com.aliyun.core.annotation.NameInMap("SnatIp")
    private String snatIp;

    @com.aliyun.core.annotation.NameInMap("SnatIps")
    private java.util.List<SnatIps> snatIps;

    @com.aliyun.core.annotation.NameInMap("SourceCIDR")
    private String sourceCIDR;

    @com.aliyun.core.annotation.NameInMap("StandbySnatIp")
    private String standbySnatIp;

    @com.aliyun.core.annotation.NameInMap("StandbyStatus")
    private String standbyStatus;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private DescribeSnatAttributeResponseBody(Builder builder) {
        this.creationTime = builder.creationTime;
        this.destCIDR = builder.destCIDR;
        this.idleTimeout = builder.idleTimeout;
        this.ispAffinity = builder.ispAffinity;
        this.natGatewayId = builder.natGatewayId;
        this.requestId = builder.requestId;
        this.snatEntryId = builder.snatEntryId;
        this.snatEntryName = builder.snatEntryName;
        this.snatIp = builder.snatIp;
        this.snatIps = builder.snatIps;
        this.sourceCIDR = builder.sourceCIDR;
        this.standbySnatIp = builder.standbySnatIp;
        this.standbyStatus = builder.standbyStatus;
        this.status = builder.status;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSnatAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return creationTime
     */
    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * @return destCIDR
     */
    public String getDestCIDR() {
        return this.destCIDR;
    }

    /**
     * @return idleTimeout
     */
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    /**
     * @return ispAffinity
     */
    public Boolean getIspAffinity() {
        return this.ispAffinity;
    }

    /**
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return snatEntryId
     */
    public String getSnatEntryId() {
        return this.snatEntryId;
    }

    /**
     * @return snatEntryName
     */
    public String getSnatEntryName() {
        return this.snatEntryName;
    }

    /**
     * @return snatIp
     */
    public String getSnatIp() {
        return this.snatIp;
    }

    /**
     * @return snatIps
     */
    public java.util.List<SnatIps> getSnatIps() {
        return this.snatIps;
    }

    /**
     * @return sourceCIDR
     */
    public String getSourceCIDR() {
        return this.sourceCIDR;
    }

    /**
     * @return standbySnatIp
     */
    public String getStandbySnatIp() {
        return this.standbySnatIp;
    }

    /**
     * @return standbyStatus
     */
    public String getStandbyStatus() {
        return this.standbyStatus;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String creationTime; 
        private String destCIDR; 
        private Integer idleTimeout; 
        private Boolean ispAffinity; 
        private String natGatewayId; 
        private String requestId; 
        private String snatEntryId; 
        private String snatEntryName; 
        private String snatIp; 
        private java.util.List<SnatIps> snatIps; 
        private String sourceCIDR; 
        private String standbySnatIp; 
        private String standbyStatus; 
        private String status; 
        private String type; 

        /**
         * <p>The time when the entry was created. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-04-26T15:38:27Z</p>
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * <p>The destination CIDR block. The rule takes effect only on requests that access the destination CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>101.10. XX.XX/24</p>
         */
        public Builder destCIDR(String destCIDR) {
            this.destCIDR = destCIDR;
            return this;
        }

        /**
         * <p>The timeout period. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder idleTimeout(Integer idleTimeout) {
            this.idleTimeout = idleTimeout;
            return this;
        }

        /**
         * IspAffinity.
         */
        public Builder ispAffinity(Boolean ispAffinity) {
            this.ispAffinity = ispAffinity;
            return this;
        }

        /**
         * <p>The ID of the Network Address Translation (NAT) gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>nat-5t7nh1cfm6kxiszlttr38****</p>
         */
        public Builder natGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the SNAT entry.</p>
         * 
         * <strong>example:</strong>
         * <p>snat-5tfi6f8gds82mjmlofeym****</p>
         */
        public Builder snatEntryId(String snatEntryId) {
            this.snatEntryId = snatEntryId;
            return this;
        }

        /**
         * <p>The name of the SNAT entry.</p>
         * 
         * <strong>example:</strong>
         * <p>test0</p>
         */
        public Builder snatEntryName(String snatEntryName) {
            this.snatEntryName = snatEntryName;
            return this;
        }

        /**
         * <p>The EIP specified in the SNAT entry. Multiple EIPs are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>120.72.XX.XX</p>
         */
        public Builder snatIp(String snatIp) {
            this.snatIp = snatIp;
            return this;
        }

        /**
         * <p>The information about the EIP specified in the SNAT entry.</p>
         */
        public Builder snatIps(java.util.List<SnatIps> snatIps) {
            this.snatIps = snatIps;
            return this;
        }

        /**
         * <p>The source CIDR block specified in the SNAT entry.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.XX.XX/24</p>
         */
        public Builder sourceCIDR(String sourceCIDR) {
            this.sourceCIDR = sourceCIDR;
            return this;
        }

        /**
         * <p>The secondary EIP specified in the SNAT entry. Multiple secondary EIPs are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>101.23. XX.XX</p>
         */
        public Builder standbySnatIp(String standbySnatIp) {
            this.standbySnatIp = standbySnatIp;
            return this;
        }

        /**
         * <p>The status of the secondary EIP.</p>
         * <ul>
         * <li>Running</li>
         * <li>Stopping</li>
         * <li>Stopped</li>
         * <li>Starting</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Stopped</p>
         */
        public Builder standbyStatus(String standbyStatus) {
            this.standbyStatus = standbyStatus;
            return this;
        }

        /**
         * <p>The status of the SNAT entry.</p>
         * <ul>
         * <li>Pending: The SNAT entry is being created or modified.</li>
         * <li>Available: The SNAT entry is available.</li>
         * <li>Deleting: The SNAT entry is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The type of the NAT.</p>
         * <ul>
         * <li>Empty: symmetric NAT.</li>
         * <li>FullCone: full cone NAT.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FullCone</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public DescribeSnatAttributeResponseBody build() {
            return new DescribeSnatAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSnatAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSnatAttributeResponseBody</p>
     */
    public static class SnatIps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private SnatIps(Builder builder) {
            this.creationTime = builder.creationTime;
            this.ip = builder.ip;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SnatIps create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String creationTime; 
            private String ip; 
            private String status; 

            /**
             * <p>The time when the IP address was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-04-26T15:38:27Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>203.132.XX.XX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The status of the IP address.</p>
             * <ul>
             * <li>Running</li>
             * <li>Stopping</li>
             * <li>Stopped</li>
             * <li>Starting</li>
             * <li>Releasing</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public SnatIps build() {
                return new SnatIps(this);
            } 

        } 

    }
}
