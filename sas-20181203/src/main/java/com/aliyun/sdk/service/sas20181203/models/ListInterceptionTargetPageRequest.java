// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListInterceptionTargetPageRequest} extends {@link RequestModel}
 *
 * <p>ListInterceptionTargetPageRequest</p>
 */
public class ListInterceptionTargetPageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageList")
    private java.util.List<String> imageList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagList")
    private java.util.List<String> tagList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetName")
    private String targetName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    private String targetType;

    private ListInterceptionTargetPageRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.currentPage = builder.currentPage;
        this.imageList = builder.imageList;
        this.namespace = builder.namespace;
        this.pageSize = builder.pageSize;
        this.tagList = builder.tagList;
        this.targetName = builder.targetName;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInterceptionTargetPageRequest create() {
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
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return imageList
     */
    public java.util.List<String> getImageList() {
        return this.imageList;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return tagList
     */
    public java.util.List<String> getTagList() {
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

    public static final class Builder extends Request.Builder<ListInterceptionTargetPageRequest, Builder> {
        private String appName; 
        private Integer currentPage; 
        private java.util.List<String> imageList; 
        private String namespace; 
        private Integer pageSize; 
        private java.util.List<String> tagList; 
        private String targetName; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(ListInterceptionTargetPageRequest request) {
            super(request);
            this.appName = request.appName;
            this.currentPage = request.currentPage;
            this.imageList = request.imageList;
            this.namespace = request.namespace;
            this.pageSize = request.pageSize;
            this.tagList = request.tagList;
            this.targetName = request.targetName;
            this.targetType = request.targetType;
        } 

        /**
         * <p>The name of the application to which the network object belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>frontend</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The images of the network object.</p>
         */
        public Builder imageList(java.util.List<String> imageList) {
            this.putQueryParameter("ImageList", imageList);
            this.imageList = imageList;
            return this;
        }

        /**
         * <p>The namespace to which the network object belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
         * <blockquote>
         * <p>We recommend that you do not leave this parameter empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The labels specified for the network object.</p>
         */
        public Builder tagList(java.util.List<String> tagList) {
            this.putQueryParameter("TagList", tagList);
            this.tagList = tagList;
            return this;
        }

        /**
         * <p>The name of the network object.</p>
         * 
         * <strong>example:</strong>
         * <p>source-test-obj-0****</p>
         */
        public Builder targetName(String targetName) {
            this.putQueryParameter("TargetName", targetName);
            this.targetName = targetName;
            return this;
        }

        /**
         * <p>The type of the network object. Valid values:</p>
         * <ul>
         * <li>IMAGE</li>
         * </ul>
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
        public ListInterceptionTargetPageRequest build() {
            return new ListInterceptionTargetPageRequest(this);
        } 

    } 

}
