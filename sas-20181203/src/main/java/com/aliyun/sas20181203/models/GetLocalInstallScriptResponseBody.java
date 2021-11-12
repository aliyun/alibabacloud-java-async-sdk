// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetLocalInstallScriptResponseBody} extends {@link TeaModel}
 *
 * <p>GetLocalInstallScriptResponseBody</p>
 */
public class GetLocalInstallScriptResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Script")
    private String script;


    private GetLocalInstallScriptResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.script = builder.script;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLocalInstallScriptResponseBody create() {
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
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Script.</p>
         */
        public Builder script(String script) {
            this.script = script;
            return this;
        }

        public GetLocalInstallScriptResponseBody build() {
            return new GetLocalInstallScriptResponseBody(this);
        } 

    } 

}
