// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetValidationErrorRequest} extends {@link RequestModel}
 *
 * <p>GetValidationErrorRequest</p>
 */
public class GetValidationErrorRequest extends Request {
    @Path
    @NameInMap("appGroupIdentity")
    @Validation(required = true)
    private String appGroupIdentity;

    @Query
    @NameInMap("errorCode")
    @Validation(required = true)
    private String errorCode;

    private GetValidationErrorRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.errorCode = builder.errorCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetValidationErrorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appGroupIdentity
     */
    public String getAppGroupIdentity() {
        return this.appGroupIdentity;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    public static final class Builder extends Request.Builder<GetValidationErrorRequest, Builder> {
        private String appGroupIdentity; 
        private String errorCode; 

        private Builder() {
            super();
        } 

        private Builder(GetValidationErrorRequest response) {
            super(response);
            this.appGroupIdentity = response.appGroupIdentity;
            this.errorCode = response.errorCode;
        } 

        /**
         * appGroupIdentity.
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.putQueryParameter("errorCode", errorCode);
            this.errorCode = errorCode;
            return this;
        }

        @Override
        public GetValidationErrorRequest build() {
            return new GetValidationErrorRequest(this);
        } 

    } 

}
