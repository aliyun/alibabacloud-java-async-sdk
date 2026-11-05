// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosdiversion20230701.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(QueryNetListResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The status code.</p>
         * <ul>
         * <li><p>200: The request was successful.</p>
         * </li>
         * <li><p>Other codes: The request failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The CIDR blocks.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>24B652B5-AEFF-3F03-9114-00D053C42277</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryNetListResponseBody build() {
            return new QueryNetListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryNetListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryNetListResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(CleanTh model) {
                this.mbps = model.mbps;
                this.pps = model.pps;
            } 

            /**
             * <p>The traffic scrubbing threshold in Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder mbps(Integer mbps) {
                this.mbps = mbps;
                return this;
            }

            /**
             * <p>The traffic scrubbing threshold in packets per second (pps).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link QueryNetListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryNetListResponseBody</p>
     */
    public static class CustomNetPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PolicyName")
        private String policyName;

        @com.aliyun.core.annotation.NameInMap("TmplId")
        private String tmplId;

        private CustomNetPolicy(Builder builder) {
            this.policyName = builder.policyName;
            this.tmplId = builder.tmplId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomNetPolicy create() {
            return builder().build();
        }

        /**
         * @return policyName
         */
        public String getPolicyName() {
            return this.policyName;
        }

        /**
         * @return tmplId
         */
        public String getTmplId() {
            return this.tmplId;
        }

        public static final class Builder {
            private String policyName; 
            private String tmplId; 

            private Builder() {
            } 

            private Builder(CustomNetPolicy model) {
                this.policyName = model.policyName;
                this.tmplId = model.tmplId;
            } 

            /**
             * PolicyName.
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * TmplId.
             */
            public Builder tmplId(String tmplId) {
                this.tmplId = tmplId;
                return this;
            }

            public CustomNetPolicy build() {
                return new CustomNetPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryNetListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryNetListResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(DjPolicy model) {
                this.policyName = model.policyName;
            } 

            /**
             * <p>The name of the mitigation policy.</p>
             * 
             * <strong>example:</strong>
             * <p>gf_origin_xxxxx</p>
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
    /**
     * 
     * {@link QueryNetListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryNetListResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(HoleTh model) {
                this.threshMbps = model.threshMbps;
            } 

            /**
             * <p>The blackhole filtering threshold in Mbit/s. The value 0 indicates best-effort protection.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link QueryNetListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryNetListResponseBody</p>
     */
    public static class DDoSDefense extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CleanTh")
        private CleanTh cleanTh;

        @com.aliyun.core.annotation.NameInMap("CustomNetPolicy")
        private CustomNetPolicy customNetPolicy;

        @com.aliyun.core.annotation.NameInMap("DjPolicy")
        private DjPolicy djPolicy;

        @com.aliyun.core.annotation.NameInMap("HoleTh")
        private HoleTh holeTh;

        private DDoSDefense(Builder builder) {
            this.cleanTh = builder.cleanTh;
            this.customNetPolicy = builder.customNetPolicy;
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
         * @return customNetPolicy
         */
        public CustomNetPolicy getCustomNetPolicy() {
            return this.customNetPolicy;
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
            private CustomNetPolicy customNetPolicy; 
            private DjPolicy djPolicy; 
            private HoleTh holeTh; 

            private Builder() {
            } 

            private Builder(DDoSDefense model) {
                this.cleanTh = model.cleanTh;
                this.customNetPolicy = model.customNetPolicy;
                this.djPolicy = model.djPolicy;
                this.holeTh = model.holeTh;
            } 

            /**
             * <p>The configuration of traffic scrubbing.</p>
             */
            public Builder cleanTh(CleanTh cleanTh) {
                this.cleanTh = cleanTh;
                return this;
            }

            /**
             * CustomNetPolicy.
             */
            public Builder customNetPolicy(CustomNetPolicy customNetPolicy) {
                this.customNetPolicy = customNetPolicy;
                return this;
            }

            /**
             * <p>The configuration of the mitigation policy.</p>
             */
            public Builder djPolicy(DjPolicy djPolicy) {
                this.djPolicy = djPolicy;
                return this;
            }

            /**
             * <p>The configuration of blackhole filtering.</p>
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
    /**
     * 
     * {@link QueryNetListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryNetListResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Declared model) {
                this.declared = model.declared;
                this.region = model.region;
            } 

            /**
             * <p>Indicates whether the CIDR block is advertised. Valid values:</p>
             * <ul>
             * <li><p>0: The CIDR block is not advertised.</p>
             * </li>
             * <li><p>1: The CIDR block is advertised.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder declared(String declared) {
                this.declared = declared;
                return this;
            }

            /**
             * <p>The region in which the CIDR block is advertised. Valid values:</p>
             * <ul>
             * <li><p>oe26: China (Hong Kong).</p>
             * </li>
             * <li><p>us50: US (Virginia).</p>
             * </li>
             * <li><p>oe24: US (Silicon Valley).</p>
             * </li>
             * <li><p>oe28: Singapore.</p>
             * </li>
             * <li><p>jp141: Japan (Tokyo).</p>
             * </li>
             * <li><p>Gb145: UK (London).</p>
             * </li>
             * <li><p>oi39: Germany (Frankfurt).</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>oe26</p>
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
    /**
     * 
     * {@link QueryNetListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryNetListResponseBody</p>
     */
    public static class Nets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DDoSDefense")
        private DDoSDefense dDoSDefense;

        @com.aliyun.core.annotation.NameInMap("Declared")
        private java.util.List<Declared> declared;

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
        private String netMain;

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
        public java.util.List<Declared> getDeclared() {
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
            private java.util.List<Declared> declared; 
            private Integer declaredState; 
            private Long fwdEffect; 
            private String gmtCreate; 
            private String gmtModify; 
            private String mode; 
            private String net; 
            private String netExtend; 
            private String netMain; 
            private String netType; 
            private Integer permit; 
            private String saleId; 
            private String upstreamType; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Nets model) {
                this.dDoSDefense = model.dDoSDefense;
                this.declared = model.declared;
                this.declaredState = model.declaredState;
                this.fwdEffect = model.fwdEffect;
                this.gmtCreate = model.gmtCreate;
                this.gmtModify = model.gmtModify;
                this.mode = model.mode;
                this.net = model.net;
                this.netExtend = model.netExtend;
                this.netMain = model.netMain;
                this.netType = model.netType;
                this.permit = model.permit;
                this.saleId = model.saleId;
                this.upstreamType = model.upstreamType;
                this.userId = model.userId;
            } 

            /**
             * <p>The DDoS mitigation configuration of the CIDR block.</p>
             */
            public Builder dDoSDefense(DDoSDefense dDoSDefense) {
                this.dDoSDefense = dDoSDefense;
                return this;
            }

            /**
             * <p>The advertising details.</p>
             */
            public Builder declared(java.util.List<Declared> declared) {
                this.declared = declared;
                return this;
            }

            /**
             * <p>The advertising status of the CIDR block. Valid values:</p>
             * <ul>
             * <li><p>0: The CIDR block is not advertised.</p>
             * </li>
             * <li><p>1: The CIDR block is advertised.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder declaredState(Integer declaredState) {
                this.declaredState = declaredState;
                return this;
            }

            /**
             * <p>Indicates whether the forwarding configuration takes effect. Valid values:</p>
             * <ul>
             * <li><p>0: The forwarding configuration does not take effect.</p>
             * </li>
             * <li><p>1: The forwarding configuration takes effect.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder fwdEffect(Long fwdEffect) {
                this.fwdEffect = fwdEffect;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-09-05 13:52:50</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-09-05 13:59:55</p>
             */
            public Builder gmtModify(String gmtModify) {
                this.gmtModify = gmtModify;
                return this;
            }

            /**
             * <p>The scheduling mode. Valid values:</p>
             * <ul>
             * <li><p>netflow-auto</p>
             * </li>
             * <li><p>manual</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>manual</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The CIDR block of the anti-DDoS diversion instance.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX/24</p>
             */
            public Builder net(String net) {
                this.net = net;
                return this;
            }

            /**
             * <p>Indicates whether the CIDR block needs to be extended. Valid values:</p>
             * <ul>
             * <li><p>0: The CIDR block does not need to be extended.</p>
             * </li>
             * <li><p>1: The CIDR block needs to be extended.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder netExtend(String netExtend) {
                this.netExtend = netExtend;
                return this;
            }

            /**
             * <p>The primary CIDR block of the anti-DDoS diversion instance for which an extended CIDR block is configured. If no extended CIDR blocks are configured for the anti-DDoS diversion instance, this parameter is left empty.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX/22</p>
             */
            public Builder netMain(String netMain) {
                this.netMain = netMain;
                return this;
            }

            /**
             * <p>The type of the CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>ipv4</p>
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * <p>The review status. Valid values:</p>
             * <ul>
             * <li><p>0: not reviewed.</p>
             * </li>
             * <li><p>1: reviewed.</p>
             * </li>
             * <li><p>2: under review.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder permit(Integer permit) {
                this.permit = permit;
                return this;
            }

            /**
             * <p>The ID of the anti-DDoS diversion instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ddos_diversion_public_cn-xxxxxxxxxxxxx</p>
             */
            public Builder saleId(String saleId) {
                this.saleId = saleId;
                return this;
            }

            /**
             * <p>The reinjection type. Valid values:</p>
             * <ul>
             * <li><p>aliyun_line</p>
             * </li>
             * <li><p>pccw_line</p>
             * </li>
             * <li><p>gre_line</p>
             * </li>
             * <li><p>private_line</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>aliyun_line</p>
             */
            public Builder upstreamType(String upstreamType) {
                this.upstreamType = upstreamType;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>57690941xxxxxxxx</p>
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
    /**
     * 
     * {@link QueryNetListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryNetListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Nets")
        private java.util.List<Nets> nets;

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
        public java.util.List<Nets> getNets() {
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
            private java.util.List<Nets> nets; 
            private Long num; 
            private Long page; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.nets = model.nets;
                this.num = model.num;
                this.page = model.page;
                this.total = model.total;
            } 

            /**
             * <p>The CIDR blocks.</p>
             */
            public Builder nets(java.util.List<Nets> nets) {
                this.nets = nets;
                return this;
            }

            /**
             * <p>The number of entries per page. Valid values: 1 to 100. Default value: 100.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder num(Long num) {
                this.num = num;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder page(Long page) {
                this.page = page;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
