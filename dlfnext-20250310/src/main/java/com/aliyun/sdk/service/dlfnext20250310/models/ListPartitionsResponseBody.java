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
 * {@link ListPartitionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPartitionsResponseBody</p>
 */
public class ListPartitionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("nextPageToken")
    private String nextPageToken;

    @com.aliyun.core.annotation.NameInMap("partitions")
    private java.util.List<Partition> partitions;

    private ListPartitionsResponseBody(Builder builder) {
        this.nextPageToken = builder.nextPageToken;
        this.partitions = builder.partitions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPartitionsResponseBody create() {
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
    public java.util.List<Partition> getPartitions() {
        return this.partitions;
    }

    public static final class Builder {
        private String nextPageToken; 
        private java.util.List<Partition> partitions; 

        private Builder() {
        } 

        private Builder(ListPartitionsResponseBody model) {
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
         * partitions.
         */
        public Builder partitions(java.util.List<Partition> partitions) {
            this.partitions = partitions;
            return this;
        }

        public ListPartitionsResponseBody build() {
            return new ListPartitionsResponseBody(this);
        } 

    } 

}
