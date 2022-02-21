// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCommonGroupRequest} extends {@link RequestModel}
 *
 * <p>ListCommonGroupRequest</p>
 */
public class ListCommonGroupRequest extends Request {
    @Body
    @NameInMap("All")
    @Validation(required = true)
    private Boolean all;

    @Body
    @NameInMap("OrgId")
    @Validation(required = true)
    private String orgId;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Body
    @NameInMap("SmartGroupId")
    @Validation(required = true)
    private String smartGroupId;

    private ListCommonGroupRequest(Builder builder) {
        super(builder);
        this.all = builder.all;
        this.orgId = builder.orgId;
        this.projectId = builder.projectId;
        this.smartGroupId = builder.smartGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCommonGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return all
     */
    public Boolean getAll() {
        return this.all;
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
     * @return smartGroupId
     */
    public String getSmartGroupId() {
        return this.smartGroupId;
    }

    public static final class Builder extends Request.Builder<ListCommonGroupRequest, Builder> {
        private Boolean all; 
        private String orgId; 
        private String projectId; 
        private String smartGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ListCommonGroupRequest response) {
            super(response);
            this.all = response.all;
            this.orgId = response.orgId;
            this.projectId = response.projectId;
            this.smartGroupId = response.smartGroupId;
        } 

        /**
         * All.
         */
        public Builder all(Boolean all) {
            this.putBodyParameter("All", all);
            this.all = all;
            return this;
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
         * SmartGroupId.
         */
        public Builder smartGroupId(String smartGroupId) {
            this.putBodyParameter("SmartGroupId", smartGroupId);
            this.smartGroupId = smartGroupId;
            return this;
        }

        @Override
        public ListCommonGroupRequest build() {
            return new ListCommonGroupRequest(this);
        } 

    } 

}
