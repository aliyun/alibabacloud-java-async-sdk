// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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
 * {@link GetRandomPasswordResponseBody} extends {@link TeaModel}
 *
 * <p>GetRandomPasswordResponseBody</p>
 */
public class GetRandomPasswordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RandomPassword")
    private String randomPassword;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetRandomPasswordResponseBody(Builder builder) {
        this.randomPassword = builder.randomPassword;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRandomPasswordResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return randomPassword
     */
    public String getRandomPassword() {
        return this.randomPassword;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String randomPassword; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetRandomPasswordResponseBody model) {
            this.randomPassword = model.randomPassword;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The generated random password.</p>
         * 
         * <strong>example:</strong>
         * <p>IxGn&gt;NMmNB(y?iZ&lt;Yc,_H/{2GC&quot;U****</p>
         */
        public Builder randomPassword(String randomPassword) {
            this.randomPassword = randomPassword;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6b0cbe25-5e33-467e-972e-7a83c6c97604</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRandomPasswordResponseBody build() {
            return new GetRandomPasswordResponseBody(this);
        } 

    } 

}
