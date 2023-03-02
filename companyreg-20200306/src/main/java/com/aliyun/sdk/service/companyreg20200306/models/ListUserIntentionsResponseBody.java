// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserIntentionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserIntentionsResponseBody</p>
 */
public class ListUserIntentionsResponseBody extends TeaModel {
    @NameInMap("CurrentPageNum")
    private Integer currentPageNum;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalItemNum")
    private Integer totalItemNum;

    @NameInMap("TotalPageNum")
    private Integer totalPageNum;

    private ListUserIntentionsResponseBody(Builder builder) {
        this.currentPageNum = builder.currentPageNum;
        this.data = builder.data;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalItemNum = builder.totalItemNum;
        this.totalPageNum = builder.totalPageNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserIntentionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentPageNum
     */
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
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
     * @return totalItemNum
     */
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    /**
     * @return totalPageNum
     */
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static final class Builder {
        private Integer currentPageNum; 
        private java.util.List < Data> data; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalItemNum; 
        private Integer totalPageNum; 

        /**
         * CurrentPageNum.
         */
        public Builder currentPageNum(Integer currentPageNum) {
            this.currentPageNum = currentPageNum;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalItemNum.
         */
        public Builder totalItemNum(Integer totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }

        /**
         * TotalPageNum.
         */
        public Builder totalPageNum(Integer totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }

        public ListUserIntentionsResponseBody build() {
            return new ListUserIntentionsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Area")
        private String area;

        @NameInMap("BizId")
        private String bizId;

        @NameInMap("BizType")
        private String bizType;

        @NameInMap("ContactName")
        private String contactName;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("Ext")
        private String ext;

        @NameInMap("Mobile")
        private String mobile;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("UpdateTime")
        private Long updateTime;

        @NameInMap("UserId")
        private String userId;

        private Data(Builder builder) {
            this.area = builder.area;
            this.bizId = builder.bizId;
            this.bizType = builder.bizType;
            this.contactName = builder.contactName;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.ext = builder.ext;
            this.mobile = builder.mobile;
            this.reason = builder.reason;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return area
         */
        public String getArea() {
            return this.area;
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return contactName
         */
        public String getContactName() {
            return this.contactName;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ext
         */
        public String getExt() {
            return this.ext;
        }

        /**
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String area; 
            private String bizId; 
            private String bizType; 
            private String contactName; 
            private Long createTime; 
            private String description; 
            private String ext; 
            private String mobile; 
            private String reason; 
            private Integer status; 
            private Long updateTime; 
            private String userId; 

            /**
             * Area.
             */
            public Builder area(String area) {
                this.area = area;
                return this;
            }

            /**
             * BizId.
             */
            public Builder bizId(String bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * BizType.
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * ContactName.
             */
            public Builder contactName(String contactName) {
                this.contactName = contactName;
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Ext.
             */
            public Builder ext(String ext) {
                this.ext = ext;
                return this;
            }

            /**
             * Mobile.
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
