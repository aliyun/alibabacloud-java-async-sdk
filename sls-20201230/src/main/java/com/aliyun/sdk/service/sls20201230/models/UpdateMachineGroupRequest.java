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
 * {@link UpdateMachineGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateMachineGroupRequest</p>
 */
public class UpdateMachineGroupRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("groupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("groupAttribute")
    private GroupAttribute groupAttribute;

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

    private UpdateMachineGroupRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.groupName = builder.groupName;
        this.groupAttribute = builder.groupAttribute;
        this.groupType = builder.groupType;
        this.machineIdentifyType = builder.machineIdentifyType;
        this.machineList = builder.machineList;
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
     * @return project
     */
    public String getProject() {
        return this.project;
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
    public java.util.List<String> getMachineList() {
        return this.machineList;
    }

    public static final class Builder extends Request.Builder<UpdateMachineGroupRequest, Builder> {
        private String project; 
        private String groupName; 
        private GroupAttribute groupAttribute; 
        private String groupType; 
        private String machineIdentifyType; 
        private java.util.List<String> machineList; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMachineGroupRequest request) {
            super(request);
            this.project = request.project;
            this.groupName = request.groupName;
            this.groupAttribute = request.groupAttribute;
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
         * <p>The name of the machine group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-group</p>
         */
        public Builder groupName(String groupName) {
            this.putPathParameter("groupName", groupName);
            this.putBodyParameter("groupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>The attribute of the machine group. This parameter is empty by default.</p>
         */
        public Builder groupAttribute(GroupAttribute groupAttribute) {
            this.putBodyParameter("groupAttribute", groupAttribute);
            this.groupAttribute = groupAttribute;
            return this;
        }

        /**
         * <p>The type of the machine group. Set the value to an empty string.</p>
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
         * <p>The identifier type of the machine group. Valid values:</p>
         * <ul>
         * <li>ip: The machine group uses IP addresses as identifiers.</li>
         * <li>userdefined: The machine group uses custom identifiers.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>userdefined</p>
         */
        public Builder machineIdentifyType(String machineIdentifyType) {
            this.putBodyParameter("machineIdentifyType", machineIdentifyType);
            this.machineIdentifyType = machineIdentifyType;
            return this;
        }

        /**
         * <p>The identifiers of the machines in the machine group.</p>
         * <ul>
         * <li>If you set machineIdentifyType to ip, enter the IP addresses of the machines.</li>
         * <li>If you set machineIdentifyType to userdefined, enter a custom identifier.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[uu_id_1，uu_id_2]</p>
         */
        public Builder machineList(java.util.List<String> machineList) {
            this.putBodyParameter("machineList", machineList);
            this.machineList = machineList;
            return this;
        }

        @Override
        public UpdateMachineGroupRequest build() {
            return new UpdateMachineGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateMachineGroupRequest} extends {@link TeaModel}
     *
     * <p>UpdateMachineGroupRequest</p>
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
             * <p>The identifier of the external management system on which the machine group depends. This parameter is empty by default.</p>
             * 
             * <strong>example:</strong>
             * <p>testgroup2</p>
             */
            public Builder externalName(String externalName) {
                this.externalName = externalName;
                return this;
            }

            /**
             * <p>The topic of the machine group. This parameter is empty by default.</p>
             * 
             * <strong>example:</strong>
             * <p>testtopic2</p>
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
