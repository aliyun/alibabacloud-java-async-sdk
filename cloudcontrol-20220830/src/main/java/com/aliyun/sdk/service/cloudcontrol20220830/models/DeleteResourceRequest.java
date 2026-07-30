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
 * {@link DeleteResourceRequest} extends {@link RequestModel}
 *
 * <p>DeleteResourceRequest</p>
 */
public class DeleteResourceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("requestPath")
    private String requestPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("filter")
    private java.util.Map<String, ?> filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private DeleteResourceRequest(Builder builder) {
        super(builder);
        this.requestPath = builder.requestPath;
        this.clientToken = builder.clientToken;
        this.filter = builder.filter;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteResourceRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return filter
     */
    public java.util.Map<String, ?> getFilter() {
        return this.filter;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteResourceRequest, Builder> {
        private String requestPath; 
        private String clientToken; 
        private java.util.Map<String, ?> filter; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteResourceRequest request) {
            super(request);
            this.requestPath = request.requestPath;
            this.clientToken = request.clientToken;
            this.filter = request.filter;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The request path. Specify this parameter in the following format: /api/v1/providers/{provider}/products/{product}/resources/{resourceType}/{resourceId}</p>
         * <p>Variables in the request path:</p>
         * <p>provider: the Cloud service provider. Only Aliyun is supported.</p>
         * <p>product: the code of the service.</p>
         * <p>ResourceType: the type of resources. If parent resource is specified, the format is {parent resource type code}/parent resource ID/{resource type code}.</p>
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
         * filter.
         */
        public Builder filter(java.util.Map<String, ?> filter) {
            String filterShrink = shrink(filter, "filter", "json");
            this.putQueryParameter("filter", filterShrink);
            this.filter = filter;
            return this;
        }

        /**
         * <p>The region. This parameter is required if a cloud service is a regionalized.</p>
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
        public DeleteResourceRequest build() {
            return new DeleteResourceRequest(this);
        } 

    } 

}
