// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mseap20210118.models;

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
 * {@link DescribeAgreementStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAgreementStatusResponseBody</p>
 */
public class DescribeAgreementStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AgreementCode")
    private String agreementCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private DescribeAgreementStatusResponseBody(Builder builder) {
        this.agreementCode = builder.agreementCode;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAgreementStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agreementCode
     */
    public String getAgreementCode() {
        return this.agreementCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String agreementCode; 
        private String requestId; 
        private Integer status; 
        private String userId; 

        private Builder() {
        } 

        private Builder(DescribeAgreementStatusResponseBody model) {
            this.agreementCode = model.agreementCode;
            this.requestId = model.requestId;
            this.status = model.status;
            this.userId = model.userId;
        } 

        /**
         * AgreementCode.
         */
        public Builder agreementCode(String agreementCode) {
            this.agreementCode = agreementCode;
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
         * Status.
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public DescribeAgreementStatusResponseBody build() {
            return new DescribeAgreementStatusResponseBody(this);
        } 

    } 

}
