// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link DescribeMeterImsSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMeterImsSummaryResponseBody</p>
 */
public class DescribeMeterImsSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeMeterImsSummaryResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The usage statistics of IMS.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BEA98A0C-7870-15FE-B96F-8880BB600A2C</p>
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.editingDuration = model.editingDuration;
                this.liveEditDuration = model.liveEditDuration;
                this.liveRecordDuration = model.liveRecordDuration;
                this.liveSnapshotCount = model.liveSnapshotCount;
                this.liveTranscodeDuration = model.liveTranscodeDuration;
                this.mpsAiDuration = model.mpsAiDuration;
                this.mpsTranscodeDuration = model.mpsTranscodeDuration;
                this.mpsTranscodeUHDDuration = model.mpsTranscodeUHDDuration;
            } 

            /**
             * <p>The duration of video editing.</p>
             * 
             * <strong>example:</strong>
             * <p>8722</p>
             */
            public Builder editingDuration(String editingDuration) {
                this.editingDuration = editingDuration;
                return this;
            }

            /**
             * <p>The duration of live editing.</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder liveEditDuration(String liveEditDuration) {
                this.liveEditDuration = liveEditDuration;
                return this;
            }

            /**
             * <p>The duration of live stream recording.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder liveRecordDuration(String liveRecordDuration) {
                this.liveRecordDuration = liveRecordDuration;
                return this;
            }

            /**
             * <p>The number of live stream snapshots.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder liveSnapshotCount(String liveSnapshotCount) {
                this.liveSnapshotCount = liveSnapshotCount;
                return this;
            }

            /**
             * <p>The duration of live stream transcoding.</p>
             * 
             * <strong>example:</strong>
             * <p>12356</p>
             */
            public Builder liveTranscodeDuration(Long liveTranscodeDuration) {
                this.liveTranscodeDuration = liveTranscodeDuration;
                return this;
            }

            /**
             * <p>The duration of AI processing.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder mpsAiDuration(Long mpsAiDuration) {
                this.mpsAiDuration = mpsAiDuration;
                return this;
            }

            /**
             * <p>The duration of video-on-demand (VOD) transcoding.</p>
             * 
             * <strong>example:</strong>
             * <p>17337</p>
             */
            public Builder mpsTranscodeDuration(Long mpsTranscodeDuration) {
                this.mpsTranscodeDuration = mpsTranscodeDuration;
                return this;
            }

            /**
             * <p>The duration of audio and video enhancement.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
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
