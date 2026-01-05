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
 * {@link QuerySmsTrademarkResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySmsTrademarkResponseBody</p>
 */
public class QuerySmsTrademarkResponseBody extends TeaModel {
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

    private QuerySmsTrademarkResponseBody(Builder builder) {
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

    public static QuerySmsTrademarkResponseBody create() {
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

        private Builder(QuerySmsTrademarkResponseBody model) {
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

        public QuerySmsTrademarkResponseBody build() {
            return new QuerySmsTrademarkResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySmsTrademarkResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsTrademarkResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TrademarkApplicantName")
        private String trademarkApplicantName;

        @com.aliyun.core.annotation.NameInMap("TrademarkEffExpDate")
        private String trademarkEffExpDate;

        @com.aliyun.core.annotation.NameInMap("TrademarkId")
        private Long trademarkId;

        @com.aliyun.core.annotation.NameInMap("TrademarkName")
        private String trademarkName;

        @com.aliyun.core.annotation.NameInMap("TrademarkPic")
        private String trademarkPic;

        @com.aliyun.core.annotation.NameInMap("TrademarkPicUrl")
        private String trademarkPicUrl;

        @com.aliyun.core.annotation.NameInMap("TrademarkRegistrationNumber")
        private String trademarkRegistrationNumber;

        private Data(Builder builder) {
            this.trademarkApplicantName = builder.trademarkApplicantName;
            this.trademarkEffExpDate = builder.trademarkEffExpDate;
            this.trademarkId = builder.trademarkId;
            this.trademarkName = builder.trademarkName;
            this.trademarkPic = builder.trademarkPic;
            this.trademarkPicUrl = builder.trademarkPicUrl;
            this.trademarkRegistrationNumber = builder.trademarkRegistrationNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return trademarkApplicantName
         */
        public String getTrademarkApplicantName() {
            return this.trademarkApplicantName;
        }

        /**
         * @return trademarkEffExpDate
         */
        public String getTrademarkEffExpDate() {
            return this.trademarkEffExpDate;
        }

        /**
         * @return trademarkId
         */
        public Long getTrademarkId() {
            return this.trademarkId;
        }

        /**
         * @return trademarkName
         */
        public String getTrademarkName() {
            return this.trademarkName;
        }

        /**
         * @return trademarkPic
         */
        public String getTrademarkPic() {
            return this.trademarkPic;
        }

        /**
         * @return trademarkPicUrl
         */
        public String getTrademarkPicUrl() {
            return this.trademarkPicUrl;
        }

        /**
         * @return trademarkRegistrationNumber
         */
        public String getTrademarkRegistrationNumber() {
            return this.trademarkRegistrationNumber;
        }

        public static final class Builder {
            private String trademarkApplicantName; 
            private String trademarkEffExpDate; 
            private Long trademarkId; 
            private String trademarkName; 
            private String trademarkPic; 
            private String trademarkPicUrl; 
            private String trademarkRegistrationNumber; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.trademarkApplicantName = model.trademarkApplicantName;
                this.trademarkEffExpDate = model.trademarkEffExpDate;
                this.trademarkId = model.trademarkId;
                this.trademarkName = model.trademarkName;
                this.trademarkPic = model.trademarkPic;
                this.trademarkPicUrl = model.trademarkPicUrl;
                this.trademarkRegistrationNumber = model.trademarkRegistrationNumber;
            } 

            /**
             * <p>申请人名称</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder trademarkApplicantName(String trademarkApplicantName) {
                this.trademarkApplicantName = trademarkApplicantName;
                return this;
            }

            /**
             * <p>专用权生失效日期</p>
             * 
             * <strong>example:</strong>
             * <p>2025-11-01~2025-12-19</p>
             */
            public Builder trademarkEffExpDate(String trademarkEffExpDate) {
                this.trademarkEffExpDate = trademarkEffExpDate;
                return this;
            }

            /**
             * <p>商标材料id</p>
             * 
             * <strong>example:</strong>
             * <p>10000*******</p>
             */
            public Builder trademarkId(Long trademarkId) {
                this.trademarkId = trademarkId;
                return this;
            }

            /**
             * <p>商标名称</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder trademarkName(String trademarkName) {
                this.trademarkName = trademarkName;
                return this;
            }

            /**
             * <p>商标截图Osskey（给签名传工单用）</p>
             * 
             * <strong>example:</strong>
             * <p>100000*<strong><strong>802/afdebd46-</strong></strong>-46e4-899d-b4375826c898_mhk9oz0p_1762****31542.png</p>
             */
            public Builder trademarkPic(String trademarkPic) {
                this.trademarkPic = trademarkPic;
                return this;
            }

            /**
             * <p>商标截图url地址</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://alicom-fc-media.oss-cn-zhangjiakou.aliyuncs.com/100000****50802/afde****-496d-46e4-899d-b43758****8_mhk9oz0p_176224****542.png?Expires=1762****6&OSSAccessKeyId=bypFN****73PsLI&Signature=BygI9X****h7%2FXmFIo****FB2c%3D">https://alicom-fc-media.oss-cn-zhangjiakou.aliyuncs.com/100000****50802/afde****-496d-46e4-899d-b43758****8_mhk9oz0p_176224****542.png?Expires=1762****6&amp;OSSAccessKeyId=bypFN****73PsLI&amp;Signature=BygI9X****h7%2FXmFIo****FB2c%3D</a></p>
             */
            public Builder trademarkPicUrl(String trademarkPicUrl) {
                this.trademarkPicUrl = trademarkPicUrl;
                return this;
            }

            /**
             * <p>商标注册号</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder trademarkRegistrationNumber(String trademarkRegistrationNumber) {
                this.trademarkRegistrationNumber = trademarkRegistrationNumber;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
