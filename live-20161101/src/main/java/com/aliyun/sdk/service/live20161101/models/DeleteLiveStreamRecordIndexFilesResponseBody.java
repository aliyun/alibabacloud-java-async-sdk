// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DeleteLiveStreamRecordIndexFilesResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteLiveStreamRecordIndexFilesResponseBody</p>
 */
public class DeleteLiveStreamRecordIndexFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RecordDeleteInfoList")
    private RecordDeleteInfoList recordDeleteInfoList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

        private Builder() {
        } 

        private Builder(DeleteLiveStreamRecordIndexFilesResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.recordDeleteInfoList = model.recordDeleteInfoList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The status code. A return value of 500 indicates an error. For details, see the Error codes section of this topic.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The status description. A return value of 500 indicates an error. For details, see the Error codes section of this topic.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The deletion information.</p>
         */
        public Builder recordDeleteInfoList(RecordDeleteInfoList recordDeleteInfoList) {
            this.recordDeleteInfoList = recordDeleteInfoList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>939D19EE-59A0-18E9-B458-*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteLiveStreamRecordIndexFilesResponseBody build() {
            return new DeleteLiveStreamRecordIndexFilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteLiveStreamRecordIndexFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteLiveStreamRecordIndexFilesResponseBody</p>
     */
    public static class RecordDeleteInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("RecordId")
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

            private Builder() {
            } 

            private Builder(RecordDeleteInfo model) {
                this.message = model.message;
                this.recordId = model.recordId;
            } 

            /**
             * <p>The processing result of each file indicated by the file ID. Valid values:</p>
             * <ul>
             * <li><strong>OK</strong>: The file has been deleted.</li>
             * <li><strong>AccessDenied</strong>: Access to the file has been denied.</li>
             * <li><strong>FileNotFound</strong>: The file fails to be found.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The ID of the index file that is used to locate the live stream recording files to be deleted.</p>
             * 
             * <strong>example:</strong>
             * <p>c4d7f0a4-b506-43f9-8de3-07732c3f**</p>
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
    /**
     * 
     * {@link DeleteLiveStreamRecordIndexFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteLiveStreamRecordIndexFilesResponseBody</p>
     */
    public static class RecordDeleteInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RecordDeleteInfo")
        private java.util.List<RecordDeleteInfo> recordDeleteInfo;

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
        public java.util.List<RecordDeleteInfo> getRecordDeleteInfo() {
            return this.recordDeleteInfo;
        }

        public static final class Builder {
            private java.util.List<RecordDeleteInfo> recordDeleteInfo; 

            private Builder() {
            } 

            private Builder(RecordDeleteInfoList model) {
                this.recordDeleteInfo = model.recordDeleteInfo;
            } 

            /**
             * RecordDeleteInfo.
             */
            public Builder recordDeleteInfo(java.util.List<RecordDeleteInfo> recordDeleteInfo) {
                this.recordDeleteInfo = recordDeleteInfo;
                return this;
            }

            public RecordDeleteInfoList build() {
                return new RecordDeleteInfoList(this);
            } 

        } 

    }
}
