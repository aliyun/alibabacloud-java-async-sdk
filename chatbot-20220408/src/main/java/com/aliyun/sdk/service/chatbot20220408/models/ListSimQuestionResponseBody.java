// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListSimQuestionResponseBody} extends {@link TeaModel}
 *
 * <p>ListSimQuestionResponseBody</p>
 */
public class ListSimQuestionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SimQuestions")
    private java.util.List < SimQuestions> simQuestions;

    private ListSimQuestionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.simQuestions = builder.simQuestions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSimQuestionResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return simQuestions
     */
    public java.util.List < SimQuestions> getSimQuestions() {
        return this.simQuestions;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < SimQuestions> simQuestions; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SimQuestions.
         */
        public Builder simQuestions(java.util.List < SimQuestions> simQuestions) {
            this.simQuestions = simQuestions;
            return this;
        }

        public ListSimQuestionResponseBody build() {
            return new ListSimQuestionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSimQuestionResponseBody} extends {@link TeaModel}
     *
     * <p>ListSimQuestionResponseBody</p>
     */
    public static class SimQuestions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("SimQuestionId")
        private Long simQuestionId;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private SimQuestions(Builder builder) {
            this.createTime = builder.createTime;
            this.modifyTime = builder.modifyTime;
            this.simQuestionId = builder.simQuestionId;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SimQuestions create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return simQuestionId
         */
        public Long getSimQuestionId() {
            return this.simQuestionId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String createTime; 
            private String modifyTime; 
            private Long simQuestionId; 
            private String title; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * SimQuestionId.
             */
            public Builder simQuestionId(Long simQuestionId) {
                this.simQuestionId = simQuestionId;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public SimQuestions build() {
                return new SimQuestions(this);
            } 

        } 

    }
}
