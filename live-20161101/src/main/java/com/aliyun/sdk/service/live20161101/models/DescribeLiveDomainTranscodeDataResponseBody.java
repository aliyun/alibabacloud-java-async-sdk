// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveDomainTranscodeDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveDomainTranscodeDataResponseBody</p>
 */
public class DescribeLiveDomainTranscodeDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TranscodeDataInfos")
    private TranscodeDataInfos transcodeDataInfos;

    private DescribeLiveDomainTranscodeDataResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.transcodeDataInfos = builder.transcodeDataInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveDomainTranscodeDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return transcodeDataInfos
     */
    public TranscodeDataInfos getTranscodeDataInfos() {
        return this.transcodeDataInfos;
    }

    public static final class Builder {
        private String requestId; 
        private TranscodeDataInfos transcodeDataInfos; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TranscodeDataInfos.
         */
        public Builder transcodeDataInfos(TranscodeDataInfos transcodeDataInfos) {
            this.transcodeDataInfos = transcodeDataInfos;
            return this;
        }

        public DescribeLiveDomainTranscodeDataResponseBody build() {
            return new DescribeLiveDomainTranscodeDataResponseBody(this);
        } 

    } 

    public static class TranscodeDataInfo extends TeaModel {
        @NameInMap("Date")
        private String date;

        @NameInMap("Detail")
        private String detail;

        @NameInMap("Total")
        private Integer total;

        private TranscodeDataInfo(Builder builder) {
            this.date = builder.date;
            this.detail = builder.detail;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscodeDataInfo create() {
            return builder().build();
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private String date; 
            private String detail; 
            private Integer total; 

            /**
             * Date.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * Detail.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public TranscodeDataInfo build() {
                return new TranscodeDataInfo(this);
            } 

        } 

    }
    public static class TranscodeDataInfos extends TeaModel {
        @NameInMap("TranscodeDataInfo")
        private java.util.List < TranscodeDataInfo> transcodeDataInfo;

        private TranscodeDataInfos(Builder builder) {
            this.transcodeDataInfo = builder.transcodeDataInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TranscodeDataInfos create() {
            return builder().build();
        }

        /**
         * @return transcodeDataInfo
         */
        public java.util.List < TranscodeDataInfo> getTranscodeDataInfo() {
            return this.transcodeDataInfo;
        }

        public static final class Builder {
            private java.util.List < TranscodeDataInfo> transcodeDataInfo; 

            /**
             * TranscodeDataInfo.
             */
            public Builder transcodeDataInfo(java.util.List < TranscodeDataInfo> transcodeDataInfo) {
                this.transcodeDataInfo = transcodeDataInfo;
                return this;
            }

            public TranscodeDataInfos build() {
                return new TranscodeDataInfos(this);
            } 

        } 

    }
}
