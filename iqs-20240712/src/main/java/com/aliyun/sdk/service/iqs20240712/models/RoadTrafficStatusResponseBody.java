// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20240712.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RoadTrafficStatusResponseBody} extends {@link TeaModel}
 *
 * <p>RoadTrafficStatusResponseBody</p>
 */
public class RoadTrafficStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private RoadTrafficStatusResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RoadTrafficStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private java.util.List < Data> data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>ECB2144C-E277-5434-80E6-12D26678D364</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public RoadTrafficStatusResponseBody build() {
            return new RoadTrafficStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RoadTrafficStatusResponseBody} extends {@link TeaModel}
     *
     * <p>RoadTrafficStatusResponseBody</p>
     */
    public static class Evaluation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("blockedPercentage")
        private String blockedPercentage;

        @com.aliyun.core.annotation.NameInMap("clearPercentage")
        private String clearPercentage;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("heavyPercentage")
        private String heavyPercentage;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("unknownPercentage")
        private String unknownPercentage;

        private Evaluation(Builder builder) {
            this.blockedPercentage = builder.blockedPercentage;
            this.clearPercentage = builder.clearPercentage;
            this.description = builder.description;
            this.heavyPercentage = builder.heavyPercentage;
            this.status = builder.status;
            this.unknownPercentage = builder.unknownPercentage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Evaluation create() {
            return builder().build();
        }

        /**
         * @return blockedPercentage
         */
        public String getBlockedPercentage() {
            return this.blockedPercentage;
        }

        /**
         * @return clearPercentage
         */
        public String getClearPercentage() {
            return this.clearPercentage;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return heavyPercentage
         */
        public String getHeavyPercentage() {
            return this.heavyPercentage;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return unknownPercentage
         */
        public String getUnknownPercentage() {
            return this.unknownPercentage;
        }

        public static final class Builder {
            private String blockedPercentage; 
            private String clearPercentage; 
            private String description; 
            private String heavyPercentage; 
            private String status; 
            private String unknownPercentage; 

            /**
             * blockedPercentage.
             */
            public Builder blockedPercentage(String blockedPercentage) {
                this.blockedPercentage = blockedPercentage;
                return this;
            }

            /**
             * clearPercentage.
             */
            public Builder clearPercentage(String clearPercentage) {
                this.clearPercentage = clearPercentage;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * heavyPercentage.
             */
            public Builder heavyPercentage(String heavyPercentage) {
                this.heavyPercentage = heavyPercentage;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * unknownPercentage.
             */
            public Builder unknownPercentage(String unknownPercentage) {
                this.unknownPercentage = unknownPercentage;
                return this;
            }

            public Evaluation build() {
                return new Evaluation(this);
            } 

        } 

    }
    /**
     * 
     * {@link RoadTrafficStatusResponseBody} extends {@link TeaModel}
     *
     * <p>RoadTrafficStatusResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("evaluation")
        private Evaluation evaluation;

        private Data(Builder builder) {
            this.description = builder.description;
            this.evaluation = builder.evaluation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return evaluation
         */
        public Evaluation getEvaluation() {
            return this.evaluation;
        }

        public static final class Builder {
            private String description; 
            private Evaluation evaluation; 

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * evaluation.
             */
            public Builder evaluation(Evaluation evaluation) {
                this.evaluation = evaluation;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
