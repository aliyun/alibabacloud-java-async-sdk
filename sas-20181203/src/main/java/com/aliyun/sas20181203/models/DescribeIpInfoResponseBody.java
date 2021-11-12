// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeIpInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIpInfoResponseBody</p>
 */
public class DescribeIpInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("c2_day_trace")
    private String c2DayTrace;

    @NameInMap("city")
    private String city;

    @NameInMap("country")
    private String country;

    @NameInMap("day_cnt_30d_tor")
    private String dayCnt30dTor;

    @NameInMap("day_cnt_30d_web_attack")
    private String dayCnt30dWebAttack;

    @NameInMap("day_cnt_7d_tor")
    private String dayCnt7dTor;

    @NameInMap("day_cnt_7d_web_attack")
    private String dayCnt7dWebAttack;

    @NameInMap("geo")
    private String geo;

    @NameInMap("gmt_first_c2")
    private String gmtFirstC2;

    @NameInMap("gmt_first_mining_pool")
    private String gmtFirstMiningPool;

    @NameInMap("gmt_last_c2")
    private String gmtLastC2;

    @NameInMap("gmt_last_malicious_login")
    private String gmtLastMaliciousLogin;

    @NameInMap("gmt_last_malicious_source")
    private String gmtLastMaliciousSource;

    @NameInMap("gmt_last_mining_pool")
    private String gmtLastMiningPool;

    @NameInMap("gmt_last_nat")
    private String gmtLastNat;

    @NameInMap("gmt_last_proxy")
    private String gmtLastProxy;

    @NameInMap("gmt_last_tor")
    private String gmtLastTor;

    @NameInMap("gmt_last_web_attack")
    private String gmtLastWebAttack;

    @NameInMap("idc_name")
    private String idcName;

    @NameInMap("ip")
    private String ip;

    @NameInMap("is_c2")
    private String isC2;

    @NameInMap("is_c2_1d")
    private String isC21d;

    @NameInMap("is_c2_7d")
    private String isC27d;

    @NameInMap("is_idc")
    private String isIdc;

    @NameInMap("is_malicious_login")
    private String isMaliciousLogin;

    @NameInMap("is_malicious_login_1d")
    private String isMaliciousLogin1d;

    @NameInMap("is_malicious_login_7d")
    private String isMaliciousLogin7d;

    @NameInMap("is_malicious_source")
    private String isMaliciousSource;

    @NameInMap("is_malicious_source_1d")
    private String isMaliciousSource1d;

    @NameInMap("is_malicious_source_30d")
    private String isMaliciousSource30d;

    @NameInMap("is_malicious_source_7d")
    private String isMaliciousSource7d;

    @NameInMap("is_mining_pool")
    private String isMiningPool;

    @NameInMap("is_mining_pool_1d")
    private String isMiningPool1d;

    @NameInMap("is_mining_pool_7d")
    private String isMiningPool7d;

    @NameInMap("is_nat")
    private String isNat;

    @NameInMap("is_nat_1d")
    private String isNat1d;

    @NameInMap("is_nat_7d")
    private String isNat7d;

    @NameInMap("is_proxy")
    private String isProxy;

    @NameInMap("is_proxy_1d")
    private String isProxy1d;

    @NameInMap("is_proxy_7d")
    private String isProxy7d;

    @NameInMap("is_tor")
    private String isTor;

    @NameInMap("is_tor_1d")
    private String isTor1d;

    @NameInMap("is_tor_7d")
    private String isTor7d;

    @NameInMap("is_web_attack")
    private String isWebAttack;

    @NameInMap("is_web_attack_1d")
    private String isWebAttack1d;

    @NameInMap("is_web_attack_30d")
    private String isWebAttack30d;

    @NameInMap("is_web_attack_7d")
    private String isWebAttack7d;

    @NameInMap("isp")
    private String isp;

    @NameInMap("malicious_login_day_trace")
    private String maliciousLoginDayTrace;

    @NameInMap("malicious_score")
    private String maliciousScore;

    @NameInMap("malicious_source_day_trace")
    private String maliciousSourceDayTrace;

    @NameInMap("mining_pool_day_trace")
    private String miningPoolDayTrace;

    @NameInMap("nat_day_trace")
    private String natDayTrace;

    @NameInMap("province")
    private String province;

    @NameInMap("proxy_day_trace")
    private String proxyDayTrace;

    @NameInMap("rdns")
    private String rdns;

    @NameInMap("tags")
    private String tags;

    @NameInMap("tor_day_trace")
    private String torDayTrace;

    @NameInMap("total_day_cnt_tor")
    private String totalDayCntTor;

    @NameInMap("total_day_cnt_web_attack")
    private String totalDayCntWebAttack;

    @NameInMap("web_attack_day_trace")
    private String webAttackDayTrace;


    private DescribeIpInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.c2DayTrace = builder.c2DayTrace;
        this.city = builder.city;
        this.country = builder.country;
        this.dayCnt30dTor = builder.dayCnt30dTor;
        this.dayCnt30dWebAttack = builder.dayCnt30dWebAttack;
        this.dayCnt7dTor = builder.dayCnt7dTor;
        this.dayCnt7dWebAttack = builder.dayCnt7dWebAttack;
        this.geo = builder.geo;
        this.gmtFirstC2 = builder.gmtFirstC2;
        this.gmtFirstMiningPool = builder.gmtFirstMiningPool;
        this.gmtLastC2 = builder.gmtLastC2;
        this.gmtLastMaliciousLogin = builder.gmtLastMaliciousLogin;
        this.gmtLastMaliciousSource = builder.gmtLastMaliciousSource;
        this.gmtLastMiningPool = builder.gmtLastMiningPool;
        this.gmtLastNat = builder.gmtLastNat;
        this.gmtLastProxy = builder.gmtLastProxy;
        this.gmtLastTor = builder.gmtLastTor;
        this.gmtLastWebAttack = builder.gmtLastWebAttack;
        this.idcName = builder.idcName;
        this.ip = builder.ip;
        this.isC2 = builder.isC2;
        this.isC21d = builder.isC21d;
        this.isC27d = builder.isC27d;
        this.isIdc = builder.isIdc;
        this.isMaliciousLogin = builder.isMaliciousLogin;
        this.isMaliciousLogin1d = builder.isMaliciousLogin1d;
        this.isMaliciousLogin7d = builder.isMaliciousLogin7d;
        this.isMaliciousSource = builder.isMaliciousSource;
        this.isMaliciousSource1d = builder.isMaliciousSource1d;
        this.isMaliciousSource30d = builder.isMaliciousSource30d;
        this.isMaliciousSource7d = builder.isMaliciousSource7d;
        this.isMiningPool = builder.isMiningPool;
        this.isMiningPool1d = builder.isMiningPool1d;
        this.isMiningPool7d = builder.isMiningPool7d;
        this.isNat = builder.isNat;
        this.isNat1d = builder.isNat1d;
        this.isNat7d = builder.isNat7d;
        this.isProxy = builder.isProxy;
        this.isProxy1d = builder.isProxy1d;
        this.isProxy7d = builder.isProxy7d;
        this.isTor = builder.isTor;
        this.isTor1d = builder.isTor1d;
        this.isTor7d = builder.isTor7d;
        this.isWebAttack = builder.isWebAttack;
        this.isWebAttack1d = builder.isWebAttack1d;
        this.isWebAttack30d = builder.isWebAttack30d;
        this.isWebAttack7d = builder.isWebAttack7d;
        this.isp = builder.isp;
        this.maliciousLoginDayTrace = builder.maliciousLoginDayTrace;
        this.maliciousScore = builder.maliciousScore;
        this.maliciousSourceDayTrace = builder.maliciousSourceDayTrace;
        this.miningPoolDayTrace = builder.miningPoolDayTrace;
        this.natDayTrace = builder.natDayTrace;
        this.province = builder.province;
        this.proxyDayTrace = builder.proxyDayTrace;
        this.rdns = builder.rdns;
        this.tags = builder.tags;
        this.torDayTrace = builder.torDayTrace;
        this.totalDayCntTor = builder.totalDayCntTor;
        this.totalDayCntWebAttack = builder.totalDayCntWebAttack;
        this.webAttackDayTrace = builder.webAttackDayTrace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIpInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return c2DayTrace
     */
    public String getC2DayTrace() {
        return this.c2DayTrace;
    }

    /**
     * @return city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * @return country
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * @return dayCnt30dTor
     */
    public String getDayCnt30dTor() {
        return this.dayCnt30dTor;
    }

    /**
     * @return dayCnt30dWebAttack
     */
    public String getDayCnt30dWebAttack() {
        return this.dayCnt30dWebAttack;
    }

    /**
     * @return dayCnt7dTor
     */
    public String getDayCnt7dTor() {
        return this.dayCnt7dTor;
    }

    /**
     * @return dayCnt7dWebAttack
     */
    public String getDayCnt7dWebAttack() {
        return this.dayCnt7dWebAttack;
    }

    /**
     * @return geo
     */
    public String getGeo() {
        return this.geo;
    }

    /**
     * @return gmtFirstC2
     */
    public String getGmtFirstC2() {
        return this.gmtFirstC2;
    }

    /**
     * @return gmtFirstMiningPool
     */
    public String getGmtFirstMiningPool() {
        return this.gmtFirstMiningPool;
    }

    /**
     * @return gmtLastC2
     */
    public String getGmtLastC2() {
        return this.gmtLastC2;
    }

    /**
     * @return gmtLastMaliciousLogin
     */
    public String getGmtLastMaliciousLogin() {
        return this.gmtLastMaliciousLogin;
    }

    /**
     * @return gmtLastMaliciousSource
     */
    public String getGmtLastMaliciousSource() {
        return this.gmtLastMaliciousSource;
    }

    /**
     * @return gmtLastMiningPool
     */
    public String getGmtLastMiningPool() {
        return this.gmtLastMiningPool;
    }

    /**
     * @return gmtLastNat
     */
    public String getGmtLastNat() {
        return this.gmtLastNat;
    }

    /**
     * @return gmtLastProxy
     */
    public String getGmtLastProxy() {
        return this.gmtLastProxy;
    }

    /**
     * @return gmtLastTor
     */
    public String getGmtLastTor() {
        return this.gmtLastTor;
    }

    /**
     * @return gmtLastWebAttack
     */
    public String getGmtLastWebAttack() {
        return this.gmtLastWebAttack;
    }

    /**
     * @return idcName
     */
    public String getIdcName() {
        return this.idcName;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return isC2
     */
    public String getIsC2() {
        return this.isC2;
    }

    /**
     * @return isC21d
     */
    public String getIsC21d() {
        return this.isC21d;
    }

    /**
     * @return isC27d
     */
    public String getIsC27d() {
        return this.isC27d;
    }

    /**
     * @return isIdc
     */
    public String getIsIdc() {
        return this.isIdc;
    }

    /**
     * @return isMaliciousLogin
     */
    public String getIsMaliciousLogin() {
        return this.isMaliciousLogin;
    }

    /**
     * @return isMaliciousLogin1d
     */
    public String getIsMaliciousLogin1d() {
        return this.isMaliciousLogin1d;
    }

    /**
     * @return isMaliciousLogin7d
     */
    public String getIsMaliciousLogin7d() {
        return this.isMaliciousLogin7d;
    }

    /**
     * @return isMaliciousSource
     */
    public String getIsMaliciousSource() {
        return this.isMaliciousSource;
    }

    /**
     * @return isMaliciousSource1d
     */
    public String getIsMaliciousSource1d() {
        return this.isMaliciousSource1d;
    }

    /**
     * @return isMaliciousSource30d
     */
    public String getIsMaliciousSource30d() {
        return this.isMaliciousSource30d;
    }

    /**
     * @return isMaliciousSource7d
     */
    public String getIsMaliciousSource7d() {
        return this.isMaliciousSource7d;
    }

    /**
     * @return isMiningPool
     */
    public String getIsMiningPool() {
        return this.isMiningPool;
    }

    /**
     * @return isMiningPool1d
     */
    public String getIsMiningPool1d() {
        return this.isMiningPool1d;
    }

    /**
     * @return isMiningPool7d
     */
    public String getIsMiningPool7d() {
        return this.isMiningPool7d;
    }

    /**
     * @return isNat
     */
    public String getIsNat() {
        return this.isNat;
    }

    /**
     * @return isNat1d
     */
    public String getIsNat1d() {
        return this.isNat1d;
    }

    /**
     * @return isNat7d
     */
    public String getIsNat7d() {
        return this.isNat7d;
    }

    /**
     * @return isProxy
     */
    public String getIsProxy() {
        return this.isProxy;
    }

    /**
     * @return isProxy1d
     */
    public String getIsProxy1d() {
        return this.isProxy1d;
    }

    /**
     * @return isProxy7d
     */
    public String getIsProxy7d() {
        return this.isProxy7d;
    }

    /**
     * @return isTor
     */
    public String getIsTor() {
        return this.isTor;
    }

    /**
     * @return isTor1d
     */
    public String getIsTor1d() {
        return this.isTor1d;
    }

    /**
     * @return isTor7d
     */
    public String getIsTor7d() {
        return this.isTor7d;
    }

    /**
     * @return isWebAttack
     */
    public String getIsWebAttack() {
        return this.isWebAttack;
    }

    /**
     * @return isWebAttack1d
     */
    public String getIsWebAttack1d() {
        return this.isWebAttack1d;
    }

    /**
     * @return isWebAttack30d
     */
    public String getIsWebAttack30d() {
        return this.isWebAttack30d;
    }

    /**
     * @return isWebAttack7d
     */
    public String getIsWebAttack7d() {
        return this.isWebAttack7d;
    }

    /**
     * @return isp
     */
    public String getIsp() {
        return this.isp;
    }

    /**
     * @return maliciousLoginDayTrace
     */
    public String getMaliciousLoginDayTrace() {
        return this.maliciousLoginDayTrace;
    }

    /**
     * @return maliciousScore
     */
    public String getMaliciousScore() {
        return this.maliciousScore;
    }

    /**
     * @return maliciousSourceDayTrace
     */
    public String getMaliciousSourceDayTrace() {
        return this.maliciousSourceDayTrace;
    }

    /**
     * @return miningPoolDayTrace
     */
    public String getMiningPoolDayTrace() {
        return this.miningPoolDayTrace;
    }

    /**
     * @return natDayTrace
     */
    public String getNatDayTrace() {
        return this.natDayTrace;
    }

    /**
     * @return province
     */
    public String getProvince() {
        return this.province;
    }

    /**
     * @return proxyDayTrace
     */
    public String getProxyDayTrace() {
        return this.proxyDayTrace;
    }

    /**
     * @return rdns
     */
    public String getRdns() {
        return this.rdns;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    /**
     * @return torDayTrace
     */
    public String getTorDayTrace() {
        return this.torDayTrace;
    }

    /**
     * @return totalDayCntTor
     */
    public String getTotalDayCntTor() {
        return this.totalDayCntTor;
    }

    /**
     * @return totalDayCntWebAttack
     */
    public String getTotalDayCntWebAttack() {
        return this.totalDayCntWebAttack;
    }

    /**
     * @return webAttackDayTrace
     */
    public String getWebAttackDayTrace() {
        return this.webAttackDayTrace;
    }

    public static final class Builder {
        private String requestId; 
        private String c2DayTrace; 
        private String city; 
        private String country; 
        private String dayCnt30dTor; 
        private String dayCnt30dWebAttack; 
        private String dayCnt7dTor; 
        private String dayCnt7dWebAttack; 
        private String geo; 
        private String gmtFirstC2; 
        private String gmtFirstMiningPool; 
        private String gmtLastC2; 
        private String gmtLastMaliciousLogin; 
        private String gmtLastMaliciousSource; 
        private String gmtLastMiningPool; 
        private String gmtLastNat; 
        private String gmtLastProxy; 
        private String gmtLastTor; 
        private String gmtLastWebAttack; 
        private String idcName; 
        private String ip; 
        private String isC2; 
        private String isC21d; 
        private String isC27d; 
        private String isIdc; 
        private String isMaliciousLogin; 
        private String isMaliciousLogin1d; 
        private String isMaliciousLogin7d; 
        private String isMaliciousSource; 
        private String isMaliciousSource1d; 
        private String isMaliciousSource30d; 
        private String isMaliciousSource7d; 
        private String isMiningPool; 
        private String isMiningPool1d; 
        private String isMiningPool7d; 
        private String isNat; 
        private String isNat1d; 
        private String isNat7d; 
        private String isProxy; 
        private String isProxy1d; 
        private String isProxy7d; 
        private String isTor; 
        private String isTor1d; 
        private String isTor7d; 
        private String isWebAttack; 
        private String isWebAttack1d; 
        private String isWebAttack30d; 
        private String isWebAttack7d; 
        private String isp; 
        private String maliciousLoginDayTrace; 
        private String maliciousScore; 
        private String maliciousSourceDayTrace; 
        private String miningPoolDayTrace; 
        private String natDayTrace; 
        private String province; 
        private String proxyDayTrace; 
        private String rdns; 
        private String tags; 
        private String torDayTrace; 
        private String totalDayCntTor; 
        private String totalDayCntWebAttack; 
        private String webAttackDayTrace; 

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>c2_day_trace.</p>
         */
        public Builder c2DayTrace(String c2DayTrace) {
            this.c2DayTrace = c2DayTrace;
            return this;
        }

        /**
         * <p>city.</p>
         */
        public Builder city(String city) {
            this.city = city;
            return this;
        }

        /**
         * <p>country.</p>
         */
        public Builder country(String country) {
            this.country = country;
            return this;
        }

        /**
         * <p>day_cnt_30d_tor.</p>
         */
        public Builder dayCnt30dTor(String dayCnt30dTor) {
            this.dayCnt30dTor = dayCnt30dTor;
            return this;
        }

        /**
         * <p>day_cnt_30d_web_attack.</p>
         */
        public Builder dayCnt30dWebAttack(String dayCnt30dWebAttack) {
            this.dayCnt30dWebAttack = dayCnt30dWebAttack;
            return this;
        }

        /**
         * <p>day_cnt_7d_tor.</p>
         */
        public Builder dayCnt7dTor(String dayCnt7dTor) {
            this.dayCnt7dTor = dayCnt7dTor;
            return this;
        }

        /**
         * <p>day_cnt_7d_web_attack.</p>
         */
        public Builder dayCnt7dWebAttack(String dayCnt7dWebAttack) {
            this.dayCnt7dWebAttack = dayCnt7dWebAttack;
            return this;
        }

        /**
         * <p>geo.</p>
         */
        public Builder geo(String geo) {
            this.geo = geo;
            return this;
        }

        /**
         * <p>gmt_first_c2.</p>
         */
        public Builder gmtFirstC2(String gmtFirstC2) {
            this.gmtFirstC2 = gmtFirstC2;
            return this;
        }

        /**
         * <p>gmt_first_mining_pool.</p>
         */
        public Builder gmtFirstMiningPool(String gmtFirstMiningPool) {
            this.gmtFirstMiningPool = gmtFirstMiningPool;
            return this;
        }

        /**
         * <p>gmt_last_c2.</p>
         */
        public Builder gmtLastC2(String gmtLastC2) {
            this.gmtLastC2 = gmtLastC2;
            return this;
        }

        /**
         * <p>gmt_last_malicious_login.</p>
         */
        public Builder gmtLastMaliciousLogin(String gmtLastMaliciousLogin) {
            this.gmtLastMaliciousLogin = gmtLastMaliciousLogin;
            return this;
        }

        /**
         * <p>gmt_last_malicious_source.</p>
         */
        public Builder gmtLastMaliciousSource(String gmtLastMaliciousSource) {
            this.gmtLastMaliciousSource = gmtLastMaliciousSource;
            return this;
        }

        /**
         * <p>gmt_last_mining_pool.</p>
         */
        public Builder gmtLastMiningPool(String gmtLastMiningPool) {
            this.gmtLastMiningPool = gmtLastMiningPool;
            return this;
        }

        /**
         * <p>gmt_last_nat.</p>
         */
        public Builder gmtLastNat(String gmtLastNat) {
            this.gmtLastNat = gmtLastNat;
            return this;
        }

        /**
         * <p>gmt_last_proxy.</p>
         */
        public Builder gmtLastProxy(String gmtLastProxy) {
            this.gmtLastProxy = gmtLastProxy;
            return this;
        }

        /**
         * <p>gmt_last_tor.</p>
         */
        public Builder gmtLastTor(String gmtLastTor) {
            this.gmtLastTor = gmtLastTor;
            return this;
        }

        /**
         * <p>gmt_last_web_attack.</p>
         */
        public Builder gmtLastWebAttack(String gmtLastWebAttack) {
            this.gmtLastWebAttack = gmtLastWebAttack;
            return this;
        }

        /**
         * <p>idc_name.</p>
         */
        public Builder idcName(String idcName) {
            this.idcName = idcName;
            return this;
        }

        /**
         * <p>ip.</p>
         */
        public Builder ip(String ip) {
            this.ip = ip;
            return this;
        }

        /**
         * <p>is_c2.</p>
         */
        public Builder isC2(String isC2) {
            this.isC2 = isC2;
            return this;
        }

        /**
         * <p>is_c2_1d.</p>
         */
        public Builder isC21d(String isC21d) {
            this.isC21d = isC21d;
            return this;
        }

        /**
         * <p>is_c2_7d.</p>
         */
        public Builder isC27d(String isC27d) {
            this.isC27d = isC27d;
            return this;
        }

        /**
         * <p>is_idc.</p>
         */
        public Builder isIdc(String isIdc) {
            this.isIdc = isIdc;
            return this;
        }

        /**
         * <p>is_malicious_login.</p>
         */
        public Builder isMaliciousLogin(String isMaliciousLogin) {
            this.isMaliciousLogin = isMaliciousLogin;
            return this;
        }

        /**
         * <p>is_malicious_login_1d.</p>
         */
        public Builder isMaliciousLogin1d(String isMaliciousLogin1d) {
            this.isMaliciousLogin1d = isMaliciousLogin1d;
            return this;
        }

        /**
         * <p>is_malicious_login_7d.</p>
         */
        public Builder isMaliciousLogin7d(String isMaliciousLogin7d) {
            this.isMaliciousLogin7d = isMaliciousLogin7d;
            return this;
        }

        /**
         * <p>is_malicious_source.</p>
         */
        public Builder isMaliciousSource(String isMaliciousSource) {
            this.isMaliciousSource = isMaliciousSource;
            return this;
        }

        /**
         * <p>is_malicious_source_1d.</p>
         */
        public Builder isMaliciousSource1d(String isMaliciousSource1d) {
            this.isMaliciousSource1d = isMaliciousSource1d;
            return this;
        }

        /**
         * <p>is_malicious_source_30d.</p>
         */
        public Builder isMaliciousSource30d(String isMaliciousSource30d) {
            this.isMaliciousSource30d = isMaliciousSource30d;
            return this;
        }

        /**
         * <p>is_malicious_source_7d.</p>
         */
        public Builder isMaliciousSource7d(String isMaliciousSource7d) {
            this.isMaliciousSource7d = isMaliciousSource7d;
            return this;
        }

        /**
         * <p>is_mining_pool.</p>
         */
        public Builder isMiningPool(String isMiningPool) {
            this.isMiningPool = isMiningPool;
            return this;
        }

        /**
         * <p>is_mining_pool_1d.</p>
         */
        public Builder isMiningPool1d(String isMiningPool1d) {
            this.isMiningPool1d = isMiningPool1d;
            return this;
        }

        /**
         * <p>is_mining_pool_7d.</p>
         */
        public Builder isMiningPool7d(String isMiningPool7d) {
            this.isMiningPool7d = isMiningPool7d;
            return this;
        }

        /**
         * <p>is_nat.</p>
         */
        public Builder isNat(String isNat) {
            this.isNat = isNat;
            return this;
        }

        /**
         * <p>is_nat_1d.</p>
         */
        public Builder isNat1d(String isNat1d) {
            this.isNat1d = isNat1d;
            return this;
        }

        /**
         * <p>is_nat_7d.</p>
         */
        public Builder isNat7d(String isNat7d) {
            this.isNat7d = isNat7d;
            return this;
        }

        /**
         * <p>is_proxy.</p>
         */
        public Builder isProxy(String isProxy) {
            this.isProxy = isProxy;
            return this;
        }

        /**
         * <p>is_proxy_1d.</p>
         */
        public Builder isProxy1d(String isProxy1d) {
            this.isProxy1d = isProxy1d;
            return this;
        }

        /**
         * <p>is_proxy_7d.</p>
         */
        public Builder isProxy7d(String isProxy7d) {
            this.isProxy7d = isProxy7d;
            return this;
        }

        /**
         * <p>is_tor.</p>
         */
        public Builder isTor(String isTor) {
            this.isTor = isTor;
            return this;
        }

        /**
         * <p>is_tor_1d.</p>
         */
        public Builder isTor1d(String isTor1d) {
            this.isTor1d = isTor1d;
            return this;
        }

        /**
         * <p>is_tor_7d.</p>
         */
        public Builder isTor7d(String isTor7d) {
            this.isTor7d = isTor7d;
            return this;
        }

        /**
         * <p>is_web_attack.</p>
         */
        public Builder isWebAttack(String isWebAttack) {
            this.isWebAttack = isWebAttack;
            return this;
        }

        /**
         * <p>is_web_attack_1d.</p>
         */
        public Builder isWebAttack1d(String isWebAttack1d) {
            this.isWebAttack1d = isWebAttack1d;
            return this;
        }

        /**
         * <p>is_web_attack_30d.</p>
         */
        public Builder isWebAttack30d(String isWebAttack30d) {
            this.isWebAttack30d = isWebAttack30d;
            return this;
        }

        /**
         * <p>is_web_attack_7d.</p>
         */
        public Builder isWebAttack7d(String isWebAttack7d) {
            this.isWebAttack7d = isWebAttack7d;
            return this;
        }

        /**
         * <p>isp.</p>
         */
        public Builder isp(String isp) {
            this.isp = isp;
            return this;
        }

        /**
         * <p>malicious_login_day_trace.</p>
         */
        public Builder maliciousLoginDayTrace(String maliciousLoginDayTrace) {
            this.maliciousLoginDayTrace = maliciousLoginDayTrace;
            return this;
        }

        /**
         * <p>malicious_score.</p>
         */
        public Builder maliciousScore(String maliciousScore) {
            this.maliciousScore = maliciousScore;
            return this;
        }

        /**
         * <p>malicious_source_day_trace.</p>
         */
        public Builder maliciousSourceDayTrace(String maliciousSourceDayTrace) {
            this.maliciousSourceDayTrace = maliciousSourceDayTrace;
            return this;
        }

        /**
         * <p>mining_pool_day_trace.</p>
         */
        public Builder miningPoolDayTrace(String miningPoolDayTrace) {
            this.miningPoolDayTrace = miningPoolDayTrace;
            return this;
        }

        /**
         * <p>nat_day_trace.</p>
         */
        public Builder natDayTrace(String natDayTrace) {
            this.natDayTrace = natDayTrace;
            return this;
        }

        /**
         * <p>province.</p>
         */
        public Builder province(String province) {
            this.province = province;
            return this;
        }

        /**
         * <p>proxy_day_trace.</p>
         */
        public Builder proxyDayTrace(String proxyDayTrace) {
            this.proxyDayTrace = proxyDayTrace;
            return this;
        }

        /**
         * <p>rdns.</p>
         */
        public Builder rdns(String rdns) {
            this.rdns = rdns;
            return this;
        }

        /**
         * <p>tags.</p>
         */
        public Builder tags(String tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>tor_day_trace.</p>
         */
        public Builder torDayTrace(String torDayTrace) {
            this.torDayTrace = torDayTrace;
            return this;
        }

        /**
         * <p>total_day_cnt_tor.</p>
         */
        public Builder totalDayCntTor(String totalDayCntTor) {
            this.totalDayCntTor = totalDayCntTor;
            return this;
        }

        /**
         * <p>total_day_cnt_web_attack.</p>
         */
        public Builder totalDayCntWebAttack(String totalDayCntWebAttack) {
            this.totalDayCntWebAttack = totalDayCntWebAttack;
            return this;
        }

        /**
         * <p>web_attack_day_trace.</p>
         */
        public Builder webAttackDayTrace(String webAttackDayTrace) {
            this.webAttackDayTrace = webAttackDayTrace;
            return this;
        }

        public DescribeIpInfoResponseBody build() {
            return new DescribeIpInfoResponseBody(this);
        } 

    } 

}
