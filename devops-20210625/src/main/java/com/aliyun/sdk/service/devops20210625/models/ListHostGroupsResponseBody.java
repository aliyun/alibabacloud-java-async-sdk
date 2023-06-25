// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHostGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListHostGroupsResponseBody</p>
 */
public class ListHostGroupsResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMessage")
    private String errorMessage;

    @NameInMap("hostGroups")
    private java.util.List < HostGroups> hostGroups;

    @NameInMap("nextToken")
    private String nextToken;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("totalCount")
    private Long totalCount;

    private ListHostGroupsResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.hostGroups = builder.hostGroups;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHostGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return hostGroups
     */
    public java.util.List < HostGroups> getHostGroups() {
        return this.hostGroups;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private java.util.List < HostGroups> hostGroups; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * hostGroups.
         */
        public Builder hostGroups(java.util.List < HostGroups> hostGroups) {
            this.hostGroups = hostGroups;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListHostGroupsResponseBody build() {
            return new ListHostGroupsResponseBody(this);
        } 

    } 

    public static class HostGroups extends TeaModel {
        @NameInMap("aliyunRegion")
        private String aliyunRegion;

        @NameInMap("createTime")
        private Long createTime;

        @NameInMap("creatorAccountId")
        private String creatorAccountId;

        @NameInMap("description")
        private String description;

        @NameInMap("ecsLabelKey")
        private String ecsLabelKey;

        @NameInMap("ecsLabelValue")
        private String ecsLabelValue;

        @NameInMap("ecsType")
        private String ecsType;

        @NameInMap("hostNum")
        private Long hostNum;

        @NameInMap("id")
        private Long id;

        @NameInMap("modifierAccountId")
        private String modifierAccountId;

        @NameInMap("name")
        private String name;

        @NameInMap("serviceConnectionId")
        private Long serviceConnectionId;

        @NameInMap("type")
        private String type;

        @NameInMap("updateTime")
        private Long updateTime;

        private HostGroups(Builder builder) {
            this.aliyunRegion = builder.aliyunRegion;
            this.createTime = builder.createTime;
            this.creatorAccountId = builder.creatorAccountId;
            this.description = builder.description;
            this.ecsLabelKey = builder.ecsLabelKey;
            this.ecsLabelValue = builder.ecsLabelValue;
            this.ecsType = builder.ecsType;
            this.hostNum = builder.hostNum;
            this.id = builder.id;
            this.modifierAccountId = builder.modifierAccountId;
            this.name = builder.name;
            this.serviceConnectionId = builder.serviceConnectionId;
            this.type = builder.type;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostGroups create() {
            return builder().build();
        }

        /**
         * @return aliyunRegion
         */
        public String getAliyunRegion() {
            return this.aliyunRegion;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creatorAccountId
         */
        public String getCreatorAccountId() {
            return this.creatorAccountId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ecsLabelKey
         */
        public String getEcsLabelKey() {
            return this.ecsLabelKey;
        }

        /**
         * @return ecsLabelValue
         */
        public String getEcsLabelValue() {
            return this.ecsLabelValue;
        }

        /**
         * @return ecsType
         */
        public String getEcsType() {
            return this.ecsType;
        }

        /**
         * @return hostNum
         */
        public Long getHostNum() {
            return this.hostNum;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return modifierAccountId
         */
        public String getModifierAccountId() {
            return this.modifierAccountId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return serviceConnectionId
         */
        public Long getServiceConnectionId() {
            return this.serviceConnectionId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String aliyunRegion; 
            private Long createTime; 
            private String creatorAccountId; 
            private String description; 
            private String ecsLabelKey; 
            private String ecsLabelValue; 
            private String ecsType; 
            private Long hostNum; 
            private Long id; 
            private String modifierAccountId; 
            private String name; 
            private Long serviceConnectionId; 
            private String type; 
            private Long updateTime; 

            /**
             * aliyunRegion.
             */
            public Builder aliyunRegion(String aliyunRegion) {
                this.aliyunRegion = aliyunRegion;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * creatorAccountId.
             */
            public Builder creatorAccountId(String creatorAccountId) {
                this.creatorAccountId = creatorAccountId;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ecsLabelKey.
             */
            public Builder ecsLabelKey(String ecsLabelKey) {
                this.ecsLabelKey = ecsLabelKey;
                return this;
            }

            /**
             * ecsLabelValue.
             */
            public Builder ecsLabelValue(String ecsLabelValue) {
                this.ecsLabelValue = ecsLabelValue;
                return this;
            }

            /**
             * ecsType.
             */
            public Builder ecsType(String ecsType) {
                this.ecsType = ecsType;
                return this;
            }

            /**
             * hostNum.
             */
            public Builder hostNum(Long hostNum) {
                this.hostNum = hostNum;
                return this;
            }

            /**
             * 323232
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * modifierAccountId.
             */
            public Builder modifierAccountId(String modifierAccountId) {
                this.modifierAccountId = modifierAccountId;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * serviceConnectionId.
             */
            public Builder serviceConnectionId(Long serviceConnectionId) {
                this.serviceConnectionId = serviceConnectionId;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * updateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public HostGroups build() {
                return new HostGroups(this);
            } 

        } 

    }
}
