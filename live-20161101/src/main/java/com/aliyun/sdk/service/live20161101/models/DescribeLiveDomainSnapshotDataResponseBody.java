// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveDomainSnapshotDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveDomainSnapshotDataResponseBody</p>
 */
public class DescribeLiveDomainSnapshotDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SnapshotDataInfos")
    private SnapshotDataInfos snapshotDataInfos;

    private DescribeLiveDomainSnapshotDataResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.snapshotDataInfos = builder.snapshotDataInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveDomainSnapshotDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return snapshotDataInfos
     */
    public SnapshotDataInfos getSnapshotDataInfos() {
        return this.snapshotDataInfos;
    }

    public static final class Builder {
        private String requestId; 
        private SnapshotDataInfos snapshotDataInfos; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SnapshotDataInfos.
         */
        public Builder snapshotDataInfos(SnapshotDataInfos snapshotDataInfos) {
            this.snapshotDataInfos = snapshotDataInfos;
            return this;
        }

        public DescribeLiveDomainSnapshotDataResponseBody build() {
            return new DescribeLiveDomainSnapshotDataResponseBody(this);
        } 

    } 

    public static class SnapshotDataInfo extends TeaModel {
        @NameInMap("Date")
        private String date;

        @NameInMap("Total")
        private Integer total;

        private SnapshotDataInfo(Builder builder) {
            this.date = builder.date;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SnapshotDataInfo create() {
            return builder().build();
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private String date; 
            private Integer total; 

            /**
             * Date.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public SnapshotDataInfo build() {
                return new SnapshotDataInfo(this);
            } 

        } 

    }
    public static class SnapshotDataInfos extends TeaModel {
        @NameInMap("SnapshotDataInfo")
        private java.util.List < SnapshotDataInfo> snapshotDataInfo;

        private SnapshotDataInfos(Builder builder) {
            this.snapshotDataInfo = builder.snapshotDataInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SnapshotDataInfos create() {
            return builder().build();
        }

        /**
         * @return snapshotDataInfo
         */
        public java.util.List < SnapshotDataInfo> getSnapshotDataInfo() {
            return this.snapshotDataInfo;
        }

        public static final class Builder {
            private java.util.List < SnapshotDataInfo> snapshotDataInfo; 

            /**
             * SnapshotDataInfo.
             */
            public Builder snapshotDataInfo(java.util.List < SnapshotDataInfo> snapshotDataInfo) {
                this.snapshotDataInfo = snapshotDataInfo;
                return this;
            }

            public SnapshotDataInfos build() {
                return new SnapshotDataInfos(this);
            } 

        } 

    }
}
