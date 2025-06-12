// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link ListIntentionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListIntentionsResponseBody</p>
 */
public class ListIntentionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListIntentionsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIntentionsResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListIntentionsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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

        public ListIntentionsResponseBody build() {
            return new ListIntentionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIntentionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntentionsResponseBody</p>
     */
    public static class RuleCheck extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Error")
        private java.util.List<String> error;

        @com.aliyun.core.annotation.NameInMap("Strict")
        private Boolean strict;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("Warning")
        private java.util.List<String> warning;

        private RuleCheck(Builder builder) {
            this.error = builder.error;
            this.strict = builder.strict;
            this.text = builder.text;
            this.warning = builder.warning;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleCheck create() {
            return builder().build();
        }

        /**
         * @return error
         */
        public java.util.List<String> getError() {
            return this.error;
        }

        /**
         * @return strict
         */
        public Boolean getStrict() {
            return this.strict;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return warning
         */
        public java.util.List<String> getWarning() {
            return this.warning;
        }

        public static final class Builder {
            private java.util.List<String> error; 
            private Boolean strict; 
            private String text; 
            private java.util.List<String> warning; 

            private Builder() {
            } 

            private Builder(RuleCheck model) {
                this.error = model.error;
                this.strict = model.strict;
                this.text = model.text;
                this.warning = model.warning;
            } 

            /**
             * Error.
             */
            public Builder error(java.util.List<String> error) {
                this.error = error;
                return this;
            }

            /**
             * Strict.
             */
            public Builder strict(Boolean strict) {
                this.strict = strict;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * Warning.
             */
            public Builder warning(java.util.List<String> warning) {
                this.warning = warning;
                return this;
            }

            public RuleCheck build() {
                return new RuleCheck(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListIntentionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntentionsResponseBody</p>
     */
    public static class Switch extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Switch(Builder builder) {
            this.id = builder.id;
            this.label = builder.label;
            this.name = builder.name;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Switch create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String id; 
            private String label; 
            private String name; 
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(Switch model) {
                this.id = model.id;
                this.label = model.label;
                this.name = model.name;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Switch build() {
                return new Switch(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListIntentionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntentionsResponseBody</p>
     */
    public static class FeedbackFunctions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunFunction")
        private String aliyunFunction;

        @com.aliyun.core.annotation.NameInMap("AliyunService")
        private String aliyunService;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EndPoint")
        private String endPoint;

        @com.aliyun.core.annotation.NameInMap("Function")
        private String function;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Params")
        private java.util.Map<String, ?> params;

        @com.aliyun.core.annotation.NameInMap("Switch")
        private java.util.List<Switch> _switch;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private FeedbackFunctions(Builder builder) {
            this.aliyunFunction = builder.aliyunFunction;
            this.aliyunService = builder.aliyunService;
            this.code = builder.code;
            this.description = builder.description;
            this.endPoint = builder.endPoint;
            this.function = builder.function;
            this.name = builder.name;
            this.params = builder.params;
            this._switch = builder._switch;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FeedbackFunctions create() {
            return builder().build();
        }

        /**
         * @return aliyunFunction
         */
        public String getAliyunFunction() {
            return this.aliyunFunction;
        }

        /**
         * @return aliyunService
         */
        public String getAliyunService() {
            return this.aliyunService;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endPoint
         */
        public String getEndPoint() {
            return this.endPoint;
        }

        /**
         * @return function
         */
        public String getFunction() {
            return this.function;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return params
         */
        public java.util.Map<String, ?> getParams() {
            return this.params;
        }

        /**
         * @return _switch
         */
        public java.util.List<Switch> get_switch() {
            return this._switch;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String aliyunFunction; 
            private String aliyunService; 
            private String code; 
            private String description; 
            private String endPoint; 
            private String function; 
            private String name; 
            private java.util.Map<String, ?> params; 
            private java.util.List<Switch> _switch; 
            private String type; 

            private Builder() {
            } 

            private Builder(FeedbackFunctions model) {
                this.aliyunFunction = model.aliyunFunction;
                this.aliyunService = model.aliyunService;
                this.code = model.code;
                this.description = model.description;
                this.endPoint = model.endPoint;
                this.function = model.function;
                this.name = model.name;
                this.params = model.params;
                this._switch = model._switch;
                this.type = model.type;
            } 

            /**
             * AliyunFunction.
             */
            public Builder aliyunFunction(String aliyunFunction) {
                this.aliyunFunction = aliyunFunction;
                return this;
            }

            /**
             * AliyunService.
             */
            public Builder aliyunService(String aliyunService) {
                this.aliyunService = aliyunService;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
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
             * EndPoint.
             */
            public Builder endPoint(String endPoint) {
                this.endPoint = endPoint;
                return this;
            }

            /**
             * Function.
             */
            public Builder function(String function) {
                this.function = function;
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
             * Params.
             */
            public Builder params(java.util.Map<String, ?> params) {
                this.params = params;
                return this;
            }

            /**
             * Switch.
             */
            public Builder _switch(java.util.List<Switch> _switch) {
                this._switch = _switch;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public FeedbackFunctions build() {
                return new FeedbackFunctions(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListIntentionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntentionsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserSayId")
        private String userSayId;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.userSayId = builder.userSayId;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return userSayId
         */
        public String getUserSayId() {
            return this.userSayId;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String userSayId; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.userSayId = model.userSayId;
                this.value = model.value;
            } 

            /**
             * UserSayId.
             */
            public Builder userSayId(String userSayId) {
                this.userSayId = userSayId;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListIntentionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntentionsResponseBody</p>
     */
    public static class Slot extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FeedbackFunctions")
        private java.util.List<FeedbackFunctions> feedbackFunctions;

        @com.aliyun.core.annotation.NameInMap("FeedbackType")
        private String feedbackType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IsArray")
        private Boolean isArray;

        @com.aliyun.core.annotation.NameInMap("IsEncrypt")
        private Boolean isEncrypt;

        @com.aliyun.core.annotation.NameInMap("IsInteractive")
        private Boolean isInteractive;

        @com.aliyun.core.annotation.NameInMap("IsNecessary")
        private Boolean isNecessary;

        @com.aliyun.core.annotation.NameInMap("LifeSpan")
        private Integer lifeSpan;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Question")
        private java.util.List<String> question;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Slot(Builder builder) {
            this.feedbackFunctions = builder.feedbackFunctions;
            this.feedbackType = builder.feedbackType;
            this.id = builder.id;
            this.isArray = builder.isArray;
            this.isEncrypt = builder.isEncrypt;
            this.isInteractive = builder.isInteractive;
            this.isNecessary = builder.isNecessary;
            this.lifeSpan = builder.lifeSpan;
            this.name = builder.name;
            this.question = builder.question;
            this.tags = builder.tags;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Slot create() {
            return builder().build();
        }

        /**
         * @return feedbackFunctions
         */
        public java.util.List<FeedbackFunctions> getFeedbackFunctions() {
            return this.feedbackFunctions;
        }

        /**
         * @return feedbackType
         */
        public String getFeedbackType() {
            return this.feedbackType;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return isArray
         */
        public Boolean getIsArray() {
            return this.isArray;
        }

        /**
         * @return isEncrypt
         */
        public Boolean getIsEncrypt() {
            return this.isEncrypt;
        }

        /**
         * @return isInteractive
         */
        public Boolean getIsInteractive() {
            return this.isInteractive;
        }

        /**
         * @return isNecessary
         */
        public Boolean getIsNecessary() {
            return this.isNecessary;
        }

        /**
         * @return lifeSpan
         */
        public Integer getLifeSpan() {
            return this.lifeSpan;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return question
         */
        public java.util.List<String> getQuestion() {
            return this.question;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private java.util.List<FeedbackFunctions> feedbackFunctions; 
            private String feedbackType; 
            private String id; 
            private Boolean isArray; 
            private Boolean isEncrypt; 
            private Boolean isInteractive; 
            private Boolean isNecessary; 
            private Integer lifeSpan; 
            private String name; 
            private java.util.List<String> question; 
            private java.util.List<Tags> tags; 
            private String value; 

            private Builder() {
            } 

            private Builder(Slot model) {
                this.feedbackFunctions = model.feedbackFunctions;
                this.feedbackType = model.feedbackType;
                this.id = model.id;
                this.isArray = model.isArray;
                this.isEncrypt = model.isEncrypt;
                this.isInteractive = model.isInteractive;
                this.isNecessary = model.isNecessary;
                this.lifeSpan = model.lifeSpan;
                this.name = model.name;
                this.question = model.question;
                this.tags = model.tags;
                this.value = model.value;
            } 

            /**
             * FeedbackFunctions.
             */
            public Builder feedbackFunctions(java.util.List<FeedbackFunctions> feedbackFunctions) {
                this.feedbackFunctions = feedbackFunctions;
                return this;
            }

            /**
             * FeedbackType.
             */
            public Builder feedbackType(String feedbackType) {
                this.feedbackType = feedbackType;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * IsArray.
             */
            public Builder isArray(Boolean isArray) {
                this.isArray = isArray;
                return this;
            }

            /**
             * IsEncrypt.
             */
            public Builder isEncrypt(Boolean isEncrypt) {
                this.isEncrypt = isEncrypt;
                return this;
            }

            /**
             * IsInteractive.
             */
            public Builder isInteractive(Boolean isInteractive) {
                this.isInteractive = isInteractive;
                return this;
            }

            /**
             * IsNecessary.
             */
            public Builder isNecessary(Boolean isNecessary) {
                this.isNecessary = isNecessary;
                return this;
            }

            /**
             * LifeSpan.
             */
            public Builder lifeSpan(Integer lifeSpan) {
                this.lifeSpan = lifeSpan;
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
             * Question.
             */
            public Builder question(java.util.List<String> question) {
                this.question = question;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Slot build() {
                return new Slot(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListIntentionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntentionsResponseBody</p>
     */
    public static class UserSayData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SlotId")
        private String slotId;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        private UserSayData(Builder builder) {
            this.slotId = builder.slotId;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserSayData create() {
            return builder().build();
        }

        /**
         * @return slotId
         */
        public String getSlotId() {
            return this.slotId;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private String slotId; 
            private String text; 

            private Builder() {
            } 

            private Builder(UserSayData model) {
                this.slotId = model.slotId;
                this.text = model.text;
            } 

            /**
             * SlotId.
             */
            public Builder slotId(String slotId) {
                this.slotId = slotId;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public UserSayData build() {
                return new UserSayData(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListIntentionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntentionsResponseBody</p>
     */
    public static class UserSay extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FromId")
        private String fromId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Strict")
        private Boolean strict;

        @com.aliyun.core.annotation.NameInMap("UserSayData")
        private java.util.List<UserSayData> userSayData;

        private UserSay(Builder builder) {
            this.fromId = builder.fromId;
            this.id = builder.id;
            this.strict = builder.strict;
            this.userSayData = builder.userSayData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserSay create() {
            return builder().build();
        }

        /**
         * @return fromId
         */
        public String getFromId() {
            return this.fromId;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return strict
         */
        public Boolean getStrict() {
            return this.strict;
        }

        /**
         * @return userSayData
         */
        public java.util.List<UserSayData> getUserSayData() {
            return this.userSayData;
        }

        public static final class Builder {
            private String fromId; 
            private String id; 
            private Boolean strict; 
            private java.util.List<UserSayData> userSayData; 

            private Builder() {
            } 

            private Builder(UserSay model) {
                this.fromId = model.fromId;
                this.id = model.id;
                this.strict = model.strict;
                this.userSayData = model.userSayData;
            } 

            /**
             * FromId.
             */
            public Builder fromId(String fromId) {
                this.fromId = fromId;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Strict.
             */
            public Builder strict(Boolean strict) {
                this.strict = strict;
                return this;
            }

            /**
             * UserSayData.
             */
            public Builder userSayData(java.util.List<UserSayData> userSayData) {
                this.userSayData = userSayData;
                return this;
            }

            public UserSay build() {
                return new UserSay(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListIntentionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntentionsResponseBody</p>
     */
    public static class IntentList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private java.util.List<String> alias;

        @com.aliyun.core.annotation.NameInMap("BotId")
        private Long botId;

        @com.aliyun.core.annotation.NameInMap("BotName")
        private String botName;

        @com.aliyun.core.annotation.NameInMap("DialogId")
        private String dialogId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RuleCheck")
        private java.util.List<RuleCheck> ruleCheck;

        @com.aliyun.core.annotation.NameInMap("Slot")
        private java.util.List<Slot> slot;

        @com.aliyun.core.annotation.NameInMap("TableId")
        private Long tableId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("UserSay")
        private java.util.List<UserSay> userSay;

        private IntentList(Builder builder) {
            this.alias = builder.alias;
            this.botId = builder.botId;
            this.botName = builder.botName;
            this.dialogId = builder.dialogId;
            this.id = builder.id;
            this.language = builder.language;
            this.name = builder.name;
            this.ruleCheck = builder.ruleCheck;
            this.slot = builder.slot;
            this.tableId = builder.tableId;
            this.type = builder.type;
            this.userSay = builder.userSay;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IntentList create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public java.util.List<String> getAlias() {
            return this.alias;
        }

        /**
         * @return botId
         */
        public Long getBotId() {
            return this.botId;
        }

        /**
         * @return botName
         */
        public String getBotName() {
            return this.botName;
        }

        /**
         * @return dialogId
         */
        public String getDialogId() {
            return this.dialogId;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ruleCheck
         */
        public java.util.List<RuleCheck> getRuleCheck() {
            return this.ruleCheck;
        }

        /**
         * @return slot
         */
        public java.util.List<Slot> getSlot() {
            return this.slot;
        }

        /**
         * @return tableId
         */
        public Long getTableId() {
            return this.tableId;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return userSay
         */
        public java.util.List<UserSay> getUserSay() {
            return this.userSay;
        }

        public static final class Builder {
            private java.util.List<String> alias; 
            private Long botId; 
            private String botName; 
            private String dialogId; 
            private Long id; 
            private String language; 
            private String name; 
            private java.util.List<RuleCheck> ruleCheck; 
            private java.util.List<Slot> slot; 
            private Long tableId; 
            private Integer type; 
            private java.util.List<UserSay> userSay; 

            private Builder() {
            } 

            private Builder(IntentList model) {
                this.alias = model.alias;
                this.botId = model.botId;
                this.botName = model.botName;
                this.dialogId = model.dialogId;
                this.id = model.id;
                this.language = model.language;
                this.name = model.name;
                this.ruleCheck = model.ruleCheck;
                this.slot = model.slot;
                this.tableId = model.tableId;
                this.type = model.type;
                this.userSay = model.userSay;
            } 

            /**
             * Alias.
             */
            public Builder alias(java.util.List<String> alias) {
                this.alias = alias;
                return this;
            }

            /**
             * BotId.
             */
            public Builder botId(Long botId) {
                this.botId = botId;
                return this;
            }

            /**
             * BotName.
             */
            public Builder botName(String botName) {
                this.botName = botName;
                return this;
            }

            /**
             * DialogId.
             */
            public Builder dialogId(String dialogId) {
                this.dialogId = dialogId;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Language.
             */
            public Builder language(String language) {
                this.language = language;
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
             * RuleCheck.
             */
            public Builder ruleCheck(java.util.List<RuleCheck> ruleCheck) {
                this.ruleCheck = ruleCheck;
                return this;
            }

            /**
             * Slot.
             */
            public Builder slot(java.util.List<Slot> slot) {
                this.slot = slot;
                return this;
            }

            /**
             * TableId.
             */
            public Builder tableId(Long tableId) {
                this.tableId = tableId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * UserSay.
             */
            public Builder userSay(java.util.List<UserSay> userSay) {
                this.userSay = userSay;
                return this;
            }

            public IntentList build() {
                return new IntentList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListIntentionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntentionsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BotId")
        private String botId;

        @com.aliyun.core.annotation.NameInMap("IntentList")
        private java.util.List<IntentList> intentList;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private Data(Builder builder) {
            this.botId = builder.botId;
            this.intentList = builder.intentList;
            this.message = builder.message;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return botId
         */
        public String getBotId() {
            return this.botId;
        }

        /**
         * @return intentList
         */
        public java.util.List<IntentList> getIntentList() {
            return this.intentList;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String botId; 
            private java.util.List<IntentList> intentList; 
            private String message; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.botId = model.botId;
                this.intentList = model.intentList;
                this.message = model.message;
                this.success = model.success;
            } 

            /**
             * BotId.
             */
            public Builder botId(String botId) {
                this.botId = botId;
                return this;
            }

            /**
             * IntentList.
             */
            public Builder intentList(java.util.List<IntentList> intentList) {
                this.intentList = intentList;
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
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
