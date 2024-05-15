// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpcZoneRequest} extends {@link RequestModel}
 *
 * <p>DescribeVpcZoneRequest</p>
 */
public class DescribeVpcZoneRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Environment")
    private String environment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberUid")
    private String memberUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionNo")
    private String regionNo;

    private DescribeVpcZoneRequest(Builder builder) {
        super(builder);
        this.environment = builder.environment;
        this.lang = builder.lang;
        this.memberUid = builder.memberUid;
        this.regionNo = builder.regionNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcZoneRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return environment
     */
    public String getEnvironment() {
        return this.environment;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return memberUid
     */
    public String getMemberUid() {
        return this.memberUid;
    }

    /**
     * @return regionNo
     */
    public String getRegionNo() {
        return this.regionNo;
    }

    public static final class Builder extends Request.Builder<DescribeVpcZoneRequest, Builder> {
        private String environment; 
        private String lang; 
        private String memberUid; 
        private String regionNo; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVpcZoneRequest request) {
            super(request);
            this.environment = request.environment;
            this.lang = request.lang;
            this.memberUid = request.memberUid;
            this.regionNo = request.regionNo;
        } 

        /**
         * The environment. Valid values:
         * <p>
         * 
         * *   **VPC**
         * *   **TransitRouter**
         */
        public Builder environment(String environment) {
            this.putQueryParameter("Environment", environment);
            this.environment = environment;
            return this;
        }

        /**
         * The language of the content within the request and response. Valid values:
         * <p>
         * 
         * *   **zh** (default): Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The UID of the member in Cloud Firewall.
         */
        public Builder memberUid(String memberUid) {
            this.putQueryParameter("MemberUid", memberUid);
            this.memberUid = memberUid;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionNo(String regionNo) {
            this.putQueryParameter("RegionNo", regionNo);
            this.regionNo = regionNo;
            return this;
        }

        @Override
        public DescribeVpcZoneRequest build() {
            return new DescribeVpcZoneRequest(this);
        } 

    } 

}
