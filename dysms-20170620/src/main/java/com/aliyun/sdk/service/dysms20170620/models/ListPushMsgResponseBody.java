// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link ListPushMsgResponseBody} extends {@link TeaModel}
 *
 * <p>ListPushMsgResponseBody</p>
 */
public class ListPushMsgResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Model")
    private Model model;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListPushMsgResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPushMsgResponseBody create() {
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
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return model
     */
    public Model getModel() {
        return this.model;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Model model; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListPushMsgResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.model = model.model;
            this.requestId = model.requestId;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
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
         * Model.
         */
        public Builder model(Model model) {
            this.model = model;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPushMsgResponseBody build() {
            return new ListPushMsgResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPushMsgResponseBody} extends {@link TeaModel}
     *
     * <p>ListPushMsgResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedDate")
        private String createdDate;

        @com.aliyun.core.annotation.NameInMap("CreatedDateStr")
        private String createdDateStr;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("PushTime")
        private String pushTime;

        @com.aliyun.core.annotation.NameInMap("PushTimeStr")
        private String pushTimeStr;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusStr")
        private String statusStr;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("UserNum")
        private Long userNum;

        private Model(Builder builder) {
            this.createdDate = builder.createdDate;
            this.createdDateStr = builder.createdDateStr;
            this.id = builder.id;
            this.pushTime = builder.pushTime;
            this.pushTimeStr = builder.pushTimeStr;
            this.spec = builder.spec;
            this.status = builder.status;
            this.statusStr = builder.statusStr;
            this.title = builder.title;
            this.userNum = builder.userNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return createdDate
         */
        public String getCreatedDate() {
            return this.createdDate;
        }

        /**
         * @return createdDateStr
         */
        public String getCreatedDateStr() {
            return this.createdDateStr;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return pushTime
         */
        public String getPushTime() {
            return this.pushTime;
        }

        /**
         * @return pushTimeStr
         */
        public String getPushTimeStr() {
            return this.pushTimeStr;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusStr
         */
        public String getStatusStr() {
            return this.statusStr;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return userNum
         */
        public Long getUserNum() {
            return this.userNum;
        }

        public static final class Builder {
            private String createdDate; 
            private String createdDateStr; 
            private String id; 
            private String pushTime; 
            private String pushTimeStr; 
            private String spec; 
            private String status; 
            private String statusStr; 
            private String title; 
            private Long userNum; 

            private Builder() {
            } 

            private Builder(Model model) {
                this.createdDate = model.createdDate;
                this.createdDateStr = model.createdDateStr;
                this.id = model.id;
                this.pushTime = model.pushTime;
                this.pushTimeStr = model.pushTimeStr;
                this.spec = model.spec;
                this.status = model.status;
                this.statusStr = model.statusStr;
                this.title = model.title;
                this.userNum = model.userNum;
            } 

            /**
             * CreatedDate.
             */
            public Builder createdDate(String createdDate) {
                this.createdDate = createdDate;
                return this;
            }

            /**
             * CreatedDateStr.
             */
            public Builder createdDateStr(String createdDateStr) {
                this.createdDateStr = createdDateStr;
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
             * PushTime.
             */
            public Builder pushTime(String pushTime) {
                this.pushTime = pushTime;
                return this;
            }

            /**
             * PushTimeStr.
             */
            public Builder pushTimeStr(String pushTimeStr) {
                this.pushTimeStr = pushTimeStr;
                return this;
            }

            /**
             * Spec.
             */
            public Builder spec(String spec) {
                this.spec = spec;
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
             * StatusStr.
             */
            public Builder statusStr(String statusStr) {
                this.statusStr = statusStr;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * UserNum.
             */
            public Builder userNum(Long userNum) {
                this.userNum = userNum;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
