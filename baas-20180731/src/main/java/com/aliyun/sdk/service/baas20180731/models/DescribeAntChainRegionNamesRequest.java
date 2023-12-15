// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainRegionNamesRequest} extends {@link RequestModel}
 *
 * <p>DescribeAntChainRegionNamesRequest</p>
 */
public class DescribeAntChainRegionNamesRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Locale")
    private String locale;

    private DescribeAntChainRegionNamesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.locale = builder.locale;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAntChainRegionNamesRequest create() {
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
     * @return locale
     */
    public String getLocale() {
        return this.locale;
    }

    public static final class Builder extends Request.Builder<DescribeAntChainRegionNamesRequest, Builder> {
        private String regionId; 
        private String locale; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAntChainRegionNamesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.locale = request.locale;
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
         * Locale.
         */
        public Builder locale(String locale) {
            this.putBodyParameter("Locale", locale);
            this.locale = locale;
            return this;
        }

        @Override
        public DescribeAntChainRegionNamesRequest build() {
            return new DescribeAntChainRegionNamesRequest(this);
        } 

    } 

}
