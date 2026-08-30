// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListDlpOutboundLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDlpOutboundLogsResponseBody</p>
 */
public class ListDlpOutboundLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Logs")
    private java.util.List<Logs> logs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalNumber")
    private Integer totalNumber;

    private ListDlpOutboundLogsResponseBody(Builder builder) {
        this.logs = builder.logs;
        this.requestId = builder.requestId;
        this.totalNumber = builder.totalNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDlpOutboundLogsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logs
     */
    public java.util.List<Logs> getLogs() {
        return this.logs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalNumber
     */
    public Integer getTotalNumber() {
        return this.totalNumber;
    }

    public static final class Builder {
        private java.util.List<Logs> logs; 
        private String requestId; 
        private Integer totalNumber; 

        private Builder() {
        } 

        private Builder(ListDlpOutboundLogsResponseBody model) {
            this.logs = model.logs;
            this.requestId = model.requestId;
            this.totalNumber = model.totalNumber;
        } 

        /**
         * Logs.
         */
        public Builder logs(java.util.List<Logs> logs) {
            this.logs = logs;
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
         * TotalNumber.
         */
        public Builder totalNumber(Integer totalNumber) {
            this.totalNumber = totalNumber;
            return this;
        }

        public ListDlpOutboundLogsResponseBody build() {
            return new ListDlpOutboundLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDlpOutboundLogsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDlpOutboundLogsResponseBody</p>
     */
    public static class InnerDicts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private InnerDicts(Builder builder) {
            this.count = builder.count;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InnerDicts create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Long count; 
            private String name; 

            private Builder() {
            } 

            private Builder(InnerDicts model) {
                this.count = model.count;
                this.name = model.name;
            } 

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public InnerDicts build() {
                return new InnerDicts(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDlpOutboundLogsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDlpOutboundLogsResponseBody</p>
     */
    public static class Keywords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Keywords(Builder builder) {
            this.count = builder.count;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Keywords create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Long count; 
            private String name; 

            private Builder() {
            } 

            private Builder(Keywords model) {
                this.count = model.count;
                this.name = model.name;
            } 

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Keywords build() {
                return new Keywords(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDlpOutboundLogsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDlpOutboundLogsResponseBody</p>
     */
    public static class UserDicts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private UserDicts(Builder builder) {
            this.count = builder.count;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserDicts create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Long count; 
            private String name; 

            private Builder() {
            } 

            private Builder(UserDicts model) {
                this.count = model.count;
                this.name = model.name;
            } 

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public UserDicts build() {
                return new UserDicts(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDlpOutboundLogsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDlpOutboundLogsResponseBody</p>
     */
    public static class MatchedDicts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InnerDicts")
        private java.util.List<InnerDicts> innerDicts;

        @com.aliyun.core.annotation.NameInMap("Keywords")
        private java.util.List<Keywords> keywords;

        @com.aliyun.core.annotation.NameInMap("UserDicts")
        private java.util.List<UserDicts> userDicts;

        private MatchedDicts(Builder builder) {
            this.innerDicts = builder.innerDicts;
            this.keywords = builder.keywords;
            this.userDicts = builder.userDicts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MatchedDicts create() {
            return builder().build();
        }

        /**
         * @return innerDicts
         */
        public java.util.List<InnerDicts> getInnerDicts() {
            return this.innerDicts;
        }

        /**
         * @return keywords
         */
        public java.util.List<Keywords> getKeywords() {
            return this.keywords;
        }

        /**
         * @return userDicts
         */
        public java.util.List<UserDicts> getUserDicts() {
            return this.userDicts;
        }

        public static final class Builder {
            private java.util.List<InnerDicts> innerDicts; 
            private java.util.List<Keywords> keywords; 
            private java.util.List<UserDicts> userDicts; 

            private Builder() {
            } 

            private Builder(MatchedDicts model) {
                this.innerDicts = model.innerDicts;
                this.keywords = model.keywords;
                this.userDicts = model.userDicts;
            } 

            /**
             * InnerDicts.
             */
            public Builder innerDicts(java.util.List<InnerDicts> innerDicts) {
                this.innerDicts = innerDicts;
                return this;
            }

            /**
             * Keywords.
             */
            public Builder keywords(java.util.List<Keywords> keywords) {
                this.keywords = keywords;
                return this;
            }

            /**
             * UserDicts.
             */
            public Builder userDicts(java.util.List<UserDicts> userDicts) {
                this.userDicts = userDicts;
                return this;
            }

            public MatchedDicts build() {
                return new MatchedDicts(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDlpOutboundLogsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDlpOutboundLogsResponseBody</p>
     */
    public static class MatchedPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EngineDataLevel")
        private String engineDataLevel;

        @com.aliyun.core.annotation.NameInMap("EngineDataType")
        private String engineDataType;

        @com.aliyun.core.annotation.NameInMap("EngineName")
        private String engineName;

        @com.aliyun.core.annotation.NameInMap("PolicyDesc")
        private String policyDesc;

        @com.aliyun.core.annotation.NameInMap("PolicyName")
        private String policyName;

        private MatchedPolicies(Builder builder) {
            this.engineDataLevel = builder.engineDataLevel;
            this.engineDataType = builder.engineDataType;
            this.engineName = builder.engineName;
            this.policyDesc = builder.policyDesc;
            this.policyName = builder.policyName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MatchedPolicies create() {
            return builder().build();
        }

        /**
         * @return engineDataLevel
         */
        public String getEngineDataLevel() {
            return this.engineDataLevel;
        }

        /**
         * @return engineDataType
         */
        public String getEngineDataType() {
            return this.engineDataType;
        }

        /**
         * @return engineName
         */
        public String getEngineName() {
            return this.engineName;
        }

        /**
         * @return policyDesc
         */
        public String getPolicyDesc() {
            return this.policyDesc;
        }

        /**
         * @return policyName
         */
        public String getPolicyName() {
            return this.policyName;
        }

        public static final class Builder {
            private String engineDataLevel; 
            private String engineDataType; 
            private String engineName; 
            private String policyDesc; 
            private String policyName; 

            private Builder() {
            } 

            private Builder(MatchedPolicies model) {
                this.engineDataLevel = model.engineDataLevel;
                this.engineDataType = model.engineDataType;
                this.engineName = model.engineName;
                this.policyDesc = model.policyDesc;
                this.policyName = model.policyName;
            } 

            /**
             * EngineDataLevel.
             */
            public Builder engineDataLevel(String engineDataLevel) {
                this.engineDataLevel = engineDataLevel;
                return this;
            }

            /**
             * EngineDataType.
             */
            public Builder engineDataType(String engineDataType) {
                this.engineDataType = engineDataType;
                return this;
            }

            /**
             * EngineName.
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * PolicyDesc.
             */
            public Builder policyDesc(String policyDesc) {
                this.policyDesc = policyDesc;
                return this;
            }

            /**
             * PolicyName.
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            public MatchedPolicies build() {
                return new MatchedPolicies(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDlpOutboundLogsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDlpOutboundLogsResponseBody</p>
     */
    public static class Logs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private String channelId;

        @com.aliyun.core.annotation.NameInMap("ChannelType")
        private String channelType;

        @com.aliyun.core.annotation.NameInMap("Department")
        private String department;

        @com.aliyun.core.annotation.NameInMap("DevFilePath")
        private String devFilePath;

        @com.aliyun.core.annotation.NameInMap("DeviceTag")
        private String deviceTag;

        @com.aliyun.core.annotation.NameInMap("DeviceType")
        private String deviceType;

        @com.aliyun.core.annotation.NameInMap("DlpStorageConfigId")
        private String dlpStorageConfigId;

        @com.aliyun.core.annotation.NameInMap("DlpStorageType")
        private String dlpStorageType;

        @com.aliyun.core.annotation.NameInMap("DstAddr")
        private String dstAddr;

        @com.aliyun.core.annotation.NameInMap("FileOrigin")
        private String fileOrigin;

        @com.aliyun.core.annotation.NameInMap("FileOriginHost")
        private String fileOriginHost;

        @com.aliyun.core.annotation.NameInMap("FileOriginReferrer")
        private String fileOriginReferrer;

        @com.aliyun.core.annotation.NameInMap("FilePreview")
        private String filePreview;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("GroupInfo")
        private String groupInfo;

        @com.aliyun.core.annotation.NameInMap("HostName")
        private String hostName;

        @com.aliyun.core.annotation.NameInMap("LogId")
        private String logId;

        @com.aliyun.core.annotation.NameInMap("MatchedDicts")
        private MatchedDicts matchedDicts;

        @com.aliyun.core.annotation.NameInMap("MatchedPolicies")
        private java.util.List<MatchedPolicies> matchedPolicies;

        @com.aliyun.core.annotation.NameInMap("OssFileName")
        private String ossFileName;

        @com.aliyun.core.annotation.NameInMap("PolicyAction")
        private String policyAction;

        @com.aliyun.core.annotation.NameInMap("PolicyName")
        private java.util.List<String> policyName;

        @com.aliyun.core.annotation.NameInMap("ProcessName")
        private String processName;

        @com.aliyun.core.annotation.NameInMap("ProcessNameDesc")
        private String processNameDesc;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("Scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("ScreenFilePath")
        private String screenFilePath;

        @com.aliyun.core.annotation.NameInMap("Size")
        private String size;

        @com.aliyun.core.annotation.NameInMap("SrcFileName")
        private String srcFileName;

        @com.aliyun.core.annotation.NameInMap("SrcIp")
        private String srcIp;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("UploadTime")
        private String uploadTime;

        @com.aliyun.core.annotation.NameInMap("User")
        private String user;

        private Logs(Builder builder) {
            this.category = builder.category;
            this.channelId = builder.channelId;
            this.channelType = builder.channelType;
            this.department = builder.department;
            this.devFilePath = builder.devFilePath;
            this.deviceTag = builder.deviceTag;
            this.deviceType = builder.deviceType;
            this.dlpStorageConfigId = builder.dlpStorageConfigId;
            this.dlpStorageType = builder.dlpStorageType;
            this.dstAddr = builder.dstAddr;
            this.fileOrigin = builder.fileOrigin;
            this.fileOriginHost = builder.fileOriginHost;
            this.fileOriginReferrer = builder.fileOriginReferrer;
            this.filePreview = builder.filePreview;
            this.format = builder.format;
            this.groupInfo = builder.groupInfo;
            this.hostName = builder.hostName;
            this.logId = builder.logId;
            this.matchedDicts = builder.matchedDicts;
            this.matchedPolicies = builder.matchedPolicies;
            this.ossFileName = builder.ossFileName;
            this.policyAction = builder.policyAction;
            this.policyName = builder.policyName;
            this.processName = builder.processName;
            this.processNameDesc = builder.processNameDesc;
            this.riskLevel = builder.riskLevel;
            this.scene = builder.scene;
            this.screenFilePath = builder.screenFilePath;
            this.size = builder.size;
            this.srcFileName = builder.srcFileName;
            this.srcIp = builder.srcIp;
            this.startTime = builder.startTime;
            this.uploadTime = builder.uploadTime;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Logs create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return channelId
         */
        public String getChannelId() {
            return this.channelId;
        }

        /**
         * @return channelType
         */
        public String getChannelType() {
            return this.channelType;
        }

        /**
         * @return department
         */
        public String getDepartment() {
            return this.department;
        }

        /**
         * @return devFilePath
         */
        public String getDevFilePath() {
            return this.devFilePath;
        }

        /**
         * @return deviceTag
         */
        public String getDeviceTag() {
            return this.deviceTag;
        }

        /**
         * @return deviceType
         */
        public String getDeviceType() {
            return this.deviceType;
        }

        /**
         * @return dlpStorageConfigId
         */
        public String getDlpStorageConfigId() {
            return this.dlpStorageConfigId;
        }

        /**
         * @return dlpStorageType
         */
        public String getDlpStorageType() {
            return this.dlpStorageType;
        }

        /**
         * @return dstAddr
         */
        public String getDstAddr() {
            return this.dstAddr;
        }

        /**
         * @return fileOrigin
         */
        public String getFileOrigin() {
            return this.fileOrigin;
        }

        /**
         * @return fileOriginHost
         */
        public String getFileOriginHost() {
            return this.fileOriginHost;
        }

        /**
         * @return fileOriginReferrer
         */
        public String getFileOriginReferrer() {
            return this.fileOriginReferrer;
        }

        /**
         * @return filePreview
         */
        public String getFilePreview() {
            return this.filePreview;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return groupInfo
         */
        public String getGroupInfo() {
            return this.groupInfo;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return logId
         */
        public String getLogId() {
            return this.logId;
        }

        /**
         * @return matchedDicts
         */
        public MatchedDicts getMatchedDicts() {
            return this.matchedDicts;
        }

        /**
         * @return matchedPolicies
         */
        public java.util.List<MatchedPolicies> getMatchedPolicies() {
            return this.matchedPolicies;
        }

        /**
         * @return ossFileName
         */
        public String getOssFileName() {
            return this.ossFileName;
        }

        /**
         * @return policyAction
         */
        public String getPolicyAction() {
            return this.policyAction;
        }

        /**
         * @return policyName
         */
        public java.util.List<String> getPolicyName() {
            return this.policyName;
        }

        /**
         * @return processName
         */
        public String getProcessName() {
            return this.processName;
        }

        /**
         * @return processNameDesc
         */
        public String getProcessNameDesc() {
            return this.processNameDesc;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return screenFilePath
         */
        public String getScreenFilePath() {
            return this.screenFilePath;
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        /**
         * @return srcFileName
         */
        public String getSrcFileName() {
            return this.srcFileName;
        }

        /**
         * @return srcIp
         */
        public String getSrcIp() {
            return this.srcIp;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return uploadTime
         */
        public String getUploadTime() {
            return this.uploadTime;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private String category; 
            private String channelId; 
            private String channelType; 
            private String department; 
            private String devFilePath; 
            private String deviceTag; 
            private String deviceType; 
            private String dlpStorageConfigId; 
            private String dlpStorageType; 
            private String dstAddr; 
            private String fileOrigin; 
            private String fileOriginHost; 
            private String fileOriginReferrer; 
            private String filePreview; 
            private String format; 
            private String groupInfo; 
            private String hostName; 
            private String logId; 
            private MatchedDicts matchedDicts; 
            private java.util.List<MatchedPolicies> matchedPolicies; 
            private String ossFileName; 
            private String policyAction; 
            private java.util.List<String> policyName; 
            private String processName; 
            private String processNameDesc; 
            private String riskLevel; 
            private String scene; 
            private String screenFilePath; 
            private String size; 
            private String srcFileName; 
            private String srcIp; 
            private String startTime; 
            private String uploadTime; 
            private String user; 

            private Builder() {
            } 

            private Builder(Logs model) {
                this.category = model.category;
                this.channelId = model.channelId;
                this.channelType = model.channelType;
                this.department = model.department;
                this.devFilePath = model.devFilePath;
                this.deviceTag = model.deviceTag;
                this.deviceType = model.deviceType;
                this.dlpStorageConfigId = model.dlpStorageConfigId;
                this.dlpStorageType = model.dlpStorageType;
                this.dstAddr = model.dstAddr;
                this.fileOrigin = model.fileOrigin;
                this.fileOriginHost = model.fileOriginHost;
                this.fileOriginReferrer = model.fileOriginReferrer;
                this.filePreview = model.filePreview;
                this.format = model.format;
                this.groupInfo = model.groupInfo;
                this.hostName = model.hostName;
                this.logId = model.logId;
                this.matchedDicts = model.matchedDicts;
                this.matchedPolicies = model.matchedPolicies;
                this.ossFileName = model.ossFileName;
                this.policyAction = model.policyAction;
                this.policyName = model.policyName;
                this.processName = model.processName;
                this.processNameDesc = model.processNameDesc;
                this.riskLevel = model.riskLevel;
                this.scene = model.scene;
                this.screenFilePath = model.screenFilePath;
                this.size = model.size;
                this.srcFileName = model.srcFileName;
                this.srcIp = model.srcIp;
                this.startTime = model.startTime;
                this.uploadTime = model.uploadTime;
                this.user = model.user;
            } 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * ChannelId.
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * ChannelType.
             */
            public Builder channelType(String channelType) {
                this.channelType = channelType;
                return this;
            }

            /**
             * Department.
             */
            public Builder department(String department) {
                this.department = department;
                return this;
            }

            /**
             * DevFilePath.
             */
            public Builder devFilePath(String devFilePath) {
                this.devFilePath = devFilePath;
                return this;
            }

            /**
             * DeviceTag.
             */
            public Builder deviceTag(String deviceTag) {
                this.deviceTag = deviceTag;
                return this;
            }

            /**
             * DeviceType.
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * DlpStorageConfigId.
             */
            public Builder dlpStorageConfigId(String dlpStorageConfigId) {
                this.dlpStorageConfigId = dlpStorageConfigId;
                return this;
            }

            /**
             * DlpStorageType.
             */
            public Builder dlpStorageType(String dlpStorageType) {
                this.dlpStorageType = dlpStorageType;
                return this;
            }

            /**
             * DstAddr.
             */
            public Builder dstAddr(String dstAddr) {
                this.dstAddr = dstAddr;
                return this;
            }

            /**
             * FileOrigin.
             */
            public Builder fileOrigin(String fileOrigin) {
                this.fileOrigin = fileOrigin;
                return this;
            }

            /**
             * FileOriginHost.
             */
            public Builder fileOriginHost(String fileOriginHost) {
                this.fileOriginHost = fileOriginHost;
                return this;
            }

            /**
             * FileOriginReferrer.
             */
            public Builder fileOriginReferrer(String fileOriginReferrer) {
                this.fileOriginReferrer = fileOriginReferrer;
                return this;
            }

            /**
             * FilePreview.
             */
            public Builder filePreview(String filePreview) {
                this.filePreview = filePreview;
                return this;
            }

            /**
             * Format.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * GroupInfo.
             */
            public Builder groupInfo(String groupInfo) {
                this.groupInfo = groupInfo;
                return this;
            }

            /**
             * HostName.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * <p>LogId</p>
             * 
             * <strong>example:</strong>
             * <p>da817m4mfrcs6xxxx3hg</p>
             */
            public Builder logId(String logId) {
                this.logId = logId;
                return this;
            }

            /**
             * MatchedDicts.
             */
            public Builder matchedDicts(MatchedDicts matchedDicts) {
                this.matchedDicts = matchedDicts;
                return this;
            }

            /**
             * MatchedPolicies.
             */
            public Builder matchedPolicies(java.util.List<MatchedPolicies> matchedPolicies) {
                this.matchedPolicies = matchedPolicies;
                return this;
            }

            /**
             * OssFileName.
             */
            public Builder ossFileName(String ossFileName) {
                this.ossFileName = ossFileName;
                return this;
            }

            /**
             * PolicyAction.
             */
            public Builder policyAction(String policyAction) {
                this.policyAction = policyAction;
                return this;
            }

            /**
             * PolicyName.
             */
            public Builder policyName(java.util.List<String> policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * ProcessName.
             */
            public Builder processName(String processName) {
                this.processName = processName;
                return this;
            }

            /**
             * ProcessNameDesc.
             */
            public Builder processNameDesc(String processNameDesc) {
                this.processNameDesc = processNameDesc;
                return this;
            }

            /**
             * RiskLevel.
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * Scene.
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * ScreenFilePath.
             */
            public Builder screenFilePath(String screenFilePath) {
                this.screenFilePath = screenFilePath;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * SrcFileName.
             */
            public Builder srcFileName(String srcFileName) {
                this.srcFileName = srcFileName;
                return this;
            }

            /**
             * SrcIp.
             */
            public Builder srcIp(String srcIp) {
                this.srcIp = srcIp;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * UploadTime.
             */
            public Builder uploadTime(String uploadTime) {
                this.uploadTime = uploadTime;
                return this;
            }

            /**
             * User.
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public Logs build() {
                return new Logs(this);
            } 

        } 

    }
}
