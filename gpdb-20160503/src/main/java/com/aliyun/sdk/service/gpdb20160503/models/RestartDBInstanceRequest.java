// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestartDBInstanceRequest} extends {@link RequestModel}
 *
 * <p>RestartDBInstanceRequest</p>
 */
public class RestartDBInstanceRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    private RestartDBInstanceRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.DBInstanceId = builder.DBInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestartDBInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public static final class Builder extends Request.Builder<RestartDBInstanceRequest, Builder> {
        private String clientToken; 
        private String DBInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(RestartDBInstanceRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.DBInstanceId = response.DBInstanceId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        @Override
        public RestartDBInstanceRequest build() {
            return new RestartDBInstanceRequest(this);
        } 

    } 

}
