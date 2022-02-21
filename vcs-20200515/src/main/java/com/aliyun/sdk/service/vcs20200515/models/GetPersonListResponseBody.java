// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPersonListResponseBody} extends {@link TeaModel}
 *
 * <p>GetPersonListResponseBody</p>
 */
public class GetPersonListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private GetPersonListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPersonListResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPersonListResponseBody build() {
            return new GetPersonListResponseBody(this);
        } 

    } 

    public static class PropertyTagList extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("TagCodeName")
        private String tagCodeName;

        @NameInMap("TagName")
        private String tagName;

        @NameInMap("Value")
        private String value;

        private PropertyTagList(Builder builder) {
            this.code = builder.code;
            this.tagCodeName = builder.tagCodeName;
            this.tagName = builder.tagName;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PropertyTagList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return tagCodeName
         */
        public String getTagCodeName() {
            return this.tagCodeName;
        }

        /**
         * @return tagName
         */
        public String getTagName() {
            return this.tagName;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String code; 
            private String tagCodeName; 
            private String tagName; 
            private String value; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * TagCodeName.
             */
            public Builder tagCodeName(String tagCodeName) {
                this.tagCodeName = tagCodeName;
                return this;
            }

            /**
             * TagName.
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public PropertyTagList build() {
                return new PropertyTagList(this);
            } 

        } 

    }
    public static class Records extends TeaModel {
        @NameInMap("FaceUrl")
        private String faceUrl;

        @NameInMap("FirstShotTime")
        private Long firstShotTime;

        @NameInMap("LastShotTime")
        private Long lastShotTime;

        @NameInMap("PersonId")
        private String personId;

        @NameInMap("PropertyTagList")
        private java.util.List < PropertyTagList> propertyTagList;

        @NameInMap("SearchMatchingRate")
        private String searchMatchingRate;

        private Records(Builder builder) {
            this.faceUrl = builder.faceUrl;
            this.firstShotTime = builder.firstShotTime;
            this.lastShotTime = builder.lastShotTime;
            this.personId = builder.personId;
            this.propertyTagList = builder.propertyTagList;
            this.searchMatchingRate = builder.searchMatchingRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return faceUrl
         */
        public String getFaceUrl() {
            return this.faceUrl;
        }

        /**
         * @return firstShotTime
         */
        public Long getFirstShotTime() {
            return this.firstShotTime;
        }

        /**
         * @return lastShotTime
         */
        public Long getLastShotTime() {
            return this.lastShotTime;
        }

        /**
         * @return personId
         */
        public String getPersonId() {
            return this.personId;
        }

        /**
         * @return propertyTagList
         */
        public java.util.List < PropertyTagList> getPropertyTagList() {
            return this.propertyTagList;
        }

        /**
         * @return searchMatchingRate
         */
        public String getSearchMatchingRate() {
            return this.searchMatchingRate;
        }

        public static final class Builder {
            private String faceUrl; 
            private Long firstShotTime; 
            private Long lastShotTime; 
            private String personId; 
            private java.util.List < PropertyTagList> propertyTagList; 
            private String searchMatchingRate; 

            /**
             * FaceUrl.
             */
            public Builder faceUrl(String faceUrl) {
                this.faceUrl = faceUrl;
                return this;
            }

            /**
             * FirstShotTime.
             */
            public Builder firstShotTime(Long firstShotTime) {
                this.firstShotTime = firstShotTime;
                return this;
            }

            /**
             * LastShotTime.
             */
            public Builder lastShotTime(Long lastShotTime) {
                this.lastShotTime = lastShotTime;
                return this;
            }

            /**
             * PersonId.
             */
            public Builder personId(String personId) {
                this.personId = personId;
                return this;
            }

            /**
             * PropertyTagList.
             */
            public Builder propertyTagList(java.util.List < PropertyTagList> propertyTagList) {
                this.propertyTagList = propertyTagList;
                return this;
            }

            /**
             * SearchMatchingRate.
             */
            public Builder searchMatchingRate(String searchMatchingRate) {
                this.searchMatchingRate = searchMatchingRate;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("PageNumber")
        private Long pageNumber;

        @NameInMap("PageSize")
        private Long pageSize;

        @NameInMap("Records")
        private java.util.List < Records> records;

        @NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.records = builder.records;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return records
         */
        public java.util.List < Records> getRecords() {
            return this.records;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long pageNumber; 
            private Long pageSize; 
            private java.util.List < Records> records; 
            private Long totalCount; 

            /**
             * PageNumber.
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Records.
             */
            public Builder records(java.util.List < Records> records) {
                this.records = records;
                return this;
            }

            /**
             * TotalCount.
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
