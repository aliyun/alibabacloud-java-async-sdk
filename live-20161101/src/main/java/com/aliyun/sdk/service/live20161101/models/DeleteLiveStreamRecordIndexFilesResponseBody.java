// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLiveStreamRecordIndexFilesResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteLiveStreamRecordIndexFilesResponseBody</p>
 */
public class DeleteLiveStreamRecordIndexFilesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RecordDeleteInfoList")
    private RecordDeleteInfoList recordDeleteInfoList;

    @NameInMap("RequestId")
    private String requestId;

    private DeleteLiveStreamRecordIndexFilesResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.recordDeleteInfoList = builder.recordDeleteInfoList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLiveStreamRecordIndexFilesResponseBody create() {
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
     * @return recordDeleteInfoList
     */
    public RecordDeleteInfoList getRecordDeleteInfoList() {
        return this.recordDeleteInfoList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private RecordDeleteInfoList recordDeleteInfoList; 
        private String requestId; 

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
         * RecordDeleteInfoList.
         */
        public Builder recordDeleteInfoList(RecordDeleteInfoList recordDeleteInfoList) {
            this.recordDeleteInfoList = recordDeleteInfoList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteLiveStreamRecordIndexFilesResponseBody build() {
            return new DeleteLiveStreamRecordIndexFilesResponseBody(this);
        } 

    } 

    public static class RecordDeleteInfo extends TeaModel {
        @NameInMap("Message")
        private String message;

        @NameInMap("RecordId")
        private String recordId;

        private RecordDeleteInfo(Builder builder) {
            this.message = builder.message;
            this.recordId = builder.recordId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordDeleteInfo create() {
            return builder().build();
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
            private String message; 
            private String recordId; 

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

            public RecordDeleteInfo build() {
                return new RecordDeleteInfo(this);
            } 

        } 

    }
    public static class RecordDeleteInfoList extends TeaModel {
        @NameInMap("RecordDeleteInfo")
        private java.util.List < RecordDeleteInfo> recordDeleteInfo;

        private RecordDeleteInfoList(Builder builder) {
            this.recordDeleteInfo = builder.recordDeleteInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordDeleteInfoList create() {
            return builder().build();
        }

        /**
         * @return recordDeleteInfo
         */
        public java.util.List < RecordDeleteInfo> getRecordDeleteInfo() {
            return this.recordDeleteInfo;
        }

        public static final class Builder {
            private java.util.List < RecordDeleteInfo> recordDeleteInfo; 

            /**
             * RecordDeleteInfo.
             */
            public Builder recordDeleteInfo(java.util.List < RecordDeleteInfo> recordDeleteInfo) {
                this.recordDeleteInfo = recordDeleteInfo;
                return this;
            }

            public RecordDeleteInfoList build() {
                return new RecordDeleteInfoList(this);
            } 

        } 

    }
}
