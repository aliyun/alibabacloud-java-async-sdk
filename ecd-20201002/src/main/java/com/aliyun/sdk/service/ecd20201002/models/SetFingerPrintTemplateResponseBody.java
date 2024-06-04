// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetFingerPrintTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>SetFingerPrintTemplateResponseBody</p>
 */
public class SetFingerPrintTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EncryptedPassword")
    private String encryptedPassword;

    @com.aliyun.core.annotation.NameInMap("Index")
    private Integer index;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SetFingerPrintTemplateResponseBody(Builder builder) {
        this.encryptedPassword = builder.encryptedPassword;
        this.index = builder.index;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetFingerPrintTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return encryptedPassword
     */
    public String getEncryptedPassword() {
        return this.encryptedPassword;
    }

    /**
     * @return index
     */
    public Integer getIndex() {
        return this.index;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String encryptedPassword; 
        private Integer index; 
        private String requestId; 

        /**
         * EncryptedPassword.
         */
        public Builder encryptedPassword(String encryptedPassword) {
            this.encryptedPassword = encryptedPassword;
            return this;
        }

        /**
         * Index.
         */
        public Builder index(Integer index) {
            this.index = index;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SetFingerPrintTemplateResponseBody build() {
            return new SetFingerPrintTemplateResponseBody(this);
        } 

    } 

}
