// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170405.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EdasProduceResponseBody} extends {@link TeaModel}
 *
 * <p>EdasProduceResponseBody</p>
 */
public class EdasProduceResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("message")
    private String message;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("synchro")
    private Boolean synchro;

    private EdasProduceResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.success = builder.success;
        this.synchro = builder.synchro;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EdasProduceResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return synchro
     */
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Boolean success; 
        private Boolean synchro; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * synchro.
         */
        public Builder synchro(Boolean synchro) {
            this.synchro = synchro;
            return this;
        }

        public EdasProduceResponseBody build() {
            return new EdasProduceResponseBody(this);
        } 

    } 

}
