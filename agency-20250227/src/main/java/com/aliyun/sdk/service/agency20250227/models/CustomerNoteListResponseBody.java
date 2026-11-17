// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20250227.models;

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
 * {@link CustomerNoteListResponseBody} extends {@link TeaModel}
 *
 * <p>CustomerNoteListResponseBody</p>
 */
public class CustomerNoteListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CustomerNoteListResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CustomerNoteListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String msg; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CustomerNoteListResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.msg = model.msg;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the access denial returned by the POP API when the RAM user lacks the required permissions.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The result code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code returned by the POP API.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The prompt message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The prompt message. This parameter is the same as Message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9C14ADFE-DF0A-54D4-8BD5-45D0839246B4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CustomerNoteListResponseBody build() {
            return new CustomerNoteListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CustomerNoteListResponseBody} extends {@link TeaModel}
     *
     * <p>CustomerNoteListResponseBody</p>
     */
    public static class DataData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactName")
        private String contactName;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private Long creator;

        @com.aliyun.core.annotation.NameInMap("CreatorName")
        private String creatorName;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("NoteContent")
        private String noteContent;

        @com.aliyun.core.annotation.NameInMap("NoteId")
        private Long noteId;

        @com.aliyun.core.annotation.NameInMap("NoteType")
        private String noteType;

        @com.aliyun.core.annotation.NameInMap("NoteTypeLabel")
        private String noteTypeLabel;

        @com.aliyun.core.annotation.NameInMap("TouchDate")
        private String touchDate;

        private DataData(Builder builder) {
            this.contactName = builder.contactName;
            this.creator = builder.creator;
            this.creatorName = builder.creatorName;
            this.gmtCreate = builder.gmtCreate;
            this.noteContent = builder.noteContent;
            this.noteId = builder.noteId;
            this.noteType = builder.noteType;
            this.noteTypeLabel = builder.noteTypeLabel;
            this.touchDate = builder.touchDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataData create() {
            return builder().build();
        }

        /**
         * @return contactName
         */
        public String getContactName() {
            return this.contactName;
        }

        /**
         * @return creator
         */
        public Long getCreator() {
            return this.creator;
        }

        /**
         * @return creatorName
         */
        public String getCreatorName() {
            return this.creatorName;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return noteContent
         */
        public String getNoteContent() {
            return this.noteContent;
        }

        /**
         * @return noteId
         */
        public Long getNoteId() {
            return this.noteId;
        }

        /**
         * @return noteType
         */
        public String getNoteType() {
            return this.noteType;
        }

        /**
         * @return noteTypeLabel
         */
        public String getNoteTypeLabel() {
            return this.noteTypeLabel;
        }

        /**
         * @return touchDate
         */
        public String getTouchDate() {
            return this.touchDate;
        }

        public static final class Builder {
            private String contactName; 
            private Long creator; 
            private String creatorName; 
            private String gmtCreate; 
            private String noteContent; 
            private Long noteId; 
            private String noteType; 
            private String noteTypeLabel; 
            private String touchDate; 

            private Builder() {
            } 

            private Builder(DataData model) {
                this.contactName = model.contactName;
                this.creator = model.creator;
                this.creatorName = model.creatorName;
                this.gmtCreate = model.gmtCreate;
                this.noteContent = model.noteContent;
                this.noteId = model.noteId;
                this.noteType = model.noteType;
                this.noteTypeLabel = model.noteTypeLabel;
                this.touchDate = model.touchDate;
            } 

            /**
             * <p>The name of the contact.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhang San</p>
             */
            public Builder contactName(String contactName) {
                this.contactName = contactName;
                return this;
            }

            /**
             * <p>The UID of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>1757916424103619</p>
             */
            public Builder creator(Long creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The logon name of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhang San</p>
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            /**
             * <p>The creation time. Format: yyyy-MM-dd HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-07-17 12:18:23</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The content of the note.</p>
             * 
             * <strong>example:</strong>
             * <p>Discuss technical solutions</p>
             */
            public Builder noteContent(String noteContent) {
                this.noteContent = noteContent;
                return this;
            }

            /**
             * <p>The note ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2932252</p>
             */
            public Builder noteId(Long noteId) {
                this.noteId = noteId;
                return this;
            }

            /**
             * <p>The note type. Valid value: CUSTOMER.</p>
             * 
             * <strong>example:</strong>
             * <p>CUSTOMER</p>
             */
            public Builder noteType(String noteType) {
                this.noteType = noteType;
                return this;
            }

            /**
             * <p>The name of the note type.</p>
             * 
             * <strong>example:</strong>
             * <p>Customer</p>
             */
            public Builder noteTypeLabel(String noteTypeLabel) {
                this.noteTypeLabel = noteTypeLabel;
                return this;
            }

            /**
             * <p>The contact date. The value is a timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1784266662000</p>
             */
            public Builder touchDate(String touchDate) {
                this.touchDate = touchDate;
                return this;
            }

            public DataData build() {
                return new DataData(this);
            } 

        } 

    }
    /**
     * 
     * {@link CustomerNoteListResponseBody} extends {@link TeaModel}
     *
     * <p>CustomerNoteListResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Page")
        private Integer page;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private PageInfo(Builder builder) {
            this.page = builder.page;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return page
         */
        public Integer getPage() {
            return this.page;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer page; 
            private Integer pageSize; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.page = model.page;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * <p>The current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder page(Integer page) {
                this.page = page;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link CustomerNoteListResponseBody} extends {@link TeaModel}
     *
     * <p>CustomerNoteListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
        private String accessDeniedDetail;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<DataData> data;

        @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
        private Integer httpStatusCode;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Msg")
        private String msg;

        @com.aliyun.core.annotation.NameInMap("PageInfo")
        private PageInfo pageInfo;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Integer pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.accessDeniedDetail = builder.accessDeniedDetail;
            this.code = builder.code;
            this.data = builder.data;
            this.httpStatusCode = builder.httpStatusCode;
            this.message = builder.message;
            this.msg = builder.msg;
            this.pageInfo = builder.pageInfo;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.requestId = builder.requestId;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accessDeniedDetail
         */
        public String getAccessDeniedDetail() {
            return this.accessDeniedDetail;
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
        public java.util.List<DataData> getData() {
            return this.data;
        }

        /**
         * @return httpStatusCode
         */
        public Integer getHttpStatusCode() {
            return this.httpStatusCode;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return msg
         */
        public String getMsg() {
            return this.msg;
        }

        /**
         * @return pageInfo
         */
        public PageInfo getPageInfo() {
            return this.pageInfo;
        }

        /**
         * @return pageNo
         */
        public Integer getPageNo() {
            return this.pageNo;
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
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private String accessDeniedDetail; 
            private String code; 
            private java.util.List<DataData> data; 
            private Integer httpStatusCode; 
            private String message; 
            private String msg; 
            private PageInfo pageInfo; 
            private Integer pageNo; 
            private Integer pageSize; 
            private String requestId; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accessDeniedDetail = model.accessDeniedDetail;
                this.code = model.code;
                this.data = model.data;
                this.httpStatusCode = model.httpStatusCode;
                this.message = model.message;
                this.msg = model.msg;
                this.pageInfo = model.pageInfo;
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.requestId = model.requestId;
                this.total = model.total;
            } 

            /**
             * <p>The details of the access denial returned by the POP API when the RAM user lacks the required permissions.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder accessDeniedDetail(String accessDeniedDetail) {
                this.accessDeniedDetail = accessDeniedDetail;
                return this;
            }

            /**
             * <p>The result code.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The returned data.</p>
             */
            public Builder data(java.util.List<DataData> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The HTTP status code returned by the POP API.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder httpStatusCode(Integer httpStatusCode) {
                this.httpStatusCode = httpStatusCode;
                return this;
            }

            /**
             * <p>The prompt message.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The prompt message. This parameter is the same as Message.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The pagination information compatible with the legacy fenxiao-service API.</p>
             */
            public Builder pageInfo(PageInfo pageInfo) {
                this.pageInfo = pageInfo;
                return this;
            }

            /**
             * <p>The current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The request ID.</p>
             * 
             * <strong>example:</strong>
             * <p>9C14ADFE-DF0A-54D4-8BD5-45D0839246B4</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
