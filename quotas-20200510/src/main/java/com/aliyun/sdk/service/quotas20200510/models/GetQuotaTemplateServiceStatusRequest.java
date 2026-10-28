// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

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
 * {@link GetQuotaTemplateServiceStatusRequest} extends {@link RequestModel}
 *
 * <p>GetQuotaTemplateServiceStatusRequest</p>
 */
public class GetQuotaTemplateServiceStatusRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryId")
    private String resourceDirectoryId;

    private GetQuotaTemplateServiceStatusRequest(Builder builder) {
        super(builder);
        this.resourceDirectoryId = builder.resourceDirectoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQuotaTemplateServiceStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceDirectoryId
     */
    public String getResourceDirectoryId() {
        return this.resourceDirectoryId;
    }

    public static final class Builder extends Request.Builder<GetQuotaTemplateServiceStatusRequest, Builder> {
        private String resourceDirectoryId; 

        private Builder() {
            super();
        } 

        private Builder(GetQuotaTemplateServiceStatusRequest request) {
            super(request);
            this.resourceDirectoryId = request.resourceDirectoryId;
        } 

        /**
         * <p>The ID of the resource directory.</p>
         * 
         * <strong>example:</strong>
         * <p>rd-pG****</p>
         */
        public Builder resourceDirectoryId(String resourceDirectoryId) {
            this.putBodyParameter("ResourceDirectoryId", resourceDirectoryId);
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }

        @Override
        public GetQuotaTemplateServiceStatusRequest build() {
            return new GetQuotaTemplateServiceStatusRequest(this);
        } 

    } 

}
