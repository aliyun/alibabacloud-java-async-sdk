// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dg20190327.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDatabaseListRequest} extends {@link RequestModel}
 *
 * <p>AddDatabaseListRequest</p>
 */
public class AddDatabaseListRequest extends Request {
    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("DatabaseString")
    @Validation(required = true)
    private String databaseString;

    private AddDatabaseListRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.databaseString = builder.databaseString;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDatabaseListRequest create() {
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
     * @return databaseString
     */
    public String getDatabaseString() {
        return this.databaseString;
    }

    public static final class Builder extends Request.Builder<AddDatabaseListRequest, Builder> {
        private String clientToken; 
        private String databaseString; 

        private Builder() {
            super();
        } 

        private Builder(AddDatabaseListRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.databaseString = request.databaseString;
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
         * DatabaseString.
         */
        public Builder databaseString(String databaseString) {
            this.putBodyParameter("DatabaseString", databaseString);
            this.databaseString = databaseString;
            return this;
        }

        @Override
        public AddDatabaseListRequest build() {
            return new AddDatabaseListRequest(this);
        } 

    } 

}
