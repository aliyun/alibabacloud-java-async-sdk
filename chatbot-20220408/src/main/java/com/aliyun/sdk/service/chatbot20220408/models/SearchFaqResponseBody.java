// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

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
 * {@link SearchFaqResponseBody} extends {@link TeaModel}
 *
 * <p>SearchFaqResponseBody</p>
 */
public class SearchFaqResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FaqHits")
    private java.util.List<FaqHits> faqHits;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return faqHits
     */
    public java.util.List<FaqHits> getFaqHits() {
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
        private java.util.List<FaqHits> faqHits; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(SearchFaqResponseBody model) {
            this.faqHits = model.faqHits;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The knowledge search results.</p>
         */
        public Builder faqHits(java.util.List<FaqHits> faqHits) {
            this.faqHits = faqHits;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E45491D5-7E0A-42C6-9B21-91D1066B1475</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1075</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public SearchFaqResponseBody build() {
            return new SearchFaqResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchFaqResponseBody} extends {@link TeaModel}
     *
     * <p>SearchFaqResponseBody</p>
     */
    public static class FaqHits extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private Long categoryId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateUserId")
        private Long createUserId;

        @com.aliyun.core.annotation.NameInMap("CreateUserName")
        private String createUserName;

        @com.aliyun.core.annotation.NameInMap("EffectStatus")
        private Integer effectStatus;

        @com.aliyun.core.annotation.NameInMap("HitSimilarTitles")
        private java.util.List<String> hitSimilarTitles;

        @com.aliyun.core.annotation.NameInMap("HitSolutions")
        private java.util.List<String> hitSolutions;

        @com.aliyun.core.annotation.NameInMap("KnowledgeId")
        private Long knowledgeId;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("ModifyUserId")
        private Long modifyUserId;

        @com.aliyun.core.annotation.NameInMap("ModifyUserName")
        private String modifyUserName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Title")
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
        public java.util.List<String> getHitSimilarTitles() {
            return this.hitSimilarTitles;
        }

        /**
         * @return hitSolutions
         */
        public java.util.List<String> getHitSolutions() {
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
            private java.util.List<String> hitSimilarTitles; 
            private java.util.List<String> hitSolutions; 
            private Long knowledgeId; 
            private String modifyTime; 
            private Long modifyUserId; 
            private String modifyUserName; 
            private Integer status; 
            private String title; 

            private Builder() {
            } 

            private Builder(FaqHits model) {
                this.categoryId = model.categoryId;
                this.createTime = model.createTime;
                this.createUserId = model.createUserId;
                this.createUserName = model.createUserName;
                this.effectStatus = model.effectStatus;
                this.hitSimilarTitles = model.hitSimilarTitles;
                this.hitSolutions = model.hitSolutions;
                this.knowledgeId = model.knowledgeId;
                this.modifyTime = model.modifyTime;
                this.modifyUserId = model.modifyUserId;
                this.modifyUserName = model.modifyUserName;
                this.status = model.status;
                this.title = model.title;
            } 

            /**
             * <p>The category ID.</p>
             * 
             * <strong>example:</strong>
             * <p>30000055639</p>
             */
            public Builder categoryId(Long categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * <p>The creation time in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-02T03:09:30Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>18453</p>
             */
            public Builder createUserId(Long createUserId) {
                this.createUserId = createUserId;
                return this;
            }

            /**
             * <p>The name of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>test01</p>
             */
            public Builder createUserName(String createUserName) {
                this.createUserName = createUserName;
                return this;
            }

            /**
             * <p>The effective status of the knowledge, calculated based on StartDate and EndDate. Valid values:</p>
             * <ul>
             * <li>20: Active.</li>
             * <li>21: Expired.</li>
             * <li>22: Pending.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder effectStatus(Integer effectStatus) {
                this.effectStatus = effectStatus;
                return this;
            }

            /**
             * <p>The list of hit similar questions.</p>
             */
            public Builder hitSimilarTitles(java.util.List<String> hitSimilarTitles) {
                this.hitSimilarTitles = hitSimilarTitles;
                return this;
            }

            /**
             * <p>The list of hit solutions.</p>
             */
            public Builder hitSolutions(java.util.List<String> hitSolutions) {
                this.hitSolutions = hitSolutions;
                return this;
            }

            /**
             * <p>The knowledge ID.</p>
             * 
             * <strong>example:</strong>
             * <p>30002145804</p>
             */
            public Builder knowledgeId(Long knowledgeId) {
                this.knowledgeId = knowledgeId;
                return this;
            }

            /**
             * <p>The modification time in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-02T03:09:30Z</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The ID of the modifier.</p>
             * 
             * <strong>example:</strong>
             * <p>18453</p>
             */
            public Builder modifyUserId(Long modifyUserId) {
                this.modifyUserId = modifyUserId;
                return this;
            }

            /**
             * <p>The name of the modifier.</p>
             * 
             * <strong>example:</strong>
             * <p>test01</p>
             */
            public Builder modifyUserName(String modifyUserName) {
                this.modifyUserName = modifyUserName;
                return this;
            }

            /**
             * <p>The knowledge status. Valid values:</p>
             * <ul>
             * <li>-1: deleted and unpublished.</li>
             * <li>1: unpublished.</li>
             * <li>2: published.</li>
             * <li>3: updated and unpublished.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The title.</p>
             * 
             * <strong>example:</strong>
             * <p>Test title</p>
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
