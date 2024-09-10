// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCloudVendorAccountAKRequest} extends {@link RequestModel}
 *
 * <p>DeleteCloudVendorAccountAKRequest</p>
 */
public class DeleteCloudVendorAccountAKRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long authId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthModules")
    private java.util.List < String > authModules;

    private DeleteCloudVendorAccountAKRequest(Builder builder) {
        super(builder);
        this.authId = builder.authId;
        this.authModules = builder.authModules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCloudVendorAccountAKRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authId
     */
    public Long getAuthId() {
        return this.authId;
    }

    /**
     * @return authModules
     */
    public java.util.List < String > getAuthModules() {
        return this.authModules;
    }

    public static final class Builder extends Request.Builder<DeleteCloudVendorAccountAKRequest, Builder> {
        private Long authId; 
        private java.util.List < String > authModules; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCloudVendorAccountAKRequest request) {
            super(request);
            this.authId = request.authId;
            this.authModules = request.authModules;
        } 

        /**
         * The unique ID of the AccessKey pair.
         */
        public Builder authId(Long authId) {
            this.putQueryParameter("AuthId", authId);
            this.authId = authId;
            return this;
        }

        /**
         * The modules that are associated with the AccessKey pair.
         */
        public Builder authModules(java.util.List < String > authModules) {
            this.putQueryParameter("AuthModules", authModules);
            this.authModules = authModules;
            return this;
        }

        @Override
        public DeleteCloudVendorAccountAKRequest build() {
            return new DeleteCloudVendorAccountAKRequest(this);
        } 

    } 

}
