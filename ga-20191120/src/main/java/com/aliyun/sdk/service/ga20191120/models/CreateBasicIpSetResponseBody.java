// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

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
 * {@link CreateBasicIpSetResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBasicIpSetResponseBody</p>
 */
public class CreateBasicIpSetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IpSetId")
    private String ipSetId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateBasicIpSetResponseBody(Builder builder) {
        this.ipSetId = builder.ipSetId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBasicIpSetResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipSetId
     */
    public String getIpSetId() {
        return this.ipSetId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String ipSetId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateBasicIpSetResponseBody model) {
            this.ipSetId = model.ipSetId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The region ID of the GA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ips-bp11r5jb8ogp122xl****</p>
         */
        public Builder ipSetId(String ipSetId) {
            this.ipSetId = ipSetId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateBasicIpSetResponseBody build() {
            return new CreateBasicIpSetResponseBody(this);
        } 

    } 

}
