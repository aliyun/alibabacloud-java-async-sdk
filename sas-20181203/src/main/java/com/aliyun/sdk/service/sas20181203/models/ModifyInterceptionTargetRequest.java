// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyInterceptionTargetRequest} extends {@link RequestModel}
 *
 * <p>ModifyInterceptionTargetRequest</p>
 */
public class ModifyInterceptionTargetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageList")
    private java.util.List < String > imageList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagList")
    private java.util.List < String > tagList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long targetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The name of the application.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeContainerTags~~">DescribeContainerTags</a> operation to obtain the value of this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>yasintt-daemonst</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>An array that consists of images.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeContainerTags~~">DescribeContainerTags</a> operation to obtain the value of this parameter.</p>
         * </blockquote>
         */
        public Builder imageList(java.util.List < String > imageList) {
            this.putQueryParameter("ImageList", imageList);
            this.imageList = imageList;
            return this;
        }

        /**
         * <p>The namespace.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeContainerTags~~">DescribeContainerTags</a> operation to obtain the value of this parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>demo4</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>An array that consists of tags.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeContainerTags~~">DescribeContainerTags</a> operation to obtain the value of this parameter.</p>
         * </blockquote>
         */
        public Builder tagList(java.util.List < String > tagList) {
            this.putQueryParameter("TagList", tagList);
            this.tagList = tagList;
            return this;
        }

        /**
         * <p>The ID of the network object.</p>
         * <blockquote>
         * <p>You can call the <a href="~~ListInterceptionTargetPage~~">ListInterceptionTargetPage</a> operation to obtain the value of this parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>400913</p>
         */
        public Builder targetId(Long targetId) {
            this.putQueryParameter("TargetId", targetId);
            this.targetId = targetId;
            return this;
        }

        /**
         * <p>The name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test001</p>
         */
        public Builder targetName(String targetName) {
            this.putQueryParameter("TargetName", targetName);
            this.targetName = targetName;
            return this;
        }

        /**
         * <p>The object type. Valid values:</p>
         * <ul>
         * <li><strong>IMAGE</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>IMAGE</p>
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
