// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link GetSupabaseProjectDashboardAccountResponseBody} extends {@link TeaModel}
 *
 * <p>GetSupabaseProjectDashboardAccountResponseBody</p>
 */
public class GetSupabaseProjectDashboardAccountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DashboardPassword")
    private String dashboardPassword;

    @com.aliyun.core.annotation.NameInMap("DashboardUsername")
    private String dashboardUsername;

    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetSupabaseProjectDashboardAccountResponseBody(Builder builder) {
        this.dashboardPassword = builder.dashboardPassword;
        this.dashboardUsername = builder.dashboardUsername;
        this.projectId = builder.projectId;
        this.projectName = builder.projectName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSupabaseProjectDashboardAccountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dashboardPassword
     */
    public String getDashboardPassword() {
        return this.dashboardPassword;
    }

    /**
     * @return dashboardUsername
     */
    public String getDashboardUsername() {
        return this.dashboardUsername;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String dashboardPassword; 
        private String dashboardUsername; 
        private String projectId; 
        private String projectName; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetSupabaseProjectDashboardAccountResponseBody model) {
            this.dashboardPassword = model.dashboardPassword;
            this.dashboardUsername = model.dashboardUsername;
            this.projectId = model.projectId;
            this.projectName = model.projectName;
            this.requestId = model.requestId;
        } 

        /**
         * DashboardPassword.
         */
        public Builder dashboardPassword(String dashboardPassword) {
            this.dashboardPassword = dashboardPassword;
            return this;
        }

        /**
         * DashboardUsername.
         */
        public Builder dashboardUsername(String dashboardUsername) {
            this.dashboardUsername = dashboardUsername;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSupabaseProjectDashboardAccountResponseBody build() {
            return new GetSupabaseProjectDashboardAccountResponseBody(this);
        } 

    } 

}
