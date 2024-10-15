// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("ReleaseVersions")
    private java.util.List < ReleaseVersions> releaseVersions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>Returns the location of the data that was read.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C89568980</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The major EMR versions.</p>
         */
        public Builder releaseVersions(java.util.List < ReleaseVersions> releaseVersions) {
            this.releaseVersions = releaseVersions;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
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
        @com.aliyun.core.annotation.NameInMap("IaasType")
        private String iaasType;

        @com.aliyun.core.annotation.NameInMap("ReleaseVersion")
        private String releaseVersion;

        @com.aliyun.core.annotation.NameInMap("Series")
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
             * <p>The IaaS type.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS</p>
             */
            public Builder iaasType(String iaasType) {
                this.iaasType = iaasType;
                return this;
            }

            /**
             * <p>The EMR version.</p>
             * 
             * <strong>example:</strong>
             * <p>EMR-5.3.0</p>
             */
            public Builder releaseVersion(String releaseVersion) {
                this.releaseVersion = releaseVersion;
                return this;
            }

            /**
             * <p>The version series.</p>
             * 
             * <strong>example:</strong>
             * <p>EMR-6.X</p>
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
