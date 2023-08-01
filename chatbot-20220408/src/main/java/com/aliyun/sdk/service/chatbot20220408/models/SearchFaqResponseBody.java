// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchFaqResponseBody} extends {@link TeaModel}
 *
 * <p>SearchFaqResponseBody</p>
 */
public class SearchFaqResponseBody extends TeaModel {
    @NameInMap("FaqHits")
    private java.util.List < FaqHits> faqHits;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private SearchFaqResponseBody(Builder builder) {
        this.faqHits = builder.faqHits;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchFaqResponseBody create() {
        return builder().build();
    }

    /**
     * @return faqHits
     */
    public java.util.List < FaqHits> getFaqHits() {
        return this.faqHits;
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
        private java.util.List < FaqHits> faqHits; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * FaqHits.
         */
        public Builder faqHits(java.util.List < FaqHits> faqHits) {
            this.faqHits = faqHits;
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

        public SearchFaqResponseBody build() {
            return new SearchFaqResponseBody(this);
        } 

    } 

    public static class FaqHits extends TeaModel {
        @NameInMap("CategoryId")
        private Long categoryId;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CreateUserId")
        private Long createUserId;

        @NameInMap("CreateUserName")
        private String createUserName;

        @NameInMap("EffectStatus")
        private Integer effectStatus;

        @NameInMap("HitSimilarTitles")
        private java.util.List < String > hitSimilarTitles;

        @NameInMap("HitSolutions")
        private java.util.List < String > hitSolutions;

        @NameInMap("KnowledgeId")
        private Long knowledgeId;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("ModifyUserId")
        private Long modifyUserId;

        @NameInMap("ModifyUserName")
        private String modifyUserName;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Title")
        private String title;

        private FaqHits(Builder builder) {
            this.categoryId = builder.categoryId;
            this.createTime = builder.createTime;
            this.createUserId = builder.createUserId;
            this.createUserName = builder.createUserName;
            this.effectStatus = builder.effectStatus;
            this.hitSimilarTitles = builder.hitSimilarTitles;
            this.hitSolutions = builder.hitSolutions;
            this.knowledgeId = builder.knowledgeId;
            this.modifyTime = builder.modifyTime;
            this.modifyUserId = builder.modifyUserId;
            this.modifyUserName = builder.modifyUserName;
            this.status = builder.status;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FaqHits create() {
            return builder().build();
        }

        /**
         * @return categoryId
         */
        public Long getCategoryId() {
            return this.categoryId;
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
        public Long getCreateUserId() {
            return this.createUserId;
        }

        /**
         * @return createUserName
         */
        public String getCreateUserName() {
            return this.createUserName;
        }

        /**
         * @return effectStatus
         */
        public Integer getEffectStatus() {
            return this.effectStatus;
        }

        /**
         * @return hitSimilarTitles
         */
        public java.util.List < String > getHitSimilarTitles() {
            return this.hitSimilarTitles;
        }

        /**
         * @return hitSolutions
         */
        public java.util.List < String > getHitSolutions() {
            return this.hitSolutions;
        }

        /**
         * @return knowledgeId
         */
        public Long getKnowledgeId() {
            return this.knowledgeId;
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
        public Long getModifyUserId() {
            return this.modifyUserId;
        }

        /**
         * @return modifyUserName
         */
        public String getModifyUserName() {
            return this.modifyUserName;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private Long categoryId; 
            private String createTime; 
            private Long createUserId; 
            private String createUserName; 
            private Integer effectStatus; 
            private java.util.List < String > hitSimilarTitles; 
            private java.util.List < String > hitSolutions; 
            private Long knowledgeId; 
            private String modifyTime; 
            private Long modifyUserId; 
            private String modifyUserName; 
            private Integer status; 
            private String title; 

            /**
             * CategoryId.
             */
            public Builder categoryId(Long categoryId) {
                this.categoryId = categoryId;
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
             * CreateUserId.
             */
            public Builder createUserId(Long createUserId) {
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
             * EffectStatus.
             */
            public Builder effectStatus(Integer effectStatus) {
                this.effectStatus = effectStatus;
                return this;
            }

            /**
             * HitSimilarTitles.
             */
            public Builder hitSimilarTitles(java.util.List < String > hitSimilarTitles) {
                this.hitSimilarTitles = hitSimilarTitles;
                return this;
            }

            /**
             * HitSolutions.
             */
            public Builder hitSolutions(java.util.List < String > hitSolutions) {
                this.hitSolutions = hitSolutions;
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
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * ModifyUserId.
             */
            public Builder modifyUserId(Long modifyUserId) {
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
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public FaqHits build() {
                return new FaqHits(this);
            } 

        } 

    }
}
