// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OfflineHttpApiRequest} extends {@link RequestModel}
 *
 * <p>OfflineHttpApiRequest</p>
 */
public class OfflineHttpApiRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("httpApiId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String httpApiId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("environmentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String environmentId;

    private OfflineHttpApiRequest(Builder builder) {
        super(builder);
        this.httpApiId = builder.httpApiId;
        this.environmentId = builder.environmentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OfflineHttpApiRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return httpApiId
     */
    public String getHttpApiId() {
        return this.httpApiId;
    }

    /**
     * @return environmentId
     */
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public static final class Builder extends Request.Builder<OfflineHttpApiRequest, Builder> {
        private String httpApiId; 
        private String environmentId; 

        private Builder() {
            super();
        } 

        private Builder(OfflineHttpApiRequest request) {
            super(request);
            this.httpApiId = request.httpApiId;
            this.environmentId = request.environmentId;
        } 

        /**
         * httpApiId.
         */
        public Builder httpApiId(String httpApiId) {
            this.putPathParameter("httpApiId", httpApiId);
            this.httpApiId = httpApiId;
            return this;
        }

        /**
         * environmentId.
         */
        public Builder environmentId(String environmentId) {
            this.putBodyParameter("environmentId", environmentId);
            this.environmentId = environmentId;
            return this;
        }

        @Override
        public OfflineHttpApiRequest build() {
            return new OfflineHttpApiRequest(this);
        } 

    } 

}
