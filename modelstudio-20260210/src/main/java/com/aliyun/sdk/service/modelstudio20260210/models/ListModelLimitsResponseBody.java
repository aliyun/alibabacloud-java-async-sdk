// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.modelstudio20260210.models;

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
 * {@link ListModelLimitsResponseBody} extends {@link TeaModel}
 *
 * <p>ListModelLimitsResponseBody</p>
 */
public class ListModelLimitsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Long httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("limits")
    private java.util.List<Limits> limits;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private ListModelLimitsResponseBody(Builder builder) {
        this.code = builder.code;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.limits = builder.limits;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModelLimitsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return limits
     */
    public java.util.List<Limits> getLimits() {
        return this.limits;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private String errorMessage; 
        private Long httpStatusCode; 
        private java.util.List<Limits> limits; 
        private Long maxResults; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListModelLimitsResponseBody model) {
            this.code = model.code;
            this.errorMessage = model.errorMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.limits = model.limits;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * limits.
         */
        public Builder limits(java.util.List<Limits> limits) {
            this.limits = limits;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>36045E0A-551D-592D-B1BC-4C56596CE59E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListModelLimitsResponseBody build() {
            return new ListModelLimitsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListModelLimitsResponseBody} extends {@link TeaModel}
     *
     * <p>ListModelLimitsResponseBody</p>
     */
    public static class ModelLimit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("asyncUserConcurrencyLimit")
        private Long asyncUserConcurrencyLimit;

        @com.aliyun.core.annotation.NameInMap("asyncUserQueueLimit")
        private Long asyncUserQueueLimit;

        @com.aliyun.core.annotation.NameInMap("requestLimit")
        private Long requestLimit;

        @com.aliyun.core.annotation.NameInMap("requestLimitPeriod")
        private Integer requestLimitPeriod;

        @com.aliyun.core.annotation.NameInMap("usageLimit")
        private Long usageLimit;

        @com.aliyun.core.annotation.NameInMap("usageLimitField")
        private String usageLimitField;

        @com.aliyun.core.annotation.NameInMap("usageLimitPeriod")
        private Integer usageLimitPeriod;

        private ModelLimit(Builder builder) {
            this.asyncUserConcurrencyLimit = builder.asyncUserConcurrencyLimit;
            this.asyncUserQueueLimit = builder.asyncUserQueueLimit;
            this.requestLimit = builder.requestLimit;
            this.requestLimitPeriod = builder.requestLimitPeriod;
            this.usageLimit = builder.usageLimit;
            this.usageLimitField = builder.usageLimitField;
            this.usageLimitPeriod = builder.usageLimitPeriod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelLimit create() {
            return builder().build();
        }

        /**
         * @return asyncUserConcurrencyLimit
         */
        public Long getAsyncUserConcurrencyLimit() {
            return this.asyncUserConcurrencyLimit;
        }

        /**
         * @return asyncUserQueueLimit
         */
        public Long getAsyncUserQueueLimit() {
            return this.asyncUserQueueLimit;
        }

        /**
         * @return requestLimit
         */
        public Long getRequestLimit() {
            return this.requestLimit;
        }

        /**
         * @return requestLimitPeriod
         */
        public Integer getRequestLimitPeriod() {
            return this.requestLimitPeriod;
        }

        /**
         * @return usageLimit
         */
        public Long getUsageLimit() {
            return this.usageLimit;
        }

        /**
         * @return usageLimitField
         */
        public String getUsageLimitField() {
            return this.usageLimitField;
        }

        /**
         * @return usageLimitPeriod
         */
        public Integer getUsageLimitPeriod() {
            return this.usageLimitPeriod;
        }

        public static final class Builder {
            private Long asyncUserConcurrencyLimit; 
            private Long asyncUserQueueLimit; 
            private Long requestLimit; 
            private Integer requestLimitPeriod; 
            private Long usageLimit; 
            private String usageLimitField; 
            private Integer usageLimitPeriod; 

            private Builder() {
            } 

            private Builder(ModelLimit model) {
                this.asyncUserConcurrencyLimit = model.asyncUserConcurrencyLimit;
                this.asyncUserQueueLimit = model.asyncUserQueueLimit;
                this.requestLimit = model.requestLimit;
                this.requestLimitPeriod = model.requestLimitPeriod;
                this.usageLimit = model.usageLimit;
                this.usageLimitField = model.usageLimitField;
                this.usageLimitPeriod = model.usageLimitPeriod;
            } 

            /**
             * asyncUserConcurrencyLimit.
             */
            public Builder asyncUserConcurrencyLimit(Long asyncUserConcurrencyLimit) {
                this.asyncUserConcurrencyLimit = asyncUserConcurrencyLimit;
                return this;
            }

            /**
             * asyncUserQueueLimit.
             */
            public Builder asyncUserQueueLimit(Long asyncUserQueueLimit) {
                this.asyncUserQueueLimit = asyncUserQueueLimit;
                return this;
            }

            /**
             * requestLimit.
             */
            public Builder requestLimit(Long requestLimit) {
                this.requestLimit = requestLimit;
                return this;
            }

            /**
             * requestLimitPeriod.
             */
            public Builder requestLimitPeriod(Integer requestLimitPeriod) {
                this.requestLimitPeriod = requestLimitPeriod;
                return this;
            }

            /**
             * usageLimit.
             */
            public Builder usageLimit(Long usageLimit) {
                this.usageLimit = usageLimit;
                return this;
            }

            /**
             * usageLimitField.
             */
            public Builder usageLimitField(String usageLimitField) {
                this.usageLimitField = usageLimitField;
                return this;
            }

            /**
             * usageLimitPeriod.
             */
            public Builder usageLimitPeriod(Integer usageLimitPeriod) {
                this.usageLimitPeriod = usageLimitPeriod;
                return this;
            }

            public ModelLimit build() {
                return new ModelLimit(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListModelLimitsResponseBody} extends {@link TeaModel}
     *
     * <p>ListModelLimitsResponseBody</p>
     */
    public static class WorkspaceLimit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("asyncUserConcurrencyLimit")
        private Long asyncUserConcurrencyLimit;

        @com.aliyun.core.annotation.NameInMap("asyncUserQueueLimit")
        private Long asyncUserQueueLimit;

        @com.aliyun.core.annotation.NameInMap("requestLimit")
        private Long requestLimit;

        @com.aliyun.core.annotation.NameInMap("requestLimitPeriod")
        private Integer requestLimitPeriod;

        @com.aliyun.core.annotation.NameInMap("usageLimit")
        private Long usageLimit;

        @com.aliyun.core.annotation.NameInMap("usageLimitField")
        private String usageLimitField;

        @com.aliyun.core.annotation.NameInMap("usageLimitPeriod")
        private Integer usageLimitPeriod;

        private WorkspaceLimit(Builder builder) {
            this.asyncUserConcurrencyLimit = builder.asyncUserConcurrencyLimit;
            this.asyncUserQueueLimit = builder.asyncUserQueueLimit;
            this.requestLimit = builder.requestLimit;
            this.requestLimitPeriod = builder.requestLimitPeriod;
            this.usageLimit = builder.usageLimit;
            this.usageLimitField = builder.usageLimitField;
            this.usageLimitPeriod = builder.usageLimitPeriod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkspaceLimit create() {
            return builder().build();
        }

        /**
         * @return asyncUserConcurrencyLimit
         */
        public Long getAsyncUserConcurrencyLimit() {
            return this.asyncUserConcurrencyLimit;
        }

        /**
         * @return asyncUserQueueLimit
         */
        public Long getAsyncUserQueueLimit() {
            return this.asyncUserQueueLimit;
        }

        /**
         * @return requestLimit
         */
        public Long getRequestLimit() {
            return this.requestLimit;
        }

        /**
         * @return requestLimitPeriod
         */
        public Integer getRequestLimitPeriod() {
            return this.requestLimitPeriod;
        }

        /**
         * @return usageLimit
         */
        public Long getUsageLimit() {
            return this.usageLimit;
        }

        /**
         * @return usageLimitField
         */
        public String getUsageLimitField() {
            return this.usageLimitField;
        }

        /**
         * @return usageLimitPeriod
         */
        public Integer getUsageLimitPeriod() {
            return this.usageLimitPeriod;
        }

        public static final class Builder {
            private Long asyncUserConcurrencyLimit; 
            private Long asyncUserQueueLimit; 
            private Long requestLimit; 
            private Integer requestLimitPeriod; 
            private Long usageLimit; 
            private String usageLimitField; 
            private Integer usageLimitPeriod; 

            private Builder() {
            } 

            private Builder(WorkspaceLimit model) {
                this.asyncUserConcurrencyLimit = model.asyncUserConcurrencyLimit;
                this.asyncUserQueueLimit = model.asyncUserQueueLimit;
                this.requestLimit = model.requestLimit;
                this.requestLimitPeriod = model.requestLimitPeriod;
                this.usageLimit = model.usageLimit;
                this.usageLimitField = model.usageLimitField;
                this.usageLimitPeriod = model.usageLimitPeriod;
            } 

            /**
             * asyncUserConcurrencyLimit.
             */
            public Builder asyncUserConcurrencyLimit(Long asyncUserConcurrencyLimit) {
                this.asyncUserConcurrencyLimit = asyncUserConcurrencyLimit;
                return this;
            }

            /**
             * asyncUserQueueLimit.
             */
            public Builder asyncUserQueueLimit(Long asyncUserQueueLimit) {
                this.asyncUserQueueLimit = asyncUserQueueLimit;
                return this;
            }

            /**
             * requestLimit.
             */
            public Builder requestLimit(Long requestLimit) {
                this.requestLimit = requestLimit;
                return this;
            }

            /**
             * requestLimitPeriod.
             */
            public Builder requestLimitPeriod(Integer requestLimitPeriod) {
                this.requestLimitPeriod = requestLimitPeriod;
                return this;
            }

            /**
             * usageLimit.
             */
            public Builder usageLimit(Long usageLimit) {
                this.usageLimit = usageLimit;
                return this;
            }

            /**
             * usageLimitField.
             */
            public Builder usageLimitField(String usageLimitField) {
                this.usageLimitField = usageLimitField;
                return this;
            }

            /**
             * usageLimitPeriod.
             */
            public Builder usageLimitPeriod(Integer usageLimitPeriod) {
                this.usageLimitPeriod = usageLimitPeriod;
                return this;
            }

            public WorkspaceLimit build() {
                return new WorkspaceLimit(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListModelLimitsResponseBody} extends {@link TeaModel}
     *
     * <p>ListModelLimitsResponseBody</p>
     */
    public static class Limits extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("modelLimit")
        private ModelLimit modelLimit;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("workspaceLimit")
        private WorkspaceLimit workspaceLimit;

        private Limits(Builder builder) {
            this.model = builder.model;
            this.modelLimit = builder.modelLimit;
            this.name = builder.name;
            this.workspaceLimit = builder.workspaceLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Limits create() {
            return builder().build();
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return modelLimit
         */
        public ModelLimit getModelLimit() {
            return this.modelLimit;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return workspaceLimit
         */
        public WorkspaceLimit getWorkspaceLimit() {
            return this.workspaceLimit;
        }

        public static final class Builder {
            private String model; 
            private ModelLimit modelLimit; 
            private String name; 
            private WorkspaceLimit workspaceLimit; 

            private Builder() {
            } 

            private Builder(Limits model) {
                this.model = model.model;
                this.modelLimit = model.modelLimit;
                this.name = model.name;
                this.workspaceLimit = model.workspaceLimit;
            } 

            /**
             * model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * modelLimit.
             */
            public Builder modelLimit(ModelLimit modelLimit) {
                this.modelLimit = modelLimit;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * workspaceLimit.
             */
            public Builder workspaceLimit(WorkspaceLimit workspaceLimit) {
                this.workspaceLimit = workspaceLimit;
                return this;
            }

            public Limits build() {
                return new Limits(this);
            } 

        } 

    }
}
