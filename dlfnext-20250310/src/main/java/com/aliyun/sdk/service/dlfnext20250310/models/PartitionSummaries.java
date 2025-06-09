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
 * {@link PartitionSummaries} extends {@link TeaModel}
 *
 * <p>PartitionSummaries</p>
 */
public class PartitionSummaries extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("nextPageToken")
    private String nextPageToken;

    @com.aliyun.core.annotation.NameInMap("partitions")
    private java.util.List<PartitionSummary> partitions;

    private PartitionSummaries(Builder builder) {
        this.nextPageToken = builder.nextPageToken;
        this.partitions = builder.partitions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PartitionSummaries create() {
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
     * @return partitions
     */
    public java.util.List<PartitionSummary> getPartitions() {
        return this.partitions;
    }

    public static final class Builder {
        private String nextPageToken; 
        private java.util.List<PartitionSummary> partitions; 

        private Builder() {
        } 

        private Builder(PartitionSummaries model) {
            this.nextPageToken = model.nextPageToken;
            this.partitions = model.partitions;
        } 

        /**
         * nextPageToken.
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * <p>Current page of partition profiles</p>
         */
        public Builder partitions(java.util.List<PartitionSummary> partitions) {
            this.partitions = partitions;
            return this;
        }

        public PartitionSummaries build() {
            return new PartitionSummaries(this);
        } 

    } 

}
