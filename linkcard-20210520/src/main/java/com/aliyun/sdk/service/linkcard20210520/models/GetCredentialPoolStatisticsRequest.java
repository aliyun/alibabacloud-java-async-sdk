// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCredentialPoolStatisticsRequest} extends {@link RequestModel}
 *
 * <p>GetCredentialPoolStatisticsRequest</p>
 */
public class GetCredentialPoolStatisticsRequest extends Request {
    @Query
    @NameInMap("CredentialNO")
    @Validation(required = true)
    private String credentialNO;

    @Query
    @NameInMap("Date")
    @Validation(required = true)
    private String date;

    private GetCredentialPoolStatisticsRequest(Builder builder) {
        super(builder);
        this.credentialNO = builder.credentialNO;
        this.date = builder.date;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCredentialPoolStatisticsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return credentialNO
     */
    public String getCredentialNO() {
        return this.credentialNO;
    }

    /**
     * @return date
     */
    public String getDate() {
        return this.date;
    }

    public static final class Builder extends Request.Builder<GetCredentialPoolStatisticsRequest, Builder> {
        private String credentialNO; 
        private String date; 

        private Builder() {
            super();
        } 

        private Builder(GetCredentialPoolStatisticsRequest request) {
            super(request);
            this.credentialNO = request.credentialNO;
            this.date = request.date;
        } 

        /**
         * CredentialNO.
         */
        public Builder credentialNO(String credentialNO) {
            this.putQueryParameter("CredentialNO", credentialNO);
            this.credentialNO = credentialNO;
            return this;
        }

        /**
         * Date.
         */
        public Builder date(String date) {
            this.putQueryParameter("Date", date);
            this.date = date;
            return this;
        }

        @Override
        public GetCredentialPoolStatisticsRequest build() {
            return new GetCredentialPoolStatisticsRequest(this);
        } 

    } 

}
