// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPersonTraceDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPersonTraceDetailsResponseBody</p>
 */
public class ListPersonTraceDetailsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListPersonTraceDetailsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPersonTraceDetailsResponseBody create() {
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
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

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
        public Builder data(java.util.List < Data> data) {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListPersonTraceDetailsResponseBody build() {
            return new ListPersonTraceDetailsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CorpId")
        private String corpId;

        @NameInMap("DataSourceId")
        private String dataSourceId;

        @NameInMap("LeftTopX")
        private String leftTopX;

        @NameInMap("LeftTopY")
        private String leftTopY;

        @NameInMap("PersonId")
        private String personId;

        @NameInMap("PicUrlPath")
        private String picUrlPath;

        @NameInMap("RightBottomX")
        private String rightBottomX;

        @NameInMap("RightBottomY")
        private String rightBottomY;

        @NameInMap("ShotTime")
        private String shotTime;

        @NameInMap("SubId")
        private String subId;

        @NameInMap("TargetPicUrlPath")
        private String targetPicUrlPath;

        private Data(Builder builder) {
            this.corpId = builder.corpId;
            this.dataSourceId = builder.dataSourceId;
            this.leftTopX = builder.leftTopX;
            this.leftTopY = builder.leftTopY;
            this.personId = builder.personId;
            this.picUrlPath = builder.picUrlPath;
            this.rightBottomX = builder.rightBottomX;
            this.rightBottomY = builder.rightBottomY;
            this.shotTime = builder.shotTime;
            this.subId = builder.subId;
            this.targetPicUrlPath = builder.targetPicUrlPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return corpId
         */
        public String getCorpId() {
            return this.corpId;
        }

        /**
         * @return dataSourceId
         */
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        /**
         * @return leftTopX
         */
        public String getLeftTopX() {
            return this.leftTopX;
        }

        /**
         * @return leftTopY
         */
        public String getLeftTopY() {
            return this.leftTopY;
        }

        /**
         * @return personId
         */
        public String getPersonId() {
            return this.personId;
        }

        /**
         * @return picUrlPath
         */
        public String getPicUrlPath() {
            return this.picUrlPath;
        }

        /**
         * @return rightBottomX
         */
        public String getRightBottomX() {
            return this.rightBottomX;
        }

        /**
         * @return rightBottomY
         */
        public String getRightBottomY() {
            return this.rightBottomY;
        }

        /**
         * @return shotTime
         */
        public String getShotTime() {
            return this.shotTime;
        }

        /**
         * @return subId
         */
        public String getSubId() {
            return this.subId;
        }

        /**
         * @return targetPicUrlPath
         */
        public String getTargetPicUrlPath() {
            return this.targetPicUrlPath;
        }

        public static final class Builder {
            private String corpId; 
            private String dataSourceId; 
            private String leftTopX; 
            private String leftTopY; 
            private String personId; 
            private String picUrlPath; 
            private String rightBottomX; 
            private String rightBottomY; 
            private String shotTime; 
            private String subId; 
            private String targetPicUrlPath; 

            /**
             * CorpId.
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * DataSourceId.
             */
            public Builder dataSourceId(String dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * LeftTopX.
             */
            public Builder leftTopX(String leftTopX) {
                this.leftTopX = leftTopX;
                return this;
            }

            /**
             * LeftTopY.
             */
            public Builder leftTopY(String leftTopY) {
                this.leftTopY = leftTopY;
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
             * PicUrlPath.
             */
            public Builder picUrlPath(String picUrlPath) {
                this.picUrlPath = picUrlPath;
                return this;
            }

            /**
             * RightBottomX.
             */
            public Builder rightBottomX(String rightBottomX) {
                this.rightBottomX = rightBottomX;
                return this;
            }

            /**
             * RightBottomY.
             */
            public Builder rightBottomY(String rightBottomY) {
                this.rightBottomY = rightBottomY;
                return this;
            }

            /**
             * ShotTime.
             */
            public Builder shotTime(String shotTime) {
                this.shotTime = shotTime;
                return this;
            }

            /**
             * SubId.
             */
            public Builder subId(String subId) {
                this.subId = subId;
                return this;
            }

            /**
             * TargetPicUrlPath.
             */
            public Builder targetPicUrlPath(String targetPicUrlPath) {
                this.targetPicUrlPath = targetPicUrlPath;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
