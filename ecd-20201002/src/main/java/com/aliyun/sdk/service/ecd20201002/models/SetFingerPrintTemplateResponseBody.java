// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(SetFingerPrintTemplateResponseBody model) {
            this.encryptedPassword = model.encryptedPassword;
            this.index = model.index;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The encrypted password.</p>
         * 
         * <strong>example:</strong>
         * <p>0711abb9-4cf8-41b2-9d0e-b51209468631;da4VFPNxwY3CZegFjOrCNw==;iHp2l9/qGcfD4tWx7jZIZQ==</p>
         */
        public Builder encryptedPassword(String encryptedPassword) {
            this.encryptedPassword = encryptedPassword;
            return this;
        }

        /**
         * <p>The index.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder index(Integer index) {
            this.index = index;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CDE666EA-4FCD-5024-895C-8698E3D3****</p>
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
