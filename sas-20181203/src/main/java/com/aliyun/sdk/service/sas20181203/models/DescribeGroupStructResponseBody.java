// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGroupStructResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGroupStructResponseBody</p>
 */
public class DescribeGroupStructResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GroupFather")
    private Integer groupFather;

    @com.aliyun.core.annotation.NameInMap("GroupFlag")
    private Integer groupFlag;

    @com.aliyun.core.annotation.NameInMap("GroupId")
    private Long groupId;

    @com.aliyun.core.annotation.NameInMap("GroupIndex")
    private Integer groupIndex;

    @com.aliyun.core.annotation.NameInMap("GroupLevel")
    private Integer groupLevel;

    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.NameInMap("Groups")
    private java.util.List < String > groups;

    @com.aliyun.core.annotation.NameInMap("MachineNum")
    private Integer machineNum;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeGroupStructResponseBody(Builder builder) {
        this.groupFather = builder.groupFather;
        this.groupFlag = builder.groupFlag;
        this.groupId = builder.groupId;
        this.groupIndex = builder.groupIndex;
        this.groupLevel = builder.groupLevel;
        this.groupName = builder.groupName;
        this.groups = builder.groups;
        this.machineNum = builder.machineNum;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGroupStructResponseBody create() {
        return builder().build();
    }

    /**
     * @return groupFather
     */
    public Integer getGroupFather() {
        return this.groupFather;
    }

    /**
     * @return groupFlag
     */
    public Integer getGroupFlag() {
        return this.groupFlag;
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return groupIndex
     */
    public Integer getGroupIndex() {
        return this.groupIndex;
    }

    /**
     * @return groupLevel
     */
    public Integer getGroupLevel() {
        return this.groupLevel;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return groups
     */
    public java.util.List < String > getGroups() {
        return this.groups;
    }

    /**
     * @return machineNum
     */
    public Integer getMachineNum() {
        return this.machineNum;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer groupFather; 
        private Integer groupFlag; 
        private Long groupId; 
        private Integer groupIndex; 
        private Integer groupLevel; 
        private String groupName; 
        private java.util.List < String > groups; 
        private Integer machineNum; 
        private String requestId; 

        /**
         * The parent node of the group.
         */
        public Builder groupFather(Integer groupFather) {
            this.groupFather = groupFather;
            return this;
        }

        /**
         * The type of the server group. Valid values:
         * <p>
         * 
         * *   **0**: the default group
         * *   **1**: other groups
         */
        public Builder groupFlag(Integer groupFlag) {
            this.groupFlag = groupFlag;
            return this;
        }

        /**
         * The ID of the server group.
         */
        public Builder groupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * The sequence number.
         */
        public Builder groupIndex(Integer groupIndex) {
            this.groupIndex = groupIndex;
            return this;
        }

        /**
         * The level of the application group.
         */
        public Builder groupLevel(Integer groupLevel) {
            this.groupLevel = groupLevel;
            return this;
        }

        /**
         * The name of the server group.
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * An array that consists of child groups.
         */
        public Builder groups(java.util.List < String > groups) {
            this.groups = groups;
            return this;
        }

        /**
         * The number of servers in the group.
         */
        public Builder machineNum(Integer machineNum) {
            this.machineNum = machineNum;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeGroupStructResponseBody build() {
            return new DescribeGroupStructResponseBody(this);
        } 

    } 

}
