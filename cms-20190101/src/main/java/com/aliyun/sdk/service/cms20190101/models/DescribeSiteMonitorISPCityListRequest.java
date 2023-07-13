// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSiteMonitorISPCityListRequest} extends {@link RequestModel}
 *
 * <p>DescribeSiteMonitorISPCityListRequest</p>
 */
public class DescribeSiteMonitorISPCityListRequest extends Request {
    @Query
    @NameInMap("City")
    private String city;

    @Query
    @NameInMap("IPV4")
    private Boolean IPV4;

    @Query
    @NameInMap("IPV6")
    private Boolean IPV6;

    @Query
    @NameInMap("Isp")
    private String isp;

    @Query
    @NameInMap("ViewAll")
    private Boolean viewAll;

    private DescribeSiteMonitorISPCityListRequest(Builder builder) {
        super(builder);
        this.city = builder.city;
        this.IPV4 = builder.IPV4;
        this.IPV6 = builder.IPV6;
        this.isp = builder.isp;
        this.viewAll = builder.viewAll;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSiteMonitorISPCityListRequest create() {
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
     * @return IPV4
     */
    public Boolean getIPV4() {
        return this.IPV4;
    }

    /**
     * @return IPV6
     */
    public Boolean getIPV6() {
        return this.IPV6;
    }

    /**
     * @return isp
     */
    public String getIsp() {
        return this.isp;
    }

    /**
     * @return viewAll
     */
    public Boolean getViewAll() {
        return this.viewAll;
    }

    public static final class Builder extends Request.Builder<DescribeSiteMonitorISPCityListRequest, Builder> {
        private String city; 
        private Boolean IPV4; 
        private Boolean IPV6; 
        private String isp; 
        private Boolean viewAll; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSiteMonitorISPCityListRequest request) {
            super(request);
            this.city = request.city;
            this.IPV4 = request.IPV4;
            this.IPV6 = request.IPV6;
            this.isp = request.isp;
            this.viewAll = request.viewAll;
        } 

        /**
         * The name or ID of the city.
         * <p>
         * 
         * > City names support fuzzy match.
         */
        public Builder city(String city) {
            this.putQueryParameter("City", city);
            this.city = city;
            return this;
        }

        /**
         * Specifies whether to query IPv4 probes. Valid values:
         * <p>
         * 
         * *   true (default): IPv4 probes are queried.
         * *   false: IPv4 probes are not queried.
         */
        public Builder IPV4(Boolean IPV4) {
            this.putQueryParameter("IPV4", IPV4);
            this.IPV4 = IPV4;
            return this;
        }

        /**
         * Specifies whether to query IPv6 probes. Valid values:
         * <p>
         * 
         * *   true (default): IPv6 probes are queried.
         * *   false: IPv6 probes are not queried.
         */
        public Builder IPV6(Boolean IPV6) {
            this.putQueryParameter("IPV6", IPV6);
            this.IPV6 = IPV6;
            return this;
        }

        /**
         * The name or ID of the carrier.
         * <p>
         * 
         * > Carrier names support fuzzy match.
         */
        public Builder isp(String isp) {
            this.putQueryParameter("Isp", isp);
            this.isp = isp;
            return this;
        }

        /**
         * Specifies whether to return all detection points. Valid values:
         * <p>
         * 
         * *   true (default): returns all detection points.
         * *   false: returns only available detection points.
         */
        public Builder viewAll(Boolean viewAll) {
            this.putQueryParameter("ViewAll", viewAll);
            this.viewAll = viewAll;
            return this;
        }

        @Override
        public DescribeSiteMonitorISPCityListRequest build() {
            return new DescribeSiteMonitorISPCityListRequest(this);
        } 

    } 

}
