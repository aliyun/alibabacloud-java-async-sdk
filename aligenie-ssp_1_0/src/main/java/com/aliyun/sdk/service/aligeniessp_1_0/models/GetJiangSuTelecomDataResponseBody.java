// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link GetJiangSuTelecomDataResponseBody} extends {@link TeaModel}
 *
 * <p>GetJiangSuTelecomDataResponseBody</p>
 */
public class GetJiangSuTelecomDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private GetJiangSuTelecomDataResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJiangSuTelecomDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
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
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(GetJiangSuTelecomDataResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>Status code. Returns 200 for normal responses.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>26C9C3D0-160D-5CDE-BF7A-B3C8D14AA949</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Actual return result of the service</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetJiangSuTelecomDataResponseBody build() {
            return new GetJiangSuTelecomDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetJiangSuTelecomDataResponseBody} extends {@link TeaModel}
     *
     * <p>GetJiangSuTelecomDataResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OssUrl")
        private String ossUrl;

        private Result(Builder builder) {
            this.ossUrl = builder.ossUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return ossUrl
         */
        public String getOssUrl() {
            return this.ossUrl;
        }

        public static final class Builder {
            private String ossUrl; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.ossUrl = model.ossUrl;
            } 

            /**
             * <p>OSS object URL, valid for 10 minutes</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://jiangsu-telecom.oss-cn-zhangjiakou.aliyuncs.com/jiangsuTelecom/jiangsu_telecom_2024-11-06_data.xls?Expires=1731056700&OSSAccessKeyId=STS.NUqZx6e1HjWYHhYwyDqbRNySp&Signature=wqMK%2Bspo08cg7xDIrzJdgFpZT3U%3D&security-token=CAIS6wJ1q6Ft5B2yfSjIr5bEEcKCiO5p3ZWySk7ok3kRfe1%2Bobz4kjz2IHhMeXJsBuketv42nmxV7%2FoblrN0UIQAT1HPbsZsq84Pq1%2F4O9GY%2FpXrseBZ08VJ18si00SpsvXJasDVEfn%2FGJ70GX2m%2BwZ3xbzlD0bAO3WuLZyOj7N%2Bc90TRXPWRDFaBdBQVGAAwY1gQhm3D%2Fu2NQPwiWf9FVdhvhEG6Vly8qOi2MaRmHG85R%2FYsrZL%2B9uuc8b5P5A0Y8wlAo6PsbYoJvab4kl58ANX8ap6tqtA9Arcs8uVa1sruE3ebrGIrYQ3dFUgPPRnQvIdtrP1nvt5%2FOXS0p%2Fs01NHNOpWXiLTAoe7247OBeiqO8p%2FKeyjZGQuOTooxiRr2elNRQX4VGsiE7JJQhf7CU293KO0YeZxdAR%2FoOMPnzRBdA2yRaA0rjOmtJPBTFOEIL7ymXpDY8bnsxtwDRYu1%2BXrCqUee2Ik3j4vnOf9Je0agAEDuPfR8GLB8uVv4ZCGRRAM5mV3gKCxl07flVk1UPsxMZWBeVwwALT34lxk4x6ivWA7ZXjXdMmIapup%2FEb6UU%2BWhJH1G4sevkw5%2BGb8h8aRjJHBoxB4YLXNTEb5Rk6sVv%2BoCfkljy3%2FWImWGIMigurkAfOIBgUSql8JgFTxQrOHbiAA">http://jiangsu-telecom.oss-cn-zhangjiakou.aliyuncs.com/jiangsuTelecom/jiangsu_telecom_2024-11-06_data.xls?Expires=1731056700&amp;OSSAccessKeyId=STS.NUqZx6e1HjWYHhYwyDqbRNySp&amp;Signature=wqMK%2Bspo08cg7xDIrzJdgFpZT3U%3D&amp;security-token=CAIS6wJ1q6Ft5B2yfSjIr5bEEcKCiO5p3ZWySk7ok3kRfe1%2Bobz4kjz2IHhMeXJsBuketv42nmxV7%2FoblrN0UIQAT1HPbsZsq84Pq1%2F4O9GY%2FpXrseBZ08VJ18si00SpsvXJasDVEfn%2FGJ70GX2m%2BwZ3xbzlD0bAO3WuLZyOj7N%2Bc90TRXPWRDFaBdBQVGAAwY1gQhm3D%2Fu2NQPwiWf9FVdhvhEG6Vly8qOi2MaRmHG85R%2FYsrZL%2B9uuc8b5P5A0Y8wlAo6PsbYoJvab4kl58ANX8ap6tqtA9Arcs8uVa1sruE3ebrGIrYQ3dFUgPPRnQvIdtrP1nvt5%2FOXS0p%2Fs01NHNOpWXiLTAoe7247OBeiqO8p%2FKeyjZGQuOTooxiRr2elNRQX4VGsiE7JJQhf7CU293KO0YeZxdAR%2FoOMPnzRBdA2yRaA0rjOmtJPBTFOEIL7ymXpDY8bnsxtwDRYu1%2BXrCqUee2Ik3j4vnOf9Je0agAEDuPfR8GLB8uVv4ZCGRRAM5mV3gKCxl07flVk1UPsxMZWBeVwwALT34lxk4x6ivWA7ZXjXdMmIapup%2FEb6UU%2BWhJH1G4sevkw5%2BGb8h8aRjJHBoxB4YLXNTEb5Rk6sVv%2BoCfkljy3%2FWImWGIMigurkAfOIBgUSql8JgFTxQrOHbiAA</a></p>
             */
            public Builder ossUrl(String ossUrl) {
                this.ossUrl = ossUrl;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
