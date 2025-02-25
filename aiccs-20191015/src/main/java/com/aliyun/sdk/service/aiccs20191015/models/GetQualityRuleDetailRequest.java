// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link GetQualityRuleDetailRequest} extends {@link RequestModel}
 *
 * <p>GetQualityRuleDetailRequest</p>
 */
public class GetQualityRuleDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QualityRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(GetQualityRuleDetailRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.qualityRuleId = request.qualityRuleId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
