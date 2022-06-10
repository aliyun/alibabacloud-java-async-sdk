// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSolutionResponseBody} extends {@link TeaModel}
 *
 * <p>ListSolutionResponseBody</p>
 */
public class ListSolutionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Solutions")
    private java.util.List < Solutions> solutions;

    private ListSolutionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.solutions = builder.solutions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSolutionResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return solutions
     */
    public java.util.List < Solutions> getSolutions() {
        return this.solutions;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Solutions> solutions; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 答案列表
         */
        public Builder solutions(java.util.List < Solutions> solutions) {
            this.solutions = solutions;
            return this;
        }

        public ListSolutionResponseBody build() {
            return new ListSolutionResponseBody(this);
        } 

    } 

    public static class Solutions extends TeaModel {
        @NameInMap("Content")
        private String content;

        @NameInMap("ContentType")
        private Integer contentType;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("PerspectiveCodes")
        private java.util.List < String > perspectiveCodes;

        @NameInMap("PlainText")
        private String plainText;

        @NameInMap("SolutionId")
        private Long solutionId;

        private Solutions(Builder builder) {
            this.content = builder.content;
            this.contentType = builder.contentType;
            this.createTime = builder.createTime;
            this.modifyTime = builder.modifyTime;
            this.perspectiveCodes = builder.perspectiveCodes;
            this.plainText = builder.plainText;
            this.solutionId = builder.solutionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Solutions create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return contentType
         */
        public Integer getContentType() {
            return this.contentType;
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
         * @return perspectiveCodes
         */
        public java.util.List < String > getPerspectiveCodes() {
            return this.perspectiveCodes;
        }

        /**
         * @return plainText
         */
        public String getPlainText() {
            return this.plainText;
        }

        /**
         * @return solutionId
         */
        public Long getSolutionId() {
            return this.solutionId;
        }

        public static final class Builder {
            private String content; 
            private Integer contentType; 
            private String createTime; 
            private String modifyTime; 
            private java.util.List < String > perspectiveCodes; 
            private String plainText; 
            private Long solutionId; 

            /**
             * 答案内容
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * 答案类型(0纯文本，1富文本）
             */
            public Builder contentType(Integer contentType) {
                this.contentType = contentType;
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
             * 视角code列表
             */
            public Builder perspectiveCodes(java.util.List < String > perspectiveCodes) {
                this.perspectiveCodes = perspectiveCodes;
                return this;
            }

            /**
             * 答案纯文本内容
             */
            public Builder plainText(String plainText) {
                this.plainText = plainText;
                return this;
            }

            /**
             * 答案ID
             */
            public Builder solutionId(Long solutionId) {
                this.solutionId = solutionId;
                return this;
            }

            public Solutions build() {
                return new Solutions(this);
            } 

        } 

    }
}
