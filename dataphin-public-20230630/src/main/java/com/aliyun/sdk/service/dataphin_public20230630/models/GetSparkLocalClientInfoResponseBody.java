// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetSparkLocalClientInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetSparkLocalClientInfoResponseBody</p>
 */
public class GetSparkLocalClientInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetSparkLocalClientInfoResponseBody(Builder builder) {
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

    public static GetSparkLocalClientInfoResponseBody create() {
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
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetSparkLocalClientInfoResponseBody model) {
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
        public Builder data(java.util.List<Data> data) {
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

        public GetSparkLocalClientInfoResponseBody build() {
            return new GetSparkLocalClientInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSparkLocalClientInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetSparkLocalClientInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientFileResourceId")
        private String clientFileResourceId;

        @com.aliyun.core.annotation.NameInMap("ClientFileResourceName")
        private String clientFileResourceName;

        @com.aliyun.core.annotation.NameInMap("ClientName")
        private String clientName;

        @com.aliyun.core.annotation.NameInMap("Editable")
        private Boolean editable;

        private Data(Builder builder) {
            this.clientFileResourceId = builder.clientFileResourceId;
            this.clientFileResourceName = builder.clientFileResourceName;
            this.clientName = builder.clientName;
            this.editable = builder.editable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return clientFileResourceId
         */
        public String getClientFileResourceId() {
            return this.clientFileResourceId;
        }

        /**
         * @return clientFileResourceName
         */
        public String getClientFileResourceName() {
            return this.clientFileResourceName;
        }

        /**
         * @return clientName
         */
        public String getClientName() {
            return this.clientName;
        }

        /**
         * @return editable
         */
        public Boolean getEditable() {
            return this.editable;
        }

        public static final class Builder {
            private String clientFileResourceId; 
            private String clientFileResourceName; 
            private String clientName; 
            private Boolean editable; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.clientFileResourceId = model.clientFileResourceId;
                this.clientFileResourceName = model.clientFileResourceName;
                this.clientName = model.clientName;
                this.editable = model.editable;
            } 

            /**
             * ClientFileResourceId.
             */
            public Builder clientFileResourceId(String clientFileResourceId) {
                this.clientFileResourceId = clientFileResourceId;
                return this;
            }

            /**
             * ClientFileResourceName.
             */
            public Builder clientFileResourceName(String clientFileResourceName) {
                this.clientFileResourceName = clientFileResourceName;
                return this;
            }

            /**
             * ClientName.
             */
            public Builder clientName(String clientName) {
                this.clientName = clientName;
                return this;
            }

            /**
             * Editable.
             */
            public Builder editable(Boolean editable) {
                this.editable = editable;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
