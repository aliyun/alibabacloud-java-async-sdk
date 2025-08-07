// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link ListSnapshotsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSnapshotsResponseBody</p>
 */
public class ListSnapshotsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("nextPageToken")
    private String nextPageToken;

    @com.aliyun.core.annotation.NameInMap("snapshots")
    private java.util.List<Snapshot> snapshots;

    private ListSnapshotsResponseBody(Builder builder) {
        this.nextPageToken = builder.nextPageToken;
        this.snapshots = builder.snapshots;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSnapshotsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nextPageToken
     */
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * @return snapshots
     */
    public java.util.List<Snapshot> getSnapshots() {
        return this.snapshots;
    }

    public static final class Builder {
        private String nextPageToken; 
        private java.util.List<Snapshot> snapshots; 

        private Builder() {
        } 

        private Builder(ListSnapshotsResponseBody model) {
            this.nextPageToken = model.nextPageToken;
            this.snapshots = model.snapshots;
        } 

        /**
         * nextPageToken.
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * snapshots.
         */
        public Builder snapshots(java.util.List<Snapshot> snapshots) {
            this.snapshots = snapshots;
            return this;
        }

        public ListSnapshotsResponseBody build() {
            return new ListSnapshotsResponseBody(this);
        } 

    } 

}
