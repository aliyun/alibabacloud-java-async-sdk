// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOrganizationSettingTabsRequest} extends {@link RequestModel}
 *
 * <p>GetOrganizationSettingTabsRequest</p>
 */
public class GetOrganizationSettingTabsRequest extends Request {
    @Path
    @NameInMap("organizationId")
    private String organizationId;

    private GetOrganizationSettingTabsRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOrganizationSettingTabsRequest create() {
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

    public static final class Builder extends Request.Builder<GetOrganizationSettingTabsRequest, Builder> {
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(GetOrganizationSettingTabsRequest response) {
            super(response);
            this.organizationId = response.organizationId;
        } 

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        @Override
        public GetOrganizationSettingTabsRequest build() {
            return new GetOrganizationSettingTabsRequest(this);
        } 

    } 

}
