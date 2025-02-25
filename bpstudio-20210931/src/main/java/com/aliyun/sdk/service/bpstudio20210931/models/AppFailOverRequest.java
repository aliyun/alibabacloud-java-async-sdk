// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AppFailOverRequest} extends {@link RequestModel}
 *
 * <p>AppFailOverRequest</p>
 */
public class AppFailOverRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FailZone")
    private String failZone;

    private AppFailOverRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.failZone = builder.failZone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AppFailOverRequest create() {
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

    /**
     * @return failZone
     */
    public String getFailZone() {
        return this.failZone;
    }

    public static final class Builder extends Request.Builder<AppFailOverRequest, Builder> {
        private String applicationId; 
        private String failZone; 

        private Builder() {
            super();
        } 

        private Builder(AppFailOverRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.failZone = request.failZone;
        } 

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BE68D71ZY5YYIU9R</p>
         */
        public Builder applicationId(String applicationId) {
            this.putBodyParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The destination zone to which you want to switch the disaster recovery application.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
         */
        public Builder failZone(String failZone) {
            this.putBodyParameter("FailZone", failZone);
            this.failZone = failZone;
            return this;
        }

        @Override
        public AppFailOverRequest build() {
            return new AppFailOverRequest(this);
        } 

    } 

}
