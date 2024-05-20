// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListReleaseVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListReleaseVersionsResponseBody</p>
 */
public class ListReleaseVersionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("releaseVersions")
    private java.util.List < ReleaseVersions> releaseVersions;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListReleaseVersionsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.releaseVersions = builder.releaseVersions;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListReleaseVersionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return releaseVersions
     */
    public java.util.List < ReleaseVersions> getReleaseVersions() {
        return this.releaseVersions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List < ReleaseVersions> releaseVersions; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * 一次获取的最大记录数。
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 下一页TOKEN。
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * releaseVersions.
         */
        public Builder releaseVersions(java.util.List < ReleaseVersions> releaseVersions) {
            this.releaseVersions = releaseVersions;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 记录总数。
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListReleaseVersionsResponseBody build() {
            return new ListReleaseVersionsResponseBody(this);
        } 

    } 

    public static class ReleaseVersions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("communityVersion")
        private String communityVersion;

        @com.aliyun.core.annotation.NameInMap("cpuArchitectures")
        private java.util.List < String > cpuArchitectures;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("iaasType")
        private String iaasType;

        @com.aliyun.core.annotation.NameInMap("releaseVersion")
        private String releaseVersion;

        @com.aliyun.core.annotation.NameInMap("scalaVersion")
        private String scalaVersion;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private ReleaseVersions(Builder builder) {
            this.communityVersion = builder.communityVersion;
            this.cpuArchitectures = builder.cpuArchitectures;
            this.gmtCreate = builder.gmtCreate;
            this.iaasType = builder.iaasType;
            this.releaseVersion = builder.releaseVersion;
            this.scalaVersion = builder.scalaVersion;
            this.state = builder.state;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReleaseVersions create() {
            return builder().build();
        }

        /**
         * @return communityVersion
         */
        public String getCommunityVersion() {
            return this.communityVersion;
        }

        /**
         * @return cpuArchitectures
         */
        public java.util.List < String > getCpuArchitectures() {
            return this.cpuArchitectures;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return iaasType
         */
        public String getIaasType() {
            return this.iaasType;
        }

        /**
         * @return releaseVersion
         */
        public String getReleaseVersion() {
            return this.releaseVersion;
        }

        /**
         * @return scalaVersion
         */
        public String getScalaVersion() {
            return this.scalaVersion;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String communityVersion; 
            private java.util.List < String > cpuArchitectures; 
            private Long gmtCreate; 
            private String iaasType; 
            private String releaseVersion; 
            private String scalaVersion; 
            private String state; 
            private String type; 

            /**
             * communityVersion.
             */
            public Builder communityVersion(String communityVersion) {
                this.communityVersion = communityVersion;
                return this;
            }

            /**
             * cpuArchitectures.
             */
            public Builder cpuArchitectures(java.util.List < String > cpuArchitectures) {
                this.cpuArchitectures = cpuArchitectures;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * iaasType.
             */
            public Builder iaasType(String iaasType) {
                this.iaasType = iaasType;
                return this;
            }

            /**
             * releaseVersion.
             */
            public Builder releaseVersion(String releaseVersion) {
                this.releaseVersion = releaseVersion;
                return this;
            }

            /**
             * scalaVersion.
             */
            public Builder scalaVersion(String scalaVersion) {
                this.scalaVersion = scalaVersion;
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
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ReleaseVersions build() {
                return new ReleaseVersions(this);
            } 

        } 

    }
}
