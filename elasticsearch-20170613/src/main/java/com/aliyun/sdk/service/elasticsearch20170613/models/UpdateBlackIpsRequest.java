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

    @Body
    @NameInMap("body")
    private String body;

    @Query
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("esIPBlacklist")
    private java.util.List < String > esIPBlacklist;

    private UpdateBlackIpsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.body = builder.body;
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
     * @return body
     */
    public String getBody() {
        return this.body;
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
        private String body; 
        private String clientToken; 
        private java.util.List < String > esIPBlacklist; 

        private Builder() {
            super();
        } 

        private Builder(UpdateBlackIpsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.body = request.body;
            this.clientToken = request.clientToken;
            this.esIPBlacklist = request.esIPBlacklist;
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
         * body.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
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
