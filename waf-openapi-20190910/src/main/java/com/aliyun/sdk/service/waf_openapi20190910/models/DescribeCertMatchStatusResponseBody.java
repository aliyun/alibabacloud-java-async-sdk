// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCertMatchStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCertMatchStatusResponseBody</p>
 */
public class DescribeCertMatchStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MatchStatus")
    private Boolean matchStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCertMatchStatusResponseBody(Builder builder) {
        this.matchStatus = builder.matchStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCertMatchStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return matchStatus
     */
    public Boolean getMatchStatus() {
        return this.matchStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean matchStatus; 
        private String requestId; 

        /**
         * MatchStatus.
         */
        public Builder matchStatus(Boolean matchStatus) {
            this.matchStatus = matchStatus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCertMatchStatusResponseBody build() {
            return new DescribeCertMatchStatusResponseBody(this);
        } 

    } 

}
