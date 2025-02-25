// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antirisk20221128.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListChannelRiskDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>ListChannelRiskDetailsResponseBody</p>
 */
public class ListChannelRiskDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private ListChannelRiskDetailsResponseBody(Builder builder) {
        this.msg = builder.msg;
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChannelRiskDetailsResponseBody create() {
        return builder().build();
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
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
        private String msg; 
        private Long code; 
        private Data data; 
        private String requestId; 
        private Boolean success; 

        /**
         * Msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * code.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListChannelRiskDetailsResponseBody build() {
            return new ListChannelRiskDetailsResponseBody(this);
        } 

    } 

    public static class RiskDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("an")
        private String an;

        @com.aliyun.core.annotation.NameInMap("av")
        private String av;

        @com.aliyun.core.annotation.NameInMap("bn")
        private String bn;

        @com.aliyun.core.annotation.NameInMap("c")
        private String c;

        @com.aliyun.core.annotation.NameInMap("date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("fd")
        private String fd;

        @com.aliyun.core.annotation.NameInMap("idfa")
        private String idfa;

        @com.aliyun.core.annotation.NameInMap("jb")
        private String jb;

        @com.aliyun.core.annotation.NameInMap("oaid")
        private String oaid;

        @com.aliyun.core.annotation.NameInMap("py")
        private String py;

        @com.aliyun.core.annotation.NameInMap("rl")
        private String rl;

        @com.aliyun.core.annotation.NameInMap("rs")
        private String rs;

        @com.aliyun.core.annotation.NameInMap("zid")
        private String zid;

        private RiskDetails(Builder builder) {
            this.an = builder.an;
            this.av = builder.av;
            this.bn = builder.bn;
            this.c = builder.c;
            this.date = builder.date;
            this.fd = builder.fd;
            this.idfa = builder.idfa;
            this.jb = builder.jb;
            this.oaid = builder.oaid;
            this.py = builder.py;
            this.rl = builder.rl;
            this.rs = builder.rs;
            this.zid = builder.zid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskDetails create() {
            return builder().build();
        }

        /**
         * @return an
         */
        public String getAn() {
            return this.an;
        }

        /**
         * @return av
         */
        public String getAv() {
            return this.av;
        }

        /**
         * @return bn
         */
        public String getBn() {
            return this.bn;
        }

        /**
         * @return c
         */
        public String getC() {
            return this.c;
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return fd
         */
        public String getFd() {
            return this.fd;
        }

        /**
         * @return idfa
         */
        public String getIdfa() {
            return this.idfa;
        }

        /**
         * @return jb
         */
        public String getJb() {
            return this.jb;
        }

        /**
         * @return oaid
         */
        public String getOaid() {
            return this.oaid;
        }

        /**
         * @return py
         */
        public String getPy() {
            return this.py;
        }

        /**
         * @return rl
         */
        public String getRl() {
            return this.rl;
        }

        /**
         * @return rs
         */
        public String getRs() {
            return this.rs;
        }

        /**
         * @return zid
         */
        public String getZid() {
            return this.zid;
        }

        public static final class Builder {
            private String an; 
            private String av; 
            private String bn; 
            private String c; 
            private String date; 
            private String fd; 
            private String idfa; 
            private String jb; 
            private String oaid; 
            private String py; 
            private String rl; 
            private String rs; 
            private String zid; 

            /**
             * an.
             */
            public Builder an(String an) {
                this.an = an;
                return this;
            }

            /**
             * av.
             */
            public Builder av(String av) {
                this.av = av;
                return this;
            }

            /**
             * bn.
             */
            public Builder bn(String bn) {
                this.bn = bn;
                return this;
            }

            /**
             * c.
             */
            public Builder c(String c) {
                this.c = c;
                return this;
            }

            /**
             * date.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * fd.
             */
            public Builder fd(String fd) {
                this.fd = fd;
                return this;
            }

            /**
             * idfa.
             */
            public Builder idfa(String idfa) {
                this.idfa = idfa;
                return this;
            }

            /**
             * jb.
             */
            public Builder jb(String jb) {
                this.jb = jb;
                return this;
            }

            /**
             * oaid.
             */
            public Builder oaid(String oaid) {
                this.oaid = oaid;
                return this;
            }

            /**
             * py.
             */
            public Builder py(String py) {
                this.py = py;
                return this;
            }

            /**
             * rl.
             */
            public Builder rl(String rl) {
                this.rl = rl;
                return this;
            }

            /**
             * rs.
             */
            public Builder rs(String rs) {
                this.rs = rs;
                return this;
            }

            /**
             * zid.
             */
            public Builder zid(String zid) {
                this.zid = zid;
                return this;
            }

            public RiskDetails build() {
                return new RiskDetails(this);
            } 

        } 

    }
    public static class RiskSumary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("riskZidEmuDistinctNew")
        private String riskZidEmuDistinctNew;

        private RiskSumary(Builder builder) {
            this.date = builder.date;
            this.riskZidEmuDistinctNew = builder.riskZidEmuDistinctNew;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskSumary create() {
            return builder().build();
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return riskZidEmuDistinctNew
         */
        public String getRiskZidEmuDistinctNew() {
            return this.riskZidEmuDistinctNew;
        }

        public static final class Builder {
            private String date; 
            private String riskZidEmuDistinctNew; 

            /**
             * date.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * riskZidEmuDistinctNew.
             */
            public Builder riskZidEmuDistinctNew(String riskZidEmuDistinctNew) {
                this.riskZidEmuDistinctNew = riskZidEmuDistinctNew;
                return this;
            }

            public RiskSumary build() {
                return new RiskSumary(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("riskDetails")
        private java.util.List < RiskDetails> riskDetails;

        @com.aliyun.core.annotation.NameInMap("riskSumary")
        private java.util.List < RiskSumary> riskSumary;

        private Data(Builder builder) {
            this.riskDetails = builder.riskDetails;
            this.riskSumary = builder.riskSumary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return riskDetails
         */
        public java.util.List < RiskDetails> getRiskDetails() {
            return this.riskDetails;
        }

        /**
         * @return riskSumary
         */
        public java.util.List < RiskSumary> getRiskSumary() {
            return this.riskSumary;
        }

        public static final class Builder {
            private java.util.List < RiskDetails> riskDetails; 
            private java.util.List < RiskSumary> riskSumary; 

            /**
             * riskDetails.
             */
            public Builder riskDetails(java.util.List < RiskDetails> riskDetails) {
                this.riskDetails = riskDetails;
                return this;
            }

            /**
             * riskSumary.
             */
            public Builder riskSumary(java.util.List < RiskSumary> riskSumary) {
                this.riskSumary = riskSumary;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
