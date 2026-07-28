// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeApplicationUsageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApplicationUsageResponseBody</p>
 */
public class DescribeApplicationUsageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("DailyUsage")
    private java.util.List<DailyUsage> dailyUsage;

    @com.aliyun.core.annotation.NameInMap("Days")
    private Integer days;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("ModelUsage")
    private java.util.List<ModelUsage> modelUsage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SessionSummary")
    private SessionSummary sessionSummary;

    @com.aliyun.core.annotation.NameInMap("SkillUsage")
    private SkillUsage skillUsage;

    @com.aliyun.core.annotation.NameInMap("Summary")
    private Summary summary;

    private DescribeApplicationUsageResponseBody(Builder builder) {
        this.applicationId = builder.applicationId;
        this.code = builder.code;
        this.dailyUsage = builder.dailyUsage;
        this.days = builder.days;
        this.message = builder.message;
        this.modelUsage = builder.modelUsage;
        this.requestId = builder.requestId;
        this.sessionSummary = builder.sessionSummary;
        this.skillUsage = builder.skillUsage;
        this.summary = builder.summary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationUsageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return dailyUsage
     */
    public java.util.List<DailyUsage> getDailyUsage() {
        return this.dailyUsage;
    }

    /**
     * @return days
     */
    public Integer getDays() {
        return this.days;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return modelUsage
     */
    public java.util.List<ModelUsage> getModelUsage() {
        return this.modelUsage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sessionSummary
     */
    public SessionSummary getSessionSummary() {
        return this.sessionSummary;
    }

    /**
     * @return skillUsage
     */
    public SkillUsage getSkillUsage() {
        return this.skillUsage;
    }

    /**
     * @return summary
     */
    public Summary getSummary() {
        return this.summary;
    }

    public static final class Builder {
        private String applicationId; 
        private Integer code; 
        private java.util.List<DailyUsage> dailyUsage; 
        private Integer days; 
        private String message; 
        private java.util.List<ModelUsage> modelUsage; 
        private String requestId; 
        private SessionSummary sessionSummary; 
        private SkillUsage skillUsage; 
        private Summary summary; 

        private Builder() {
        } 

        private Builder(DescribeApplicationUsageResponseBody model) {
            this.applicationId = model.applicationId;
            this.code = model.code;
            this.dailyUsage = model.dailyUsage;
            this.days = model.days;
            this.message = model.message;
            this.modelUsage = model.modelUsage;
            this.requestId = model.requestId;
            this.sessionSummary = model.sessionSummary;
            this.skillUsage = model.skillUsage;
            this.summary = model.summary;
        } 

        /**
         * ApplicationId.
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * DailyUsage.
         */
        public Builder dailyUsage(java.util.List<DailyUsage> dailyUsage) {
            this.dailyUsage = dailyUsage;
            return this;
        }

        /**
         * Days.
         */
        public Builder days(Integer days) {
            this.days = days;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * ModelUsage.
         */
        public Builder modelUsage(java.util.List<ModelUsage> modelUsage) {
            this.modelUsage = modelUsage;
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
         * SessionSummary.
         */
        public Builder sessionSummary(SessionSummary sessionSummary) {
            this.sessionSummary = sessionSummary;
            return this;
        }

        /**
         * SkillUsage.
         */
        public Builder skillUsage(SkillUsage skillUsage) {
            this.skillUsage = skillUsage;
            return this;
        }

        /**
         * Summary.
         */
        public Builder summary(Summary summary) {
            this.summary = summary;
            return this;
        }

        public DescribeApplicationUsageResponseBody build() {
            return new DescribeApplicationUsageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApplicationUsageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationUsageResponseBody</p>
     */
    public static class DailyUsage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("APICalls")
        private Long APICalls;

        @com.aliyun.core.annotation.NameInMap("CacheReadTokens")
        private Long cacheReadTokens;

        @com.aliyun.core.annotation.NameInMap("Date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("InputTokens")
        private Long inputTokens;

        @com.aliyun.core.annotation.NameInMap("OutputTokens")
        private Long outputTokens;

        @com.aliyun.core.annotation.NameInMap("ReasoningTokens")
        private Long reasoningTokens;

        @com.aliyun.core.annotation.NameInMap("Sessions")
        private Long sessions;

        private DailyUsage(Builder builder) {
            this.APICalls = builder.APICalls;
            this.cacheReadTokens = builder.cacheReadTokens;
            this.date = builder.date;
            this.inputTokens = builder.inputTokens;
            this.outputTokens = builder.outputTokens;
            this.reasoningTokens = builder.reasoningTokens;
            this.sessions = builder.sessions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DailyUsage create() {
            return builder().build();
        }

        /**
         * @return APICalls
         */
        public Long getAPICalls() {
            return this.APICalls;
        }

        /**
         * @return cacheReadTokens
         */
        public Long getCacheReadTokens() {
            return this.cacheReadTokens;
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return inputTokens
         */
        public Long getInputTokens() {
            return this.inputTokens;
        }

        /**
         * @return outputTokens
         */
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        /**
         * @return reasoningTokens
         */
        public Long getReasoningTokens() {
            return this.reasoningTokens;
        }

        /**
         * @return sessions
         */
        public Long getSessions() {
            return this.sessions;
        }

        public static final class Builder {
            private Long APICalls; 
            private Long cacheReadTokens; 
            private String date; 
            private Long inputTokens; 
            private Long outputTokens; 
            private Long reasoningTokens; 
            private Long sessions; 

            private Builder() {
            } 

            private Builder(DailyUsage model) {
                this.APICalls = model.APICalls;
                this.cacheReadTokens = model.cacheReadTokens;
                this.date = model.date;
                this.inputTokens = model.inputTokens;
                this.outputTokens = model.outputTokens;
                this.reasoningTokens = model.reasoningTokens;
                this.sessions = model.sessions;
            } 

            /**
             * APICalls.
             */
            public Builder APICalls(Long APICalls) {
                this.APICalls = APICalls;
                return this;
            }

            /**
             * CacheReadTokens.
             */
            public Builder cacheReadTokens(Long cacheReadTokens) {
                this.cacheReadTokens = cacheReadTokens;
                return this;
            }

            /**
             * Date.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * InputTokens.
             */
            public Builder inputTokens(Long inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * OutputTokens.
             */
            public Builder outputTokens(Long outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            /**
             * ReasoningTokens.
             */
            public Builder reasoningTokens(Long reasoningTokens) {
                this.reasoningTokens = reasoningTokens;
                return this;
            }

            /**
             * Sessions.
             */
            public Builder sessions(Long sessions) {
                this.sessions = sessions;
                return this;
            }

            public DailyUsage build() {
                return new DailyUsage(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationUsageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationUsageResponseBody</p>
     */
    public static class ModelUsage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("APICalls")
        private Long APICalls;

        @com.aliyun.core.annotation.NameInMap("CacheReadTokens")
        private Long cacheReadTokens;

        @com.aliyun.core.annotation.NameInMap("InputTokens")
        private Long inputTokens;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("OutputTokens")
        private Long outputTokens;

        @com.aliyun.core.annotation.NameInMap("Provider")
        private String provider;

        @com.aliyun.core.annotation.NameInMap("ReasoningTokens")
        private Long reasoningTokens;

        @com.aliyun.core.annotation.NameInMap("Sessions")
        private Long sessions;

        private ModelUsage(Builder builder) {
            this.APICalls = builder.APICalls;
            this.cacheReadTokens = builder.cacheReadTokens;
            this.inputTokens = builder.inputTokens;
            this.model = builder.model;
            this.outputTokens = builder.outputTokens;
            this.provider = builder.provider;
            this.reasoningTokens = builder.reasoningTokens;
            this.sessions = builder.sessions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelUsage create() {
            return builder().build();
        }

        /**
         * @return APICalls
         */
        public Long getAPICalls() {
            return this.APICalls;
        }

        /**
         * @return cacheReadTokens
         */
        public Long getCacheReadTokens() {
            return this.cacheReadTokens;
        }

        /**
         * @return inputTokens
         */
        public Long getInputTokens() {
            return this.inputTokens;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return outputTokens
         */
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        /**
         * @return provider
         */
        public String getProvider() {
            return this.provider;
        }

        /**
         * @return reasoningTokens
         */
        public Long getReasoningTokens() {
            return this.reasoningTokens;
        }

        /**
         * @return sessions
         */
        public Long getSessions() {
            return this.sessions;
        }

        public static final class Builder {
            private Long APICalls; 
            private Long cacheReadTokens; 
            private Long inputTokens; 
            private String model; 
            private Long outputTokens; 
            private String provider; 
            private Long reasoningTokens; 
            private Long sessions; 

            private Builder() {
            } 

            private Builder(ModelUsage model) {
                this.APICalls = model.APICalls;
                this.cacheReadTokens = model.cacheReadTokens;
                this.inputTokens = model.inputTokens;
                this.model = model.model;
                this.outputTokens = model.outputTokens;
                this.provider = model.provider;
                this.reasoningTokens = model.reasoningTokens;
                this.sessions = model.sessions;
            } 

            /**
             * APICalls.
             */
            public Builder APICalls(Long APICalls) {
                this.APICalls = APICalls;
                return this;
            }

            /**
             * CacheReadTokens.
             */
            public Builder cacheReadTokens(Long cacheReadTokens) {
                this.cacheReadTokens = cacheReadTokens;
                return this;
            }

            /**
             * InputTokens.
             */
            public Builder inputTokens(Long inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * Model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * OutputTokens.
             */
            public Builder outputTokens(Long outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            /**
             * Provider.
             */
            public Builder provider(String provider) {
                this.provider = provider;
                return this;
            }

            /**
             * ReasoningTokens.
             */
            public Builder reasoningTokens(Long reasoningTokens) {
                this.reasoningTokens = reasoningTokens;
                return this;
            }

            /**
             * Sessions.
             */
            public Builder sessions(Long sessions) {
                this.sessions = sessions;
                return this;
            }

            public ModelUsage build() {
                return new ModelUsage(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationUsageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationUsageResponseBody</p>
     */
    public static class SessionSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveSessions")
        private Long activeSessions;

        @com.aliyun.core.annotation.NameInMap("StoredSessions")
        private Long storedSessions;

        private SessionSummary(Builder builder) {
            this.activeSessions = builder.activeSessions;
            this.storedSessions = builder.storedSessions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SessionSummary create() {
            return builder().build();
        }

        /**
         * @return activeSessions
         */
        public Long getActiveSessions() {
            return this.activeSessions;
        }

        /**
         * @return storedSessions
         */
        public Long getStoredSessions() {
            return this.storedSessions;
        }

        public static final class Builder {
            private Long activeSessions; 
            private Long storedSessions; 

            private Builder() {
            } 

            private Builder(SessionSummary model) {
                this.activeSessions = model.activeSessions;
                this.storedSessions = model.storedSessions;
            } 

            /**
             * ActiveSessions.
             */
            public Builder activeSessions(Long activeSessions) {
                this.activeSessions = activeSessions;
                return this;
            }

            /**
             * StoredSessions.
             */
            public Builder storedSessions(Long storedSessions) {
                this.storedSessions = storedSessions;
                return this;
            }

            public SessionSummary build() {
                return new SessionSummary(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationUsageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationUsageResponseBody</p>
     */
    public static class SkillUsage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DistinctSkills")
        private Long distinctSkills;

        @com.aliyun.core.annotation.NameInMap("TotalActions")
        private Long totalActions;

        @com.aliyun.core.annotation.NameInMap("TotalEdits")
        private Long totalEdits;

        @com.aliyun.core.annotation.NameInMap("TotalLoads")
        private Long totalLoads;

        private SkillUsage(Builder builder) {
            this.distinctSkills = builder.distinctSkills;
            this.totalActions = builder.totalActions;
            this.totalEdits = builder.totalEdits;
            this.totalLoads = builder.totalLoads;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkillUsage create() {
            return builder().build();
        }

        /**
         * @return distinctSkills
         */
        public Long getDistinctSkills() {
            return this.distinctSkills;
        }

        /**
         * @return totalActions
         */
        public Long getTotalActions() {
            return this.totalActions;
        }

        /**
         * @return totalEdits
         */
        public Long getTotalEdits() {
            return this.totalEdits;
        }

        /**
         * @return totalLoads
         */
        public Long getTotalLoads() {
            return this.totalLoads;
        }

        public static final class Builder {
            private Long distinctSkills; 
            private Long totalActions; 
            private Long totalEdits; 
            private Long totalLoads; 

            private Builder() {
            } 

            private Builder(SkillUsage model) {
                this.distinctSkills = model.distinctSkills;
                this.totalActions = model.totalActions;
                this.totalEdits = model.totalEdits;
                this.totalLoads = model.totalLoads;
            } 

            /**
             * DistinctSkills.
             */
            public Builder distinctSkills(Long distinctSkills) {
                this.distinctSkills = distinctSkills;
                return this;
            }

            /**
             * TotalActions.
             */
            public Builder totalActions(Long totalActions) {
                this.totalActions = totalActions;
                return this;
            }

            /**
             * TotalEdits.
             */
            public Builder totalEdits(Long totalEdits) {
                this.totalEdits = totalEdits;
                return this;
            }

            /**
             * TotalLoads.
             */
            public Builder totalLoads(Long totalLoads) {
                this.totalLoads = totalLoads;
                return this;
            }

            public SkillUsage build() {
                return new SkillUsage(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationUsageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationUsageResponseBody</p>
     */
    public static class Summary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("APICalls")
        private Long APICalls;

        @com.aliyun.core.annotation.NameInMap("CacheReadTokens")
        private Long cacheReadTokens;

        @com.aliyun.core.annotation.NameInMap("InputTokens")
        private Long inputTokens;

        @com.aliyun.core.annotation.NameInMap("OutputTokens")
        private Long outputTokens;

        @com.aliyun.core.annotation.NameInMap("ReasoningTokens")
        private Long reasoningTokens;

        @com.aliyun.core.annotation.NameInMap("Sessions")
        private Long sessions;

        private Summary(Builder builder) {
            this.APICalls = builder.APICalls;
            this.cacheReadTokens = builder.cacheReadTokens;
            this.inputTokens = builder.inputTokens;
            this.outputTokens = builder.outputTokens;
            this.reasoningTokens = builder.reasoningTokens;
            this.sessions = builder.sessions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Summary create() {
            return builder().build();
        }

        /**
         * @return APICalls
         */
        public Long getAPICalls() {
            return this.APICalls;
        }

        /**
         * @return cacheReadTokens
         */
        public Long getCacheReadTokens() {
            return this.cacheReadTokens;
        }

        /**
         * @return inputTokens
         */
        public Long getInputTokens() {
            return this.inputTokens;
        }

        /**
         * @return outputTokens
         */
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        /**
         * @return reasoningTokens
         */
        public Long getReasoningTokens() {
            return this.reasoningTokens;
        }

        /**
         * @return sessions
         */
        public Long getSessions() {
            return this.sessions;
        }

        public static final class Builder {
            private Long APICalls; 
            private Long cacheReadTokens; 
            private Long inputTokens; 
            private Long outputTokens; 
            private Long reasoningTokens; 
            private Long sessions; 

            private Builder() {
            } 

            private Builder(Summary model) {
                this.APICalls = model.APICalls;
                this.cacheReadTokens = model.cacheReadTokens;
                this.inputTokens = model.inputTokens;
                this.outputTokens = model.outputTokens;
                this.reasoningTokens = model.reasoningTokens;
                this.sessions = model.sessions;
            } 

            /**
             * APICalls.
             */
            public Builder APICalls(Long APICalls) {
                this.APICalls = APICalls;
                return this;
            }

            /**
             * CacheReadTokens.
             */
            public Builder cacheReadTokens(Long cacheReadTokens) {
                this.cacheReadTokens = cacheReadTokens;
                return this;
            }

            /**
             * InputTokens.
             */
            public Builder inputTokens(Long inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * OutputTokens.
             */
            public Builder outputTokens(Long outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            /**
             * ReasoningTokens.
             */
            public Builder reasoningTokens(Long reasoningTokens) {
                this.reasoningTokens = reasoningTokens;
                return this;
            }

            /**
             * Sessions.
             */
            public Builder sessions(Long sessions) {
                this.sessions = sessions;
                return this;
            }

            public Summary build() {
                return new Summary(this);
            } 

        } 

    }
}
