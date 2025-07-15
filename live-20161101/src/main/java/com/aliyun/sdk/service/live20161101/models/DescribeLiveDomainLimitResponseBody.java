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
 * {@link DescribeLiveDomainLimitResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveDomainLimitResponseBody</p>
 */
public class DescribeLiveDomainLimitResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LiveDomainLimitList")
    private LiveDomainLimitList liveDomainLimitList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeLiveDomainLimitResponseBody model) {
            this.liveDomainLimitList = model.liveDomainLimitList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The limits.</p>
         */
        public Builder liveDomainLimitList(LiveDomainLimitList liveDomainLimitList) {
            this.liveDomainLimitList = liveDomainLimitList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A3136B58-5876-4168-83CA-B562781981A0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveDomainLimitResponseBody build() {
            return new DescribeLiveDomainLimitResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveDomainLimitResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDomainLimitResponseBody</p>
     */
    public static class LiveDomainLimit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentNum")
        private Integer currentNum;

        @com.aliyun.core.annotation.NameInMap("CurrentTranscodeNum")
        private Integer currentTranscodeNum;

        @com.aliyun.core.annotation.NameInMap("CurrentTransferNum")
        private Integer currentTransferNum;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("LimitNum")
        private Integer limitNum;

        @com.aliyun.core.annotation.NameInMap("LimitTranscodeNum")
        private Integer limitTranscodeNum;

        @com.aliyun.core.annotation.NameInMap("LimitTransferNum")
        private Integer limitTransferNum;

        private LiveDomainLimit(Builder builder) {
            this.currentNum = builder.currentNum;
            this.currentTranscodeNum = builder.currentTranscodeNum;
            this.currentTransferNum = builder.currentTransferNum;
            this.domainName = builder.domainName;
            this.limitNum = builder.limitNum;
            this.limitTranscodeNum = builder.limitTranscodeNum;
            this.limitTransferNum = builder.limitTransferNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveDomainLimit create() {
            return builder().build();
        }

        /**
         * @return currentNum
         */
        public Integer getCurrentNum() {
            return this.currentNum;
        }

        /**
         * @return currentTranscodeNum
         */
        public Integer getCurrentTranscodeNum() {
            return this.currentTranscodeNum;
        }

        /**
         * @return currentTransferNum
         */
        public Integer getCurrentTransferNum() {
            return this.currentTransferNum;
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

        /**
         * @return limitTransferNum
         */
        public Integer getLimitTransferNum() {
            return this.limitTransferNum;
        }

        public static final class Builder {
            private Integer currentNum; 
            private Integer currentTranscodeNum; 
            private Integer currentTransferNum; 
            private String domainName; 
            private Integer limitNum; 
            private Integer limitTranscodeNum; 
            private Integer limitTransferNum; 

            private Builder() {
            } 

            private Builder(LiveDomainLimit model) {
                this.currentNum = model.currentNum;
                this.currentTranscodeNum = model.currentTranscodeNum;
                this.currentTransferNum = model.currentTransferNum;
                this.domainName = model.domainName;
                this.limitNum = model.limitNum;
                this.limitTranscodeNum = model.limitTranscodeNum;
                this.limitTransferNum = model.limitTransferNum;
            } 

            /**
             * <p>The current number of ingested streams.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder currentNum(Integer currentNum) {
                this.currentNum = currentNum;
                return this;
            }

            /**
             * <p>The current number of transcoded streams.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder currentTranscodeNum(Integer currentTranscodeNum) {
                this.currentTranscodeNum = currentTranscodeNum;
                return this;
            }

            /**
             * <p>The current number of streams relayed from the live center.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder currentTransferNum(Integer currentTransferNum) {
                this.currentTransferNum = currentTransferNum;
                return this;
            }

            /**
             * <p>The name of the queried main streaming domain.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The maximum number of ingested streams.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder limitNum(Integer limitNum) {
                this.limitNum = limitNum;
                return this;
            }

            /**
             * <p>The maximum number of transcoded streams.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder limitTranscodeNum(Integer limitTranscodeNum) {
                this.limitTranscodeNum = limitTranscodeNum;
                return this;
            }

            /**
             * <p>The maximum allowed number of streams relayed from the live center.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder limitTransferNum(Integer limitTransferNum) {
                this.limitTransferNum = limitTransferNum;
                return this;
            }

            public LiveDomainLimit build() {
                return new LiveDomainLimit(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveDomainLimitResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDomainLimitResponseBody</p>
     */
    public static class LiveDomainLimitList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LiveDomainLimit")
        private java.util.List<LiveDomainLimit> liveDomainLimit;

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
        public java.util.List<LiveDomainLimit> getLiveDomainLimit() {
            return this.liveDomainLimit;
        }

        public static final class Builder {
            private java.util.List<LiveDomainLimit> liveDomainLimit; 

            private Builder() {
            } 

            private Builder(LiveDomainLimitList model) {
                this.liveDomainLimit = model.liveDomainLimit;
            } 

            /**
             * LiveDomainLimit.
             */
            public Builder liveDomainLimit(java.util.List<LiveDomainLimit> liveDomainLimit) {
                this.liveDomainLimit = liveDomainLimit;
                return this;
            }

            public LiveDomainLimitList build() {
                return new LiveDomainLimitList(this);
            } 

        } 

    }
}
