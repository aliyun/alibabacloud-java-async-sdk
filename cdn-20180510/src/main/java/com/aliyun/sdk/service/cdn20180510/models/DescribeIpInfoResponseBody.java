// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIpInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIpInfoResponseBody</p>
 */
public class DescribeIpInfoResponseBody extends TeaModel {
    @NameInMap("CdnIp")
    private String cdnIp;

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

    private DescribeIpInfoResponseBody(Builder builder) {
        this.cdnIp = builder.cdnIp;
        this.ISP = builder.ISP;
        this.ispEname = builder.ispEname;
        this.region = builder.region;
        this.regionEname = builder.regionEname;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIpInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return cdnIp
     */
    public String getCdnIp() {
        return this.cdnIp;
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
        private String cdnIp; 
        private String ISP; 
        private String ispEname; 
        private String region; 
        private String regionEname; 
        private String requestId; 

        /**
         * Indicates whether the IP address belongs to an Alibaba Cloud CDN POP.
         * <p>
         * *   **True**:Yes.
         * *   **False**:No.
         */
        public Builder cdnIp(String cdnIp) {
            this.cdnIp = cdnIp;
            return this;
        }

        /**
         * The name of the ISP in Chinese.
         */
        public Builder ISP(String ISP) {
            this.ISP = ISP;
            return this;
        }

        /**
         * The name of the ISP.
         */
        public Builder ispEname(String ispEname) {
            this.ispEname = ispEname;
            return this;
        }

        /**
         * The name of the region in Chinese.
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * The name of the region.
         */
        public Builder regionEname(String regionEname) {
            this.regionEname = regionEname;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeIpInfoResponseBody build() {
            return new DescribeIpInfoResponseBody(this);
        } 

    } 

}
