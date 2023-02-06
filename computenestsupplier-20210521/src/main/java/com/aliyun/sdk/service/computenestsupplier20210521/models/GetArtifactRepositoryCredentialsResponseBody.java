// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetArtifactRepositoryCredentialsResponseBody} extends {@link TeaModel}
 *
 * <p>GetArtifactRepositoryCredentialsResponseBody</p>
 */
public class GetArtifactRepositoryCredentialsResponseBody extends TeaModel {
    @NameInMap("AvailableResources")
    private java.util.List < AvailableResources> availableResources;

    @NameInMap("Credentials")
    private Credentials credentials;

    @NameInMap("ExpireDate")
    private String expireDate;

    @NameInMap("RequestId")
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
    public java.util.List < AvailableResources> getAvailableResources() {
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
        private java.util.List < AvailableResources> availableResources; 
        private Credentials credentials; 
        private String expireDate; 
        private String requestId; 

        /**
         * AvailableResources.
         */
        public Builder availableResources(java.util.List < AvailableResources> availableResources) {
            this.availableResources = availableResources;
            return this;
        }

        /**
         * Credentials.
         */
        public Builder credentials(Credentials credentials) {
            this.credentials = credentials;
            return this;
        }

        /**
         * ExpireDate.
         */
        public Builder expireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetArtifactRepositoryCredentialsResponseBody build() {
            return new GetArtifactRepositoryCredentialsResponseBody(this);
        } 

    } 

    public static class AvailableResources extends TeaModel {
        @NameInMap("Path")
        private String path;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RepositoryName")
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
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * RepositoryName.
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
    public static class Credentials extends TeaModel {
        @NameInMap("AccessKeyId")
        private String accessKeyId;

        @NameInMap("AccessKeySecret")
        private String accessKeySecret;

        @NameInMap("Password")
        private String password;

        @NameInMap("SecurityToken")
        private String securityToken;

        @NameInMap("Username")
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
             * AccessKeyId.
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * AccessKeySecret.
             */
            public Builder accessKeySecret(String accessKeySecret) {
                this.accessKeySecret = accessKeySecret;
                return this;
            }

            /**
             * Password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * SecurityToken.
             */
            public Builder securityToken(String securityToken) {
                this.securityToken = securityToken;
                return this;
            }

            /**
             * Username.
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
