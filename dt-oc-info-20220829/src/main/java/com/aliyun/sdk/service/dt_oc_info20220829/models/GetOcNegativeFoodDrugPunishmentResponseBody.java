// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcNegativeFoodDrugPunishmentResponseBody} extends {@link TeaModel}
 *
 * <p>GetOcNegativeFoodDrugPunishmentResponseBody</p>
 */
public class GetOcNegativeFoodDrugPunishmentResponseBody extends TeaModel {
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

    private GetOcNegativeFoodDrugPunishmentResponseBody(Builder builder) {
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

    public static GetOcNegativeFoodDrugPunishmentResponseBody create() {
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

        public GetOcNegativeFoodDrugPunishmentResponseBody build() {
            return new GetOcNegativeFoodDrugPunishmentResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Department")
        private String department;

        @NameInMap("EntName")
        private String entName;

        @NameInMap("IllegalType")
        private String illegalType;

        @NameInMap("LawBasis")
        private String lawBasis;

        @NameInMap("PublicDate")
        private String publicDate;

        @NameInMap("PunishDate")
        private String punishDate;

        @NameInMap("PunishNum")
        private String punishNum;

        @NameInMap("PunishResult")
        private String punishResult;

        private Data(Builder builder) {
            this.department = builder.department;
            this.entName = builder.entName;
            this.illegalType = builder.illegalType;
            this.lawBasis = builder.lawBasis;
            this.publicDate = builder.publicDate;
            this.punishDate = builder.punishDate;
            this.punishNum = builder.punishNum;
            this.punishResult = builder.punishResult;
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
         * @return illegalType
         */
        public String getIllegalType() {
            return this.illegalType;
        }

        /**
         * @return lawBasis
         */
        public String getLawBasis() {
            return this.lawBasis;
        }

        /**
         * @return publicDate
         */
        public String getPublicDate() {
            return this.publicDate;
        }

        /**
         * @return punishDate
         */
        public String getPunishDate() {
            return this.punishDate;
        }

        /**
         * @return punishNum
         */
        public String getPunishNum() {
            return this.punishNum;
        }

        /**
         * @return punishResult
         */
        public String getPunishResult() {
            return this.punishResult;
        }

        public static final class Builder {
            private String department; 
            private String entName; 
            private String illegalType; 
            private String lawBasis; 
            private String publicDate; 
            private String punishDate; 
            private String punishNum; 
            private String punishResult; 

            /**
             * 处罚机关
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
             * 违法类型
             */
            public Builder illegalType(String illegalType) {
                this.illegalType = illegalType;
                return this;
            }

            /**
             * 处罚依据
             */
            public Builder lawBasis(String lawBasis) {
                this.lawBasis = lawBasis;
                return this;
            }

            /**
             * 公示日期
             */
            public Builder publicDate(String publicDate) {
                this.publicDate = publicDate;
                return this;
            }

            /**
             * 决定日期
             */
            public Builder punishDate(String punishDate) {
                this.punishDate = punishDate;
                return this;
            }

            /**
             * 处罚编号
             */
            public Builder punishNum(String punishNum) {
                this.punishNum = punishNum;
                return this;
            }

            /**
             * 处罚结果
             */
            public Builder punishResult(String punishResult) {
                this.punishResult = punishResult;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
