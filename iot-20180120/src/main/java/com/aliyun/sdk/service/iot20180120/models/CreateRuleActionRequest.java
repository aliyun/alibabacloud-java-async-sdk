// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRuleActionRequest} extends {@link RequestModel}
 *
 * <p>CreateRuleActionRequest</p>
 */
public class CreateRuleActionRequest extends Request {
    @Query
    @NameInMap("Configuration")
    @Validation(required = true)
    private String configuration;

    @Query
    @NameInMap("ErrorActionFlag")
    private Boolean errorActionFlag;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("RuleId")
    @Validation(required = true)
    private Long ruleId;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private CreateRuleActionRequest(Builder builder) {
        super(builder);
        this.configuration = builder.configuration;
        this.errorActionFlag = builder.errorActionFlag;
        this.iotInstanceId = builder.iotInstanceId;
        this.ruleId = builder.ruleId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRuleActionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configuration
     */
    public String getConfiguration() {
        return this.configuration;
    }

    /**
     * @return errorActionFlag
     */
    public Boolean getErrorActionFlag() {
        return this.errorActionFlag;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateRuleActionRequest, Builder> {
        private String configuration; 
        private Boolean errorActionFlag; 
        private String iotInstanceId; 
        private Long ruleId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateRuleActionRequest request) {
            super(request);
            this.configuration = request.configuration;
            this.errorActionFlag = request.errorActionFlag;
            this.iotInstanceId = request.iotInstanceId;
            this.ruleId = request.ruleId;
            this.type = request.type;
        } 

        /**
         * Configuration.
         */
        public Builder configuration(String configuration) {
            this.putQueryParameter("Configuration", configuration);
            this.configuration = configuration;
            return this;
        }

        /**
         * ErrorActionFlag.
         */
        public Builder errorActionFlag(Boolean errorActionFlag) {
            this.putQueryParameter("ErrorActionFlag", errorActionFlag);
            this.errorActionFlag = errorActionFlag;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * RuleId.
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateRuleActionRequest build() {
            return new CreateRuleActionRequest(this);
        } 

    } 

}
