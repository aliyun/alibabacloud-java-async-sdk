// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
 * {@link DescribeSiteMonitorISPCityListRequest} extends {@link RequestModel}
 *
 * <p>DescribeSiteMonitorISPCityListRequest</p>
 */
public class DescribeSiteMonitorISPCityListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("City")
    private String city;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IPV4")
    private Boolean IPV4;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IPV6")
    private Boolean IPV6;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Isp")
    private String isp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ViewAll")
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
         * <p>The name or ID of the city where the carrier detection point resides.</p>
         * <blockquote>
         * <p>Fuzzy match is supported for city names.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Guiyang</p>
         */
        public Builder city(String city) {
            this.putQueryParameter("City", city);
            this.city = city;
            return this;
        }

        /**
         * <p>Specifies whether to query IPv4 probes. Valid values:</p>
         * <ul>
         * <li>true (default): Queries IPv4 probes.</li>
         * <li>false: Does not query IPv4 probes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder IPV4(Boolean IPV4) {
            this.putQueryParameter("IPV4", IPV4);
            this.IPV4 = IPV4;
            return this;
        }

        /**
         * <p>Specifies whether to query IPv6 probes. Valid values:</p>
         * <ul>
         * <li>true (default): Queries IPv6 probes.</li>
         * <li>false: Does not query IPv6 probes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder IPV6(Boolean IPV6) {
            this.putQueryParameter("IPV6", IPV6);
            this.IPV6 = IPV6;
            return this;
        }

        /**
         * <p>The name or ID of the carrier detection point.</p>
         * <blockquote>
         * <p>Fuzzy match is supported for carrier names.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>China Unicom</p>
         */
        public Builder isp(String isp) {
            this.putQueryParameter("Isp", isp);
            this.isp = isp;
            return this;
        }

        /**
         * <p>Specifies whether to return all detection points. Valid values:</p>
         * <ul>
         * <li>true (default): Returns all detection points.</li>
         * <li>false: Returns only available detection points.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
