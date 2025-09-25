// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link DescribeFaceGuardRiskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFaceGuardRiskResponseBody</p>
 */
public class DescribeFaceGuardRiskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private ResultObject resultObject;

    private DescribeFaceGuardRiskResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFaceGuardRiskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
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
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private ResultObject resultObject; 

        private Builder() {
        } 

        private Builder(DescribeFaceGuardRiskResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>Return code, <strong>200</strong> indicates successful response from the interface.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Return message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>ID of the request</p>
         * 
         * <strong>example:</strong>
         * <p>D6163397-15C5-419C-9ACC-B7C83E0B4C10</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returned result information.</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeFaceGuardRiskResponseBody build() {
            return new DescribeFaceGuardRiskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFaceGuardRiskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFaceGuardRiskResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertifyId")
        private String certifyId;

        @com.aliyun.core.annotation.NameInMap("RiskExtends")
        private String riskExtends;

        @com.aliyun.core.annotation.NameInMap("RiskTags")
        private String riskTags;

        private ResultObject(Builder builder) {
            this.certifyId = builder.certifyId;
            this.riskExtends = builder.riskExtends;
            this.riskTags = builder.riskTags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return certifyId
         */
        public String getCertifyId() {
            return this.certifyId;
        }

        /**
         * @return riskExtends
         */
        public String getRiskExtends() {
            return this.riskExtends;
        }

        /**
         * @return riskTags
         */
        public String getRiskTags() {
            return this.riskTags;
        }

        public static final class Builder {
            private String certifyId; 
            private String riskExtends; 
            private String riskTags; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.certifyId = model.certifyId;
                this.riskExtends = model.riskExtends;
                this.riskTags = model.riskTags;
            } 

            /**
             * <p>Unique real-person authentication identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>sha43d9cabd52d370d9f4cca9468f71e</p>
             */
            public Builder certifyId(String certifyId) {
                this.certifyId = certifyId;
                return this;
            }

            /**
             * <p>Extended information, in JSON format. (Customized return based on tenant requirements)</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;code&quot;: 200
             *   &quot;badNet&quot;:false,
             *   &quot;umid&quot;:&quot;74e37355171ab62230063569350d368e&quot;,
             *   &quot;fileTags&quot;:&quot;basic_root,basic_hook&quot;,
             *   &quot;queryCount&quot;:1,
             *   &quot;querySessionCount&quot;:1,
             *   &quot;queryUmidCount&quot;:1
             *   &quot;platform&quot;:&quot;Android&quot;
             * }</p>
             */
            public Builder riskExtends(String riskExtends) {
                this.riskExtends = riskExtends;
                return this;
            }

            /**
             * <p>Device risk tags.</p>
             * <ul>
             * <li><p>Multiple device risk tags are separated by commas (,). For example, “ROOT,VPN,HOOK”,</p>
             * </li>
             * <li><p>For more information about device risk tags and their meanings, please refer to the official documentation on Face Guard Tag Descriptions.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ROOT,VPN,HOOK</p>
             */
            public Builder riskTags(String riskTags) {
                this.riskTags = riskTags;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
