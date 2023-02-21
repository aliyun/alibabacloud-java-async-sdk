// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcNegativeCustomsPunishmentResponseBody} extends {@link TeaModel}
 *
 * <p>GetOcNegativeCustomsPunishmentResponseBody</p>
 */
public class GetOcNegativeCustomsPunishmentResponseBody extends TeaModel {
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

    private GetOcNegativeCustomsPunishmentResponseBody(Builder builder) {
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

    public static GetOcNegativeCustomsPunishmentResponseBody create() {
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

        public GetOcNegativeCustomsPunishmentResponseBody build() {
            return new GetOcNegativeCustomsPunishmentResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Basis")
        private String basis;

        @NameInMap("CaseNo")
        private String caseNo;

        @NameInMap("Customs")
        private String customs;

        @NameInMap("CustomsNo")
        private String customsNo;

        @NameInMap("LegalName")
        private String legalName;

        @NameInMap("PunishDate")
        private String punishDate;

        @NameInMap("PunishType")
        private String punishType;

        @NameInMap("Title")
        private String title;

        private Data(Builder builder) {
            this.basis = builder.basis;
            this.caseNo = builder.caseNo;
            this.customs = builder.customs;
            this.customsNo = builder.customsNo;
            this.legalName = builder.legalName;
            this.punishDate = builder.punishDate;
            this.punishType = builder.punishType;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return basis
         */
        public String getBasis() {
            return this.basis;
        }

        /**
         * @return caseNo
         */
        public String getCaseNo() {
            return this.caseNo;
        }

        /**
         * @return customs
         */
        public String getCustoms() {
            return this.customs;
        }

        /**
         * @return customsNo
         */
        public String getCustomsNo() {
            return this.customsNo;
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
         * @return punishType
         */
        public String getPunishType() {
            return this.punishType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String basis; 
            private String caseNo; 
            private String customs; 
            private String customsNo; 
            private String legalName; 
            private String punishDate; 
            private String punishType; 
            private String title; 

            /**
             * 依据
             */
            public Builder basis(String basis) {
                this.basis = basis;
                return this;
            }

            /**
             * 处罚决定书文号
             */
            public Builder caseNo(String caseNo) {
                this.caseNo = caseNo;
                return this;
            }

            /**
             * 海关名称
             */
            public Builder customs(String customs) {
                this.customs = customs;
                return this;
            }

            /**
             * 海关注册编码
             */
            public Builder customsNo(String customsNo) {
                this.customsNo = customsNo;
                return this;
            }

            /**
             * 法定代表人
             */
            public Builder legalName(String legalName) {
                this.legalName = legalName;
                return this;
            }

            /**
             * 业务时间
             */
            public Builder punishDate(String punishDate) {
                this.punishDate = punishDate;
                return this;
            }

            /**
             * 处罚类别/案件性质
             */
            public Builder punishType(String punishType) {
                this.punishType = punishType;
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
