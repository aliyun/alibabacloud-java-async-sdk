// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInterceptionTargetRequest} extends {@link RequestModel}
 *
 * <p>CreateInterceptionTargetRequest</p>
 */
public class CreateInterceptionTargetRequest extends Request {
    @Query
    @NameInMap("AppName")
    private String appName;

    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("ClusterName")
    private String clusterName;

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
    @NameInMap("TargetName")
    @Validation(required = true)
    private String targetName;

    @Query
    @NameInMap("TargetType")
    @Validation(required = true)
    private String targetType;

    private CreateInterceptionTargetRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.clusterId = builder.clusterId;
        this.clusterName = builder.clusterName;
        this.imageList = builder.imageList;
        this.namespace = builder.namespace;
        this.tagList = builder.tagList;
        this.targetName = builder.targetName;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInterceptionTargetRequest create() {
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
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
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

    public static final class Builder extends Request.Builder<CreateInterceptionTargetRequest, Builder> {
        private String appName; 
        private String clusterId; 
        private String clusterName; 
        private java.util.List < String > imageList; 
        private String namespace; 
        private java.util.List < String > tagList; 
        private String targetName; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(CreateInterceptionTargetRequest request) {
            super(request);
            this.appName = request.appName;
            this.clusterId = request.clusterId;
            this.clusterName = request.clusterName;
            this.imageList = request.imageList;
            this.namespace = request.namespace;
            this.tagList = request.tagList;
            this.targetName = request.targetName;
            this.targetType = request.targetType;
        } 

        /**
         * The name of the application to which the network object belongs.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * The cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The cluster name.
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * An array that consists of the images of the network object.
         */
        public Builder imageList(java.util.List < String > imageList) {
            this.putQueryParameter("ImageList", imageList);
            this.imageList = imageList;
            return this;
        }

        /**
         * The namespace to which the network object belongs.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * An array that consists of the labels specified for the network object.
         */
        public Builder tagList(java.util.List < String > tagList) {
            this.putQueryParameter("TagList", tagList);
            this.tagList = tagList;
            return this;
        }

        /**
         * The name of the object to be blocked.
         */
        public Builder targetName(String targetName) {
            this.putQueryParameter("TargetName", targetName);
            this.targetName = targetName;
            return this;
        }

        /**
         * The object type. Valid value:
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
        public CreateInterceptionTargetRequest build() {
            return new CreateInterceptionTargetRequest(this);
        } 

    } 

}
