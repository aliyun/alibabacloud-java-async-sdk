// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeWebAccessModeRequest} extends {@link RequestModel}
 *
 * <p>DescribeWebAccessModeRequest</p>
 */
public class DescribeWebAccessModeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domains")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The domain name of the website.</p>
         * <blockquote>
         * <p>A forwarding rule must be configured for a domain name. You can call the <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> operation to query all domain names.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
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
