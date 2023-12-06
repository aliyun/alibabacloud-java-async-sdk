// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProductVersionPackageRequest} extends {@link RequestModel}
 *
 * <p>GetProductVersionPackageRequest</p>
 */
public class GetProductVersionPackageRequest extends Request {
    @Path
    @NameInMap("uid")
    @Validation(required = true)
    private String uid;

    @Query
    @NameInMap("foundationReferenceUID")
    private String foundationReferenceUID;

    @Query
    @NameInMap("oldFoundationReferenceUID")
    private String oldFoundationReferenceUID;

    @Query
    @NameInMap("oldProductVersionUID")
    private String oldProductVersionUID;

    @Query
    @NameInMap("packageContentType")
    private String packageContentType;

    @Query
    @NameInMap("packageType")
    private String packageType;

    @Query
    @NameInMap("packageUID")
    private String packageUID;

    @Query
    @NameInMap("platform")
    private String platform;

    @Query
    @NameInMap("withURL")
    private Boolean withURL;

    private GetProductVersionPackageRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.foundationReferenceUID = builder.foundationReferenceUID;
        this.oldFoundationReferenceUID = builder.oldFoundationReferenceUID;
        this.oldProductVersionUID = builder.oldProductVersionUID;
        this.packageContentType = builder.packageContentType;
        this.packageType = builder.packageType;
        this.packageUID = builder.packageUID;
        this.platform = builder.platform;
        this.withURL = builder.withURL;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProductVersionPackageRequest create() {
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
     * @return foundationReferenceUID
     */
    public String getFoundationReferenceUID() {
        return this.foundationReferenceUID;
    }

    /**
     * @return oldFoundationReferenceUID
     */
    public String getOldFoundationReferenceUID() {
        return this.oldFoundationReferenceUID;
    }

    /**
     * @return oldProductVersionUID
     */
    public String getOldProductVersionUID() {
        return this.oldProductVersionUID;
    }

    /**
     * @return packageContentType
     */
    public String getPackageContentType() {
        return this.packageContentType;
    }

    /**
     * @return packageType
     */
    public String getPackageType() {
        return this.packageType;
    }

    /**
     * @return packageUID
     */
    public String getPackageUID() {
        return this.packageUID;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return withURL
     */
    public Boolean getWithURL() {
        return this.withURL;
    }

    public static final class Builder extends Request.Builder<GetProductVersionPackageRequest, Builder> {
        private String uid; 
        private String foundationReferenceUID; 
        private String oldFoundationReferenceUID; 
        private String oldProductVersionUID; 
        private String packageContentType; 
        private String packageType; 
        private String packageUID; 
        private String platform; 
        private Boolean withURL; 

        private Builder() {
            super();
        } 

        private Builder(GetProductVersionPackageRequest request) {
            super(request);
            this.uid = request.uid;
            this.foundationReferenceUID = request.foundationReferenceUID;
            this.oldFoundationReferenceUID = request.oldFoundationReferenceUID;
            this.oldProductVersionUID = request.oldProductVersionUID;
            this.packageContentType = request.packageContentType;
            this.packageType = request.packageType;
            this.packageUID = request.packageUID;
            this.platform = request.platform;
            this.withURL = request.withURL;
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
         * foundationReferenceUID.
         */
        public Builder foundationReferenceUID(String foundationReferenceUID) {
            this.putQueryParameter("foundationReferenceUID", foundationReferenceUID);
            this.foundationReferenceUID = foundationReferenceUID;
            return this;
        }

        /**
         * oldFoundationReferenceUID.
         */
        public Builder oldFoundationReferenceUID(String oldFoundationReferenceUID) {
            this.putQueryParameter("oldFoundationReferenceUID", oldFoundationReferenceUID);
            this.oldFoundationReferenceUID = oldFoundationReferenceUID;
            return this;
        }

        /**
         * oldProductVersionUID.
         */
        public Builder oldProductVersionUID(String oldProductVersionUID) {
            this.putQueryParameter("oldProductVersionUID", oldProductVersionUID);
            this.oldProductVersionUID = oldProductVersionUID;
            return this;
        }

        /**
         * packageContentType.
         */
        public Builder packageContentType(String packageContentType) {
            this.putQueryParameter("packageContentType", packageContentType);
            this.packageContentType = packageContentType;
            return this;
        }

        /**
         * packageType.
         */
        public Builder packageType(String packageType) {
            this.putQueryParameter("packageType", packageType);
            this.packageType = packageType;
            return this;
        }

        /**
         * packageUID.
         */
        public Builder packageUID(String packageUID) {
            this.putQueryParameter("packageUID", packageUID);
            this.packageUID = packageUID;
            return this;
        }

        /**
         * platform.
         */
        public Builder platform(String platform) {
            this.putQueryParameter("platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * withURL.
         */
        public Builder withURL(Boolean withURL) {
            this.putQueryParameter("withURL", withURL);
            this.withURL = withURL;
            return this;
        }

        @Override
        public GetProductVersionPackageRequest build() {
            return new GetProductVersionPackageRequest(this);
        } 

    } 

}
