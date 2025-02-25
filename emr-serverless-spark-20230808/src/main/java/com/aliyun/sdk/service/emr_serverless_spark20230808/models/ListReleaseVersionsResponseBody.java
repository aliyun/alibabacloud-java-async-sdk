// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
    private java.util.List<ReleaseVersions> releaseVersions;

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
    public java.util.List<ReleaseVersions> getReleaseVersions() {
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
        private java.util.List<ReleaseVersions> releaseVersions; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The maximum number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The versions.</p>
         */
        public Builder releaseVersions(java.util.List<ReleaseVersions> releaseVersions) {
            this.releaseVersions = releaseVersions;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListReleaseVersionsResponseBody build() {
            return new ListReleaseVersionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListReleaseVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListReleaseVersionsResponseBody</p>
     */
    public static class ReleaseVersions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("communityVersion")
        private String communityVersion;

        @com.aliyun.core.annotation.NameInMap("cpuArchitectures")
        private java.util.List<String> cpuArchitectures;

        @com.aliyun.core.annotation.NameInMap("displayReleaseVersion")
        private String displayReleaseVersion;

        @com.aliyun.core.annotation.NameInMap("fusion")
        private Boolean fusion;

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
            this.displayReleaseVersion = builder.displayReleaseVersion;
            this.fusion = builder.fusion;
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
        public java.util.List<String> getCpuArchitectures() {
            return this.cpuArchitectures;
        }

        /**
         * @return displayReleaseVersion
         */
        public String getDisplayReleaseVersion() {
            return this.displayReleaseVersion;
        }

        /**
         * @return fusion
         */
        public Boolean getFusion() {
            return this.fusion;
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
            private java.util.List<String> cpuArchitectures; 
            private String displayReleaseVersion; 
            private Boolean fusion; 
            private Long gmtCreate; 
            private String iaasType; 
            private String releaseVersion; 
            private String scalaVersion; 
            private String state; 
            private String type; 

            /**
             * <p>The version number of open source Spark.</p>
             * 
             * <strong>example:</strong>
             * <p>Spark 3.3.1</p>
             */
            public Builder communityVersion(String communityVersion) {
                this.communityVersion = communityVersion;
                return this;
            }

            /**
             * <p>The CPU architectures.</p>
             */
            public Builder cpuArchitectures(java.util.List<String> cpuArchitectures) {
                this.cpuArchitectures = cpuArchitectures;
                return this;
            }

            /**
             * <p>The version number.</p>
             * 
             * <strong>example:</strong>
             * <p>esr-2.1 (Spark 3.3.1, Scala 2.12)</p>
             */
            public Builder displayReleaseVersion(String displayReleaseVersion) {
                this.displayReleaseVersion = displayReleaseVersion;
                return this;
            }

            /**
             * <p>Indicates whether the Fusion engine is used for acceleration.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder fusion(Boolean fusion) {
                this.fusion = fusion;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1716215854101</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The type of the Infrastructure as a Service (IaaS) layer.</p>
             * 
             * <strong>example:</strong>
             * <p>ASI</p>
             */
            public Builder iaasType(String iaasType) {
                this.iaasType = iaasType;
                return this;
            }

            /**
             * <p>The version number.</p>
             * 
             * <strong>example:</strong>
             * <p>esr-2.1 (Spark 3.3.1, Scala 2.12, Java Runtime)</p>
             */
            public Builder releaseVersion(String releaseVersion) {
                this.releaseVersion = releaseVersion;
                return this;
            }

            /**
             * <p>The version of Scala.</p>
             * 
             * <strong>example:</strong>
             * <p>2.12</p>
             */
            public Builder scalaVersion(String scalaVersion) {
                this.scalaVersion = scalaVersion;
                return this;
            }

            /**
             * <p>The status of the version.</p>
             * 
             * <strong>example:</strong>
             * <p>ONLINE</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The type of the version.</p>
             * 
             * <strong>example:</strong>
             * <p>stable</p>
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
