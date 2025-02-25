// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imarketing20220704.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryBenefitGrantResultResponseBody} extends {@link TeaModel}
 *
 * <p>QueryBenefitGrantResultResponseBody</p>
 */
public class QueryBenefitGrantResultResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Debug")
    private Boolean debug;

    @NameInMap("Message")
    private String message;

    @NameInMap("Model")
    private Model model;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryBenefitGrantResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.debug = builder.debug;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBenefitGrantResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return debug
     */
    public Boolean getDebug() {
        return this.debug;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return model
     */
    public Model getModel() {
        return this.model;
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
        private Boolean debug; 
        private String message; 
        private Model model; 
        private String requestId; 
        private Boolean success; 

        /**
         * Id of the request
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * 123
         */
        public Builder debug(Boolean debug) {
            this.debug = debug;
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
         * Model.
         */
        public Builder model(Model model) {
            this.model = model;
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

        public QueryBenefitGrantResultResponseBody build() {
            return new QueryBenefitGrantResultResponseBody(this);
        } 

    } 

    public static class Model extends TeaModel {
        @NameInMap("Amount")
        private Long amount;

        @NameInMap("CloudcodeFlowNo")
        private String cloudcodeFlowNo;

        @NameInMap("OuterCustomerId")
        private String outerCustomerId;

        @NameInMap("OuterFlowNo")
        private String outerFlowNo;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("Status")
        private Integer status;

        private Model(Builder builder) {
            this.amount = builder.amount;
            this.cloudcodeFlowNo = builder.cloudcodeFlowNo;
            this.outerCustomerId = builder.outerCustomerId;
            this.outerFlowNo = builder.outerFlowNo;
            this.remark = builder.remark;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Long getAmount() {
            return this.amount;
        }

        /**
         * @return cloudcodeFlowNo
         */
        public String getCloudcodeFlowNo() {
            return this.cloudcodeFlowNo;
        }

        /**
         * @return outerCustomerId
         */
        public String getOuterCustomerId() {
            return this.outerCustomerId;
        }

        /**
         * @return outerFlowNo
         */
        public String getOuterFlowNo() {
            return this.outerFlowNo;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long amount; 
            private String cloudcodeFlowNo; 
            private String outerCustomerId; 
            private String outerFlowNo; 
            private String remark; 
            private Integer status; 

            /**
             * Amount.
             */
            public Builder amount(Long amount) {
                this.amount = amount;
                return this;
            }

            /**
             * 12345
             */
            public Builder cloudcodeFlowNo(String cloudcodeFlowNo) {
                this.cloudcodeFlowNo = cloudcodeFlowNo;
                return this;
            }

            /**
             * 12345
             */
            public Builder outerCustomerId(String outerCustomerId) {
                this.outerCustomerId = outerCustomerId;
                return this;
            }

            /**
             * 12345
             */
            public Builder outerFlowNo(String outerFlowNo) {
                this.outerFlowNo = outerFlowNo;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
