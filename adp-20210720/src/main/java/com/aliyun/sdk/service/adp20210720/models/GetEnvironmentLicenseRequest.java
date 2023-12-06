// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEnvironmentLicenseRequest} extends {@link RequestModel}
 *
 * <p>GetEnvironmentLicenseRequest</p>
 */
public class GetEnvironmentLicenseRequest extends Request {
    @Path
    @NameInMap("uid")
    private String uid;

    @Path
    @NameInMap("licenseUID")
    private String licenseUID;

    @Query
    @NameInMap("options")
    private Options options;

    private GetEnvironmentLicenseRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.licenseUID = builder.licenseUID;
        this.options = builder.options;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEnvironmentLicenseRequest create() {
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

    /**
     * @return options
     */
    public Options getOptions() {
        return this.options;
    }

    public static final class Builder extends Request.Builder<GetEnvironmentLicenseRequest, Builder> {
        private String uid; 
        private String licenseUID; 
        private Options options; 

        private Builder() {
            super();
        } 

        private Builder(GetEnvironmentLicenseRequest request) {
            super(request);
            this.uid = request.uid;
            this.licenseUID = request.licenseUID;
            this.options = request.options;
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

        /**
         * options.
         */
        public Builder options(Options options) {
            String optionsShrink = shrink(options, "options", "json");
            this.putQueryParameter("options", optionsShrink);
            this.options = options;
            return this;
        }

        @Override
        public GetEnvironmentLicenseRequest build() {
            return new GetEnvironmentLicenseRequest(this);
        } 

    } 

    public static class Options extends TeaModel {
        @NameInMap("withSecretYAML")
        private Boolean withSecretYAML;

        private Options(Builder builder) {
            this.withSecretYAML = builder.withSecretYAML;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Options create() {
            return builder().build();
        }

        /**
         * @return withSecretYAML
         */
        public Boolean getWithSecretYAML() {
            return this.withSecretYAML;
        }

        public static final class Builder {
            private Boolean withSecretYAML; 

            /**
             * withSecretYAML.
             */
            public Builder withSecretYAML(Boolean withSecretYAML) {
                this.withSecretYAML = withSecretYAML;
                return this;
            }

            public Options build() {
                return new Options(this);
            } 

        } 

    }
}
