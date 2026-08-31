// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link ListAssetTopicsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAssetTopicsResponseBody</p>
 */
public class ListAssetTopicsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListAssetTopicsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAssetTopicsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListAssetTopicsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
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

        public ListAssetTopicsResponseBody build() {
            return new ListAssetTopicsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAssetTopicsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAssetTopicsResponseBody</p>
     */
    public static class Owners extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private Owners(Builder builder) {
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Owners create() {
            return builder().build();
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String userId; 
            private String userName; 

            private Builder() {
            } 

            private Builder(Owners model) {
                this.userId = model.userId;
                this.userName = model.userName;
            } 

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public Owners build() {
                return new Owners(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAssetTopicsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAssetTopicsResponseBody</p>
     */
    public static class VisibleUserGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserGroupId")
        private String userGroupId;

        @com.aliyun.core.annotation.NameInMap("UserGroupName")
        private String userGroupName;

        private VisibleUserGroups(Builder builder) {
            this.userGroupId = builder.userGroupId;
            this.userGroupName = builder.userGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VisibleUserGroups create() {
            return builder().build();
        }

        /**
         * @return userGroupId
         */
        public String getUserGroupId() {
            return this.userGroupId;
        }

        /**
         * @return userGroupName
         */
        public String getUserGroupName() {
            return this.userGroupName;
        }

        public static final class Builder {
            private String userGroupId; 
            private String userGroupName; 

            private Builder() {
            } 

            private Builder(VisibleUserGroups model) {
                this.userGroupId = model.userGroupId;
                this.userGroupName = model.userGroupName;
            } 

            /**
             * UserGroupId.
             */
            public Builder userGroupId(String userGroupId) {
                this.userGroupId = userGroupId;
                return this;
            }

            /**
             * UserGroupName.
             */
            public Builder userGroupName(String userGroupName) {
                this.userGroupName = userGroupName;
                return this;
            }

            public VisibleUserGroups build() {
                return new VisibleUserGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAssetTopicsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAssetTopicsResponseBody</p>
     */
    public static class VisibleUsers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private VisibleUsers(Builder builder) {
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VisibleUsers create() {
            return builder().build();
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String userId; 
            private String userName; 

            private Builder() {
            } 

            private Builder(VisibleUsers model) {
                this.userId = model.userId;
                this.userName = model.userName;
            } 

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public VisibleUsers build() {
                return new VisibleUsers(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAssetTopicsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAssetTopicsResponseBody</p>
     */
    public static class TopicList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetType")
        private String assetType;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Owners")
        private java.util.List<Owners> owners;

        @com.aliyun.core.annotation.NameInMap("TopicDescription")
        private String topicDescription;

        @com.aliyun.core.annotation.NameInMap("TopicId")
        private Long topicId;

        @com.aliyun.core.annotation.NameInMap("TopicName")
        private String topicName;

        @com.aliyun.core.annotation.NameInMap("VisibilityType")
        private String visibilityType;

        @com.aliyun.core.annotation.NameInMap("VisibleUserGroups")
        private java.util.List<VisibleUserGroups> visibleUserGroups;

        @com.aliyun.core.annotation.NameInMap("VisibleUsers")
        private java.util.List<VisibleUsers> visibleUsers;

        private TopicList(Builder builder) {
            this.assetType = builder.assetType;
            this.modifyTime = builder.modifyTime;
            this.owners = builder.owners;
            this.topicDescription = builder.topicDescription;
            this.topicId = builder.topicId;
            this.topicName = builder.topicName;
            this.visibilityType = builder.visibilityType;
            this.visibleUserGroups = builder.visibleUserGroups;
            this.visibleUsers = builder.visibleUsers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopicList create() {
            return builder().build();
        }

        /**
         * @return assetType
         */
        public String getAssetType() {
            return this.assetType;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return owners
         */
        public java.util.List<Owners> getOwners() {
            return this.owners;
        }

        /**
         * @return topicDescription
         */
        public String getTopicDescription() {
            return this.topicDescription;
        }

        /**
         * @return topicId
         */
        public Long getTopicId() {
            return this.topicId;
        }

        /**
         * @return topicName
         */
        public String getTopicName() {
            return this.topicName;
        }

        /**
         * @return visibilityType
         */
        public String getVisibilityType() {
            return this.visibilityType;
        }

        /**
         * @return visibleUserGroups
         */
        public java.util.List<VisibleUserGroups> getVisibleUserGroups() {
            return this.visibleUserGroups;
        }

        /**
         * @return visibleUsers
         */
        public java.util.List<VisibleUsers> getVisibleUsers() {
            return this.visibleUsers;
        }

        public static final class Builder {
            private String assetType; 
            private String modifyTime; 
            private java.util.List<Owners> owners; 
            private String topicDescription; 
            private Long topicId; 
            private String topicName; 
            private String visibilityType; 
            private java.util.List<VisibleUserGroups> visibleUserGroups; 
            private java.util.List<VisibleUsers> visibleUsers; 

            private Builder() {
            } 

            private Builder(TopicList model) {
                this.assetType = model.assetType;
                this.modifyTime = model.modifyTime;
                this.owners = model.owners;
                this.topicDescription = model.topicDescription;
                this.topicId = model.topicId;
                this.topicName = model.topicName;
                this.visibilityType = model.visibilityType;
                this.visibleUserGroups = model.visibleUserGroups;
                this.visibleUsers = model.visibleUsers;
            } 

            /**
             * AssetType.
             */
            public Builder assetType(String assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * Owners.
             */
            public Builder owners(java.util.List<Owners> owners) {
                this.owners = owners;
                return this;
            }

            /**
             * TopicDescription.
             */
            public Builder topicDescription(String topicDescription) {
                this.topicDescription = topicDescription;
                return this;
            }

            /**
             * TopicId.
             */
            public Builder topicId(Long topicId) {
                this.topicId = topicId;
                return this;
            }

            /**
             * TopicName.
             */
            public Builder topicName(String topicName) {
                this.topicName = topicName;
                return this;
            }

            /**
             * VisibilityType.
             */
            public Builder visibilityType(String visibilityType) {
                this.visibilityType = visibilityType;
                return this;
            }

            /**
             * VisibleUserGroups.
             */
            public Builder visibleUserGroups(java.util.List<VisibleUserGroups> visibleUserGroups) {
                this.visibleUserGroups = visibleUserGroups;
                return this;
            }

            /**
             * VisibleUsers.
             */
            public Builder visibleUsers(java.util.List<VisibleUsers> visibleUsers) {
                this.visibleUsers = visibleUsers;
                return this;
            }

            public TopicList build() {
                return new TopicList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAssetTopicsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAssetTopicsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TopicList")
        private java.util.List<TopicList> topicList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.topicList = builder.topicList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return topicList
         */
        public java.util.List<TopicList> getTopicList() {
            return this.topicList;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<TopicList> topicList; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.topicList = model.topicList;
                this.totalCount = model.totalCount;
            } 

            /**
             * TopicList.
             */
            public Builder topicList(java.util.List<TopicList> topicList) {
                this.topicList = topicList;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
