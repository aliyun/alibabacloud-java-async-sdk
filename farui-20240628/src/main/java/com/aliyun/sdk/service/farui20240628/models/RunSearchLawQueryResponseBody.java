// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.farui20240628.models;

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
 * {@link RunSearchLawQueryResponseBody} extends {@link TeaModel}
 *
 * <p>RunSearchLawQueryResponseBody</p>
 */
public class RunSearchLawQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Long httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private RunSearchLawQueryResponseBody(Builder builder) {
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

    public static RunSearchLawQueryResponseBody create() {
        return builder().build();
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
    public Long getHttpStatusCode() {
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
        private Long httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>05062567-EB51-50F6-AF56-0BE44955848D</p>
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

        public RunSearchLawQueryResponseBody build() {
            return new RunSearchLawQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RunSearchLawQueryResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchLawQueryResponseBody</p>
     */
    public static class LawDomain extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("abolitionBasis")
        private String abolitionBasis;

        @com.aliyun.core.annotation.NameInMap("implementYearMonthDate")
        private String implementYearMonthDate;

        @com.aliyun.core.annotation.NameInMap("invalidBasis")
        private String invalidBasis;

        @com.aliyun.core.annotation.NameInMap("issuingNo")
        private String issuingNo;

        @com.aliyun.core.annotation.NameInMap("issuingOrgan")
        private String issuingOrgan;

        @com.aliyun.core.annotation.NameInMap("lawId")
        private String lawId;

        @com.aliyun.core.annotation.NameInMap("lawItemId")
        private String lawItemId;

        @com.aliyun.core.annotation.NameInMap("lawName")
        private String lawName;

        @com.aliyun.core.annotation.NameInMap("lawOrder")
        private String lawOrder;

        @com.aliyun.core.annotation.NameInMap("lawSourceContent")
        private String lawSourceContent;

        @com.aliyun.core.annotation.NameInMap("lawTitle")
        private String lawTitle;

        @com.aliyun.core.annotation.NameInMap("modifyBasis")
        private String modifyBasis;

        @com.aliyun.core.annotation.NameInMap("potencyLevel")
        private String potencyLevel;

        @com.aliyun.core.annotation.NameInMap("releaseYearMonthDate")
        private String releaseYearMonthDate;

        @com.aliyun.core.annotation.NameInMap("thematicClassify")
        private String thematicClassify;

        @com.aliyun.core.annotation.NameInMap("timeliness")
        private String timeliness;

        private LawDomain(Builder builder) {
            this.abolitionBasis = builder.abolitionBasis;
            this.implementYearMonthDate = builder.implementYearMonthDate;
            this.invalidBasis = builder.invalidBasis;
            this.issuingNo = builder.issuingNo;
            this.issuingOrgan = builder.issuingOrgan;
            this.lawId = builder.lawId;
            this.lawItemId = builder.lawItemId;
            this.lawName = builder.lawName;
            this.lawOrder = builder.lawOrder;
            this.lawSourceContent = builder.lawSourceContent;
            this.lawTitle = builder.lawTitle;
            this.modifyBasis = builder.modifyBasis;
            this.potencyLevel = builder.potencyLevel;
            this.releaseYearMonthDate = builder.releaseYearMonthDate;
            this.thematicClassify = builder.thematicClassify;
            this.timeliness = builder.timeliness;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LawDomain create() {
            return builder().build();
        }

        /**
         * @return abolitionBasis
         */
        public String getAbolitionBasis() {
            return this.abolitionBasis;
        }

        /**
         * @return implementYearMonthDate
         */
        public String getImplementYearMonthDate() {
            return this.implementYearMonthDate;
        }

        /**
         * @return invalidBasis
         */
        public String getInvalidBasis() {
            return this.invalidBasis;
        }

        /**
         * @return issuingNo
         */
        public String getIssuingNo() {
            return this.issuingNo;
        }

        /**
         * @return issuingOrgan
         */
        public String getIssuingOrgan() {
            return this.issuingOrgan;
        }

        /**
         * @return lawId
         */
        public String getLawId() {
            return this.lawId;
        }

        /**
         * @return lawItemId
         */
        public String getLawItemId() {
            return this.lawItemId;
        }

        /**
         * @return lawName
         */
        public String getLawName() {
            return this.lawName;
        }

        /**
         * @return lawOrder
         */
        public String getLawOrder() {
            return this.lawOrder;
        }

        /**
         * @return lawSourceContent
         */
        public String getLawSourceContent() {
            return this.lawSourceContent;
        }

        /**
         * @return lawTitle
         */
        public String getLawTitle() {
            return this.lawTitle;
        }

        /**
         * @return modifyBasis
         */
        public String getModifyBasis() {
            return this.modifyBasis;
        }

        /**
         * @return potencyLevel
         */
        public String getPotencyLevel() {
            return this.potencyLevel;
        }

        /**
         * @return releaseYearMonthDate
         */
        public String getReleaseYearMonthDate() {
            return this.releaseYearMonthDate;
        }

        /**
         * @return thematicClassify
         */
        public String getThematicClassify() {
            return this.thematicClassify;
        }

        /**
         * @return timeliness
         */
        public String getTimeliness() {
            return this.timeliness;
        }

        public static final class Builder {
            private String abolitionBasis; 
            private String implementYearMonthDate; 
            private String invalidBasis; 
            private String issuingNo; 
            private String issuingOrgan; 
            private String lawId; 
            private String lawItemId; 
            private String lawName; 
            private String lawOrder; 
            private String lawSourceContent; 
            private String lawTitle; 
            private String modifyBasis; 
            private String potencyLevel; 
            private String releaseYearMonthDate; 
            private String thematicClassify; 
            private String timeliness; 

            /**
             * abolitionBasis.
             */
            public Builder abolitionBasis(String abolitionBasis) {
                this.abolitionBasis = abolitionBasis;
                return this;
            }

            /**
             * implementYearMonthDate.
             */
            public Builder implementYearMonthDate(String implementYearMonthDate) {
                this.implementYearMonthDate = implementYearMonthDate;
                return this;
            }

            /**
             * invalidBasis.
             */
            public Builder invalidBasis(String invalidBasis) {
                this.invalidBasis = invalidBasis;
                return this;
            }

            /**
             * issuingNo.
             */
            public Builder issuingNo(String issuingNo) {
                this.issuingNo = issuingNo;
                return this;
            }

            /**
             * issuingOrgan.
             */
            public Builder issuingOrgan(String issuingOrgan) {
                this.issuingOrgan = issuingOrgan;
                return this;
            }

            /**
             * lawId.
             */
            public Builder lawId(String lawId) {
                this.lawId = lawId;
                return this;
            }

            /**
             * lawItemId.
             */
            public Builder lawItemId(String lawItemId) {
                this.lawItemId = lawItemId;
                return this;
            }

            /**
             * lawName.
             */
            public Builder lawName(String lawName) {
                this.lawName = lawName;
                return this;
            }

            /**
             * lawOrder.
             */
            public Builder lawOrder(String lawOrder) {
                this.lawOrder = lawOrder;
                return this;
            }

            /**
             * lawSourceContent.
             */
            public Builder lawSourceContent(String lawSourceContent) {
                this.lawSourceContent = lawSourceContent;
                return this;
            }

            /**
             * lawTitle.
             */
            public Builder lawTitle(String lawTitle) {
                this.lawTitle = lawTitle;
                return this;
            }

            /**
             * modifyBasis.
             */
            public Builder modifyBasis(String modifyBasis) {
                this.modifyBasis = modifyBasis;
                return this;
            }

            /**
             * potencyLevel.
             */
            public Builder potencyLevel(String potencyLevel) {
                this.potencyLevel = potencyLevel;
                return this;
            }

            /**
             * releaseYearMonthDate.
             */
            public Builder releaseYearMonthDate(String releaseYearMonthDate) {
                this.releaseYearMonthDate = releaseYearMonthDate;
                return this;
            }

            /**
             * thematicClassify.
             */
            public Builder thematicClassify(String thematicClassify) {
                this.thematicClassify = thematicClassify;
                return this;
            }

            /**
             * timeliness.
             */
            public Builder timeliness(String timeliness) {
                this.timeliness = timeliness;
                return this;
            }

            public LawDomain build() {
                return new LawDomain(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchLawQueryResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchLawQueryResponseBody</p>
     */
    public static class LawResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("lawDomain")
        private LawDomain lawDomain;

        @com.aliyun.core.annotation.NameInMap("similarity")
        private String similarity;

        private LawResult(Builder builder) {
            this.lawDomain = builder.lawDomain;
            this.similarity = builder.similarity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LawResult create() {
            return builder().build();
        }

        /**
         * @return lawDomain
         */
        public LawDomain getLawDomain() {
            return this.lawDomain;
        }

        /**
         * @return similarity
         */
        public String getSimilarity() {
            return this.similarity;
        }

        public static final class Builder {
            private LawDomain lawDomain; 
            private String similarity; 

            /**
             * lawDomain.
             */
            public Builder lawDomain(LawDomain lawDomain) {
                this.lawDomain = lawDomain;
                return this;
            }

            /**
             * similarity.
             */
            public Builder similarity(String similarity) {
                this.similarity = similarity;
                return this;
            }

            public LawResult build() {
                return new LawResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchLawQueryResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchLawQueryResponseBody</p>
     */
    public static class SortKeyAndDirection extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("releaseYearMonthDate")
        private String releaseYearMonthDate;

        @com.aliyun.core.annotation.NameInMap("similarity")
        private String similarity;

        private SortKeyAndDirection(Builder builder) {
            this.releaseYearMonthDate = builder.releaseYearMonthDate;
            this.similarity = builder.similarity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SortKeyAndDirection create() {
            return builder().build();
        }

        /**
         * @return releaseYearMonthDate
         */
        public String getReleaseYearMonthDate() {
            return this.releaseYearMonthDate;
        }

        /**
         * @return similarity
         */
        public String getSimilarity() {
            return this.similarity;
        }

        public static final class Builder {
            private String releaseYearMonthDate; 
            private String similarity; 

            /**
             * releaseYearMonthDate.
             */
            public Builder releaseYearMonthDate(String releaseYearMonthDate) {
                this.releaseYearMonthDate = releaseYearMonthDate;
                return this;
            }

            /**
             * similarity.
             */
            public Builder similarity(String similarity) {
                this.similarity = similarity;
                return this;
            }

            public SortKeyAndDirection build() {
                return new SortKeyAndDirection(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchLawQueryResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchLawQueryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("currentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("lawResult")
        private java.util.List<LawResult> lawResult;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("query")
        private String query;

        @com.aliyun.core.annotation.NameInMap("queryKeywords")
        private java.util.List<String> queryKeywords;

        @com.aliyun.core.annotation.NameInMap("sortKeyAndDirection")
        private SortKeyAndDirection sortKeyAndDirection;

        @com.aliyun.core.annotation.NameInMap("totalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.currentPage = builder.currentPage;
            this.lawResult = builder.lawResult;
            this.pageSize = builder.pageSize;
            this.query = builder.query;
            this.queryKeywords = builder.queryKeywords;
            this.sortKeyAndDirection = builder.sortKeyAndDirection;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return lawResult
         */
        public java.util.List<LawResult> getLawResult() {
            return this.lawResult;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return query
         */
        public String getQuery() {
            return this.query;
        }

        /**
         * @return queryKeywords
         */
        public java.util.List<String> getQueryKeywords() {
            return this.queryKeywords;
        }

        /**
         * @return sortKeyAndDirection
         */
        public SortKeyAndDirection getSortKeyAndDirection() {
            return this.sortKeyAndDirection;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer currentPage; 
            private java.util.List<LawResult> lawResult; 
            private Integer pageSize; 
            private String query; 
            private java.util.List<String> queryKeywords; 
            private SortKeyAndDirection sortKeyAndDirection; 
            private Long totalCount; 

            /**
             * currentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * lawResult.
             */
            public Builder lawResult(java.util.List<LawResult> lawResult) {
                this.lawResult = lawResult;
                return this;
            }

            /**
             * pageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * query.
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            /**
             * queryKeywords.
             */
            public Builder queryKeywords(java.util.List<String> queryKeywords) {
                this.queryKeywords = queryKeywords;
                return this;
            }

            /**
             * sortKeyAndDirection.
             */
            public Builder sortKeyAndDirection(SortKeyAndDirection sortKeyAndDirection) {
                this.sortKeyAndDirection = sortKeyAndDirection;
                return this;
            }

            /**
             * totalCount.
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
