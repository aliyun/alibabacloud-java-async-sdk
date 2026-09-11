// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link GetGraphSchemaDetailRequest} extends {@link RequestModel}
 *
 * <p>GetGraphSchemaDetailRequest</p>
 */
public class GetGraphSchemaDetailRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("graphName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String graphName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private GetGraphSchemaDetailRequest(Builder builder) {
        super(builder);
        this.graphName = builder.graphName;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGraphSchemaDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return graphName
     */
    public String getGraphName() {
        return this.graphName;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<GetGraphSchemaDetailRequest, Builder> {
        private String graphName; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(GetGraphSchemaDetailRequest request) {
            super(request);
            this.graphName = request.graphName;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The name of the graph.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>crm_graph</p>
         */
        public Builder graphName(String graphName) {
            this.putBodyParameter("graphName", graphName);
            this.graphName = graphName;
            return this;
        }

        /**
         * <p>The tenant ID. This is a common parameter. You can pass this parameter explicitly by using <code>--tenant-id</code> in winnexo-cli.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public GetGraphSchemaDetailRequest build() {
            return new GetGraphSchemaDetailRequest(this);
        } 

    } 

}
