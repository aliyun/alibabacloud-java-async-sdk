// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIntentionNoteResponseBody} extends {@link TeaModel}
 *
 * <p>ListIntentionNoteResponseBody</p>
 */
public class ListIntentionNoteResponseBody extends TeaModel {
    @NameInMap("CurrentPageNum")
    private Integer currentPageNum;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalItemNum")
    private Integer totalItemNum;

    @NameInMap("TotalPageNum")
    private Integer totalPageNum;

    private ListIntentionNoteResponseBody(Builder builder) {
        this.currentPageNum = builder.currentPageNum;
        this.data = builder.data;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalItemNum = builder.totalItemNum;
        this.totalPageNum = builder.totalPageNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIntentionNoteResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentPageNum
     */
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalItemNum
     */
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    /**
     * @return totalPageNum
     */
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static final class Builder {
        private Integer currentPageNum; 
        private java.util.List < Data> data; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalItemNum; 
        private Integer totalPageNum; 

        /**
         * CurrentPageNum.
         */
        public Builder currentPageNum(Integer currentPageNum) {
            this.currentPageNum = currentPageNum;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalItemNum.
         */
        public Builder totalItemNum(Integer totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }

        /**
         * TotalPageNum.
         */
        public Builder totalPageNum(Integer totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }

        public ListIntentionNoteResponseBody build() {
            return new ListIntentionNoteResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("IntentionBizId")
        private String intentionBizId;

        @NameInMap("Note")
        private String note;

        @NameInMap("Source")
        private Integer source;

        @NameInMap("Type")
        private String type;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.intentionBizId = builder.intentionBizId;
            this.note = builder.note;
            this.source = builder.source;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return intentionBizId
         */
        public String getIntentionBizId() {
            return this.intentionBizId;
        }

        /**
         * @return note
         */
        public String getNote() {
            return this.note;
        }

        /**
         * @return source
         */
        public Integer getSource() {
            return this.source;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String createTime; 
            private String intentionBizId; 
            private String note; 
            private Integer source; 
            private String type; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * IntentionBizId.
             */
            public Builder intentionBizId(String intentionBizId) {
                this.intentionBizId = intentionBizId;
                return this;
            }

            /**
             * Note.
             */
            public Builder note(String note) {
                this.note = note;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(Integer source) {
                this.source = source;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
