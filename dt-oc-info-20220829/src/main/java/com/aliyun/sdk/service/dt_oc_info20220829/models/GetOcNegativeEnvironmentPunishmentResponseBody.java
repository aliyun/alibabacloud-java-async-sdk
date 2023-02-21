// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcNegativeEnvironmentPunishmentResponseBody} extends {@link TeaModel}
 *
 * <p>GetOcNegativeEnvironmentPunishmentResponseBody</p>
 */
public class GetOcNegativeEnvironmentPunishmentResponseBody extends TeaModel {
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

    private GetOcNegativeEnvironmentPunishmentResponseBody(Builder builder) {
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

    public static GetOcNegativeEnvironmentPunishmentResponseBody create() {
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

        public GetOcNegativeEnvironmentPunishmentResponseBody build() {
            return new GetOcNegativeEnvironmentPunishmentResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Department")
        private String department;

        @NameInMap("EntName")
        private String entName;

        @NameInMap("ExecStatus")
        private String execStatus;

        @NameInMap("PunishBasis")
        private String punishBasis;

        @NameInMap("PunishContent")
        private String punishContent;

        @NameInMap("PunishDate")
        private String punishDate;

        @NameInMap("PunishLaw")
        private String punishLaw;

        @NameInMap("PunishNum")
        private String punishNum;

        @NameInMap("PunishRes")
        private String punishRes;

        private Data(Builder builder) {
            this.department = builder.department;
            this.entName = builder.entName;
            this.execStatus = builder.execStatus;
            this.punishBasis = builder.punishBasis;
            this.punishContent = builder.punishContent;
            this.punishDate = builder.punishDate;
            this.punishLaw = builder.punishLaw;
            this.punishNum = builder.punishNum;
            this.punishRes = builder.punishRes;
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
         * @return execStatus
         */
        public String getExecStatus() {
            return this.execStatus;
        }

        /**
         * @return punishBasis
         */
        public String getPunishBasis() {
            return this.punishBasis;
        }

        /**
         * @return punishContent
         */
        public String getPunishContent() {
            return this.punishContent;
        }

        /**
         * @return punishDate
         */
        public String getPunishDate() {
            return this.punishDate;
        }

        /**
         * @return punishLaw
         */
        public String getPunishLaw() {
            return this.punishLaw;
        }

        /**
         * @return punishNum
         */
        public String getPunishNum() {
            return this.punishNum;
        }

        /**
         * @return punishRes
         */
        public String getPunishRes() {
            return this.punishRes;
        }

        public static final class Builder {
            private String department; 
            private String entName; 
            private String execStatus; 
            private String punishBasis; 
            private String punishContent; 
            private String punishDate; 
            private String punishLaw; 
            private String punishNum; 
            private String punishRes; 

            /**
             * 处罚单位
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
             * 执行情况
             */
            public Builder execStatus(String execStatus) {
                this.execStatus = execStatus;
                return this;
            }

            /**
             * 处罚依据
             */
            public Builder punishBasis(String punishBasis) {
                this.punishBasis = punishBasis;
                return this;
            }

            /**
             * 处罚事由
             */
            public Builder punishContent(String punishContent) {
                this.punishContent = punishContent;
                return this;
            }

            /**
             * 处罚日期
             */
            public Builder punishDate(String punishDate) {
                this.punishDate = punishDate;
                return this;
            }

            /**
             * 违反法律
             */
            public Builder punishLaw(String punishLaw) {
                this.punishLaw = punishLaw;
                return this;
            }

            /**
             * 决定文书号
             */
            public Builder punishNum(String punishNum) {
                this.punishNum = punishNum;
                return this;
            }

            /**
             * 处罚结果
             */
            public Builder punishRes(String punishRes) {
                this.punishRes = punishRes;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
