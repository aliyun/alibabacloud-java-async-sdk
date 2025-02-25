// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link DescribeDevicesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDevicesResponseBody</p>
 */
public class DescribeDevicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Devices")
    private java.util.List<Devices> devices;

    @com.aliyun.core.annotation.NameInMap("PageCount")
    private Long pageCount;

    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Long pageNum;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeDevicesResponseBody(Builder builder) {
        this.devices = builder.devices;
        this.pageCount = builder.pageCount;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDevicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return devices
     */
    public java.util.List<Devices> getDevices() {
        return this.devices;
    }

    /**
     * @return pageCount
     */
    public Long getPageCount() {
        return this.pageCount;
    }

    /**
     * @return pageNum
     */
    public Long getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Devices> devices; 
        private Long pageCount; 
        private Long pageNum; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Devices.
         */
        public Builder devices(java.util.List<Devices> devices) {
            this.devices = devices;
            return this;
        }

        /**
         * PageCount.
         */
        public Builder pageCount(Long pageCount) {
            this.pageCount = pageCount;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDevicesResponseBody build() {
            return new DescribeDevicesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDevicesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDevicesResponseBody</p>
     */
    public static class Directory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private String parentId;

        private Directory(Builder builder) {
            this.createdTime = builder.createdTime;
            this.description = builder.description;
            this.groupId = builder.groupId;
            this.id = builder.id;
            this.name = builder.name;
            this.parentId = builder.parentId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Directory create() {
            return builder().build();
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parentId
         */
        public String getParentId() {
            return this.parentId;
        }

        public static final class Builder {
            private String createdTime; 
            private String description; 
            private String groupId; 
            private String id; 
            private String name; 
            private String parentId; 

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ParentId.
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            public Directory build() {
                return new Directory(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDevicesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDevicesResponseBody</p>
     */
    public static class Stats extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelNum")
        private Long channelNum;

        @com.aliyun.core.annotation.NameInMap("FailedNum")
        private Long failedNum;

        @com.aliyun.core.annotation.NameInMap("OfflineNum")
        private Long offlineNum;

        @com.aliyun.core.annotation.NameInMap("OnlineNum")
        private Long onlineNum;

        @com.aliyun.core.annotation.NameInMap("StreamNum")
        private Long streamNum;

        private Stats(Builder builder) {
            this.channelNum = builder.channelNum;
            this.failedNum = builder.failedNum;
            this.offlineNum = builder.offlineNum;
            this.onlineNum = builder.onlineNum;
            this.streamNum = builder.streamNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Stats create() {
            return builder().build();
        }

        /**
         * @return channelNum
         */
        public Long getChannelNum() {
            return this.channelNum;
        }

        /**
         * @return failedNum
         */
        public Long getFailedNum() {
            return this.failedNum;
        }

        /**
         * @return offlineNum
         */
        public Long getOfflineNum() {
            return this.offlineNum;
        }

        /**
         * @return onlineNum
         */
        public Long getOnlineNum() {
            return this.onlineNum;
        }

        /**
         * @return streamNum
         */
        public Long getStreamNum() {
            return this.streamNum;
        }

        public static final class Builder {
            private Long channelNum; 
            private Long failedNum; 
            private Long offlineNum; 
            private Long onlineNum; 
            private Long streamNum; 

            /**
             * ChannelNum.
             */
            public Builder channelNum(Long channelNum) {
                this.channelNum = channelNum;
                return this;
            }

            /**
             * FailedNum.
             */
            public Builder failedNum(Long failedNum) {
                this.failedNum = failedNum;
                return this;
            }

            /**
             * OfflineNum.
             */
            public Builder offlineNum(Long offlineNum) {
                this.offlineNum = offlineNum;
                return this;
            }

            /**
             * OnlineNum.
             */
            public Builder onlineNum(Long onlineNum) {
                this.onlineNum = onlineNum;
                return this;
            }

            /**
             * StreamNum.
             */
            public Builder streamNum(Long streamNum) {
                this.streamNum = streamNum;
                return this;
            }

            public Stats build() {
                return new Stats(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDevicesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDevicesResponseBody</p>
     */
    public static class Devices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmMethod")
        private String alarmMethod;

        @com.aliyun.core.annotation.NameInMap("AutoDirectory")
        private Boolean autoDirectory;

        @com.aliyun.core.annotation.NameInMap("AutoPos")
        private Boolean autoPos;

        @com.aliyun.core.annotation.NameInMap("AutoStart")
        private Boolean autoStart;

        @com.aliyun.core.annotation.NameInMap("ChannelSyncTime")
        private String channelSyncTime;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Directory")
        private Directory directory;

        @com.aliyun.core.annotation.NameInMap("DirectoryId")
        private String directoryId;

        @com.aliyun.core.annotation.NameInMap("Dsn")
        private String dsn;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("GbId")
        private String gbId;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Latitude")
        private String latitude;

        @com.aliyun.core.annotation.NameInMap("Longitude")
        private String longitude;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Params")
        private String params;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private String parentId;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Long port;

        @com.aliyun.core.annotation.NameInMap("PosInterval")
        private Long posInterval;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("RegisteredTime")
        private String registeredTime;

        @com.aliyun.core.annotation.NameInMap("Stats")
        private Stats stats;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private String vendor;

        private Devices(Builder builder) {
            this.alarmMethod = builder.alarmMethod;
            this.autoDirectory = builder.autoDirectory;
            this.autoPos = builder.autoPos;
            this.autoStart = builder.autoStart;
            this.channelSyncTime = builder.channelSyncTime;
            this.createdTime = builder.createdTime;
            this.description = builder.description;
            this.directory = builder.directory;
            this.directoryId = builder.directoryId;
            this.dsn = builder.dsn;
            this.enabled = builder.enabled;
            this.gbId = builder.gbId;
            this.groupId = builder.groupId;
            this.id = builder.id;
            this.ip = builder.ip;
            this.latitude = builder.latitude;
            this.longitude = builder.longitude;
            this.name = builder.name;
            this.params = builder.params;
            this.parentId = builder.parentId;
            this.password = builder.password;
            this.port = builder.port;
            this.posInterval = builder.posInterval;
            this.protocol = builder.protocol;
            this.registeredTime = builder.registeredTime;
            this.stats = builder.stats;
            this.status = builder.status;
            this.type = builder.type;
            this.url = builder.url;
            this.username = builder.username;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Devices create() {
            return builder().build();
        }

        /**
         * @return alarmMethod
         */
        public String getAlarmMethod() {
            return this.alarmMethod;
        }

        /**
         * @return autoDirectory
         */
        public Boolean getAutoDirectory() {
            return this.autoDirectory;
        }

        /**
         * @return autoPos
         */
        public Boolean getAutoPos() {
            return this.autoPos;
        }

        /**
         * @return autoStart
         */
        public Boolean getAutoStart() {
            return this.autoStart;
        }

        /**
         * @return channelSyncTime
         */
        public String getChannelSyncTime() {
            return this.channelSyncTime;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return directory
         */
        public Directory getDirectory() {
            return this.directory;
        }

        /**
         * @return directoryId
         */
        public String getDirectoryId() {
            return this.directoryId;
        }

        /**
         * @return dsn
         */
        public String getDsn() {
            return this.dsn;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return gbId
         */
        public String getGbId() {
            return this.gbId;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return latitude
         */
        public String getLatitude() {
            return this.latitude;
        }

        /**
         * @return longitude
         */
        public String getLongitude() {
            return this.longitude;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return params
         */
        public String getParams() {
            return this.params;
        }

        /**
         * @return parentId
         */
        public String getParentId() {
            return this.parentId;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return port
         */
        public Long getPort() {
            return this.port;
        }

        /**
         * @return posInterval
         */
        public Long getPosInterval() {
            return this.posInterval;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return registeredTime
         */
        public String getRegisteredTime() {
            return this.registeredTime;
        }

        /**
         * @return stats
         */
        public Stats getStats() {
            return this.stats;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        /**
         * @return vendor
         */
        public String getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private String alarmMethod; 
            private Boolean autoDirectory; 
            private Boolean autoPos; 
            private Boolean autoStart; 
            private String channelSyncTime; 
            private String createdTime; 
            private String description; 
            private Directory directory; 
            private String directoryId; 
            private String dsn; 
            private Boolean enabled; 
            private String gbId; 
            private String groupId; 
            private String id; 
            private String ip; 
            private String latitude; 
            private String longitude; 
            private String name; 
            private String params; 
            private String parentId; 
            private String password; 
            private Long port; 
            private Long posInterval; 
            private String protocol; 
            private String registeredTime; 
            private Stats stats; 
            private String status; 
            private String type; 
            private String url; 
            private String username; 
            private String vendor; 

            /**
             * AlarmMethod.
             */
            public Builder alarmMethod(String alarmMethod) {
                this.alarmMethod = alarmMethod;
                return this;
            }

            /**
             * AutoDirectory.
             */
            public Builder autoDirectory(Boolean autoDirectory) {
                this.autoDirectory = autoDirectory;
                return this;
            }

            /**
             * AutoPos.
             */
            public Builder autoPos(Boolean autoPos) {
                this.autoPos = autoPos;
                return this;
            }

            /**
             * AutoStart.
             */
            public Builder autoStart(Boolean autoStart) {
                this.autoStart = autoStart;
                return this;
            }

            /**
             * ChannelSyncTime.
             */
            public Builder channelSyncTime(String channelSyncTime) {
                this.channelSyncTime = channelSyncTime;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Directory.
             */
            public Builder directory(Directory directory) {
                this.directory = directory;
                return this;
            }

            /**
             * DirectoryId.
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * Dsn.
             */
            public Builder dsn(String dsn) {
                this.dsn = dsn;
                return this;
            }

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * GbId.
             */
            public Builder gbId(String gbId) {
                this.gbId = gbId;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * Latitude.
             */
            public Builder latitude(String latitude) {
                this.latitude = latitude;
                return this;
            }

            /**
             * Longitude.
             */
            public Builder longitude(String longitude) {
                this.longitude = longitude;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Params.
             */
            public Builder params(String params) {
                this.params = params;
                return this;
            }

            /**
             * ParentId.
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * Password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Long port) {
                this.port = port;
                return this;
            }

            /**
             * PosInterval.
             */
            public Builder posInterval(Long posInterval) {
                this.posInterval = posInterval;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * RegisteredTime.
             */
            public Builder registeredTime(String registeredTime) {
                this.registeredTime = registeredTime;
                return this;
            }

            /**
             * Stats.
             */
            public Builder stats(Stats stats) {
                this.stats = stats;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * Username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            /**
             * Vendor.
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            public Devices build() {
                return new Devices(this);
            } 

        } 

    }
}
