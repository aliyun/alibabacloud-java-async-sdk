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
 * {@link RevertGraphDraftResourceRequest} extends {@link RequestModel}
 *
 * <p>RevertGraphDraftResourceRequest</p>
 */
public class RevertGraphDraftResourceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("draftChangeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long draftChangeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("graphName")
    private String graphName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private RevertGraphDraftResourceRequest(Builder builder) {
        super(builder);
        this.draftChangeId = builder.draftChangeId;
        this.graphName = builder.graphName;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevertGraphDraftResourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return draftChangeId
     */
    public Long getDraftChangeId() {
        return this.draftChangeId;
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

    public static final class Builder extends Request.Builder<RevertGraphDraftResourceRequest, Builder> {
        private Long draftChangeId; 
        private String graphName; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(RevertGraphDraftResourceRequest request) {
            super(request);
            this.draftChangeId = request.draftChangeId;
            this.graphName = request.graphName;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The draft change ID (the draftChangeId returned by listGraphDraftResources).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>401001</p>
         */
        public Builder draftChangeId(Long draftChangeId) {
            this.putBodyParameter("draftChangeId", draftChangeId);
            this.draftChangeId = draftChangeId;
            return this;
        }

        /**
         * <p>The knowledge graph name.</p>
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
         * <p>The tenant ID. This is a common parameter. Pass it explicitly by using --tenant-id in winnexo-cli.</p>
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
        public RevertGraphDraftResourceRequest build() {
            return new RevertGraphDraftResourceRequest(this);
        } 

    } 

}
