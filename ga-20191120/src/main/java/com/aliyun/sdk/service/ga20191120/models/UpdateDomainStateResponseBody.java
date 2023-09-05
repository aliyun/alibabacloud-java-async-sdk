// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDomainStateResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateDomainStateResponseBody</p>
 */
public class UpdateDomainStateResponseBody extends TeaModel {
    @NameInMap("Domain")
    private String domain;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("State")
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

        /**
         * The accelerated domain name.
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ICP filing status of the accelerated domain name. Valid values:
         * <p>
         * 
         * *   **illegal:** The domain name is illegal.
         * *   **inactive:** The domain name has not completed ICP filing.
         * *   **active:** The domain name has a valid ICP number.
         * *   **unknown:** The ICP filing status is unknown.
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
