// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEnvironmentLicenseRequest} extends {@link RequestModel}
 *
 * <p>DeleteEnvironmentLicenseRequest</p>
 */
public class DeleteEnvironmentLicenseRequest extends Request {
    @Path
    @NameInMap("uid")
    private String uid;

    @Path
    @NameInMap("licenseUID")
    private String licenseUID;

    private DeleteEnvironmentLicenseRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.licenseUID = builder.licenseUID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEnvironmentLicenseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return licenseUID
     */
    public String getLicenseUID() {
        return this.licenseUID;
    }

    public static final class Builder extends Request.Builder<DeleteEnvironmentLicenseRequest, Builder> {
        private String uid; 
        private String licenseUID; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEnvironmentLicenseRequest request) {
            super(request);
            this.uid = request.uid;
            this.licenseUID = request.licenseUID;
        } 

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putPathParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * licenseUID.
         */
        public Builder licenseUID(String licenseUID) {
            this.putPathParameter("licenseUID", licenseUID);
            this.licenseUID = licenseUID;
            return this;
        }

        @Override
        public DeleteEnvironmentLicenseRequest build() {
            return new DeleteEnvironmentLicenseRequest(this);
        } 

    } 

}
