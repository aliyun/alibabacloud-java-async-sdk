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
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
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

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupStatus")
        private String groupStatus;

        @com.aliyun.core.annotation.NameInMap("InviteLink")
        private String inviteLink;

        @com.aliyun.core.annotation.NameInMap("ProfilePictureFile")
        private String profilePictureFile;

        @com.aliyun.core.annotation.NameInMap("Subject")
        private String subject;

        private List(Builder builder) {
            this.businessNumber = builder.businessNumber;
            this.description = builder.description;
            this.groupId = builder.groupId;
            this.groupStatus = builder.groupStatus;
            this.inviteLink = builder.inviteLink;
            this.profilePictureFile = builder.profilePictureFile;
            this.subject = builder.subject;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupStatus
         */
        public String getGroupStatus() {
            return this.groupStatus;
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

        public static final class Builder {
            private String businessNumber; 
            private String description; 
            private String groupId; 
            private String groupStatus; 
            private String inviteLink; 
            private String profilePictureFile; 
            private String subject; 

            private Builder() {
            } 

            private Builder(List model) {
                this.businessNumber = model.businessNumber;
                this.description = model.description;
                this.groupId = model.groupId;
                this.groupStatus = model.groupStatus;
                this.inviteLink = model.inviteLink;
                this.profilePictureFile = model.profilePictureFile;
                this.subject = model.subject;
            } 

            /**
             * BusinessNumber.
             */
            public Builder businessNumber(String businessNumber) {
                this.businessNumber = businessNumber;
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
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * GroupStatus.
             */
            public Builder groupStatus(String groupStatus) {
                this.groupStatus = groupStatus;
                return this;
            }

            /**
             * InviteLink.
             */
            public Builder inviteLink(String inviteLink) {
                this.inviteLink = inviteLink;
                return this;
            }

            /**
             * ProfilePictureFile.
             */
            public Builder profilePictureFile(String profilePictureFile) {
                this.profilePictureFile = profilePictureFile;
                return this;
            }

            /**
             * Subject.
             */
            public Builder subject(String subject) {
                this.subject = subject;
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
             * List.
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * Total.
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
