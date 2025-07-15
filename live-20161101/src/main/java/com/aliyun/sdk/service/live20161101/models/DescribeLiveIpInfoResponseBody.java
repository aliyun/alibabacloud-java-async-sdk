// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLiveIpInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveIpInfoResponseBody</p>
 */
public class DescribeLiveIpInfoResponseBody extends TeaModel {
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

    private DescribeLiveIpInfoResponseBody(Builder builder) {
        this.ISP = builder.ISP;
        this.ispEname = builder.ispEname;
        this.region = builder.region;
        this.regionEname = builder.regionEname;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveIpInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private String ISP; 
        private String ispEname; 
        private String region; 
        private String regionEname; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeLiveIpInfoResponseBody model) {
            this.ISP = model.ISP;
            this.ispEname = model.ispEname;
            this.region = model.region;
            this.regionEname = model.regionEname;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The Chinese name of the ISP.</p>
         * 
         * <strong>example:</strong>
         * <p>ChinaTelecom</p>
         */
        public Builder ISP(String ISP) {
            this.ISP = ISP;
            return this;
        }

        /**
         * <p>The English name of the Internet service provider (ISP).</p>
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
         * <p>China-Guizhou-guiyang</p>
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

        public DescribeLiveIpInfoResponseBody build() {
            return new DescribeLiveIpInfoResponseBody(this);
        } 

    } 

}
