// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryKnowledgesResponseBody} extends {@link TeaModel}
 *
 * <p>QueryKnowledgesResponseBody</p>
 */
public class QueryKnowledgesResponseBody extends TeaModel {
    @NameInMap("Knowledges")
    private java.util.List < Knowledges> knowledges;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private QueryKnowledgesResponseBody(Builder builder) {
        this.knowledges = builder.knowledges;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryKnowledgesResponseBody create() {
        return builder().build();
    }

    /**
     * @return knowledges
     */
    public java.util.List < Knowledges> getKnowledges() {
        return this.knowledges;
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
        private java.util.List < Knowledges> knowledges; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Knowledges.
         */
        public Builder knowledges(java.util.List < Knowledges> knowledges) {
            this.knowledges = knowledges;
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

        public QueryKnowledgesResponseBody build() {
            return new QueryKnowledgesResponseBody(this);
        } 

    } 

    public static class Knowledges extends TeaModel {
        @NameInMap("CategoryId")
        private Long categoryId;

        @NameInMap("CoreWords")
        private java.util.List < String > coreWords;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CreateUserName")
        private String createUserName;

        @NameInMap("EndDate")
        private String endDate;

        @NameInMap("KnowledgeId")
        private Long knowledgeId;

        @NameInMap("KnowledgeStatus")
        private Integer knowledgeStatus;

        @NameInMap("KnowledgeTitle")
        private String knowledgeTitle;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("ModifyUserName")
        private String modifyUserName;

        @NameInMap("StartDate")
        private String startDate;

        @NameInMap("Version")
        private String version;

        private Knowledges(Builder builder) {
            this.categoryId = builder.categoryId;
            this.coreWords = builder.coreWords;
            this.createTime = builder.createTime;
            this.createUserName = builder.createUserName;
            this.endDate = builder.endDate;
            this.knowledgeId = builder.knowledgeId;
            this.knowledgeStatus = builder.knowledgeStatus;
            this.knowledgeTitle = builder.knowledgeTitle;
            this.modifyTime = builder.modifyTime;
            this.modifyUserName = builder.modifyUserName;
            this.startDate = builder.startDate;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Knowledges create() {
            return builder().build();
        }

        /**
         * @return categoryId
         */
        public Long getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return coreWords
         */
        public java.util.List < String > getCoreWords() {
            return this.coreWords;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUserName
         */
        public String getCreateUserName() {
            return this.createUserName;
        }

        /**
         * @return endDate
         */
        public String getEndDate() {
            return this.endDate;
        }

        /**
         * @return knowledgeId
         */
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        /**
         * @return knowledgeStatus
         */
        public Integer getKnowledgeStatus() {
            return this.knowledgeStatus;
        }

        /**
         * @return knowledgeTitle
         */
        public String getKnowledgeTitle() {
            return this.knowledgeTitle;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return modifyUserName
         */
        public String getModifyUserName() {
            return this.modifyUserName;
        }

        /**
         * @return startDate
         */
        public String getStartDate() {
            return this.startDate;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Long categoryId; 
            private java.util.List < String > coreWords; 
            private String createTime; 
            private String createUserName; 
            private String endDate; 
            private Long knowledgeId; 
            private Integer knowledgeStatus; 
            private String knowledgeTitle; 
            private String modifyTime; 
            private String modifyUserName; 
            private String startDate; 
            private String version; 

            /**
             * CategoryId.
             */
            public Builder categoryId(Long categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * CoreWords.
             */
            public Builder coreWords(java.util.List < String > coreWords) {
                this.coreWords = coreWords;
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
             * CreateUserName.
             */
            public Builder createUserName(String createUserName) {
                this.createUserName = createUserName;
                return this;
            }

            /**
             * EndDate.
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * KnowledgeId.
             */
            public Builder knowledgeId(Long knowledgeId) {
                this.knowledgeId = knowledgeId;
                return this;
            }

            /**
             * KnowledgeStatus.
             */
            public Builder knowledgeStatus(Integer knowledgeStatus) {
                this.knowledgeStatus = knowledgeStatus;
                return this;
            }

            /**
             * KnowledgeTitle.
             */
            public Builder knowledgeTitle(String knowledgeTitle) {
                this.knowledgeTitle = knowledgeTitle;
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
             * ModifyUserName.
             */
            public Builder modifyUserName(String modifyUserName) {
                this.modifyUserName = modifyUserName;
                return this;
            }

            /**
             * StartDate.
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Knowledges build() {
                return new Knowledges(this);
            } 

        } 

    }
}
