// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAlgorithmsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAlgorithmsResponseBody</p>
 */
public class ListAlgorithmsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Algorithms")
    private java.util.List < Algorithms> algorithms;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListAlgorithmsResponseBody(Builder builder) {
        this.algorithms = builder.algorithms;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlgorithmsResponseBody create() {
        return builder().build();
    }

    /**
     * @return algorithms
     */
    public java.util.List < Algorithms> getAlgorithms() {
        return this.algorithms;
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
        private java.util.List < Algorithms> algorithms; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Algorithms.
         */
        public Builder algorithms(java.util.List < Algorithms> algorithms) {
            this.algorithms = algorithms;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAlgorithmsResponseBody build() {
            return new ListAlgorithmsResponseBody(this);
        } 

    } 

    public static class Algorithms extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlgorithmDescription")
        private String algorithmDescription;

        @com.aliyun.core.annotation.NameInMap("AlgorithmId")
        private String algorithmId;

        @com.aliyun.core.annotation.NameInMap("AlgorithmName")
        private String algorithmName;

        @com.aliyun.core.annotation.NameInMap("AlgorithmProvider")
        private String algorithmProvider;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        private Algorithms(Builder builder) {
            this.algorithmDescription = builder.algorithmDescription;
            this.algorithmId = builder.algorithmId;
            this.algorithmName = builder.algorithmName;
            this.algorithmProvider = builder.algorithmProvider;
            this.displayName = builder.displayName;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.userId = builder.userId;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Algorithms create() {
            return builder().build();
        }

        /**
         * @return algorithmDescription
         */
        public String getAlgorithmDescription() {
            return this.algorithmDescription;
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
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
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
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String algorithmDescription; 
            private String algorithmId; 
            private String algorithmName; 
            private String algorithmProvider; 
            private String displayName; 
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private String userId; 
            private String workspaceId; 

            /**
             * AlgorithmDescription.
             */
            public Builder algorithmDescription(String algorithmDescription) {
                this.algorithmDescription = algorithmDescription;
                return this;
            }

            /**
             * AlgorithmId.
             */
            public Builder algorithmId(String algorithmId) {
                this.algorithmId = algorithmId;
                return this;
            }

            /**
             * AlgorithmName.
             */
            public Builder algorithmName(String algorithmName) {
                this.algorithmName = algorithmName;
                return this;
            }

            /**
             * AlgorithmProvider.
             */
            public Builder algorithmProvider(String algorithmProvider) {
                this.algorithmProvider = algorithmProvider;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * GmtCreateTime.
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * GmtModifiedTime.
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * WorkspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Algorithms build() {
                return new Algorithms(this);
            } 

        } 

    }
}
