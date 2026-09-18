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
 * {@link UpdateGraphInfoRequest} extends {@link RequestModel}
 *
 * <p>UpdateGraphInfoRequest</p>
 */
public class UpdateGraphInfoRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("businessProfile")
    private String businessProfile;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("displayName")
    private String displayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("graphName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String graphName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private UpdateGraphInfoRequest(Builder builder) {
        super(builder);
        this.businessProfile = builder.businessProfile;
        this.displayName = builder.displayName;
        this.graphName = builder.graphName;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGraphInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessProfile
     */
    public String getBusinessProfile() {
        return this.businessProfile;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
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

    public static final class Builder extends Request.Builder<UpdateGraphInfoRequest, Builder> {
        private String businessProfile; 
        private String displayName; 
        private String graphName; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGraphInfoRequest request) {
            super(request);
            this.businessProfile = request.businessProfile;
            this.displayName = request.displayName;
            this.graphName = request.graphName;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The business description of the knowledge graph. If not configured, the value is an empty string.</p>
         * 
         * <strong>example:</strong>
         * <p>Customer domain knowledge graph</p>
         */
        public Builder businessProfile(String businessProfile) {
            this.putBodyParameter("businessProfile", businessProfile);
            this.businessProfile = businessProfile;
            return this;
        }

        /**
         * <p>The display name of the knowledge graph.</p>
         * 
         * <strong>example:</strong>
         * <p>CRM Graph</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("displayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The name of the knowledge graph.</p>
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
         * <p>The tenant ID.</p>
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
        public UpdateGraphInfoRequest build() {
            return new UpdateGraphInfoRequest(this);
        } 

    } 

}
