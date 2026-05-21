// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

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
 * {@link DescribeTagsRequest} extends {@link RequestModel}
 *
 * <p>DescribeTagsRequest</p>
 */
public class DescribeTagsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tagsOnly")
    private Boolean tagsOnly;

    private DescribeTagsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.tagsOnly = builder.tagsOnly;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTagsRequest create() {
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
     * @return tagsOnly
     */
    public Boolean getTagsOnly() {
        return this.tagsOnly;
    }

    public static final class Builder extends Request.Builder<DescribeTagsRequest, Builder> {
        private String regionId; 
        private Boolean tagsOnly; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTagsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.tagsOnly = request.tagsOnly;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * tagsOnly.
         */
        public Builder tagsOnly(Boolean tagsOnly) {
            this.putQueryParameter("tagsOnly", tagsOnly);
            this.tagsOnly = tagsOnly;
            return this;
        }

        @Override
        public DescribeTagsRequest build() {
            return new DescribeTagsRequest(this);
        } 

    } 

}
