// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInterceptionTargetPageRequest} extends {@link RequestModel}
 *
 * <p>ListInterceptionTargetPageRequest</p>
 */
public class ListInterceptionTargetPageRequest extends Request {
    @Query
    @NameInMap("AppName")
    private String appName;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("ImageList")
    private java.util.List < String > imageList;

    @Query
    @NameInMap("Namespace")
    private String namespace;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("TagList")
    private java.util.List < String > tagList;

    @Query
    @NameInMap("TargetName")
    private String targetName;

    @Query
    @NameInMap("TargetType")
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
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    public static final class Builder extends Request.Builder<ListInterceptionTargetPageRequest, Builder> {
        private String appName; 
        private Integer currentPage; 
        private java.util.List < String > imageList; 
        private String namespace; 
        private Integer pageSize; 
        private java.util.List < String > tagList; 
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
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * ImageList.
         */
        public Builder imageList(java.util.List < String > imageList) {
            this.putQueryParameter("ImageList", imageList);
            this.imageList = imageList;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * TagList.
         */
        public Builder tagList(java.util.List < String > tagList) {
            this.putQueryParameter("TagList", tagList);
            this.tagList = tagList;
            return this;
        }

        /**
         * TargetName.
         */
        public Builder targetName(String targetName) {
            this.putQueryParameter("TargetName", targetName);
            this.targetName = targetName;
            return this;
        }

        /**
         * TargetType.
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
