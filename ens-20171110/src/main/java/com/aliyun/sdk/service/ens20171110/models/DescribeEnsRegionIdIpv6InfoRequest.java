// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnsRegionIdIpv6InfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeEnsRegionIdIpv6InfoRequest</p>
 */
public class DescribeEnsRegionIdIpv6InfoRequest extends Request {
    @Query
    @NameInMap("EnsRegionId")
    @Validation(required = true)
    private String ensRegionId;

    @Query
    @NameInMap("Version")
    @Validation(required = true)
    private String version;

    private DescribeEnsRegionIdIpv6InfoRequest(Builder builder) {
        super(builder);
        this.ensRegionId = builder.ensRegionId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnsRegionIdIpv6InfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<DescribeEnsRegionIdIpv6InfoRequest, Builder> {
        private String ensRegionId; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEnsRegionIdIpv6InfoRequest response) {
            super(response);
            this.ensRegionId = response.ensRegionId;
            this.version = response.version;
        } 

        /**
         * EnsRegionId.
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public DescribeEnsRegionIdIpv6InfoRequest build() {
            return new DescribeEnsRegionIdIpv6InfoRequest(this);
        } 

    } 

}
