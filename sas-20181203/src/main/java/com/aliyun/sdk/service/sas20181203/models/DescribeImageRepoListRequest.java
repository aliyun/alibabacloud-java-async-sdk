// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageRepoListRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageRepoListRequest</p>
 */
public class DescribeImageRepoListRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("FieldName")
    private String fieldName;

    @Query
    @NameInMap("FieldValue")
    private String fieldValue;

    @Query
    @NameInMap("OperateType")
    private String operateType;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RepoName")
    private String repoName;

    @Query
    @NameInMap("RepoNamespace")
    private String repoNamespace;

    @Query
    @NameInMap("TargetType")
    @Validation(required = true)
    private String targetType;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private DescribeImageRepoListRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.fieldName = builder.fieldName;
        this.fieldValue = builder.fieldValue;
        this.operateType = builder.operateType;
        this.pageSize = builder.pageSize;
        this.repoName = builder.repoName;
        this.repoNamespace = builder.repoNamespace;
        this.targetType = builder.targetType;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageRepoListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return fieldName
     */
    public String getFieldName() {
        return this.fieldName;
    }

    /**
     * @return fieldValue
     */
    public String getFieldValue() {
        return this.fieldValue;
    }

    /**
     * @return operateType
     */
    public String getOperateType() {
        return this.operateType;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return repoName
     */
    public String getRepoName() {
        return this.repoName;
    }

    /**
     * @return repoNamespace
     */
    public String getRepoNamespace() {
        return this.repoNamespace;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeImageRepoListRequest, Builder> {
        private Integer currentPage; 
        private String fieldName; 
        private String fieldValue; 
        private String operateType; 
        private Integer pageSize; 
        private String repoName; 
        private String repoNamespace; 
        private String targetType; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImageRepoListRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.fieldName = request.fieldName;
            this.fieldValue = request.fieldValue;
            this.operateType = request.operateType;
            this.pageSize = request.pageSize;
            this.repoName = request.repoName;
            this.repoNamespace = request.repoNamespace;
            this.targetType = request.targetType;
            this.type = request.type;
        } 

        /**
         * The type of the feature. Valid values:
         * <p>
         * 
         * *   **image_repo**: image repository protection
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Indicates whether the feature takes effect on the image repository. Valid values:
         * <p>
         * 
         * *   **add**: yes
         * *   **del**: no
         */
        public Builder fieldName(String fieldName) {
            this.putQueryParameter("FieldName", fieldName);
            this.fieldName = fieldName;
            return this;
        }

        /**
         * The namespace to which the image repository belongs.
         */
        public Builder fieldValue(String fieldValue) {
            this.putQueryParameter("FieldValue", fieldValue);
            this.fieldValue = fieldValue;
            return this;
        }

        /**
         * The pagination information.
         */
        public Builder operateType(String operateType) {
            this.putQueryParameter("OperateType", operateType);
            this.operateType = operateType;
            return this;
        }

        /**
         * The type of the operation. Valid values:
         * <p>
         * 
         * *   **count**: counts statistics
         * *   **other**: others
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The number of entries returned on the current page.
         */
        public Builder repoName(String repoName) {
            this.putQueryParameter("RepoName", repoName);
            this.repoName = repoName;
            return this;
        }

        /**
         * The name of the image repository.
         */
        public Builder repoNamespace(String repoNamespace) {
            this.putQueryParameter("RepoNamespace", repoNamespace);
            this.repoNamespace = repoNamespace;
            return this;
        }

        /**
         * The total number of image repositories.
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * The information about the image repository.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeImageRepoListRequest build() {
            return new DescribeImageRepoListRequest(this);
        } 

    } 

}
