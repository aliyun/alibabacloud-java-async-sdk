// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeGlobalDataNetworkListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGlobalDataNetworkListResponseBody</p>
 */
public class DescribeGlobalDataNetworkListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private String pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private String totalRecordCount;

    private DescribeGlobalDataNetworkListResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGlobalDataNetworkListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public String getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public String getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private Items items; 
        private String pageNumber; 
        private String pageRecordCount; 
        private String requestId; 
        private String totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeGlobalDataNetworkListResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The details of the Global Data Networks (GDNs).</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of records on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageRecordCount(String pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CD35F3-F3-44CA-AFFF-BAF869******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalRecordCount(String totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeGlobalDataNetworkListResponseBody build() {
            return new DescribeGlobalDataNetworkListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGlobalDataNetworkListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGlobalDataNetworkListResponseBody</p>
     */
    public static class Channels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private String channelId;

        @com.aliyun.core.annotation.NameInMap("ChannelStatus")
        private String channelStatus;

        @com.aliyun.core.annotation.NameInMap("FreezeSourceDuringSync")
        private Boolean freezeSourceDuringSync;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        private Channels(Builder builder) {
            this.channelId = builder.channelId;
            this.channelStatus = builder.channelStatus;
            this.freezeSourceDuringSync = builder.freezeSourceDuringSync;
            this.progress = builder.progress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Channels create() {
            return builder().build();
        }

        /**
         * @return channelId
         */
        public String getChannelId() {
            return this.channelId;
        }

        /**
         * @return channelStatus
         */
        public String getChannelStatus() {
            return this.channelStatus;
        }

        /**
         * @return freezeSourceDuringSync
         */
        public Boolean getFreezeSourceDuringSync() {
            return this.freezeSourceDuringSync;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        public static final class Builder {
            private String channelId; 
            private String channelStatus; 
            private Boolean freezeSourceDuringSync; 
            private String progress; 

            private Builder() {
            } 

            private Builder(Channels model) {
                this.channelId = model.channelId;
                this.channelStatus = model.channelStatus;
                this.freezeSourceDuringSync = model.freezeSourceDuringSync;
                this.progress = model.progress;
            } 

            /**
             * <p>The ID of the synchronization channel.</p>
             * 
             * <strong>example:</strong>
             * <p>gdc-xxx</p>
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * <p>The status of the synchronization channel. Valid values:</p>
             * <ul>
             * <li><p><strong>Creating</strong>: The channel is being created.</p>
             * </li>
             * <li><p><strong>Running</strong>: The channel is running.</p>
             * </li>
             * <li><p><strong>Syncing</strong>: The channel is synchronizing data.</p>
             * </li>
             * <li><p><strong>SyncFinished</strong>: Data synchronization is complete.</p>
             * </li>
             * <li><p><strong>SyncFailed</strong>: Data synchronization failed.</p>
             * </li>
             * <li><p><strong>SyncPartialFailed</strong>: Data synchronization partially failed.</p>
             * </li>
             * <li><p><strong>Stopped</strong>: The channel is stopped.</p>
             * </li>
             * <li><p><strong>Maintaining</strong>: The channel is under maintenance.</p>
             * </li>
             * <li><p><strong>Restarting</strong>: The channel is restarting.</p>
             * </li>
             * <li><p><strong>Locking</strong>: The channel is being locked.</p>
             * </li>
             * <li><p><strong>Locked</strong>: The channel is locked.</p>
             * </li>
             * <li><p><strong>Unlocking</strong>: The channel is being unlocked.</p>
             * </li>
             * <li><p><strong>Deleting</strong>: The channel is being deleted.</p>
             * </li>
             * <li><p><strong>Deleted</strong>: The channel is deleted.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Syncing</p>
             */
            public Builder channelStatus(String channelStatus) {
                this.channelStatus = channelStatus;
                return this;
            }

            /**
             * <p>Indicates whether the source path is frozen during data transmission.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder freezeSourceDuringSync(Boolean freezeSourceDuringSync) {
                this.freezeSourceDuringSync = freezeSourceDuringSync;
                return this;
            }

            /**
             * <p>The synchronization progress.</p>
             * <blockquote>
             * <p>The value is a percentage that is accurate to two decimal places.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>11.45%</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            public Channels build() {
                return new Channels(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGlobalDataNetworkListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGlobalDataNetworkListResponseBody</p>
     */
    public static class Destinations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestinationFileSystemPath")
        private String destinationFileSystemPath;

        @com.aliyun.core.annotation.NameInMap("DestinationId")
        private String destinationId;

        @com.aliyun.core.annotation.NameInMap("DestinationRegion")
        private String destinationRegion;

        @com.aliyun.core.annotation.NameInMap("DestinationType")
        private String destinationType;

        private Destinations(Builder builder) {
            this.destinationFileSystemPath = builder.destinationFileSystemPath;
            this.destinationId = builder.destinationId;
            this.destinationRegion = builder.destinationRegion;
            this.destinationType = builder.destinationType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Destinations create() {
            return builder().build();
        }

        /**
         * @return destinationFileSystemPath
         */
        public String getDestinationFileSystemPath() {
            return this.destinationFileSystemPath;
        }

        /**
         * @return destinationId
         */
        public String getDestinationId() {
            return this.destinationId;
        }

        /**
         * @return destinationRegion
         */
        public String getDestinationRegion() {
            return this.destinationRegion;
        }

        /**
         * @return destinationType
         */
        public String getDestinationType() {
            return this.destinationType;
        }

        public static final class Builder {
            private String destinationFileSystemPath; 
            private String destinationId; 
            private String destinationRegion; 
            private String destinationType; 

            private Builder() {
            } 

            private Builder(Destinations model) {
                this.destinationFileSystemPath = model.destinationFileSystemPath;
                this.destinationId = model.destinationId;
                this.destinationRegion = model.destinationRegion;
                this.destinationType = model.destinationType;
            } 

            /**
             * <p>The destination path.</p>
             * 
             * <strong>example:</strong>
             * <p>/</p>
             */
            public Builder destinationFileSystemPath(String destinationFileSystemPath) {
                this.destinationFileSystemPath = destinationFileSystemPath;
                return this;
            }

            /**
             * <p>Destination PolarDB instance</p>
             * 
             * <strong>example:</strong>
             * <p>pfs-xxx</p>
             */
            public Builder destinationId(String destinationId) {
                this.destinationId = destinationId;
                return this;
            }

            /**
             * <p>The region of the destination.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder destinationRegion(String destinationRegion) {
                this.destinationRegion = destinationRegion;
                return this;
            }

            /**
             * <p>The type of the destination. Valid values:</p>
             * <ul>
             * <li><p><strong>pfs</strong>: Polarlakebase High-performance Edition.</p>
             * </li>
             * <li><p><strong>pcs</strong>: Polarlakebase Cold Storage Edition.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pfs</p>
             */
            public Builder destinationType(String destinationType) {
                this.destinationType = destinationType;
                return this;
            }

            public Destinations build() {
                return new Destinations(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGlobalDataNetworkListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGlobalDataNetworkListResponseBody</p>
     */
    public static class Sources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SourceFileSystemPath")
        private String sourceFileSystemPath;

        @com.aliyun.core.annotation.NameInMap("SourceId")
        private String sourceId;

        @com.aliyun.core.annotation.NameInMap("SourceRegion")
        private String sourceRegion;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        private Sources(Builder builder) {
            this.sourceFileSystemPath = builder.sourceFileSystemPath;
            this.sourceId = builder.sourceId;
            this.sourceRegion = builder.sourceRegion;
            this.sourceType = builder.sourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sources create() {
            return builder().build();
        }

        /**
         * @return sourceFileSystemPath
         */
        public String getSourceFileSystemPath() {
            return this.sourceFileSystemPath;
        }

        /**
         * @return sourceId
         */
        public String getSourceId() {
            return this.sourceId;
        }

        /**
         * @return sourceRegion
         */
        public String getSourceRegion() {
            return this.sourceRegion;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        public static final class Builder {
            private String sourceFileSystemPath; 
            private String sourceId; 
            private String sourceRegion; 
            private String sourceType; 

            private Builder() {
            } 

            private Builder(Sources model) {
                this.sourceFileSystemPath = model.sourceFileSystemPath;
                this.sourceId = model.sourceId;
                this.sourceRegion = model.sourceRegion;
                this.sourceType = model.sourceType;
            } 

            /**
             * <p>The source path.</p>
             * 
             * <strong>example:</strong>
             * <p>/</p>
             */
            public Builder sourceFileSystemPath(String sourceFileSystemPath) {
                this.sourceFileSystemPath = sourceFileSystemPath;
                return this;
            }

            /**
             * <p>The ID of the source Polarlakebase instance.</p>
             * 
             * <strong>example:</strong>
             * <p>pcs-xxx</p>
             */
            public Builder sourceId(String sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * <p>The region of the source.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-wulanchabu</p>
             */
            public Builder sourceRegion(String sourceRegion) {
                this.sourceRegion = sourceRegion;
                return this;
            }

            /**
             * <p>The type of the source. Valid values:</p>
             * <ul>
             * <li><p><strong>pfs</strong>: Polarlakebase High-performance Edition.</p>
             * </li>
             * <li><p><strong>pcs</strong>: Polarlakebase Cold Storage Edition.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pcs</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            public Sources build() {
                return new Sources(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGlobalDataNetworkListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGlobalDataNetworkListResponseBody</p>
     */
    public static class NetworkTopology extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Destinations")
        private java.util.List<Destinations> destinations;

        @com.aliyun.core.annotation.NameInMap("Sources")
        private java.util.List<Sources> sources;

        private NetworkTopology(Builder builder) {
            this.destinations = builder.destinations;
            this.sources = builder.sources;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkTopology create() {
            return builder().build();
        }

        /**
         * @return destinations
         */
        public java.util.List<Destinations> getDestinations() {
            return this.destinations;
        }

        /**
         * @return sources
         */
        public java.util.List<Sources> getSources() {
            return this.sources;
        }

        public static final class Builder {
            private java.util.List<Destinations> destinations; 
            private java.util.List<Sources> sources; 

            private Builder() {
            } 

            private Builder(NetworkTopology model) {
                this.destinations = model.destinations;
                this.sources = model.sources;
            } 

            /**
             * <p>The synchronization destinations.</p>
             */
            public Builder destinations(java.util.List<Destinations> destinations) {
                this.destinations = destinations;
                return this;
            }

            /**
             * <p>The synchronization sources.</p>
             */
            public Builder sources(java.util.List<Sources> sources) {
                this.sources = sources;
                return this;
            }

            public NetworkTopology build() {
                return new NetworkTopology(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGlobalDataNetworkListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGlobalDataNetworkListResponseBody</p>
     */
    public static class Networks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Channels")
        private java.util.List<Channels> channels;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("NetworkDescription")
        private String networkDescription;

        @com.aliyun.core.annotation.NameInMap("NetworkId")
        private String networkId;

        @com.aliyun.core.annotation.NameInMap("NetworkStatus")
        private String networkStatus;

        @com.aliyun.core.annotation.NameInMap("NetworkTopology")
        private NetworkTopology networkTopology;

        private Networks(Builder builder) {
            this.channels = builder.channels;
            this.createTime = builder.createTime;
            this.networkDescription = builder.networkDescription;
            this.networkId = builder.networkId;
            this.networkStatus = builder.networkStatus;
            this.networkTopology = builder.networkTopology;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Networks create() {
            return builder().build();
        }

        /**
         * @return channels
         */
        public java.util.List<Channels> getChannels() {
            return this.channels;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return networkDescription
         */
        public String getNetworkDescription() {
            return this.networkDescription;
        }

        /**
         * @return networkId
         */
        public String getNetworkId() {
            return this.networkId;
        }

        /**
         * @return networkStatus
         */
        public String getNetworkStatus() {
            return this.networkStatus;
        }

        /**
         * @return networkTopology
         */
        public NetworkTopology getNetworkTopology() {
            return this.networkTopology;
        }

        public static final class Builder {
            private java.util.List<Channels> channels; 
            private String createTime; 
            private String networkDescription; 
            private String networkId; 
            private String networkStatus; 
            private NetworkTopology networkTopology; 

            private Builder() {
            } 

            private Builder(Networks model) {
                this.channels = model.channels;
                this.createTime = model.createTime;
                this.networkDescription = model.networkDescription;
                this.networkId = model.networkId;
                this.networkStatus = model.networkStatus;
                this.networkTopology = model.networkTopology;
            } 

            /**
             * <p>The synchronization channels.</p>
             */
            public Builder channels(java.util.List<Channels> channels) {
                this.channels = channels;
                return this;
            }

            /**
             * <p>The time when the GDN was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-03-25T09:37:10Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the GDN.</p>
             * 
             * <strong>example:</strong>
             * <p>mygdn</p>
             */
            public Builder networkDescription(String networkDescription) {
                this.networkDescription = networkDescription;
                return this;
            }

            /**
             * <p>The ID of the GDN.</p>
             * 
             * <strong>example:</strong>
             * <p>gdn-xxx</p>
             */
            public Builder networkId(String networkId) {
                this.networkId = networkId;
                return this;
            }

            /**
             * <p>The status of the GDN. Valid values:</p>
             * <ul>
             * <li><p><strong>Creating</strong>: The GDN is being created.</p>
             * </li>
             * <li><p><strong>Running</strong>: The GDN is running.</p>
             * </li>
             * <li><p><strong>Syncing</strong>: The GDN is synchronizing data.</p>
             * </li>
             * <li><p><strong>SyncFinished</strong>: Data synchronization is complete.</p>
             * </li>
             * <li><p><strong>SyncFailed</strong>: Data synchronization failed.</p>
             * </li>
             * <li><p><strong>SyncPartialFailed</strong>: Data synchronization partially failed.</p>
             * </li>
             * <li><p><strong>Stopped</strong>: The GDN is stopped.</p>
             * </li>
             * <li><p><strong>Maintaining</strong>: The GDN is under maintenance.</p>
             * </li>
             * <li><p><strong>Restarting</strong>: The GDN is restarting.</p>
             * </li>
             * <li><p><strong>Locking</strong>: The GDN is being locked.</p>
             * </li>
             * <li><p><strong>Locked</strong>: The GDN is locked.</p>
             * </li>
             * <li><p><strong>Unlocking</strong>: The GDN is being unlocked.</p>
             * </li>
             * <li><p><strong>Deleting</strong>: The GDN is being deleted.</p>
             * </li>
             * <li><p><strong>Deleted</strong>: The GDN is deleted.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder networkStatus(String networkStatus) {
                this.networkStatus = networkStatus;
                return this;
            }

            /**
             * <p>The network topology of the GDN.</p>
             */
            public Builder networkTopology(NetworkTopology networkTopology) {
                this.networkTopology = networkTopology;
                return this;
            }

            public Networks build() {
                return new Networks(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGlobalDataNetworkListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGlobalDataNetworkListResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Networks")
        private java.util.List<Networks> networks;

        private Items(Builder builder) {
            this.networks = builder.networks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return networks
         */
        public java.util.List<Networks> getNetworks() {
            return this.networks;
        }

        public static final class Builder {
            private java.util.List<Networks> networks; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.networks = model.networks;
            } 

            /**
             * <p>The list of GDN networks.</p>
             */
            public Builder networks(java.util.List<Networks> networks) {
                this.networks = networks;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
