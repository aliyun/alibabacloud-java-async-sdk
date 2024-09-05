// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosdiversion20230701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryNetListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryNetListResponseBody</p>
 */
public class QueryNetListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryNetListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryNetListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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

    public static final class Builder {
        private Long code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * The status code.
         * <p>
         * 
         * - 200: The request was successful.
         * - Other codes: The request failed.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * The CIDR blocks.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The response parameters.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryNetListResponseBody build() {
            return new QueryNetListResponseBody(this);
        } 

    } 

    public static class CleanTh extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Mbps")
        private Integer mbps;

        @com.aliyun.core.annotation.NameInMap("Pps")
        private Integer pps;

        private CleanTh(Builder builder) {
            this.mbps = builder.mbps;
            this.pps = builder.pps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CleanTh create() {
            return builder().build();
        }

        /**
         * @return mbps
         */
        public Integer getMbps() {
            return this.mbps;
        }

        /**
         * @return pps
         */
        public Integer getPps() {
            return this.pps;
        }

        public static final class Builder {
            private Integer mbps; 
            private Integer pps; 

            /**
             * The traffic scrubbing threshold in Mbit/s.
             */
            public Builder mbps(Integer mbps) {
                this.mbps = mbps;
                return this;
            }

            /**
             * The traffic scrubbing threshold in packets per second (pps)
             */
            public Builder pps(Integer pps) {
                this.pps = pps;
                return this;
            }

            public CleanTh build() {
                return new CleanTh(this);
            } 

        } 

    }
    public static class DjPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PolicyName")
        private String policyName;

        private DjPolicy(Builder builder) {
            this.policyName = builder.policyName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DjPolicy create() {
            return builder().build();
        }

        /**
         * @return policyName
         */
        public String getPolicyName() {
            return this.policyName;
        }

        public static final class Builder {
            private String policyName; 

            /**
             * The name of the mitigation policy.
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            public DjPolicy build() {
                return new DjPolicy(this);
            } 

        } 

    }
    public static class HoleTh extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ThreshMbps")
        private Integer threshMbps;

        private HoleTh(Builder builder) {
            this.threshMbps = builder.threshMbps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HoleTh create() {
            return builder().build();
        }

        /**
         * @return threshMbps
         */
        public Integer getThreshMbps() {
            return this.threshMbps;
        }

        public static final class Builder {
            private Integer threshMbps; 

            /**
             * The blackhole filtering threshold.
             */
            public Builder threshMbps(Integer threshMbps) {
                this.threshMbps = threshMbps;
                return this;
            }

            public HoleTh build() {
                return new HoleTh(this);
            } 

        } 

    }
    public static class DDoSDefense extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CleanTh")
        private CleanTh cleanTh;

        @com.aliyun.core.annotation.NameInMap("DjPolicy")
        private DjPolicy djPolicy;

        @com.aliyun.core.annotation.NameInMap("HoleTh")
        private HoleTh holeTh;

        private DDoSDefense(Builder builder) {
            this.cleanTh = builder.cleanTh;
            this.djPolicy = builder.djPolicy;
            this.holeTh = builder.holeTh;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DDoSDefense create() {
            return builder().build();
        }

        /**
         * @return cleanTh
         */
        public CleanTh getCleanTh() {
            return this.cleanTh;
        }

        /**
         * @return djPolicy
         */
        public DjPolicy getDjPolicy() {
            return this.djPolicy;
        }

        /**
         * @return holeTh
         */
        public HoleTh getHoleTh() {
            return this.holeTh;
        }

        public static final class Builder {
            private CleanTh cleanTh; 
            private DjPolicy djPolicy; 
            private HoleTh holeTh; 

            /**
             * The configuration of traffic scrubbing.
             */
            public Builder cleanTh(CleanTh cleanTh) {
                this.cleanTh = cleanTh;
                return this;
            }

            /**
             * The configuration of the mitigation policy.
             */
            public Builder djPolicy(DjPolicy djPolicy) {
                this.djPolicy = djPolicy;
                return this;
            }

            /**
             * The configuration of blackhole filtering.
             */
            public Builder holeTh(HoleTh holeTh) {
                this.holeTh = holeTh;
                return this;
            }

            public DDoSDefense build() {
                return new DDoSDefense(this);
            } 

        } 

    }
    public static class Declared extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Declared")
        private String declared;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        private Declared(Builder builder) {
            this.declared = builder.declared;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Declared create() {
            return builder().build();
        }

        /**
         * @return declared
         */
        public String getDeclared() {
            return this.declared;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private String declared; 
            private String region; 

            /**
             * Indicates whether the CIDR block is advertised. Valid values:
             * <p>
             * 
             * - 0: The CIDR block is not advertised.
             * - 1: The CIDR block is advertised.
             */
            public Builder declared(String declared) {
                this.declared = declared;
                return this;
            }

            /**
             * The region in which the CIDR block is advertised.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public Declared build() {
                return new Declared(this);
            } 

        } 

    }
    public static class Nets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DDoSDefense")
        private DDoSDefense dDoSDefense;

        @com.aliyun.core.annotation.NameInMap("Declared")
        private java.util.List < Declared> declared;

        @com.aliyun.core.annotation.NameInMap("DeclaredState")
        private Integer declaredState;

        @com.aliyun.core.annotation.NameInMap("FwdEffect")
        private Long fwdEffect;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModify")
        private String gmtModify;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("Net")
        private String net;

        @com.aliyun.core.annotation.NameInMap("NetExtend")
        private String netExtend;

        @com.aliyun.core.annotation.NameInMap("NetMain")
        private Long netMain;

        @com.aliyun.core.annotation.NameInMap("NetType")
        private String netType;

        @com.aliyun.core.annotation.NameInMap("Permit")
        private Integer permit;

        @com.aliyun.core.annotation.NameInMap("SaleId")
        private String saleId;

        @com.aliyun.core.annotation.NameInMap("UpstreamType")
        private String upstreamType;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Nets(Builder builder) {
            this.dDoSDefense = builder.dDoSDefense;
            this.declared = builder.declared;
            this.declaredState = builder.declaredState;
            this.fwdEffect = builder.fwdEffect;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModify = builder.gmtModify;
            this.mode = builder.mode;
            this.net = builder.net;
            this.netExtend = builder.netExtend;
            this.netMain = builder.netMain;
            this.netType = builder.netType;
            this.permit = builder.permit;
            this.saleId = builder.saleId;
            this.upstreamType = builder.upstreamType;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nets create() {
            return builder().build();
        }

        /**
         * @return dDoSDefense
         */
        public DDoSDefense getDDoSDefense() {
            return this.dDoSDefense;
        }

        /**
         * @return declared
         */
        public java.util.List < Declared> getDeclared() {
            return this.declared;
        }

        /**
         * @return declaredState
         */
        public Integer getDeclaredState() {
            return this.declaredState;
        }

        /**
         * @return fwdEffect
         */
        public Long getFwdEffect() {
            return this.fwdEffect;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModify
         */
        public String getGmtModify() {
            return this.gmtModify;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return net
         */
        public String getNet() {
            return this.net;
        }

        /**
         * @return netExtend
         */
        public String getNetExtend() {
            return this.netExtend;
        }

        /**
         * @return netMain
         */
        public Long getNetMain() {
            return this.netMain;
        }

        /**
         * @return netType
         */
        public String getNetType() {
            return this.netType;
        }

        /**
         * @return permit
         */
        public Integer getPermit() {
            return this.permit;
        }

        /**
         * @return saleId
         */
        public String getSaleId() {
            return this.saleId;
        }

        /**
         * @return upstreamType
         */
        public String getUpstreamType() {
            return this.upstreamType;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private DDoSDefense dDoSDefense; 
            private java.util.List < Declared> declared; 
            private Integer declaredState; 
            private Long fwdEffect; 
            private String gmtCreate; 
            private String gmtModify; 
            private String mode; 
            private String net; 
            private String netExtend; 
            private Long netMain; 
            private String netType; 
            private Integer permit; 
            private String saleId; 
            private String upstreamType; 
            private String userId; 

            /**
             * The DDoS mitigation configuration of the CIDR block.
             */
            public Builder dDoSDefense(DDoSDefense dDoSDefense) {
                this.dDoSDefense = dDoSDefense;
                return this;
            }

            /**
             * The advertising details.
             */
            public Builder declared(java.util.List < Declared> declared) {
                this.declared = declared;
                return this;
            }

            /**
             * The advertising status of the CIDR block. Valid values:
             * <p>
             * - 0: The CIDR block is not advertised.
             * - 1: The CIDR block is advertised.
             */
            public Builder declaredState(Integer declaredState) {
                this.declaredState = declaredState;
                return this;
            }

            /**
             * Indicates whether the forwarding configuration takes effect. Valid values:
             * <p>
             * 
             * - 0: The forwarding configuration takes effect.
             * - 1: The forwarding configuration does not take effect.
             * - -1: The forwarding configuration is being deleted.
             */
            public Builder fwdEffect(Long fwdEffect) {
                this.fwdEffect = fwdEffect;
                return this;
            }

            /**
             * The creation time.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The modification time.
             */
            public Builder gmtModify(String gmtModify) {
                this.gmtModify = gmtModify;
                return this;
            }

            /**
             * The scheduling mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * The CIDR block of the anti-DDoS diversion instance.
             */
            public Builder net(String net) {
                this.net = net;
                return this;
            }

            /**
             * Indicates whether the CIDR block needs to be extended. Valid values:
             * <p>
             * 
             * - 0: The CIDR block needs to be extended.
             * - 1: The CIDR block does not need to be extended.
             */
            public Builder netExtend(String netExtend) {
                this.netExtend = netExtend;
                return this;
            }

            /**
             * The primary CIDR block.
             */
            public Builder netMain(Long netMain) {
                this.netMain = netMain;
                return this;
            }

            /**
             * The type of the CIDR block.
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * Permit.
             */
            public Builder permit(Integer permit) {
                this.permit = permit;
                return this;
            }

            /**
             * The ID of the anti-DDoS diversion instance.
             */
            public Builder saleId(String saleId) {
                this.saleId = saleId;
                return this;
            }

            /**
             * The reinjection type.
             */
            public Builder upstreamType(String upstreamType) {
                this.upstreamType = upstreamType;
                return this;
            }

            /**
             * The user ID.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Nets build() {
                return new Nets(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Nets")
        private java.util.List < Nets> nets;

        @com.aliyun.core.annotation.NameInMap("Num")
        private Long num;

        @com.aliyun.core.annotation.NameInMap("Page")
        private Long page;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.nets = builder.nets;
            this.num = builder.num;
            this.page = builder.page;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return nets
         */
        public java.util.List < Nets> getNets() {
            return this.nets;
        }

        /**
         * @return num
         */
        public Long getNum() {
            return this.num;
        }

        /**
         * @return page
         */
        public Long getPage() {
            return this.page;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < Nets> nets; 
            private Long num; 
            private Long page; 
            private Long total; 

            /**
             * The configuration of the CIDR block.
             */
            public Builder nets(java.util.List < Nets> nets) {
                this.nets = nets;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder num(Long num) {
                this.num = num;
                return this;
            }

            /**
             * The page number.
             */
            public Builder page(Long page) {
                this.page = page;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
