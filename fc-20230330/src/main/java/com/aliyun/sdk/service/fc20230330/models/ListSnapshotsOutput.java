// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link ListSnapshotsOutput} extends {@link TeaModel}
 *
 * <p>ListSnapshotsOutput</p>
 */
public class ListSnapshotsOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("nextToken")
    @com.aliyun.core.annotation.Validation(maxLength = 8192)
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("snapshots")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Snapshot> snapshots;

    private ListSnapshotsOutput(Builder builder) {
        this.nextToken = builder.nextToken;
        this.snapshots = builder.snapshots;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSnapshotsOutput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return snapshots
     */
    public java.util.List<Snapshot> getSnapshots() {
        return this.snapshots;
    }

    public static final class Builder {
        private String nextToken; 
        private java.util.List<Snapshot> snapshots; 

        private Builder() {
        } 

        private Builder(ListSnapshotsOutput model) {
            this.nextToken = model.nextToken;
            this.snapshots = model.snapshots;
        } 

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder snapshots(java.util.List<Snapshot> snapshots) {
            this.snapshots = snapshots;
            return this;
        }

        public ListSnapshotsOutput build() {
            return new ListSnapshotsOutput(this);
        } 

    } 

}
