// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

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
 * {@link ListConnQuestionResponseBody} extends {@link TeaModel}
 *
 * <p>ListConnQuestionResponseBody</p>
 */
public class ListConnQuestionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Outlines")
    private java.util.List<Outlines> outlines;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return outlines
     */
    public java.util.List<Outlines> getOutlines() {
        return this.outlines;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Outlines> outlines; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListConnQuestionResponseBody model) {
            this.outlines = model.outlines;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of associated questions.</p>
         */
        public Builder outlines(java.util.List<Outlines> outlines) {
            this.outlines = outlines;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>92B81548-42B9-4B34-924B-4E778AEB412B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListConnQuestionResponseBody build() {
            return new ListConnQuestionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListConnQuestionResponseBody} extends {@link TeaModel}
     *
     * <p>ListConnQuestionResponseBody</p>
     */
    public static class Outlines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnQuestionId")
        private Long connQuestionId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("OutlineId")
        private Long outlineId;

        @com.aliyun.core.annotation.NameInMap("Title")
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

            private Builder() {
            } 

            private Builder(Outlines model) {
                this.connQuestionId = model.connQuestionId;
                this.createTime = model.createTime;
                this.modifyTime = model.modifyTime;
                this.outlineId = model.outlineId;
                this.title = model.title;
            } 

            /**
             * <p>The associated knowledge ID.</p>
             * 
             * <strong>example:</strong>
             * <p>30001979424</p>
             */
            public Builder connQuestionId(Long connQuestionId) {
                this.connQuestionId = connQuestionId;
                return this;
            }

            /**
             * <p>The creation time in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-02-25T02:47:18Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The modification time in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-05-26T10:18:15Z</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The association ID.</p>
             * 
             * <strong>example:</strong>
             * <p>797</p>
             */
            public Builder outlineId(Long outlineId) {
                this.outlineId = outlineId;
                return this;
            }

            /**
             * <p>The title of the associated knowledge item.</p>
             * 
             * <strong>example:</strong>
             * <p>Associated question</p>
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
