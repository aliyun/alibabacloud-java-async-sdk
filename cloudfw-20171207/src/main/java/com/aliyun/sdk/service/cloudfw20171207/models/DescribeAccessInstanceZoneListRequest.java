// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeAccessInstanceZoneListRequest} extends {@link RequestModel}
 *
 * <p>DescribeAccessInstanceZoneListRequest</p>
 */
public class DescribeAccessInstanceZoneListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessInstanceType")
    private String accessInstanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionNo")
    private String regionNo;

    private DescribeAccessInstanceZoneListRequest(Builder builder) {
        super(builder);
        this.accessInstanceType = builder.accessInstanceType;
        this.lang = builder.lang;
        this.regionNo = builder.regionNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccessInstanceZoneListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessInstanceType
     */
    public String getAccessInstanceType() {
        return this.accessInstanceType;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return regionNo
     */
    public String getRegionNo() {
        return this.regionNo;
    }

    public static final class Builder extends Request.Builder<DescribeAccessInstanceZoneListRequest, Builder> {
        private String accessInstanceType; 
        private String lang; 
        private String regionNo; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAccessInstanceZoneListRequest request) {
            super(request);
            this.accessInstanceType = request.accessInstanceType;
            this.lang = request.lang;
            this.regionNo = request.regionNo;
        } 

        /**
         * AccessInstanceType.
         */
        public Builder accessInstanceType(String accessInstanceType) {
            this.putQueryParameter("AccessInstanceType", accessInstanceType);
            this.accessInstanceType = accessInstanceType;
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
         * RegionNo.
         */
        public Builder regionNo(String regionNo) {
            this.putQueryParameter("RegionNo", regionNo);
            this.regionNo = regionNo;
            return this;
        }

        @Override
        public DescribeAccessInstanceZoneListRequest build() {
            return new DescribeAccessInstanceZoneListRequest(this);
        } 

    } 

}
