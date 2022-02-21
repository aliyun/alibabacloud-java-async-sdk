// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveDomainTrancodeDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveDomainTrancodeDataResponseBody</p>
 */
public class DescribeLiveDomainTrancodeDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TrancodeDataInfos")
    private TrancodeDataInfos trancodeDataInfos;

    private DescribeLiveDomainTrancodeDataResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.trancodeDataInfos = builder.trancodeDataInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveDomainTrancodeDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return trancodeDataInfos
     */
    public TrancodeDataInfos getTrancodeDataInfos() {
        return this.trancodeDataInfos;
    }

    public static final class Builder {
        private String requestId; 
        private TrancodeDataInfos trancodeDataInfos; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TrancodeDataInfos.
         */
        public Builder trancodeDataInfos(TrancodeDataInfos trancodeDataInfos) {
            this.trancodeDataInfos = trancodeDataInfos;
            return this;
        }

        public DescribeLiveDomainTrancodeDataResponseBody build() {
            return new DescribeLiveDomainTrancodeDataResponseBody(this);
        } 

    } 

    public static class TrancodeDataInfo extends TeaModel {
        @NameInMap("Date")
        private String date;

        @NameInMap("Detail")
        private String detail;

        @NameInMap("Total")
        private Integer total;

        private TrancodeDataInfo(Builder builder) {
            this.date = builder.date;
            this.detail = builder.detail;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrancodeDataInfo create() {
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

            public TrancodeDataInfo build() {
                return new TrancodeDataInfo(this);
            } 

        } 

    }
    public static class TrancodeDataInfos extends TeaModel {
        @NameInMap("TrancodeDataInfo")
        private java.util.List < TrancodeDataInfo> trancodeDataInfo;

        private TrancodeDataInfos(Builder builder) {
            this.trancodeDataInfo = builder.trancodeDataInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrancodeDataInfos create() {
            return builder().build();
        }

        /**
         * @return trancodeDataInfo
         */
        public java.util.List < TrancodeDataInfo> getTrancodeDataInfo() {
            return this.trancodeDataInfo;
        }

        public static final class Builder {
            private java.util.List < TrancodeDataInfo> trancodeDataInfo; 

            /**
             * TrancodeDataInfo.
             */
            public Builder trancodeDataInfo(java.util.List < TrancodeDataInfo> trancodeDataInfo) {
                this.trancodeDataInfo = trancodeDataInfo;
                return this;
            }

            public TrancodeDataInfos build() {
                return new TrancodeDataInfos(this);
            } 

        } 

    }
}
