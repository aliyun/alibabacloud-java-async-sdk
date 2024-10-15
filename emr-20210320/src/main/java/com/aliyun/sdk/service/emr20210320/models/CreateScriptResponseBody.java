// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateScriptResponseBody} extends {@link TeaModel}
 *
 * <p>CreateScriptResponseBody</p>
 */
public class CreateScriptResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScriptId")
    private String scriptId;

    private CreateScriptResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.scriptId = builder.scriptId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScriptResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    public static final class Builder {
        private String requestId; 
        private String scriptId; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The script ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cs-d6d6bc841c0d415fb81808bc6d09****</p>
         */
        public Builder scriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }

        public CreateScriptResponseBody build() {
            return new CreateScriptResponseBody(this);
        } 

    } 

}
