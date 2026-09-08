// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link ListAlgorithmVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAlgorithmVersionsResponseBody</p>
 */
public class ListAlgorithmVersionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlgorithmVersions")
    private java.util.List<AlgorithmVersions> algorithmVersions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListAlgorithmVersionsResponseBody(Builder builder) {
        this.algorithmVersions = builder.algorithmVersions;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlgorithmVersionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithmVersions
     */
    public java.util.List<AlgorithmVersions> getAlgorithmVersions() {
        return this.algorithmVersions;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<AlgorithmVersions> algorithmVersions; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListAlgorithmVersionsResponseBody model) {
            this.algorithmVersions = model.algorithmVersions;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>A list of algorithm version details.</p>
         */
        public Builder algorithmVersions(java.util.List<AlgorithmVersions> algorithmVersions) {
            this.algorithmVersions = algorithmVersions;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of algorithm versions.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAlgorithmVersionsResponseBody build() {
            return new ListAlgorithmVersionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAlgorithmVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlgorithmVersionsResponseBody</p>
     */
    public static class AlgorithmVersions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlgorithmId")
        private String algorithmId;

        @com.aliyun.core.annotation.NameInMap("AlgorithmName")
        private String algorithmName;

        @com.aliyun.core.annotation.NameInMap("AlgorithmProvider")
        private String algorithmProvider;

        @com.aliyun.core.annotation.NameInMap("AlgorithmVersion")
        private String algorithmVersion;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private AlgorithmVersions(Builder builder) {
            this.algorithmId = builder.algorithmId;
            this.algorithmName = builder.algorithmName;
            this.algorithmProvider = builder.algorithmProvider;
            this.algorithmVersion = builder.algorithmVersion;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.tenantId = builder.tenantId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlgorithmVersions create() {
            return builder().build();
        }

        /**
         * @return algorithmId
         */
        public String getAlgorithmId() {
            return this.algorithmId;
        }

        /**
         * @return algorithmName
         */
        public String getAlgorithmName() {
            return this.algorithmName;
        }

        /**
         * @return algorithmProvider
         */
        public String getAlgorithmProvider() {
            return this.algorithmProvider;
        }

        /**
         * @return algorithmVersion
         */
        public String getAlgorithmVersion() {
            return this.algorithmVersion;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtModifiedTime
         */
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String algorithmId; 
            private String algorithmName; 
            private String algorithmProvider; 
            private String algorithmVersion; 
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private String tenantId; 
            private String userId; 

            private Builder() {
            } 

            private Builder(AlgorithmVersions model) {
                this.algorithmId = model.algorithmId;
                this.algorithmName = model.algorithmName;
                this.algorithmProvider = model.algorithmProvider;
                this.algorithmVersion = model.algorithmVersion;
                this.gmtCreateTime = model.gmtCreateTime;
                this.gmtModifiedTime = model.gmtModifiedTime;
                this.tenantId = model.tenantId;
                this.userId = model.userId;
            } 

            /**
             * <p>The algorithm ID.</p>
             * 
             * <strong>example:</strong>
             * <p>algo-sidjc8134hv</p>
             */
            public Builder algorithmId(String algorithmId) {
                this.algorithmId = algorithmId;
                return this;
            }

            /**
             * <p>The algorithm name.</p>
             * 
             * <strong>example:</strong>
             * <p>llm_train</p>
             */
            public Builder algorithmName(String algorithmName) {
                this.algorithmName = algorithmName;
                return this;
            }

            /**
             * <p>The algorithm provider.</p>
             * 
             * <strong>example:</strong>
             * <p>pai</p>
             */
            public Builder algorithmProvider(String algorithmProvider) {
                this.algorithmProvider = algorithmProvider;
                return this;
            }

            /**
             * <p>The algorithm version.</p>
             * 
             * <strong>example:</strong>
             * <p>v0.1.0</p>
             */
            public Builder algorithmVersion(String algorithmVersion) {
                this.algorithmVersion = algorithmVersion;
                return this;
            }

            /**
             * <p>The time when the algorithm was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-19T02:00:26Z</p>
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * <p>The time when the algorithm was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-22T02:00:59Z</p>
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * <p>The tenant ID that owns the algorithm.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>The user ID that owns the algorithm.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public AlgorithmVersions build() {
                return new AlgorithmVersions(this);
            } 

        } 

    }
}
