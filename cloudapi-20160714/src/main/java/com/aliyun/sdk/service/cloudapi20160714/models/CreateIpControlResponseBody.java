// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateIpControlResponseBody model) {
            this.ipControlId = model.ipControlId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the ACL.</p>
         * 
         * <strong>example:</strong>
         * <p>7ea91319a34d48a09b5c9c871d9768b1</p>
         */
        public Builder ipControlId(String ipControlId) {
            this.ipControlId = ipControlId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CE5722A6-AE78-4741-A9B0-6C817D360510</p>
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
