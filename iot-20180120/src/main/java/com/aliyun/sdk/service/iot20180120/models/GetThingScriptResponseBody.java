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
 * {@link GetThingScriptResponseBody} extends {@link TeaModel}
 *
 * <p>GetThingScriptResponseBody</p>
 */
public class GetThingScriptResponseBody extends TeaModel {
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

    private GetThingScriptResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetThingScriptResponseBody create() {
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

        private Builder(GetThingScriptResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned if the call is successful.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned if the call fails.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>BB71E443-4447-4024-A000-EDE09922891E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetThingScriptResponseBody build() {
            return new GetThingScriptResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetThingScriptResponseBody} extends {@link TeaModel}
     *
     * <p>GetThingScriptResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ScriptType")
        private String scriptType;

        @com.aliyun.core.annotation.NameInMap("ScriptUrl")
        private String scriptUrl;

        private Data(Builder builder) {
            this.scriptType = builder.scriptType;
            this.scriptUrl = builder.scriptUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return scriptType
         */
        public String getScriptType() {
            return this.scriptType;
        }

        /**
         * @return scriptUrl
         */
        public String getScriptUrl() {
            return this.scriptUrl;
        }

        public static final class Builder {
            private String scriptType; 
            private String scriptUrl; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.scriptType = model.scriptType;
                this.scriptUrl = model.scriptUrl;
            } 

            /**
             * <p>The type of the script. Valid values:</p>
             * <ul>
             * <li>JavaScript</li>
             * <li>Python_27: Python 2.7</li>
             * <li>PHP_72: PHP 7.2</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>JavaScript</p>
             */
            public Builder scriptType(String scriptType) {
                this.scriptType = scriptType;
                return this;
            }

            /**
             * <p>The URL of the script payload.</p>
             * 
             * <strong>example:</strong>
             * <p>http://***</p>
             */
            public Builder scriptUrl(String scriptUrl) {
                this.scriptUrl = scriptUrl;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
