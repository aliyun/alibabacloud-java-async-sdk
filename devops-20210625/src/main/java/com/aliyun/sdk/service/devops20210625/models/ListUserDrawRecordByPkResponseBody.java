// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserDrawRecordByPkResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserDrawRecordByPkResponseBody</p>
 */
public class ListUserDrawRecordByPkResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private ListUserDrawRecordByPkResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserDrawRecordByPkResponseBody create() {
        return builder().build();
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
    public java.util.List < Data> getData() {
        return this.data;
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
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
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

        public ListUserDrawRecordByPkResponseBody build() {
            return new ListUserDrawRecordByPkResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("aliyunPk")
        private String aliyunPk;

        @com.aliyun.core.annotation.NameInMap("drawGroup")
        private String drawGroup;

        @com.aliyun.core.annotation.NameInMap("drawPoolName")
        private String drawPoolName;

        @com.aliyun.core.annotation.NameInMap("drawResult")
        private String drawResult;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("taskGroupId")
        private String taskGroupId;

        @com.aliyun.core.annotation.NameInMap("uccId")
        private String uccId;

        private Data(Builder builder) {
            this.aliyunPk = builder.aliyunPk;
            this.drawGroup = builder.drawGroup;
            this.drawPoolName = builder.drawPoolName;
            this.drawResult = builder.drawResult;
            this.gmtCreate = builder.gmtCreate;
            this.taskGroupId = builder.taskGroupId;
            this.uccId = builder.uccId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aliyunPk
         */
        public String getAliyunPk() {
            return this.aliyunPk;
        }

        /**
         * @return drawGroup
         */
        public String getDrawGroup() {
            return this.drawGroup;
        }

        /**
         * @return drawPoolName
         */
        public String getDrawPoolName() {
            return this.drawPoolName;
        }

        /**
         * @return drawResult
         */
        public String getDrawResult() {
            return this.drawResult;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return taskGroupId
         */
        public String getTaskGroupId() {
            return this.taskGroupId;
        }

        /**
         * @return uccId
         */
        public String getUccId() {
            return this.uccId;
        }

        public static final class Builder {
            private String aliyunPk; 
            private String drawGroup; 
            private String drawPoolName; 
            private String drawResult; 
            private String gmtCreate; 
            private String taskGroupId; 
            private String uccId; 

            /**
             * aliyunPk.
             */
            public Builder aliyunPk(String aliyunPk) {
                this.aliyunPk = aliyunPk;
                return this;
            }

            /**
             * drawGroup.
             */
            public Builder drawGroup(String drawGroup) {
                this.drawGroup = drawGroup;
                return this;
            }

            /**
             * drawPoolName.
             */
            public Builder drawPoolName(String drawPoolName) {
                this.drawPoolName = drawPoolName;
                return this;
            }

            /**
             * drawResult.
             */
            public Builder drawResult(String drawResult) {
                this.drawResult = drawResult;
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
             * taskGroupId.
             */
            public Builder taskGroupId(String taskGroupId) {
                this.taskGroupId = taskGroupId;
                return this;
            }

            /**
             * uccId.
             */
            public Builder uccId(String uccId) {
                this.uccId = uccId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
