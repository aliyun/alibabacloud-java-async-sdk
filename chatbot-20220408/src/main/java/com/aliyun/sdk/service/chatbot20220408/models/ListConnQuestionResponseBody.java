// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConnQuestionResponseBody} extends {@link TeaModel}
 *
 * <p>ListConnQuestionResponseBody</p>
 */
public class ListConnQuestionResponseBody extends TeaModel {
    @NameInMap("Outlines")
    private java.util.List < Outlines> outlines;

    @NameInMap("RequestId")
    private String requestId;

    private ListConnQuestionResponseBody(Builder builder) {
        this.outlines = builder.outlines;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConnQuestionResponseBody create() {
        return builder().build();
    }

    /**
     * @return outlines
     */
    public java.util.List < Outlines> getOutlines() {
        return this.outlines;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Outlines> outlines; 
        private String requestId; 

        /**
         * Outlines.
         */
        public Builder outlines(java.util.List < Outlines> outlines) {
            this.outlines = outlines;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListConnQuestionResponseBody build() {
            return new ListConnQuestionResponseBody(this);
        } 

    } 

    public static class Outlines extends TeaModel {
        @NameInMap("ConnQuestionId")
        private Long connQuestionId;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("OutlineId")
        private Long outlineId;

        @NameInMap("Title")
        private String title;

        private Outlines(Builder builder) {
            this.connQuestionId = builder.connQuestionId;
            this.createTime = builder.createTime;
            this.modifyTime = builder.modifyTime;
            this.outlineId = builder.outlineId;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Outlines create() {
            return builder().build();
        }

        /**
         * @return connQuestionId
         */
        public Long getConnQuestionId() {
            return this.connQuestionId;
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
         * @return outlineId
         */
        public Long getOutlineId() {
            return this.outlineId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private Long connQuestionId; 
            private String createTime; 
            private String modifyTime; 
            private Long outlineId; 
            private String title; 

            /**
             * 关联知识ID
             */
            public Builder connQuestionId(Long connQuestionId) {
                this.connQuestionId = connQuestionId;
                return this;
            }

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
             * 关联关系ID
             */
            public Builder outlineId(Long outlineId) {
                this.outlineId = outlineId;
                return this;
            }

            /**
             * 关联知识题目
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Outlines build() {
                return new Outlines(this);
            } 

        } 

    }
}
