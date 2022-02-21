// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHostGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetHostGroupResponseBody</p>
 */
public class GetHostGroupResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMessage")
    private String errorMessage;

    @NameInMap("hostGroup")
    private HostGroup hostGroup;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    private GetHostGroupResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.hostGroup = builder.hostGroup;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHostGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return hostGroup
     */
    public HostGroup getHostGroup() {
        return this.hostGroup;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private HostGroup hostGroup; 
        private String requestId; 
        private Boolean success; 

        /**
         * 错误码
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * 错误信息
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * hostGroup.
         */
        public Builder hostGroup(HostGroup hostGroup) {
            this.hostGroup = hostGroup;
            return this;
        }

        /**
         * 请求id，每次请求都是唯一值，便于后续排查问题
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * true 接口调用成功，false 接口调用失败
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetHostGroupResponseBody build() {
            return new GetHostGroupResponseBody(this);
        } 

    } 

    public static class HostInfos extends TeaModel {
        @NameInMap("aliyunRegionId")
        private String aliyunRegionId;

        @NameInMap("createTime")
        private Long createTime;

        @NameInMap("creatorAccountId")
        private String creatorAccountId;

        @NameInMap("instanceName")
        private String instanceName;

        @NameInMap("ip")
        private String ip;

        @NameInMap("machineSn")
        private String machineSn;

        @NameInMap("modifierAccountId")
        private String modifierAccountId;

        @NameInMap("objectType")
        private String objectType;

        @NameInMap("updateTime")
        private Long updateTime;

        private HostInfos(Builder builder) {
            this.aliyunRegionId = builder.aliyunRegionId;
            this.createTime = builder.createTime;
            this.creatorAccountId = builder.creatorAccountId;
            this.instanceName = builder.instanceName;
            this.ip = builder.ip;
            this.machineSn = builder.machineSn;
            this.modifierAccountId = builder.modifierAccountId;
            this.objectType = builder.objectType;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostInfos create() {
            return builder().build();
        }

        /**
         * @return aliyunRegionId
         */
        public String getAliyunRegionId() {
            return this.aliyunRegionId;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creatorAccountId
         */
        public String getCreatorAccountId() {
            return this.creatorAccountId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return machineSn
         */
        public String getMachineSn() {
            return this.machineSn;
        }

        /**
         * @return modifierAccountId
         */
        public String getModifierAccountId() {
            return this.modifierAccountId;
        }

        /**
         * @return objectType
         */
        public String getObjectType() {
            return this.objectType;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String aliyunRegionId; 
            private Long createTime; 
            private String creatorAccountId; 
            private String instanceName; 
            private String ip; 
            private String machineSn; 
            private String modifierAccountId; 
            private String objectType; 
            private Long updateTime; 

            /**
             * aliyunRegionId.
             */
            public Builder aliyunRegionId(String aliyunRegionId) {
                this.aliyunRegionId = aliyunRegionId;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * creatorAccountId.
             */
            public Builder creatorAccountId(String creatorAccountId) {
                this.creatorAccountId = creatorAccountId;
                return this;
            }

            /**
             * instanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * machineSn.
             */
            public Builder machineSn(String machineSn) {
                this.machineSn = machineSn;
                return this;
            }

            /**
             * modifierAccountId.
             */
            public Builder modifierAccountId(String modifierAccountId) {
                this.modifierAccountId = modifierAccountId;
                return this;
            }

            /**
             * objectType.
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            /**
             * updateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public HostInfos build() {
                return new HostInfos(this);
            } 

        } 

    }
    public static class HostGroup extends TeaModel {
        @NameInMap("aliyunRegion")
        private String aliyunRegion;

        @NameInMap("createTime")
        private Long createTime;

        @NameInMap("creatorAccountId")
        private String creatorAccountId;

        @NameInMap("description")
        private String description;

        @NameInMap("ecsLabelKey")
        private String ecsLabelKey;

        @NameInMap("ecsLabelValue")
        private String ecsLabelValue;

        @NameInMap("ecsType")
        private String ecsType;

        @NameInMap("hostInfos")
        private java.util.List < HostInfos> hostInfos;

        @NameInMap("hostNum")
        private Long hostNum;

        @NameInMap("id")
        private Long id;

        @NameInMap("modifierAccountId")
        private String modifierAccountId;

        @NameInMap("name")
        private String name;

        @NameInMap("serviceConnectionId")
        private Long serviceConnectionId;

        @NameInMap("type")
        private String type;

        @NameInMap("upateTIme")
        private Long upateTIme;

        private HostGroup(Builder builder) {
            this.aliyunRegion = builder.aliyunRegion;
            this.createTime = builder.createTime;
            this.creatorAccountId = builder.creatorAccountId;
            this.description = builder.description;
            this.ecsLabelKey = builder.ecsLabelKey;
            this.ecsLabelValue = builder.ecsLabelValue;
            this.ecsType = builder.ecsType;
            this.hostInfos = builder.hostInfos;
            this.hostNum = builder.hostNum;
            this.id = builder.id;
            this.modifierAccountId = builder.modifierAccountId;
            this.name = builder.name;
            this.serviceConnectionId = builder.serviceConnectionId;
            this.type = builder.type;
            this.upateTIme = builder.upateTIme;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostGroup create() {
            return builder().build();
        }

        /**
         * @return aliyunRegion
         */
        public String getAliyunRegion() {
            return this.aliyunRegion;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creatorAccountId
         */
        public String getCreatorAccountId() {
            return this.creatorAccountId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ecsLabelKey
         */
        public String getEcsLabelKey() {
            return this.ecsLabelKey;
        }

        /**
         * @return ecsLabelValue
         */
        public String getEcsLabelValue() {
            return this.ecsLabelValue;
        }

        /**
         * @return ecsType
         */
        public String getEcsType() {
            return this.ecsType;
        }

        /**
         * @return hostInfos
         */
        public java.util.List < HostInfos> getHostInfos() {
            return this.hostInfos;
        }

        /**
         * @return hostNum
         */
        public Long getHostNum() {
            return this.hostNum;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return modifierAccountId
         */
        public String getModifierAccountId() {
            return this.modifierAccountId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return serviceConnectionId
         */
        public Long getServiceConnectionId() {
            return this.serviceConnectionId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return upateTIme
         */
        public Long getUpateTIme() {
            return this.upateTIme;
        }

        public static final class Builder {
            private String aliyunRegion; 
            private Long createTime; 
            private String creatorAccountId; 
            private String description; 
            private String ecsLabelKey; 
            private String ecsLabelValue; 
            private String ecsType; 
            private java.util.List < HostInfos> hostInfos; 
            private Long hostNum; 
            private Long id; 
            private String modifierAccountId; 
            private String name; 
            private Long serviceConnectionId; 
            private String type; 
            private Long upateTIme; 

            /**
             * aliyunRegion.
             */
            public Builder aliyunRegion(String aliyunRegion) {
                this.aliyunRegion = aliyunRegion;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * creatorAccountId.
             */
            public Builder creatorAccountId(String creatorAccountId) {
                this.creatorAccountId = creatorAccountId;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ecsLabelKey.
             */
            public Builder ecsLabelKey(String ecsLabelKey) {
                this.ecsLabelKey = ecsLabelKey;
                return this;
            }

            /**
             * ecsLabelValue.
             */
            public Builder ecsLabelValue(String ecsLabelValue) {
                this.ecsLabelValue = ecsLabelValue;
                return this;
            }

            /**
             * ecsType.
             */
            public Builder ecsType(String ecsType) {
                this.ecsType = ecsType;
                return this;
            }

            /**
             * hostInfos.
             */
            public Builder hostInfos(java.util.List < HostInfos> hostInfos) {
                this.hostInfos = hostInfos;
                return this;
            }

            /**
             * hostNum.
             */
            public Builder hostNum(Long hostNum) {
                this.hostNum = hostNum;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * modifierAccountId.
             */
            public Builder modifierAccountId(String modifierAccountId) {
                this.modifierAccountId = modifierAccountId;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * serviceConnectionId.
             */
            public Builder serviceConnectionId(Long serviceConnectionId) {
                this.serviceConnectionId = serviceConnectionId;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * upateTIme.
             */
            public Builder upateTIme(Long upateTIme) {
                this.upateTIme = upateTIme;
                return this;
            }

            public HostGroup build() {
                return new HostGroup(this);
            } 

        } 

    }
}
