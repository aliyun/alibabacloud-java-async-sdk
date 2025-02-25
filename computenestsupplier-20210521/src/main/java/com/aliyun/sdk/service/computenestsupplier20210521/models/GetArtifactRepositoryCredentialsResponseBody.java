// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
 * {@link GetArtifactRepositoryCredentialsResponseBody} extends {@link TeaModel}
 *
 * <p>GetArtifactRepositoryCredentialsResponseBody</p>
 */
public class GetArtifactRepositoryCredentialsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvailableResources")
    private java.util.List<AvailableResources> availableResources;

    @com.aliyun.core.annotation.NameInMap("Credentials")
    private Credentials credentials;

    @com.aliyun.core.annotation.NameInMap("ExpireDate")
    private String expireDate;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetArtifactRepositoryCredentialsResponseBody(Builder builder) {
        this.availableResources = builder.availableResources;
        this.credentials = builder.credentials;
        this.expireDate = builder.expireDate;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetArtifactRepositoryCredentialsResponseBody create() {
        return builder().build();
    }

    /**
     * @return availableResources
     */
    public java.util.List<AvailableResources> getAvailableResources() {
        return this.availableResources;
    }

    /**
     * @return credentials
     */
    public Credentials getCredentials() {
        return this.credentials;
    }

    /**
     * @return expireDate
     */
    public String getExpireDate() {
        return this.expireDate;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<AvailableResources> availableResources; 
        private Credentials credentials; 
        private String expireDate; 
        private String requestId; 

        /**
         * <p>The information about the resources that can be uploaded.</p>
         */
        public Builder availableResources(java.util.List<AvailableResources> availableResources) {
            this.availableResources = availableResources;
            return this;
        }

        /**
         * <p>The credentials.</p>
         */
        public Builder credentials(Credentials credentials) {
            this.credentials = credentials;
            return this;
        }

        /**
         * <p>The time when the credentials expired.</p>
         * 
         * <strong>example:</strong>
         * <p>1526549792000</p>
         */
        public Builder expireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>94E89857-B994-44B6-9C4F-DBD200E9XXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetArtifactRepositoryCredentialsResponseBody build() {
            return new GetArtifactRepositoryCredentialsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetArtifactRepositoryCredentialsResponseBody} extends {@link TeaModel}
     *
     * <p>GetArtifactRepositoryCredentialsResponseBody</p>
     */
    public static class AvailableResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RepositoryName")
        private String repositoryName;

        private AvailableResources(Builder builder) {
            this.path = builder.path;
            this.regionId = builder.regionId;
            this.repositoryName = builder.repositoryName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableResources create() {
            return builder().build();
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return repositoryName
         */
        public String getRepositoryName() {
            return this.repositoryName;
        }

        public static final class Builder {
            private String path; 
            private String regionId; 
            private String repositoryName; 

            /**
             * <p>The path.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;/xxx/&quot;</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The repository name.</p>
             * 
             * <strong>example:</strong>
             * <p>computenest-artifacts-draft-cn-hangzhou</p>
             */
            public Builder repositoryName(String repositoryName) {
                this.repositoryName = repositoryName;
                return this;
            }

            public AvailableResources build() {
                return new AvailableResources(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetArtifactRepositoryCredentialsResponseBody} extends {@link TeaModel}
     *
     * <p>GetArtifactRepositoryCredentialsResponseBody</p>
     */
    public static class Credentials extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKeyId")
        private String accessKeyId;

        @com.aliyun.core.annotation.NameInMap("AccessKeySecret")
        private String accessKeySecret;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("SecurityToken")
        private String securityToken;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        private Credentials(Builder builder) {
            this.accessKeyId = builder.accessKeyId;
            this.accessKeySecret = builder.accessKeySecret;
            this.password = builder.password;
            this.securityToken = builder.securityToken;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Credentials create() {
            return builder().build();
        }

        /**
         * @return accessKeyId
         */
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        /**
         * @return accessKeySecret
         */
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return securityToken
         */
        public String getSecurityToken() {
            return this.securityToken;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String accessKeyId; 
            private String accessKeySecret; 
            private String password; 
            private String securityToken; 
            private String username; 

            /**
             * <p>The AccessKey ID.</p>
             * 
             * <strong>example:</strong>
             * <p>STS.xxx</p>
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * <p>The AccessKey secret.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder accessKeySecret(String accessKeySecret) {
                this.accessKeySecret = accessKeySecret;
                return this;
            }

            /**
             * <p>The password.</p>
             * 
             * <strong>example:</strong>
             * <p>eyJ0aW1lIjoiMTUyNjU0OTc5:0705733****</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>The Security Token Service (STS) token.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder securityToken(String securityToken) {
                this.securityToken = securityToken;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public Credentials build() {
                return new Credentials(this);
            } 

        } 

    }
}
