// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link ListJoinedOrganizationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListJoinedOrganizationsResponseBody</p>
 */
public class ListJoinedOrganizationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("organizations")
    private java.util.List<Organizations> organizations;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private ListJoinedOrganizationsResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.organizations = builder.organizations;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJoinedOrganizationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return organizations
     */
    public java.util.List<Organizations> getOrganizations() {
        return this.organizations;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private java.util.List<Organizations> organizations; 
        private String requestId; 
        private Boolean success; 

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * organizations.
         */
        public Builder organizations(java.util.List<Organizations> organizations) {
            this.organizations = organizations;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListJoinedOrganizationsResponseBody build() {
            return new ListJoinedOrganizationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListJoinedOrganizationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListJoinedOrganizationsResponseBody</p>
     */
    public static class Organizations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("isOrgAdmin")
        private Boolean isOrgAdmin;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Organizations(Builder builder) {
            this.id = builder.id;
            this.isOrgAdmin = builder.isOrgAdmin;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Organizations create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return isOrgAdmin
         */
        public Boolean getIsOrgAdmin() {
            return this.isOrgAdmin;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private Boolean isOrgAdmin; 
            private String name; 

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * isOrgAdmin.
             */
            public Builder isOrgAdmin(Boolean isOrgAdmin) {
                this.isOrgAdmin = isOrgAdmin;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Organizations build() {
                return new Organizations(this);
            } 

        } 

    }
}
