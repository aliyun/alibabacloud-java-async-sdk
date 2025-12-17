// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

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
 * {@link DownloadVerifyRecordIntlResponseBody} extends {@link TeaModel}
 *
 * <p>DownloadVerifyRecordIntlResponseBody</p>
 */
public class DownloadVerifyRecordIntlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DownloadVerifyRecordIntlResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DownloadVerifyRecordIntlResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DownloadVerifyRecordIntlResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Return code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Return message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>ID of the request</p>
         * 
         * <strong>example:</strong>
         * <p>86C40EC3-5940-5F47-995C-BFE90B70E540</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DownloadVerifyRecordIntlResponseBody build() {
            return new DownloadVerifyRecordIntlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DownloadVerifyRecordIntlResponseBody} extends {@link TeaModel}
     *
     * <p>DownloadVerifyRecordIntlResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DownloadTaskId")
        private String downloadTaskId;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Data(Builder builder) {
            this.downloadTaskId = builder.downloadTaskId;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return downloadTaskId
         */
        public String getDownloadTaskId() {
            return this.downloadTaskId;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String downloadTaskId; 
            private String url; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.downloadTaskId = model.downloadTaskId;
                this.url = model.url;
            } 

            /**
             * <p>Task ID, returned in asynchronous mode, used later with QueryDownloadTaskIntl to download the exported file.</p>
             * 
             * <strong>example:</strong>
             * <p>202511284106866</p>
             */
            public Builder downloadTaskId(String downloadTaskId) {
                this.downloadTaskId = downloadTaskId;
                return this;
            }

            /**
             * <p>Exported file download link.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://cn-shanghai-aliyun-cloudauth.oss-cn-shanghai.aliyuncs.com/console/xxxxxx/KYC_INVOKE_STATISTICS.xlxs">https://cn-shanghai-aliyun-cloudauth.oss-cn-shanghai.aliyuncs.com/console/xxxxxx/KYC_INVOKE_STATISTICS.xlxs</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
