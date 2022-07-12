// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link UpdateMachineGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateMachineGroupRequest</p>
 */
public class UpdateMachineGroupRequest extends Request {
    @Path
    @Body
    @NameInMap("groupName")
    @Validation(required = true)
    private String groupName;

    @Body
    @NameInMap("groupAttribute")
    private GroupAttribute groupAttribute;

    @Body
    @NameInMap("groupType")
    private String groupType;

    @Body
    @NameInMap("machineIdentifyType")
    @Validation(required = true)
    private String machineIdentifyType;

    @Body
    @NameInMap("machineList")
    @Validation(required = true)
    private java.util.List < String > machineList;

    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    private UpdateMachineGroupRequest(Builder builder) {
        super(builder);
        this.groupName = builder.groupName;
        this.groupAttribute = builder.groupAttribute;
        this.groupType = builder.groupType;
        this.machineIdentifyType = builder.machineIdentifyType;
        this.machineList = builder.machineList;
        this.project = builder.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMachineGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return groupAttribute
     */
    public GroupAttribute getGroupAttribute() {
        return this.groupAttribute;
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

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    public static final class Builder extends Request.Builder<UpdateMachineGroupRequest, Builder> {
        private String groupName; 
        private GroupAttribute groupAttribute; 
        private String groupType; 
        private String machineIdentifyType; 
        private java.util.List < String > machineList; 
        private String project; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMachineGroupRequest request) {
            super(request);
            this.groupName = request.groupName;
            this.groupAttribute = request.groupAttribute;
            this.groupType = request.groupType;
            this.machineIdentifyType = request.machineIdentifyType;
            this.machineList = request.machineList;
            this.project = request.project;
        } 

        /**
         * 机器组名称。
         */
        public Builder groupName(String groupName) {
            this.putPathParameter("groupName", groupName);
            this.putBodyParameter("groupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * 机器组属性。
         */
        public Builder groupAttribute(GroupAttribute groupAttribute) {
            this.putBodyParameter("groupAttribute", groupAttribute);
            this.groupAttribute = groupAttribute;
            return this;
        }

        /**
         * 机器组类型，可选值，默认为空。
         */
        public Builder groupType(String groupType) {
            this.putBodyParameter("groupType", groupType);
            this.groupType = groupType;
            return this;
        }

        /**
         * 机器组标识种类，支持 ip 、userdefined 两种。
         */
        public Builder machineIdentifyType(String machineIdentifyType) {
            this.putBodyParameter("machineIdentifyType", machineIdentifyType);
            this.machineIdentifyType = machineIdentifyType;
            return this;
        }

        /**
         * 机器列表。
         */
        public Builder machineList(java.util.List < String > machineList) {
            this.putBodyParameter("machineList", machineList);
            this.machineList = machineList;
            return this;
        }

        /**
         * project 名称。
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        @Override
        public UpdateMachineGroupRequest build() {
            return new UpdateMachineGroupRequest(this);
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
