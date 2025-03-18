// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCloudDiskTypesRequest} extends {@link RequestModel}
 *
 * <p>DescribeCloudDiskTypesRequest</p>
 */
public class DescribeCloudDiskTypesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    private String ensRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionIds")
    private java.util.List<String> ensRegionIds;

    private DescribeCloudDiskTypesRequest(Builder builder) {
        super(builder);
        this.ensRegionId = builder.ensRegionId;
        this.ensRegionIds = builder.ensRegionIds;
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

    /**
     * @return ensRegionIds
     */
    public java.util.List<String> getEnsRegionIds() {
        return this.ensRegionIds;
    }

    public static final class Builder extends Request.Builder<DescribeCloudDiskTypesRequest, Builder> {
        private String ensRegionId; 
        private java.util.List<String> ensRegionIds; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCloudDiskTypesRequest request) {
            super(request);
            this.ensRegionId = request.ensRegionId;
            this.ensRegionIds = request.ensRegionIds;
        } 

        /**
         * <p>The ID of the edge node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-chongqing-cmcc</p>
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * <p>The edge nodes.</p>
         */
        public Builder ensRegionIds(java.util.List<String> ensRegionIds) {
            String ensRegionIdsShrink = shrink(ensRegionIds, "EnsRegionIds", "json");
            this.putQueryParameter("EnsRegionIds", ensRegionIdsShrink);
            this.ensRegionIds = ensRegionIds;
            return this;
        }

        @Override
        public DescribeCloudDiskTypesRequest build() {
            return new DescribeCloudDiskTypesRequest(this);
        } 

    } 

}
