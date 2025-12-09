// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeSecureSuggestionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecureSuggestionResponseBody</p>
 */
public class DescribeSecureSuggestionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CalTime")
    private Long calTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Score")
    private String score;

    @com.aliyun.core.annotation.NameInMap("Suggestions")
    private java.util.List<Suggestions> suggestions;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeSecureSuggestionResponseBody(Builder builder) {
        this.calTime = builder.calTime;
        this.requestId = builder.requestId;
        this.score = builder.score;
        this.suggestions = builder.suggestions;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecureSuggestionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return calTime
     */
    public Long getCalTime() {
        return this.calTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return score
     */
    public String getScore() {
        return this.score;
    }

    /**
     * @return suggestions
     */
    public java.util.List<Suggestions> getSuggestions() {
        return this.suggestions;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Long calTime; 
        private String requestId; 
        private String score; 
        private java.util.List<Suggestions> suggestions; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeSecureSuggestionResponseBody model) {
            this.calTime = model.calTime;
            this.requestId = model.requestId;
            this.score = model.score;
            this.suggestions = model.suggestions;
            this.totalCount = model.totalCount;
        } 

        /**
         * CalTime.
         */
        public Builder calTime(Long calTime) {
            this.calTime = calTime;
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
         * Score.
         */
        public Builder score(String score) {
            this.score = score;
            return this;
        }

        /**
         * Suggestions.
         */
        public Builder suggestions(java.util.List<Suggestions> suggestions) {
            this.suggestions = suggestions;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSecureSuggestionResponseBody build() {
            return new DescribeSecureSuggestionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSecureSuggestionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecureSuggestionResponseBody</p>
     */
    public static class Detail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("SubType")
        private String subType;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Detail(Builder builder) {
            this.description = builder.description;
            this.subType = builder.subType;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Detail create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return subType
         */
        public String getSubType() {
            return this.subType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String description; 
            private String subType; 
            private String title; 

            private Builder() {
            } 

            private Builder(Detail model) {
                this.description = model.description;
                this.subType = model.subType;
                this.title = model.title;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * SubType.
             */
            public Builder subType(String subType) {
                this.subType = subType;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Detail build() {
                return new Detail(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSecureSuggestionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecureSuggestionResponseBody</p>
     */
    public static class Suggestions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Detail")
        private java.util.List<Detail> detail;

        @com.aliyun.core.annotation.NameInMap("Points")
        private Integer points;

        @com.aliyun.core.annotation.NameInMap("SuggestType")
        private String suggestType;

        private Suggestions(Builder builder) {
            this.detail = builder.detail;
            this.points = builder.points;
            this.suggestType = builder.suggestType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Suggestions create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public java.util.List<Detail> getDetail() {
            return this.detail;
        }

        /**
         * @return points
         */
        public Integer getPoints() {
            return this.points;
        }

        /**
         * @return suggestType
         */
        public String getSuggestType() {
            return this.suggestType;
        }

        public static final class Builder {
            private java.util.List<Detail> detail; 
            private Integer points; 
            private String suggestType; 

            private Builder() {
            } 

            private Builder(Suggestions model) {
                this.detail = model.detail;
                this.points = model.points;
                this.suggestType = model.suggestType;
            } 

            /**
             * Detail.
             */
            public Builder detail(java.util.List<Detail> detail) {
                this.detail = detail;
                return this;
            }

            /**
             * Points.
             */
            public Builder points(Integer points) {
                this.points = points;
                return this;
            }

            /**
             * SuggestType.
             */
            public Builder suggestType(String suggestType) {
                this.suggestType = suggestType;
                return this;
            }

            public Suggestions build() {
                return new Suggestions(this);
            } 

        } 

    }
}
