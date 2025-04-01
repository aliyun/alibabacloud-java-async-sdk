// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link UpdateWebApplicationScalingConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateWebApplicationScalingConfigRequest</p>
 */
public class UpdateWebApplicationScalingConfigRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private UpdateWebApplicationScalingConfigInput body;

    private UpdateWebApplicationScalingConfigRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.namespaceId = builder.namespaceId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWebApplicationScalingConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return body
     */
    public UpdateWebApplicationScalingConfigInput getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateWebApplicationScalingConfigRequest, Builder> {
        private String applicationId; 
        private String namespaceId; 
        private UpdateWebApplicationScalingConfigInput body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWebApplicationScalingConfigRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.namespaceId = request.namespaceId;
            this.body = request.body;
        } 

        /**
         * <p>The application ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0099b7be-5f5b-4512-a7fc-56049ef1****</p>
         */
        public Builder applicationId(String applicationId) {
            this.putPathParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The namespace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing:test</p>
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * <p>The information about scaling configurations.</p>
         * <p>This parameter is required.</p>
         */
        public Builder body(UpdateWebApplicationScalingConfigInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateWebApplicationScalingConfigRequest build() {
            return new UpdateWebApplicationScalingConfigRequest(this);
        } 

    } 

}
