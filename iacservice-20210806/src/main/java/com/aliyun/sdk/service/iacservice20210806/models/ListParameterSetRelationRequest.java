// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListParameterSetRelationRequest} extends {@link RequestModel}
 *
 * <p>ListParameterSetRelationRequest</p>
 */
public class ListParameterSetRelationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    private ListParameterSetRelationRequest(Builder builder) {
        super(builder);
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListParameterSetRelationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<ListParameterSetRelationRequest, Builder> {
        private String resourceId; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(ListParameterSetRelationRequest request) {
            super(request);
            this.resourceId = request.resourceId;
            this.resourceType = request.resourceType;
        } 

        /**
         * resourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("resourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * resourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("resourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public ListParameterSetRelationRequest build() {
            return new ListParameterSetRelationRequest(this);
        } 

    } 

}
