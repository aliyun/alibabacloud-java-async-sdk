// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAdvertisementSettleInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAdvertisementSettleInfoResponseBody</p>
 */
public class QueryAdvertisementSettleInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("LogsId")
    private String logsId;

    @NameInMap("Message")
    private String message;

    @NameInMap("Model")
    private Model model;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SubCode")
    private String subCode;

    @NameInMap("SubMessage")
    private String subMessage;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Long totalCount;

    private QueryAdvertisementSettleInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.logsId = builder.logsId;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
        this.subCode = builder.subCode;
        this.subMessage = builder.subMessage;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAdvertisementSettleInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return logsId
     */
    public String getLogsId() {
        return this.logsId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return model
     */
    public Model getModel() {
        return this.model;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subCode
     */
    public String getSubCode() {
        return this.subCode;
    }

    /**
     * @return subMessage
     */
    public String getSubMessage() {
        return this.subMessage;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private String logsId; 
        private String message; 
        private Model model; 
        private String requestId; 
        private String subCode; 
        private String subMessage; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * LogsId.
         */
        public Builder logsId(String logsId) {
            this.logsId = logsId;
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
         * Model.
         */
        public Builder model(Model model) {
            this.model = model;
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
         * SubCode.
         */
        public Builder subCode(String subCode) {
            this.subCode = subCode;
            return this;
        }

        /**
         * SubMessage.
         */
        public Builder subMessage(String subMessage) {
            this.subMessage = subMessage;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QueryAdvertisementSettleInfoResponseBody build() {
            return new QueryAdvertisementSettleInfoResponseBody(this);
        } 

    } 

    public static class AdvertiseSettleInfoList extends TeaModel {
        @NameInMap("AdvertiseName")
        private String advertiseName;

        @NameInMap("AdvertiseSettleAmount")
        private String advertiseSettleAmount;

        @NameInMap("AdvertiseSettleDetailId")
        private String advertiseSettleDetailId;

        @NameInMap("ChannelId")
        private String channelId;

        @NameInMap("CreateDate")
        private String createDate;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("ExtInfo")
        private String extInfo;

        @NameInMap("MediaSettleDetailId")
        private String mediaSettleDetailId;

        @NameInMap("ModifiedDate")
        private String modifiedDate;

        @NameInMap("SettleNo")
        private String settleNo;

        @NameInMap("SettleStatus")
        private String settleStatus;

        @NameInMap("StartTime")
        private String startTime;

        private AdvertiseSettleInfoList(Builder builder) {
            this.advertiseName = builder.advertiseName;
            this.advertiseSettleAmount = builder.advertiseSettleAmount;
            this.advertiseSettleDetailId = builder.advertiseSettleDetailId;
            this.channelId = builder.channelId;
            this.createDate = builder.createDate;
            this.endTime = builder.endTime;
            this.extInfo = builder.extInfo;
            this.mediaSettleDetailId = builder.mediaSettleDetailId;
            this.modifiedDate = builder.modifiedDate;
            this.settleNo = builder.settleNo;
            this.settleStatus = builder.settleStatus;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdvertiseSettleInfoList create() {
            return builder().build();
        }

        /**
         * @return advertiseName
         */
        public String getAdvertiseName() {
            return this.advertiseName;
        }

        /**
         * @return advertiseSettleAmount
         */
        public String getAdvertiseSettleAmount() {
            return this.advertiseSettleAmount;
        }

        /**
         * @return advertiseSettleDetailId
         */
        public String getAdvertiseSettleDetailId() {
            return this.advertiseSettleDetailId;
        }

        /**
         * @return channelId
         */
        public String getChannelId() {
            return this.channelId;
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return extInfo
         */
        public String getExtInfo() {
            return this.extInfo;
        }

        /**
         * @return mediaSettleDetailId
         */
        public String getMediaSettleDetailId() {
            return this.mediaSettleDetailId;
        }

        /**
         * @return modifiedDate
         */
        public String getModifiedDate() {
            return this.modifiedDate;
        }

        /**
         * @return settleNo
         */
        public String getSettleNo() {
            return this.settleNo;
        }

        /**
         * @return settleStatus
         */
        public String getSettleStatus() {
            return this.settleStatus;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String advertiseName; 
            private String advertiseSettleAmount; 
            private String advertiseSettleDetailId; 
            private String channelId; 
            private String createDate; 
            private String endTime; 
            private String extInfo; 
            private String mediaSettleDetailId; 
            private String modifiedDate; 
            private String settleNo; 
            private String settleStatus; 
            private String startTime; 

            /**
             * AdvertiseName.
             */
            public Builder advertiseName(String advertiseName) {
                this.advertiseName = advertiseName;
                return this;
            }

            /**
             * AdvertiseSettleAmount.
             */
            public Builder advertiseSettleAmount(String advertiseSettleAmount) {
                this.advertiseSettleAmount = advertiseSettleAmount;
                return this;
            }

            /**
             * AdvertiseSettleDetailId.
             */
            public Builder advertiseSettleDetailId(String advertiseSettleDetailId) {
                this.advertiseSettleDetailId = advertiseSettleDetailId;
                return this;
            }

            /**
             * ChannelId.
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * CreateDate.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * ExtInfo.
             */
            public Builder extInfo(String extInfo) {
                this.extInfo = extInfo;
                return this;
            }

            /**
             * MediaSettleDetailId.
             */
            public Builder mediaSettleDetailId(String mediaSettleDetailId) {
                this.mediaSettleDetailId = mediaSettleDetailId;
                return this;
            }

            /**
             * ModifiedDate.
             */
            public Builder modifiedDate(String modifiedDate) {
                this.modifiedDate = modifiedDate;
                return this;
            }

            /**
             * SettleNo.
             */
            public Builder settleNo(String settleNo) {
                this.settleNo = settleNo;
                return this;
            }

            /**
             * SettleStatus.
             */
            public Builder settleStatus(String settleStatus) {
                this.settleStatus = settleStatus;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public AdvertiseSettleInfoList build() {
                return new AdvertiseSettleInfoList(this);
            } 

        } 

    }
    public static class Model extends TeaModel {
        @NameInMap("AdvertiseSettleInfoList")
        private java.util.List < AdvertiseSettleInfoList> advertiseSettleInfoList;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Model(Builder builder) {
            this.advertiseSettleInfoList = builder.advertiseSettleInfoList;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return advertiseSettleInfoList
         */
        public java.util.List < AdvertiseSettleInfoList> getAdvertiseSettleInfoList() {
            return this.advertiseSettleInfoList;
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < AdvertiseSettleInfoList> advertiseSettleInfoList; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * AdvertiseSettleInfoList.
             */
            public Builder advertiseSettleInfoList(java.util.List < AdvertiseSettleInfoList> advertiseSettleInfoList) {
                this.advertiseSettleInfoList = advertiseSettleInfoList;
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
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
