// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link CreateFileDeepAnalyzeResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFileDeepAnalyzeResponseBody</p>
 */
public class CreateFileDeepAnalyzeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private CreateFileDeepAnalyzeResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFileDeepAnalyzeResponseBody create() {
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
    public String getData() {
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

    public static final class Builder {
        private String code; 
        private String data; 
        private String message; 
        private String requestId; 
        private String status; 

        private Builder() {
        } 

        private Builder(CreateFileDeepAnalyzeResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>FileNotExist</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The analysis result.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;result&quot;: 0,
         *   &quot;file_analysis&quot;: {
         *     &quot;summary&quot;: {
         *       &quot;ai_interpretation&quot;: &quot;The file is a JetBrains PhpStorm stub generation tool script and is a legitimate developer tool. The code uses the PhpParser library to parse PHP source code and generate the PhpStormStubsMap.php mapping file. The DPI engine analysis did not detect any dangerous function invoke, external input processing, code obfuscation, or malicious behavior characteristics. The file is determined to be normal.&quot;
         *     }
         *   }
         * }</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The phase description.</p>
         * 
         * <strong>example:</strong>
         * <p>File hash parsed</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E7F9C0A1-2B3D-4E5F-8A90-123456XXXXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The phase status.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public CreateFileDeepAnalyzeResponseBody build() {
            return new CreateFileDeepAnalyzeResponseBody(this);
        } 

    } 

}
