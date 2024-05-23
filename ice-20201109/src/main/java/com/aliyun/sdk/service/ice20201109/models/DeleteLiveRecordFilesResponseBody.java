// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLiveRecordFilesResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteLiveRecordFilesResponseBody</p>
 */
public class DeleteLiveRecordFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeleteFileInfoList")
    private java.util.List < DeleteFileInfoList> deleteFileInfoList;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteLiveRecordFilesResponseBody(Builder builder) {
        this.deleteFileInfoList = builder.deleteFileInfoList;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLiveRecordFilesResponseBody create() {
        return builder().build();
    }

    /**
     * @return deleteFileInfoList
     */
    public java.util.List < DeleteFileInfoList> getDeleteFileInfoList() {
        return this.deleteFileInfoList;
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

    public static final class Builder {
        private java.util.List < DeleteFileInfoList> deleteFileInfoList; 
        private String message; 
        private String requestId; 

        /**
         * DeleteFileInfoList.
         */
        public Builder deleteFileInfoList(java.util.List < DeleteFileInfoList> deleteFileInfoList) {
            this.deleteFileInfoList = deleteFileInfoList;
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteLiveRecordFilesResponseBody build() {
            return new DeleteLiveRecordFilesResponseBody(this);
        } 

    } 

    public static class DeleteFileInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("RecordId")
        private String recordId;

        private DeleteFileInfoList(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
            this.recordId = builder.recordId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeleteFileInfoList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return recordId
         */
        public String getRecordId() {
            return this.recordId;
        }

        public static final class Builder {
            private String code; 
            private String message; 
            private String recordId; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
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
             * RecordId.
             */
            public Builder recordId(String recordId) {
                this.recordId = recordId;
                return this;
            }

            public DeleteFileInfoList build() {
                return new DeleteFileInfoList(this);
            } 

        } 

    }
}
