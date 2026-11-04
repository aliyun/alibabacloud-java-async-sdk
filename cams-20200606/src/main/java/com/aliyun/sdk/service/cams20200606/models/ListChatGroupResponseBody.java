// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link ListChatGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListChatGroupResponseBody</p>
 */
public class ListChatGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListChatGroupResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChatGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListChatGroupResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The details about the access denial.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The request status code. Valid values:</p>
         * <ul>
         * <li><p>OK: The request was successful.</p>
         * </li>
         * <li><p>For other error codes, see <a href="https://help.aliyun.com/document_detail/196974.html">Error codes</a>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The prompt message. This parameter has a value when an exception is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>90E63D28-E31D-1EB2-8939-A94866411B2O</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListChatGroupResponseBody build() {
            return new ListChatGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListChatGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListChatGroupResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BusinessNumber")
        private String businessNumber;

        @com.aliyun.core.annotation.NameInMap("BusinessRole")
        private String businessRole;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GmtModifier")
        private Long gmtModifier;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupLink")
        private String groupLink;

        @com.aliyun.core.annotation.NameInMap("GroupStatus")
        private String groupStatus;

        @com.aliyun.core.annotation.NameInMap("GroupType")
        private String groupType;

        @com.aliyun.core.annotation.NameInMap("InviteLink")
        private String inviteLink;

        @com.aliyun.core.annotation.NameInMap("ProfilePictureFile")
        private String profilePictureFile;

        @com.aliyun.core.annotation.NameInMap("Subject")
        private String subject;

        @com.aliyun.core.annotation.NameInMap("TotalParticipantCount")
        private Long totalParticipantCount;

        private List(Builder builder) {
            this.businessNumber = builder.businessNumber;
            this.businessRole = builder.businessRole;
            this.description = builder.description;
            this.gmtModifier = builder.gmtModifier;
            this.groupId = builder.groupId;
            this.groupLink = builder.groupLink;
            this.groupStatus = builder.groupStatus;
            this.groupType = builder.groupType;
            this.inviteLink = builder.inviteLink;
            this.profilePictureFile = builder.profilePictureFile;
            this.subject = builder.subject;
            this.totalParticipantCount = builder.totalParticipantCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return businessNumber
         */
        public String getBusinessNumber() {
            return this.businessNumber;
        }

        /**
         * @return businessRole
         */
        public String getBusinessRole() {
            return this.businessRole;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtModifier
         */
        public Long getGmtModifier() {
            return this.gmtModifier;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupLink
         */
        public String getGroupLink() {
            return this.groupLink;
        }

        /**
         * @return groupStatus
         */
        public String getGroupStatus() {
            return this.groupStatus;
        }

        /**
         * @return groupType
         */
        public String getGroupType() {
            return this.groupType;
        }

        /**
         * @return inviteLink
         */
        public String getInviteLink() {
            return this.inviteLink;
        }

        /**
         * @return profilePictureFile
         */
        public String getProfilePictureFile() {
            return this.profilePictureFile;
        }

        /**
         * @return subject
         */
        public String getSubject() {
            return this.subject;
        }

        /**
         * @return totalParticipantCount
         */
        public Long getTotalParticipantCount() {
            return this.totalParticipantCount;
        }

        public static final class Builder {
            private String businessNumber; 
            private String businessRole; 
            private String description; 
            private Long gmtModifier; 
            private String groupId; 
            private String groupLink; 
            private String groupStatus; 
            private String groupType; 
            private String inviteLink; 
            private String profilePictureFile; 
            private String subject; 
            private Long totalParticipantCount; 

            private Builder() {
            } 

            private Builder(List model) {
                this.businessNumber = model.businessNumber;
                this.businessRole = model.businessRole;
                this.description = model.description;
                this.gmtModifier = model.gmtModifier;
                this.groupId = model.groupId;
                this.groupLink = model.groupLink;
                this.groupStatus = model.groupStatus;
                this.groupType = model.groupType;
                this.inviteLink = model.inviteLink;
                this.profilePictureFile = model.profilePictureFile;
                this.subject = model.subject;
                this.totalParticipantCount = model.totalParticipantCount;
            } 

            /**
             * <p>The business phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>8613800**</p>
             */
            public Builder businessNumber(String businessNumber) {
                this.businessNumber = businessNumber;
                return this;
            }

            /**
             * <p>The role of the bot in the group.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder businessRole(String businessRole) {
                this.businessRole = businessRole;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>94</p>
             */
            public Builder gmtModifier(Long gmtModifier) {
                this.gmtModifier = gmtModifier;
                return this;
            }

            /**
             * <p>The group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>EA30d***</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The group link.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder groupLink(String groupLink) {
                this.groupLink = groupLink;
                return this;
            }

            /**
             * <p>The group status.</p>
             * 
             * <strong>example:</strong>
             * <p>ACTIVE</p>
             */
            public Builder groupStatus(String groupStatus) {
                this.groupStatus = groupStatus;
                return this;
            }

            /**
             * <p>The group type.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder groupType(String groupType) {
                this.groupType = groupType;
                return this;
            }

            /**
             * <p>The invite link.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://chat.whatsapp.com/">https://chat.whatsapp.com/</a>***</p>
             */
            public Builder inviteLink(String inviteLink) {
                this.inviteLink = inviteLink;
                return this;
            }

            /**
             * <p>The group profile picture.</p>
             */
            public Builder profilePictureFile(String profilePictureFile) {
                this.profilePictureFile = profilePictureFile;
                return this;
            }

            /**
             * <p>The group subject.</p>
             * 
             * <strong>example:</strong>
             * <p>This is a test subject</p>
             */
            public Builder subject(String subject) {
                this.subject = subject;
                return this;
            }

            /**
             * <p>The number of group members.</p>
             * 
             * <strong>example:</strong>
             * <p>35</p>
             */
            public Builder totalParticipantCount(Long totalParticipantCount) {
                this.totalParticipantCount = totalParticipantCount;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListChatGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListChatGroupResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.list = builder.list;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<List> list; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.total = model.total;
            } 

            /**
             * <p>The group list.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>51</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
