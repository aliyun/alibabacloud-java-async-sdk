// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

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
 * {@link ListElasticPlansResponseBody} extends {@link TeaModel}
 *
 * <p>ListElasticPlansResponseBody</p>
 */
public class ListElasticPlansResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("httpCode")
    private Long httpCode;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListElasticPlansResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpCode = builder.httpCode;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListElasticPlansResponseBody create() {
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
     * @return httpCode
     */
    public Long getHttpCode() {
        return this.httpCode;
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
     * @return result
     */
    public java.util.List<Result> getResult() {
        return this.result;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Long httpCode; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<Result> result; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListElasticPlansResponseBody model) {
            this.code = model.code;
            this.httpCode = model.httpCode;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.result = model.result;
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
         * httpCode.
         */
        public Builder httpCode(Long httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * <p>D77D0DAF-790D-F5F5-A9C0-133738165014</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListElasticPlansResponseBody build() {
            return new ListElasticPlansResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListElasticPlansResponseBody} extends {@link TeaModel}
     *
     * <p>ListElasticPlansResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appGroupId")
        private String appGroupId;

        @com.aliyun.core.annotation.NameInMap("created")
        private Long created;

        @com.aliyun.core.annotation.NameInMap("customDates")
        private java.util.List<String> customDates;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("elasticLcu")
        private Integer elasticLcu;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("endHour")
        private Integer endHour;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("scheduleType")
        private String scheduleType;

        @com.aliyun.core.annotation.NameInMap("startHour")
        private Integer startHour;

        @com.aliyun.core.annotation.NameInMap("updated")
        private Long updated;

        private Result(Builder builder) {
            this.appGroupId = builder.appGroupId;
            this.created = builder.created;
            this.customDates = builder.customDates;
            this.description = builder.description;
            this.elasticLcu = builder.elasticLcu;
            this.enabled = builder.enabled;
            this.endHour = builder.endHour;
            this.id = builder.id;
            this.name = builder.name;
            this.scheduleType = builder.scheduleType;
            this.startHour = builder.startHour;
            this.updated = builder.updated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return appGroupId
         */
        public String getAppGroupId() {
            return this.appGroupId;
        }

        /**
         * @return created
         */
        public Long getCreated() {
            return this.created;
        }

        /**
         * @return customDates
         */
        public java.util.List<String> getCustomDates() {
            return this.customDates;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return elasticLcu
         */
        public Integer getElasticLcu() {
            return this.elasticLcu;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return endHour
         */
        public Integer getEndHour() {
            return this.endHour;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return scheduleType
         */
        public String getScheduleType() {
            return this.scheduleType;
        }

        /**
         * @return startHour
         */
        public Integer getStartHour() {
            return this.startHour;
        }

        /**
         * @return updated
         */
        public Long getUpdated() {
            return this.updated;
        }

        public static final class Builder {
            private String appGroupId; 
            private Long created; 
            private java.util.List<String> customDates; 
            private String description; 
            private Integer elasticLcu; 
            private Boolean enabled; 
            private Integer endHour; 
            private Long id; 
            private String name; 
            private String scheduleType; 
            private Integer startHour; 
            private Long updated; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.appGroupId = model.appGroupId;
                this.created = model.created;
                this.customDates = model.customDates;
                this.description = model.description;
                this.elasticLcu = model.elasticLcu;
                this.enabled = model.enabled;
                this.endHour = model.endHour;
                this.id = model.id;
                this.name = model.name;
                this.scheduleType = model.scheduleType;
                this.startHour = model.startHour;
                this.updated = model.updated;
            } 

            /**
             * appGroupId.
             */
            public Builder appGroupId(String appGroupId) {
                this.appGroupId = appGroupId;
                return this;
            }

            /**
             * created.
             */
            public Builder created(Long created) {
                this.created = created;
                return this;
            }

            /**
             * customDates.
             */
            public Builder customDates(java.util.List<String> customDates) {
                this.customDates = customDates;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * elasticLcu.
             */
            public Builder elasticLcu(Integer elasticLcu) {
                this.elasticLcu = elasticLcu;
                return this;
            }

            /**
             * enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * endHour.
             */
            public Builder endHour(Integer endHour) {
                this.endHour = endHour;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
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
             * scheduleType.
             */
            public Builder scheduleType(String scheduleType) {
                this.scheduleType = scheduleType;
                return this;
            }

            /**
             * startHour.
             */
            public Builder startHour(Integer startHour) {
                this.startHour = startHour;
                return this;
            }

            /**
             * updated.
             */
            public Builder updated(Long updated) {
                this.updated = updated;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
