// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

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
 * {@link GetDialogDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetDialogDetailResponseBody</p>
 */
public class GetDialogDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cost")
    private Long cost;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("dataType")
    private String dataType;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("time")
    private String time;

    private GetDialogDetailResponseBody(Builder builder) {
        this.cost = builder.cost;
        this.data = builder.data;
        this.dataType = builder.dataType;
        this.errCode = builder.errCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.time = builder.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDialogDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cost
     */
    public Long getCost() {
        return this.cost;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
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

    /**
     * @return time
     */
    public String getTime() {
        return this.time;
    }

    public static final class Builder {
        private Long cost; 
        private Data data; 
        private String dataType; 
        private String errCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String time; 

        private Builder() {
        } 

        private Builder(GetDialogDetailResponseBody model) {
            this.cost = model.cost;
            this.data = model.data;
            this.dataType = model.dataType;
            this.errCode = model.errCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.time = model.time;
        } 

        /**
         * cost.
         */
        public Builder cost(Long cost) {
            this.cost = cost;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * dataType.
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * errCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
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
         * requestId.
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
         * time.
         */
        public Builder time(String time) {
            this.time = time;
            return this;
        }

        public GetDialogDetailResponseBody build() {
            return new GetDialogDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDialogDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetDialogDetailResponseBody</p>
     */
    public static class DialogueList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("customerId")
        private String customerId;

        @com.aliyun.core.annotation.NameInMap("customerServiceId")
        private String customerServiceId;

        @com.aliyun.core.annotation.NameInMap("customerServiceType")
        private String customerServiceType;

        @com.aliyun.core.annotation.NameInMap("hangUpDialog")
        private Boolean hangUpDialog;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("intentCode")
        private String intentCode;

        @com.aliyun.core.annotation.NameInMap("intentName")
        private String intentName;

        @com.aliyun.core.annotation.NameInMap("role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private DialogueList(Builder builder) {
            this.content = builder.content;
            this.customerId = builder.customerId;
            this.customerServiceId = builder.customerServiceId;
            this.customerServiceType = builder.customerServiceType;
            this.hangUpDialog = builder.hangUpDialog;
            this.id = builder.id;
            this.intentCode = builder.intentCode;
            this.intentName = builder.intentName;
            this.role = builder.role;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DialogueList create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return customerId
         */
        public String getCustomerId() {
            return this.customerId;
        }

        /**
         * @return customerServiceId
         */
        public String getCustomerServiceId() {
            return this.customerServiceId;
        }

        /**
         * @return customerServiceType
         */
        public String getCustomerServiceType() {
            return this.customerServiceType;
        }

        /**
         * @return hangUpDialog
         */
        public Boolean getHangUpDialog() {
            return this.hangUpDialog;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return intentCode
         */
        public String getIntentCode() {
            return this.intentCode;
        }

        /**
         * @return intentName
         */
        public String getIntentName() {
            return this.intentName;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String content; 
            private String customerId; 
            private String customerServiceId; 
            private String customerServiceType; 
            private Boolean hangUpDialog; 
            private Long id; 
            private String intentCode; 
            private String intentName; 
            private String role; 
            private String type; 

            private Builder() {
            } 

            private Builder(DialogueList model) {
                this.content = model.content;
                this.customerId = model.customerId;
                this.customerServiceId = model.customerServiceId;
                this.customerServiceType = model.customerServiceType;
                this.hangUpDialog = model.hangUpDialog;
                this.id = model.id;
                this.intentCode = model.intentCode;
                this.intentName = model.intentName;
                this.role = model.role;
                this.type = model.type;
            } 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * customerId.
             */
            public Builder customerId(String customerId) {
                this.customerId = customerId;
                return this;
            }

            /**
             * customerServiceId.
             */
            public Builder customerServiceId(String customerServiceId) {
                this.customerServiceId = customerServiceId;
                return this;
            }

            /**
             * customerServiceType.
             */
            public Builder customerServiceType(String customerServiceType) {
                this.customerServiceType = customerServiceType;
                return this;
            }

            /**
             * hangUpDialog.
             */
            public Builder hangUpDialog(Boolean hangUpDialog) {
                this.hangUpDialog = hangUpDialog;
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
             * intentCode.
             */
            public Builder intentCode(String intentCode) {
                this.intentCode = intentCode;
                return this;
            }

            /**
             * intentName.
             */
            public Builder intentName(String intentName) {
                this.intentName = intentName;
                return this;
            }

            /**
             * role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DialogueList build() {
                return new DialogueList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDialogDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetDialogDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dialogueList")
        private java.util.List<DialogueList> dialogueList;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("totalDialogTurns")
        private Integer totalDialogTurns;

        @com.aliyun.core.annotation.NameInMap("validDialogTurns")
        private Integer validDialogTurns;

        private Data(Builder builder) {
            this.dialogueList = builder.dialogueList;
            this.gmtCreate = builder.gmtCreate;
            this.status = builder.status;
            this.totalDialogTurns = builder.totalDialogTurns;
            this.validDialogTurns = builder.validDialogTurns;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dialogueList
         */
        public java.util.List<DialogueList> getDialogueList() {
            return this.dialogueList;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalDialogTurns
         */
        public Integer getTotalDialogTurns() {
            return this.totalDialogTurns;
        }

        /**
         * @return validDialogTurns
         */
        public Integer getValidDialogTurns() {
            return this.validDialogTurns;
        }

        public static final class Builder {
            private java.util.List<DialogueList> dialogueList; 
            private String gmtCreate; 
            private String status; 
            private Integer totalDialogTurns; 
            private Integer validDialogTurns; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.dialogueList = model.dialogueList;
                this.gmtCreate = model.gmtCreate;
                this.status = model.status;
                this.totalDialogTurns = model.totalDialogTurns;
                this.validDialogTurns = model.validDialogTurns;
            } 

            /**
             * dialogueList.
             */
            public Builder dialogueList(java.util.List<DialogueList> dialogueList) {
                this.dialogueList = dialogueList;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * totalDialogTurns.
             */
            public Builder totalDialogTurns(Integer totalDialogTurns) {
                this.totalDialogTurns = totalDialogTurns;
                return this;
            }

            /**
             * validDialogTurns.
             */
            public Builder validDialogTurns(Integer validDialogTurns) {
                this.validDialogTurns = validDialogTurns;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
