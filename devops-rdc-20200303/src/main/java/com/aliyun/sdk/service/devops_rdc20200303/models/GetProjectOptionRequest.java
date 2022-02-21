// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProjectOptionRequest} extends {@link RequestModel}
 *
 * <p>GetProjectOptionRequest</p>
 */
public class GetProjectOptionRequest extends Request {
    @Body
    @NameInMap("OrgId")
    @Validation(required = true)
    private String orgId;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Body
    @NameInMap("Query")
    private String query;

    @Body
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private GetProjectOptionRequest(Builder builder) {
        super(builder);
        this.orgId = builder.orgId;
        this.projectId = builder.projectId;
        this.query = builder.query;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProjectOptionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orgId
     */
    public String getOrgId() {
        return this.orgId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetProjectOptionRequest, Builder> {
        private String orgId; 
        private String projectId; 
        private String query; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetProjectOptionRequest response) {
            super(response);
            this.orgId = response.orgId;
            this.projectId = response.projectId;
            this.query = response.query;
            this.type = response.type;
        } 

        /**
         * OrgId.
         */
        public Builder orgId(String orgId) {
            this.putBodyParameter("OrgId", orgId);
            this.orgId = orgId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * Query.
         */
        public Builder query(String query) {
            this.putBodyParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetProjectOptionRequest build() {
            return new GetProjectOptionRequest(this);
        } 

    } 

}
