// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link NetworkArchitecture} extends {@link TeaModel}
 *
 * <p>NetworkArchitecture</p>
 */
public class NetworkArchitecture extends TeaModel {
    @NameInMap("ArchVersionIterationId")
    private String archVersionIterationId;

    @NameInMap("Availabe")
    private Boolean availabe;

    @NameInMap("Children")
    private java.util.List < String > children;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("Description")
    private String description;

    @NameInMap("DeviceNumber")
    private Long deviceNumber;

    @NameInMap("GroupNumber")
    private Long groupNumber;

    @NameInMap("Id")
    private String id;

    @NameInMap("Name")
    private String name;

    @NameInMap("NetworkArchitectureId")
    private String networkArchitectureId;

    @NameInMap("Role")
    private String role;

    @NameInMap("Selected")
    private Boolean selected;

    @NameInMap("Stack")
    private Boolean stack;

    @NameInMap("Status")
    private String status;

    @NameInMap("UpdateTime")
    private String updateTime;

    @NameInMap("Version")
    private String version;

    private NetworkArchitecture(Builder builder) {
        this.archVersionIterationId = builder.archVersionIterationId;
        this.availabe = builder.availabe;
        this.children = builder.children;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.deviceNumber = builder.deviceNumber;
        this.groupNumber = builder.groupNumber;
        this.id = builder.id;
        this.name = builder.name;
        this.networkArchitectureId = builder.networkArchitectureId;
        this.role = builder.role;
        this.selected = builder.selected;
        this.stack = builder.stack;
        this.status = builder.status;
        this.updateTime = builder.updateTime;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NetworkArchitecture create() {
        return builder().build();
    }

    /**
     * @return archVersionIterationId
     */
    public String getArchVersionIterationId() {
        return this.archVersionIterationId;
    }

    /**
     * @return availabe
     */
    public Boolean getAvailabe() {
        return this.availabe;
    }

    /**
     * @return children
     */
    public java.util.List < String > getChildren() {
        return this.children;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return deviceNumber
     */
    public Long getDeviceNumber() {
        return this.deviceNumber;
    }

    /**
     * @return groupNumber
     */
    public Long getGroupNumber() {
        return this.groupNumber;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return networkArchitectureId
     */
    public String getNetworkArchitectureId() {
        return this.networkArchitectureId;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return selected
     */
    public Boolean getSelected() {
        return this.selected;
    }

    /**
     * @return stack
     */
    public Boolean getStack() {
        return this.stack;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String archVersionIterationId; 
        private Boolean availabe; 
        private java.util.List < String > children; 
        private String createTime; 
        private String description; 
        private Long deviceNumber; 
        private Long groupNumber; 
        private String id; 
        private String name; 
        private String networkArchitectureId; 
        private String role; 
        private Boolean selected; 
        private Boolean stack; 
        private String status; 
        private String updateTime; 
        private String version; 

        /**
         * ArchVersionIterationId.
         */
        public Builder archVersionIterationId(String archVersionIterationId) {
            this.archVersionIterationId = archVersionIterationId;
            return this;
        }

        /**
         * Availabe.
         */
        public Builder availabe(Boolean availabe) {
            this.availabe = availabe;
            return this;
        }

        /**
         * Children.
         */
        public Builder children(java.util.List < String > children) {
            this.children = children;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * DeviceNumber.
         */
        public Builder deviceNumber(Long deviceNumber) {
            this.deviceNumber = deviceNumber;
            return this;
        }

        /**
         * GroupNumber.
         */
        public Builder groupNumber(Long groupNumber) {
            this.groupNumber = groupNumber;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * NetworkArchitectureId.
         */
        public Builder networkArchitectureId(String networkArchitectureId) {
            this.networkArchitectureId = networkArchitectureId;
            return this;
        }

        /**
         * Role.
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        /**
         * Selected.
         */
        public Builder selected(Boolean selected) {
            this.selected = selected;
            return this;
        }

        /**
         * Stack.
         */
        public Builder stack(Boolean stack) {
            this.stack = stack;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public NetworkArchitecture build() {
            return new NetworkArchitecture(this);
        } 

    } 

}
