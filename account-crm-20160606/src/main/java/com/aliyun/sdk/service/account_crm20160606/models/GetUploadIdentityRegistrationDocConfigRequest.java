// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link GetUploadIdentityRegistrationDocConfigRequest} extends {@link RequestModel}
 *
 * <p>GetUploadIdentityRegistrationDocConfigRequest</p>
 */
public class GetUploadIdentityRegistrationDocConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String customerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilePath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String filePath;

    private GetUploadIdentityRegistrationDocConfigRequest(Builder builder) {
        super(builder);
        this.customerId = builder.customerId;
        this.filePath = builder.filePath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUploadIdentityRegistrationDocConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customerId
     */
    public String getCustomerId() {
        return this.customerId;
    }

    /**
     * @return filePath
     */
    public String getFilePath() {
        return this.filePath;
    }

    public static final class Builder extends Request.Builder<GetUploadIdentityRegistrationDocConfigRequest, Builder> {
        private String customerId; 
        private String filePath; 

        private Builder() {
            super();
        } 

        private Builder(GetUploadIdentityRegistrationDocConfigRequest request) {
            super(request);
            this.customerId = request.customerId;
            this.filePath = request.filePath;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder customerId(String customerId) {
            this.putQueryParameter("CustomerId", customerId);
            this.customerId = customerId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder filePath(String filePath) {
            this.putQueryParameter("FilePath", filePath);
            this.filePath = filePath;
            return this;
        }

        @Override
        public GetUploadIdentityRegistrationDocConfigRequest build() {
            return new GetUploadIdentityRegistrationDocConfigRequest(this);
        } 

    } 

}
