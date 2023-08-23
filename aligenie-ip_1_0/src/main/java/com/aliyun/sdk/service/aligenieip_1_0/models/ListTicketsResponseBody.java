// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTicketsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTicketsResponseBody</p>
 */
public class ListTicketsResponseBody extends TeaModel {
    @NameInMap("Message")
    private String message;

    @NameInMap("Page")
    private Page page;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    @NameInMap("StatusCode")
    private Integer statusCode;

    private ListTicketsResponseBody(Builder builder) {
        this.message = builder.message;
        this.page = builder.page;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.statusCode = builder.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTicketsResponseBody create() {
        return builder().build();
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return page
     */
    public Page getPage() {
        return this.page;
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

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static final class Builder {
        private String message; 
        private Page page; 
        private String requestId; 
        private java.util.List < Result> result; 
        private Integer statusCode; 

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Page page) {
            this.page = page;
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
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        /**
         * StatusCode.
         */
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        public ListTicketsResponseBody build() {
            return new ListTicketsResponseBody(this);
        } 

    } 

    public static class Page extends TeaModel {
        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Total")
        private Integer total;

        private Page(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Page create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer total; 

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Page build() {
                return new Page(this);
            } 

        } 

    }
    public static class Dialogs extends TeaModel {
        @NameInMap("Answer")
        private String answer;

        @NameInMap("Question")
        private String question;

        private Dialogs(Builder builder) {
            this.answer = builder.answer;
            this.question = builder.question;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dialogs create() {
            return builder().build();
        }

        /**
         * @return answer
         */
        public String getAnswer() {
            return this.answer;
        }

        /**
         * @return question
         */
        public String getQuestion() {
            return this.question;
        }

        public static final class Builder {
            private String answer; 
            private String question; 

            /**
             * Answer.
             */
            public Builder answer(String answer) {
                this.answer = answer;
                return this;
            }

            /**
             * Question.
             */
            public Builder question(String question) {
                this.question = question;
                return this;
            }

            public Dialogs build() {
                return new Dialogs(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("Action")
        private Boolean action;

        @NameInMap("AssignedHandler")
        private String assignedHandler;

        @NameInMap("ChargesRemark")
        private String chargesRemark;

        @NameInMap("CompleteRemark")
        private String completeRemark;

        @NameInMap("Dialogs")
        private java.util.List < Dialogs> dialogs;

        @NameInMap("GmtCalled")
        private String gmtCalled;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtDelayed")
        private String gmtDelayed;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("GroupKey")
        private String groupKey;

        @NameInMap("Id")
        private Long id;

        @NameInMap("IsAcceptedCharges")
        private Boolean isAcceptedCharges;

        @NameInMap("IsDelayed")
        private Boolean isDelayed;

        @NameInMap("IsNeedCallback")
        private Boolean isNeedCallback;

        @NameInMap("IsNeedCharges")
        private Boolean isNeedCharges;

        @NameInMap("Operations")
        private java.util.List < java.util.Map<String, ?>> operations;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("RoomNo")
        private String roomNo;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
        private String type;

        private Result(Builder builder) {
            this.action = builder.action;
            this.assignedHandler = builder.assignedHandler;
            this.chargesRemark = builder.chargesRemark;
            this.completeRemark = builder.completeRemark;
            this.dialogs = builder.dialogs;
            this.gmtCalled = builder.gmtCalled;
            this.gmtCreate = builder.gmtCreate;
            this.gmtDelayed = builder.gmtDelayed;
            this.gmtModified = builder.gmtModified;
            this.groupKey = builder.groupKey;
            this.id = builder.id;
            this.isAcceptedCharges = builder.isAcceptedCharges;
            this.isDelayed = builder.isDelayed;
            this.isNeedCallback = builder.isNeedCallback;
            this.isNeedCharges = builder.isNeedCharges;
            this.operations = builder.operations;
            this.remark = builder.remark;
            this.roomNo = builder.roomNo;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public Boolean getAction() {
            return this.action;
        }

        /**
         * @return assignedHandler
         */
        public String getAssignedHandler() {
            return this.assignedHandler;
        }

        /**
         * @return chargesRemark
         */
        public String getChargesRemark() {
            return this.chargesRemark;
        }

        /**
         * @return completeRemark
         */
        public String getCompleteRemark() {
            return this.completeRemark;
        }

        /**
         * @return dialogs
         */
        public java.util.List < Dialogs> getDialogs() {
            return this.dialogs;
        }

        /**
         * @return gmtCalled
         */
        public String getGmtCalled() {
            return this.gmtCalled;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtDelayed
         */
        public String getGmtDelayed() {
            return this.gmtDelayed;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return groupKey
         */
        public String getGroupKey() {
            return this.groupKey;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isAcceptedCharges
         */
        public Boolean getIsAcceptedCharges() {
            return this.isAcceptedCharges;
        }

        /**
         * @return isDelayed
         */
        public Boolean getIsDelayed() {
            return this.isDelayed;
        }

        /**
         * @return isNeedCallback
         */
        public Boolean getIsNeedCallback() {
            return this.isNeedCallback;
        }

        /**
         * @return isNeedCharges
         */
        public Boolean getIsNeedCharges() {
            return this.isNeedCharges;
        }

        /**
         * @return operations
         */
        public java.util.List < java.util.Map<String, ?>> getOperations() {
            return this.operations;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return roomNo
         */
        public String getRoomNo() {
            return this.roomNo;
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

        public static final class Builder {
            private Boolean action; 
            private String assignedHandler; 
            private String chargesRemark; 
            private String completeRemark; 
            private java.util.List < Dialogs> dialogs; 
            private String gmtCalled; 
            private String gmtCreate; 
            private String gmtDelayed; 
            private String gmtModified; 
            private String groupKey; 
            private Long id; 
            private Boolean isAcceptedCharges; 
            private Boolean isDelayed; 
            private Boolean isNeedCallback; 
            private Boolean isNeedCharges; 
            private java.util.List < java.util.Map<String, ?>> operations; 
            private String remark; 
            private String roomNo; 
            private String status; 
            private String type; 

            /**
             * Action.
             */
            public Builder action(Boolean action) {
                this.action = action;
                return this;
            }

            /**
             * AssignedHandler.
             */
            public Builder assignedHandler(String assignedHandler) {
                this.assignedHandler = assignedHandler;
                return this;
            }

            /**
             * ChargesRemark.
             */
            public Builder chargesRemark(String chargesRemark) {
                this.chargesRemark = chargesRemark;
                return this;
            }

            /**
             * CompleteRemark.
             */
            public Builder completeRemark(String completeRemark) {
                this.completeRemark = completeRemark;
                return this;
            }

            /**
             * Dialogs.
             */
            public Builder dialogs(java.util.List < Dialogs> dialogs) {
                this.dialogs = dialogs;
                return this;
            }

            /**
             * GmtCalled.
             */
            public Builder gmtCalled(String gmtCalled) {
                this.gmtCalled = gmtCalled;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtDelayed.
             */
            public Builder gmtDelayed(String gmtDelayed) {
                this.gmtDelayed = gmtDelayed;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * GroupKey.
             */
            public Builder groupKey(String groupKey) {
                this.groupKey = groupKey;
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
             * IsAcceptedCharges.
             */
            public Builder isAcceptedCharges(Boolean isAcceptedCharges) {
                this.isAcceptedCharges = isAcceptedCharges;
                return this;
            }

            /**
             * IsDelayed.
             */
            public Builder isDelayed(Boolean isDelayed) {
                this.isDelayed = isDelayed;
                return this;
            }

            /**
             * IsNeedCallback.
             */
            public Builder isNeedCallback(Boolean isNeedCallback) {
                this.isNeedCallback = isNeedCallback;
                return this;
            }

            /**
             * IsNeedCharges.
             */
            public Builder isNeedCharges(Boolean isNeedCharges) {
                this.isNeedCharges = isNeedCharges;
                return this;
            }

            /**
             * Operations.
             */
            public Builder operations(java.util.List < java.util.Map<String, ?>> operations) {
                this.operations = operations;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * RoomNo.
             */
            public Builder roomNo(String roomNo) {
                this.roomNo = roomNo;
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

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
