// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateBlackIpsRequest} extends {@link RequestModel}
 *
 * <p>UpdateBlackIpsRequest</p>
 */
public class UpdateBlackIpsRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("esIPBlacklist")
    private java.util.List < String > esIPBlacklist;

    private UpdateBlackIpsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.clientToken = builder.clientToken;
        this.esIPBlacklist = builder.esIPBlacklist;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBlackIpsRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return esIPBlacklist
     */
    public java.util.List < String > getEsIPBlacklist() {
        return this.esIPBlacklist;
    }

    public static final class Builder extends Request.Builder<UpdateBlackIpsRequest, Builder> {
        private String instanceId; 
        private String clientToken; 
        private java.util.List < String > esIPBlacklist; 

        private Builder() {
            super();
        } 

        private Builder(UpdateBlackIpsRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.clientToken = response.clientToken;
            this.esIPBlacklist = response.esIPBlacklist;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * esIPBlacklist.
         */
        public Builder esIPBlacklist(java.util.List < String > esIPBlacklist) {
            this.putBodyParameter("esIPBlacklist", esIPBlacklist);
            this.esIPBlacklist = esIPBlacklist;
            return this;
        }

        @Override
        public UpdateBlackIpsRequest build() {
            return new UpdateBlackIpsRequest(this);
        } 

    } 

}
