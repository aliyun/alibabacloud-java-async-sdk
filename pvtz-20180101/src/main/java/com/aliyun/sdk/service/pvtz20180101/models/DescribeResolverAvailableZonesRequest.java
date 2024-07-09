// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResolverAvailableZonesRequest} extends {@link RequestModel}
 *
 * <p>DescribeResolverAvailableZonesRequest</p>
 */
public class DescribeResolverAvailableZonesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AzId")
    private String azId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResolverRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(DescribeResolverAvailableZonesRequest request) {
            super(request);
            this.azId = request.azId;
            this.lang = request.lang;
            this.resolverRegionId = request.resolverRegionId;
        } 

        /**
         * The zone ID.
         */
        public Builder azId(String azId) {
            this.putQueryParameter("AzId", azId);
            this.azId = azId;
            return this;
        }

        /**
         * The language.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The region ID.
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
