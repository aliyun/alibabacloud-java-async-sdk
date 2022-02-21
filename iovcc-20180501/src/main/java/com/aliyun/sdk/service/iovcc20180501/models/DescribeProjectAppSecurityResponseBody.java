// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProjectAppSecurityResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProjectAppSecurityResponseBody</p>
 */
public class DescribeProjectAppSecurityResponseBody extends TeaModel {
    @NameInMap("ProjectAppSecurity")
    private ProjectAppSecurity projectAppSecurity;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeProjectAppSecurityResponseBody(Builder builder) {
        this.projectAppSecurity = builder.projectAppSecurity;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProjectAppSecurityResponseBody create() {
        return builder().build();
    }

    /**
     * @return projectAppSecurity
     */
    public ProjectAppSecurity getProjectAppSecurity() {
        return this.projectAppSecurity;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ProjectAppSecurity projectAppSecurity; 
        private String requestId; 

        /**
         * ProjectAppSecurity.
         */
        public Builder projectAppSecurity(ProjectAppSecurity projectAppSecurity) {
            this.projectAppSecurity = projectAppSecurity;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeProjectAppSecurityResponseBody build() {
            return new DescribeProjectAppSecurityResponseBody(this);
        } 

    } 

    public static class ProjectAppSecurity extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppKey")
        private String appKey;

        @NameInMap("AppSecret")
        private String appSecret;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("Id")
        private Long id;

        private ProjectAppSecurity(Builder builder) {
            this.appId = builder.appId;
            this.appKey = builder.appKey;
            this.appSecret = builder.appSecret;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProjectAppSecurity create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appKey
         */
        public String getAppKey() {
            return this.appKey;
        }

        /**
         * @return appSecret
         */
        public String getAppSecret() {
            return this.appSecret;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        public static final class Builder {
            private String appId; 
            private String appKey; 
            private String appSecret; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private Long id; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppKey.
             */
            public Builder appKey(String appKey) {
                this.appKey = appKey;
                return this;
            }

            /**
             * AppSecret.
             */
            public Builder appSecret(String appSecret) {
                this.appSecret = appSecret;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            public ProjectAppSecurity build() {
                return new ProjectAppSecurity(this);
            } 

        } 

    }
}
