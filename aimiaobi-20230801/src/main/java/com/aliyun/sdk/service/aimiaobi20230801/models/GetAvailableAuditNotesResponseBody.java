// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link GetAvailableAuditNotesResponseBody} extends {@link TeaModel}
 *
 * <p>GetAvailableAuditNotesResponseBody</p>
 */
public class GetAvailableAuditNotesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetAvailableAuditNotesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAvailableAuditNotesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetAvailableAuditNotesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>F2F366D6-E9FE-1006-BB70-2C650896AAB5</p>
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

        public GetAvailableAuditNotesResponseBody build() {
            return new GetAvailableAuditNotesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAvailableAuditNotesResponseBody} extends {@link TeaModel}
     *
     * <p>GetAvailableAuditNotesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileSize")
        private Long fileSize;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("NoteId")
        private String noteId;

        @com.aliyun.core.annotation.NameInMap("NoteName")
        private String noteName;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private Data(Builder builder) {
            this.fileSize = builder.fileSize;
            this.id = builder.id;
            this.noteId = builder.noteId;
            this.noteName = builder.noteName;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return fileSize
         */
        public Long getFileSize() {
            return this.fileSize;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return noteId
         */
        public String getNoteId() {
            return this.noteId;
        }

        /**
         * @return noteName
         */
        public String getNoteName() {
            return this.noteName;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Long fileSize; 
            private String id; 
            private String noteId; 
            private String noteName; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.fileSize = model.fileSize;
                this.id = model.id;
                this.noteId = model.noteId;
                this.noteName = model.noteName;
                this.updateTime = model.updateTime;
            } 

            /**
             * FileSize.
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * NoteId.
             */
            public Builder noteId(String noteId) {
                this.noteId = noteId;
                return this;
            }

            /**
             * NoteName.
             */
            public Builder noteName(String noteName) {
                this.noteName = noteName;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
