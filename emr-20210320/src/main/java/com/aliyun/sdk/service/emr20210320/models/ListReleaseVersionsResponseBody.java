// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListReleaseVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListReleaseVersionsResponseBody</p>
 */
public class ListReleaseVersionsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("ReleaseVersions")
    private java.util.List < ReleaseVersions> releaseVersions;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * The maximum number of entries returned.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * Returns the location of the data that was read.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * ReleaseVersions.
         */
        public Builder releaseVersions(java.util.List < ReleaseVersions> releaseVersions) {
            this.releaseVersions = releaseVersions;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
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
        @NameInMap("IaasType")
        private String iaasType;

        @NameInMap("ReleaseVersion")
        private String releaseVersion;

        @NameInMap("Series")
        private String series;

        private ReleaseVersions(Builder builder) {
            this.iaasType = builder.iaasType;
            this.releaseVersion = builder.releaseVersion;
            this.series = builder.series;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReleaseVersions create() {
            return builder().build();
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
         * @return series
         */
        public String getSeries() {
            return this.series;
        }

        public static final class Builder {
            private String iaasType; 
            private String releaseVersion; 
            private String series; 

            /**
             * IaaS类型。取值范围：
             * <p>
             * - ECS：基于ECS构建。
             * - K8S：基于K8S构建。
             */
            public Builder iaasType(String iaasType) {
                this.iaasType = iaasType;
                return this;
            }

            /**
             * EMR发行版。
             */
            public Builder releaseVersion(String releaseVersion) {
                this.releaseVersion = releaseVersion;
                return this;
            }

            /**
             * 版本序列。
             */
            public Builder series(String series) {
                this.series = series;
                return this;
            }

            public ReleaseVersions build() {
                return new ReleaseVersions(this);
            } 

        } 

    }
}
