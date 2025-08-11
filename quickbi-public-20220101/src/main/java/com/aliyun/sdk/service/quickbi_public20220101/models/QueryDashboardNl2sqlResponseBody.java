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
 * {@link QueryDashboardNl2sqlResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDashboardNl2sqlResponseBody</p>
 */
public class QueryDashboardNl2sqlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryDashboardNl2sqlResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDashboardNl2sqlResponseBody create() {
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

        private Builder(QueryDashboardNl2sqlResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryDashboardNl2sqlResponseBody build() {
            return new QueryDashboardNl2sqlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDashboardNl2sqlResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDashboardNl2sqlResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Authorities")
        private java.util.List<String> authorities;

        @com.aliyun.core.annotation.NameInMap("DashboardName")
        private String dashboardName;

        @com.aliyun.core.annotation.NameInMap("DashboardNl2sqlId")
        private String dashboardNl2sqlId;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private String ownerId;

        private Result(Builder builder) {
            this.authorities = builder.authorities;
            this.dashboardName = builder.dashboardName;
            this.dashboardNl2sqlId = builder.dashboardNl2sqlId;
            this.ownerId = builder.ownerId;
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
         * @return dashboardName
         */
        public String getDashboardName() {
            return this.dashboardName;
        }

        /**
         * @return dashboardNl2sqlId
         */
        public String getDashboardNl2sqlId() {
            return this.dashboardNl2sqlId;
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        public static final class Builder {
            private java.util.List<String> authorities; 
            private String dashboardName; 
            private String dashboardNl2sqlId; 
            private String ownerId; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.authorities = model.authorities;
                this.dashboardName = model.dashboardName;
                this.dashboardNl2sqlId = model.dashboardNl2sqlId;
                this.ownerId = model.ownerId;
            } 

            /**
             * Authorities.
             */
            public Builder authorities(java.util.List<String> authorities) {
                this.authorities = authorities;
                return this;
            }

            /**
             * DashboardName.
             */
            public Builder dashboardName(String dashboardName) {
                this.dashboardName = dashboardName;
                return this;
            }

            /**
             * DashboardNl2sqlId.
             */
            public Builder dashboardNl2sqlId(String dashboardNl2sqlId) {
                this.dashboardNl2sqlId = dashboardNl2sqlId;
                return this;
            }

            /**
             * OwnerId.
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
