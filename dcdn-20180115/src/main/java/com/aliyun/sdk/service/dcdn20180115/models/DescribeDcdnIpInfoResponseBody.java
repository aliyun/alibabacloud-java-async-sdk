// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnIpInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnIpInfoResponseBody</p>
 */
public class DescribeDcdnIpInfoResponseBody extends TeaModel {
    @NameInMap("DcdnIp")
    private String dcdnIp;

    @NameInMap("ISP")
    private String ISP;

    @NameInMap("IspEname")
    private String ispEname;

    @NameInMap("Region")
    private String region;

    @NameInMap("RegionEname")
    private String regionEname;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDcdnIpInfoResponseBody(Builder builder) {
        this.dcdnIp = builder.dcdnIp;
        this.ISP = builder.ISP;
        this.ispEname = builder.ispEname;
        this.region = builder.region;
        this.regionEname = builder.regionEname;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnIpInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return dcdnIp
     */
    public String getDcdnIp() {
        return this.dcdnIp;
    }

    /**
     * @return ISP
     */
    public String getISP() {
        return this.ISP;
    }

    /**
     * @return ispEname
     */
    public String getIspEname() {
        return this.ispEname;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return regionEname
     */
    public String getRegionEname() {
        return this.regionEname;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String dcdnIp; 
        private String ISP; 
        private String ispEname; 
        private String region; 
        private String regionEname; 
        private String requestId; 

        /**
         * DcdnIp.
         */
        public Builder dcdnIp(String dcdnIp) {
            this.dcdnIp = dcdnIp;
            return this;
        }

        /**
         * ISP.
         */
        public Builder ISP(String ISP) {
            this.ISP = ISP;
            return this;
        }

        /**
         * IspEname.
         */
        public Builder ispEname(String ispEname) {
            this.ispEname = ispEname;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * RegionEname.
         */
        public Builder regionEname(String regionEname) {
            this.regionEname = regionEname;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnIpInfoResponseBody build() {
            return new DescribeDcdnIpInfoResponseBody(this);
        } 

    } 

}
