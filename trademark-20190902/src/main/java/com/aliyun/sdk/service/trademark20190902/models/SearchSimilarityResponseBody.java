// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchSimilarityResponseBody} extends {@link TeaModel}
 *
 * <p>SearchSimilarityResponseBody</p>
 */
public class SearchSimilarityResponseBody extends TeaModel {
    @NameInMap("DataList")
    private java.util.List < DataList> dataList;

    @NameInMap("RequestId")
    private String requestId;

    private SearchSimilarityResponseBody(Builder builder) {
        this.dataList = builder.dataList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchSimilarityResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataList
     */
    public java.util.List < DataList> getDataList() {
        return this.dataList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DataList> dataList; 
        private String requestId; 

        /**
         * DataList.
         */
        public Builder dataList(java.util.List < DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SearchSimilarityResponseBody build() {
            return new SearchSimilarityResponseBody(this);
        } 

    } 

    public static class DetailList extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Name")
        private String name;

        @NameInMap("Rate")
        private Integer rate;

        @NameInMap("TmNumber")
        private String tmNumber;

        @NameInMap("Uid")
        private String uid;

        @NameInMap("Uri")
        private String uri;

        private DetailList(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
            this.rate = builder.rate;
            this.tmNumber = builder.tmNumber;
            this.uid = builder.uid;
            this.uri = builder.uri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetailList create() {
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

        /**
         * @return rate
         */
        public Integer getRate() {
            return this.rate;
        }

        /**
         * @return tmNumber
         */
        public String getTmNumber() {
            return this.tmNumber;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        /**
         * @return uri
         */
        public String getUri() {
            return this.uri;
        }

        public static final class Builder {
            private String code; 
            private String name; 
            private Integer rate; 
            private String tmNumber; 
            private String uid; 
            private String uri; 

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

            /**
             * Rate.
             */
            public Builder rate(Integer rate) {
                this.rate = rate;
                return this;
            }

            /**
             * TmNumber.
             */
            public Builder tmNumber(String tmNumber) {
                this.tmNumber = tmNumber;
                return this;
            }

            /**
             * Uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            /**
             * Uri.
             */
            public Builder uri(String uri) {
                this.uri = uri;
                return this;
            }

            public DetailList build() {
                return new DetailList(this);
            } 

        } 

    }
    public static class SimilarGroupList extends TeaModel {
        @NameInMap("DetailList")
        private java.util.List < DetailList> detailList;

        @NameInMap("Rate")
        private Integer rate;

        @NameInMap("SimilarGroup")
        private String similarGroup;

        @NameInMap("SimilarGroupName")
        private String similarGroupName;

        private SimilarGroupList(Builder builder) {
            this.detailList = builder.detailList;
            this.rate = builder.rate;
            this.similarGroup = builder.similarGroup;
            this.similarGroupName = builder.similarGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SimilarGroupList create() {
            return builder().build();
        }

        /**
         * @return detailList
         */
        public java.util.List < DetailList> getDetailList() {
            return this.detailList;
        }

        /**
         * @return rate
         */
        public Integer getRate() {
            return this.rate;
        }

        /**
         * @return similarGroup
         */
        public String getSimilarGroup() {
            return this.similarGroup;
        }

        /**
         * @return similarGroupName
         */
        public String getSimilarGroupName() {
            return this.similarGroupName;
        }

        public static final class Builder {
            private java.util.List < DetailList> detailList; 
            private Integer rate; 
            private String similarGroup; 
            private String similarGroupName; 

            /**
             * DetailList.
             */
            public Builder detailList(java.util.List < DetailList> detailList) {
                this.detailList = detailList;
                return this;
            }

            /**
             * Rate.
             */
            public Builder rate(Integer rate) {
                this.rate = rate;
                return this;
            }

            /**
             * SimilarGroup.
             */
            public Builder similarGroup(String similarGroup) {
                this.similarGroup = similarGroup;
                return this;
            }

            /**
             * SimilarGroupName.
             */
            public Builder similarGroupName(String similarGroupName) {
                this.similarGroupName = similarGroupName;
                return this;
            }

            public SimilarGroupList build() {
                return new SimilarGroupList(this);
            } 

        } 

    }
    public static class ClassificationSimilarityList extends TeaModel {
        @NameInMap("Classification")
        private Integer classification;

        @NameInMap("ClassificationName")
        private String classificationName;

        @NameInMap("Rate")
        private Integer rate;

        @NameInMap("SimilarGroupList")
        private java.util.List < SimilarGroupList> similarGroupList;

        private ClassificationSimilarityList(Builder builder) {
            this.classification = builder.classification;
            this.classificationName = builder.classificationName;
            this.rate = builder.rate;
            this.similarGroupList = builder.similarGroupList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClassificationSimilarityList create() {
            return builder().build();
        }

        /**
         * @return classification
         */
        public Integer getClassification() {
            return this.classification;
        }

        /**
         * @return classificationName
         */
        public String getClassificationName() {
            return this.classificationName;
        }

        /**
         * @return rate
         */
        public Integer getRate() {
            return this.rate;
        }

        /**
         * @return similarGroupList
         */
        public java.util.List < SimilarGroupList> getSimilarGroupList() {
            return this.similarGroupList;
        }

        public static final class Builder {
            private Integer classification; 
            private String classificationName; 
            private Integer rate; 
            private java.util.List < SimilarGroupList> similarGroupList; 

            /**
             * Classification.
             */
            public Builder classification(Integer classification) {
                this.classification = classification;
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
             * Rate.
             */
            public Builder rate(Integer rate) {
                this.rate = rate;
                return this;
            }

            /**
             * SimilarGroupList.
             */
            public Builder similarGroupList(java.util.List < SimilarGroupList> similarGroupList) {
                this.similarGroupList = similarGroupList;
                return this;
            }

            public ClassificationSimilarityList build() {
                return new ClassificationSimilarityList(this);
            } 

        } 

    }
    public static class DataList extends TeaModel {
        @NameInMap("ClassificationSimilarityList")
        private java.util.List < ClassificationSimilarityList> classificationSimilarityList;

        @NameInMap("Name")
        private String name;

        @NameInMap("Uri")
        private String uri;

        private DataList(Builder builder) {
            this.classificationSimilarityList = builder.classificationSimilarityList;
            this.name = builder.name;
            this.uri = builder.uri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return classificationSimilarityList
         */
        public java.util.List < ClassificationSimilarityList> getClassificationSimilarityList() {
            return this.classificationSimilarityList;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return uri
         */
        public String getUri() {
            return this.uri;
        }

        public static final class Builder {
            private java.util.List < ClassificationSimilarityList> classificationSimilarityList; 
            private String name; 
            private String uri; 

            /**
             * ClassificationSimilarityList.
             */
            public Builder classificationSimilarityList(java.util.List < ClassificationSimilarityList> classificationSimilarityList) {
                this.classificationSimilarityList = classificationSimilarityList;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Uri.
             */
            public Builder uri(String uri) {
                this.uri = uri;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
}
