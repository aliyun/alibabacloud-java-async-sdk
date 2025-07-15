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
 * {@link DescribeLiveDomainSnapshotDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveDomainSnapshotDataResponseBody</p>
 */
public class DescribeLiveDomainSnapshotDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SnapshotDataInfos")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeLiveDomainSnapshotDataResponseBody model) {
            this.requestId = model.requestId;
            this.snapshotDataInfos = model.snapshotDataInfos;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B955107D-E658-4E77-B913-E0AC3D31693F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The daily statistics on the number of snapshots.</p>
         */
        public Builder snapshotDataInfos(SnapshotDataInfos snapshotDataInfos) {
            this.snapshotDataInfos = snapshotDataInfos;
            return this;
        }

        public DescribeLiveDomainSnapshotDataResponseBody build() {
            return new DescribeLiveDomainSnapshotDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveDomainSnapshotDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDomainSnapshotDataResponseBody</p>
     */
    public static class SnapshotDataInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("Total")
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

            private Builder() {
            } 

            private Builder(SnapshotDataInfo model) {
                this.date = model.date;
                this.total = model.total;
            } 

            /**
             * <p>The date.</p>
             * 
             * <strong>example:</strong>
             * <p>20180209</p>
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * <p>The total number of snapshots that were captured on the day.</p>
             * 
             * <strong>example:</strong>
             * <p>110</p>
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
    /**
     * 
     * {@link DescribeLiveDomainSnapshotDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDomainSnapshotDataResponseBody</p>
     */
    public static class SnapshotDataInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SnapshotDataInfo")
        private java.util.List<SnapshotDataInfo> snapshotDataInfo;

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
        public java.util.List<SnapshotDataInfo> getSnapshotDataInfo() {
            return this.snapshotDataInfo;
        }

        public static final class Builder {
            private java.util.List<SnapshotDataInfo> snapshotDataInfo; 

            private Builder() {
            } 

            private Builder(SnapshotDataInfos model) {
                this.snapshotDataInfo = model.snapshotDataInfo;
            } 

            /**
             * SnapshotDataInfo.
             */
            public Builder snapshotDataInfo(java.util.List<SnapshotDataInfo> snapshotDataInfo) {
                this.snapshotDataInfo = snapshotDataInfo;
                return this;
            }

            public SnapshotDataInfos build() {
                return new SnapshotDataInfos(this);
            } 

        } 

    }
}
