// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcontrol20220830.models;

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
 * {@link UpdateResourceRequest} extends {@link RequestModel}
 *
 * <p>UpdateResourceRequest</p>
 */
public class UpdateResourceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("requestPath")
    private String requestPath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.Map<String, ?> body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private UpdateResourceRequest(Builder builder) {
        super(builder);
        this.requestPath = builder.requestPath;
        this.body = builder.body;
        this.clientToken = builder.clientToken;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateResourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestPath
     */
    public String getRequestPath() {
        return this.requestPath;
    }

    /**
     * @return body
     */
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateResourceRequest, Builder> {
        private String requestPath; 
        private java.util.Map<String, ?> body; 
        private String clientToken; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateResourceRequest request) {
            super(request);
            this.requestPath = request.requestPath;
            this.body = request.body;
            this.clientToken = request.clientToken;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The request path. Specify this parameter in the following format: /api/v1/providers/{provider}/products/{product}/resources/{resourceType}/{resourceId}</p>
         * <p>Variables in the request path:</p>
         * <p>provider: the Cloud service provider. Only Aliyun is supported.</p>
         * <p>product: the code of the service.</p>
         * <p>resourceType: the type of resources. If parent resource is specified, the format is {parent resource type code}/parent resource ID/{resource type code}.</p>
         * <p>resourceId: the resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>/api/v1/providers/Aliyun/products/Redis/resources/Instance/r-8vbf5abe31cxxxxx/Account/cctest</p>
         */
        public Builder requestPath(String requestPath) {
            this.putPathParameter("requestPath", requestPath);
            this.requestPath = requestPath;
            return this;
        }

        /**
         * <p>The request body. The property of the resource to be updated is specified in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *      &quot;AccountPassword&quot;: &quot;4321****&quot;,
         *      &quot;Description&quot;: &quot;cctest&quot;
         * }</p>
         */
        public Builder body(java.util.Map<String, ?> body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. If a cloud service supports idempotence, the parameter takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>1e810dfe1468721d0664a49b9d9f74f4</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The region ID. This parameter is required if a cloud service is a regionalized.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateResourceRequest build() {
            return new UpdateResourceRequest(this);
        } 

    } 

}
