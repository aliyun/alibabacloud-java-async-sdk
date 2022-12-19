// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeModuleConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeModuleConfigResponseBody</p>
 */
public class DescribeModuleConfigResponseBody extends TeaModel {
    @NameInMap("Count")
    private Integer count;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("ModuleConfigList")
    private java.util.List < ModuleConfigList> moduleConfigList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeModuleConfigResponseBody(Builder builder) {
        this.count = builder.count;
        this.httpStatusCode = builder.httpStatusCode;
        this.moduleConfigList = builder.moduleConfigList;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeModuleConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return moduleConfigList
     */
    public java.util.List < ModuleConfigList> getModuleConfigList() {
        return this.moduleConfigList;
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
        private Integer count; 
        private Integer httpStatusCode; 
        private java.util.List < ModuleConfigList> moduleConfigList; 
        private String requestId; 
        private Boolean success; 

        /**
         * The number of configurations for the module.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * An array that consists of the configurations.
         */
        public Builder moduleConfigList(java.util.List < ModuleConfigList> moduleConfigList) {
            this.moduleConfigList = moduleConfigList;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the call is successful. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeModuleConfigResponseBody build() {
            return new DescribeModuleConfigResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("GroupId")
        private Integer groupId;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("Region")
        private String region;

        @NameInMap("Uuid")
        private String uuid;

        private Items(Builder builder) {
            this.groupId = builder.groupId;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.ip = builder.ip;
            this.region = builder.region;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return groupId
         */
        public Integer getGroupId() {
            return this.groupId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
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
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private Integer groupId; 
            private String instanceId; 
            private String instanceName; 
            private String ip; 
            private String region; 
            private String uuid; 

            /**
             * The ID of the server group to which the server belongs.
             */
            public Builder groupId(Integer groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The ID of the server.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the server.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The IP address of the server.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The region in which the server resides.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The UUID of the server.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    public static class ModuleConfigList extends TeaModel {
        @NameInMap("ConfigName")
        private String configName;

        @NameInMap("Items")
        private java.util.List < Items> items;

        @NameInMap("ModuleName")
        private String moduleName;

        private ModuleConfigList(Builder builder) {
            this.configName = builder.configName;
            this.items = builder.items;
            this.moduleName = builder.moduleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModuleConfigList create() {
            return builder().build();
        }

        /**
         * @return configName
         */
        public String getConfigName() {
            return this.configName;
        }

        /**
         * @return items
         */
        public java.util.List < Items> getItems() {
            return this.items;
        }

        /**
         * @return moduleName
         */
        public String getModuleName() {
            return this.moduleName;
        }

        public static final class Builder {
            private String configName; 
            private java.util.List < Items> items; 
            private String moduleName; 

            /**
             * The name of the configuration.
             */
            public Builder configName(String configName) {
                this.configName = configName;
                return this;
            }

            /**
             * The configuration items.
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
                return this;
            }

            /**
             * The name of the module.
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            public ModuleConfigList build() {
                return new ModuleConfigList(this);
            } 

        } 

    }
}
