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
         * <p>The status code of the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The message returned by the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
             * <p>The error message.</p>
             */
            public Builder error(java.util.List<String> error) {
                this.error = error;
                return this;
            }

            /**
             * <p>Indicates whether strict matching is used.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder strict(Boolean strict) {
                this.strict = strict;
                return this;
            }

            /**
             * <p>The expression value.</p>
             * 
             * <strong>example:</strong>
             * <p>know</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * <p>The warning message.</p>
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
             * <p>The condition ID.</p>
             * 
             * <strong>example:</strong>
             * <p>b9932604-08ae-4525-bbe5-c8cce3066070</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The clarification prompt label.</p>
             * 
             * <strong>example:</strong>
             * <p>SQL_SUB_QUERY</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The condition name.</p>
             * 
             * <strong>example:</strong>
             * <p>测试0609_20241021_101018_复制_复制_复制</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type.</p>
             * 
             * <strong>example:</strong>
             * <p>PASSKEY</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The condition value.</p>
             * 
             * <strong>example:</strong>
             * <p>BASE_VALIDATE_FILTER_SWITCH</p>
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
             * <p>The Alibaba Cloud function name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder aliyunFunction(String aliyunFunction) {
                this.aliyunFunction = aliyunFunction;
                return this;
            }

            /**
             * <p>The Alibaba Cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder aliyunService(String aliyunService) {
                this.aliyunService = aliyunService;
                return this;
            }

            /**
             * <p>The status code of the operation.</p>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The clarification description.</p>
             * 
             * <strong>example:</strong>
             * <p>GA setup for HPC cn4-HPC-EndUserServer-GlobalAccelerator</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou.log.aliyuncs.com</p>
             */
            public Builder endPoint(String endPoint) {
                this.endPoint = endPoint;
                return this;
            }

            /**
             * <p>The clarification function.</p>
             * 
             * <strong>example:</strong>
             * <p>count</p>
             */
            public Builder function(String function) {
                this.function = function;
                return this;
            }

            /**
             * <p>The function name.</p>
             * 
             * <strong>example:</strong>
             * <p>方欣云呼系统每日拨测_2024年11月</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The parameters.</p>
             */
            public Builder params(java.util.Map<String, ?> params) {
                this.params = params;
                return this;
            }

            /**
             * <p>The feature switch. Valid values:</p>
             * <ul>
             * <li><strong>on</strong>: Enabled.</li>
             * <li><strong>off</strong>: Disabled.</li>
             * </ul>
             */
            public Builder _switch(java.util.List<Switch> _switch) {
                this._switch = _switch;
                return this;
            }

            /**
             * <p>The clarification type.</p>
             * 
             * <strong>example:</strong>
             * <p>cluster</p>
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
             * <p>The unique identifier of the intent utterance corresponding to the label.</p>
             * 
             * <strong>example:</strong>
             * <p>17448458</p>
             */
            public Builder userSayId(String userSayId) {
                this.userSayId = userSayId;
                return this;
            }

            /**
             * <p>The tagging result of the intent utterance corresponding to the label.</p>
             * 
             * <strong>example:</strong>
             * <p>Do you know xxxx?</p>
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
             * <p>The clarification functions.</p>
             * <blockquote>
             * <p>Notice: 无效内容</p>
             * </blockquote>
             */
            public Builder feedbackFunctions(java.util.List<FeedbackFunctions> feedbackFunctions) {
                this.feedbackFunctions = feedbackFunctions;
                return this;
            }

            /**
             * <p>The feedback type.</p>
             * <blockquote>
             * <p>Notice: 无效内容</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder feedbackType(String feedbackType) {
                this.feedbackType = feedbackType;
                return this;
            }

            /**
             * <p>The unique identifier of the slot.</p>
             * 
             * <strong>example:</strong>
             * <p>9ec31b50-32b8-11eb-9478-19d2d885afdb</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether the slot is an array. Valid values:</p>
             * <ul>
             * <li>true: Yes.</li>
             * <li>false: No.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isArray(Boolean isArray) {
                this.isArray = isArray;
                return this;
            }

            /**
             * <p>Indicates whether the slot is encrypted.</p>
             * <blockquote>
             * <p>Notice: 无效内容</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isEncrypt(Boolean isEncrypt) {
                this.isEncrypt = isEncrypt;
                return this;
            }

            /**
             * <p>Indicates whether the slot is interactive.</p>
             * <blockquote>
             * <p>Notice: 无效内容</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isInteractive(Boolean isInteractive) {
                this.isInteractive = isInteractive;
                return this;
            }

            /**
             * <p>Indicates whether the slot is required. Valid values:</p>
             * <ul>
             * <li>true: Yes.</li>
             * <li>false: No.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isNecessary(Boolean isNecessary) {
                this.isNecessary = isNecessary;
                return this;
            }

            /**
             * <p>The slot life span.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder lifeSpan(Integer lifeSpan) {
                this.lifeSpan = lifeSpan;
                return this;
            }

            /**
             * <p>The slot name.</p>
             * 
             * <strong>example:</strong>
             * <p>know</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The slot clarification prompts.</p>
             */
            public Builder question(java.util.List<String> question) {
                this.question = question;
                return this;
            }

            /**
             * <p>The slot tagging labels.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The slot tagging result.</p>
             * 
             * <strong>example:</strong>
             * <p>@知道</p>
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
             * <p>The unique identifier of the slot.</p>
             * 
             * <strong>example:</strong>
             * <p>9ec31b50-32b8-11eb-9478-19d2d885afdb</p>
             */
            public Builder slotId(String slotId) {
                this.slotId = slotId;
                return this;
            }

            /**
             * <p>The utterance text.</p>
             * 
             * <strong>example:</strong>
             * <p>know</p>
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
             * <p>The source ID.</p>
             * <blockquote>
             * <p>Notice: 无效内容</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1234567</p>
             */
            public Builder fromId(String fromId) {
                this.fromId = fromId;
                return this;
            }

            /**
             * <p>The utterance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>17448458</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether strict matching is used.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder strict(Boolean strict) {
                this.strict = strict;
                return this;
            }

            /**
             * <p>The list of user utterances.</p>
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
             * <p>The intent alias.</p>
             */
            public Builder alias(java.util.List<String> alias) {
                this.alias = alias;
                return this;
            }

            /**
             * <p>The robot ID. [Deprecated]</p>
             * 
             * <strong>example:</strong>
             * <p>chatbot-cn-n7QmzrUnNe</p>
             */
            public Builder botId(Long botId) {
                this.botId = botId;
                return this;
            }

            /**
             * <p>The robot name.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder botName(String botName) {
                this.botName = botName;
                return this;
            }

            /**
             * <p>The dialog flow ID.</p>
             * 
             * <strong>example:</strong>
             * <p>50099</p>
             */
            public Builder dialogId(String dialogId) {
                this.dialogId = dialogId;
                return this;
            }

            /**
             * <p>The intent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10717802</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The language.</p>
             * <ul>
             * <li>English: en-us</li>
             * <li>Chinese: zh-cn</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>zh-cn</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * <p>The intent name.</p>
             * 
             * <strong>example:</strong>
             * <p>Got it</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The LGF intent utterance expressions.</p>
             */
            public Builder ruleCheck(java.util.List<RuleCheck> ruleCheck) {
                this.ruleCheck = ruleCheck;
                return this;
            }

            /**
             * <p>The intent slot information.</p>
             */
            public Builder slot(java.util.List<Slot> slot) {
                this.slot = slot;
                return this;
            }

            /**
             * <p>The table ID.</p>
             * 
             * <strong>example:</strong>
             * <p>43258</p>
             */
            public Builder tableId(Long tableId) {
                this.tableId = tableId;
                return this;
            }

            /**
             * <p>The intent type. Valid values:</p>
             * <ul>
             * <li>0: normal intent. </li>
             * <li>1: UNKNOWN. </li>
             * <li>2: TableQA intent. </li>
             * <li>3: generated from a standard intent.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The list of user utterances.</p>
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
             * <p>The robot ID.</p>
             * 
             * <strong>example:</strong>
             * <p>chatbot-cn-n7QmzrUnNe</p>
             */
            public Builder botId(String botId) {
                this.botId = botId;
                return this;
            }

            /**
             * <p>The list of intents.</p>
             */
            public Builder intentList(java.util.List<IntentList> intentList) {
                this.intentList = intentList;
                return this;
            }

            /**
             * <p>The message returned by the operation.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>Indicates whether the request was successful.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
