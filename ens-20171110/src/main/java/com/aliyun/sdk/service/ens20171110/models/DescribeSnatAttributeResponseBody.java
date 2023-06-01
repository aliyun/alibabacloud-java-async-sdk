// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSnatAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSnatAttributeResponseBody</p>
 */
public class DescribeSnatAttributeResponseBody extends TeaModel {
    @NameInMap("CreationTime")
    private String creationTime;

    @NameInMap("NatGatewayId")
    private String natGatewayId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SnatEntryId")
    private String snatEntryId;

    @NameInMap("SnatEntryName")
    private String snatEntryName;

    @NameInMap("SnatIp")
    private String snatIp;

    @NameInMap("SnatIps")
    private java.util.List < SnatIps> snatIps;

    @NameInMap("SourceCIDR")
    private String sourceCIDR;

    @NameInMap("Status")
    private String status;

    private DescribeSnatAttributeResponseBody(Builder builder) {
        this.creationTime = builder.creationTime;
        this.natGatewayId = builder.natGatewayId;
        this.requestId = builder.requestId;
        this.snatEntryId = builder.snatEntryId;
        this.snatEntryName = builder.snatEntryName;
        this.snatIp = builder.snatIp;
        this.snatIps = builder.snatIps;
        this.sourceCIDR = builder.sourceCIDR;
        this.status = builder.status;
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
    public java.util.List < SnatIps> getSnatIps() {
        return this.snatIps;
    }

    /**
     * @return sourceCIDR
     */
    public String getSourceCIDR() {
        return this.sourceCIDR;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String creationTime; 
        private String natGatewayId; 
        private String requestId; 
        private String snatEntryId; 
        private String snatEntryName; 
        private String snatIp; 
        private java.util.List < SnatIps> snatIps; 
        private String sourceCIDR; 
        private String status; 

        /**
         * CreationTime.
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * NatGatewayId.
         */
        public Builder natGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SnatEntryId.
         */
        public Builder snatEntryId(String snatEntryId) {
            this.snatEntryId = snatEntryId;
            return this;
        }

        /**
         * SnatEntryName.
         */
        public Builder snatEntryName(String snatEntryName) {
            this.snatEntryName = snatEntryName;
            return this;
        }

        /**
         * SnatIp.
         */
        public Builder snatIp(String snatIp) {
            this.snatIp = snatIp;
            return this;
        }

        /**
         * SnatIps.
         */
        public Builder snatIps(java.util.List < SnatIps> snatIps) {
            this.snatIps = snatIps;
            return this;
        }

        /**
         * SourceCIDR.
         */
        public Builder sourceCIDR(String sourceCIDR) {
            this.sourceCIDR = sourceCIDR;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeSnatAttributeResponseBody build() {
            return new DescribeSnatAttributeResponseBody(this);
        } 

    } 

    public static class SnatIps extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("Status")
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
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * Status.
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
