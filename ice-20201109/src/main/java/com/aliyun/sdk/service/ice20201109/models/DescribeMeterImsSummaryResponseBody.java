// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeMeterImsSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMeterImsSummaryResponseBody</p>
 */
public class DescribeMeterImsSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeMeterImsSummaryResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMeterImsSummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMeterImsSummaryResponseBody build() {
            return new DescribeMeterImsSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMeterImsSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMeterImsSummaryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EditingDuration")
        private String editingDuration;

        @com.aliyun.core.annotation.NameInMap("LiveEditDuration")
        private String liveEditDuration;

        @com.aliyun.core.annotation.NameInMap("LiveRecordDuration")
        private String liveRecordDuration;

        @com.aliyun.core.annotation.NameInMap("LiveSnapshotCount")
        private String liveSnapshotCount;

        @com.aliyun.core.annotation.NameInMap("LiveTranscodeDuration")
        private Long liveTranscodeDuration;

        @com.aliyun.core.annotation.NameInMap("MpsAiDuration")
        private Long mpsAiDuration;

        @com.aliyun.core.annotation.NameInMap("MpsTranscodeDuration")
        private Long mpsTranscodeDuration;

        @com.aliyun.core.annotation.NameInMap("MpsTranscodeUHDDuration")
        private Long mpsTranscodeUHDDuration;

        private Data(Builder builder) {
            this.editingDuration = builder.editingDuration;
            this.liveEditDuration = builder.liveEditDuration;
            this.liveRecordDuration = builder.liveRecordDuration;
            this.liveSnapshotCount = builder.liveSnapshotCount;
            this.liveTranscodeDuration = builder.liveTranscodeDuration;
            this.mpsAiDuration = builder.mpsAiDuration;
            this.mpsTranscodeDuration = builder.mpsTranscodeDuration;
            this.mpsTranscodeUHDDuration = builder.mpsTranscodeUHDDuration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return editingDuration
         */
        public String getEditingDuration() {
            return this.editingDuration;
        }

        /**
         * @return liveEditDuration
         */
        public String getLiveEditDuration() {
            return this.liveEditDuration;
        }

        /**
         * @return liveRecordDuration
         */
        public String getLiveRecordDuration() {
            return this.liveRecordDuration;
        }

        /**
         * @return liveSnapshotCount
         */
        public String getLiveSnapshotCount() {
            return this.liveSnapshotCount;
        }

        /**
         * @return liveTranscodeDuration
         */
        public Long getLiveTranscodeDuration() {
            return this.liveTranscodeDuration;
        }

        /**
         * @return mpsAiDuration
         */
        public Long getMpsAiDuration() {
            return this.mpsAiDuration;
        }

        /**
         * @return mpsTranscodeDuration
         */
        public Long getMpsTranscodeDuration() {
            return this.mpsTranscodeDuration;
        }

        /**
         * @return mpsTranscodeUHDDuration
         */
        public Long getMpsTranscodeUHDDuration() {
            return this.mpsTranscodeUHDDuration;
        }

        public static final class Builder {
            private String editingDuration; 
            private String liveEditDuration; 
            private String liveRecordDuration; 
            private String liveSnapshotCount; 
            private Long liveTranscodeDuration; 
            private Long mpsAiDuration; 
            private Long mpsTranscodeDuration; 
            private Long mpsTranscodeUHDDuration; 

            /**
             * EditingDuration.
             */
            public Builder editingDuration(String editingDuration) {
                this.editingDuration = editingDuration;
                return this;
            }

            /**
             * LiveEditDuration.
             */
            public Builder liveEditDuration(String liveEditDuration) {
                this.liveEditDuration = liveEditDuration;
                return this;
            }

            /**
             * LiveRecordDuration.
             */
            public Builder liveRecordDuration(String liveRecordDuration) {
                this.liveRecordDuration = liveRecordDuration;
                return this;
            }

            /**
             * LiveSnapshotCount.
             */
            public Builder liveSnapshotCount(String liveSnapshotCount) {
                this.liveSnapshotCount = liveSnapshotCount;
                return this;
            }

            /**
             * LiveTranscodeDuration.
             */
            public Builder liveTranscodeDuration(Long liveTranscodeDuration) {
                this.liveTranscodeDuration = liveTranscodeDuration;
                return this;
            }

            /**
             * MpsAiDuration.
             */
            public Builder mpsAiDuration(Long mpsAiDuration) {
                this.mpsAiDuration = mpsAiDuration;
                return this;
            }

            /**
             * MpsTranscodeDuration.
             */
            public Builder mpsTranscodeDuration(Long mpsTranscodeDuration) {
                this.mpsTranscodeDuration = mpsTranscodeDuration;
                return this;
            }

            /**
             * MpsTranscodeUHDDuration.
             */
            public Builder mpsTranscodeUHDDuration(Long mpsTranscodeUHDDuration) {
                this.mpsTranscodeUHDDuration = mpsTranscodeUHDDuration;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
