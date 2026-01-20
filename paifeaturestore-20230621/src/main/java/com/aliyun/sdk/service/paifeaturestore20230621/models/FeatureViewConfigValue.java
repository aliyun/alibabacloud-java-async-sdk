// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

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
 * {@link FeatureViewConfigValue} extends {@link TeaModel}
 *
 * <p>FeatureViewConfigValue</p>
 */
public class FeatureViewConfigValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Partitions")
    private java.util.Map<String, FeatureViewConfigValuePartitionsValue> partitions;

    @com.aliyun.core.annotation.NameInMap("EventTime")
    private String eventTime;

    @com.aliyun.core.annotation.NameInMap("Equal")
    private Boolean equal;

    @com.aliyun.core.annotation.NameInMap("UseMock")
    private Boolean useMock;

    @com.aliyun.core.annotation.NameInMap("Snapshot")
    private Snapshot snapshot;

    private FeatureViewConfigValue(Builder builder) {
        this.partitions = builder.partitions;
        this.eventTime = builder.eventTime;
        this.equal = builder.equal;
        this.useMock = builder.useMock;
        this.snapshot = builder.snapshot;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FeatureViewConfigValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return partitions
     */
    public java.util.Map<String, FeatureViewConfigValuePartitionsValue> getPartitions() {
        return this.partitions;
    }

    /**
     * @return eventTime
     */
    public String getEventTime() {
        return this.eventTime;
    }

    /**
     * @return equal
     */
    public Boolean getEqual() {
        return this.equal;
    }

    /**
     * @return useMock
     */
    public Boolean getUseMock() {
        return this.useMock;
    }

    /**
     * @return snapshot
     */
    public Snapshot getSnapshot() {
        return this.snapshot;
    }

    public static final class Builder {
        private java.util.Map<String, FeatureViewConfigValuePartitionsValue> partitions; 
        private String eventTime; 
        private Boolean equal; 
        private Boolean useMock; 
        private Snapshot snapshot; 

        private Builder() {
        } 

        private Builder(FeatureViewConfigValue model) {
            this.partitions = model.partitions;
            this.eventTime = model.eventTime;
            this.equal = model.equal;
            this.useMock = model.useMock;
            this.snapshot = model.snapshot;
        } 

        /**
         * Partitions.
         */
        public Builder partitions(java.util.Map<String, FeatureViewConfigValuePartitionsValue> partitions) {
            this.partitions = partitions;
            return this;
        }

        /**
         * EventTime.
         */
        public Builder eventTime(String eventTime) {
            this.eventTime = eventTime;
            return this;
        }

        /**
         * Equal.
         */
        public Builder equal(Boolean equal) {
            this.equal = equal;
            return this;
        }

        /**
         * UseMock.
         */
        public Builder useMock(Boolean useMock) {
            this.useMock = useMock;
            return this;
        }

        /**
         * Snapshot.
         */
        public Builder snapshot(Snapshot snapshot) {
            this.snapshot = snapshot;
            return this;
        }

        public FeatureViewConfigValue build() {
            return new FeatureViewConfigValue(this);
        } 

    } 

    /**
     * 
     * {@link FeatureViewConfigValue} extends {@link TeaModel}
     *
     * <p>FeatureViewConfigValue</p>
     */
    public static class Snapshot extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Partitions")
        private java.util.Map<String, FeatureViewConfigValueSnapshotPartitionsValue> partitions;

        @com.aliyun.core.annotation.NameInMap("Table")
        private String table;

        private Snapshot(Builder builder) {
            this.partitions = builder.partitions;
            this.table = builder.table;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Snapshot create() {
            return builder().build();
        }

        /**
         * @return partitions
         */
        public java.util.Map<String, FeatureViewConfigValueSnapshotPartitionsValue> getPartitions() {
            return this.partitions;
        }

        /**
         * @return table
         */
        public String getTable() {
            return this.table;
        }

        public static final class Builder {
            private java.util.Map<String, FeatureViewConfigValueSnapshotPartitionsValue> partitions; 
            private String table; 

            private Builder() {
            } 

            private Builder(Snapshot model) {
                this.partitions = model.partitions;
                this.table = model.table;
            } 

            /**
             * Partitions.
             */
            public Builder partitions(java.util.Map<String, FeatureViewConfigValueSnapshotPartitionsValue> partitions) {
                this.partitions = partitions;
                return this;
            }

            /**
             * Table.
             */
            public Builder table(String table) {
                this.table = table;
                return this;
            }

            public Snapshot build() {
                return new Snapshot(this);
            } 

        } 

    }
}
