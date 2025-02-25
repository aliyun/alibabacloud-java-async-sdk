// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCalculationJobRequest} extends {@link RequestModel}
 *
 * <p>GetCalculationJobRequest</p>
 */
public class GetCalculationJobRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("CalculationJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String calculationJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private GetCalculationJobRequest(Builder builder) {
        super(builder);
        this.calculationJobId = builder.calculationJobId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCalculationJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return calculationJobId
     */
    public String getCalculationJobId() {
        return this.calculationJobId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetCalculationJobRequest, Builder> {
        private String calculationJobId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetCalculationJobRequest request) {
            super(request);
            this.calculationJobId = request.calculationJobId;
            this.instanceId = request.instanceId;
        } 

        /**
         * CalculationJobId.
         */
        public Builder calculationJobId(String calculationJobId) {
            this.putPathParameter("CalculationJobId", calculationJobId);
            this.calculationJobId = calculationJobId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetCalculationJobRequest build() {
            return new GetCalculationJobRequest(this);
        } 

    } 

}
