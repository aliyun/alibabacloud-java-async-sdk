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
 * {@link ListExperimentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListExperimentsResponseBody</p>
 */
public class ListExperimentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Experiments")
    private java.util.List<Experiments> experiments;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListExperimentsResponseBody(Builder builder) {
        this.experiments = builder.experiments;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExperimentsResponseBody create() {
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

        private Builder(ListExperimentsResponseBody model) {
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

        public ListExperimentsResponseBody build() {
            return new ListExperimentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListExperimentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListExperimentsResponseBody</p>
     */
    public static class Experiments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Accessibility")
        private String accessibility;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExperimentId")
        private String experimentId;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Long version;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        private Experiments(Builder builder) {
            this.accessibility = builder.accessibility;
            this.creator = builder.creator;
            this.description = builder.description;
            this.experimentId = builder.experimentId;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.name = builder.name;
            this.source = builder.source;
            this.version = builder.version;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Experiments create() {
            return builder().build();
        }

        /**
         * @return accessibility
         */
        public String getAccessibility() {
            return this.accessibility;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return version
         */
        public Long getVersion() {
            return this.version;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String accessibility; 
            private String creator; 
            private String description; 
            private String experimentId; 
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private String name; 
            private String source; 
            private Long version; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Experiments model) {
                this.accessibility = model.accessibility;
                this.creator = model.creator;
                this.description = model.description;
                this.experimentId = model.experimentId;
                this.gmtCreateTime = model.gmtCreateTime;
                this.gmtModifiedTime = model.gmtModifiedTime;
                this.name = model.name;
                this.source = model.source;
                this.version = model.version;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * Accessibility.
             */
            public Builder accessibility(String accessibility) {
                this.accessibility = accessibility;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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
             * Version.
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            /**
             * WorkspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Experiments build() {
                return new Experiments(this);
            } 

        } 

    }
}
