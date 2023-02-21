// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcIcAdminLicenseResponseBody} extends {@link TeaModel}
 *
 * <p>GetOcIcAdminLicenseResponseBody</p>
 */
public class GetOcIcAdminLicenseResponseBody extends TeaModel {
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

    private GetOcIcAdminLicenseResponseBody(Builder builder) {
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

    public static GetOcIcAdminLicenseResponseBody create() {
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

        public GetOcIcAdminLicenseResponseBody build() {
            return new GetOcIcAdminLicenseResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Content")
        private String content;

        @NameInMap("Department")
        private String department;

        @NameInMap("EndDate")
        private String endDate;

        @NameInMap("LicenseName")
        private String licenseName;

        @NameInMap("LicenseNo")
        private String licenseNo;

        @NameInMap("StartDate")
        private String startDate;

        private Data(Builder builder) {
            this.content = builder.content;
            this.department = builder.department;
            this.endDate = builder.endDate;
            this.licenseName = builder.licenseName;
            this.licenseNo = builder.licenseNo;
            this.startDate = builder.startDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return department
         */
        public String getDepartment() {
            return this.department;
        }

        /**
         * @return endDate
         */
        public String getEndDate() {
            return this.endDate;
        }

        /**
         * @return licenseName
         */
        public String getLicenseName() {
            return this.licenseName;
        }

        /**
         * @return licenseNo
         */
        public String getLicenseNo() {
            return this.licenseNo;
        }

        /**
         * @return startDate
         */
        public String getStartDate() {
            return this.startDate;
        }

        public static final class Builder {
            private String content; 
            private String department; 
            private String endDate; 
            private String licenseName; 
            private String licenseNo; 
            private String startDate; 

            /**
             * 许可内容
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * 许可机关
             */
            public Builder department(String department) {
                this.department = department;
                return this;
            }

            /**
             * 有效期至
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * 许可文件名称
             */
            public Builder licenseName(String licenseName) {
                this.licenseName = licenseName;
                return this;
            }

            /**
             * 许可文件编号
             */
            public Builder licenseNo(String licenseNo) {
                this.licenseNo = licenseNo;
                return this;
            }

            /**
             * 有效期自
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
