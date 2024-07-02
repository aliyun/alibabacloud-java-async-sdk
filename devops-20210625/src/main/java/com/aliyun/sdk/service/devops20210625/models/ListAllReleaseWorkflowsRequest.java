// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAllReleaseWorkflowsRequest} extends {@link RequestModel}
 *
 * <p>ListAllReleaseWorkflowsRequest</p>
 */
public class ListAllReleaseWorkflowsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("organizationId")
    private String organizationId;

    private ListAllReleaseWorkflowsRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAllReleaseWorkflowsRequest create() {
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

    public static final class Builder extends Request.Builder<ListAllReleaseWorkflowsRequest, Builder> {
        private String appName; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(ListAllReleaseWorkflowsRequest request) {
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
        public ListAllReleaseWorkflowsRequest build() {
            return new ListAllReleaseWorkflowsRequest(this);
        } 

    } 

}
