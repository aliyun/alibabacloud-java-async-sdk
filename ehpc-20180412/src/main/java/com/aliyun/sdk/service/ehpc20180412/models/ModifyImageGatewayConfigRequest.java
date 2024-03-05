// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyImageGatewayConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyImageGatewayConfigRequest</p>
 */
public class ModifyImageGatewayConfigRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("DBPassword")
    private String DBPassword;

    @Query
    @NameInMap("DBServerInfo")
    private String DBServerInfo;

    @Query
    @NameInMap("DBType")
    private String DBType;

    @Query
    @NameInMap("DBUsername")
    private String DBUsername;

    @Query
    @NameInMap("DefaultRepoLocation")
    private String defaultRepoLocation;

    @Query
    @NameInMap("ImageExpirationTimeout")
    private String imageExpirationTimeout;

    @Query
    @NameInMap("PullUpdateTimeout")
    private Integer pullUpdateTimeout;

    @Query
    @NameInMap("Repo")
    private java.util.List < Repo> repo;

    private ModifyImageGatewayConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clusterId = builder.clusterId;
        this.DBPassword = builder.DBPassword;
        this.DBServerInfo = builder.DBServerInfo;
        this.DBType = builder.DBType;
        this.DBUsername = builder.DBUsername;
        this.defaultRepoLocation = builder.defaultRepoLocation;
        this.imageExpirationTimeout = builder.imageExpirationTimeout;
        this.pullUpdateTimeout = builder.pullUpdateTimeout;
        this.repo = builder.repo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyImageGatewayConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return DBPassword
     */
    public String getDBPassword() {
        return this.DBPassword;
    }

    /**
     * @return DBServerInfo
     */
    public String getDBServerInfo() {
        return this.DBServerInfo;
    }

    /**
     * @return DBType
     */
    public String getDBType() {
        return this.DBType;
    }

    /**
     * @return DBUsername
     */
    public String getDBUsername() {
        return this.DBUsername;
    }

    /**
     * @return defaultRepoLocation
     */
    public String getDefaultRepoLocation() {
        return this.defaultRepoLocation;
    }

    /**
     * @return imageExpirationTimeout
     */
    public String getImageExpirationTimeout() {
        return this.imageExpirationTimeout;
    }

    /**
     * @return pullUpdateTimeout
     */
    public Integer getPullUpdateTimeout() {
        return this.pullUpdateTimeout;
    }

    /**
     * @return repo
     */
    public java.util.List < Repo> getRepo() {
        return this.repo;
    }

    public static final class Builder extends Request.Builder<ModifyImageGatewayConfigRequest, Builder> {
        private String regionId; 
        private String clusterId; 
        private String DBPassword; 
        private String DBServerInfo; 
        private String DBType; 
        private String DBUsername; 
        private String defaultRepoLocation; 
        private String imageExpirationTimeout; 
        private Integer pullUpdateTimeout; 
        private java.util.List < Repo> repo; 

        private Builder() {
            super();
        } 

        private Builder(ModifyImageGatewayConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clusterId = request.clusterId;
            this.DBPassword = request.DBPassword;
            this.DBServerInfo = request.DBServerInfo;
            this.DBType = request.DBType;
            this.DBUsername = request.DBUsername;
            this.defaultRepoLocation = request.defaultRepoLocation;
            this.imageExpirationTimeout = request.imageExpirationTimeout;
            this.pullUpdateTimeout = request.pullUpdateTimeout;
            this.repo = request.repo;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The password that is used to log on to the database instance.
         */
        public Builder DBPassword(String DBPassword) {
            this.putQueryParameter("DBPassword", DBPassword);
            this.DBPassword = DBPassword;
            return this;
        }

        /**
         * The URI of the database.
         */
        public Builder DBServerInfo(String DBServerInfo) {
            this.putQueryParameter("DBServerInfo", DBServerInfo);
            this.DBServerInfo = DBServerInfo;
            return this;
        }

        /**
         * The type of the database. Set the value to mongodb.
         */
        public Builder DBType(String DBType) {
            this.putQueryParameter("DBType", DBType);
            this.DBType = DBType;
            return this;
        }

        /**
         * The username of the account that is used to log on to the database.
         */
        public Builder DBUsername(String DBUsername) {
            this.putQueryParameter("DBUsername", DBUsername);
            this.DBUsername = DBUsername;
            return this;
        }

        /**
         * The default repository service. Set the value to registry-1.docker.io.
         */
        public Builder defaultRepoLocation(String defaultRepoLocation) {
            this.putQueryParameter("DefaultRepoLocation", defaultRepoLocation);
            this.defaultRepoLocation = defaultRepoLocation;
            return this;
        }

        /**
         * The timeout period for deleting images.
         */
        public Builder imageExpirationTimeout(String imageExpirationTimeout) {
            this.putQueryParameter("ImageExpirationTimeout", imageExpirationTimeout);
            this.imageExpirationTimeout = imageExpirationTimeout;
            return this;
        }

        /**
         * The timeout period for pulling images. Unit: seconds.
         */
        public Builder pullUpdateTimeout(Integer pullUpdateTimeout) {
            this.putQueryParameter("PullUpdateTimeout", pullUpdateTimeout);
            this.pullUpdateTimeout = pullUpdateTimeout;
            return this;
        }

        /**
         * The information about the repository.
         */
        public Builder repo(java.util.List < Repo> repo) {
            this.putQueryParameter("Repo", repo);
            this.repo = repo;
            return this;
        }

        @Override
        public ModifyImageGatewayConfigRequest build() {
            return new ModifyImageGatewayConfigRequest(this);
        } 

    } 

    public static class Repo extends TeaModel {
        @NameInMap("Auth")
        private String auth;

        @NameInMap("Location")
        private String location;

        @NameInMap("URL")
        private String URL;

        private Repo(Builder builder) {
            this.auth = builder.auth;
            this.location = builder.location;
            this.URL = builder.URL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Repo create() {
            return builder().build();
        }

        /**
         * @return auth
         */
        public String getAuth() {
            return this.auth;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return URL
         */
        public String getURL() {
            return this.URL;
        }

        public static final class Builder {
            private String auth; 
            private String location; 
            private String URL; 

            /**
             * The authentication method of the repository. Valid values:
             * <p>
             * 
             * *   http
             * *   https
             * 
             * Default value: http.
             */
            public Builder auth(String auth) {
                this.auth = auth;
                return this;
            }

            /**
             * The address of the repository N.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * The URL of the repository. The URL is required to add a repository address.
             */
            public Builder URL(String URL) {
                this.URL = URL;
                return this;
            }

            public Repo build() {
                return new Repo(this);
            } 

        } 

    }
}
