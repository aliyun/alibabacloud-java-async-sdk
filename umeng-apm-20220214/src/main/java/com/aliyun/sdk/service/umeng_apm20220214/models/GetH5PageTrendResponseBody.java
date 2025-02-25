// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_apm20220214.models;

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
 * {@link GetH5PageTrendResponseBody} extends {@link TeaModel}
 *
 * <p>GetH5PageTrendResponseBody</p>
 */
public class GetH5PageTrendResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetH5PageTrendResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetH5PageTrendResponseBody create() {
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
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long code; 
        private java.util.List<Data> data; 
        private String msg; 
        private Boolean success; 

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
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetH5PageTrendResponseBody build() {
            return new GetH5PageTrendResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetH5PageTrendResponseBody} extends {@link TeaModel}
     *
     * <p>GetH5PageTrendResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("analyzeDOM")
        private Double analyzeDOM;

        @com.aliyun.core.annotation.NameInMap("appCache")
        private Double appCache;

        @com.aliyun.core.annotation.NameInMap("contentTrans")
        private Double contentTrans;

        @com.aliyun.core.annotation.NameInMap("dns")
        private Double dns;

        @com.aliyun.core.annotation.NameInMap("domReady")
        private Double domReady;

        @com.aliyun.core.annotation.NameInMap("fcp")
        private Double fcp;

        @com.aliyun.core.annotation.NameInMap("firstByte")
        private Double firstByte;

        @com.aliyun.core.annotation.NameInMap("fiveSecondRate")
        private Double fiveSecondRate;

        @com.aliyun.core.annotation.NameInMap("fp")
        private Double fp;

        @com.aliyun.core.annotation.NameInMap("loadEvent")
        private Double loadEvent;

        @com.aliyun.core.annotation.NameInMap("loadFinish")
        private Double loadFinish;

        @com.aliyun.core.annotation.NameInMap("loadResource")
        private Double loadResource;

        @com.aliyun.core.annotation.NameInMap("logCnt")
        private Long logCnt;

        @com.aliyun.core.annotation.NameInMap("oneSecondRate")
        private Double oneSecondRate;

        @com.aliyun.core.annotation.NameInMap("redirect")
        private Double redirect;

        @com.aliyun.core.annotation.NameInMap("ssl")
        private Double ssl;

        @com.aliyun.core.annotation.NameInMap("tcp")
        private Double tcp;

        @com.aliyun.core.annotation.NameInMap("timePoint")
        private String timePoint;

        @com.aliyun.core.annotation.NameInMap("ttfb")
        private Double ttfb;

        @com.aliyun.core.annotation.NameInMap("tti")
        private Double tti;

        @com.aliyun.core.annotation.NameInMap("twoSecondRate")
        private Double twoSecondRate;

        @com.aliyun.core.annotation.NameInMap("unload")
        private Double unload;

        private Data(Builder builder) {
            this.analyzeDOM = builder.analyzeDOM;
            this.appCache = builder.appCache;
            this.contentTrans = builder.contentTrans;
            this.dns = builder.dns;
            this.domReady = builder.domReady;
            this.fcp = builder.fcp;
            this.firstByte = builder.firstByte;
            this.fiveSecondRate = builder.fiveSecondRate;
            this.fp = builder.fp;
            this.loadEvent = builder.loadEvent;
            this.loadFinish = builder.loadFinish;
            this.loadResource = builder.loadResource;
            this.logCnt = builder.logCnt;
            this.oneSecondRate = builder.oneSecondRate;
            this.redirect = builder.redirect;
            this.ssl = builder.ssl;
            this.tcp = builder.tcp;
            this.timePoint = builder.timePoint;
            this.ttfb = builder.ttfb;
            this.tti = builder.tti;
            this.twoSecondRate = builder.twoSecondRate;
            this.unload = builder.unload;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return analyzeDOM
         */
        public Double getAnalyzeDOM() {
            return this.analyzeDOM;
        }

        /**
         * @return appCache
         */
        public Double getAppCache() {
            return this.appCache;
        }

        /**
         * @return contentTrans
         */
        public Double getContentTrans() {
            return this.contentTrans;
        }

        /**
         * @return dns
         */
        public Double getDns() {
            return this.dns;
        }

        /**
         * @return domReady
         */
        public Double getDomReady() {
            return this.domReady;
        }

        /**
         * @return fcp
         */
        public Double getFcp() {
            return this.fcp;
        }

        /**
         * @return firstByte
         */
        public Double getFirstByte() {
            return this.firstByte;
        }

        /**
         * @return fiveSecondRate
         */
        public Double getFiveSecondRate() {
            return this.fiveSecondRate;
        }

        /**
         * @return fp
         */
        public Double getFp() {
            return this.fp;
        }

        /**
         * @return loadEvent
         */
        public Double getLoadEvent() {
            return this.loadEvent;
        }

        /**
         * @return loadFinish
         */
        public Double getLoadFinish() {
            return this.loadFinish;
        }

        /**
         * @return loadResource
         */
        public Double getLoadResource() {
            return this.loadResource;
        }

        /**
         * @return logCnt
         */
        public Long getLogCnt() {
            return this.logCnt;
        }

        /**
         * @return oneSecondRate
         */
        public Double getOneSecondRate() {
            return this.oneSecondRate;
        }

        /**
         * @return redirect
         */
        public Double getRedirect() {
            return this.redirect;
        }

        /**
         * @return ssl
         */
        public Double getSsl() {
            return this.ssl;
        }

        /**
         * @return tcp
         */
        public Double getTcp() {
            return this.tcp;
        }

        /**
         * @return timePoint
         */
        public String getTimePoint() {
            return this.timePoint;
        }

        /**
         * @return ttfb
         */
        public Double getTtfb() {
            return this.ttfb;
        }

        /**
         * @return tti
         */
        public Double getTti() {
            return this.tti;
        }

        /**
         * @return twoSecondRate
         */
        public Double getTwoSecondRate() {
            return this.twoSecondRate;
        }

        /**
         * @return unload
         */
        public Double getUnload() {
            return this.unload;
        }

        public static final class Builder {
            private Double analyzeDOM; 
            private Double appCache; 
            private Double contentTrans; 
            private Double dns; 
            private Double domReady; 
            private Double fcp; 
            private Double firstByte; 
            private Double fiveSecondRate; 
            private Double fp; 
            private Double loadEvent; 
            private Double loadFinish; 
            private Double loadResource; 
            private Long logCnt; 
            private Double oneSecondRate; 
            private Double redirect; 
            private Double ssl; 
            private Double tcp; 
            private String timePoint; 
            private Double ttfb; 
            private Double tti; 
            private Double twoSecondRate; 
            private Double unload; 

            /**
             * analyzeDOM.
             */
            public Builder analyzeDOM(Double analyzeDOM) {
                this.analyzeDOM = analyzeDOM;
                return this;
            }

            /**
             * appCache.
             */
            public Builder appCache(Double appCache) {
                this.appCache = appCache;
                return this;
            }

            /**
             * contentTrans.
             */
            public Builder contentTrans(Double contentTrans) {
                this.contentTrans = contentTrans;
                return this;
            }

            /**
             * dns.
             */
            public Builder dns(Double dns) {
                this.dns = dns;
                return this;
            }

            /**
             * domReady.
             */
            public Builder domReady(Double domReady) {
                this.domReady = domReady;
                return this;
            }

            /**
             * fcp.
             */
            public Builder fcp(Double fcp) {
                this.fcp = fcp;
                return this;
            }

            /**
             * firstByte.
             */
            public Builder firstByte(Double firstByte) {
                this.firstByte = firstByte;
                return this;
            }

            /**
             * fiveSecondRate.
             */
            public Builder fiveSecondRate(Double fiveSecondRate) {
                this.fiveSecondRate = fiveSecondRate;
                return this;
            }

            /**
             * fp.
             */
            public Builder fp(Double fp) {
                this.fp = fp;
                return this;
            }

            /**
             * loadEvent.
             */
            public Builder loadEvent(Double loadEvent) {
                this.loadEvent = loadEvent;
                return this;
            }

            /**
             * loadFinish.
             */
            public Builder loadFinish(Double loadFinish) {
                this.loadFinish = loadFinish;
                return this;
            }

            /**
             * loadResource.
             */
            public Builder loadResource(Double loadResource) {
                this.loadResource = loadResource;
                return this;
            }

            /**
             * logCnt.
             */
            public Builder logCnt(Long logCnt) {
                this.logCnt = logCnt;
                return this;
            }

            /**
             * oneSecondRate.
             */
            public Builder oneSecondRate(Double oneSecondRate) {
                this.oneSecondRate = oneSecondRate;
                return this;
            }

            /**
             * redirect.
             */
            public Builder redirect(Double redirect) {
                this.redirect = redirect;
                return this;
            }

            /**
             * ssl.
             */
            public Builder ssl(Double ssl) {
                this.ssl = ssl;
                return this;
            }

            /**
             * tcp.
             */
            public Builder tcp(Double tcp) {
                this.tcp = tcp;
                return this;
            }

            /**
             * timePoint.
             */
            public Builder timePoint(String timePoint) {
                this.timePoint = timePoint;
                return this;
            }

            /**
             * ttfb.
             */
            public Builder ttfb(Double ttfb) {
                this.ttfb = ttfb;
                return this;
            }

            /**
             * tti.
             */
            public Builder tti(Double tti) {
                this.tti = tti;
                return this;
            }

            /**
             * twoSecondRate.
             */
            public Builder twoSecondRate(Double twoSecondRate) {
                this.twoSecondRate = twoSecondRate;
                return this;
            }

            /**
             * unload.
             */
            public Builder unload(Double unload) {
                this.unload = unload;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
