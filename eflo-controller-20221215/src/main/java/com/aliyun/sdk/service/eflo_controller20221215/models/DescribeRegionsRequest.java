// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRegionsRequest} extends {@link RequestModel}
 *
 * <p>DescribeRegionsRequest</p>
 */
public class DescribeRegionsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    private DescribeRegionsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.acceptLanguage = builder.acceptLanguage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRegionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public static final class Builder extends Request.Builder<DescribeRegionsRequest, Builder> {
        private String regionId; 
        private String acceptLanguage; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRegionsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.acceptLanguage = request.acceptLanguage;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putBodyParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        @Override
        public DescribeRegionsRequest build() {
            return new DescribeRegionsRequest(this);
        } 

    } 

}
