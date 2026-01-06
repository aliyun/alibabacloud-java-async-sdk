// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link GetDingtalkProjectionListResponseBody} extends {@link TeaModel}
 *
 * <p>GetDingtalkProjectionListResponseBody</p>
 */
public class GetDingtalkProjectionListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("currentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private GetDingtalkProjectionListResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDingtalkProjectionListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
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

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder {
        private Integer currentPage; 
        private java.util.List<Data> data; 
        private String requestId; 
        private Long totalCount; 
        private String vendorRequestId; 
        private String vendorType; 

        private Builder() {
        } 

        private Builder(GetDingtalkProjectionListResponseBody model) {
            this.currentPage = model.currentPage;
            this.data = model.data;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.vendorRequestId = model.vendorRequestId;
            this.vendorType = model.vendorType;
        } 

        /**
         * currentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public GetDingtalkProjectionListResponseBody build() {
            return new GetDingtalkProjectionListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDingtalkProjectionListResponseBody} extends {@link TeaModel}
     *
     * <p>GetDingtalkProjectionListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("callStatus")
        private String callStatus;

        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("devUid")
        private Long devUid;

        @com.aliyun.core.annotation.NameInMap("duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("endTs")
        private Long endTs;

        @com.aliyun.core.annotation.NameInMap("nickCode")
        private String nickCode;

        @com.aliyun.core.annotation.NameInMap("orgId")
        private Long orgId;

        @com.aliyun.core.annotation.NameInMap("recvClientId")
        private String recvClientId;

        @com.aliyun.core.annotation.NameInMap("recvClientName")
        private String recvClientName;

        @com.aliyun.core.annotation.NameInMap("sendClientId")
        private String sendClientId;

        @com.aliyun.core.annotation.NameInMap("sendClientName")
        private String sendClientName;

        @com.aliyun.core.annotation.NameInMap("sendClientWorkNo")
        private String sendClientWorkNo;

        @com.aliyun.core.annotation.NameInMap("startTs")
        private Long startTs;

        @com.aliyun.core.annotation.NameInMap("timeStr")
        private String timeStr;

        private Data(Builder builder) {
            this.callStatus = builder.callStatus;
            this.code = builder.code;
            this.devUid = builder.devUid;
            this.duration = builder.duration;
            this.endTs = builder.endTs;
            this.nickCode = builder.nickCode;
            this.orgId = builder.orgId;
            this.recvClientId = builder.recvClientId;
            this.recvClientName = builder.recvClientName;
            this.sendClientId = builder.sendClientId;
            this.sendClientName = builder.sendClientName;
            this.sendClientWorkNo = builder.sendClientWorkNo;
            this.startTs = builder.startTs;
            this.timeStr = builder.timeStr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return callStatus
         */
        public String getCallStatus() {
            return this.callStatus;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return devUid
         */
        public Long getDevUid() {
            return this.devUid;
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return endTs
         */
        public Long getEndTs() {
            return this.endTs;
        }

        /**
         * @return nickCode
         */
        public String getNickCode() {
            return this.nickCode;
        }

        /**
         * @return orgId
         */
        public Long getOrgId() {
            return this.orgId;
        }

        /**
         * @return recvClientId
         */
        public String getRecvClientId() {
            return this.recvClientId;
        }

        /**
         * @return recvClientName
         */
        public String getRecvClientName() {
            return this.recvClientName;
        }

        /**
         * @return sendClientId
         */
        public String getSendClientId() {
            return this.sendClientId;
        }

        /**
         * @return sendClientName
         */
        public String getSendClientName() {
            return this.sendClientName;
        }

        /**
         * @return sendClientWorkNo
         */
        public String getSendClientWorkNo() {
            return this.sendClientWorkNo;
        }

        /**
         * @return startTs
         */
        public Long getStartTs() {
            return this.startTs;
        }

        /**
         * @return timeStr
         */
        public String getTimeStr() {
            return this.timeStr;
        }

        public static final class Builder {
            private String callStatus; 
            private String code; 
            private Long devUid; 
            private String duration; 
            private Long endTs; 
            private String nickCode; 
            private Long orgId; 
            private String recvClientId; 
            private String recvClientName; 
            private String sendClientId; 
            private String sendClientName; 
            private String sendClientWorkNo; 
            private Long startTs; 
            private String timeStr; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.callStatus = model.callStatus;
                this.code = model.code;
                this.devUid = model.devUid;
                this.duration = model.duration;
                this.endTs = model.endTs;
                this.nickCode = model.nickCode;
                this.orgId = model.orgId;
                this.recvClientId = model.recvClientId;
                this.recvClientName = model.recvClientName;
                this.sendClientId = model.sendClientId;
                this.sendClientName = model.sendClientName;
                this.sendClientWorkNo = model.sendClientWorkNo;
                this.startTs = model.startTs;
                this.timeStr = model.timeStr;
            } 

            /**
             * callStatus.
             */
            public Builder callStatus(String callStatus) {
                this.callStatus = callStatus;
                return this;
            }

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * devUid.
             */
            public Builder devUid(Long devUid) {
                this.devUid = devUid;
                return this;
            }

            /**
             * duration.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * endTs.
             */
            public Builder endTs(Long endTs) {
                this.endTs = endTs;
                return this;
            }

            /**
             * nickCode.
             */
            public Builder nickCode(String nickCode) {
                this.nickCode = nickCode;
                return this;
            }

            /**
             * orgId.
             */
            public Builder orgId(Long orgId) {
                this.orgId = orgId;
                return this;
            }

            /**
             * recvClientId.
             */
            public Builder recvClientId(String recvClientId) {
                this.recvClientId = recvClientId;
                return this;
            }

            /**
             * recvClientName.
             */
            public Builder recvClientName(String recvClientName) {
                this.recvClientName = recvClientName;
                return this;
            }

            /**
             * sendClientId.
             */
            public Builder sendClientId(String sendClientId) {
                this.sendClientId = sendClientId;
                return this;
            }

            /**
             * sendClientName.
             */
            public Builder sendClientName(String sendClientName) {
                this.sendClientName = sendClientName;
                return this;
            }

            /**
             * sendClientWorkNo.
             */
            public Builder sendClientWorkNo(String sendClientWorkNo) {
                this.sendClientWorkNo = sendClientWorkNo;
                return this;
            }

            /**
             * startTs.
             */
            public Builder startTs(Long startTs) {
                this.startTs = startTs;
                return this;
            }

            /**
             * timeStr.
             */
            public Builder timeStr(String timeStr) {
                this.timeStr = timeStr;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
