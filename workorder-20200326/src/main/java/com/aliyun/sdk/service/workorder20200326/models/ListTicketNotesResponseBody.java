// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20200326.models;

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
 * {@link ListTicketNotesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTicketNotesResponseBody</p>
 */
public class ListTicketNotesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListTicketNotesResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTicketNotesResponseBody create() {
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
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
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
        private String accessDeniedDetail; 
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListTicketNotesResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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

        public ListTicketNotesResponseBody build() {
            return new ListTicketNotesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTicketNotesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTicketNotesResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("FromOfficial")
        private Boolean fromOfficial;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private Integer gmtCreated;

        @com.aliyun.core.annotation.NameInMap("NoteId")
        private String noteId;

        private List(Builder builder) {
            this.content = builder.content;
            this.fromOfficial = builder.fromOfficial;
            this.gmtCreated = builder.gmtCreated;
            this.noteId = builder.noteId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return fromOfficial
         */
        public Boolean getFromOfficial() {
            return this.fromOfficial;
        }

        /**
         * @return gmtCreated
         */
        public Integer getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return noteId
         */
        public String getNoteId() {
            return this.noteId;
        }

        public static final class Builder {
            private String content; 
            private Boolean fromOfficial; 
            private Integer gmtCreated; 
            private String noteId; 

            private Builder() {
            } 

            private Builder(List model) {
                this.content = model.content;
                this.fromOfficial = model.fromOfficial;
                this.gmtCreated = model.gmtCreated;
                this.noteId = model.noteId;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * FromOfficial.
             */
            public Builder fromOfficial(Boolean fromOfficial) {
                this.fromOfficial = fromOfficial;
                return this;
            }

            /**
             * GmtCreated.
             */
            public Builder gmtCreated(Integer gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * NoteId.
             */
            public Builder noteId(String noteId) {
                this.noteId = noteId;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTicketNotesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTicketNotesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        private Data(Builder builder) {
            this.list = builder.list;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        public static final class Builder {
            private java.util.List<List> list; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
            } 

            /**
             * List.
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
