// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DissociateParameterSetRequest} extends {@link RequestModel}
 *
 * <p>DissociateParameterSetRequest</p>
 */
public class DissociateParameterSetRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parameterSetIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > parameterSetIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    private DissociateParameterSetRequest(Builder builder) {
        super(builder);
        this.parameterSetIds = builder.parameterSetIds;
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DissociateParameterSetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return parameterSetIds
     */
    public java.util.List < String > getParameterSetIds() {
        return this.parameterSetIds;
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

    public static final class Builder extends Request.Builder<DissociateParameterSetRequest, Builder> {
        private java.util.List < String > parameterSetIds; 
        private String resourceId; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(DissociateParameterSetRequest request) {
            super(request);
            this.parameterSetIds = request.parameterSetIds;
            this.resourceId = request.resourceId;
            this.resourceType = request.resourceType;
        } 

        /**
         * parameterSetIds.
         */
        public Builder parameterSetIds(java.util.List < String > parameterSetIds) {
            this.putBodyParameter("parameterSetIds", parameterSetIds);
            this.parameterSetIds = parameterSetIds;
            return this;
        }

        /**
         * resourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putBodyParameter("resourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * resourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("resourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public DissociateParameterSetRequest build() {
            return new DissociateParameterSetRequest(this);
        } 

    } 

}
