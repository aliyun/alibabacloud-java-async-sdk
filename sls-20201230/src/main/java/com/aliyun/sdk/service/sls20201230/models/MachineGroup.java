// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link MachineGroup} extends {@link TeaModel}
 *
 * <p>MachineGroup</p>
 */
public class MachineGroup extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("groupAttribute")
    private GroupAttribute groupAttribute;

    @com.aliyun.core.annotation.NameInMap("groupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupName;

    @com.aliyun.core.annotation.NameInMap("groupType")
    private String groupType;

    @com.aliyun.core.annotation.NameInMap("machineIdentifyType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String machineIdentifyType;

    @com.aliyun.core.annotation.NameInMap("machineList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> machineList;

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
    public java.util.List<String> getMachineList() {
        return this.machineList;
    }

    public static final class Builder {
        private GroupAttribute groupAttribute; 
        private String groupName; 
        private String groupType; 
        private String machineIdentifyType; 
        private java.util.List<String> machineList; 

        /**
         * groupAttribute.
         */
        public Builder groupAttribute(GroupAttribute groupAttribute) {
            this.groupAttribute = groupAttribute;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-group</p>
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * groupType.
         */
        public Builder groupType(String groupType) {
            this.groupType = groupType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        public Builder machineIdentifyType(String machineIdentifyType) {
            this.machineIdentifyType = machineIdentifyType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder machineList(java.util.List<String> machineList) {
            this.machineList = machineList;
            return this;
        }

        public MachineGroup build() {
            return new MachineGroup(this);
        } 

    } 

    /**
     * 
     * {@link MachineGroup} extends {@link TeaModel}
     *
     * <p>MachineGroup</p>
     */
    public static class GroupAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("externalName")
        private String externalName;

        @com.aliyun.core.annotation.NameInMap("groupTopic")
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
             * externalName.
             */
            public Builder externalName(String externalName) {
                this.externalName = externalName;
                return this;
            }

            /**
             * groupTopic.
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
