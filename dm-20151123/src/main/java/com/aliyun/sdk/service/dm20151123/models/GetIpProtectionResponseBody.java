// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link GetIpProtectionResponseBody} extends {@link TeaModel}
 *
 * <p>GetIpProtectionResponseBody</p>
 */
public class GetIpProtectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IpProtection")
    private String ipProtection;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetIpProtectionResponseBody(Builder builder) {
        this.ipProtection = builder.ipProtection;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIpProtectionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipProtection
     */
    public String getIpProtection() {
        return this.ipProtection;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String ipProtection; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetIpProtectionResponseBody model) {
            this.ipProtection = model.ipProtection;
            this.requestId = model.requestId;
        } 

        /**
         * <p>IP protection switch, On: 1 Off: 0</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder ipProtection(String ipProtection) {
            this.ipProtection = ipProtection;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>B30E5A62-2E64-577D-A70E-8C6781D6C975</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetIpProtectionResponseBody build() {
            return new GetIpProtectionResponseBody(this);
        } 

    } 

}
