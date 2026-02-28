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
 * {@link GetThingModelTslResponseBody} extends {@link TeaModel}
 *
 * <p>GetThingModelTslResponseBody</p>
 */
public class GetThingModelTslResponseBody extends TeaModel {
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

        private Builder(GetThingModelTslResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error message returned if the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The URI that is used to store the TSL data in Object Storage Service (OSS). The URI is valid for 60 minutes.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The TSL data returned if the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetThingModelTslResponseBody build() {
            return new GetThingModelTslResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetThingModelTslResponseBody} extends {@link TeaModel}
     *
     * <p>GetThingModelTslResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TslStr")
        private String tslStr;

        @com.aliyun.core.annotation.NameInMap("TslUri")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.tslStr = model.tslStr;
                this.tslUri = model.tslUri;
            } 

            /**
             * TslStr.
             */
            public Builder tslStr(String tslStr) {
                this.tslStr = tslStr;
                return this;
            }

            /**
             * <p>The string of the TSL model.</p>
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
