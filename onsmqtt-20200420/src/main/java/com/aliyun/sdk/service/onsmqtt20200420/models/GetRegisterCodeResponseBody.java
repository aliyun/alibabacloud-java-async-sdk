// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

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
 * {@link GetRegisterCodeResponseBody} extends {@link TeaModel}
 *
 * <p>GetRegisterCodeResponseBody</p>
 */
public class GetRegisterCodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RegisterCode")
    private String registerCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetRegisterCodeResponseBody(Builder builder) {
        this.registerCode = builder.registerCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRegisterCodeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return registerCode
     */
    public String getRegisterCode() {
        return this.registerCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String registerCode; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetRegisterCodeResponseBody model) {
            this.registerCode = model.registerCode;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The registration code of the CA certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>13274673-8f90-4630-bea1-9cccb25756ad2089******</p>
         */
        public Builder registerCode(String registerCode) {
            this.registerCode = registerCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>020F6A43-19E6-4B6E-B846-44EB31DF****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRegisterCodeResponseBody build() {
            return new GetRegisterCodeResponseBody(this);
        } 

    } 

}
