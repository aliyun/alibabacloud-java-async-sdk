// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentteams20260605.models;

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
 * {@link ListTeamDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTeamDetailsResponseBody</p>
 */
public class ListTeamDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListTeamDetailsResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.items = builder.items;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTeamDetailsResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private Integer httpStatusCode; 
        private java.util.List<Items> items; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListTeamDetailsResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.items = model.items;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
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
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTeamDetailsResponseBody build() {
            return new ListTeamDetailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTeamDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTeamDetailsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvatarUrl")
        private String avatarUrl;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SuccessRate")
        private Double successRate;

        @com.aliyun.core.annotation.NameInMap("TaskCount")
        private Integer taskCount;

        @com.aliyun.core.annotation.NameInMap("TeamName")
        private String teamName;

        @com.aliyun.core.annotation.NameInMap("TokenUsage")
        private Long tokenUsage;

        @com.aliyun.core.annotation.NameInMap("WorkerCount")
        private Integer workerCount;

        private Items(Builder builder) {
            this.avatarUrl = builder.avatarUrl;
            this.status = builder.status;
            this.successRate = builder.successRate;
            this.taskCount = builder.taskCount;
            this.teamName = builder.teamName;
            this.tokenUsage = builder.tokenUsage;
            this.workerCount = builder.workerCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return avatarUrl
         */
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return successRate
         */
        public Double getSuccessRate() {
            return this.successRate;
        }

        /**
         * @return taskCount
         */
        public Integer getTaskCount() {
            return this.taskCount;
        }

        /**
         * @return teamName
         */
        public String getTeamName() {
            return this.teamName;
        }

        /**
         * @return tokenUsage
         */
        public Long getTokenUsage() {
            return this.tokenUsage;
        }

        /**
         * @return workerCount
         */
        public Integer getWorkerCount() {
            return this.workerCount;
        }

        public static final class Builder {
            private String avatarUrl; 
            private String status; 
            private Double successRate; 
            private Integer taskCount; 
            private String teamName; 
            private Long tokenUsage; 
            private Integer workerCount; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.avatarUrl = model.avatarUrl;
                this.status = model.status;
                this.successRate = model.successRate;
                this.taskCount = model.taskCount;
                this.teamName = model.teamName;
                this.tokenUsage = model.tokenUsage;
                this.workerCount = model.workerCount;
            } 

            /**
             * AvatarUrl.
             */
            public Builder avatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * SuccessRate.
             */
            public Builder successRate(Double successRate) {
                this.successRate = successRate;
                return this;
            }

            /**
             * TaskCount.
             */
            public Builder taskCount(Integer taskCount) {
                this.taskCount = taskCount;
                return this;
            }

            /**
             * TeamName.
             */
            public Builder teamName(String teamName) {
                this.teamName = teamName;
                return this;
            }

            /**
             * TokenUsage.
             */
            public Builder tokenUsage(Long tokenUsage) {
                this.tokenUsage = tokenUsage;
                return this;
            }

            /**
             * WorkerCount.
             */
            public Builder workerCount(Integer workerCount) {
                this.workerCount = workerCount;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
