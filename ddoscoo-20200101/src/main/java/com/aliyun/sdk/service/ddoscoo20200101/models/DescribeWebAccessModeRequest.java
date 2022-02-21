// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebAccessModeRequest} extends {@link RequestModel}
 *
 * <p>DescribeWebAccessModeRequest</p>
 */
public class DescribeWebAccessModeRequest extends Request {
    @Query
    @NameInMap("Domains")
    @Validation(required = true)
    private java.util.List < String > domains;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DescribeWebAccessModeRequest(Builder builder) {
        super(builder);
        this.domains = builder.domains;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebAccessModeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domains
     */
    public java.util.List < String > getDomains() {
        return this.domains;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeWebAccessModeRequest, Builder> {
        private java.util.List < String > domains; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeWebAccessModeRequest response) {
            super(response);
            this.domains = response.domains;
            this.regionId = response.regionId;
        } 

        /**
         * Domains.
         */
        public Builder domains(java.util.List < String > domains) {
            this.putQueryParameter("Domains", domains);
            this.domains = domains;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeWebAccessModeRequest build() {
            return new DescribeWebAccessModeRequest(this);
        } 

    } 

}
