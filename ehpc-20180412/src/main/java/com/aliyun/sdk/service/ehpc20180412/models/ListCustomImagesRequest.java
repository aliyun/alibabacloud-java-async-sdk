// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCustomImagesRequest} extends {@link RequestModel}
 *
 * <p>ListCustomImagesRequest</p>
 */
public class ListCustomImagesRequest extends Request {
    @Query
    @NameInMap("BaseOsTag")
    private String baseOsTag;

    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("ImageOwnerAlias")
    private String imageOwnerAlias;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    private ListCustomImagesRequest(Builder builder) {
        super(builder);
        this.baseOsTag = builder.baseOsTag;
        this.clusterId = builder.clusterId;
        this.imageOwnerAlias = builder.imageOwnerAlias;
        this.instanceType = builder.instanceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomImagesRequest create() {
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
     * @return imageOwnerAlias
     */
    public String getImageOwnerAlias() {
        return this.imageOwnerAlias;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    public static final class Builder extends Request.Builder<ListCustomImagesRequest, Builder> {
        private String baseOsTag; 
        private String clusterId; 
        private String imageOwnerAlias; 
        private String instanceType; 

        private Builder() {
            super();
        } 

        private Builder(ListCustomImagesRequest request) {
            super(request);
            this.baseOsTag = request.baseOsTag;
            this.clusterId = request.clusterId;
            this.imageOwnerAlias = request.imageOwnerAlias;
            this.instanceType = request.instanceType;
        } 

        /**
         * The image tag of the base operating system. The tag is used only by the management node.
         */
        public Builder baseOsTag(String baseOsTag) {
            this.putQueryParameter("BaseOsTag", baseOsTag);
            this.baseOsTag = baseOsTag;
            return this;
        }

        /**
         * The ID of the cluster where the application resides. If the cluster supports multiple operating systems, all the images in the region where the cluster resides are queried.
         * <p>
         * 
         * By default, if you do not specify the cluster ID, the images that are supported by all the clusters is queried.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The source of the image. Valid values:
         * <p>
         * 
         * *   self: custom image
         * *   others: shared image
         */
        public Builder imageOwnerAlias(String imageOwnerAlias) {
            this.putQueryParameter("ImageOwnerAlias", imageOwnerAlias);
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }

        /**
         * Specify the type of the instance. By default, if you do not specify the type of the instance, the list of images that are supported by all the instance types are queried.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        @Override
        public ListCustomImagesRequest build() {
            return new ListCustomImagesRequest(this);
        } 

    } 

}
