// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetThingModelTslResponseBody} extends {@link TeaModel}
 *
 * <p>GetThingModelTslResponseBody</p>
 */
public class GetThingModelTslResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetThingModelTslResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetThingModelTslResponseBody create() {
        return builder().build();
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

        public GetThingModelTslResponseBody build() {
            return new GetThingModelTslResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("TslStr")
        private String tslStr;

        @NameInMap("TslUri")
        private String tslUri;

        private Data(Builder builder) {
            this.tslStr = builder.tslStr;
            this.tslUri = builder.tslUri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return tslStr
         */
        public String getTslStr() {
            return this.tslStr;
        }

        /**
         * @return tslUri
         */
        public String getTslUri() {
            return this.tslUri;
        }

        public static final class Builder {
            private String tslStr; 
            private String tslUri; 

            /**
             * TslStr.
             */
            public Builder tslStr(String tslStr) {
                this.tslStr = tslStr;
                return this;
            }

            /**
             * TslUri.
             */
            public Builder tslUri(String tslUri) {
                this.tslUri = tslUri;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
