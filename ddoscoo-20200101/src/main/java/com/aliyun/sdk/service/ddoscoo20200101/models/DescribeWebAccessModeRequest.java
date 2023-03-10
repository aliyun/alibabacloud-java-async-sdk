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
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Domains")
    @Validation(required = true)
    private java.util.List < String > domains;

    private DescribeWebAccessModeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domains = builder.domains;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return domains
     */
    public java.util.List < String > getDomains() {
        return this.domains;
    }

    public static final class Builder extends Request.Builder<DescribeWebAccessModeRequest, Builder> {
        private String regionId; 
        private java.util.List < String > domains; 

        private Builder() {
            super();
        } 

        private Builder(DescribeWebAccessModeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.domains = request.domains;
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
         * The domain name of the website.
         * <p>
         * 
         * > A forwarding rule must be configured for a domain name. You can call the [DescribeDomains](~~91724~~) operation to query all domain names.
         */
        public Builder domains(java.util.List < String > domains) {
            this.putQueryParameter("Domains", domains);
            this.domains = domains;
            return this;
        }

        @Override
        public DescribeWebAccessModeRequest build() {
            return new DescribeWebAccessModeRequest(this);
        } 

    } 

}
