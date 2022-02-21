// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnsRegionsRequest} extends {@link RequestModel}
 *
 * <p>DescribeEnsRegionsRequest</p>
 */
public class DescribeEnsRegionsRequest extends Request {
    @Query
    @NameInMap("EnsRegionId")
    private String ensRegionId;

    @Query
    @NameInMap("Version")
    @Validation(required = true)
    private String version;

    private DescribeEnsRegionsRequest(Builder builder) {
        super(builder);
        this.ensRegionId = builder.ensRegionId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnsRegionsRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeEnsRegionsRequest, Builder> {
        private String ensRegionId; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEnsRegionsRequest response) {
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
        public DescribeEnsRegionsRequest build() {
            return new DescribeEnsRegionsRequest(this);
        } 

    } 

}
