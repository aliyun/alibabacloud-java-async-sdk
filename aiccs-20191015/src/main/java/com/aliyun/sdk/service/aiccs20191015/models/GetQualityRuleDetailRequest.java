// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQualityRuleDetailRequest} extends {@link RequestModel}
 *
 * <p>GetQualityRuleDetailRequest</p>
 */
public class GetQualityRuleDetailRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("QualityRuleId")
    @Validation(required = true)
    private Long qualityRuleId;

    private GetQualityRuleDetailRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.qualityRuleId = builder.qualityRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQualityRuleDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return qualityRuleId
     */
    public Long getQualityRuleId() {
        return this.qualityRuleId;
    }

    public static final class Builder extends Request.Builder<GetQualityRuleDetailRequest, Builder> {
        private String instanceId; 
        private Long qualityRuleId; 

        private Builder() {
            super();
        } 

        private Builder(GetQualityRuleDetailRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.qualityRuleId = response.qualityRuleId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * QualityRuleId.
         */
        public Builder qualityRuleId(Long qualityRuleId) {
            this.putQueryParameter("QualityRuleId", qualityRuleId);
            this.qualityRuleId = qualityRuleId;
            return this;
        }

        @Override
        public GetQualityRuleDetailRequest build() {
            return new GetQualityRuleDetailRequest(this);
        } 

    } 

}
