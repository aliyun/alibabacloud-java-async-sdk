// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTagsRequest} extends {@link RequestModel}
 *
 * <p>ListTagsRequest</p>
 */
public class ListTagsRequest extends Request {
    @Query
    @NameInMap("pageSize")
    @Validation(maximum = 50, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("resourceType")
    private String resourceType;

    private ListTagsRequest(Builder builder) {
        super(builder);
        this.pageSize = builder.pageSize;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTagsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<ListTagsRequest, Builder> {
        private Integer pageSize; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(ListTagsRequest request) {
            super(request);
            this.pageSize = request.pageSize;
            this.resourceType = request.resourceType;
        } 

        /**
         * The return results.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The tag value of the ENI.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("resourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public ListTagsRequest build() {
            return new ListTagsRequest(this);
        } 

    } 

}
