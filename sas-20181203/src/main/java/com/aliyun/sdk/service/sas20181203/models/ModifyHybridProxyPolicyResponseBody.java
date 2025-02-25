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
 * {@link ModifyHybridProxyPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyHybridProxyPolicyResponseBody</p>
 */
public class ModifyHybridProxyPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Messgae")
    private String messgae;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyHybridProxyPolicyResponseBody(Builder builder) {
        this.messgae = builder.messgae;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyHybridProxyPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return messgae
     */
    public String getMessgae() {
        return this.messgae;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String messgae; 
        private String requestId; 

        /**
         * <p>The message of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>clusterName data not exist</p>
         */
        public Builder messgae(String messgae) {
            this.messgae = messgae;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>A4EB8B1C-1DEC-5E18-BCD0-D1BBB3936FA7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyHybridProxyPolicyResponseBody build() {
            return new ModifyHybridProxyPolicyResponseBody(this);
        } 

    } 

}
