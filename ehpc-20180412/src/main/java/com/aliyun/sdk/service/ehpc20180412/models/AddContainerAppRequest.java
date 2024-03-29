// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddContainerAppRequest} extends {@link RequestModel}
 *
 * <p>AddContainerAppRequest</p>
 */
public class AddContainerAppRequest extends Request {
    @Query
    @NameInMap("ContainerType")
    private String containerType;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("ImageTag")
    private String imageTag;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("Repository")
    @Validation(required = true)
    private String repository;

    private AddContainerAppRequest(Builder builder) {
        super(builder);
        this.containerType = builder.containerType;
        this.description = builder.description;
        this.imageTag = builder.imageTag;
        this.name = builder.name;
        this.repository = builder.repository;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddContainerAppRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return containerType
     */
    public String getContainerType() {
        return this.containerType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return imageTag
     */
    public String getImageTag() {
        return this.imageTag;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return repository
     */
    public String getRepository() {
        return this.repository;
    }

    public static final class Builder extends Request.Builder<AddContainerAppRequest, Builder> {
        private String containerType; 
        private String description; 
        private String imageTag; 
        private String name; 
        private String repository; 

        private Builder() {
            super();
        } 

        private Builder(AddContainerAppRequest request) {
            super(request);
            this.containerType = request.containerType;
            this.description = request.description;
            this.imageTag = request.imageTag;
            this.name = request.name;
            this.repository = request.repository;
        } 

        /**
         * The type of the container. Set the value to singularity.
         */
        public Builder containerType(String containerType) {
            this.putQueryParameter("ContainerType", containerType);
            this.containerType = containerType;
            return this;
        }

        /**
         * The description of the container.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The tags of the image.
         * <p>
         * 
         * The repository stores a type of images such as Ubuntu images. Tags are used to identify the images. Examples: 16.04, 17.04, and latest.
         * 
         * Default value: latest
         */
        public Builder imageTag(String imageTag) {
            this.putQueryParameter("ImageTag", imageTag);
            this.imageTag = imageTag;
            return this;
        }

        /**
         * The name of the container. The name must be 2 to 64 characters in length. It must start with a letter and can contain letters, digits, hyphens (-), and underscores (\_).
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The name of the repository. The image that has the same name as the repository is pulled.
         * <p>
         * 
         * For information about image names, visit [Docker Hub official website](https://hub.docker.com/search?q=\&type=image).
         */
        public Builder repository(String repository) {
            this.putQueryParameter("Repository", repository);
            this.repository = repository;
            return this;
        }

        @Override
        public AddContainerAppRequest build() {
            return new AddContainerAppRequest(this);
        } 

    } 

}
