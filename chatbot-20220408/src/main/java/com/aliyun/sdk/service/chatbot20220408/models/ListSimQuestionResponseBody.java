// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSimQuestionResponseBody} extends {@link TeaModel}
 *
 * <p>ListSimQuestionResponseBody</p>
 */
public class ListSimQuestionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SimQuestions")
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
         * 相似问列表
         */
        public Builder simQuestions(java.util.List < SimQuestions> simQuestions) {
            this.simQuestions = simQuestions;
            return this;
        }

        public ListSimQuestionResponseBody build() {
            return new ListSimQuestionResponseBody(this);
        } 

    } 

    public static class SimQuestions extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("SimQuestionId")
        private Long simQuestionId;

        @NameInMap("Title")
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
             * 创建时间(UTC 时间)
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 修改时间(UTC 时间)
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * 相似问ID
             */
            public Builder simQuestionId(Long simQuestionId) {
                this.simQuestionId = simQuestionId;
                return this;
            }

            /**
             * 相似问标题
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
