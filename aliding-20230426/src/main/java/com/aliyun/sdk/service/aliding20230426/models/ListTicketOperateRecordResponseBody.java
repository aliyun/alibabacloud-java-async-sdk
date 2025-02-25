// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link ListTicketOperateRecordResponseBody} extends {@link TeaModel}
 *
 * <p>ListTicketOperateRecordResponseBody</p>
 */
public class ListTicketOperateRecordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("records")
    private java.util.List<Records> records;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private ListTicketOperateRecordResponseBody(Builder builder) {
        this.records = builder.records;
        this.requestId = builder.requestId;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTicketOperateRecordResponseBody create() {
        return builder().build();
    }

    /**
     * @return records
     */
    public java.util.List<Records> getRecords() {
        return this.records;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder {
        private java.util.List<Records> records; 
        private String requestId; 
        private String vendorRequestId; 
        private String vendorType; 

        /**
         * records.
         */
        public Builder records(java.util.List<Records> records) {
            this.records = records;
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
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public ListTicketOperateRecordResponseBody build() {
            return new ListTicketOperateRecordResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTicketOperateRecordResponseBody} extends {@link TeaModel}
     *
     * <p>ListTicketOperateRecordResponseBody</p>
     */
    public static class Operator extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NickName")
        private String nickName;

        @com.aliyun.core.annotation.NameInMap("UnionId")
        private String unionId;

        private Operator(Builder builder) {
            this.nickName = builder.nickName;
            this.unionId = builder.unionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Operator create() {
            return builder().build();
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        /**
         * @return unionId
         */
        public String getUnionId() {
            return this.unionId;
        }

        public static final class Builder {
            private String nickName; 
            private String unionId; 

            /**
             * NickName.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * UnionId.
             */
            public Builder unionId(String unionId) {
                this.unionId = unionId;
                return this;
            }

            public Operator build() {
                return new Operator(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTicketOperateRecordResponseBody} extends {@link TeaModel}
     *
     * <p>ListTicketOperateRecordResponseBody</p>
     */
    public static class Attachments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        private Attachments(Builder builder) {
            this.fileName = builder.fileName;
            this.key = builder.key;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attachments create() {
            return builder().build();
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        public static final class Builder {
            private String fileName; 
            private String key; 

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            public Attachments build() {
                return new Attachments(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTicketOperateRecordResponseBody} extends {@link TeaModel}
     *
     * <p>ListTicketOperateRecordResponseBody</p>
     */
    public static class TicketMemo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attachments")
        private java.util.List<Attachments> attachments;

        @com.aliyun.core.annotation.NameInMap("Memo")
        private String memo;

        private TicketMemo(Builder builder) {
            this.attachments = builder.attachments;
            this.memo = builder.memo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TicketMemo create() {
            return builder().build();
        }

        /**
         * @return attachments
         */
        public java.util.List<Attachments> getAttachments() {
            return this.attachments;
        }

        /**
         * @return memo
         */
        public String getMemo() {
            return this.memo;
        }

        public static final class Builder {
            private java.util.List<Attachments> attachments; 
            private String memo; 

            /**
             * Attachments.
             */
            public Builder attachments(java.util.List<Attachments> attachments) {
                this.attachments = attachments;
                return this;
            }

            /**
             * Memo.
             */
            public Builder memo(String memo) {
                this.memo = memo;
                return this;
            }

            public TicketMemo build() {
                return new TicketMemo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTicketOperateRecordResponseBody} extends {@link TeaModel}
     *
     * <p>ListTicketOperateRecordResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OpenTicketId")
        private String openTicketId;

        @com.aliyun.core.annotation.NameInMap("OperateData")
        private String operateData;

        @com.aliyun.core.annotation.NameInMap("OperateTime")
        private String operateTime;

        @com.aliyun.core.annotation.NameInMap("Operation")
        private String operation;

        @com.aliyun.core.annotation.NameInMap("OperationDisplayName")
        private String operationDisplayName;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private Operator operator;

        @com.aliyun.core.annotation.NameInMap("TicketMemo")
        private TicketMemo ticketMemo;

        private Records(Builder builder) {
            this.openTicketId = builder.openTicketId;
            this.operateData = builder.operateData;
            this.operateTime = builder.operateTime;
            this.operation = builder.operation;
            this.operationDisplayName = builder.operationDisplayName;
            this.operator = builder.operator;
            this.ticketMemo = builder.ticketMemo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return openTicketId
         */
        public String getOpenTicketId() {
            return this.openTicketId;
        }

        /**
         * @return operateData
         */
        public String getOperateData() {
            return this.operateData;
        }

        /**
         * @return operateTime
         */
        public String getOperateTime() {
            return this.operateTime;
        }

        /**
         * @return operation
         */
        public String getOperation() {
            return this.operation;
        }

        /**
         * @return operationDisplayName
         */
        public String getOperationDisplayName() {
            return this.operationDisplayName;
        }

        /**
         * @return operator
         */
        public Operator getOperator() {
            return this.operator;
        }

        /**
         * @return ticketMemo
         */
        public TicketMemo getTicketMemo() {
            return this.ticketMemo;
        }

        public static final class Builder {
            private String openTicketId; 
            private String operateData; 
            private String operateTime; 
            private String operation; 
            private String operationDisplayName; 
            private Operator operator; 
            private TicketMemo ticketMemo; 

            /**
             * OpenTicketId.
             */
            public Builder openTicketId(String openTicketId) {
                this.openTicketId = openTicketId;
                return this;
            }

            /**
             * OperateData.
             */
            public Builder operateData(String operateData) {
                this.operateData = operateData;
                return this;
            }

            /**
             * OperateTime.
             */
            public Builder operateTime(String operateTime) {
                this.operateTime = operateTime;
                return this;
            }

            /**
             * Operation.
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            /**
             * OperationDisplayName.
             */
            public Builder operationDisplayName(String operationDisplayName) {
                this.operationDisplayName = operationDisplayName;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(Operator operator) {
                this.operator = operator;
                return this;
            }

            /**
             * TicketMemo.
             */
            public Builder ticketMemo(TicketMemo ticketMemo) {
                this.ticketMemo = ticketMemo;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
}
