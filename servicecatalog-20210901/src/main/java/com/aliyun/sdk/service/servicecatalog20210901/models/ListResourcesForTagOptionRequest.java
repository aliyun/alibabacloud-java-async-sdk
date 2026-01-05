// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

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
 * {@link ListResourcesForTagOptionRequest} extends {@link RequestModel}
 *
 * <p>ListResourcesForTagOptionRequest</p>
 */
public class ListResourcesForTagOptionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagOptionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tagOptionId;

    private ListResourcesForTagOptionRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceType = builder.resourceType;
        this.tagOptionId = builder.tagOptionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourcesForTagOptionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return tagOptionId
     */
    public String getTagOptionId() {
        return this.tagOptionId;
    }

    public static final class Builder extends Request.Builder<ListResourcesForTagOptionRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceType; 
        private String tagOptionId; 

        private Builder() {
            super();
        } 

        private Builder(ListResourcesForTagOptionRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceType = request.resourceType;
            this.tagOptionId = request.tagOptionId;
        } 

        /**
         * <p>The number of the page to return.</p>
         * <p>Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * <p>Valid values: 1 to 100 Minimum value: 1. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The type of resource that is associated with the tag option. Valid values:</p>
         * <ul>
         * <li>product: product</li>
         * <li>Portfolio: product portfolio</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Product</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The ID of the tag option.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-bp1u6mdf3d****</p>
         */
        public Builder tagOptionId(String tagOptionId) {
            this.putQueryParameter("TagOptionId", tagOptionId);
            this.tagOptionId = tagOptionId;
            return this;
        }

        @Override
        public ListResourcesForTagOptionRequest build() {
            return new ListResourcesForTagOptionRequest(this);
        } 

    } 

}
