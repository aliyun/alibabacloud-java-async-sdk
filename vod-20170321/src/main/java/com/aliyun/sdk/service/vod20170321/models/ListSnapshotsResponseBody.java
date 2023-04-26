// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSnapshotsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSnapshotsResponseBody</p>
 */
public class ListSnapshotsResponseBody extends TeaModel {
    @NameInMap("MediaSnapshot")
    private MediaSnapshot mediaSnapshot;

    @NameInMap("RequestId")
    private String requestId;

    private ListSnapshotsResponseBody(Builder builder) {
        this.mediaSnapshot = builder.mediaSnapshot;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSnapshotsResponseBody create() {
        return builder().build();
    }

    /**
     * @return mediaSnapshot
     */
    public MediaSnapshot getMediaSnapshot() {
        return this.mediaSnapshot;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MediaSnapshot mediaSnapshot; 
        private String requestId; 

        /**
         * The URL of the snapshot.
         */
        public Builder mediaSnapshot(MediaSnapshot mediaSnapshot) {
            this.mediaSnapshot = mediaSnapshot;
            return this;
        }

        /**
         * The snapshot data of the media.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListSnapshotsResponseBody build() {
            return new ListSnapshotsResponseBody(this);
        } 

    } 

    public static class Snapshot extends TeaModel {
        @NameInMap("Index")
        private Long index;

        @NameInMap("Url")
        private String url;

        private Snapshot(Builder builder) {
            this.index = builder.index;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Snapshot create() {
            return builder().build();
        }

        /**
         * @return index
         */
        public Long getIndex() {
            return this.index;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private Long index; 
            private String url; 

            /**
             * Index.
             */
            public Builder index(Long index) {
                this.index = index;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Snapshot build() {
                return new Snapshot(this);
            } 

        } 

    }
    public static class Snapshots extends TeaModel {
        @NameInMap("Snapshot")
        private java.util.List < Snapshot> snapshot;

        private Snapshots(Builder builder) {
            this.snapshot = builder.snapshot;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Snapshots create() {
            return builder().build();
        }

        /**
         * @return snapshot
         */
        public java.util.List < Snapshot> getSnapshot() {
            return this.snapshot;
        }

        public static final class Builder {
            private java.util.List < Snapshot> snapshot; 

            /**
             * Snapshot.
             */
            public Builder snapshot(java.util.List < Snapshot> snapshot) {
                this.snapshot = snapshot;
                return this;
            }

            public Snapshots build() {
                return new Snapshots(this);
            } 

        } 

    }
    public static class MediaSnapshot extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("Regular")
        private String regular;

        @NameInMap("Snapshots")
        private Snapshots snapshots;

        @NameInMap("Total")
        private Long total;

        private MediaSnapshot(Builder builder) {
            this.creationTime = builder.creationTime;
            this.jobId = builder.jobId;
            this.regular = builder.regular;
            this.snapshots = builder.snapshots;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaSnapshot create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return regular
         */
        public String getRegular() {
            return this.regular;
        }

        /**
         * @return snapshots
         */
        public Snapshots getSnapshots() {
            return this.snapshots;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private String creationTime; 
            private String jobId; 
            private String regular; 
            private Snapshots snapshots; 
            private Long total; 

            /**
             * The ID of the snapshot job.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Queries the snapshots that are captured from the specified media.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * The ID of the request.
             */
            public Builder regular(String regular) {
                this.regular = regular;
                return this;
            }

            /**
             * Snapshots.
             */
            public Builder snapshots(Snapshots snapshots) {
                this.snapshots = snapshots;
                return this;
            }

            /**
             * The total number of snapshots.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public MediaSnapshot build() {
                return new MediaSnapshot(this);
            } 

        } 

    }
}
