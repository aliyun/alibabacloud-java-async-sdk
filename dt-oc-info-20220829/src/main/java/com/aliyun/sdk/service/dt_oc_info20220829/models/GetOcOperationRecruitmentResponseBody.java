// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcOperationRecruitmentResponseBody} extends {@link TeaModel}
 *
 * <p>GetOcOperationRecruitmentResponseBody</p>
 */
public class GetOcOperationRecruitmentResponseBody extends TeaModel {
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

    private GetOcOperationRecruitmentResponseBody(Builder builder) {
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

    public static GetOcOperationRecruitmentResponseBody create() {
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

        public GetOcOperationRecruitmentResponseBody build() {
            return new GetOcOperationRecruitmentResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("BenefitList")
        private String benefitList;

        @NameInMap("Description")
        private String description;

        @NameInMap("Education")
        private String education;

        @NameInMap("EndDate")
        private String endDate;

        @NameInMap("EntName")
        private String entName;

        @NameInMap("Experience")
        private String experience;

        @NameInMap("PageUrl")
        private String pageUrl;

        @NameInMap("PublishDate")
        private String publishDate;

        @NameInMap("RecruitingAddress")
        private String recruitingAddress;

        @NameInMap("RecruitingName")
        private String recruitingName;

        @NameInMap("Salary")
        private String salary;

        @NameInMap("StartDate")
        private String startDate;

        private Data(Builder builder) {
            this.benefitList = builder.benefitList;
            this.description = builder.description;
            this.education = builder.education;
            this.endDate = builder.endDate;
            this.entName = builder.entName;
            this.experience = builder.experience;
            this.pageUrl = builder.pageUrl;
            this.publishDate = builder.publishDate;
            this.recruitingAddress = builder.recruitingAddress;
            this.recruitingName = builder.recruitingName;
            this.salary = builder.salary;
            this.startDate = builder.startDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return benefitList
         */
        public String getBenefitList() {
            return this.benefitList;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return education
         */
        public String getEducation() {
            return this.education;
        }

        /**
         * @return endDate
         */
        public String getEndDate() {
            return this.endDate;
        }

        /**
         * @return entName
         */
        public String getEntName() {
            return this.entName;
        }

        /**
         * @return experience
         */
        public String getExperience() {
            return this.experience;
        }

        /**
         * @return pageUrl
         */
        public String getPageUrl() {
            return this.pageUrl;
        }

        /**
         * @return publishDate
         */
        public String getPublishDate() {
            return this.publishDate;
        }

        /**
         * @return recruitingAddress
         */
        public String getRecruitingAddress() {
            return this.recruitingAddress;
        }

        /**
         * @return recruitingName
         */
        public String getRecruitingName() {
            return this.recruitingName;
        }

        /**
         * @return salary
         */
        public String getSalary() {
            return this.salary;
        }

        /**
         * @return startDate
         */
        public String getStartDate() {
            return this.startDate;
        }

        public static final class Builder {
            private String benefitList; 
            private String description; 
            private String education; 
            private String endDate; 
            private String entName; 
            private String experience; 
            private String pageUrl; 
            private String publishDate; 
            private String recruitingAddress; 
            private String recruitingName; 
            private String salary; 
            private String startDate; 

            /**
             * 福利
             */
            public Builder benefitList(String benefitList) {
                this.benefitList = benefitList;
                return this;
            }

            /**
             * 描述
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 学历
             */
            public Builder education(String education) {
                this.education = education;
                return this;
            }

            /**
             * 招聘截止日期
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
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
             * 工作经验
             */
            public Builder experience(String experience) {
                this.experience = experience;
                return this;
            }

            /**
             * 数据源链接
             */
            public Builder pageUrl(String pageUrl) {
                this.pageUrl = pageUrl;
                return this;
            }

            /**
             * 发布日期
             */
            public Builder publishDate(String publishDate) {
                this.publishDate = publishDate;
                return this;
            }

            /**
             * 公司地点
             */
            public Builder recruitingAddress(String recruitingAddress) {
                this.recruitingAddress = recruitingAddress;
                return this;
            }

            /**
             * 职位
             */
            public Builder recruitingName(String recruitingName) {
                this.recruitingName = recruitingName;
                return this;
            }

            /**
             * 薪资
             */
            public Builder salary(String salary) {
                this.salary = salary;
                return this;
            }

            /**
             * 招聘开始日期
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
