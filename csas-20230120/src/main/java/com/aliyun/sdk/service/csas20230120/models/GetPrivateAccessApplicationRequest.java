// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link GetPrivateAccessApplicationRequest} extends {@link RequestModel}
 *
 * <p>GetPrivateAccessApplicationRequest</p>
 */
public class GetPrivateAccessApplicationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    private GetPrivateAccessApplicationRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPrivateAccessApplicationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    public static final class Builder extends Request.Builder<GetPrivateAccessApplicationRequest, Builder> {
        private String applicationId; 

        private Builder() {
            super();
        } 

        private Builder(GetPrivateAccessApplicationRequest request) {
            super(request);
            this.applicationId = request.applicationId;
        } 

        /**
         * <p>The ID of the office application. You can obtain the value by calling the following operations:</p>
         * <ul>
         * <li><a href="~~ListPrivateAccessApplications~~">ListPrivateAccessApplications</a>: queries office applications.</li>
         * <li><a href="~~CreatePrivateAccessApplication~~">CreatePrivateAccessApplication</a>: creates an office application.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-application-e12860ef6c48****</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        @Override
        public GetPrivateAccessApplicationRequest build() {
            return new GetPrivateAccessApplicationRequest(this);
        } 

    } 

}
