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
 * {@link CreateMachineGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateMachineGroupRequest</p>
 */
public class CreateMachineGroupRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("groupAttribute")
    private GroupAttribute groupAttribute;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("groupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("groupType")
    private String groupType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("machineIdentifyType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String machineIdentifyType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("machineList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> machineList;

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
    public java.util.List<String> getMachineList() {
        return this.machineList;
    }

    public static final class Builder extends Request.Builder<CreateMachineGroupRequest, Builder> {
        private String project; 
        private GroupAttribute groupAttribute; 
        private String groupName; 
        private String groupType; 
        private String machineIdentifyType; 
        private java.util.List<String> machineList; 

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
         * <p>The name of the project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ali-test-project</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>The attributes of the machine group.</p>
         */
        public Builder groupAttribute(GroupAttribute groupAttribute) {
            this.putBodyParameter("groupAttribute", groupAttribute);
            this.groupAttribute = groupAttribute;
            return this;
        }

        /**
         * <p>The name of the machine group. The name must meet the following requirements:</p>
         * <ul>
         * <li>The name of each machine group in a project must be unique.</li>
         * <li>It can contain only lowercase letters, digits, hyphens (-), and underscores (_).</li>
         * <li>It must start and end with a lowercase letter or a digit.</li>
         * <li>It must be 3 to 128 characters in length.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-machine-group</p>
         */
        public Builder groupName(String groupName) {
            this.putBodyParameter("groupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>The type of the machine group. The parameter can be left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder groupType(String groupType) {
            this.putBodyParameter("groupType", groupType);
            this.groupType = groupType;
            return this;
        }

        /**
         * <p>The type of the machine group identifier. Valid values:</p>
         * <ul>
         * <li>ip: The machine group uses IP addresses as identifiers.</li>
         * <li>userdefined: The machine group uses custom identifiers.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        public Builder machineIdentifyType(String machineIdentifyType) {
            this.putBodyParameter("machineIdentifyType", machineIdentifyType);
            this.machineIdentifyType = machineIdentifyType;
            return this;
        }

        /**
         * <p>The identifiers of machine group.</p>
         * <ul>
         * <li>If you set machineIdentifyType to ip, enter the IP address of the machine.</li>
         * <li>If you set machineIdentifyType to userdefined, enter a custom identifier.</li>
         * </ul>
         * <p>This parameter is required.</p>
         */
        public Builder machineList(java.util.List<String> machineList) {
            this.putBodyParameter("machineList", machineList);
            this.machineList = machineList;
            return this;
        }

        @Override
        public CreateMachineGroupRequest build() {
            return new CreateMachineGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateMachineGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateMachineGroupRequest</p>
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
             * <p>The identifier of the external management system on which the machine group depends.</p>
             * 
             * <strong>example:</strong>
             * <p>testgroup</p>
             */
            public Builder externalName(String externalName) {
                this.externalName = externalName;
                return this;
            }

            /**
             * <p>The log topic of the machine group.</p>
             * 
             * <strong>example:</strong>
             * <p>testtopic</p>
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
