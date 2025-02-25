// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
    private java.util.List<String> groups;

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
    public java.util.List<String> getGroups() {
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
        private java.util.List<String> groups; 
        private Integer machineNum; 
        private String requestId; 

        /**
         * <p>The parent node of the group.</p>
         * 
         * <strong>example:</strong>
         * <p>958****</p>
         */
        public Builder groupFather(Integer groupFather) {
            this.groupFather = groupFather;
            return this;
        }

        /**
         * <p>The type of the server group. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: the default group</li>
         * <li><strong>1</strong>: other groups</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder groupFlag(Integer groupFlag) {
            this.groupFlag = groupFlag;
            return this;
        }

        /**
         * <p>The ID of the server group.</p>
         * 
         * <strong>example:</strong>
         * <p>958****</p>
         */
        public Builder groupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The sequence number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder groupIndex(Integer groupIndex) {
            this.groupIndex = groupIndex;
            return this;
        }

        /**
         * <p>The level of the application group.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder groupLevel(Integer groupLevel) {
            this.groupLevel = groupLevel;
            return this;
        }

        /**
         * <p>The name of the server group.</p>
         * 
         * <strong>example:</strong>
         * <p>TestGroupName</p>
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>An array that consists of child groups.</p>
         */
        public Builder groups(java.util.List<String> groups) {
            this.groups = groups;
            return this;
        }

        /**
         * <p>The number of servers in the group.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder machineNum(Integer machineNum) {
            this.machineNum = machineNum;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>9FBC6E47-7508-58C9-9E76-528E118C****</p>
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
