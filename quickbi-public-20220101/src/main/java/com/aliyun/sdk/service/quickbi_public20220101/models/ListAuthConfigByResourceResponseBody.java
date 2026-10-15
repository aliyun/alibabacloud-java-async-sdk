// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link ListAuthConfigByResourceResponseBody} extends {@link TeaModel}
 *
 * <p>ListAuthConfigByResourceResponseBody</p>
 */
public class ListAuthConfigByResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListAuthConfigByResourceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuthConfigByResourceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List<Result> getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Result> result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListAuthConfigByResourceResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FA14C-ED6B-5F39-8563-855676470C47</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The collection of authorization details.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListAuthConfigByResourceResponseBody build() {
            return new ListAuthConfigByResourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAuthConfigByResourceResponseBody} extends {@link TeaModel}
     *
     * <p>ListAuthConfigByResourceResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Authorities")
        private java.util.List<String> authorities;

        @com.aliyun.core.annotation.NameInMap("AuthorizedId")
        private String authorizedId;

        @com.aliyun.core.annotation.NameInMap("AuthorizedName")
        private String authorizedName;

        @com.aliyun.core.annotation.NameInMap("ExpireDate")
        private String expireDate;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private Integer scope;

        private Result(Builder builder) {
            this.authorities = builder.authorities;
            this.authorizedId = builder.authorizedId;
            this.authorizedName = builder.authorizedName;
            this.expireDate = builder.expireDate;
            this.gmtCreate = builder.gmtCreate;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.scope = builder.scope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return authorities
         */
        public java.util.List<String> getAuthorities() {
            return this.authorities;
        }

        /**
         * @return authorizedId
         */
        public String getAuthorizedId() {
            return this.authorizedId;
        }

        /**
         * @return authorizedName
         */
        public String getAuthorizedName() {
            return this.authorizedName;
        }

        /**
         * @return expireDate
         */
        public String getExpireDate() {
            return this.expireDate;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return scope
         */
        public Integer getScope() {
            return this.scope;
        }

        public static final class Builder {
            private java.util.List<String> authorities; 
            private String authorizedId; 
            private String authorizedName; 
            private String expireDate; 
            private String gmtCreate; 
            private String resourceId; 
            private String resourceType; 
            private Integer scope; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.authorities = model.authorities;
                this.authorizedId = model.authorizedId;
                this.authorizedName = model.authorizedName;
                this.expireDate = model.expireDate;
                this.gmtCreate = model.gmtCreate;
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
                this.scope = model.scope;
            } 

            /**
             * <p>The array of permissions granted.</p>
             */
            public Builder authorities(java.util.List<String> authorities) {
                this.authorities = authorities;
                return this;
            }

            /**
             * <p>The ID of the authorized user.</p>
             * 
             * <strong>example:</strong>
             * <p>123123**dfsd</p>
             */
            public Builder authorizedId(String authorizedId) {
                this.authorizedId = authorizedId;
                return this;
            }

            /**
             * <p>The name of the authorized user.</p>
             * 
             * <strong>example:</strong>
             * <p>sss</p>
             */
            public Builder authorizedName(String authorizedName) {
                this.authorizedName = authorizedName;
                return this;
            }

            /**
             * <p>The expiration time. This value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1788969600000</p>
             */
            public Builder expireDate(String expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * <p>The time when the permission record was created, in the yyyy-MM-dd mm:hh:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-04-16 13:17:39</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123123**dfsd</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The resource type. Valid values:</p>
             * <ul>
             * <li>dashboard: dashboard</li>
             * <li>screen: data screen</li>
             * <li>report: electron</li>
             * <li>ANALYSIS: ad hoc analysis</li>
             * <li>dashboardOfflineQuery: self-service data retrieval</li>
             * <li>dataForm: data form</li>
             * <li>cube: dataset</li>
             * <li>datasource: data source</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cube</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The authorization scope. Valid values:</p>
             * <ul>
             * <li>0: user</li>
             * <li>1: user group</li>
             * <li>2: organization</li>
             * <li>3: workspace</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder scope(Integer scope) {
                this.scope = scope;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
