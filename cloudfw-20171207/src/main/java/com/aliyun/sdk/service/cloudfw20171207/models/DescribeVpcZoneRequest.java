// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpcZoneRequest} extends {@link RequestModel}
 *
 * <p>DescribeVpcZoneRequest</p>
 */
public class DescribeVpcZoneRequest extends Request {
    @Query
    @NameInMap("Environment")
    private String environment;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("MemberUid")
    private String memberUid;

    @Query
    @NameInMap("RegionNo")
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
         * Environment.
         */
        public Builder environment(String environment) {
            this.putQueryParameter("Environment", environment);
            this.environment = environment;
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
         * MemberUid.
         */
        public Builder memberUid(String memberUid) {
            this.putQueryParameter("MemberUid", memberUid);
            this.memberUid = memberUid;
            return this;
        }

        /**
         * RegionNo.
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
