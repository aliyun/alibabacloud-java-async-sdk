// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mssp20161228.models;

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
 * {@link GetConsoleScoreResponseBody} extends {@link TeaModel}
 *
 * <p>GetConsoleScoreResponseBody</p>
 */
public class GetConsoleScoreResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Object data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetConsoleScoreResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConsoleScoreResponseBody create() {
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
    public Object getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private String code; 
        private Object data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>Interface response code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Data returned by the interface.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;score&quot;: &quot;94.00&quot;,
         *     &quot;consoleScoreTrendDTOS&quot;: [
         *         {
         *             &quot;date&quot;: &quot;20241009&quot;,
         *             &quot;score&quot;: &quot;100.0&quot;
         *         }
         *     ],
         *     &quot;cyclicYearOverYear&quot;: &quot;-6.00&quot;,
         *     &quot;recordDate&quot;: &quot;20241209&quot;,
         *     &quot;weeklyYearOverYear&quot;: &quot;1.62&quot;,
         *     &quot;aboveWholeNetworkUserRatio&quot;: &quot;6.25&quot;,
         *     &quot;aliUid&quot;: &quot;1601097845544644&quot;,
         *     &quot;detailJson&quot;: &quot;[{&quot;detailDTO&quot;:[{&quot;count&quot;:0,&quot;itemName&quot;:&quot;应用漏洞POC验证&quot;,&quot;mark&quot;:&quot;1&quot;},{&quot;count&quot;:0,&quot;itemName&quot;:&quot;未授权访问漏洞（公网暴露）&quot;,&quot;mark&quot;:&quot;1&quot;},{&quot;count&quot;:0,&quot;itemName&quot;:&quot;后台弱口令漏洞（公网暴露）&quot;,&quot;mark&quot;:&quot;1&quot;},{&quot;count&quot;:0,&quot;itemName&quot;:&quot;文件上传漏洞（公网暴露）&quot;,&quot;mark&quot;:&quot;1&quot;}],&quot;markRate&quot;:&quot;0.5&quot;,&quot;markType&quot;:&quot;vul&quot;},{&quot;detailDTO&quot;:[{&quot;count&quot;:12,&quot;itemName&quot;:&quot;WAF3.0回源配置不正确&quot;,&quot;mark&quot;:&quot;1&quot;},{&quot;count&quot;:0,&quot;itemName&quot;:&quot;AK泄露检查未开启&quot;,&quot;mark&quot;:&quot;1&quot;},{&quot;count&quot;:0,&quot;itemName&quot;:&quot;DNAT管理端口开放&quot;,&quot;mark&quot;:&quot;1&quot;},{&quot;count&quot;:0,&quot;itemName&quot;:&quot;高危端口暴露&quot;,&quot;mark&quot;:&quot;0.5&quot;}],&quot;markRate&quot;:&quot;0.5&quot;,&quot;markType&quot;:&quot;risk&quot;}]&quot;
         * }</p>
         */
        public Builder data(Object data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Prompt message for the result returned.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>D0937B0F-9180-5F70-B6ED-0BA22591627F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful. true means success, false means failure.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetConsoleScoreResponseBody build() {
            return new GetConsoleScoreResponseBody(this);
        } 

    } 

}
