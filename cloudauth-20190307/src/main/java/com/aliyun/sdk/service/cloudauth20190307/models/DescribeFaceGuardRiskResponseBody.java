// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
        @com.aliyun.core.annotation.NameInMap("RiakTags")
        private String riakTags;

        @com.aliyun.core.annotation.NameInMap("RiskExtends")
        private String riskExtends;

        private ResultObject(Builder builder) {
            this.riakTags = builder.riakTags;
            this.riskExtends = builder.riskExtends;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return riakTags
         */
        public String getRiakTags() {
            return this.riakTags;
        }

        /**
         * @return riskExtends
         */
        public String getRiskExtends() {
            return this.riskExtends;
        }

        public static final class Builder {
            private String riakTags; 
            private String riskExtends; 

            /**
             * RiakTags.
             */
            public Builder riakTags(String riakTags) {
                this.riakTags = riakTags;
                return this;
            }

            /**
             * RiskExtends.
             */
            public Builder riskExtends(String riskExtends) {
                this.riskExtends = riskExtends;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
