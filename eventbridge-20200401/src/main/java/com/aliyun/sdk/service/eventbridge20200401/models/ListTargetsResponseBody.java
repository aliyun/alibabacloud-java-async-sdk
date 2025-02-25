// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * {@link ListTargetsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTargetsResponseBody</p>
 */
public class ListTargetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListTargetsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTargetsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The returned response code. Valid values:
         * <p>
         * 
         * *   Success: The request is successful.
         * *   Other codes: The request failed. For a list of error codes, see Error codes.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListTargetsResponseBody build() {
            return new ListTargetsResponseBody(this);
        } 

    } 

    public static class ParamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("ResourceKey")
        private String resourceKey;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ParamList(Builder builder) {
            this.form = builder.form;
            this.resourceKey = builder.resourceKey;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParamList create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return resourceKey
         */
        public String getResourceKey() {
            return this.resourceKey;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String resourceKey; 
            private String template; 
            private String value; 

            /**
             * The format that is used by the event target parameter.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * The resource parameter of the event target.
             */
            public Builder resourceKey(String resourceKey) {
                this.resourceKey = resourceKey;
                return this;
            }

            /**
             * The template that is used by the event target parameter.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * The value of the event target parameter.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ParamList build() {
                return new ParamList(this);
            } 

        } 

    }
    public static class Targets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("ErrorsTolerance")
        private String errorsTolerance;

        @com.aliyun.core.annotation.NameInMap("EventBusName")
        private String eventBusName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("ParamList")
        private java.util.List < ParamList> paramList;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Targets(Builder builder) {
            this.endpoint = builder.endpoint;
            this.errorsTolerance = builder.errorsTolerance;
            this.eventBusName = builder.eventBusName;
            this.id = builder.id;
            this.paramList = builder.paramList;
            this.ruleName = builder.ruleName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Targets create() {
            return builder().build();
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return errorsTolerance
         */
        public String getErrorsTolerance() {
            return this.errorsTolerance;
        }

        /**
         * @return eventBusName
         */
        public String getEventBusName() {
            return this.eventBusName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return paramList
         */
        public java.util.List < ParamList> getParamList() {
            return this.paramList;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String endpoint; 
            private String errorsTolerance; 
            private String eventBusName; 
            private String id; 
            private java.util.List < ParamList> paramList; 
            private String ruleName; 
            private String type; 

            /**
             * The endpoint of the event target.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * ErrorsTolerance.
             */
            public Builder errorsTolerance(String errorsTolerance) {
                this.errorsTolerance = errorsTolerance;
                return this;
            }

            /**
             * The name of the event bus.
             */
            public Builder eventBusName(String eventBusName) {
                this.eventBusName = eventBusName;
                return this;
            }

            /**
             * The ID of the event target.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The parameters that are configured for the event target.
             */
            public Builder paramList(java.util.List < ParamList> paramList) {
                this.paramList = paramList;
                return this;
            }

            /**
             * The name of the event rule.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * The type of the event target. For more information, see [Event target parameters](~~183698~~).
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Targets build() {
                return new Targets(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("Targets")
        private java.util.List < Targets> targets;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.nextToken = builder.nextToken;
            this.targets = builder.targets;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return targets
         */
        public java.util.List < Targets> getTargets() {
            return this.targets;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private String nextToken; 
            private java.util.List < Targets> targets; 
            private Integer total; 

            /**
             * If excess return values exist, this parameter is returned.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * The event targets.
             */
            public Builder targets(java.util.List < Targets> targets) {
                this.targets = targets;
                return this;
            }

            /**
             * The total number of entries.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
