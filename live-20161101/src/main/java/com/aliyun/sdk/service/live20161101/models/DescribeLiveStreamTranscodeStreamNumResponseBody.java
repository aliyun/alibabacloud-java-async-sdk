// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLiveStreamTranscodeStreamNumResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamTranscodeStreamNumResponseBody</p>
 */
public class DescribeLiveStreamTranscodeStreamNumResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LazyTranscodedNumber")
    private Long lazyTranscodedNumber;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    @com.aliyun.core.annotation.NameInMap("TranscodeStreamCountDetails")
    private java.util.List<TranscodeStreamCountDetails> transcodeStreamCountDetails;

    @com.aliyun.core.annotation.NameInMap("TranscodedNumber")
    private Long transcodedNumber;

    @com.aliyun.core.annotation.NameInMap("UntranscodeNumber")
    private Long untranscodeNumber;

    private DescribeLiveStreamTranscodeStreamNumResponseBody(Builder builder) {
        this.lazyTranscodedNumber = builder.lazyTranscodedNumber;
        this.requestId = builder.requestId;
        this.total = builder.total;
        this.transcodeStreamCountDetails = builder.transcodeStreamCountDetails;
        this.transcodedNumber = builder.transcodedNumber;
        this.untranscodeNumber = builder.untranscodeNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamTranscodeStreamNumResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return transcodeStreamCountDetails
     */
    public java.util.List<TranscodeStreamCountDetails> getTranscodeStreamCountDetails() {
        return this.transcodeStreamCountDetails;
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
        private java.util.List<TranscodeStreamCountDetails> transcodeStreamCountDetails; 
        private Long transcodedNumber; 
        private Long untranscodeNumber; 

        private Builder() {
        } 

        private Builder(DescribeLiveStreamTranscodeStreamNumResponseBody model) {
            this.lazyTranscodedNumber = model.lazyTranscodedNumber;
            this.requestId = model.requestId;
            this.total = model.total;
            this.transcodeStreamCountDetails = model.transcodeStreamCountDetails;
            this.transcodedNumber = model.transcodedNumber;
            this.untranscodeNumber = model.untranscodeNumber;
        } 

        /**
         * <p>The number of streams for which transcoding is triggered by stream pulling.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder lazyTranscodedNumber(Long lazyTranscodedNumber) {
            this.lazyTranscodedNumber = lazyTranscodedNumber;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>150191A4-DD88-5941-B48C-9DF59E0A8B1F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of streams.</p>
         * 
         * <strong>example:</strong>
         * <p>57</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        /**
         * <p>The details about the transcoding templates.</p>
         */
        public Builder transcodeStreamCountDetails(java.util.List<TranscodeStreamCountDetails> transcodeStreamCountDetails) {
            this.transcodeStreamCountDetails = transcodeStreamCountDetails;
            return this;
        }

        /**
         * <p>The number of streams that are transcoded.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder transcodedNumber(Long transcodedNumber) {
            this.transcodedNumber = transcodedNumber;
            return this;
        }

        /**
         * <p>The number of streams that are not transcoded.</p>
         * 
         * <strong>example:</strong>
         * <p>27</p>
         */
        public Builder untranscodeNumber(Long untranscodeNumber) {
            this.untranscodeNumber = untranscodeNumber;
            return this;
        }

        public DescribeLiveStreamTranscodeStreamNumResponseBody build() {
            return new DescribeLiveStreamTranscodeStreamNumResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveStreamTranscodeStreamNumResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamTranscodeStreamNumResponseBody</p>
     */
    public static class TranscodeStreamCountDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        private TranscodeStreamCountDetails(Builder builder) {
            this.count = builder.count;
            this.template = builder.template;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscodeStreamCountDetails create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        public static final class Builder {
            private Integer count; 
            private String template; 

            private Builder() {
            } 

            private Builder(TranscodeStreamCountDetails model) {
                this.count = model.count;
                this.template = model.template;
            } 

            /**
             * <p>The number of streams that use the transcoding template.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The name of the transcoding template.</p>
             * 
             * <strong>example:</strong>
             * <p>template_name</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            public TranscodeStreamCountDetails build() {
                return new TranscodeStreamCountDetails(this);
            } 

        } 

    }
}
