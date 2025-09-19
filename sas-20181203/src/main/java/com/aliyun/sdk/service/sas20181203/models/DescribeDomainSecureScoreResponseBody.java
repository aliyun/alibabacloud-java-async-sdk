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
 * {@link DescribeDomainSecureScoreResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainSecureScoreResponseBody</p>
 */
public class DescribeDomainSecureScoreResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityScore")
    private Integer securityScore;

    private DescribeDomainSecureScoreResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.securityScore = builder.securityScore;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainSecureScoreResponseBody create() {
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
     * @return securityScore
     */
    public Integer getSecurityScore() {
        return this.securityScore;
    }

    public static final class Builder {
        private String requestId; 
        private Integer securityScore; 

        private Builder() {
        } 

        private Builder(DescribeDomainSecureScoreResponseBody model) {
            this.requestId = model.requestId;
            this.securityScore = model.securityScore;
        } 

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>11C96623-E106-59C9-866D-A6C82911****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The security score of the website.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder securityScore(Integer securityScore) {
            this.securityScore = securityScore;
            return this;
        }

        public DescribeDomainSecureScoreResponseBody build() {
            return new DescribeDomainSecureScoreResponseBody(this);
        } 

    } 

}
