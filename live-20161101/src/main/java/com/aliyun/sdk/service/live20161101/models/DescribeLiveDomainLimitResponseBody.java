// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveDomainLimitResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveDomainLimitResponseBody</p>
 */
public class DescribeLiveDomainLimitResponseBody extends TeaModel {
    @NameInMap("LiveDomainLimitList")
    private LiveDomainLimitList liveDomainLimitList;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeLiveDomainLimitResponseBody(Builder builder) {
        this.liveDomainLimitList = builder.liveDomainLimitList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveDomainLimitResponseBody create() {
        return builder().build();
    }

    /**
     * @return liveDomainLimitList
     */
    public LiveDomainLimitList getLiveDomainLimitList() {
        return this.liveDomainLimitList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LiveDomainLimitList liveDomainLimitList; 
        private String requestId; 

        /**
         * LiveDomainLimitList.
         */
        public Builder liveDomainLimitList(LiveDomainLimitList liveDomainLimitList) {
            this.liveDomainLimitList = liveDomainLimitList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveDomainLimitResponseBody build() {
            return new DescribeLiveDomainLimitResponseBody(this);
        } 

    } 

    public static class LiveDomainLimit extends TeaModel {
        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("LimitNum")
        private Integer limitNum;

        @NameInMap("LimitTranscodeNum")
        private Integer limitTranscodeNum;

        private LiveDomainLimit(Builder builder) {
            this.domainName = builder.domainName;
            this.limitNum = builder.limitNum;
            this.limitTranscodeNum = builder.limitTranscodeNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveDomainLimit create() {
            return builder().build();
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return limitNum
         */
        public Integer getLimitNum() {
            return this.limitNum;
        }

        /**
         * @return limitTranscodeNum
         */
        public Integer getLimitTranscodeNum() {
            return this.limitTranscodeNum;
        }

        public static final class Builder {
            private String domainName; 
            private Integer limitNum; 
            private Integer limitTranscodeNum; 

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * LimitNum.
             */
            public Builder limitNum(Integer limitNum) {
                this.limitNum = limitNum;
                return this;
            }

            /**
             * LimitTranscodeNum.
             */
            public Builder limitTranscodeNum(Integer limitTranscodeNum) {
                this.limitTranscodeNum = limitTranscodeNum;
                return this;
            }

            public LiveDomainLimit build() {
                return new LiveDomainLimit(this);
            } 

        } 

    }
    public static class LiveDomainLimitList extends TeaModel {
        @NameInMap("LiveDomainLimit")
        private java.util.List < LiveDomainLimit> liveDomainLimit;

        private LiveDomainLimitList(Builder builder) {
            this.liveDomainLimit = builder.liveDomainLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveDomainLimitList create() {
            return builder().build();
        }

        /**
         * @return liveDomainLimit
         */
        public java.util.List < LiveDomainLimit> getLiveDomainLimit() {
            return this.liveDomainLimit;
        }

        public static final class Builder {
            private java.util.List < LiveDomainLimit> liveDomainLimit; 

            /**
             * LiveDomainLimit.
             */
            public Builder liveDomainLimit(java.util.List < LiveDomainLimit> liveDomainLimit) {
                this.liveDomainLimit = liveDomainLimit;
                return this;
            }

            public LiveDomainLimitList build() {
                return new LiveDomainLimitList(this);
            } 

        } 

    }
}
