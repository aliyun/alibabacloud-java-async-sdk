// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResolverAvailableZonesRequest} extends {@link RequestModel}
 *
 * <p>DescribeResolverAvailableZonesRequest</p>
 */
public class DescribeResolverAvailableZonesRequest extends Request {
    @Query
    @NameInMap("AzId")
    private String azId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("ResolverRegionId")
    @Validation(required = true)
    private String resolverRegionId;

    private DescribeResolverAvailableZonesRequest(Builder builder) {
        super(builder);
        this.azId = builder.azId;
        this.lang = builder.lang;
        this.resolverRegionId = builder.resolverRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResolverAvailableZonesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return azId
     */
    public String getAzId() {
        return this.azId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return resolverRegionId
     */
    public String getResolverRegionId() {
        return this.resolverRegionId;
    }

    public static final class Builder extends Request.Builder<DescribeResolverAvailableZonesRequest, Builder> {
        private String azId; 
        private String lang; 
        private String resolverRegionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeResolverAvailableZonesRequest response) {
            super(response);
            this.azId = response.azId;
            this.lang = response.lang;
            this.resolverRegionId = response.resolverRegionId;
        } 

        /**
         * AzId.
         */
        public Builder azId(String azId) {
            this.putQueryParameter("AzId", azId);
            this.azId = azId;
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
         * ResolverRegionId.
         */
        public Builder resolverRegionId(String resolverRegionId) {
            this.putQueryParameter("ResolverRegionId", resolverRegionId);
            this.resolverRegionId = resolverRegionId;
            return this;
        }

        @Override
        public DescribeResolverAvailableZonesRequest build() {
            return new DescribeResolverAvailableZonesRequest(this);
        } 

    } 

}
