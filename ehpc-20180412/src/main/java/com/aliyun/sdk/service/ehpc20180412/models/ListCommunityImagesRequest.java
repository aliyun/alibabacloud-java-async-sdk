// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCommunityImagesRequest} extends {@link RequestModel}
 *
 * <p>ListCommunityImagesRequest</p>
 */
public class ListCommunityImagesRequest extends Request {
    @Query
    @NameInMap("BaseOsTag")
    private String baseOsTag;

    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    private ListCommunityImagesRequest(Builder builder) {
        super(builder);
        this.baseOsTag = builder.baseOsTag;
        this.clusterId = builder.clusterId;
        this.instanceType = builder.instanceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCommunityImagesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baseOsTag
     */
    public String getBaseOsTag() {
        return this.baseOsTag;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    public static final class Builder extends Request.Builder<ListCommunityImagesRequest, Builder> {
        private String baseOsTag; 
        private String clusterId; 
        private String instanceType; 

        private Builder() {
            super();
        } 

        private Builder(ListCommunityImagesRequest request) {
            super(request);
            this.baseOsTag = request.baseOsTag;
            this.clusterId = request.clusterId;
            this.instanceType = request.instanceType;
        } 

        /**
         * The tag of the base operating system (BOS).
         */
        public Builder baseOsTag(String baseOsTag) {
            this.putQueryParameter("BaseOsTag", baseOsTag);
            this.baseOsTag = baseOsTag;
            return this;
        }

        /**
         * The ID of the cluster. If the cluster supports multiple operating systems, all community images in the region where the cluster resides are queried.
         * <p>
         * 
         * If you do not specify the cluster ID, the community images that are supported by all clusters are queried.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The type of the Elastic Compute Service (ECS) instance. If you do not specify the instance type, the community images that are supported by all instance types are queried.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        @Override
        public ListCommunityImagesRequest build() {
            return new ListCommunityImagesRequest(this);
        } 

    } 

}
