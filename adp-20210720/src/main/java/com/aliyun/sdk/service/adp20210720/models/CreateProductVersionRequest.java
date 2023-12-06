// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProductVersionRequest} extends {@link RequestModel}
 *
 * <p>CreateProductVersionRequest</p>
 */
public class CreateProductVersionRequest extends Request {
    @Path
    @NameInMap("uid")
    private String uid;

    @Query
    @NameInMap("baseProductVersionUID")
    private String baseProductVersionUID;

    @Body
    @NameInMap("version")
    private String version;

    @Body
    @NameInMap("withoutBaseProductVersion")
    private Boolean withoutBaseProductVersion;

    private CreateProductVersionRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.baseProductVersionUID = builder.baseProductVersionUID;
        this.version = builder.version;
        this.withoutBaseProductVersion = builder.withoutBaseProductVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProductVersionRequest create() {
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
     * @return baseProductVersionUID
     */
    public String getBaseProductVersionUID() {
        return this.baseProductVersionUID;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * @return withoutBaseProductVersion
     */
    public Boolean getWithoutBaseProductVersion() {
        return this.withoutBaseProductVersion;
    }

    public static final class Builder extends Request.Builder<CreateProductVersionRequest, Builder> {
        private String uid; 
        private String baseProductVersionUID; 
        private String version; 
        private Boolean withoutBaseProductVersion; 

        private Builder() {
            super();
        } 

        private Builder(CreateProductVersionRequest request) {
            super(request);
            this.uid = request.uid;
            this.baseProductVersionUID = request.baseProductVersionUID;
            this.version = request.version;
            this.withoutBaseProductVersion = request.withoutBaseProductVersion;
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
         * baseProductVersionUID.
         */
        public Builder baseProductVersionUID(String baseProductVersionUID) {
            this.putQueryParameter("baseProductVersionUID", baseProductVersionUID);
            this.baseProductVersionUID = baseProductVersionUID;
            return this;
        }

        /**
         * version.
         */
        public Builder version(String version) {
            this.putBodyParameter("version", version);
            this.version = version;
            return this;
        }

        /**
         * withoutBaseProductVersion.
         */
        public Builder withoutBaseProductVersion(Boolean withoutBaseProductVersion) {
            this.putBodyParameter("withoutBaseProductVersion", withoutBaseProductVersion);
            this.withoutBaseProductVersion = withoutBaseProductVersion;
            return this;
        }

        @Override
        public CreateProductVersionRequest build() {
            return new CreateProductVersionRequest(this);
        } 

    } 

}
