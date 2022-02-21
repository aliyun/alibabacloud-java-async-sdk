// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPersonsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPersonsResponseBody</p>
 */
public class ListPersonsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private ListPersonsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPersonsResponseBody create() {
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

        public ListPersonsResponseBody build() {
            return new ListPersonsResponseBody(this);
        } 

    } 

    public static class TagList extends TeaModel {
        @NameInMap("TagCode")
        private String tagCode;

        @NameInMap("TagName")
        private String tagName;

        @NameInMap("TagValue")
        private String tagValue;

        @NameInMap("TagValueId")
        private String tagValueId;

        private TagList(Builder builder) {
            this.tagCode = builder.tagCode;
            this.tagName = builder.tagName;
            this.tagValue = builder.tagValue;
            this.tagValueId = builder.tagValueId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagList create() {
            return builder().build();
        }

        /**
         * @return tagCode
         */
        public String getTagCode() {
            return this.tagCode;
        }

        /**
         * @return tagName
         */
        public String getTagName() {
            return this.tagName;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        /**
         * @return tagValueId
         */
        public String getTagValueId() {
            return this.tagValueId;
        }

        public static final class Builder {
            private String tagCode; 
            private String tagName; 
            private String tagValue; 
            private String tagValueId; 

            /**
             * TagCode.
             */
            public Builder tagCode(String tagCode) {
                this.tagCode = tagCode;
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
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            /**
             * TagValueId.
             */
            public Builder tagValueId(String tagValueId) {
                this.tagValueId = tagValueId;
                return this;
            }

            public TagList build() {
                return new TagList(this);
            } 

        } 

    }
    public static class Records extends TeaModel {
        @NameInMap("FirstAppearTime")
        private String firstAppearTime;

        @NameInMap("PersonId")
        private String personId;

        @NameInMap("PicUrl")
        private String picUrl;

        @NameInMap("TagList")
        private java.util.List < TagList> tagList;

        private Records(Builder builder) {
            this.firstAppearTime = builder.firstAppearTime;
            this.personId = builder.personId;
            this.picUrl = builder.picUrl;
            this.tagList = builder.tagList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return firstAppearTime
         */
        public String getFirstAppearTime() {
            return this.firstAppearTime;
        }

        /**
         * @return personId
         */
        public String getPersonId() {
            return this.personId;
        }

        /**
         * @return picUrl
         */
        public String getPicUrl() {
            return this.picUrl;
        }

        /**
         * @return tagList
         */
        public java.util.List < TagList> getTagList() {
            return this.tagList;
        }

        public static final class Builder {
            private String firstAppearTime; 
            private String personId; 
            private String picUrl; 
            private java.util.List < TagList> tagList; 

            /**
             * FirstAppearTime.
             */
            public Builder firstAppearTime(String firstAppearTime) {
                this.firstAppearTime = firstAppearTime;
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
             * PicUrl.
             */
            public Builder picUrl(String picUrl) {
                this.picUrl = picUrl;
                return this;
            }

            /**
             * TagList.
             */
            public Builder tagList(java.util.List < TagList> tagList) {
                this.tagList = tagList;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("PageNo")
        private String pageNo;

        @NameInMap("PageSize")
        private String pageSize;

        @NameInMap("Records")
        private java.util.List < Records> records;

        @NameInMap("TotalCount")
        private String totalCount;

        @NameInMap("TotalPage")
        private String totalPage;

        private Data(Builder builder) {
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.records = builder.records;
            this.totalCount = builder.totalCount;
            this.totalPage = builder.totalPage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageNo
         */
        public String getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public String getPageSize() {
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
        public String getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return totalPage
         */
        public String getTotalPage() {
            return this.totalPage;
        }

        public static final class Builder {
            private String pageNo; 
            private String pageSize; 
            private java.util.List < Records> records; 
            private String totalCount; 
            private String totalPage; 

            /**
             * PageNo.
             */
            public Builder pageNo(String pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(String pageSize) {
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
            public Builder totalCount(String totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * TotalPage.
             */
            public Builder totalPage(String totalPage) {
                this.totalPage = totalPage;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
