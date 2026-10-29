// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link SasInstallCodeResponseBody} extends {@link TeaModel}
 *
 * <p>SasInstallCodeResponseBody</p>
 */
public class SasInstallCodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("data")
    private String data;

    private SasInstallCodeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SasInstallCodeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    public static final class Builder {
        private String requestId; 
        private String data; 

        private Builder() {
        } 

        private Builder(SasInstallCodeResponseBody model) {
            this.requestId = model.requestId;
            this.data = model.data;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B256A525-7E42-4BB9-A27C-9017FDDFF1A2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The installation verification code that is used to run the installation command when you manually install the Security Center agent.</p>
         * 
         * <strong>example:</strong>
         * <p>eD****</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        public SasInstallCodeResponseBody build() {
            return new SasInstallCodeResponseBody(this);
        } 

    } 

}
