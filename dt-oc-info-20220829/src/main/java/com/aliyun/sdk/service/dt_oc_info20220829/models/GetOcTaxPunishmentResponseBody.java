// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcTaxPunishmentResponseBody} extends {@link TeaModel}
 *
 * <p>GetOcTaxPunishmentResponseBody</p>
 */
public class GetOcTaxPunishmentResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageIndex")
    private Integer pageIndex;

    @NameInMap("PageNum")
    private Integer pageNum;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalNum")
    private Integer totalNum;

    private GetOcTaxPunishmentResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.pageIndex = builder.pageIndex;
        this.pageNum = builder.pageNum;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalNum = builder.totalNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOcTaxPunishmentResponseBody create() {
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
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalNum
     */
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private Integer pageIndex; 
        private Integer pageNum; 
        private String requestId; 
        private Boolean success; 
        private Integer totalNum; 

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
         * PageIndex.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.pageNum = pageNum;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalNum.
         */
        public Builder totalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        public GetOcTaxPunishmentResponseBody build() {
            return new GetOcTaxPunishmentResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Department")
        private String department;

        @NameInMap("EntName")
        private String entName;

        @NameInMap("EventName")
        private String eventName;

        @NameInMap("EventType")
        private String eventType;

        @NameInMap("LegalName")
        private String legalName;

        @NameInMap("PunishDate")
        private String punishDate;

        @NameInMap("TaxpayerNum")
        private String taxpayerNum;

        @NameInMap("Title")
        private String title;

        private Data(Builder builder) {
            this.department = builder.department;
            this.entName = builder.entName;
            this.eventName = builder.eventName;
            this.eventType = builder.eventType;
            this.legalName = builder.legalName;
            this.punishDate = builder.punishDate;
            this.taxpayerNum = builder.taxpayerNum;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return department
         */
        public String getDepartment() {
            return this.department;
        }

        /**
         * @return entName
         */
        public String getEntName() {
            return this.entName;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        /**
         * @return legalName
         */
        public String getLegalName() {
            return this.legalName;
        }

        /**
         * @return punishDate
         */
        public String getPunishDate() {
            return this.punishDate;
        }

        /**
         * @return taxpayerNum
         */
        public String getTaxpayerNum() {
            return this.taxpayerNum;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String department; 
            private String entName; 
            private String eventName; 
            private String eventType; 
            private String legalName; 
            private String punishDate; 
            private String taxpayerNum; 
            private String title; 

            /**
             * 税务局
             */
            public Builder department(String department) {
                this.department = department;
                return this;
            }

            /**
             * 企业名称
             */
            public Builder entName(String entName) {
                this.entName = entName;
                return this;
            }

            /**
             * 事件名称
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * 事件类型
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * 法人代表姓名
             */
            public Builder legalName(String legalName) {
                this.legalName = legalName;
                return this;
            }

            /**
             * 处罚时间
             */
            public Builder punishDate(String punishDate) {
                this.punishDate = punishDate;
                return this;
            }

            /**
             * 识别号
             */
            public Builder taxpayerNum(String taxpayerNum) {
                this.taxpayerNum = taxpayerNum;
                return this;
            }

            /**
             * 标题
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
