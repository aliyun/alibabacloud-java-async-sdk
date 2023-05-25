// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTrafficControlRequest} extends {@link RequestModel}
 *
 * <p>DeleteTrafficControlRequest</p>
 */
public class DeleteTrafficControlRequest extends Request {
    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("TrafficControlId")
    @Validation(required = true)
    private String trafficControlId;

    private DeleteTrafficControlRequest(Builder builder) {
        super(builder);
        this.securityToken = builder.securityToken;
        this.trafficControlId = builder.trafficControlId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTrafficControlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return trafficControlId
     */
    public String getTrafficControlId() {
        return this.trafficControlId;
    }

    public static final class Builder extends Request.Builder<DeleteTrafficControlRequest, Builder> {
        private String securityToken; 
        private String trafficControlId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTrafficControlRequest request) {
            super(request);
            this.securityToken = request.securityToken;
            this.trafficControlId = request.trafficControlId;
        } 

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * TrafficControlId.
         */
        public Builder trafficControlId(String trafficControlId) {
            this.putQueryParameter("TrafficControlId", trafficControlId);
            this.trafficControlId = trafficControlId;
            return this;
        }

        @Override
        public DeleteTrafficControlRequest build() {
            return new DeleteTrafficControlRequest(this);
        } 

    } 

}
