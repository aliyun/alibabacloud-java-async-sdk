// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetValidationReportRequest} extends {@link RequestModel}
 *
 * <p>GetValidationReportRequest</p>
 */
public class GetValidationReportRequest extends Request {
    @Path
    @NameInMap("appGroupIdentity")
    @Validation(required = true)
    private String appGroupIdentity;

    @Query
    @NameInMap("type")
    @Validation(required = true)
    private String type;

    private GetValidationReportRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetValidationReportRequest create() {
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetValidationReportRequest, Builder> {
        private String appGroupIdentity; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetValidationReportRequest response) {
            super(response);
            this.appGroupIdentity = response.appGroupIdentity;
            this.type = response.type;
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
         * type.
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetValidationReportRequest build() {
            return new GetValidationReportRequest(this);
        } 

    } 

}
