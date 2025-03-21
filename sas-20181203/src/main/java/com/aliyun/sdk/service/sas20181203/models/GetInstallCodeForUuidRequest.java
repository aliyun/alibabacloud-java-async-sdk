// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetInstallCodeForUuidRequest} extends {@link RequestModel}
 *
 * <p>GetInstallCodeForUuidRequest</p>
 */
public class GetInstallCodeForUuidRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uuid;

    private GetInstallCodeForUuidRequest(Builder builder) {
        super(builder);
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstallCodeForUuidRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<GetInstallCodeForUuidRequest, Builder> {
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(GetInstallCodeForUuidRequest request) {
            super(request);
            this.uuid = request.uuid;
        } 

        /**
         * <p>The UUID of the server for which the client installation code is to be queried.</p>
         * <blockquote>
         * <p>Call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> API to obtain this parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eae0b46e-2155-422e-9565-ecc52c69****</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public GetInstallCodeForUuidRequest build() {
            return new GetInstallCodeForUuidRequest(this);
        } 

    } 

}
