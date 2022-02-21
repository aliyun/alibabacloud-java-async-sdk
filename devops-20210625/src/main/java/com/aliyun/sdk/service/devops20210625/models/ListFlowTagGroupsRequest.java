// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFlowTagGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListFlowTagGroupsRequest</p>
 */
public class ListFlowTagGroupsRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    private ListFlowTagGroupsRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFlowTagGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<ListFlowTagGroupsRequest, Builder> {
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(ListFlowTagGroupsRequest response) {
            super(response);
            this.organizationId = response.organizationId;
        } 

        /**
         * 企业标识，也称企业id，字符串形式，可在云效访问链接中获取，如https://devops.aliyun.com/organization/【OrganizationId】
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        @Override
        public ListFlowTagGroupsRequest build() {
            return new ListFlowTagGroupsRequest(this);
        } 

    } 

}
