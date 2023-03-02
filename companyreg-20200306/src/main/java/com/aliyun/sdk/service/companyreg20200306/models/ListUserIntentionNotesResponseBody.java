// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserIntentionNotesResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserIntentionNotesResponseBody</p>
 */
public class ListUserIntentionNotesResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("PageNum")
    private Integer pageNum;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalItemNum")
    private Integer totalItemNum;

    @NameInMap("TotalPageNum")
    private Integer totalPageNum;

    private ListUserIntentionNotesResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalItemNum = builder.totalItemNum;
        this.totalPageNum = builder.totalPageNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserIntentionNotesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
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
        private java.util.List < Data> data; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalItemNum; 
        private Integer totalPageNum; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.pageNum = pageNum;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
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

        public ListUserIntentionNotesResponseBody build() {
            return new ListUserIntentionNotesResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Note")
        private String note;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.note = builder.note;
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
         * @return note
         */
        public String getNote() {
            return this.note;
        }

        public static final class Builder {
            private String createTime; 
            private String note; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Note.
             */
            public Builder note(String note) {
                this.note = note;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
