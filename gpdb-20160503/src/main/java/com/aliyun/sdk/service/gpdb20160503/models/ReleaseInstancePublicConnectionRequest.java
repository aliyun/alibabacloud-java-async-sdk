// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseInstancePublicConnectionRequest} extends {@link RequestModel}
 *
 * <p>ReleaseInstancePublicConnectionRequest</p>
 */
public class ReleaseInstancePublicConnectionRequest extends Request {
    @Query
    @NameInMap("AddressType")
    private String addressType;

    @Query
    @NameInMap("CurrentConnectionString")
    @Validation(required = true)
    private String currentConnectionString;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    private ReleaseInstancePublicConnectionRequest(Builder builder) {
        super(builder);
        this.addressType = builder.addressType;
        this.currentConnectionString = builder.currentConnectionString;
        this.DBInstanceId = builder.DBInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseInstancePublicConnectionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addressType
     */
    public String getAddressType() {
        return this.addressType;
    }

    /**
     * @return currentConnectionString
     */
    public String getCurrentConnectionString() {
        return this.currentConnectionString;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public static final class Builder extends Request.Builder<ReleaseInstancePublicConnectionRequest, Builder> {
        private String addressType; 
        private String currentConnectionString; 
        private String DBInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(ReleaseInstancePublicConnectionRequest response) {
            super(response);
            this.addressType = response.addressType;
            this.currentConnectionString = response.currentConnectionString;
            this.DBInstanceId = response.DBInstanceId;
        } 

        /**
         * AddressType.
         */
        public Builder addressType(String addressType) {
            this.putQueryParameter("AddressType", addressType);
            this.addressType = addressType;
            return this;
        }

        /**
         * CurrentConnectionString.
         */
        public Builder currentConnectionString(String currentConnectionString) {
            this.putQueryParameter("CurrentConnectionString", currentConnectionString);
            this.currentConnectionString = currentConnectionString;
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
        public ReleaseInstancePublicConnectionRequest build() {
            return new ReleaseInstancePublicConnectionRequest(this);
        } 

    } 

}
