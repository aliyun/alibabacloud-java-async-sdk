// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEmgUserAgreementResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEmgUserAgreementResponseBody</p>
 */
public class DescribeEmgUserAgreementResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Auth")
    private Boolean auth;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeEmgUserAgreementResponseBody(Builder builder) {
        this.auth = builder.auth;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEmgUserAgreementResponseBody create() {
        return builder().build();
    }

    /**
     * @return auth
     */
    public Boolean getAuth() {
        return this.auth;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean auth; 
        private String requestId; 

        /**
         * Indicates whether Security Center is authorized to scan for urgent vulnerabilities. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no
         */
        public Builder auth(Boolean auth) {
            this.auth = auth;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEmgUserAgreementResponseBody build() {
            return new DescribeEmgUserAgreementResponseBody(this);
        } 

    } 

}
