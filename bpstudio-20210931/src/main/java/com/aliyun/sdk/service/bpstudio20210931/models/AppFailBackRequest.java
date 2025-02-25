// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AppFailBackRequest} extends {@link RequestModel}
 *
 * <p>AppFailBackRequest</p>
 */
public class AppFailBackRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    private AppFailBackRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AppFailBackRequest create() {
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

    public static final class Builder extends Request.Builder<AppFailBackRequest, Builder> {
        private String applicationId; 

        private Builder() {
            super();
        } 

        private Builder(AppFailBackRequest request) {
            super(request);
            this.applicationId = request.applicationId;
        } 

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>61ZW1DY5Y3FSAOO2</p>
         */
        public Builder applicationId(String applicationId) {
            this.putBodyParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        @Override
        public AppFailBackRequest build() {
            return new AppFailBackRequest(this);
        } 

    } 

}
