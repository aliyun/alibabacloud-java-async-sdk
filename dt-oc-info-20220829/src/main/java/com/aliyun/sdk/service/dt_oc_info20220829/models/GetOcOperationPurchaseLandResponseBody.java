// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcOperationPurchaseLandResponseBody} extends {@link TeaModel}
 *
 * <p>GetOcOperationPurchaseLandResponseBody</p>
 */
public class GetOcOperationPurchaseLandResponseBody extends TeaModel {
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

    private GetOcOperationPurchaseLandResponseBody(Builder builder) {
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

    public static GetOcOperationPurchaseLandResponseBody create() {
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

        public GetOcOperationPurchaseLandResponseBody build() {
            return new GetOcOperationPurchaseLandResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Area")
        private String area;

        @NameInMap("Department")
        private String department;

        @NameInMap("ElectronicNo")
        private String electronicNo;

        @NameInMap("EntName")
        private String entName;

        @NameInMap("Industry")
        private String industry;

        @NameInMap("LandLevel")
        private String landLevel;

        @NameInMap("LandSource")
        private String landSource;

        @NameInMap("LandUse")
        private String landUse;

        @NameInMap("Location")
        private String location;

        @NameInMap("Price")
        private String price;

        @NameInMap("ProjectName")
        private String projectName;

        @NameInMap("PromiseDeliveryDate")
        private String promiseDeliveryDate;

        @NameInMap("PromiseEndDate")
        private String promiseEndDate;

        @NameInMap("PromiseStartDate")
        private String promiseStartDate;

        @NameInMap("RegionName")
        private String regionName;

        @NameInMap("ReleaseDate")
        private String releaseDate;

        @NameInMap("SigningMode")
        private String signingMode;

        @NameInMap("UseYear")
        private String useYear;

        @NameInMap("VolumeFractionLowerBound")
        private String volumeFractionLowerBound;

        @NameInMap("VolumeFractionUpperBound")
        private String volumeFractionUpperBound;

        private Data(Builder builder) {
            this.area = builder.area;
            this.department = builder.department;
            this.electronicNo = builder.electronicNo;
            this.entName = builder.entName;
            this.industry = builder.industry;
            this.landLevel = builder.landLevel;
            this.landSource = builder.landSource;
            this.landUse = builder.landUse;
            this.location = builder.location;
            this.price = builder.price;
            this.projectName = builder.projectName;
            this.promiseDeliveryDate = builder.promiseDeliveryDate;
            this.promiseEndDate = builder.promiseEndDate;
            this.promiseStartDate = builder.promiseStartDate;
            this.regionName = builder.regionName;
            this.releaseDate = builder.releaseDate;
            this.signingMode = builder.signingMode;
            this.useYear = builder.useYear;
            this.volumeFractionLowerBound = builder.volumeFractionLowerBound;
            this.volumeFractionUpperBound = builder.volumeFractionUpperBound;
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
         * @return department
         */
        public String getDepartment() {
            return this.department;
        }

        /**
         * @return electronicNo
         */
        public String getElectronicNo() {
            return this.electronicNo;
        }

        /**
         * @return entName
         */
        public String getEntName() {
            return this.entName;
        }

        /**
         * @return industry
         */
        public String getIndustry() {
            return this.industry;
        }

        /**
         * @return landLevel
         */
        public String getLandLevel() {
            return this.landLevel;
        }

        /**
         * @return landSource
         */
        public String getLandSource() {
            return this.landSource;
        }

        /**
         * @return landUse
         */
        public String getLandUse() {
            return this.landUse;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return price
         */
        public String getPrice() {
            return this.price;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return promiseDeliveryDate
         */
        public String getPromiseDeliveryDate() {
            return this.promiseDeliveryDate;
        }

        /**
         * @return promiseEndDate
         */
        public String getPromiseEndDate() {
            return this.promiseEndDate;
        }

        /**
         * @return promiseStartDate
         */
        public String getPromiseStartDate() {
            return this.promiseStartDate;
        }

        /**
         * @return regionName
         */
        public String getRegionName() {
            return this.regionName;
        }

        /**
         * @return releaseDate
         */
        public String getReleaseDate() {
            return this.releaseDate;
        }

        /**
         * @return signingMode
         */
        public String getSigningMode() {
            return this.signingMode;
        }

        /**
         * @return useYear
         */
        public String getUseYear() {
            return this.useYear;
        }

        /**
         * @return volumeFractionLowerBound
         */
        public String getVolumeFractionLowerBound() {
            return this.volumeFractionLowerBound;
        }

        /**
         * @return volumeFractionUpperBound
         */
        public String getVolumeFractionUpperBound() {
            return this.volumeFractionUpperBound;
        }

        public static final class Builder {
            private String area; 
            private String department; 
            private String electronicNo; 
            private String entName; 
            private String industry; 
            private String landLevel; 
            private String landSource; 
            private String landUse; 
            private String location; 
            private String price; 
            private String projectName; 
            private String promiseDeliveryDate; 
            private String promiseEndDate; 
            private String promiseStartDate; 
            private String regionName; 
            private String releaseDate; 
            private String signingMode; 
            private String useYear; 
            private String volumeFractionLowerBound; 
            private String volumeFractionUpperBound; 

            /**
             * 面积（公顷）
             */
            public Builder area(String area) {
                this.area = area;
                return this;
            }

            /**
             * 批准单位
             */
            public Builder department(String department) {
                this.department = department;
                return this;
            }

            /**
             * 电子监管号
             */
            public Builder electronicNo(String electronicNo) {
                this.electronicNo = electronicNo;
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
             * 行业分类
             */
            public Builder industry(String industry) {
                this.industry = industry;
                return this;
            }

            /**
             * 土地级别
             */
            public Builder landLevel(String landLevel) {
                this.landLevel = landLevel;
                return this;
            }

            /**
             * 土地来源
             */
            public Builder landSource(String landSource) {
                this.landSource = landSource;
                return this;
            }

            /**
             * 土地用途
             */
            public Builder landUse(String landUse) {
                this.landUse = landUse;
                return this;
            }

            /**
             * 项目位置
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * 标准化成交价格（数值+单位+币种）
             */
            public Builder price(String price) {
                this.price = price;
                return this;
            }

            /**
             * 项目名称
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * 约定交地日期
             */
            public Builder promiseDeliveryDate(String promiseDeliveryDate) {
                this.promiseDeliveryDate = promiseDeliveryDate;
                return this;
            }

            /**
             * 约定竣工日期
             */
            public Builder promiseEndDate(String promiseEndDate) {
                this.promiseEndDate = promiseEndDate;
                return this;
            }

            /**
             * 约定开发日期
             */
            public Builder promiseStartDate(String promiseStartDate) {
                this.promiseStartDate = promiseStartDate;
                return this;
            }

            /**
             * 所在行政区
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            /**
             * 合同签订时间
             */
            public Builder releaseDate(String releaseDate) {
                this.releaseDate = releaseDate;
                return this;
            }

            /**
             * 供地方式
             */
            public Builder signingMode(String signingMode) {
                this.signingMode = signingMode;
                return this;
            }

            /**
             * 使用年限
             */
            public Builder useYear(String useYear) {
                this.useYear = useYear;
                return this;
            }

            /**
             * 约定容积率：下限
             */
            public Builder volumeFractionLowerBound(String volumeFractionLowerBound) {
                this.volumeFractionLowerBound = volumeFractionLowerBound;
                return this;
            }

            /**
             * 约定容积率：上限
             */
            public Builder volumeFractionUpperBound(String volumeFractionUpperBound) {
                this.volumeFractionUpperBound = volumeFractionUpperBound;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
