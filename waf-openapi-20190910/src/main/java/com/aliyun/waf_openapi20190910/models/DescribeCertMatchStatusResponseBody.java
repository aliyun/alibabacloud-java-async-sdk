// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeCertMatchStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCertMatchStatusResponseBody</p>
 */
public class DescribeCertMatchStatusResponseBody extends TeaModel {
    @NameInMap("MatchStatus")
    private Boolean matchStatus;

    @NameInMap("RequestId")
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
         * <p>MatchStatus.</p>
         */
        public Builder matchStatus(Boolean matchStatus) {
            this.matchStatus = matchStatus;
            return this;
        }

        /**
         * <p>RequestId.</p>
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
