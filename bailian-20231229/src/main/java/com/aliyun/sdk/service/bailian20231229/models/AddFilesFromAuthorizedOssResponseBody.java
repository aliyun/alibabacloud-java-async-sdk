// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

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
 * {@link AddFilesFromAuthorizedOssResponseBody} extends {@link TeaModel}
 *
 * <p>AddFilesFromAuthorizedOssResponseBody</p>
 */
public class AddFilesFromAuthorizedOssResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private AddFilesFromAuthorizedOssResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddFilesFromAuthorizedOssResponseBody create() {
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String status; 
        private String success; 

        private Builder() {
        } 

        private Builder(AddFilesFromAuthorizedOssResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.status = model.status;
            this.success = model.success;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The business data field of the operation.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Cant find out category for category_id param.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>17204B98-xxxx-4F9A-8464-2446A84821CA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status code returned by the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Indicates whether the operation is successful. Valid values:</p>
         * <ul>
         * <li>true: The operation is successful.</li>
         * <li>false: The operation fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public AddFilesFromAuthorizedOssResponseBody build() {
            return new AddFilesFromAuthorizedOssResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddFilesFromAuthorizedOssResponseBody} extends {@link TeaModel}
     *
     * <p>AddFilesFromAuthorizedOssResponseBody</p>
     */
    public static class AddFileResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("Msg")
        private String msg;

        @com.aliyun.core.annotation.NameInMap("OssKey")
        private String ossKey;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private AddFileResultList(Builder builder) {
            this.fileId = builder.fileId;
            this.msg = builder.msg;
            this.ossKey = builder.ossKey;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddFileResultList create() {
            return builder().build();
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return msg
         */
        public String getMsg() {
            return this.msg;
        }

        /**
         * @return ossKey
         */
        public String getOssKey() {
            return this.ossKey;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String fileId; 
            private String msg; 
            private String ossKey; 
            private String status; 

            private Builder() {
            } 

            private Builder(AddFileResultList model) {
                this.fileId = model.fileId;
                this.msg = model.msg;
                this.ossKey = model.ossKey;
                this.status = model.status;
            } 

            /**
             * <p>The file ID. Keep this value secure because it is used for all subsequent API operations related to this file.</p>
             * 
             * <strong>example:</strong>
             * <p>file_809f469a59ac449586ec692576xxxxx_102248XXX</p>
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>The error message returned when the file fails to be imported.</p>
             * 
             * <strong>example:</strong>
             * <p>size too large</p>
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * <p>The key of the imported file in the OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>root/path/this_is_temp_xxxx.pdf</p>
             */
            public Builder ossKey(String ossKey) {
                this.ossKey = ossKey;
                return this;
            }

            /**
             * <p>The file import status. Valid values:</p>
             * <ul>
             * <li>SUCCESS: The application data is imported.</li>
             * <li>FAILED: The application data fails to be imported.</li>
             * </ul>
             * <blockquote>
             * <p>Only files whose status is SUCCESS can be used to create or update knowledge bases.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public AddFileResultList build() {
                return new AddFileResultList(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddFilesFromAuthorizedOssResponseBody} extends {@link TeaModel}
     *
     * <p>AddFilesFromAuthorizedOssResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddFileResultList")
        private java.util.List<AddFileResultList> addFileResultList;

        private Data(Builder builder) {
            this.addFileResultList = builder.addFileResultList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return addFileResultList
         */
        public java.util.List<AddFileResultList> getAddFileResultList() {
            return this.addFileResultList;
        }

        public static final class Builder {
            private java.util.List<AddFileResultList> addFileResultList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.addFileResultList = model.addFileResultList;
            } 

            /**
             * <p>The list of file import results.</p>
             */
            public Builder addFileResultList(java.util.List<AddFileResultList> addFileResultList) {
                this.addFileResultList = addFileResultList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
