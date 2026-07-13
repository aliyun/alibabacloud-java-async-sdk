// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentteams20260605.models;

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
 * {@link GetNatGatewayStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetNatGatewayStatusResponseBody</p>
 */
public class GetNatGatewayStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetNatGatewayStatusResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNatGatewayStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetNatGatewayStatusResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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

        public GetNatGatewayStatusResponseBody build() {
            return new GetNatGatewayStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetNatGatewayStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetNatGatewayStatusResponseBody</p>
     */
    public static class NatGateways extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NatGatewayId")
        private String natGatewayId;

        @com.aliyun.core.annotation.NameInMap("SnatConfigured")
        private Boolean snatConfigured;

        @com.aliyun.core.annotation.NameInMap("SnatTableId")
        private String snatTableId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private NatGateways(Builder builder) {
            this.natGatewayId = builder.natGatewayId;
            this.snatConfigured = builder.snatConfigured;
            this.snatTableId = builder.snatTableId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NatGateways create() {
            return builder().build();
        }

        /**
         * @return natGatewayId
         */
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        /**
         * @return snatConfigured
         */
        public Boolean getSnatConfigured() {
            return this.snatConfigured;
        }

        /**
         * @return snatTableId
         */
        public String getSnatTableId() {
            return this.snatTableId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String natGatewayId; 
            private Boolean snatConfigured; 
            private String snatTableId; 
            private String status; 

            private Builder() {
            } 

            private Builder(NatGateways model) {
                this.natGatewayId = model.natGatewayId;
                this.snatConfigured = model.snatConfigured;
                this.snatTableId = model.snatTableId;
                this.status = model.status;
            } 

            /**
             * NatGatewayId.
             */
            public Builder natGatewayId(String natGatewayId) {
                this.natGatewayId = natGatewayId;
                return this;
            }

            /**
             * SnatConfigured.
             */
            public Builder snatConfigured(Boolean snatConfigured) {
                this.snatConfigured = snatConfigured;
                return this;
            }

            /**
             * SnatTableId.
             */
            public Builder snatTableId(String snatTableId) {
                this.snatTableId = snatTableId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public NatGateways build() {
                return new NatGateways(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetNatGatewayStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetNatGatewayStatusResponseBody</p>
     */
    public static class ZoneCidrs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CidrBlock")
        private String cidrBlock;

        @com.aliyun.core.annotation.NameInMap("Covered")
        private Boolean covered;

        @com.aliyun.core.annotation.NameInMap("NatGatewayId")
        private String natGatewayId;

        @com.aliyun.core.annotation.NameInMap("SnatEntryId")
        private String snatEntryId;

        @com.aliyun.core.annotation.NameInMap("SnatSourceCidr")
        private String snatSourceCidr;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private ZoneCidrs(Builder builder) {
            this.cidrBlock = builder.cidrBlock;
            this.covered = builder.covered;
            this.natGatewayId = builder.natGatewayId;
            this.snatEntryId = builder.snatEntryId;
            this.snatSourceCidr = builder.snatSourceCidr;
            this.vSwitchId = builder.vSwitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZoneCidrs create() {
            return builder().build();
        }

        /**
         * @return cidrBlock
         */
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        /**
         * @return covered
         */
        public Boolean getCovered() {
            return this.covered;
        }

        /**
         * @return natGatewayId
         */
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        /**
         * @return snatEntryId
         */
        public String getSnatEntryId() {
            return this.snatEntryId;
        }

        /**
         * @return snatSourceCidr
         */
        public String getSnatSourceCidr() {
            return this.snatSourceCidr;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String cidrBlock; 
            private Boolean covered; 
            private String natGatewayId; 
            private String snatEntryId; 
            private String snatSourceCidr; 
            private String vSwitchId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(ZoneCidrs model) {
                this.cidrBlock = model.cidrBlock;
                this.covered = model.covered;
                this.natGatewayId = model.natGatewayId;
                this.snatEntryId = model.snatEntryId;
                this.snatSourceCidr = model.snatSourceCidr;
                this.vSwitchId = model.vSwitchId;
                this.zoneId = model.zoneId;
            } 

            /**
             * CidrBlock.
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * Covered.
             */
            public Builder covered(Boolean covered) {
                this.covered = covered;
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
             * SnatEntryId.
             */
            public Builder snatEntryId(String snatEntryId) {
                this.snatEntryId = snatEntryId;
                return this;
            }

            /**
             * SnatSourceCidr.
             */
            public Builder snatSourceCidr(String snatSourceCidr) {
                this.snatSourceCidr = snatSourceCidr;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ZoneCidrs build() {
                return new ZoneCidrs(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetNatGatewayStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetNatGatewayStatusResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("NatGatewayConfigured")
        private Boolean natGatewayConfigured;

        @com.aliyun.core.annotation.NameInMap("NatGateways")
        private java.util.List<NatGateways> natGateways;

        @com.aliyun.core.annotation.NameInMap("SnatConfigured")
        private Boolean snatConfigured;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("ZoneCidrCovered")
        private Boolean zoneCidrCovered;

        @com.aliyun.core.annotation.NameInMap("ZoneCidrs")
        private java.util.List<ZoneCidrs> zoneCidrs;

        private Data(Builder builder) {
            this.instanceId = builder.instanceId;
            this.natGatewayConfigured = builder.natGatewayConfigured;
            this.natGateways = builder.natGateways;
            this.snatConfigured = builder.snatConfigured;
            this.status = builder.status;
            this.vpcId = builder.vpcId;
            this.zoneCidrCovered = builder.zoneCidrCovered;
            this.zoneCidrs = builder.zoneCidrs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return natGatewayConfigured
         */
        public Boolean getNatGatewayConfigured() {
            return this.natGatewayConfigured;
        }

        /**
         * @return natGateways
         */
        public java.util.List<NatGateways> getNatGateways() {
            return this.natGateways;
        }

        /**
         * @return snatConfigured
         */
        public Boolean getSnatConfigured() {
            return this.snatConfigured;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return zoneCidrCovered
         */
        public Boolean getZoneCidrCovered() {
            return this.zoneCidrCovered;
        }

        /**
         * @return zoneCidrs
         */
        public java.util.List<ZoneCidrs> getZoneCidrs() {
            return this.zoneCidrs;
        }

        public static final class Builder {
            private String instanceId; 
            private Boolean natGatewayConfigured; 
            private java.util.List<NatGateways> natGateways; 
            private Boolean snatConfigured; 
            private String status; 
            private String vpcId; 
            private Boolean zoneCidrCovered; 
            private java.util.List<ZoneCidrs> zoneCidrs; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.instanceId = model.instanceId;
                this.natGatewayConfigured = model.natGatewayConfigured;
                this.natGateways = model.natGateways;
                this.snatConfigured = model.snatConfigured;
                this.status = model.status;
                this.vpcId = model.vpcId;
                this.zoneCidrCovered = model.zoneCidrCovered;
                this.zoneCidrs = model.zoneCidrs;
            } 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * NatGatewayConfigured.
             */
            public Builder natGatewayConfigured(Boolean natGatewayConfigured) {
                this.natGatewayConfigured = natGatewayConfigured;
                return this;
            }

            /**
             * NatGateways.
             */
            public Builder natGateways(java.util.List<NatGateways> natGateways) {
                this.natGateways = natGateways;
                return this;
            }

            /**
             * SnatConfigured.
             */
            public Builder snatConfigured(Boolean snatConfigured) {
                this.snatConfigured = snatConfigured;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>VPC ID</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-xxx</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * ZoneCidrCovered.
             */
            public Builder zoneCidrCovered(Boolean zoneCidrCovered) {
                this.zoneCidrCovered = zoneCidrCovered;
                return this;
            }

            /**
             * ZoneCidrs.
             */
            public Builder zoneCidrs(java.util.List<ZoneCidrs> zoneCidrs) {
                this.zoneCidrs = zoneCidrs;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
