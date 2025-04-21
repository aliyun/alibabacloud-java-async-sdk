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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>D6163397-15C5-419C-9ACC-B7C83E0B4C10</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResultObject.
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
             * CertifyId.
             */
            public Builder certifyId(String certifyId) {
                this.certifyId = certifyId;
                return this;
            }

            /**
             * RiskExtends.
             */
            public Builder riskExtends(String riskExtends) {
                this.riskExtends = riskExtends;
                return this;
            }

            /**
             * RiskTags.
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
