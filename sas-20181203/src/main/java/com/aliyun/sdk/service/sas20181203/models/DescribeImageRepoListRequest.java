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
 * {@link DescribeImageRepoListRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageRepoListRequest</p>
 */
public class DescribeImageRepoListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FieldName")
    private String fieldName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FieldValue")
    private String fieldValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperateType")
    private String operateType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepoName")
    private String repoName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepoNamespace")
    private String repoNamespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The name of the field that is used for the query. Valid values:</p>
         * <ul>
         * <li><strong>repoName</strong>: the name of the image repository</li>
         * <li><strong>repoNamespace</strong>: the namespace to which the image repository belongs</li>
         * </ul>
         * <blockquote>
         * <p> This parameter takes effect only when the <strong>OperateType</strong> parameter is set to <strong>other</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>repoName</p>
         */
        public Builder fieldName(String fieldName) {
            this.putQueryParameter("FieldName", fieldName);
            this.fieldName = fieldName;
            return this;
        }

        /**
         * <p>The value of the field that is used for the query.</p>
         * <blockquote>
         * <p> This parameter takes effect only when the <strong>OperateType</strong> parameter is set to <strong>other</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>zeus</p>
         */
        public Builder fieldValue(String fieldValue) {
            this.putQueryParameter("FieldValue", fieldValue);
            this.fieldValue = fieldValue;
            return this;
        }

        /**
         * <p>The type of the operation. Valid values:</p>
         * <ul>
         * <li><strong>count</strong>: counts statistics</li>
         * <li><strong>other</strong>: others</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>count</p>
         */
        public Builder operateType(String operateType) {
            this.putQueryParameter("OperateType", operateType);
            this.operateType = operateType;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
         * <blockquote>
         * <p> We recommend that you do not leave this parameter empty.</p>
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
         * <p>The name of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>script7</p>
         */
        public Builder repoName(String repoName) {
            this.putQueryParameter("RepoName", repoName);
            this.repoName = repoName;
            return this;
        }

        /**
         * <p>The namespace to which the image repository belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>libssh2</p>
         */
        public Builder repoNamespace(String repoNamespace) {
            this.putQueryParameter("RepoNamespace", repoNamespace);
            this.repoNamespace = repoNamespace;
            return this;
        }

        /**
         * <p>The condition by which the feature is applied. Valid values:</p>
         * <ul>
         * <li><strong>image_repo</strong>: the ID of the image repository</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>image_repo</p>
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * <p>The type of the feature. Valid values:</p>
         * <ul>
         * <li><strong>image_repo</strong>: image repository protection</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>image_repo</p>
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
