// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link DescribeSecurityIPGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecurityIPGroupResponseBody</p>
 */
public class DescribeSecurityIPGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private DescribeSecurityIPGroupResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecurityIPGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(DescribeSecurityIPGroupResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>ListResult<InstanceSSL></p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeSecurityIPGroupResponseBody build() {
            return new DescribeSecurityIPGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSecurityIPGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityIPGroupResponseBody</p>
     */
    public static class EngineInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EngineName")
        private String engineName;

        @com.aliyun.core.annotation.NameInMap("InstanceIds")
        private java.util.List<String> instanceIds;

        @com.aliyun.core.annotation.NameInMap("InstanceNum")
        private Integer instanceNum;

        private EngineInfoList(Builder builder) {
            this.engineName = builder.engineName;
            this.instanceIds = builder.instanceIds;
            this.instanceNum = builder.instanceNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EngineInfoList create() {
            return builder().build();
        }

        /**
         * @return engineName
         */
        public String getEngineName() {
            return this.engineName;
        }

        /**
         * @return instanceIds
         */
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

        /**
         * @return instanceNum
         */
        public Integer getInstanceNum() {
            return this.instanceNum;
        }

        public static final class Builder {
            private String engineName; 
            private java.util.List<String> instanceIds; 
            private Integer instanceNum; 

            private Builder() {
            } 

            private Builder(EngineInfoList model) {
                this.engineName = model.engineName;
                this.instanceIds = model.instanceIds;
                this.instanceNum = model.instanceNum;
            } 

            /**
             * EngineName.
             */
            public Builder engineName(String engineName) {
                this.engineName = engineName;
                return this;
            }

            /**
             * InstanceIds.
             */
            public Builder instanceIds(java.util.List<String> instanceIds) {
                this.instanceIds = instanceIds;
                return this;
            }

            /**
             * InstanceNum.
             */
            public Builder instanceNum(Integer instanceNum) {
                this.instanceNum = instanceNum;
                return this;
            }

            public EngineInfoList build() {
                return new EngineInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSecurityIPGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityIPGroupResponseBody</p>
     */
    public static class SecurityIpGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbInstances")
        private java.util.List<String> dbInstances;

        @com.aliyun.core.annotation.NameInMap("EngineInfoList")
        private java.util.List<EngineInfoList> engineInfoList;

        @com.aliyun.core.annotation.NameInMap("GEcsSgIdList")
        private String gEcsSgIdList;

        @com.aliyun.core.annotation.NameInMap("GIpList")
        private String gIpList;

        @com.aliyun.core.annotation.NameInMap("GlobalIgName")
        private String globalIgName;

        @com.aliyun.core.annotation.NameInMap("GlobalSecurityGroupId")
        private String globalSecurityGroupId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SecurityIpType")
        private String securityIpType;

        @com.aliyun.core.annotation.NameInMap("Uid")
        private String uid;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("WhitelistNetType")
        private String whitelistNetType;

        private SecurityIpGroups(Builder builder) {
            this.dbInstances = builder.dbInstances;
            this.engineInfoList = builder.engineInfoList;
            this.gEcsSgIdList = builder.gEcsSgIdList;
            this.gIpList = builder.gIpList;
            this.globalIgName = builder.globalIgName;
            this.globalSecurityGroupId = builder.globalSecurityGroupId;
            this.regionId = builder.regionId;
            this.securityIpType = builder.securityIpType;
            this.uid = builder.uid;
            this.userId = builder.userId;
            this.whitelistNetType = builder.whitelistNetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityIpGroups create() {
            return builder().build();
        }

        /**
         * @return dbInstances
         */
        public java.util.List<String> getDbInstances() {
            return this.dbInstances;
        }

        /**
         * @return engineInfoList
         */
        public java.util.List<EngineInfoList> getEngineInfoList() {
            return this.engineInfoList;
        }

        /**
         * @return gEcsSgIdList
         */
        public String getGEcsSgIdList() {
            return this.gEcsSgIdList;
        }

        /**
         * @return gIpList
         */
        public String getGIpList() {
            return this.gIpList;
        }

        /**
         * @return globalIgName
         */
        public String getGlobalIgName() {
            return this.globalIgName;
        }

        /**
         * @return globalSecurityGroupId
         */
        public String getGlobalSecurityGroupId() {
            return this.globalSecurityGroupId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return securityIpType
         */
        public String getSecurityIpType() {
            return this.securityIpType;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return whitelistNetType
         */
        public String getWhitelistNetType() {
            return this.whitelistNetType;
        }

        public static final class Builder {
            private java.util.List<String> dbInstances; 
            private java.util.List<EngineInfoList> engineInfoList; 
            private String gEcsSgIdList; 
            private String gIpList; 
            private String globalIgName; 
            private String globalSecurityGroupId; 
            private String regionId; 
            private String securityIpType; 
            private String uid; 
            private String userId; 
            private String whitelistNetType; 

            private Builder() {
            } 

            private Builder(SecurityIpGroups model) {
                this.dbInstances = model.dbInstances;
                this.engineInfoList = model.engineInfoList;
                this.gEcsSgIdList = model.gEcsSgIdList;
                this.gIpList = model.gIpList;
                this.globalIgName = model.globalIgName;
                this.globalSecurityGroupId = model.globalSecurityGroupId;
                this.regionId = model.regionId;
                this.securityIpType = model.securityIpType;
                this.uid = model.uid;
                this.userId = model.userId;
                this.whitelistNetType = model.whitelistNetType;
            } 

            /**
             * DbInstances.
             */
            public Builder dbInstances(java.util.List<String> dbInstances) {
                this.dbInstances = dbInstances;
                return this;
            }

            /**
             * EngineInfoList.
             */
            public Builder engineInfoList(java.util.List<EngineInfoList> engineInfoList) {
                this.engineInfoList = engineInfoList;
                return this;
            }

            /**
             * GEcsSgIdList.
             */
            public Builder gEcsSgIdList(String gEcsSgIdList) {
                this.gEcsSgIdList = gEcsSgIdList;
                return this;
            }

            /**
             * GIpList.
             */
            public Builder gIpList(String gIpList) {
                this.gIpList = gIpList;
                return this;
            }

            /**
             * GlobalIgName.
             */
            public Builder globalIgName(String globalIgName) {
                this.globalIgName = globalIgName;
                return this;
            }

            /**
             * GlobalSecurityGroupId.
             */
            public Builder globalSecurityGroupId(String globalSecurityGroupId) {
                this.globalSecurityGroupId = globalSecurityGroupId;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * SecurityIpType.
             */
            public Builder securityIpType(String securityIpType) {
                this.securityIpType = securityIpType;
                return this;
            }

            /**
             * Uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * WhitelistNetType.
             */
            public Builder whitelistNetType(String whitelistNetType) {
                this.whitelistNetType = whitelistNetType;
                return this;
            }

            public SecurityIpGroups build() {
                return new SecurityIpGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSecurityIPGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityIPGroupResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecurityIpGroups")
        private java.util.List<SecurityIpGroups> securityIpGroups;

        private Data(Builder builder) {
            this.securityIpGroups = builder.securityIpGroups;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return securityIpGroups
         */
        public java.util.List<SecurityIpGroups> getSecurityIpGroups() {
            return this.securityIpGroups;
        }

        public static final class Builder {
            private java.util.List<SecurityIpGroups> securityIpGroups; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.securityIpGroups = model.securityIpGroups;
            } 

            /**
             * SecurityIpGroups.
             */
            public Builder securityIpGroups(java.util.List<SecurityIpGroups> securityIpGroups) {
                this.securityIpGroups = securityIpGroups;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
