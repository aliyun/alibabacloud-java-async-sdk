// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SuspendHotlineServiceRequest} extends {@link RequestModel}
 *
 * <p>SuspendHotlineServiceRequest</p>
 */
public class SuspendHotlineServiceRequest extends Request {
    @Body
    @NameInMap("AccountName")
    @Validation(required = true)
    private String accountName;

    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("Type")
    @Validation(maximum = 5, minimum = 1)
    private Integer type;

    private SuspendHotlineServiceRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.clientToken = builder.clientToken;
        this.instanceId = builder.instanceId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SuspendHotlineServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<SuspendHotlineServiceRequest, Builder> {
        private String accountName; 
        private String clientToken; 
        private String instanceId; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(SuspendHotlineServiceRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.clientToken = request.clientToken;
            this.instanceId = request.instanceId;
            this.type = request.type;
        } 

        /**
         * AccountName.
         */
        public Builder accountName(String accountName) {
            this.putBodyParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(Integer type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public SuspendHotlineServiceRequest build() {
            return new SuspendHotlineServiceRequest(this);
        } 

    } 

}
