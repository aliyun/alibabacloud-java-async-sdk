// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

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
 * {@link CreateDiagnosisResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDiagnosisResponseBody</p>
 */
public class CreateDiagnosisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ReasonCode")
    private String reasonCode;

    @com.aliyun.core.annotation.NameInMap("ReasonMessage")
    private String reasonMessage;

    @com.aliyun.core.annotation.NameInMap("SolutionMessage")
    private String solutionMessage;

    private CreateDiagnosisResponseBody(Builder builder) {
        this.reasonCode = builder.reasonCode;
        this.reasonMessage = builder.reasonMessage;
        this.solutionMessage = builder.solutionMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDiagnosisResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return reasonCode
     */
    public String getReasonCode() {
        return this.reasonCode;
    }

    /**
     * @return reasonMessage
     */
    public String getReasonMessage() {
        return this.reasonMessage;
    }

    /**
     * @return solutionMessage
     */
    public String getSolutionMessage() {
        return this.solutionMessage;
    }

    public static final class Builder {
        private String reasonCode; 
        private String reasonMessage; 
        private String solutionMessage; 

        private Builder() {
        } 

        private Builder(CreateDiagnosisResponseBody model) {
            this.reasonCode = model.reasonCode;
            this.reasonMessage = model.reasonMessage;
            this.solutionMessage = model.solutionMessage;
        } 

        /**
         * ReasonCode.
         */
        public Builder reasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }

        /**
         * ReasonMessage.
         */
        public Builder reasonMessage(String reasonMessage) {
            this.reasonMessage = reasonMessage;
            return this;
        }

        /**
         * SolutionMessage.
         */
        public Builder solutionMessage(String solutionMessage) {
            this.solutionMessage = solutionMessage;
            return this;
        }

        public CreateDiagnosisResponseBody build() {
            return new CreateDiagnosisResponseBody(this);
        } 

    } 

}
