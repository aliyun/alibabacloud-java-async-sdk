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
 * {@link ListAlgorithmsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAlgorithmsResponseBody</p>
 */
public class ListAlgorithmsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Algorithms")
    private java.util.List<Algorithms> algorithms;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithms
     */
    public java.util.List<Algorithms> getAlgorithms() {
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
        private java.util.List<Algorithms> algorithms; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListAlgorithmsResponseBody model) {
            this.algorithms = model.algorithms;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Algorithm list.</p>
         */
        public Builder algorithms(java.util.List<Algorithms> algorithms) {
            this.algorithms = algorithms;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total algorithms.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAlgorithmsResponseBody build() {
            return new ListAlgorithmsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAlgorithmsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlgorithmsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Algorithms model) {
                this.algorithmDescription = model.algorithmDescription;
                this.algorithmId = model.algorithmId;
                this.algorithmName = model.algorithmName;
                this.algorithmProvider = model.algorithmProvider;
                this.displayName = model.displayName;
                this.gmtCreateTime = model.gmtCreateTime;
                this.gmtModifiedTime = model.gmtModifiedTime;
                this.userId = model.userId;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>Algorithm description.</p>
             * 
             * <strong>example:</strong>
             * <p>Large language model training.</p>
             */
            public Builder algorithmDescription(String algorithmDescription) {
                this.algorithmDescription = algorithmDescription;
                return this;
            }

            /**
             * <p>Algorithm ID.</p>
             * 
             * <strong>example:</strong>
             * <p>algo-sidjc8134hv</p>
             */
            public Builder algorithmId(String algorithmId) {
                this.algorithmId = algorithmId;
                return this;
            }

            /**
             * <p>Algorithm name.</p>
             * 
             * <strong>example:</strong>
             * <p>llm_train</p>
             */
            public Builder algorithmName(String algorithmName) {
                this.algorithmName = algorithmName;
                return this;
            }

            /**
             * <p>Algorithm provider.</p>
             * 
             * <strong>example:</strong>
             * <p>pai</p>
             */
            public Builder algorithmProvider(String algorithmProvider) {
                this.algorithmProvider = algorithmProvider;
                return this;
            }

            /**
             * <p>Algorithm display name.</p>
             * 
             * <strong>example:</strong>
             * <p>LLM Train</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>Algorithm creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-07-21T03:35:24Z</p>
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * <p>Algorithm update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-07-25T02:15:40Z</p>
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * <p>Algorithm owner ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>Workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
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
