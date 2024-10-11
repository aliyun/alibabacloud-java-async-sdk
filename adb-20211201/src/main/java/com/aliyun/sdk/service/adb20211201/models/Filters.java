// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Filters} extends {@link TeaModel}
 *
 * <p>Filters</p>
 */
public class Filters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppIdRegex")
    private String appIdRegex;

    @com.aliyun.core.annotation.NameInMap("AppNameRegex")
    private String appNameRegex;

    @com.aliyun.core.annotation.NameInMap("AppState")
    private String appState;

    @com.aliyun.core.annotation.NameInMap("AppType")
    private String appType;

    @com.aliyun.core.annotation.NameInMap("ExecutionTimeRange")
    private ExecutionTimeRange executionTimeRange;

    @com.aliyun.core.annotation.NameInMap("SubmitTimeRange")
    private SubmitTimeRange submitTimeRange;

    @com.aliyun.core.annotation.NameInMap("TermiatedTimeRange")
    private TermiatedTimeRange termiatedTimeRange;

    private Filters(Builder builder) {
        this.appIdRegex = builder.appIdRegex;
        this.appNameRegex = builder.appNameRegex;
        this.appState = builder.appState;
        this.appType = builder.appType;
        this.executionTimeRange = builder.executionTimeRange;
        this.submitTimeRange = builder.submitTimeRange;
        this.termiatedTimeRange = builder.termiatedTimeRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Filters create() {
        return builder().build();
    }

    /**
     * @return appIdRegex
     */
    public String getAppIdRegex() {
        return this.appIdRegex;
    }

    /**
     * @return appNameRegex
     */
    public String getAppNameRegex() {
        return this.appNameRegex;
    }

    /**
     * @return appState
     */
    public String getAppState() {
        return this.appState;
    }

    /**
     * @return appType
     */
    public String getAppType() {
        return this.appType;
    }

    /**
     * @return executionTimeRange
     */
    public ExecutionTimeRange getExecutionTimeRange() {
        return this.executionTimeRange;
    }

    /**
     * @return submitTimeRange
     */
    public SubmitTimeRange getSubmitTimeRange() {
        return this.submitTimeRange;
    }

    /**
     * @return termiatedTimeRange
     */
    public TermiatedTimeRange getTermiatedTimeRange() {
        return this.termiatedTimeRange;
    }

    public static final class Builder {
        private String appIdRegex; 
        private String appNameRegex; 
        private String appState; 
        private String appType; 
        private ExecutionTimeRange executionTimeRange; 
        private SubmitTimeRange submitTimeRange; 
        private TermiatedTimeRange termiatedTimeRange; 

        /**
         * AppIdRegex.
         */
        public Builder appIdRegex(String appIdRegex) {
            this.appIdRegex = appIdRegex;
            return this;
        }

        /**
         * AppNameRegex.
         */
        public Builder appNameRegex(String appNameRegex) {
            this.appNameRegex = appNameRegex;
            return this;
        }

        /**
         * AppState.
         */
        public Builder appState(String appState) {
            this.appState = appState;
            return this;
        }

        /**
         * AppType.
         */
        public Builder appType(String appType) {
            this.appType = appType;
            return this;
        }

        /**
         * ExecutionTimeRange.
         */
        public Builder executionTimeRange(ExecutionTimeRange executionTimeRange) {
            this.executionTimeRange = executionTimeRange;
            return this;
        }

        /**
         * SubmitTimeRange.
         */
        public Builder submitTimeRange(SubmitTimeRange submitTimeRange) {
            this.submitTimeRange = submitTimeRange;
            return this;
        }

        /**
         * TermiatedTimeRange.
         */
        public Builder termiatedTimeRange(TermiatedTimeRange termiatedTimeRange) {
            this.termiatedTimeRange = termiatedTimeRange;
            return this;
        }

        public Filters build() {
            return new Filters(this);
        } 

    } 

    /**
     * 
     * {@link Filters} extends {@link TeaModel}
     *
     * <p>Filters</p>
     */
    public static class ExecutionTimeRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxTimeInSeconds")
        private Long maxTimeInSeconds;

        @com.aliyun.core.annotation.NameInMap("MinTimeInSeconds")
        private Long minTimeInSeconds;

        private ExecutionTimeRange(Builder builder) {
            this.maxTimeInSeconds = builder.maxTimeInSeconds;
            this.minTimeInSeconds = builder.minTimeInSeconds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExecutionTimeRange create() {
            return builder().build();
        }

        /**
         * @return maxTimeInSeconds
         */
        public Long getMaxTimeInSeconds() {
            return this.maxTimeInSeconds;
        }

        /**
         * @return minTimeInSeconds
         */
        public Long getMinTimeInSeconds() {
            return this.minTimeInSeconds;
        }

        public static final class Builder {
            private Long maxTimeInSeconds; 
            private Long minTimeInSeconds; 

            /**
             * MaxTimeInSeconds.
             */
            public Builder maxTimeInSeconds(Long maxTimeInSeconds) {
                this.maxTimeInSeconds = maxTimeInSeconds;
                return this;
            }

            /**
             * MinTimeInSeconds.
             */
            public Builder minTimeInSeconds(Long minTimeInSeconds) {
                this.minTimeInSeconds = minTimeInSeconds;
                return this;
            }

            public ExecutionTimeRange build() {
                return new ExecutionTimeRange(this);
            } 

        } 

    }
    /**
     * 
     * {@link Filters} extends {@link TeaModel}
     *
     * <p>Filters</p>
     */
    public static class SubmitTimeRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxTimeInMills")
        private Long maxTimeInMills;

        @com.aliyun.core.annotation.NameInMap("MinTimeInMills")
        private Long minTimeInMills;

        private SubmitTimeRange(Builder builder) {
            this.maxTimeInMills = builder.maxTimeInMills;
            this.minTimeInMills = builder.minTimeInMills;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubmitTimeRange create() {
            return builder().build();
        }

        /**
         * @return maxTimeInMills
         */
        public Long getMaxTimeInMills() {
            return this.maxTimeInMills;
        }

        /**
         * @return minTimeInMills
         */
        public Long getMinTimeInMills() {
            return this.minTimeInMills;
        }

        public static final class Builder {
            private Long maxTimeInMills; 
            private Long minTimeInMills; 

            /**
             * MaxTimeInMills.
             */
            public Builder maxTimeInMills(Long maxTimeInMills) {
                this.maxTimeInMills = maxTimeInMills;
                return this;
            }

            /**
             * MinTimeInMills.
             */
            public Builder minTimeInMills(Long minTimeInMills) {
                this.minTimeInMills = minTimeInMills;
                return this;
            }

            public SubmitTimeRange build() {
                return new SubmitTimeRange(this);
            } 

        } 

    }
    /**
     * 
     * {@link Filters} extends {@link TeaModel}
     *
     * <p>Filters</p>
     */
    public static class TermiatedTimeRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxTimeInMills")
        private Long maxTimeInMills;

        @com.aliyun.core.annotation.NameInMap("MinTimeInMills")
        private Long minTimeInMills;

        private TermiatedTimeRange(Builder builder) {
            this.maxTimeInMills = builder.maxTimeInMills;
            this.minTimeInMills = builder.minTimeInMills;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TermiatedTimeRange create() {
            return builder().build();
        }

        /**
         * @return maxTimeInMills
         */
        public Long getMaxTimeInMills() {
            return this.maxTimeInMills;
        }

        /**
         * @return minTimeInMills
         */
        public Long getMinTimeInMills() {
            return this.minTimeInMills;
        }

        public static final class Builder {
            private Long maxTimeInMills; 
            private Long minTimeInMills; 

            /**
             * MaxTimeInMills.
             */
            public Builder maxTimeInMills(Long maxTimeInMills) {
                this.maxTimeInMills = maxTimeInMills;
                return this;
            }

            /**
             * MinTimeInMills.
             */
            public Builder minTimeInMills(Long minTimeInMills) {
                this.minTimeInMills = minTimeInMills;
                return this;
            }

            public TermiatedTimeRange build() {
                return new TermiatedTimeRange(this);
            } 

        } 

    }
}
