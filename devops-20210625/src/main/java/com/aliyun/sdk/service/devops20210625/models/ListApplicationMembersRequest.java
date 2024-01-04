// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListApplicationMembersRequest} extends {@link RequestModel}
 *
 * <p>ListApplicationMembersRequest</p>
 */
public class ListApplicationMembersRequest extends Request {
    @Path
    @NameInMap("appName")
    private String appName;

    @Query
    @NameInMap("organizationId")
    private String organizationId;

    private ListApplicationMembersRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationMembersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<ListApplicationMembersRequest, Builder> {
        private String appName; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(ListApplicationMembersRequest request) {
            super(request);
            this.appName = request.appName;
            this.organizationId = request.organizationId;
        } 

        /**
         * appName.
         */
        public Builder appName(String appName) {
            this.putPathParameter("appName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        @Override
        public ListApplicationMembersRequest build() {
            return new ListApplicationMembersRequest(this);
        } 

    } 

}
