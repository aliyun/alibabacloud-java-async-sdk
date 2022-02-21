// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveStreamTranscodeStreamNumResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamTranscodeStreamNumResponseBody</p>
 */
public class DescribeLiveStreamTranscodeStreamNumResponseBody extends TeaModel {
    @NameInMap("LazyTranscodedNumber")
    private Long lazyTranscodedNumber;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Long total;

    @NameInMap("TranscodedNumber")
    private Long transcodedNumber;

    @NameInMap("UntranscodeNumber")
    private Long untranscodeNumber;

    private DescribeLiveStreamTranscodeStreamNumResponseBody(Builder builder) {
        this.lazyTranscodedNumber = builder.lazyTranscodedNumber;
        this.requestId = builder.requestId;
        this.total = builder.total;
        this.transcodedNumber = builder.transcodedNumber;
        this.untranscodeNumber = builder.untranscodeNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamTranscodeStreamNumResponseBody create() {
        return builder().build();
    }

    /**
     * @return lazyTranscodedNumber
     */
    public Long getLazyTranscodedNumber() {
        return this.lazyTranscodedNumber;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    /**
     * @return transcodedNumber
     */
    public Long getTranscodedNumber() {
        return this.transcodedNumber;
    }

    /**
     * @return untranscodeNumber
     */
    public Long getUntranscodeNumber() {
        return this.untranscodeNumber;
    }

    public static final class Builder {
        private Long lazyTranscodedNumber; 
        private String requestId; 
        private Long total; 
        private Long transcodedNumber; 
        private Long untranscodeNumber; 

        /**
         * LazyTranscodedNumber.
         */
        public Builder lazyTranscodedNumber(Long lazyTranscodedNumber) {
            this.lazyTranscodedNumber = lazyTranscodedNumber;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        /**
         * TranscodedNumber.
         */
        public Builder transcodedNumber(Long transcodedNumber) {
            this.transcodedNumber = transcodedNumber;
            return this;
        }

        /**
         * UntranscodeNumber.
         */
        public Builder untranscodeNumber(Long untranscodeNumber) {
            this.untranscodeNumber = untranscodeNumber;
            return this;
        }

        public DescribeLiveStreamTranscodeStreamNumResponseBody build() {
            return new DescribeLiveStreamTranscodeStreamNumResponseBody(this);
        } 

    } 

}
