// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBizTypeImageLibResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBizTypeImageLibResponseBody</p>
 */
public class DescribeBizTypeImageLibResponseBody extends TeaModel {
    @NameInMap("Black")
    private Black black;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Review")
    private Review review;

    @NameInMap("White")
    private White white;

    private DescribeBizTypeImageLibResponseBody(Builder builder) {
        this.black = builder.black;
        this.requestId = builder.requestId;
        this.review = builder.review;
        this.white = builder.white;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBizTypeImageLibResponseBody create() {
        return builder().build();
    }

    /**
     * @return black
     */
    public Black getBlack() {
        return this.black;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return review
     */
    public Review getReview() {
        return this.review;
    }

    /**
     * @return white
     */
    public White getWhite() {
        return this.white;
    }

    public static final class Builder {
        private Black black; 
        private String requestId; 
        private Review review; 
        private White white; 

        /**
         * Black.
         */
        public Builder black(Black black) {
            this.black = black;
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
         * Review.
         */
        public Builder review(Review review) {
            this.review = review;
            return this;
        }

        /**
         * White.
         */
        public Builder white(White white) {
            this.white = white;
            return this;
        }

        public DescribeBizTypeImageLibResponseBody build() {
            return new DescribeBizTypeImageLibResponseBody(this);
        } 

    } 

    public static class All extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Name")
        private String name;

        private All(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static All create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String code; 
            private String name; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public All build() {
                return new All(this);
            } 

        } 

    }
    public static class Selected extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Name")
        private String name;

        private Selected(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Selected create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String code; 
            private String name; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Selected build() {
                return new Selected(this);
            } 

        } 

    }
    public static class Black extends TeaModel {
        @NameInMap("All")
        private java.util.List < All> all;

        @NameInMap("Selected")
        private java.util.List < Selected> selected;

        private Black(Builder builder) {
            this.all = builder.all;
            this.selected = builder.selected;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Black create() {
            return builder().build();
        }

        /**
         * @return all
         */
        public java.util.List < All> getAll() {
            return this.all;
        }

        /**
         * @return selected
         */
        public java.util.List < Selected> getSelected() {
            return this.selected;
        }

        public static final class Builder {
            private java.util.List < All> all; 
            private java.util.List < Selected> selected; 

            /**
             * All.
             */
            public Builder all(java.util.List < All> all) {
                this.all = all;
                return this;
            }

            /**
             * Selected.
             */
            public Builder selected(java.util.List < Selected> selected) {
                this.selected = selected;
                return this;
            }

            public Black build() {
                return new Black(this);
            } 

        } 

    }
    public static class ReviewAll extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Name")
        private String name;

        private ReviewAll(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReviewAll create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String code; 
            private String name; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ReviewAll build() {
                return new ReviewAll(this);
            } 

        } 

    }
    public static class ReviewSelected extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Name")
        private String name;

        private ReviewSelected(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReviewSelected create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String code; 
            private String name; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ReviewSelected build() {
                return new ReviewSelected(this);
            } 

        } 

    }
    public static class Review extends TeaModel {
        @NameInMap("All")
        private java.util.List < ReviewAll> all;

        @NameInMap("Selected")
        private java.util.List < ReviewSelected> selected;

        private Review(Builder builder) {
            this.all = builder.all;
            this.selected = builder.selected;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Review create() {
            return builder().build();
        }

        /**
         * @return all
         */
        public java.util.List < ReviewAll> getAll() {
            return this.all;
        }

        /**
         * @return selected
         */
        public java.util.List < ReviewSelected> getSelected() {
            return this.selected;
        }

        public static final class Builder {
            private java.util.List < ReviewAll> all; 
            private java.util.List < ReviewSelected> selected; 

            /**
             * All.
             */
            public Builder all(java.util.List < ReviewAll> all) {
                this.all = all;
                return this;
            }

            /**
             * Selected.
             */
            public Builder selected(java.util.List < ReviewSelected> selected) {
                this.selected = selected;
                return this;
            }

            public Review build() {
                return new Review(this);
            } 

        } 

    }
    public static class WhiteAll extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Name")
        private String name;

        private WhiteAll(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WhiteAll create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String code; 
            private String name; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public WhiteAll build() {
                return new WhiteAll(this);
            } 

        } 

    }
    public static class WhiteSelected extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Name")
        private String name;

        private WhiteSelected(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WhiteSelected create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String code; 
            private String name; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public WhiteSelected build() {
                return new WhiteSelected(this);
            } 

        } 

    }
    public static class White extends TeaModel {
        @NameInMap("All")
        private java.util.List < WhiteAll> all;

        @NameInMap("Selected")
        private java.util.List < WhiteSelected> selected;

        private White(Builder builder) {
            this.all = builder.all;
            this.selected = builder.selected;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static White create() {
            return builder().build();
        }

        /**
         * @return all
         */
        public java.util.List < WhiteAll> getAll() {
            return this.all;
        }

        /**
         * @return selected
         */
        public java.util.List < WhiteSelected> getSelected() {
            return this.selected;
        }

        public static final class Builder {
            private java.util.List < WhiteAll> all; 
            private java.util.List < WhiteSelected> selected; 

            /**
             * All.
             */
            public Builder all(java.util.List < WhiteAll> all) {
                this.all = all;
                return this;
            }

            /**
             * Selected.
             */
            public Builder selected(java.util.List < WhiteSelected> selected) {
                this.selected = selected;
                return this;
            }

            public White build() {
                return new White(this);
            } 

        } 

    }
}
