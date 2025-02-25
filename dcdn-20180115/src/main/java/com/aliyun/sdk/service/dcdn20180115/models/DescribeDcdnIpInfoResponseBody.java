// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnIpInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnIpInfoResponseBody</p>
 */
public class DescribeDcdnIpInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DcdnIp")
    private String dcdnIp;

    @com.aliyun.core.annotation.NameInMap("ISP")
    private String ISP;

    @com.aliyun.core.annotation.NameInMap("IspEname")
    private String ispEname;

    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.NameInMap("RegionEname")
    private String regionEname;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>Indicates whether the specified IP address is assigned to an Alibaba Cloud DCDN POP.</p>
         * <ul>
         * <li>True</li>
         * <li>False</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder dcdnIp(String dcdnIp) {
            this.dcdnIp = dcdnIp;
            return this;
        }

        /**
         * <p>The ISP to which the specified IP address belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>China Telecom</p>
         */
        public Builder ISP(String ISP) {
            this.ISP = ISP;
            return this;
        }

        /**
         * <p>The name of the Internet service provider (ISP).</p>
         * 
         * <strong>example:</strong>
         * <p>telecom</p>
         */
        public Builder ispEname(String ispEname) {
            this.ispEname = ispEname;
            return this;
        }

        /**
         * <p>The Chinese name of the region.</p>
         * 
         * <strong>example:</strong>
         * <blockquote>
         * <p> The maximum number of times that users can call this operation per second is 50.</p>
         * </blockquote>
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * <p>The English name of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>China-Guizhou-guiyang</p>
         */
        public Builder regionEname(String regionEname) {
            this.regionEname = regionEname;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1B1D0EE7-9559-489D-BC4E-279495EB8FB8</p>
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
