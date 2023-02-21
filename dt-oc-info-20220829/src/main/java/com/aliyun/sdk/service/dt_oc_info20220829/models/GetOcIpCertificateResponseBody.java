// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcIpCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>GetOcIpCertificateResponseBody</p>
 */
public class GetOcIpCertificateResponseBody extends TeaModel {
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

    private GetOcIpCertificateResponseBody(Builder builder) {
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

    public static GetOcIpCertificateResponseBody create() {
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

        public GetOcIpCertificateResponseBody build() {
            return new GetOcIpCertificateResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AuthorizeDate")
        private String authorizeDate;

        @NameInMap("AuthorizeDepartment")
        private String authorizeDepartment;

        @NameInMap("CertNum")
        private String certNum;

        @NameInMap("CertScope")
        private String certScope;

        @NameInMap("CertType")
        private String certType;

        @NameInMap("EntName")
        private String entName;

        @NameInMap("Province")
        private String province;

        @NameInMap("PubDate")
        private String pubDate;

        @NameInMap("ValidEndDate")
        private String validEndDate;

        @NameInMap("ValidStartDate")
        private String validStartDate;

        private Data(Builder builder) {
            this.authorizeDate = builder.authorizeDate;
            this.authorizeDepartment = builder.authorizeDepartment;
            this.certNum = builder.certNum;
            this.certScope = builder.certScope;
            this.certType = builder.certType;
            this.entName = builder.entName;
            this.province = builder.province;
            this.pubDate = builder.pubDate;
            this.validEndDate = builder.validEndDate;
            this.validStartDate = builder.validStartDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return authorizeDate
         */
        public String getAuthorizeDate() {
            return this.authorizeDate;
        }

        /**
         * @return authorizeDepartment
         */
        public String getAuthorizeDepartment() {
            return this.authorizeDepartment;
        }

        /**
         * @return certNum
         */
        public String getCertNum() {
            return this.certNum;
        }

        /**
         * @return certScope
         */
        public String getCertScope() {
            return this.certScope;
        }

        /**
         * @return certType
         */
        public String getCertType() {
            return this.certType;
        }

        /**
         * @return entName
         */
        public String getEntName() {
            return this.entName;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        /**
         * @return pubDate
         */
        public String getPubDate() {
            return this.pubDate;
        }

        /**
         * @return validEndDate
         */
        public String getValidEndDate() {
            return this.validEndDate;
        }

        /**
         * @return validStartDate
         */
        public String getValidStartDate() {
            return this.validStartDate;
        }

        public static final class Builder {
            private String authorizeDate; 
            private String authorizeDepartment; 
            private String certNum; 
            private String certScope; 
            private String certType; 
            private String entName; 
            private String province; 
            private String pubDate; 
            private String validEndDate; 
            private String validStartDate; 

            /**
             * 授权日期
             */
            public Builder authorizeDate(String authorizeDate) {
                this.authorizeDate = authorizeDate;
                return this;
            }

            /**
             * 授权部门
             */
            public Builder authorizeDepartment(String authorizeDepartment) {
                this.authorizeDepartment = authorizeDepartment;
                return this;
            }

            /**
             * 证书认证编号
             */
            public Builder certNum(String certNum) {
                this.certNum = certNum;
                return this;
            }

            /**
             * 认证范围
             */
            public Builder certScope(String certScope) {
                this.certScope = certScope;
                return this;
            }

            /**
             * 证书类型
             */
            public Builder certType(String certType) {
                this.certType = certType;
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
             * 省份
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            /**
             * 公示日期
             */
            public Builder pubDate(String pubDate) {
                this.pubDate = pubDate;
                return this;
            }

            /**
             * 有效期截止日期
             */
            public Builder validEndDate(String validEndDate) {
                this.validEndDate = validEndDate;
                return this;
            }

            /**
             * 有效期开始日期
             */
            public Builder validStartDate(String validStartDate) {
                this.validStartDate = validStartDate;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
