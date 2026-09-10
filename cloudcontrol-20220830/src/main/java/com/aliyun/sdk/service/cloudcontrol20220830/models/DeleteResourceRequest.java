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
         * <p>The URI of the request. The format is: /api/v1/providers/{provider}/products/{product}/resources/{resourceType}/{resourceId}</p>
         * <p>The variables in the request URI are described as follows:</p>
         * <p>provider: The cloud provider. Currently, only Aliyun is supported.</p>
         * <p>product: The product code.</p>
         * <p>resourceType: The resource type. If a parent resource exists, the format is <code>{parent resource type code}/{parent resource ID}/{resource type code}</code>.</p>
         * <p>resourceId: The resource ID.</p>
         */
        public Builder requestPath(String requestPath) {
            this.putPathParameter("requestPath", requestPath);
            this.requestPath = requestPath;
            return this;
        }

        /**
         * <p>A client token to ensure idempotence. This parameter works only if the cloud product supports idempotence.</p>
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
         * <p>The region ID. This parameter is required if the cloud product is region-specific.</p>
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
