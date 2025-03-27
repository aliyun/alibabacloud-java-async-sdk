// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

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
 * {@link ListHotelsResponseBody} extends {@link TeaModel}
 *
 * <p>ListHotelsResponseBody</p>
 */
public class ListHotelsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private ListHotelsResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHotelsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
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
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(ListHotelsResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
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
         * <p>RequestId</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListHotelsResponseBody build() {
            return new ListHotelsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListHotelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListHotelsResponseBody</p>
     */
    public static class HotelInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountNames")
        private java.util.List<String> accountNames;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("HotelAddress")
        private String hotelAddress;

        @com.aliyun.core.annotation.NameInMap("HotelId")
        private String hotelId;

        @com.aliyun.core.annotation.NameInMap("HotelName")
        private String hotelName;

        @com.aliyun.core.annotation.NameInMap("IndustryType")
        private String industryType;

        @com.aliyun.core.annotation.NameInMap("PhoneNumber")
        private String phoneNumber;

        @com.aliyun.core.annotation.NameInMap("RelatedProductName")
        private String relatedProductName;

        @com.aliyun.core.annotation.NameInMap("RoomNum")
        private Integer roomNum;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private HotelInfoList(Builder builder) {
            this.accountNames = builder.accountNames;
            this.createTime = builder.createTime;
            this.hotelAddress = builder.hotelAddress;
            this.hotelId = builder.hotelId;
            this.hotelName = builder.hotelName;
            this.industryType = builder.industryType;
            this.phoneNumber = builder.phoneNumber;
            this.relatedProductName = builder.relatedProductName;
            this.roomNum = builder.roomNum;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotelInfoList create() {
            return builder().build();
        }

        /**
         * @return accountNames
         */
        public java.util.List<String> getAccountNames() {
            return this.accountNames;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return hotelAddress
         */
        public String getHotelAddress() {
            return this.hotelAddress;
        }

        /**
         * @return hotelId
         */
        public String getHotelId() {
            return this.hotelId;
        }

        /**
         * @return hotelName
         */
        public String getHotelName() {
            return this.hotelName;
        }

        /**
         * @return industryType
         */
        public String getIndustryType() {
            return this.industryType;
        }

        /**
         * @return phoneNumber
         */
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        /**
         * @return relatedProductName
         */
        public String getRelatedProductName() {
            return this.relatedProductName;
        }

        /**
         * @return roomNum
         */
        public Integer getRoomNum() {
            return this.roomNum;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List<String> accountNames; 
            private Long createTime; 
            private String hotelAddress; 
            private String hotelId; 
            private String hotelName; 
            private String industryType; 
            private String phoneNumber; 
            private String relatedProductName; 
            private Integer roomNum; 
            private Integer status; 

            private Builder() {
            } 

            private Builder(HotelInfoList model) {
                this.accountNames = model.accountNames;
                this.createTime = model.createTime;
                this.hotelAddress = model.hotelAddress;
                this.hotelId = model.hotelId;
                this.hotelName = model.hotelName;
                this.industryType = model.industryType;
                this.phoneNumber = model.phoneNumber;
                this.relatedProductName = model.relatedProductName;
                this.roomNum = model.roomNum;
                this.status = model.status;
            } 

            /**
             * AccountNames.
             */
            public Builder accountNames(java.util.List<String> accountNames) {
                this.accountNames = accountNames;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * HotelAddress.
             */
            public Builder hotelAddress(String hotelAddress) {
                this.hotelAddress = hotelAddress;
                return this;
            }

            /**
             * HotelId.
             */
            public Builder hotelId(String hotelId) {
                this.hotelId = hotelId;
                return this;
            }

            /**
             * HotelName.
             */
            public Builder hotelName(String hotelName) {
                this.hotelName = hotelName;
                return this;
            }

            /**
             * IndustryType.
             */
            public Builder industryType(String industryType) {
                this.industryType = industryType;
                return this;
            }

            /**
             * PhoneNumber.
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * RelatedProductName.
             */
            public Builder relatedProductName(String relatedProductName) {
                this.relatedProductName = relatedProductName;
                return this;
            }

            /**
             * RoomNum.
             */
            public Builder roomNum(Integer roomNum) {
                this.roomNum = roomNum;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public HotelInfoList build() {
                return new HotelInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListHotelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListHotelsResponseBody</p>
     */
    public static class Page extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HasNext")
        private Boolean hasNext;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        @com.aliyun.core.annotation.NameInMap("TotalPage")
        private Integer totalPage;

        private Page(Builder builder) {
            this.hasNext = builder.hasNext;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
            this.totalPage = builder.totalPage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Page create() {
            return builder().build();
        }

        /**
         * @return hasNext
         */
        public Boolean getHasNext() {
            return this.hasNext;
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
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        /**
         * @return totalPage
         */
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public static final class Builder {
            private Boolean hasNext; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer total; 
            private Integer totalPage; 

            private Builder() {
            } 

            private Builder(Page model) {
                this.hasNext = model.hasNext;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.total = model.total;
                this.totalPage = model.totalPage;
            } 

            /**
             * HasNext.
             */
            public Builder hasNext(Boolean hasNext) {
                this.hasNext = hasNext;
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
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            /**
             * TotalPage.
             */
            public Builder totalPage(Integer totalPage) {
                this.totalPage = totalPage;
                return this;
            }

            public Page build() {
                return new Page(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListHotelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListHotelsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HotelInfoList")
        private java.util.List<HotelInfoList> hotelInfoList;

        @com.aliyun.core.annotation.NameInMap("Page")
        private Page page;

        private Result(Builder builder) {
            this.hotelInfoList = builder.hotelInfoList;
            this.page = builder.page;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return hotelInfoList
         */
        public java.util.List<HotelInfoList> getHotelInfoList() {
            return this.hotelInfoList;
        }

        /**
         * @return page
         */
        public Page getPage() {
            return this.page;
        }

        public static final class Builder {
            private java.util.List<HotelInfoList> hotelInfoList; 
            private Page page; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.hotelInfoList = model.hotelInfoList;
                this.page = model.page;
            } 

            /**
             * HotelInfoList.
             */
            public Builder hotelInfoList(java.util.List<HotelInfoList> hotelInfoList) {
                this.hotelInfoList = hotelInfoList;
                return this;
            }

            /**
             * Page.
             */
            public Builder page(Page page) {
                this.page = page;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
