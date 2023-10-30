// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSupportedZonesRequest} extends {@link RequestModel}
 *
 * <p>DescribeSupportedZonesRequest</p>
 */
public class DescribeSupportedZonesRequest extends Request {
    @Query
    @NameInMap("ArchitectureType")
    private String architectureType;

    @Query
    @NameInMap("Region")
    private String region;

    private DescribeSupportedZonesRequest(Builder builder) {
        super(builder);
        this.architectureType = builder.architectureType;
        this.region = builder.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSupportedZonesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return architectureType
     */
    public String getArchitectureType() {
        return this.architectureType;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    public static final class Builder extends Request.Builder<DescribeSupportedZonesRequest, Builder> {
        private String architectureType; 
        private String region; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSupportedZonesRequest request) {
            super(request);
            this.architectureType = request.architectureType;
            this.region = request.region;
        } 

        /**
         * ArchitectureType.
         */
        public Builder architectureType(String architectureType) {
            this.putQueryParameter("ArchitectureType", architectureType);
            this.architectureType = architectureType;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        @Override
        public DescribeSupportedZonesRequest build() {
            return new DescribeSupportedZonesRequest(this);
        } 

    } 

}
