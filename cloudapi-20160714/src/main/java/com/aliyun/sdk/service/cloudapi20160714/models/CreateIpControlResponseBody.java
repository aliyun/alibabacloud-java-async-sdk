// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIpControlResponseBody} extends {@link TeaModel}
 *
 * <p>CreateIpControlResponseBody</p>
 */
public class CreateIpControlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IpControlId")
    private String ipControlId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateIpControlResponseBody(Builder builder) {
        this.ipControlId = builder.ipControlId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIpControlResponseBody create() {
        return builder().build();
    }

    /**
     * @return ipControlId
     */
    public String getIpControlId() {
        return this.ipControlId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String ipControlId; 
        private String requestId; 

        /**
         * The ID of the ACL.
         */
        public Builder ipControlId(String ipControlId) {
            this.ipControlId = ipControlId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateIpControlResponseBody build() {
            return new CreateIpControlResponseBody(this);
        } 

    } 

}
