// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccountConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccountConfigResponseBody</p>
 */
public class DescribeAccountConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("IsSupportClientSideEncryption")
    private Boolean isSupportClientSideEncryption;

    @NameInMap("IsSupportElasticGatewayBeta")
    private Boolean isSupportElasticGatewayBeta;

    @NameInMap("IsSupportGatewayLogging")
    private Boolean isSupportGatewayLogging;

    @NameInMap("IsSupportServerSideEncryption")
    private Boolean isSupportServerSideEncryption;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeAccountConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.isSupportClientSideEncryption = builder.isSupportClientSideEncryption;
        this.isSupportElasticGatewayBeta = builder.isSupportElasticGatewayBeta;
        this.isSupportGatewayLogging = builder.isSupportGatewayLogging;
        this.isSupportServerSideEncryption = builder.isSupportServerSideEncryption;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccountConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return isSupportClientSideEncryption
     */
    public Boolean getIsSupportClientSideEncryption() {
        return this.isSupportClientSideEncryption;
    }

    /**
     * @return isSupportElasticGatewayBeta
     */
    public Boolean getIsSupportElasticGatewayBeta() {
        return this.isSupportElasticGatewayBeta;
    }

    /**
     * @return isSupportGatewayLogging
     */
    public Boolean getIsSupportGatewayLogging() {
        return this.isSupportGatewayLogging;
    }

    /**
     * @return isSupportServerSideEncryption
     */
    public Boolean getIsSupportServerSideEncryption() {
        return this.isSupportServerSideEncryption;
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
        private Boolean isSupportClientSideEncryption; 
        private Boolean isSupportElasticGatewayBeta; 
        private Boolean isSupportGatewayLogging; 
        private Boolean isSupportServerSideEncryption; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * IsSupportClientSideEncryption.
         */
        public Builder isSupportClientSideEncryption(Boolean isSupportClientSideEncryption) {
            this.isSupportClientSideEncryption = isSupportClientSideEncryption;
            return this;
        }

        /**
         * IsSupportElasticGatewayBeta.
         */
        public Builder isSupportElasticGatewayBeta(Boolean isSupportElasticGatewayBeta) {
            this.isSupportElasticGatewayBeta = isSupportElasticGatewayBeta;
            return this;
        }

        /**
         * IsSupportGatewayLogging.
         */
        public Builder isSupportGatewayLogging(Boolean isSupportGatewayLogging) {
            this.isSupportGatewayLogging = isSupportGatewayLogging;
            return this;
        }

        /**
         * IsSupportServerSideEncryption.
         */
        public Builder isSupportServerSideEncryption(Boolean isSupportServerSideEncryption) {
            this.isSupportServerSideEncryption = isSupportServerSideEncryption;
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

        public DescribeAccountConfigResponseBody build() {
            return new DescribeAccountConfigResponseBody(this);
        } 

    } 

}
