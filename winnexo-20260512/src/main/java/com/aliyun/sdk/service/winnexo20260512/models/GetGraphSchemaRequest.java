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
 * {@link GetGraphSchemaRequest} extends {@link RequestModel}
 *
 * <p>GetGraphSchemaRequest</p>
 */
public class GetGraphSchemaRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("graphName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String graphName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    private GetGraphSchemaRequest(Builder builder) {
        super(builder);
        this.graphName = builder.graphName;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGraphSchemaRequest create() {
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

    public static final class Builder extends Request.Builder<GetGraphSchemaRequest, Builder> {
        private String graphName; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(GetGraphSchemaRequest request) {
            super(request);
            this.graphName = request.graphName;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>图谱名称，可先调用 listGraphs 获取</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder graphName(String graphName) {
            this.putBodyParameter("graphName", graphName);
            this.graphName = graphName;
            return this;
        }

        /**
         * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>21577</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public GetGraphSchemaRequest build() {
            return new GetGraphSchemaRequest(this);
        } 

    } 

}
