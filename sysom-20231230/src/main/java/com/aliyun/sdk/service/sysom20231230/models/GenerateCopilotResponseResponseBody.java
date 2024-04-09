// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateCopilotResponseResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateCopilotResponseResponseBody</p>
 */
public class GenerateCopilotResponseResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private String data;

    @NameInMap("massage")
    private String massage;

    @NameInMap("requestId")
    private String requestId;

    private GenerateCopilotResponseResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.massage = builder.massage;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateCopilotResponseResponseBody create() {
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
    public String getData() {
        return this.data;
    }

    /**
     * @return massage
     */
    public String getMassage() {
        return this.massage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String data; 
        private String massage; 
        private String requestId; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * massage.
         */
        public Builder massage(String massage) {
            this.massage = massage;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GenerateCopilotResponseResponseBody build() {
            return new GenerateCopilotResponseResponseBody(this);
        } 

    } 

}
