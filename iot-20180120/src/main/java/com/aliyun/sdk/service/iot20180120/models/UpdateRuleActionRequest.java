// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRuleActionRequest} extends {@link RequestModel}
 *
 * <p>UpdateRuleActionRequest</p>
 */
public class UpdateRuleActionRequest extends Request {
    @Query
    @NameInMap("ActionId")
    @Validation(required = true)
    private Long actionId;

    @Query
    @NameInMap("Configuration")
    @Validation(required = true)
    private String configuration;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private UpdateRuleActionRequest(Builder builder) {
        super(builder);
        this.actionId = builder.actionId;
        this.configuration = builder.configuration;
        this.iotInstanceId = builder.iotInstanceId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRuleActionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionId
     */
    public Long getActionId() {
        return this.actionId;
    }

    /**
     * @return configuration
     */
    public String getConfiguration() {
        return this.configuration;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<UpdateRuleActionRequest, Builder> {
        private Long actionId; 
        private String configuration; 
        private String iotInstanceId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRuleActionRequest request) {
            super(request);
            this.actionId = request.actionId;
            this.configuration = request.configuration;
            this.iotInstanceId = request.iotInstanceId;
            this.type = request.type;
        } 

        /**
         * ActionId.
         */
        public Builder actionId(Long actionId) {
            this.putQueryParameter("ActionId", actionId);
            this.actionId = actionId;
            return this;
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
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
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
        public UpdateRuleActionRequest build() {
            return new UpdateRuleActionRequest(this);
        } 

    } 

}
