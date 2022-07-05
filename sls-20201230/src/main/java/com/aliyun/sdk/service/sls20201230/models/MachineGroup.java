// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link MachineGroup} extends {@link TeaModel}
 *
 * <p>MachineGroup</p>
 */
public class MachineGroup extends TeaModel {
    @NameInMap("groupAttribute")
    private GroupAttribute groupAttribute;

    @NameInMap("groupName")
    @Validation(required = true)
    private String groupName;

    @NameInMap("groupType")
    private String groupType;

    @NameInMap("machineIdentifyType")
    @Validation(required = true)
    private String machineIdentifyType;

    @NameInMap("machineList")
    @Validation(required = true)
    private java.util.List < String > machineList;

    private MachineGroup(Builder builder) {
        this.groupAttribute = builder.groupAttribute;
        this.groupName = builder.groupName;
        this.groupType = builder.groupType;
        this.machineIdentifyType = builder.machineIdentifyType;
        this.machineList = builder.machineList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MachineGroup create() {
        return builder().build();
    }

    /**
     * @return groupAttribute
     */
    public GroupAttribute getGroupAttribute() {
        return this.groupAttribute;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return groupType
     */
    public String getGroupType() {
        return this.groupType;
    }

    /**
     * @return machineIdentifyType
     */
    public String getMachineIdentifyType() {
        return this.machineIdentifyType;
    }

    /**
     * @return machineList
     */
    public java.util.List < String > getMachineList() {
        return this.machineList;
    }

    public static final class Builder {
        private GroupAttribute groupAttribute; 
        private String groupName; 
        private String groupType; 
        private String machineIdentifyType; 
        private java.util.List < String > machineList; 

        /**
         * 机器组属性。
         */
        public Builder groupAttribute(GroupAttribute groupAttribute) {
            this.groupAttribute = groupAttribute;
            return this;
        }

        /**
         * 机器组名称。
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * 机器组种类。
         */
        public Builder groupType(String groupType) {
            this.groupType = groupType;
            return this;
        }

        /**
         * 机器组标识种类，支持 IP 标识或者用户自定义标识，即 ip 、userdefined。
         */
        public Builder machineIdentifyType(String machineIdentifyType) {
            this.machineIdentifyType = machineIdentifyType;
            return this;
        }

        /**
         * 机器组标识列表。
         */
        public Builder machineList(java.util.List < String > machineList) {
            this.machineList = machineList;
            return this;
        }

        public MachineGroup build() {
            return new MachineGroup(this);
        } 

    } 

    public static class GroupAttribute extends TeaModel {
        @NameInMap("externalName")
        private String externalName;

        @NameInMap("groupTopic")
        private String groupTopic;

        private GroupAttribute(Builder builder) {
            this.externalName = builder.externalName;
            this.groupTopic = builder.groupTopic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupAttribute create() {
            return builder().build();
        }

        /**
         * @return externalName
         */
        public String getExternalName() {
            return this.externalName;
        }

        /**
         * @return groupTopic
         */
        public String getGroupTopic() {
            return this.groupTopic;
        }

        public static final class Builder {
            private String externalName; 
            private String groupTopic; 

            /**
             * 机器组所依赖的外部管理系统标识。
             */
            public Builder externalName(String externalName) {
                this.externalName = externalName;
                return this;
            }

            /**
             * 机器组的日志主题。
             */
            public Builder groupTopic(String groupTopic) {
                this.groupTopic = groupTopic;
                return this;
            }

            public GroupAttribute build() {
                return new GroupAttribute(this);
            } 

        } 

    }
}
