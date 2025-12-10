// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20210202.models;

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
 * {@link ListRecentExperimentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRecentExperimentsResponseBody</p>
 */
public class ListRecentExperimentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Experiments")
    private java.util.List<Experiments> experiments;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListRecentExperimentsResponseBody(Builder builder) {
        this.experiments = builder.experiments;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRecentExperimentsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return experiments
     */
    public java.util.List<Experiments> getExperiments() {
        return this.experiments;
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
        private java.util.List<Experiments> experiments; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListRecentExperimentsResponseBody model) {
            this.experiments = model.experiments;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * Experiments.
         */
        public Builder experiments(java.util.List<Experiments> experiments) {
            this.experiments = experiments;
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

        public ListRecentExperimentsResponseBody build() {
            return new ListRecentExperimentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRecentExperimentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRecentExperimentsResponseBody</p>
     */
    public static class Experiments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExperimentId")
        private String experimentId;

        @com.aliyun.core.annotation.NameInMap("ModifyCnt")
        private Long modifyCnt;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RecentGmtModifiedTime")
        private String recentGmtModifiedTime;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        @com.aliyun.core.annotation.NameInMap("WorkspaceName")
        private String workspaceName;

        private Experiments(Builder builder) {
            this.description = builder.description;
            this.experimentId = builder.experimentId;
            this.modifyCnt = builder.modifyCnt;
            this.name = builder.name;
            this.recentGmtModifiedTime = builder.recentGmtModifiedTime;
            this.source = builder.source;
            this.workspaceId = builder.workspaceId;
            this.workspaceName = builder.workspaceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Experiments create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return experimentId
         */
        public String getExperimentId() {
            return this.experimentId;
        }

        /**
         * @return modifyCnt
         */
        public Long getModifyCnt() {
            return this.modifyCnt;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return recentGmtModifiedTime
         */
        public String getRecentGmtModifiedTime() {
            return this.recentGmtModifiedTime;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        /**
         * @return workspaceName
         */
        public String getWorkspaceName() {
            return this.workspaceName;
        }

        public static final class Builder {
            private String description; 
            private String experimentId; 
            private Long modifyCnt; 
            private String name; 
            private String recentGmtModifiedTime; 
            private String source; 
            private String workspaceId; 
            private String workspaceName; 

            private Builder() {
            } 

            private Builder(Experiments model) {
                this.description = model.description;
                this.experimentId = model.experimentId;
                this.modifyCnt = model.modifyCnt;
                this.name = model.name;
                this.recentGmtModifiedTime = model.recentGmtModifiedTime;
                this.source = model.source;
                this.workspaceId = model.workspaceId;
                this.workspaceName = model.workspaceName;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ExperimentId.
             */
            public Builder experimentId(String experimentId) {
                this.experimentId = experimentId;
                return this;
            }

            /**
             * ModifyCnt.
             */
            public Builder modifyCnt(Long modifyCnt) {
                this.modifyCnt = modifyCnt;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RecentGmtModifiedTime.
             */
            public Builder recentGmtModifiedTime(String recentGmtModifiedTime) {
                this.recentGmtModifiedTime = recentGmtModifiedTime;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * WorkspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            /**
             * WorkspaceName.
             */
            public Builder workspaceName(String workspaceName) {
                this.workspaceName = workspaceName;
                return this;
            }

            public Experiments build() {
                return new Experiments(this);
            } 

        } 

    }
}
