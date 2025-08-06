// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link CreateDNADBRequest} extends {@link RequestModel}
 *
 * <p>CreateDNADBRequest</p>
 */
public class CreateDNADBRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBDescription")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBRegion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBType")
    private String DBType;

    private CreateDNADBRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.DBDescription = builder.DBDescription;
        this.DBName = builder.DBName;
        this.DBRegion = builder.DBRegion;
        this.DBType = builder.DBType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDNADBRequest create() {
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
     * @return DBDescription
     */
    public String getDBDescription() {
        return this.DBDescription;
    }

    /**
     * @return DBName
     */
    public String getDBName() {
        return this.DBName;
    }

    /**
     * @return DBRegion
     */
    public String getDBRegion() {
        return this.DBRegion;
    }

    /**
     * @return DBType
     */
    public String getDBType() {
        return this.DBType;
    }

    public static final class Builder extends Request.Builder<CreateDNADBRequest, Builder> {
        private String clientToken; 
        private String DBDescription; 
        private String DBName; 
        private String DBRegion; 
        private String DBType; 

        private Builder() {
            super();
        } 

        private Builder(CreateDNADBRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.DBDescription = request.DBDescription;
            this.DBName = request.DBName;
            this.DBRegion = request.DBRegion;
            this.DBType = request.DBType;
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
         * <p>This parameter is required.</p>
         */
        public Builder DBDescription(String DBDescription) {
            this.putQueryParameter("DBDescription", DBDescription);
            this.DBDescription = DBDescription;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder DBName(String DBName) {
            this.putQueryParameter("DBName", DBName);
            this.DBName = DBName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder DBRegion(String DBRegion) {
            this.putQueryParameter("DBRegion", DBRegion);
            this.DBRegion = DBRegion;
            return this;
        }

        /**
         * DBType.
         */
        public Builder DBType(String DBType) {
            this.putQueryParameter("DBType", DBType);
            this.DBType = DBType;
            return this;
        }

        @Override
        public CreateDNADBRequest build() {
            return new CreateDNADBRequest(this);
        } 

    } 

}
