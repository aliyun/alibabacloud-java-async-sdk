// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSecureSuggestionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecureSuggestionResponseBody</p>
 */
public class DescribeSecureSuggestionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Suggestions")
    private java.util.List < Suggestions> suggestions;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeSecureSuggestionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.suggestions = builder.suggestions;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecureSuggestionResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return suggestions
     */
    public java.util.List < Suggestions> getSuggestions() {
        return this.suggestions;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Suggestions> suggestions; 
        private Integer totalCount; 

        /**
         * 192.168.XX.XX
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Queries suggestions on how to handle the security risks that affect the security score.
         */
        public Builder suggestions(java.util.List < Suggestions> suggestions) {
            this.suggestions = suggestions;
            return this;
        }

        /**
         * The source IP address of the request.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSecureSuggestionResponseBody build() {
            return new DescribeSecureSuggestionResponseBody(this);
        } 

    } 

    public static class Detail extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("SubType")
        private String subType;

        @NameInMap("Title")
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
    public static class Suggestions extends TeaModel {
        @NameInMap("Detail")
        private java.util.List < Detail> detail;

        @NameInMap("Points")
        private Integer points;

        @NameInMap("SuggestType")
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
        public java.util.List < Detail> getDetail() {
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
            private java.util.List < Detail> detail; 
            private Integer points; 
            private String suggestType; 

            /**
             * Detail.
             */
            public Builder detail(java.util.List < Detail> detail) {
                this.detail = detail;
                return this;
            }

            /**
             * DescribeSecureSuggestion
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
