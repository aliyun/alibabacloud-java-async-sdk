// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeIpInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIpInfoResponseBody</p>
 */
public class DescribeIpInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CdnIp")
    private String cdnIp;

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
         * <p>Indicates whether the IP address belongs to an Alibaba Cloud CDN POP.</p>
         * <ul>
         * <li><strong>True</strong>:Yes.</li>
         * <li><strong>False</strong>:No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder cdnIp(String cdnIp) {
            this.cdnIp = cdnIp;
            return this;
        }

        /**
         * <p>The name of the ISP in Chinese.</p>
         * 
         * <strong>example:</strong>
         * <p>电信</p>
         */
        public Builder ISP(String ISP) {
            this.ISP = ISP;
            return this;
        }

        /**
         * <p>The name of the ISP.</p>
         * 
         * <strong>example:</strong>
         * <p>telecom</p>
         */
        public Builder ispEname(String ispEname) {
            this.ispEname = ispEname;
            return this;
        }

        /**
         * <p>The name of the region in Chinese.</p>
         * 
         * <strong>example:</strong>
         * <p>中国-贵州省-贵阳市</p>
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * <p>The name of the region.</p>
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
         * <p>123847FA-9A00-4426-83B8-B4B45D475930</p>
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
