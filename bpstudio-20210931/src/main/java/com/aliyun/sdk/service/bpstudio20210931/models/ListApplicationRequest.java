// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListApplicationRequest} extends {@link RequestModel}
 *
 * <p>ListApplicationRequest</p>
 */
public class ListApplicationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 50, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 10000, minimum = 1)
    private Integer nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrderType")
    @com.aliyun.core.annotation.Validation(maximum = 10, minimum = 1)
    private Long orderType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    private ListApplicationRequest(Builder builder) {
        super(builder);
        this.keyword = builder.keyword;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.orderType = builder.orderType;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceId = builder.resourceId;
        this.status = builder.status;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public Integer getNextToken() {
        return this.nextToken;
    }

    /**
     * @return orderType
     */
    public Long getOrderType() {
        return this.orderType;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<ListApplicationRequest, Builder> {
        private String keyword; 
        private Integer maxResults; 
        private Integer nextToken; 
        private Long orderType; 
        private String resourceGroupId; 
        private String resourceId; 
        private String status; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(ListApplicationRequest request) {
            super(request);
            this.keyword = request.keyword;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.orderType = request.orderType;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceId = request.resourceId;
            this.status = request.status;
            this.templateId = request.templateId;
        } 

        /**
         * <p>Keywords in the app name</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder keyword(String keyword) {
            this.putBodyParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The pagination size of the resulting value cannot be less than the minimum value of 1 and cannot be greater than the maximum value of 50.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination page number of the resulting value cannot be less than the minimum value of 1 and cannot be greater than the maximum value of 10000.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder nextToken(Integer nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>1 update time,<br>2 creation time</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder orderType(Long orderType) {
            this.putBodyParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Resource Id</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-xxxxxxxxxxxx</p>
         */
        public Builder resourceId(String resourceId) {
            this.putBodyParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The status of the applications to be returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The following values are &quot;success&quot; and &quot;release&quot;.
         * If the input value is &quot;success&quot;, the returned application list includes all applications in the Deployed_Success state of successful deployment.
         * If the input value is release, the returned application list includes all applications in the release success (Destroyed_Success) and release failure (Destroyed_Failure) status.
         * If this parameter is left blank, the returned app list includes apps in all states.</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>Template Id</p>
         * 
         * <strong>example:</strong>
         * <p>0KSXXX6SJU03TXXX</p>
         */
        public Builder templateId(String templateId) {
            this.putBodyParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public ListApplicationRequest build() {
            return new ListApplicationRequest(this);
        } 

    } 

}
