// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudDiskTypesRequest} extends {@link RequestModel}
 *
 * <p>DescribeCloudDiskTypesRequest</p>
 */
public class DescribeCloudDiskTypesRequest extends Request {
    @Query
    @NameInMap("EnsRegionId")
    private String ensRegionId;

    private DescribeCloudDiskTypesRequest(Builder builder) {
        super(builder);
        this.ensRegionId = builder.ensRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudDiskTypesRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeCloudDiskTypesRequest, Builder> {
        private String ensRegionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCloudDiskTypesRequest response) {
            super(response);
            this.ensRegionId = response.ensRegionId;
        } 

        /**
         * A short description of struct
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        @Override
        public DescribeCloudDiskTypesRequest build() {
            return new DescribeCloudDiskTypesRequest(this);
        } 

    } 

}
