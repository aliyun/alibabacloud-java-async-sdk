// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportSwaggerRequest} extends {@link RequestModel}
 *
 * <p>ExportSwaggerRequest</p>
 */
public class ExportSwaggerRequest extends Request {
    @Query
    @NameInMap("ApiUid")
    @Validation(required = true)
    private String apiUid;

    @Query
    @NameInMap("DataFormat")
    private String dataFormat;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private ExportSwaggerRequest(Builder builder) {
        super(builder);
        this.apiUid = builder.apiUid;
        this.dataFormat = builder.dataFormat;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportSwaggerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiUid
     */
    public String getApiUid() {
        return this.apiUid;
    }

    /**
     * @return dataFormat
     */
    public String getDataFormat() {
        return this.dataFormat;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<ExportSwaggerRequest, Builder> {
        private String apiUid; 
        private String dataFormat; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(ExportSwaggerRequest request) {
            super(request);
            this.apiUid = request.apiUid;
            this.dataFormat = request.dataFormat;
            this.securityToken = request.securityToken;
        } 

        /**
         * ApiUid.
         */
        public Builder apiUid(String apiUid) {
            this.putQueryParameter("ApiUid", apiUid);
            this.apiUid = apiUid;
            return this;
        }

        /**
         * DataFormat.
         */
        public Builder dataFormat(String dataFormat) {
            this.putQueryParameter("DataFormat", dataFormat);
            this.dataFormat = dataFormat;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public ExportSwaggerRequest build() {
            return new ExportSwaggerRequest(this);
        } 

    } 

}
