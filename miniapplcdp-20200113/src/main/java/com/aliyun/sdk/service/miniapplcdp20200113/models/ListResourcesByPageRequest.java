// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourcesByPageRequest} extends {@link RequestModel}
 *
 * <p>ListResourcesByPageRequest</p>
 */
public class ListResourcesByPageRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("ImageProcessParameter")
    private String imageProcessParameter;

    @Query
    @NameInMap("ModuleId")
    private String moduleId;

    @Query
    @NameInMap("PageNumber")
    @Validation(maximum = 1000, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 1000, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("ResourceId")
    private String resourceId;

    @Query
    @NameInMap("ResourceName")
    private String resourceName;

    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    @Query
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("WithContent")
    private Boolean withContent;

    private ListResourcesByPageRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.description = builder.description;
        this.imageProcessParameter = builder.imageProcessParameter;
        this.moduleId = builder.moduleId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceId = builder.resourceId;
        this.resourceName = builder.resourceName;
        this.resourceType = builder.resourceType;
        this.source = builder.source;
        this.withContent = builder.withContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourcesByPageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return imageProcessParameter
     */
    public String getImageProcessParameter() {
        return this.imageProcessParameter;
    }

    /**
     * @return moduleId
     */
    public String getModuleId() {
        return this.moduleId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceName
     */
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return withContent
     */
    public Boolean getWithContent() {
        return this.withContent;
    }

    public static final class Builder extends Request.Builder<ListResourcesByPageRequest, Builder> {
        private String appId; 
        private String description; 
        private String imageProcessParameter; 
        private String moduleId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceId; 
        private String resourceName; 
        private String resourceType; 
        private String source; 
        private Boolean withContent; 

        private Builder() {
            super();
        } 

        private Builder(ListResourcesByPageRequest request) {
            super(request);
            this.appId = request.appId;
            this.description = request.description;
            this.imageProcessParameter = request.imageProcessParameter;
            this.moduleId = request.moduleId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceId = request.resourceId;
            this.resourceName = request.resourceName;
            this.resourceType = request.resourceType;
            this.source = request.source;
            this.withContent = request.withContent;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * ImageProcessParameter.
         */
        public Builder imageProcessParameter(String imageProcessParameter) {
            this.putQueryParameter("ImageProcessParameter", imageProcessParameter);
            this.imageProcessParameter = imageProcessParameter;
            return this;
        }

        /**
         * ModuleId.
         */
        public Builder moduleId(String moduleId) {
            this.putQueryParameter("ModuleId", moduleId);
            this.moduleId = moduleId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * ResourceName.
         */
        public Builder resourceName(String resourceName) {
            this.putQueryParameter("ResourceName", resourceName);
            this.resourceName = resourceName;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * WithContent.
         */
        public Builder withContent(Boolean withContent) {
            this.putQueryParameter("WithContent", withContent);
            this.withContent = withContent;
            return this;
        }

        @Override
        public ListResourcesByPageRequest build() {
            return new ListResourcesByPageRequest(this);
        } 

    } 

}
