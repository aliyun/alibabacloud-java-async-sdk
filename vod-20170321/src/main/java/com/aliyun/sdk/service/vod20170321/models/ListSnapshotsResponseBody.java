// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListSnapshotsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSnapshotsResponseBody</p>
 */
public class ListSnapshotsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MediaSnapshot")
    private MediaSnapshot mediaSnapshot;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The information about the snapshot.</p>
         */
        public Builder mediaSnapshot(MediaSnapshot mediaSnapshot) {
            this.mediaSnapshot = mediaSnapshot;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4AF6-D7393642CA58****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListSnapshotsResponseBody build() {
            return new ListSnapshotsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSnapshotsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSnapshotsResponseBody</p>
     */
    public static class Snapshot extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Index")
        private Long index;

        @com.aliyun.core.annotation.NameInMap("Url")
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
             * <p>The index of the snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder index(Long index) {
                this.index = index;
                return this;
            }

            /**
             * <p>The URL of the snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example.aliyundoc.com/snapshot/sample00001****.jpg">http://example.aliyundoc.com/snapshot/sample00001****.jpg</a></p>
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
    /**
     * 
     * {@link ListSnapshotsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSnapshotsResponseBody</p>
     */
    public static class Snapshots extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Snapshot")
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
    /**
     * 
     * {@link ListSnapshotsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSnapshotsResponseBody</p>
     */
    public static class MediaSnapshot extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Regular")
        private String regular;

        @com.aliyun.core.annotation.NameInMap("Snapshots")
        private Snapshots snapshots;

        @com.aliyun.core.annotation.NameInMap("Total")
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
             * <p>The time when the snapshot job was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-12-20T12:23:45Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The ID of the snapshot job.</p>
             * 
             * <strong>example:</strong>
             * <p>ad90a501b1b9472374ad005046****</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The rule used to generate snapshot URLs.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example.aliyundoc.com/snapshot/sample%7BSnapshotCount%7D.jpg">http://example.aliyundoc.com/snapshot/sample{SnapshotCount}.jpg</a></p>
             */
            public Builder regular(String regular) {
                this.regular = regular;
                return this;
            }

            /**
             * <p>The details of the snapshot.</p>
             */
            public Builder snapshots(Snapshots snapshots) {
                this.snapshots = snapshots;
                return this;
            }

            /**
             * <p>The total number of snapshots.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
