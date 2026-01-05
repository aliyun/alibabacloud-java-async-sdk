// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

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
 * {@link QuerySmsAppIcpRecordResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySmsAppIcpRecordResponseBody</p>
 */
public class QuerySmsAppIcpRecordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QuerySmsAppIcpRecordResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySmsAppIcpRecordResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
    public java.util.List<Data> getData() {
        return this.data;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QuerySmsAppIcpRecordResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

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
        public Builder data(java.util.List<Data> data) {
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

        public QuerySmsAppIcpRecordResponseBody build() {
            return new QuerySmsAppIcpRecordResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySmsAppIcpRecordResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsAppIcpRecordResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppApprovalDate")
        private String appApprovalDate;

        @com.aliyun.core.annotation.NameInMap("AppIcpLicenseNumber")
        private String appIcpLicenseNumber;

        @com.aliyun.core.annotation.NameInMap("AppIcpRecordId")
        private Long appIcpRecordId;

        @com.aliyun.core.annotation.NameInMap("AppIcpRecordPic")
        private String appIcpRecordPic;

        @com.aliyun.core.annotation.NameInMap("AppIcpRecordPicUrl")
        private String appIcpRecordPicUrl;

        @com.aliyun.core.annotation.NameInMap("AppPrincipalUnitName")
        private String appPrincipalUnitName;

        @com.aliyun.core.annotation.NameInMap("AppServiceName")
        private String appServiceName;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        private Data(Builder builder) {
            this.appApprovalDate = builder.appApprovalDate;
            this.appIcpLicenseNumber = builder.appIcpLicenseNumber;
            this.appIcpRecordId = builder.appIcpRecordId;
            this.appIcpRecordPic = builder.appIcpRecordPic;
            this.appIcpRecordPicUrl = builder.appIcpRecordPicUrl;
            this.appPrincipalUnitName = builder.appPrincipalUnitName;
            this.appServiceName = builder.appServiceName;
            this.domain = builder.domain;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appApprovalDate
         */
        public String getAppApprovalDate() {
            return this.appApprovalDate;
        }

        /**
         * @return appIcpLicenseNumber
         */
        public String getAppIcpLicenseNumber() {
            return this.appIcpLicenseNumber;
        }

        /**
         * @return appIcpRecordId
         */
        public Long getAppIcpRecordId() {
            return this.appIcpRecordId;
        }

        /**
         * @return appIcpRecordPic
         */
        public String getAppIcpRecordPic() {
            return this.appIcpRecordPic;
        }

        /**
         * @return appIcpRecordPicUrl
         */
        public String getAppIcpRecordPicUrl() {
            return this.appIcpRecordPicUrl;
        }

        /**
         * @return appPrincipalUnitName
         */
        public String getAppPrincipalUnitName() {
            return this.appPrincipalUnitName;
        }

        /**
         * @return appServiceName
         */
        public String getAppServiceName() {
            return this.appServiceName;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        public static final class Builder {
            private String appApprovalDate; 
            private String appIcpLicenseNumber; 
            private Long appIcpRecordId; 
            private String appIcpRecordPic; 
            private String appIcpRecordPicUrl; 
            private String appPrincipalUnitName; 
            private String appServiceName; 
            private String domain; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.appApprovalDate = model.appApprovalDate;
                this.appIcpLicenseNumber = model.appIcpLicenseNumber;
                this.appIcpRecordId = model.appIcpRecordId;
                this.appIcpRecordPic = model.appIcpRecordPic;
                this.appIcpRecordPicUrl = model.appIcpRecordPicUrl;
                this.appPrincipalUnitName = model.appPrincipalUnitName;
                this.appServiceName = model.appServiceName;
                this.domain = model.domain;
            } 

            /**
             * <p>审核通过日期，示例2025-09-01</p>
             * 
             * <strong>example:</strong>
             * <p>2020-01-01</p>
             */
            public Builder appApprovalDate(String appApprovalDate) {
                this.appApprovalDate = appApprovalDate;
                return this;
            }

            /**
             * <p>ICP备案/许可证号</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder appIcpLicenseNumber(String appIcpLicenseNumber) {
                this.appIcpLicenseNumber = appIcpLicenseNumber;
                return this;
            }

            /**
             * <p>app-icp备案材料id</p>
             * 
             * <strong>example:</strong>
             * <p>51</p>
             */
            public Builder appIcpRecordId(Long appIcpRecordId) {
                this.appIcpRecordId = appIcpRecordId;
                return this;
            }

            /**
             * <p>app-icp备案截图图片Osskey（给签名传工单用）</p>
             * 
             * <strong>example:</strong>
             * <p>10000025<em><strong><strong>02/ac181696-</strong></strong>-49c6-90dc-50689267aa00_mhsjd8b8_17****</em>662348.jpeg</p>
             */
            public Builder appIcpRecordPic(String appIcpRecordPic) {
                this.appIcpRecordPic = appIcpRecordPic;
                return this;
            }

            /**
             * <p>app-icp备案截图url地址</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://alicom-fc-media.oss-cn-zhangjiakou.aliyuncs.com/100000****50802/afde****-496d-46e4-899d-b43758****8_mhk9oz0p_176224****542.png?Expires=1762****6&OSSAccessKeyId=bypFN****73PsLI&Signature=BygI9X****h7%2FXmFIo****FB2c%3D">https://alicom-fc-media.oss-cn-zhangjiakou.aliyuncs.com/100000****50802/afde****-496d-46e4-899d-b43758****8_mhk9oz0p_176224****542.png?Expires=1762****6&amp;OSSAccessKeyId=bypFN****73PsLI&amp;Signature=BygI9X****h7%2FXmFIo****FB2c%3D</a></p>
             */
            public Builder appIcpRecordPicUrl(String appIcpRecordPicUrl) {
                this.appIcpRecordPicUrl = appIcpRecordPicUrl;
                return this;
            }

            /**
             * <p>主办单位名称</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder appPrincipalUnitName(String appPrincipalUnitName) {
                this.appPrincipalUnitName = appPrincipalUnitName;
                return this;
            }

            /**
             * <p>app服务名称</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder appServiceName(String appServiceName) {
                this.appServiceName = appServiceName;
                return this;
            }

            /**
             * <p>APP应用商店链接</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://test">https://test</a></p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
