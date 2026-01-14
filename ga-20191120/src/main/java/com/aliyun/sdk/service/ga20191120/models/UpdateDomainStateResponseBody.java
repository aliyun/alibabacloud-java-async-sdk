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
 * {@link UpdateDomainStateResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateDomainStateResponseBody</p>
 */
public class UpdateDomainStateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    private UpdateDomainStateResponseBody(Builder builder) {
        this.domain = builder.domain;
        this.requestId = builder.requestId;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDomainStateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder {
        private String domain; 
        private String requestId; 
        private String state; 

        private Builder() {
        } 

        private Builder(UpdateDomainStateResponseBody model) {
            this.domain = model.domain;
            this.requestId = model.requestId;
            this.state = model.state;
        } 

        /**
         * <p>The accelerated domain name.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        public Builder domain(String domain) {
            this.domain = domain;
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

        /**
         * <p>The ICP filing status of the accelerated domain name. Valid values:</p>
         * <ul>
         * <li><strong>illegal:</strong> The domain name is illegal.</li>
         * <li><strong>inactive:</strong> The domain name has not completed ICP filing.</li>
         * <li><strong>active:</strong> The domain name has a valid ICP number.</li>
         * <li><strong>unknown:</strong> The ICP filing status is unknown.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public UpdateDomainStateResponseBody build() {
            return new UpdateDomainStateResponseBody(this);
        } 

    } 

}
