// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInterceptionTargetRequest} extends {@link RequestModel}
 *
 * <p>ModifyInterceptionTargetRequest</p>
 */
public class ModifyInterceptionTargetRequest extends Request {
    @Query
    @NameInMap("AppName")
    private String appName;

    @Query
    @NameInMap("ImageList")
    private java.util.List < String > imageList;

    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Query
    @NameInMap("TagList")
    private java.util.List < String > tagList;

    @Query
    @NameInMap("TargetId")
    @Validation(required = true)
    private Long targetId;

    @Query
    @NameInMap("TargetName")
    @Validation(required = true)
    private String targetName;

    @Query
    @NameInMap("TargetType")
    @Validation(required = true)
    private String targetType;

    private ModifyInterceptionTargetRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.imageList = builder.imageList;
        this.namespace = builder.namespace;
        this.tagList = builder.tagList;
        this.targetId = builder.targetId;
        this.targetName = builder.targetName;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInterceptionTargetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return imageList
     */
    public java.util.List < String > getImageList() {
        return this.imageList;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return tagList
     */
    public java.util.List < String > getTagList() {
        return this.tagList;
    }

    /**
     * @return targetId
     */
    public Long getTargetId() {
        return this.targetId;
    }

    /**
     * @return targetName
     */
    public String getTargetName() {
        return this.targetName;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    public static final class Builder extends Request.Builder<ModifyInterceptionTargetRequest, Builder> {
        private String appName; 
        private java.util.List < String > imageList; 
        private String namespace; 
        private java.util.List < String > tagList; 
        private Long targetId; 
        private String targetName; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInterceptionTargetRequest request) {
            super(request);
            this.appName = request.appName;
            this.imageList = request.imageList;
            this.namespace = request.namespace;
            this.tagList = request.tagList;
            this.targetId = request.targetId;
            this.targetName = request.targetName;
            this.targetType = request.targetType;
        } 

        /**
         * The name of the application.
         * <p>
         * 
         * > You can call the [DescribeContainerTags](~~DescribeContainerTags~~) operation to obtain the value of this parameter.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * An array that consists of images.
         * <p>
         * 
         * > You can call the [DescribeContainerTags](~~DescribeContainerTags~~) operation to obtain the value of this parameter.
         */
        public Builder imageList(java.util.List < String > imageList) {
            this.putQueryParameter("ImageList", imageList);
            this.imageList = imageList;
            return this;
        }

        /**
         * The namespace.
         * <p>
         * 
         * > You can call the [DescribeContainerTags](~~DescribeContainerTags~~) operation to obtain the value of this parameter.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * An array that consists of tags.
         * <p>
         * 
         * > You can call the [DescribeContainerTags](~~DescribeContainerTags~~) operation to obtain the value of this parameter.
         */
        public Builder tagList(java.util.List < String > tagList) {
            this.putQueryParameter("TagList", tagList);
            this.tagList = tagList;
            return this;
        }

        /**
         * The ID of the network object.
         * <p>
         * 
         * > You can call the [ListInterceptionTargetPage](~~ListInterceptionTargetPage~~) operation to obtain the value of this parameter.
         */
        public Builder targetId(Long targetId) {
            this.putQueryParameter("TargetId", targetId);
            this.targetId = targetId;
            return this;
        }

        /**
         * The name.
         */
        public Builder targetName(String targetName) {
            this.putQueryParameter("TargetName", targetName);
            this.targetName = targetName;
            return this;
        }

        /**
         * The object type. Valid values:
         * <p>
         * 
         * *   **IMAGE**
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public ModifyInterceptionTargetRequest build() {
            return new ModifyInterceptionTargetRequest(this);
        } 

    } 

}
