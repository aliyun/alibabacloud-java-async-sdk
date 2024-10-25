// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSyntheticProbeListRequest} extends {@link RequestModel}
 *
 * <p>DescribeSyntheticProbeListRequest</p>
 */
public class DescribeSyntheticProbeListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("City")
    private String city;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdcProbe")
    private Boolean idcProbe;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv4")
    private Boolean ipv4;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv6")
    private Boolean ipv6;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Isp")
    private String isp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LmProbe")
    private Boolean lmProbe;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MbProbe")
    private Boolean mbProbe;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ViewAll")
    private Boolean viewAll;

    private DescribeSyntheticProbeListRequest(Builder builder) {
        super(builder);
        this.city = builder.city;
        this.idcProbe = builder.idcProbe;
        this.ipv4 = builder.ipv4;
        this.ipv6 = builder.ipv6;
        this.isp = builder.isp;
        this.lmProbe = builder.lmProbe;
        this.mbProbe = builder.mbProbe;
        this.viewAll = builder.viewAll;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSyntheticProbeListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * @return idcProbe
     */
    public Boolean getIdcProbe() {
        return this.idcProbe;
    }

    /**
     * @return ipv4
     */
    public Boolean getIpv4() {
        return this.ipv4;
    }

    /**
     * @return ipv6
     */
    public Boolean getIpv6() {
        return this.ipv6;
    }

    /**
     * @return isp
     */
    public String getIsp() {
        return this.isp;
    }

    /**
     * @return lmProbe
     */
    public Boolean getLmProbe() {
        return this.lmProbe;
    }

    /**
     * @return mbProbe
     */
    public Boolean getMbProbe() {
        return this.mbProbe;
    }

    /**
     * @return viewAll
     */
    public Boolean getViewAll() {
        return this.viewAll;
    }

    public static final class Builder extends Request.Builder<DescribeSyntheticProbeListRequest, Builder> {
        private String city; 
        private Boolean idcProbe; 
        private Boolean ipv4; 
        private Boolean ipv6; 
        private String isp; 
        private Boolean lmProbe; 
        private Boolean mbProbe; 
        private Boolean viewAll; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSyntheticProbeListRequest request) {
            super(request);
            this.city = request.city;
            this.idcProbe = request.idcProbe;
            this.ipv4 = request.ipv4;
            this.ipv6 = request.ipv6;
            this.isp = request.isp;
            this.lmProbe = request.lmProbe;
            this.mbProbe = request.mbProbe;
            this.viewAll = request.viewAll;
        } 

        /**
         * City.
         */
        public Builder city(String city) {
            this.putQueryParameter("City", city);
            this.city = city;
            return this;
        }

        /**
         * IdcProbe.
         */
        public Builder idcProbe(Boolean idcProbe) {
            this.putQueryParameter("IdcProbe", idcProbe);
            this.idcProbe = idcProbe;
            return this;
        }

        /**
         * Ipv4.
         */
        public Builder ipv4(Boolean ipv4) {
            this.putQueryParameter("Ipv4", ipv4);
            this.ipv4 = ipv4;
            return this;
        }

        /**
         * Ipv6.
         */
        public Builder ipv6(Boolean ipv6) {
            this.putQueryParameter("Ipv6", ipv6);
            this.ipv6 = ipv6;
            return this;
        }

        /**
         * Isp.
         */
        public Builder isp(String isp) {
            this.putQueryParameter("Isp", isp);
            this.isp = isp;
            return this;
        }

        /**
         * LmProbe.
         */
        public Builder lmProbe(Boolean lmProbe) {
            this.putQueryParameter("LmProbe", lmProbe);
            this.lmProbe = lmProbe;
            return this;
        }

        /**
         * MbProbe.
         */
        public Builder mbProbe(Boolean mbProbe) {
            this.putQueryParameter("MbProbe", mbProbe);
            this.mbProbe = mbProbe;
            return this;
        }

        /**
         * ViewAll.
         */
        public Builder viewAll(Boolean viewAll) {
            this.putQueryParameter("ViewAll", viewAll);
            this.viewAll = viewAll;
            return this;
        }

        @Override
        public DescribeSyntheticProbeListRequest build() {
            return new DescribeSyntheticProbeListRequest(this);
        } 

    } 

}
