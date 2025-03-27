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
 * {@link UpdateHotelSceneItemRequest} extends {@link RequestModel}
 *
 * <p>UpdateHotelSceneItemRequest</p>
 */
public class UpdateHotelSceneItemRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HotelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hotelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpdateHotelSceneOperateReq")
    @com.aliyun.core.annotation.Validation(required = true)
    private UpdateHotelSceneOperateReq updateHotelSceneOperateReq;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpdateHotelSceneReq")
    @com.aliyun.core.annotation.Validation(required = true)
    private UpdateHotelSceneReq updateHotelSceneReq;

    private UpdateHotelSceneItemRequest(Builder builder) {
        super(builder);
        this.hotelId = builder.hotelId;
        this.updateHotelSceneOperateReq = builder.updateHotelSceneOperateReq;
        this.updateHotelSceneReq = builder.updateHotelSceneReq;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateHotelSceneItemRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hotelId
     */
    public String getHotelId() {
        return this.hotelId;
    }

    /**
     * @return updateHotelSceneOperateReq
     */
    public UpdateHotelSceneOperateReq getUpdateHotelSceneOperateReq() {
        return this.updateHotelSceneOperateReq;
    }

    /**
     * @return updateHotelSceneReq
     */
    public UpdateHotelSceneReq getUpdateHotelSceneReq() {
        return this.updateHotelSceneReq;
    }

    public static final class Builder extends Request.Builder<UpdateHotelSceneItemRequest, Builder> {
        private String hotelId; 
        private UpdateHotelSceneOperateReq updateHotelSceneOperateReq; 
        private UpdateHotelSceneReq updateHotelSceneReq; 

        private Builder() {
            super();
        } 

        private Builder(UpdateHotelSceneItemRequest request) {
            super(request);
            this.hotelId = request.hotelId;
            this.updateHotelSceneOperateReq = request.updateHotelSceneOperateReq;
            this.updateHotelSceneReq = request.updateHotelSceneReq;
        } 

        /**
         * <p>hotelID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>80d84ea8ed9e422fbad52715c8fc56f1</p>
         */
        public Builder hotelId(String hotelId) {
            this.putBodyParameter("HotelId", hotelId);
            this.hotelId = hotelId;
            return this;
        }

        /**
         * <p>updateHotelSceneReq</p>
         * <p>This parameter is required.</p>
         */
        public Builder updateHotelSceneOperateReq(UpdateHotelSceneOperateReq updateHotelSceneOperateReq) {
            String updateHotelSceneOperateReqShrink = shrink(updateHotelSceneOperateReq, "UpdateHotelSceneOperateReq", "json");
            this.putQueryParameter("UpdateHotelSceneOperateReq", updateHotelSceneOperateReqShrink);
            this.updateHotelSceneOperateReq = updateHotelSceneOperateReq;
            return this;
        }

        /**
         * <p>UpdateHotelSceneReq</p>
         * <p>This parameter is required.</p>
         */
        public Builder updateHotelSceneReq(UpdateHotelSceneReq updateHotelSceneReq) {
            String updateHotelSceneReqShrink = shrink(updateHotelSceneReq, "UpdateHotelSceneReq", "json");
            this.putQueryParameter("UpdateHotelSceneReq", updateHotelSceneReqShrink);
            this.updateHotelSceneReq = updateHotelSceneReq;
            return this;
        }

        @Override
        public UpdateHotelSceneItemRequest build() {
            return new UpdateHotelSceneItemRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateHotelSceneItemRequest} extends {@link TeaModel}
     *
     * <p>UpdateHotelSceneItemRequest</p>
     */
    public static class UpdateHotelSceneOperateReq extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsUseTemplateAnswer")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean isUseTemplateAnswer;

        @com.aliyun.core.annotation.NameInMap("OperateType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String operateType;

        private UpdateHotelSceneOperateReq(Builder builder) {
            this.isUseTemplateAnswer = builder.isUseTemplateAnswer;
            this.operateType = builder.operateType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateHotelSceneOperateReq create() {
            return builder().build();
        }

        /**
         * @return isUseTemplateAnswer
         */
        public Boolean getIsUseTemplateAnswer() {
            return this.isUseTemplateAnswer;
        }

        /**
         * @return operateType
         */
        public String getOperateType() {
            return this.operateType;
        }

        public static final class Builder {
            private Boolean isUseTemplateAnswer; 
            private String operateType; 

            private Builder() {
            } 

            private Builder(UpdateHotelSceneOperateReq model) {
                this.isUseTemplateAnswer = model.isUseTemplateAnswer;
                this.operateType = model.operateType;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isUseTemplateAnswer(Boolean isUseTemplateAnswer) {
                this.isUseTemplateAnswer = isUseTemplateAnswer;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>OPEN</p>
             */
            public Builder operateType(String operateType) {
                this.operateType = operateType;
                return this;
            }

            public UpdateHotelSceneOperateReq build() {
                return new UpdateHotelSceneOperateReq(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateHotelSceneItemRequest} extends {@link TeaModel}
     *
     * <p>UpdateHotelSceneItemRequest</p>
     */
    public static class DialogueList extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("YesAnswer")
        private String yesAnswer;

        @com.aliyun.core.annotation.NameInMap("YesAnswerTemplate")
        private String yesAnswerTemplate;

        private DialogueList(Builder builder) {
            this.dialogueId = builder.dialogueId;
            this.noAnswer = builder.noAnswer;
            this.noAnswerTemplate = builder.noAnswerTemplate;
            this.process = builder.process;
            this.question = builder.question;
            this.serviceId = builder.serviceId;
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
            private String dialogueId; 
            private String noAnswer; 
            private String noAnswerTemplate; 
            private Integer process; 
            private String question; 
            private String serviceId; 
            private String yesAnswer; 
            private String yesAnswerTemplate; 

            private Builder() {
            } 

            private Builder(DialogueList model) {
                this.dialogueId = model.dialogueId;
                this.noAnswer = model.noAnswer;
                this.noAnswerTemplate = model.noAnswerTemplate;
                this.process = model.process;
                this.question = model.question;
                this.serviceId = model.serviceId;
                this.yesAnswer = model.yesAnswer;
                this.yesAnswerTemplate = model.yesAnswerTemplate;
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
             * <p>itemId</p>
             * 
             * <strong>example:</strong>
             * <p>10337</p>
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
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
     * {@link UpdateHotelSceneItemRequest} extends {@link TeaModel}
     *
     * <p>UpdateHotelSceneItemRequest</p>
     */
    public static class UpdateHotelSceneReq extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeyondLimitReply")
        private String beyondLimitReply;

        @com.aliyun.core.annotation.NameInMap("DeliveryMethod")
        private String deliveryMethod;

        @com.aliyun.core.annotation.NameInMap("DialogueList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<DialogueList> dialogueList;

        @com.aliyun.core.annotation.NameInMap("Icon")
        @com.aliyun.core.annotation.Validation(required = true)
        private String icon;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("LimitNumber")
        private Long limitNumber;

        @com.aliyun.core.annotation.NameInMap("LimitSwitch")
        private Integer limitSwitch;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PaymentMethod")
        private String paymentMethod;

        @com.aliyun.core.annotation.NameInMap("Price")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long price;

        @com.aliyun.core.annotation.NameInMap("RobotName")
        private String robotName;

        @com.aliyun.core.annotation.NameInMap("Status")
        @com.aliyun.core.annotation.Validation(required = true)
        private String status;

        private UpdateHotelSceneReq(Builder builder) {
            this.beyondLimitReply = builder.beyondLimitReply;
            this.deliveryMethod = builder.deliveryMethod;
            this.dialogueList = builder.dialogueList;
            this.icon = builder.icon;
            this.id = builder.id;
            this.limitNumber = builder.limitNumber;
            this.limitSwitch = builder.limitSwitch;
            this.name = builder.name;
            this.paymentMethod = builder.paymentMethod;
            this.price = builder.price;
            this.robotName = builder.robotName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateHotelSceneReq create() {
            return builder().build();
        }

        /**
         * @return beyondLimitReply
         */
        public String getBeyondLimitReply() {
            return this.beyondLimitReply;
        }

        /**
         * @return deliveryMethod
         */
        public String getDeliveryMethod() {
            return this.deliveryMethod;
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
         * @return limitNumber
         */
        public Long getLimitNumber() {
            return this.limitNumber;
        }

        /**
         * @return limitSwitch
         */
        public Integer getLimitSwitch() {
            return this.limitSwitch;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return paymentMethod
         */
        public String getPaymentMethod() {
            return this.paymentMethod;
        }

        /**
         * @return price
         */
        public Long getPrice() {
            return this.price;
        }

        /**
         * @return robotName
         */
        public String getRobotName() {
            return this.robotName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String beyondLimitReply; 
            private String deliveryMethod; 
            private java.util.List<DialogueList> dialogueList; 
            private String icon; 
            private Long id; 
            private Long limitNumber; 
            private Integer limitSwitch; 
            private String name; 
            private String paymentMethod; 
            private Long price; 
            private String robotName; 
            private String status; 

            private Builder() {
            } 

            private Builder(UpdateHotelSceneReq model) {
                this.beyondLimitReply = model.beyondLimitReply;
                this.deliveryMethod = model.deliveryMethod;
                this.dialogueList = model.dialogueList;
                this.icon = model.icon;
                this.id = model.id;
                this.limitNumber = model.limitNumber;
                this.limitSwitch = model.limitSwitch;
                this.name = model.name;
                this.paymentMethod = model.paymentMethod;
                this.price = model.price;
                this.robotName = model.robotName;
                this.status = model.status;
            } 

            /**
             * BeyondLimitReply.
             */
            public Builder beyondLimitReply(String beyondLimitReply) {
                this.beyondLimitReply = beyondLimitReply;
                return this;
            }

            /**
             * DeliveryMethod.
             */
            public Builder deliveryMethod(String deliveryMethod) {
                this.deliveryMethod = deliveryMethod;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder dialogueList(java.util.List<DialogueList> dialogueList) {
                this.dialogueList = dialogueList;
                return this;
            }

            /**
             * <p>icon</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://ailabsaicloudservice.alicdn.com/hotel/icon/jiudianmianban_fuwushangpintu/wupin/keyongpinlei/mianqian.png">https://ailabsaicloudservice.alicdn.com/hotel/icon/jiudianmianban_fuwushangpintu/wupin/keyongpinlei/mianqian.png</a></p>
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * <p>itemID</p>
             * 
             * <strong>example:</strong>
             * <p>10337</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * LimitNumber.
             */
            public Builder limitNumber(Long limitNumber) {
                this.limitNumber = limitNumber;
                return this;
            }

            /**
             * LimitSwitch.
             */
            public Builder limitSwitch(Integer limitSwitch) {
                this.limitSwitch = limitSwitch;
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
             * PaymentMethod.
             */
            public Builder paymentMethod(String paymentMethod) {
                this.paymentMethod = paymentMethod;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>165</p>
             */
            public Builder price(Long price) {
                this.price = price;
                return this;
            }

            /**
             * RobotName.
             */
            public Builder robotName(String robotName) {
                this.robotName = robotName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>已添加</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public UpdateHotelSceneReq build() {
                return new UpdateHotelSceneReq(this);
            } 

        } 

    }
}
