// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosdiversion20230701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryNetListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryNetListResponseBody</p>
 */
public class QueryNetListResponseBody extends TeaModel {
    @NameInMap("Code")
    private Long code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
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
    public java.util.List < Data> getData() {
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
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
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

        public QueryNetListResponseBody build() {
            return new QueryNetListResponseBody(this);
        } 

    } 

    public static class CleanTh extends TeaModel {
        @NameInMap("Mbps")
        private Integer mbps;

        @NameInMap("Pps")
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
             * Mbps。
             */
            public Builder mbps(Integer mbps) {
                this.mbps = mbps;
                return this;
            }

            /**
             * Pps。
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
        @NameInMap("PolicyName")
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
             * PolicyName.
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
        @NameInMap("ThreshMbps")
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
             * ThreshMbps.
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
        @NameInMap("CleanTh")
        private CleanTh cleanTh;

        @NameInMap("DjPolicy")
        private DjPolicy djPolicy;

        @NameInMap("HoleTh")
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
             * CleanTh.
             */
            public Builder cleanTh(CleanTh cleanTh) {
                this.cleanTh = cleanTh;
                return this;
            }

            /**
             * DjPolicy.
             */
            public Builder djPolicy(DjPolicy djPolicy) {
                this.djPolicy = djPolicy;
                return this;
            }

            /**
             * HoleTh.
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
        @NameInMap("Declared")
        private String declared;

        @NameInMap("Region")
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
             * Declared.
             */
            public Builder declared(String declared) {
                this.declared = declared;
                return this;
            }

            /**
             * Region.
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
        @NameInMap("DDoSDefense")
        private DDoSDefense dDoSDefense;

        @NameInMap("Declared")
        private java.util.List < Declared> declared;

        @NameInMap("DeclaredState")
        private Integer declaredState;

        @NameInMap("FwdEffect")
        private Long fwdEffect;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModify")
        private String gmtModify;

        @NameInMap("Mode")
        private String mode;

        @NameInMap("Net")
        private String net;

        @NameInMap("NetExtend")
        private Long netExtend;

        @NameInMap("NetMain")
        private String netMain;

        @NameInMap("NetType")
        private String netType;

        @NameInMap("SaleId")
        private String saleId;

        @NameInMap("UpstreamType")
        private String upstreamType;

        @NameInMap("UserId")
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
        public Long getNetExtend() {
            return this.netExtend;
        }

        /**
         * @return netMain
         */
        public String getNetMain() {
            return this.netMain;
        }

        /**
         * @return netType
         */
        public String getNetType() {
            return this.netType;
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
            private Long netExtend; 
            private String netMain; 
            private String netType; 
            private String saleId; 
            private String upstreamType; 
            private String userId; 

            /**
             * DDoSDefense.
             */
            public Builder dDoSDefense(DDoSDefense dDoSDefense) {
                this.dDoSDefense = dDoSDefense;
                return this;
            }

            /**
             * Declared.
             */
            public Builder declared(java.util.List < Declared> declared) {
                this.declared = declared;
                return this;
            }

            /**
             * DeclaredState.
             */
            public Builder declaredState(Integer declaredState) {
                this.declaredState = declaredState;
                return this;
            }

            /**
             * FwdEffect.
             */
            public Builder fwdEffect(Long fwdEffect) {
                this.fwdEffect = fwdEffect;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModify.
             */
            public Builder gmtModify(String gmtModify) {
                this.gmtModify = gmtModify;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * Net.
             */
            public Builder net(String net) {
                this.net = net;
                return this;
            }

            /**
             * NetExtend.
             */
            public Builder netExtend(Long netExtend) {
                this.netExtend = netExtend;
                return this;
            }

            /**
             * NetMain.
             */
            public Builder netMain(String netMain) {
                this.netMain = netMain;
                return this;
            }

            /**
             * NetType.
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * SaleId.
             */
            public Builder saleId(String saleId) {
                this.saleId = saleId;
                return this;
            }

            /**
             * UpstreamType.
             */
            public Builder upstreamType(String upstreamType) {
                this.upstreamType = upstreamType;
                return this;
            }

            /**
             * UserId.
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
        @NameInMap("Nets")
        private java.util.List < Nets> nets;

        @NameInMap("Num")
        private Long num;

        @NameInMap("Page")
        private Long page;

        @NameInMap("Total")
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
             * Nets.
             */
            public Builder nets(java.util.List < Nets> nets) {
                this.nets = nets;
                return this;
            }

            /**
             * Num.
             */
            public Builder num(Long num) {
                this.num = num;
                return this;
            }

            /**
             * Page.
             */
            public Builder page(Long page) {
                this.page = page;
                return this;
            }

            /**
             * Total.
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
