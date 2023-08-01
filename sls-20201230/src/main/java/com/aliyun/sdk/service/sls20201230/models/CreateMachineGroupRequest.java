// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link CreateMachineGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateMachineGroupRequest</p>
 */
public class CreateMachineGroupRequest extends Request {
    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Body
    @NameInMap("groupAttribute")
    private GroupAttribute groupAttribute;

    @Body
    @NameInMap("groupName")
    @Validation(required = true)
    private String groupName;

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

    private CreateMachineGroupRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.groupAttribute = builder.groupAttribute;
        this.groupName = builder.groupName;
        this.groupType = builder.groupType;
        this.machineIdentifyType = builder.machineIdentifyType;
        this.machineList = builder.machineList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMachineGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
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

    public static final class Builder extends Request.Builder<CreateMachineGroupRequest, Builder> {
        private String project; 
        private GroupAttribute groupAttribute; 
        private String groupName; 
        private String groupType; 
        private String machineIdentifyType; 
        private java.util.List < String > machineList; 

        private Builder() {
            super();
        } 

        private Builder(CreateMachineGroupRequest request) {
            super(request);
            this.project = request.project;
            this.groupAttribute = request.groupAttribute;
            this.groupName = request.groupName;
            this.groupType = request.groupType;
            this.machineIdentifyType = request.machineIdentifyType;
            this.machineList = request.machineList;
        } 

        /**
         * project.
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * groupAttribute.
         */
        public Builder groupAttribute(GroupAttribute groupAttribute) {
            this.putBodyParameter("groupAttribute", groupAttribute);
            this.groupAttribute = groupAttribute;
            return this;
        }

        /**
         * groupName.
         */
        public Builder groupName(String groupName) {
            this.putBodyParameter("groupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * groupType.
         */
        public Builder groupType(String groupType) {
            this.putBodyParameter("groupType", groupType);
            this.groupType = groupType;
            return this;
        }

        /**
         * machineIdentifyType.
         */
        public Builder machineIdentifyType(String machineIdentifyType) {
            this.putBodyParameter("machineIdentifyType", machineIdentifyType);
            this.machineIdentifyType = machineIdentifyType;
            return this;
        }

        /**
         * machineList.
         */
        public Builder machineList(java.util.List < String > machineList) {
            this.putBodyParameter("machineList", machineList);
            this.machineList = machineList;
            return this;
        }

        @Override
        public CreateMachineGroupRequest build() {
            return new CreateMachineGroupRequest(this);
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
