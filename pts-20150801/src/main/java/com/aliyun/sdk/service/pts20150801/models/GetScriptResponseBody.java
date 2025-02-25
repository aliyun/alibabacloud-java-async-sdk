// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20150801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetScriptResponseBody} extends {@link TeaModel}
 *
 * <p>GetScriptResponseBody</p>
 */
public class GetScriptResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Script")
    private String script;

    private GetScriptResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.script = builder.script;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScriptResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return script
     */
    public String getScript() {
        return this.script;
    }

    public static final class Builder {
        private String requestId; 
        private String script; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Script.
         */
        public Builder script(String script) {
            this.script = script;
            return this;
        }

        public GetScriptResponseBody build() {
            return new GetScriptResponseBody(this);
        } 

    } 

}
