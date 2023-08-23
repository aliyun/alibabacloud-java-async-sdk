// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDialogueTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>ListDialogueTemplateResponseBody</p>
 */
public class ListDialogueTemplateResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    private ListDialogueTemplateResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDialogueTemplateResponseBody create() {
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
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private java.util.List < Result> result; 

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
         * RequestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListDialogueTemplateResponseBody build() {
            return new ListDialogueTemplateResponseBody(this);
        } 

    } 

    public static class FirstDialogueTemplate extends TeaModel {
        @NameInMap("NonzeroPriceYesAnswer")
        private String nonzeroPriceYesAnswer;

        @NameInMap("ZeroPriceNoAnswer")
        private String zeroPriceNoAnswer;

        @NameInMap("ZeroPriceYesAnswer")
        private String zeroPriceYesAnswer;

        private FirstDialogueTemplate(Builder builder) {
            this.nonzeroPriceYesAnswer = builder.nonzeroPriceYesAnswer;
            this.zeroPriceNoAnswer = builder.zeroPriceNoAnswer;
            this.zeroPriceYesAnswer = builder.zeroPriceYesAnswer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FirstDialogueTemplate create() {
            return builder().build();
        }

        /**
         * @return nonzeroPriceYesAnswer
         */
        public String getNonzeroPriceYesAnswer() {
            return this.nonzeroPriceYesAnswer;
        }

        /**
         * @return zeroPriceNoAnswer
         */
        public String getZeroPriceNoAnswer() {
            return this.zeroPriceNoAnswer;
        }

        /**
         * @return zeroPriceYesAnswer
         */
        public String getZeroPriceYesAnswer() {
            return this.zeroPriceYesAnswer;
        }

        public static final class Builder {
            private String nonzeroPriceYesAnswer; 
            private String zeroPriceNoAnswer; 
            private String zeroPriceYesAnswer; 

            /**
             * NonzeroPriceYesAnswer.
             */
            public Builder nonzeroPriceYesAnswer(String nonzeroPriceYesAnswer) {
                this.nonzeroPriceYesAnswer = nonzeroPriceYesAnswer;
                return this;
            }

            /**
             * ZeroPriceNoAnswer.
             */
            public Builder zeroPriceNoAnswer(String zeroPriceNoAnswer) {
                this.zeroPriceNoAnswer = zeroPriceNoAnswer;
                return this;
            }

            /**
             * ZeroPriceYesAnswer.
             */
            public Builder zeroPriceYesAnswer(String zeroPriceYesAnswer) {
                this.zeroPriceYesAnswer = zeroPriceYesAnswer;
                return this;
            }

            public FirstDialogueTemplate build() {
                return new FirstDialogueTemplate(this);
            } 

        } 

    }
    public static class SecondDialogueTemplate extends TeaModel {
        @NameInMap("NonzeroPriceNoAnswer")
        private String nonzeroPriceNoAnswer;

        @NameInMap("NonzeroPriceYesAnswer")
        private String nonzeroPriceYesAnswer;

        private SecondDialogueTemplate(Builder builder) {
            this.nonzeroPriceNoAnswer = builder.nonzeroPriceNoAnswer;
            this.nonzeroPriceYesAnswer = builder.nonzeroPriceYesAnswer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecondDialogueTemplate create() {
            return builder().build();
        }

        /**
         * @return nonzeroPriceNoAnswer
         */
        public String getNonzeroPriceNoAnswer() {
            return this.nonzeroPriceNoAnswer;
        }

        /**
         * @return nonzeroPriceYesAnswer
         */
        public String getNonzeroPriceYesAnswer() {
            return this.nonzeroPriceYesAnswer;
        }

        public static final class Builder {
            private String nonzeroPriceNoAnswer; 
            private String nonzeroPriceYesAnswer; 

            /**
             * NonzeroPriceNoAnswer.
             */
            public Builder nonzeroPriceNoAnswer(String nonzeroPriceNoAnswer) {
                this.nonzeroPriceNoAnswer = nonzeroPriceNoAnswer;
                return this;
            }

            /**
             * NonzeroPriceYesAnswer.
             */
            public Builder nonzeroPriceYesAnswer(String nonzeroPriceYesAnswer) {
                this.nonzeroPriceYesAnswer = nonzeroPriceYesAnswer;
                return this;
            }

            public SecondDialogueTemplate build() {
                return new SecondDialogueTemplate(this);
            } 

        } 

    }
    public static class TemplateDetail extends TeaModel {
        @NameInMap("FirstDialogueTemplate")
        private FirstDialogueTemplate firstDialogueTemplate;

        @NameInMap("SecondDialogueTemplate")
        private SecondDialogueTemplate secondDialogueTemplate;

        private TemplateDetail(Builder builder) {
            this.firstDialogueTemplate = builder.firstDialogueTemplate;
            this.secondDialogueTemplate = builder.secondDialogueTemplate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateDetail create() {
            return builder().build();
        }

        /**
         * @return firstDialogueTemplate
         */
        public FirstDialogueTemplate getFirstDialogueTemplate() {
            return this.firstDialogueTemplate;
        }

        /**
         * @return secondDialogueTemplate
         */
        public SecondDialogueTemplate getSecondDialogueTemplate() {
            return this.secondDialogueTemplate;
        }

        public static final class Builder {
            private FirstDialogueTemplate firstDialogueTemplate; 
            private SecondDialogueTemplate secondDialogueTemplate; 

            /**
             * FirstDialogueTemplate.
             */
            public Builder firstDialogueTemplate(FirstDialogueTemplate firstDialogueTemplate) {
                this.firstDialogueTemplate = firstDialogueTemplate;
                return this;
            }

            /**
             * SecondDialogueTemplate.
             */
            public Builder secondDialogueTemplate(SecondDialogueTemplate secondDialogueTemplate) {
                this.secondDialogueTemplate = secondDialogueTemplate;
                return this;
            }

            public TemplateDetail build() {
                return new TemplateDetail(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("TemplateDetail")
        private TemplateDetail templateDetail;

        @NameInMap("TemplateId")
        private Long templateId;

        @NameInMap("TemplateName")
        private String templateName;

        @NameInMap("Type")
        private String type;

        private Result(Builder builder) {
            this.templateDetail = builder.templateDetail;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return templateDetail
         */
        public TemplateDetail getTemplateDetail() {
            return this.templateDetail;
        }

        /**
         * @return templateId
         */
        public Long getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private TemplateDetail templateDetail; 
            private Long templateId; 
            private String templateName; 
            private String type; 

            /**
             * TemplateDetail.
             */
            public Builder templateDetail(TemplateDetail templateDetail) {
                this.templateDetail = templateDetail;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * TemplateName.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
