// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveDomainRecordDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveDomainRecordDataResponseBody</p>
 */
public class DescribeLiveDomainRecordDataResponseBody extends TeaModel {
    @NameInMap("RecordDataInfos")
    private RecordDataInfos recordDataInfos;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeLiveDomainRecordDataResponseBody(Builder builder) {
        this.recordDataInfos = builder.recordDataInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveDomainRecordDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return recordDataInfos
     */
    public RecordDataInfos getRecordDataInfos() {
        return this.recordDataInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private RecordDataInfos recordDataInfos; 
        private String requestId; 

        /**
         * RecordDataInfos.
         */
        public Builder recordDataInfos(RecordDataInfos recordDataInfos) {
            this.recordDataInfos = recordDataInfos;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveDomainRecordDataResponseBody build() {
            return new DescribeLiveDomainRecordDataResponseBody(this);
        } 

    } 

    public static class Detail extends TeaModel {
        @NameInMap("FLV")
        private Integer FLV;

        @NameInMap("MP4")
        private Integer mP4;

        @NameInMap("TS")
        private Integer ts;

        private Detail(Builder builder) {
            this.FLV = builder.FLV;
            this.mP4 = builder.mP4;
            this.ts = builder.ts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Detail create() {
            return builder().build();
        }

        /**
         * @return FLV
         */
        public Integer getFLV() {
            return this.FLV;
        }

        /**
         * @return mP4
         */
        public Integer getMP4() {
            return this.mP4;
        }

        /**
         * @return ts
         */
        public Integer getTs() {
            return this.ts;
        }

        public static final class Builder {
            private Integer FLV; 
            private Integer mP4; 
            private Integer ts; 

            /**
             * FLV.
             */
            public Builder FLV(Integer FLV) {
                this.FLV = FLV;
                return this;
            }

            /**
             * MP4.
             */
            public Builder mP4(Integer mP4) {
                this.mP4 = mP4;
                return this;
            }

            /**
             * TS.
             */
            public Builder ts(Integer ts) {
                this.ts = ts;
                return this;
            }

            public Detail build() {
                return new Detail(this);
            } 

        } 

    }
    public static class RecordDataInfo extends TeaModel {
        @NameInMap("Date")
        private String date;

        @NameInMap("Detail")
        private Detail detail;

        @NameInMap("Total")
        private Integer total;

        private RecordDataInfo(Builder builder) {
            this.date = builder.date;
            this.detail = builder.detail;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordDataInfo create() {
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
        public Detail getDetail() {
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
            private Detail detail; 
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
            public Builder detail(Detail detail) {
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

            public RecordDataInfo build() {
                return new RecordDataInfo(this);
            } 

        } 

    }
    public static class RecordDataInfos extends TeaModel {
        @NameInMap("RecordDataInfo")
        private java.util.List < RecordDataInfo> recordDataInfo;

        private RecordDataInfos(Builder builder) {
            this.recordDataInfo = builder.recordDataInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordDataInfos create() {
            return builder().build();
        }

        /**
         * @return recordDataInfo
         */
        public java.util.List < RecordDataInfo> getRecordDataInfo() {
            return this.recordDataInfo;
        }

        public static final class Builder {
            private java.util.List < RecordDataInfo> recordDataInfo; 

            /**
             * RecordDataInfo.
             */
            public Builder recordDataInfo(java.util.List < RecordDataInfo> recordDataInfo) {
                this.recordDataInfo = recordDataInfo;
                return this;
            }

            public RecordDataInfos build() {
                return new RecordDataInfos(this);
            } 

        } 

    }
}
