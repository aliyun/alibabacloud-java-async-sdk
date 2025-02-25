// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qianzhou20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetClusterResponseBody} extends {@link TeaModel}
 *
 * <p>GetClusterResponseBody</p>
 */
public class GetClusterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetClusterResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetClusterResponseBody build() {
            return new GetClusterResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetClusterResponseBody} extends {@link TeaModel}
     *
     * <p>GetClusterResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("clusterID")
        private String clusterID;

        @com.aliyun.core.annotation.NameInMap("clusterType")
        private String clusterType;

        @com.aliyun.core.annotation.NameInMap("currentVersion")
        private String currentVersion;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("profile")
        private String profile;

        @com.aliyun.core.annotation.NameInMap("regionID")
        private String regionID;

        @com.aliyun.core.annotation.NameInMap("securityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        @com.aliyun.core.annotation.NameInMap("userID")
        private String userID;

        private Data(Builder builder) {
            this.clusterID = builder.clusterID;
            this.clusterType = builder.clusterType;
            this.currentVersion = builder.currentVersion;
            this.name = builder.name;
            this.profile = builder.profile;
            this.regionID = builder.regionID;
            this.securityGroupId = builder.securityGroupId;
            this.spec = builder.spec;
            this.state = builder.state;
            this.userID = builder.userID;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return clusterID
         */
        public String getClusterID() {
            return this.clusterID;
        }

        /**
         * @return clusterType
         */
        public String getClusterType() {
            return this.clusterType;
        }

        /**
         * @return currentVersion
         */
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return profile
         */
        public String getProfile() {
            return this.profile;
        }

        /**
         * @return regionID
         */
        public String getRegionID() {
            return this.regionID;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return userID
         */
        public String getUserID() {
            return this.userID;
        }

        public static final class Builder {
            private String clusterID; 
            private String clusterType; 
            private String currentVersion; 
            private String name; 
            private String profile; 
            private String regionID; 
            private String securityGroupId; 
            private String spec; 
            private String state; 
            private String userID; 

            /**
             * clusterID.
             */
            public Builder clusterID(String clusterID) {
                this.clusterID = clusterID;
                return this;
            }

            /**
             * clusterType.
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * currentVersion.
             */
            public Builder currentVersion(String currentVersion) {
                this.currentVersion = currentVersion;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * profile.
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * regionID.
             */
            public Builder regionID(String regionID) {
                this.regionID = regionID;
                return this;
            }

            /**
             * securityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * spec.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * state.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * userID.
             */
            public Builder userID(String userID) {
                this.userID = userID;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
