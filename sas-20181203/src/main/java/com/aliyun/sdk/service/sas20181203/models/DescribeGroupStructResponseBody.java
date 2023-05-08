// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGroupStructResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGroupStructResponseBody</p>
 */
public class DescribeGroupStructResponseBody extends TeaModel {
    @NameInMap("GroupFather")
    private Integer groupFather;

    @NameInMap("GroupFlag")
    private Integer groupFlag;

    @NameInMap("GroupId")
    private Long groupId;

    @NameInMap("GroupIndex")
    private Integer groupIndex;

    @NameInMap("GroupLevel")
    private Integer groupLevel;

    @NameInMap("GroupName")
    private String groupName;

    @NameInMap("Groups")
    private java.util.List < String > groups;

    @NameInMap("MachineNum")
    private Integer machineNum;

    @NameInMap("RequestId")
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
         * GroupFather.
         */
        public Builder groupFather(Integer groupFather) {
            this.groupFather = groupFather;
            return this;
        }

        /**
         * GroupFlag.
         */
        public Builder groupFlag(Integer groupFlag) {
            this.groupFlag = groupFlag;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * GroupIndex.
         */
        public Builder groupIndex(Integer groupIndex) {
            this.groupIndex = groupIndex;
            return this;
        }

        /**
         * GroupLevel.
         */
        public Builder groupLevel(Integer groupLevel) {
            this.groupLevel = groupLevel;
            return this;
        }

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * Groups.
         */
        public Builder groups(java.util.List < String > groups) {
            this.groups = groups;
            return this;
        }

        /**
         * MachineNum.
         */
        public Builder machineNum(Integer machineNum) {
            this.machineNum = machineNum;
            return this;
        }

        /**
         * RequestId.
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
