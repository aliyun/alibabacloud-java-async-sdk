// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClassificationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListClassificationsResponseBody</p>
 */
public class ListClassificationsResponseBody extends TeaModel {
    @NameInMap("Classifications")
    private Classifications classifications;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListClassificationsResponseBody(Builder builder) {
        this.classifications = builder.classifications;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClassificationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return classifications
     */
    public Classifications getClassifications() {
        return this.classifications;
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
        private Classifications classifications; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Classifications.
         */
        public Builder classifications(Classifications classifications) {
            this.classifications = classifications;
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

        public ListClassificationsResponseBody build() {
            return new ListClassificationsResponseBody(this);
        } 

    } 

    public static class Classification extends TeaModel {
        @NameInMap("ClassificationCode")
        private String classificationCode;

        @NameInMap("ClassificationName")
        private String classificationName;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Level")
        private Integer level;

        @NameInMap("OfficialCode")
        private String officialCode;

        @NameInMap("ParentCode")
        private String parentCode;

        private Classification(Builder builder) {
            this.classificationCode = builder.classificationCode;
            this.classificationName = builder.classificationName;
            this.id = builder.id;
            this.level = builder.level;
            this.officialCode = builder.officialCode;
            this.parentCode = builder.parentCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Classification create() {
            return builder().build();
        }

        /**
         * @return classificationCode
         */
        public String getClassificationCode() {
            return this.classificationCode;
        }

        /**
         * @return classificationName
         */
        public String getClassificationName() {
            return this.classificationName;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return level
         */
        public Integer getLevel() {
            return this.level;
        }

        /**
         * @return officialCode
         */
        public String getOfficialCode() {
            return this.officialCode;
        }

        /**
         * @return parentCode
         */
        public String getParentCode() {
            return this.parentCode;
        }

        public static final class Builder {
            private String classificationCode; 
            private String classificationName; 
            private Long id; 
            private Integer level; 
            private String officialCode; 
            private String parentCode; 

            /**
             * ClassificationCode.
             */
            public Builder classificationCode(String classificationCode) {
                this.classificationCode = classificationCode;
                return this;
            }

            /**
             * ClassificationName.
             */
            public Builder classificationName(String classificationName) {
                this.classificationName = classificationName;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(Integer level) {
                this.level = level;
                return this;
            }

            /**
             * OfficialCode.
             */
            public Builder officialCode(String officialCode) {
                this.officialCode = officialCode;
                return this;
            }

            /**
             * ParentCode.
             */
            public Builder parentCode(String parentCode) {
                this.parentCode = parentCode;
                return this;
            }

            public Classification build() {
                return new Classification(this);
            } 

        } 

    }
    public static class Classifications extends TeaModel {
        @NameInMap("Classification")
        private java.util.List < Classification> classification;

        private Classifications(Builder builder) {
            this.classification = builder.classification;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Classifications create() {
            return builder().build();
        }

        /**
         * @return classification
         */
        public java.util.List < Classification> getClassification() {
            return this.classification;
        }

        public static final class Builder {
            private java.util.List < Classification> classification; 

            /**
             * Classification.
             */
            public Builder classification(java.util.List < Classification> classification) {
                this.classification = classification;
                return this;
            }

            public Classifications build() {
                return new Classifications(this);
            } 

        } 

    }
}
