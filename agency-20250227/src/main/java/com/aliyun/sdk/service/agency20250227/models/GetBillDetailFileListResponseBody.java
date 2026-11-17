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
 * {@link GetBillDetailFileListResponseBody} extends {@link TeaModel}
 *
 * <p>GetBillDetailFileListResponseBody</p>
 */
public class GetBillDetailFileListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetBillDetailFileListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBillDetailFileListResponseBody create() {
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
    public java.util.List<Data> getData() {
        return this.data;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private String msg; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetBillDetailFileListResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.msg = model.msg;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code.</p>
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
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Same as Message.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>210bc4b416874189683843905d9f9a</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetBillDetailFileListResponseBody build() {
            return new GetBillDetailFileListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetBillDetailFileListResponseBody} extends {@link TeaModel}
     *
     * <p>GetBillDetailFileListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BillMonth")
        private String billMonth;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileUrl")
        private String fileUrl;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Data(Builder builder) {
            this.billMonth = builder.billMonth;
            this.fileName = builder.fileName;
            this.fileUrl = builder.fileUrl;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return billMonth
         */
        public String getBillMonth() {
            return this.billMonth;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileUrl
         */
        public String getFileUrl() {
            return this.fileUrl;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String billMonth; 
            private String fileName; 
            private String fileUrl; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.billMonth = model.billMonth;
                this.fileName = model.fileName;
                this.fileUrl = model.fileUrl;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * <p>The billing month.</p>
             * 
             * <strong>example:</strong>
             * <p>202502</p>
             */
            public Builder billMonth(String billMonth) {
                this.billMonth = billMonth;
                return this;
            }

            /**
             * <p>The file name.</p>
             * 
             * <strong>example:</strong>
             * <p>Bill202502021112</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The file URL.</p>
             * 
             * <strong>example:</strong>
             * <p>aps.ailyun.com/file/download?resourceId=1234&amp;type=1</p>
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            /**
             * <p>The OSS file push status. Valid values:</p>
             * <ul>
             * <li>1: Pending.</li>
             * <li>2: Processing.</li>
             * <li>3: Completed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type. Valid values: Customer Acquisition, Channel Expansion.</p>
             * 
             * <strong>example:</strong>
             * <p>Channel Expansion</p>
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
