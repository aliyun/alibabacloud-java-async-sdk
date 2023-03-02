// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportDataSourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ImportDataSourcesResponseBody</p>
 */
public class ImportDataSourcesResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ImportDataSourcesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportDataSourcesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Data data; 
        private String requestId; 
        private Boolean success; 

        /**
         * The information about the import operation.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request. You can locate logs and troubleshoot issues based on the ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true: The request was successful.
         * *   false: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ImportDataSourcesResponseBody build() {
            return new ImportDataSourcesResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Message")
        private String message;

        @NameInMap("Status")
        private Boolean status;

        private Data(Builder builder) {
            this.message = builder.message;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return status
         */
        public Boolean getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String message; 
            private Boolean status; 

            /**
             * The reason why the data sources failed to be imported. If the data sources were imported, this parameter is left empty.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * Indicates whether the data sources were imported. Valid values:
             * <p>
             * 
             * *   true: All the data sources were imported.
             * *   false: Some of the data sources failed to be imported. You can troubleshoot issues based on the Message parameter.
             */
            public Builder status(Boolean status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
