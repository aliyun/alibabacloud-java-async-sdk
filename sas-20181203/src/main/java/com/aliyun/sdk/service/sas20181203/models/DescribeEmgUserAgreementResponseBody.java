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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeEmgUserAgreementResponseBody model) {
            this.auth = model.auth;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Indicates whether Security Center is authorized to scan for urgent vulnerabilities. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder auth(Boolean auth) {
            this.auth = auth;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>768BB9F5-8AF3-557F-A489-9BDD64CB3E4C</p>
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
