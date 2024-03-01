// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAssetRiskListRequest} extends {@link RequestModel}
 *
 * <p>DescribeAssetRiskListRequest</p>
 */
public class DescribeAssetRiskListRequest extends Request {
    @Query
    @NameInMap("IpAddrList")
    private java.util.List < String > ipAddrList;

    @Query
    @NameInMap("IpVersion")
    @Validation(required = true)
    private Integer ipVersion;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private DescribeAssetRiskListRequest(Builder builder) {
        super(builder);
        this.ipAddrList = builder.ipAddrList;
        this.ipVersion = builder.ipVersion;
        this.lang = builder.lang;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAssetRiskListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipAddrList
     */
    public java.util.List < String > getIpAddrList() {
        return this.ipAddrList;
    }

    /**
     * @return ipVersion
     */
    public Integer getIpVersion() {
        return this.ipVersion;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DescribeAssetRiskListRequest, Builder> {
        private java.util.List < String > ipAddrList; 
        private Integer ipVersion; 
        private String lang; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAssetRiskListRequest request) {
            super(request);
            this.ipAddrList = request.ipAddrList;
            this.ipVersion = request.ipVersion;
            this.lang = request.lang;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * IpAddrList.
         */
        public Builder ipAddrList(java.util.List < String > ipAddrList) {
            this.putQueryParameter("IpAddrList", ipAddrList);
            this.ipAddrList = ipAddrList;
            return this;
        }

        /**
         * IpVersion.
         */
        public Builder ipVersion(Integer ipVersion) {
            this.putQueryParameter("IpVersion", ipVersion);
            this.ipVersion = ipVersion;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DescribeAssetRiskListRequest build() {
            return new DescribeAssetRiskListRequest(this);
        } 

    } 

}
