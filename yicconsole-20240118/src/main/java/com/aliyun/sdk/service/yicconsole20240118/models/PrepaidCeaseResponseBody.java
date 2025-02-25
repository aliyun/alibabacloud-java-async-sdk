// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yicconsole20240118.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PrepaidCeaseResponseBody} extends {@link TeaModel}
 *
 * <p>PrepaidCeaseResponseBody</p>
 */
public class PrepaidCeaseResponseBody extends TeaModel {
    @NameInMap("Message")
    private String message;

    @NameInMap("Synchro")
    private Boolean synchro;

    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private String data;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    private PrepaidCeaseResponseBody(Builder builder) {
        this.message = builder.message;
        this.synchro = builder.synchro;
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PrepaidCeaseResponseBody create() {
        return builder().build();
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return synchro
     */
    public Boolean getSynchro() {
        return this.synchro;
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
        private String message; 
        private Boolean synchro; 
        private String code; 
        private String data; 
        private String requestId; 
        private Boolean success; 

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Synchro.
         */
        public Builder synchro(Boolean synchro) {
            this.synchro = synchro;
            return this;
        }

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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public PrepaidCeaseResponseBody build() {
            return new PrepaidCeaseResponseBody(this);
        } 

    } 

}
