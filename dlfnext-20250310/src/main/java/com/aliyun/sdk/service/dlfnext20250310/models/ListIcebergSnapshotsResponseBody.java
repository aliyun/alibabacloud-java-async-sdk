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
 * {@link ListIcebergSnapshotsResponseBody} extends {@link TeaModel}
 *
 * <p>ListIcebergSnapshotsResponseBody</p>
 */
public class ListIcebergSnapshotsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("nextPageToken")
    private String nextPageToken;

    @com.aliyun.core.annotation.NameInMap("snapshots")
    private java.util.List<IcebergSnapshot> snapshots;

    private ListIcebergSnapshotsResponseBody(Builder builder) {
        this.nextPageToken = builder.nextPageToken;
        this.snapshots = builder.snapshots;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIcebergSnapshotsResponseBody create() {
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
    public java.util.List<IcebergSnapshot> getSnapshots() {
        return this.snapshots;
    }

    public static final class Builder {
        private String nextPageToken; 
        private java.util.List<IcebergSnapshot> snapshots; 

        private Builder() {
        } 

        private Builder(ListIcebergSnapshotsResponseBody model) {
            this.nextPageToken = model.nextPageToken;
            this.snapshots = model.snapshots;
        } 

        /**
         * <p>The pagination token for the next page of results. If this parameter is null, all results have been returned.</p>
         * 
         * <strong>example:</strong>
         * <p>E8ABEB1C3DB893D16576269017992F57</p>
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * <p>The list of snapshots.</p>
         */
        public Builder snapshots(java.util.List<IcebergSnapshot> snapshots) {
            this.snapshots = snapshots;
            return this;
        }

        public ListIcebergSnapshotsResponseBody build() {
            return new ListIcebergSnapshotsResponseBody(this);
        } 

    } 

}
