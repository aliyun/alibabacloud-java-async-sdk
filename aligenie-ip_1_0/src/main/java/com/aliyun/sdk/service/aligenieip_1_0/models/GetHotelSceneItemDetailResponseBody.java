// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

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
 * {@link GetHotelSceneItemDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetHotelSceneItemDetailResponseBody</p>
 */
public class GetHotelSceneItemDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private GetHotelSceneItemDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHotelSceneItemDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
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
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(GetHotelSceneItemDetailResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
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
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetHotelSceneItemDetailResponseBody build() {
            return new GetHotelSceneItemDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetHotelSceneItemDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetHotelSceneItemDetailResponseBody</p>
     */
    public static class DialogueList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DialogueId")
        private String dialogueId;

        @com.aliyun.core.annotation.NameInMap("NoAnswer")
        private String noAnswer;

        @com.aliyun.core.annotation.NameInMap("NoAnswerTemplate")
        private String noAnswerTemplate;

        @com.aliyun.core.annotation.NameInMap("Process")
        private Integer process;

        @com.aliyun.core.annotation.NameInMap("Question")
        private String question;

        @com.aliyun.core.annotation.NameInMap("ServiceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("YesAnswer")
        private String yesAnswer;

        @com.aliyun.core.annotation.NameInMap("YesAnswerTemplate")
        private String yesAnswerTemplate;

        private DialogueList(Builder builder) {
            this.createTime = builder.createTime;
            this.dialogueId = builder.dialogueId;
            this.noAnswer = builder.noAnswer;
            this.noAnswerTemplate = builder.noAnswerTemplate;
            this.process = builder.process;
            this.question = builder.question;
            this.serviceId = builder.serviceId;
            this.updateTime = builder.updateTime;
            this.yesAnswer = builder.yesAnswer;
            this.yesAnswerTemplate = builder.yesAnswerTemplate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DialogueList create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dialogueId
         */
        public String getDialogueId() {
            return this.dialogueId;
        }

        /**
         * @return noAnswer
         */
        public String getNoAnswer() {
            return this.noAnswer;
        }

        /**
         * @return noAnswerTemplate
         */
        public String getNoAnswerTemplate() {
            return this.noAnswerTemplate;
        }

        /**
         * @return process
         */
        public Integer getProcess() {
            return this.process;
        }

        /**
         * @return question
         */
        public String getQuestion() {
            return this.question;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return yesAnswer
         */
        public String getYesAnswer() {
            return this.yesAnswer;
        }

        /**
         * @return yesAnswerTemplate
         */
        public String getYesAnswerTemplate() {
            return this.yesAnswerTemplate;
        }

        public static final class Builder {
            private Long createTime; 
            private String dialogueId; 
            private String noAnswer; 
            private String noAnswerTemplate; 
            private Integer process; 
            private String question; 
            private String serviceId; 
            private Long updateTime; 
            private String yesAnswer; 
            private String yesAnswerTemplate; 

            private Builder() {
            } 

            private Builder(DialogueList model) {
                this.createTime = model.createTime;
                this.dialogueId = model.dialogueId;
                this.noAnswer = model.noAnswer;
                this.noAnswerTemplate = model.noAnswerTemplate;
                this.process = model.process;
                this.question = model.question;
                this.serviceId = model.serviceId;
                this.updateTime = model.updateTime;
                this.yesAnswer = model.yesAnswer;
                this.yesAnswerTemplate = model.yesAnswerTemplate;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DialogueId.
             */
            public Builder dialogueId(String dialogueId) {
                this.dialogueId = dialogueId;
                return this;
            }

            /**
             * NoAnswer.
             */
            public Builder noAnswer(String noAnswer) {
                this.noAnswer = noAnswer;
                return this;
            }

            /**
             * NoAnswerTemplate.
             */
            public Builder noAnswerTemplate(String noAnswerTemplate) {
                this.noAnswerTemplate = noAnswerTemplate;
                return this;
            }

            /**
             * Process.
             */
            public Builder process(Integer process) {
                this.process = process;
                return this;
            }

            /**
             * Question.
             */
            public Builder question(String question) {
                this.question = question;
                return this;
            }

            /**
             * ServiceId.
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * YesAnswer.
             */
            public Builder yesAnswer(String yesAnswer) {
                this.yesAnswer = yesAnswer;
                return this;
            }

            /**
             * YesAnswerTemplate.
             */
            public Builder yesAnswerTemplate(String yesAnswerTemplate) {
                this.yesAnswerTemplate = yesAnswerTemplate;
                return this;
            }

            public DialogueList build() {
                return new DialogueList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetHotelSceneItemDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetHotelSceneItemDetailResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("DialogueList")
        private java.util.List<DialogueList> dialogueList;

        @com.aliyun.core.annotation.NameInMap("Icon")
        private String icon;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Price")
        private Long price;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private Result(Builder builder) {
            this.category = builder.category;
            this.dialogueList = builder.dialogueList;
            this.icon = builder.icon;
            this.id = builder.id;
            this.name = builder.name;
            this.price = builder.price;
            this.status = builder.status;
            this.type = builder.type;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return dialogueList
         */
        public java.util.List<DialogueList> getDialogueList() {
            return this.dialogueList;
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
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
         * @return price
         */
        public Long getPrice() {
            return this.price;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String category; 
            private java.util.List<DialogueList> dialogueList; 
            private String icon; 
            private Long id; 
            private String name; 
            private Long price; 
            private String status; 
            private String type; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.category = model.category;
                this.dialogueList = model.dialogueList;
                this.icon = model.icon;
                this.id = model.id;
                this.name = model.name;
                this.price = model.price;
                this.status = model.status;
                this.type = model.type;
                this.updateTime = model.updateTime;
            } 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * DialogueList.
             */
            public Builder dialogueList(java.util.List<DialogueList> dialogueList) {
                this.dialogueList = dialogueList;
                return this;
            }

            /**
             * Icon.
             */
            public Builder icon(String icon) {
                this.icon = icon;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Price.
             */
            public Builder price(Long price) {
                this.price = price;
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
