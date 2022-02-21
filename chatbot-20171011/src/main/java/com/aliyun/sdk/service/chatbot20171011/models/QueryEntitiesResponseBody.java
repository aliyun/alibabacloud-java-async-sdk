// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEntitiesResponseBody} extends {@link TeaModel}
 *
 * <p>QueryEntitiesResponseBody</p>
 */
public class QueryEntitiesResponseBody extends TeaModel {
    @NameInMap("Entities")
    private java.util.List < Entities> entities;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private QueryEntitiesResponseBody(Builder builder) {
        this.entities = builder.entities;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEntitiesResponseBody create() {
        return builder().build();
    }

    /**
     * @return entities
     */
    public java.util.List < Entities> getEntities() {
        return this.entities;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Entities> entities; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Entities.
         */
        public Builder entities(java.util.List < Entities> entities) {
            this.entities = entities;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QueryEntitiesResponseBody build() {
            return new QueryEntitiesResponseBody(this);
        } 

    } 

    public static class Members extends TeaModel {
        @NameInMap("MemberName")
        private String memberName;

        @NameInMap("Synonyms")
        private java.util.List < String > synonyms;

        private Members(Builder builder) {
            this.memberName = builder.memberName;
            this.synonyms = builder.synonyms;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Members create() {
            return builder().build();
        }

        /**
         * @return memberName
         */
        public String getMemberName() {
            return this.memberName;
        }

        /**
         * @return synonyms
         */
        public java.util.List < String > getSynonyms() {
            return this.synonyms;
        }

        public static final class Builder {
            private String memberName; 
            private java.util.List < String > synonyms; 

            /**
             * MemberName.
             */
            public Builder memberName(String memberName) {
                this.memberName = memberName;
                return this;
            }

            /**
             * Synonyms.
             */
            public Builder synonyms(java.util.List < String > synonyms) {
                this.synonyms = synonyms;
                return this;
            }

            public Members build() {
                return new Members(this);
            } 

        } 

    }
    public static class Entities extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CreateUserId")
        private String createUserId;

        @NameInMap("CreateUserName")
        private String createUserName;

        @NameInMap("EntityId")
        private Long entityId;

        @NameInMap("EntityName")
        private String entityName;

        @NameInMap("EntityType")
        private String entityType;

        @NameInMap("Members")
        private java.util.List < Members> members;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("ModifyUserId")
        private String modifyUserId;

        @NameInMap("ModifyUserName")
        private String modifyUserName;

        @NameInMap("Regex")
        private String regex;

        private Entities(Builder builder) {
            this.createTime = builder.createTime;
            this.createUserId = builder.createUserId;
            this.createUserName = builder.createUserName;
            this.entityId = builder.entityId;
            this.entityName = builder.entityName;
            this.entityType = builder.entityType;
            this.members = builder.members;
            this.modifyTime = builder.modifyTime;
            this.modifyUserId = builder.modifyUserId;
            this.modifyUserName = builder.modifyUserName;
            this.regex = builder.regex;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Entities create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUserId
         */
        public String getCreateUserId() {
            return this.createUserId;
        }

        /**
         * @return createUserName
         */
        public String getCreateUserName() {
            return this.createUserName;
        }

        /**
         * @return entityId
         */
        public Long getEntityId() {
            return this.entityId;
        }

        /**
         * @return entityName
         */
        public String getEntityName() {
            return this.entityName;
        }

        /**
         * @return entityType
         */
        public String getEntityType() {
            return this.entityType;
        }

        /**
         * @return members
         */
        public java.util.List < Members> getMembers() {
            return this.members;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return modifyUserId
         */
        public String getModifyUserId() {
            return this.modifyUserId;
        }

        /**
         * @return modifyUserName
         */
        public String getModifyUserName() {
            return this.modifyUserName;
        }

        /**
         * @return regex
         */
        public String getRegex() {
            return this.regex;
        }

        public static final class Builder {
            private String createTime; 
            private String createUserId; 
            private String createUserName; 
            private Long entityId; 
            private String entityName; 
            private String entityType; 
            private java.util.List < Members> members; 
            private String modifyTime; 
            private String modifyUserId; 
            private String modifyUserName; 
            private String regex; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreateUserId.
             */
            public Builder createUserId(String createUserId) {
                this.createUserId = createUserId;
                return this;
            }

            /**
             * CreateUserName.
             */
            public Builder createUserName(String createUserName) {
                this.createUserName = createUserName;
                return this;
            }

            /**
             * EntityId.
             */
            public Builder entityId(Long entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * EntityName.
             */
            public Builder entityName(String entityName) {
                this.entityName = entityName;
                return this;
            }

            /**
             * EntityType.
             */
            public Builder entityType(String entityType) {
                this.entityType = entityType;
                return this;
            }

            /**
             * Members.
             */
            public Builder members(java.util.List < Members> members) {
                this.members = members;
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
             * ModifyUserId.
             */
            public Builder modifyUserId(String modifyUserId) {
                this.modifyUserId = modifyUserId;
                return this;
            }

            /**
             * ModifyUserName.
             */
            public Builder modifyUserName(String modifyUserName) {
                this.modifyUserName = modifyUserName;
                return this;
            }

            /**
             * Regex.
             */
            public Builder regex(String regex) {
                this.regex = regex;
                return this;
            }

            public Entities build() {
                return new Entities(this);
            } 

        } 

    }
}
