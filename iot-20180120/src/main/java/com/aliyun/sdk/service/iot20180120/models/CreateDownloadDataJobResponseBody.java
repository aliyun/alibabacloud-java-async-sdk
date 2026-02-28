// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link CreateDownloadDataJobResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDownloadDataJobResponseBody</p>
 */
public class CreateDownloadDataJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateDownloadDataJobResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDownloadDataJobResponseBody create() {
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CreateDownloadDataJobResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
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
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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

        public CreateDownloadDataJobResponseBody build() {
            return new CreateDownloadDataJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateDownloadDataJobResponseBody} extends {@link TeaModel}
     *
     * <p>CreateDownloadDataJobResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsyncExecute")
        private Boolean asyncExecute;

        @com.aliyun.core.annotation.NameInMap("CsvFileName")
        private String csvFileName;

        @com.aliyun.core.annotation.NameInMap("CsvUrl")
        private String csvUrl;

        @com.aliyun.core.annotation.NameInMap("LongJobId")
        private String longJobId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private Data(Builder builder) {
            this.asyncExecute = builder.asyncExecute;
            this.csvFileName = builder.csvFileName;
            this.csvUrl = builder.csvUrl;
            this.longJobId = builder.longJobId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return asyncExecute
         */
        public Boolean getAsyncExecute() {
            return this.asyncExecute;
        }

        /**
         * @return csvFileName
         */
        public String getCsvFileName() {
            return this.csvFileName;
        }

        /**
         * @return csvUrl
         */
        public String getCsvUrl() {
            return this.csvUrl;
        }

        /**
         * @return longJobId
         */
        public String getLongJobId() {
            return this.longJobId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Boolean asyncExecute; 
            private String csvFileName; 
            private String csvUrl; 
            private String longJobId; 
            private Integer status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.asyncExecute = model.asyncExecute;
                this.csvFileName = model.csvFileName;
                this.csvUrl = model.csvUrl;
                this.longJobId = model.longJobId;
                this.status = model.status;
            } 

            /**
             * AsyncExecute.
             */
            public Builder asyncExecute(Boolean asyncExecute) {
                this.asyncExecute = asyncExecute;
                return this;
            }

            /**
             * CsvFileName.
             */
            public Builder csvFileName(String csvFileName) {
                this.csvFileName = csvFileName;
                return this;
            }

            /**
             * CsvUrl.
             */
            public Builder csvUrl(String csvUrl) {
                this.csvUrl = csvUrl;
                return this;
            }

            /**
             * LongJobId.
             */
            public Builder longJobId(String longJobId) {
                this.longJobId = longJobId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
