// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntRegionsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAntRegionsRequest</p>
 */
public class DescribeAntRegionsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Locale")
    private String locale;

    private DescribeAntRegionsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.locale = builder.locale;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAntRegionsRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeAntRegionsRequest, Builder> {
        private String regionId; 
        private String locale; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAntRegionsRequest request) {
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
        public DescribeAntRegionsRequest build() {
            return new DescribeAntRegionsRequest(this);
        } 

    } 

}
