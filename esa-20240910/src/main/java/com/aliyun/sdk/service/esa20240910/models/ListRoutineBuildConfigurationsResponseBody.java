// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListRoutineBuildConfigurationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRoutineBuildConfigurationsResponseBody</p>
 */
public class ListRoutineBuildConfigurationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RoutineBuildConfigurations")
    private java.util.List<RoutineBuildConfigurations> routineBuildConfigurations;

    private ListRoutineBuildConfigurationsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.routineBuildConfigurations = builder.routineBuildConfigurations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRoutineBuildConfigurationsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return routineBuildConfigurations
     */
    public java.util.List<RoutineBuildConfigurations> getRoutineBuildConfigurations() {
        return this.routineBuildConfigurations;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<RoutineBuildConfigurations> routineBuildConfigurations; 

        private Builder() {
        } 

        private Builder(ListRoutineBuildConfigurationsResponseBody model) {
            this.requestId = model.requestId;
            this.routineBuildConfigurations = model.routineBuildConfigurations;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RoutineBuildConfigurations.
         */
        public Builder routineBuildConfigurations(java.util.List<RoutineBuildConfigurations> routineBuildConfigurations) {
            this.routineBuildConfigurations = routineBuildConfigurations;
            return this;
        }

        public ListRoutineBuildConfigurationsResponseBody build() {
            return new ListRoutineBuildConfigurationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRoutineBuildConfigurationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRoutineBuildConfigurationsResponseBody</p>
     */
    public static class LatestRoutineBuildTask extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("RoutineName")
        private String routineName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private LatestRoutineBuildTask(Builder builder) {
            this.createTime = builder.createTime;
            this.routineName = builder.routineName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LatestRoutineBuildTask create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return routineName
         */
        public String getRoutineName() {
            return this.routineName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String createTime; 
            private String routineName; 
            private String status; 

            private Builder() {
            } 

            private Builder(LatestRoutineBuildTask model) {
                this.createTime = model.createTime;
                this.routineName = model.routineName;
                this.status = model.status;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * RoutineName.
             */
            public Builder routineName(String routineName) {
                this.routineName = routineName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public LatestRoutineBuildTask build() {
                return new LatestRoutineBuildTask(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRoutineBuildConfigurationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRoutineBuildConfigurationsResponseBody</p>
     */
    public static class RoutineBuildConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GitAccountName")
        private String gitAccountName;

        @com.aliyun.core.annotation.NameInMap("GitPlatform")
        private String gitPlatform;

        @com.aliyun.core.annotation.NameInMap("ProductionBranch")
        private String productionBranch;

        @com.aliyun.core.annotation.NameInMap("Repository")
        private String repository;

        @com.aliyun.core.annotation.NameInMap("RoutineName")
        private String routineName;

        private RoutineBuildConfiguration(Builder builder) {
            this.gitAccountName = builder.gitAccountName;
            this.gitPlatform = builder.gitPlatform;
            this.productionBranch = builder.productionBranch;
            this.repository = builder.repository;
            this.routineName = builder.routineName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoutineBuildConfiguration create() {
            return builder().build();
        }

        /**
         * @return gitAccountName
         */
        public String getGitAccountName() {
            return this.gitAccountName;
        }

        /**
         * @return gitPlatform
         */
        public String getGitPlatform() {
            return this.gitPlatform;
        }

        /**
         * @return productionBranch
         */
        public String getProductionBranch() {
            return this.productionBranch;
        }

        /**
         * @return repository
         */
        public String getRepository() {
            return this.repository;
        }

        /**
         * @return routineName
         */
        public String getRoutineName() {
            return this.routineName;
        }

        public static final class Builder {
            private String gitAccountName; 
            private String gitPlatform; 
            private String productionBranch; 
            private String repository; 
            private String routineName; 

            private Builder() {
            } 

            private Builder(RoutineBuildConfiguration model) {
                this.gitAccountName = model.gitAccountName;
                this.gitPlatform = model.gitPlatform;
                this.productionBranch = model.productionBranch;
                this.repository = model.repository;
                this.routineName = model.routineName;
            } 

            /**
             * GitAccountName.
             */
            public Builder gitAccountName(String gitAccountName) {
                this.gitAccountName = gitAccountName;
                return this;
            }

            /**
             * GitPlatform.
             */
            public Builder gitPlatform(String gitPlatform) {
                this.gitPlatform = gitPlatform;
                return this;
            }

            /**
             * ProductionBranch.
             */
            public Builder productionBranch(String productionBranch) {
                this.productionBranch = productionBranch;
                return this;
            }

            /**
             * Repository.
             */
            public Builder repository(String repository) {
                this.repository = repository;
                return this;
            }

            /**
             * RoutineName.
             */
            public Builder routineName(String routineName) {
                this.routineName = routineName;
                return this;
            }

            public RoutineBuildConfiguration build() {
                return new RoutineBuildConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRoutineBuildConfigurationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRoutineBuildConfigurationsResponseBody</p>
     */
    public static class RoutineBuildConfigurations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LatestRoutineBuildTask")
        private LatestRoutineBuildTask latestRoutineBuildTask;

        @com.aliyun.core.annotation.NameInMap("RoutineBuildConfiguration")
        private RoutineBuildConfiguration routineBuildConfiguration;

        private RoutineBuildConfigurations(Builder builder) {
            this.latestRoutineBuildTask = builder.latestRoutineBuildTask;
            this.routineBuildConfiguration = builder.routineBuildConfiguration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoutineBuildConfigurations create() {
            return builder().build();
        }

        /**
         * @return latestRoutineBuildTask
         */
        public LatestRoutineBuildTask getLatestRoutineBuildTask() {
            return this.latestRoutineBuildTask;
        }

        /**
         * @return routineBuildConfiguration
         */
        public RoutineBuildConfiguration getRoutineBuildConfiguration() {
            return this.routineBuildConfiguration;
        }

        public static final class Builder {
            private LatestRoutineBuildTask latestRoutineBuildTask; 
            private RoutineBuildConfiguration routineBuildConfiguration; 

            private Builder() {
            } 

            private Builder(RoutineBuildConfigurations model) {
                this.latestRoutineBuildTask = model.latestRoutineBuildTask;
                this.routineBuildConfiguration = model.routineBuildConfiguration;
            } 

            /**
             * LatestRoutineBuildTask.
             */
            public Builder latestRoutineBuildTask(LatestRoutineBuildTask latestRoutineBuildTask) {
                this.latestRoutineBuildTask = latestRoutineBuildTask;
                return this;
            }

            /**
             * RoutineBuildConfiguration.
             */
            public Builder routineBuildConfiguration(RoutineBuildConfiguration routineBuildConfiguration) {
                this.routineBuildConfiguration = routineBuildConfiguration;
                return this;
            }

            public RoutineBuildConfigurations build() {
                return new RoutineBuildConfigurations(this);
            } 

        } 

    }
}
