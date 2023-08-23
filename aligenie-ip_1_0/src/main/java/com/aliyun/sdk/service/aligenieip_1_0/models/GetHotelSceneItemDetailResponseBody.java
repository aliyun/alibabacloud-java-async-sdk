// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHotelSceneItemDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetHotelSceneItemDetailResponseBody</p>
 */
public class GetHotelSceneItemDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
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

    public static class DialogueList extends TeaModel {
        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("DialogueId")
        private String dialogueId;

        @NameInMap("NoAnswer")
        private String noAnswer;

        @NameInMap("NoAnswerTemplate")
        private String noAnswerTemplate;

        @NameInMap("Process")
        private Integer process;

        @NameInMap("Question")
        private String question;

        @NameInMap("ServiceId")
        private String serviceId;

        @NameInMap("UpdateTime")
        private Long updateTime;

        @NameInMap("YesAnswer")
        private String yesAnswer;

        @NameInMap("YesAnswerTemplate")
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
    public static class Result extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("DialogueList")
        private java.util.List < DialogueList> dialogueList;

        @NameInMap("Icon")
        private String icon;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
        private String name;

        @NameInMap("Price")
        private Long price;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
        private String type;

        @NameInMap("UpdateTime")
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
        public java.util.List < DialogueList> getDialogueList() {
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
            private java.util.List < DialogueList> dialogueList; 
            private String icon; 
            private Long id; 
            private String name; 
            private Long price; 
            private String status; 
            private String type; 
            private Long updateTime; 

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
            public Builder dialogueList(java.util.List < DialogueList> dialogueList) {
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
