// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bsn20150512.models;

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
 * {@link GetBsnByResourceRequest} extends {@link RequestModel}
 *
 * <p>GetBsnByResourceRequest</p>
 */
public class GetBsnByResourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("aliuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long aliuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer resourceType;

    private GetBsnByResourceRequest(Builder builder) {
        super(builder);
        this.aliuid = builder.aliuid;
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBsnByResourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliuid
     */
    public Long getAliuid() {
        return this.aliuid;
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
    public Integer getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<GetBsnByResourceRequest, Builder> {
        private Long aliuid; 
        private String resourceId; 
        private Integer resourceType; 

        private Builder() {
            super();
        } 

        private Builder(GetBsnByResourceRequest request) {
            super(request);
            this.aliuid = request.aliuid;
            this.resourceId = request.resourceId;
            this.resourceType = request.resourceType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        public Builder aliuid(Long aliuid) {
            this.putQueryParameter("aliuid", aliuid);
            this.aliuid = aliuid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3097938</p>
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("resourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alicloud_edas_application_scale</p>
         */
        public Builder resourceType(Integer resourceType) {
            this.putQueryParameter("resourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public GetBsnByResourceRequest build() {
            return new GetBsnByResourceRequest(this);
        } 

    } 

}
