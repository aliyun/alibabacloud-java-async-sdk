// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link QueryMediaSettleInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMediaSettleInfoResponseBody</p>
 */
public class QueryMediaSettleInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("LogsId")
    private String logsId;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Model")
    private Model model;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubCode")
    private String subCode;

    @com.aliyun.core.annotation.NameInMap("SubMessage")
    private String subMessage;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private QueryMediaSettleInfoResponseBody(Builder builder) {
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

    public static QueryMediaSettleInfoResponseBody create() {
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

        public QueryMediaSettleInfoResponseBody build() {
            return new QueryMediaSettleInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryMediaSettleInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaSettleInfoResponseBody</p>
     */
    public static class MediaSettleInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private String channelId;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("ExtInfo")
        private String extInfo;

        @com.aliyun.core.annotation.NameInMap("MediaName")
        private String mediaName;

        @com.aliyun.core.annotation.NameInMap("MediaSettleAmount")
        private String mediaSettleAmount;

        @com.aliyun.core.annotation.NameInMap("MediaSettleDetailId")
        private String mediaSettleDetailId;

        @com.aliyun.core.annotation.NameInMap("ModifiedDate")
        private String modifiedDate;

        @com.aliyun.core.annotation.NameInMap("SettleNo")
        private String settleNo;

        @com.aliyun.core.annotation.NameInMap("SettleStatus")
        private String settleStatus;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private MediaSettleInfoList(Builder builder) {
            this.channelId = builder.channelId;
            this.createDate = builder.createDate;
            this.endTime = builder.endTime;
            this.extInfo = builder.extInfo;
            this.mediaName = builder.mediaName;
            this.mediaSettleAmount = builder.mediaSettleAmount;
            this.mediaSettleDetailId = builder.mediaSettleDetailId;
            this.modifiedDate = builder.modifiedDate;
            this.settleNo = builder.settleNo;
            this.settleStatus = builder.settleStatus;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaSettleInfoList create() {
            return builder().build();
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
         * @return mediaName
         */
        public String getMediaName() {
            return this.mediaName;
        }

        /**
         * @return mediaSettleAmount
         */
        public String getMediaSettleAmount() {
            return this.mediaSettleAmount;
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
            private String channelId; 
            private String createDate; 
            private String endTime; 
            private String extInfo; 
            private String mediaName; 
            private String mediaSettleAmount; 
            private String mediaSettleDetailId; 
            private String modifiedDate; 
            private String settleNo; 
            private String settleStatus; 
            private String startTime; 

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
             * MediaName.
             */
            public Builder mediaName(String mediaName) {
                this.mediaName = mediaName;
                return this;
            }

            /**
             * MediaSettleAmount.
             */
            public Builder mediaSettleAmount(String mediaSettleAmount) {
                this.mediaSettleAmount = mediaSettleAmount;
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

            public MediaSettleInfoList build() {
                return new MediaSettleInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMediaSettleInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaSettleInfoResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MediaSettleInfoList")
        private java.util.List<MediaSettleInfoList> mediaSettleInfoList;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Model(Builder builder) {
            this.mediaSettleInfoList = builder.mediaSettleInfoList;
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
         * @return mediaSettleInfoList
         */
        public java.util.List<MediaSettleInfoList> getMediaSettleInfoList() {
            return this.mediaSettleInfoList;
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
            private java.util.List<MediaSettleInfoList> mediaSettleInfoList; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * MediaSettleInfoList.
             */
            public Builder mediaSettleInfoList(java.util.List<MediaSettleInfoList> mediaSettleInfoList) {
                this.mediaSettleInfoList = mediaSettleInfoList;
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
