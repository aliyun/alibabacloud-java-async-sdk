// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.buss20220822.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchPunishEventsResponseBody} extends {@link TeaModel}
 *
 * <p>SearchPunishEventsResponseBody</p>
 */
public class SearchPunishEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DataList")
    private java.util.List < DataList> dataList;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private SearchPunishEventsResponseBody(Builder builder) {
        this.code = builder.code;
        this.dataList = builder.dataList;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchPunishEventsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return dataList
     */
    public java.util.List < DataList> getDataList() {
        return this.dataList;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < DataList> dataList; 
        private String message; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * DataList.
         */
        public Builder dataList(java.util.List < DataList> dataList) {
            this.dataList = dataList;
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

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public SearchPunishEventsResponseBody build() {
            return new SearchPunishEventsResponseBody(this);
        } 

    } 

    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BussinessCode")
        private String bussinessCode;

        @com.aliyun.core.annotation.NameInMap("CaseCode")
        private String caseCode;

        @com.aliyun.core.annotation.NameInMap("RecordsCount")
        private Integer recordsCount;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("TipsCode")
        private String tipsCode;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private DataList(Builder builder) {
            this.bussinessCode = builder.bussinessCode;
            this.caseCode = builder.caseCode;
            this.recordsCount = builder.recordsCount;
            this.resourceId = builder.resourceId;
            this.tipsCode = builder.tipsCode;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return bussinessCode
         */
        public String getBussinessCode() {
            return this.bussinessCode;
        }

        /**
         * @return caseCode
         */
        public String getCaseCode() {
            return this.caseCode;
        }

        /**
         * @return recordsCount
         */
        public Integer getRecordsCount() {
            return this.recordsCount;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return tipsCode
         */
        public String getTipsCode() {
            return this.tipsCode;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String bussinessCode; 
            private String caseCode; 
            private Integer recordsCount; 
            private String resourceId; 
            private String tipsCode; 
            private String userId; 

            /**
             * BussinessCode.
             */
            public Builder bussinessCode(String bussinessCode) {
                this.bussinessCode = bussinessCode;
                return this;
            }

            /**
             * CaseCode.
             */
            public Builder caseCode(String caseCode) {
                this.caseCode = caseCode;
                return this;
            }

            /**
             * RecordsCount.
             */
            public Builder recordsCount(Integer recordsCount) {
                this.recordsCount = recordsCount;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * TipsCode.
             */
            public Builder tipsCode(String tipsCode) {
                this.tipsCode = tipsCode;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
}
