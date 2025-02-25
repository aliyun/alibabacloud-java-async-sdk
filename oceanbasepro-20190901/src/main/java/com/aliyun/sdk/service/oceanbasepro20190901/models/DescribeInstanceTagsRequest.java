// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceTagsRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceTagsRequest</p>
 */
public class DescribeInstanceTagsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private String instanceIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    private DescribeInstanceTagsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceIds = builder.instanceIds;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceTagsRequest create() {
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
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<DescribeInstanceTagsRequest, Builder> {
        private String regionId; 
        private String instanceIds; 
        private String tags; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceTagsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceIds = request.instanceIds;
            this.tags = request.tags;
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
         * The list of cluster IDs.
         */
        public Builder instanceIds(String instanceIds) {
            this.putBodyParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * The tags.
         */
        public Builder tags(String tags) {
            this.putBodyParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public DescribeInstanceTagsRequest build() {
            return new DescribeInstanceTagsRequest(this);
        } 

    } 

}
