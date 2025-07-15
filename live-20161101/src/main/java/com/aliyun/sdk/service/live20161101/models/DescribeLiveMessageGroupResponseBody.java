// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLiveMessageGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveMessageGroupResponseBody</p>
 */
public class DescribeLiveMessageGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AdminList")
    private java.util.List<String> adminList;

    @com.aliyun.core.annotation.NameInMap("Createtime")
    private Long createtime;

    @com.aliyun.core.annotation.NameInMap("CreatorId")
    private String creatorId;

    @com.aliyun.core.annotation.NameInMap("Deletatime")
    private Long deletatime;

    @com.aliyun.core.annotation.NameInMap("Delete")
    private Boolean delete;

    @com.aliyun.core.annotation.NameInMap("Deletor")
    private String deletor;

    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("GroupInfo")
    private String groupInfo;

    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.NameInMap("MsgAmount")
    private java.util.Map<String, Long> msgAmount;

    @com.aliyun.core.annotation.NameInMap("OnlineUserCounts")
    private Long onlineUserCounts;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SuperLargeGroup")
    private Boolean superLargeGroup;

    @com.aliyun.core.annotation.NameInMap("TotalTimes")
    private Long totalTimes;

    private DescribeLiveMessageGroupResponseBody(Builder builder) {
        this.adminList = builder.adminList;
        this.createtime = builder.createtime;
        this.creatorId = builder.creatorId;
        this.deletatime = builder.deletatime;
        this.delete = builder.delete;
        this.deletor = builder.deletor;
        this.groupId = builder.groupId;
        this.groupInfo = builder.groupInfo;
        this.groupName = builder.groupName;
        this.msgAmount = builder.msgAmount;
        this.onlineUserCounts = builder.onlineUserCounts;
        this.requestId = builder.requestId;
        this.superLargeGroup = builder.superLargeGroup;
        this.totalTimes = builder.totalTimes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveMessageGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adminList
     */
    public java.util.List<String> getAdminList() {
        return this.adminList;
    }

    /**
     * @return createtime
     */
    public Long getCreatetime() {
        return this.createtime;
    }

    /**
     * @return creatorId
     */
    public String getCreatorId() {
        return this.creatorId;
    }

    /**
     * @return deletatime
     */
    public Long getDeletatime() {
        return this.deletatime;
    }

    /**
     * @return delete
     */
    public Boolean getDelete() {
        return this.delete;
    }

    /**
     * @return deletor
     */
    public String getDeletor() {
        return this.deletor;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return groupInfo
     */
    public String getGroupInfo() {
        return this.groupInfo;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return msgAmount
     */
    public java.util.Map<String, Long> getMsgAmount() {
        return this.msgAmount;
    }

    /**
     * @return onlineUserCounts
     */
    public Long getOnlineUserCounts() {
        return this.onlineUserCounts;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return superLargeGroup
     */
    public Boolean getSuperLargeGroup() {
        return this.superLargeGroup;
    }

    /**
     * @return totalTimes
     */
    public Long getTotalTimes() {
        return this.totalTimes;
    }

    public static final class Builder {
        private java.util.List<String> adminList; 
        private Long createtime; 
        private String creatorId; 
        private Long deletatime; 
        private Boolean delete; 
        private String deletor; 
        private String groupId; 
        private String groupInfo; 
        private String groupName; 
        private java.util.Map<String, Long> msgAmount; 
        private Long onlineUserCounts; 
        private String requestId; 
        private Boolean superLargeGroup; 
        private Long totalTimes; 

        private Builder() {
        } 

        private Builder(DescribeLiveMessageGroupResponseBody model) {
            this.adminList = model.adminList;
            this.createtime = model.createtime;
            this.creatorId = model.creatorId;
            this.deletatime = model.deletatime;
            this.delete = model.delete;
            this.deletor = model.deletor;
            this.groupId = model.groupId;
            this.groupInfo = model.groupInfo;
            this.groupName = model.groupName;
            this.msgAmount = model.msgAmount;
            this.onlineUserCounts = model.onlineUserCounts;
            this.requestId = model.requestId;
            this.superLargeGroup = model.superLargeGroup;
            this.totalTimes = model.totalTimes;
        } 

        /**
         * <p>The list of the group administrators.</p>
         */
        public Builder adminList(java.util.List<String> adminList) {
            this.adminList = adminList;
            return this;
        }

        /**
         * <p>The time when the group was created. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1698305471</p>
         */
        public Builder createtime(Long createtime) {
            this.createtime = createtime;
            return this;
        }

        /**
         * <p>The ID of the group creator.</p>
         * 
         * <strong>example:</strong>
         * <p>uid1</p>
         */
        public Builder creatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }

        /**
         * <p>The time when the group was deleted. This parameter is returned only if the group was deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>1698299827</p>
         */
        public Builder deletatime(Long deletatime) {
            this.deletatime = deletatime;
            return this;
        }

        /**
         * <p>Indicates whether the group was deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder delete(Boolean delete) {
            this.delete = delete;
            return this;
        }

        /**
         * <p>The ID of the user who deleted the group. This parameter is returned only if the group was deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>uid1</p>
         */
        public Builder deletor(String deletor) {
            this.deletor = deletor;
            return this;
        }

        /**
         * <p>The group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>grouptest1</p>
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>Additional information about the group.</p>
         * 
         * <strong>example:</strong>
         * <p>testgroupinfo</p>
         */
        public Builder groupInfo(String groupInfo) {
            this.groupInfo = groupInfo;
            return this;
        }

        /**
         * <p>The name of the group.</p>
         * 
         * <strong>example:</strong>
         * <p>mytestgroup</p>
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>The categorized message statistics. This parameter is returned only if the group exists.</p>
         */
        public Builder msgAmount(java.util.Map<String, Long> msgAmount) {
            this.msgAmount = msgAmount;
            return this;
        }

        /**
         * <p>The number of online users in the group. This parameter is returned only if the group exists.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder onlineUserCounts(Long onlineUserCounts) {
            this.onlineUserCounts = onlineUserCounts;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1815A27D-BAE2-10E6-89FD-D477951C67C7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the group is a super group. Valid values:</p>
         * <ul>
         * <li>True</li>
         * <li>False</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder superLargeGroup(Boolean superLargeGroup) {
            this.superLargeGroup = superLargeGroup;
            return this;
        }

        /**
         * <p>The total number of sessions. This parameter is returned only if the group exists.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder totalTimes(Long totalTimes) {
            this.totalTimes = totalTimes;
            return this;
        }

        public DescribeLiveMessageGroupResponseBody build() {
            return new DescribeLiveMessageGroupResponseBody(this);
        } 

    } 

}
