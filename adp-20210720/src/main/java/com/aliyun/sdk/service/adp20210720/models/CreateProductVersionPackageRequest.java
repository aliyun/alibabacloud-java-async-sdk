// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProductVersionPackageRequest} extends {@link RequestModel}
 *
 * <p>CreateProductVersionPackageRequest</p>
 */
public class CreateProductVersionPackageRequest extends Request {
    @Path
    @NameInMap("uid")
    @Validation(required = true)
    private String uid;

    @Header
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("clusterEngineType")
    private String clusterEngineType;

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
    @NameInMap("packageToolType")
    private String packageToolType;

    @Query
    @NameInMap("packageType")
    private String packageType;

    @Query
    @NameInMap("platform")
    private String platform;

    private CreateProductVersionPackageRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.clientToken = builder.clientToken;
        this.clusterEngineType = builder.clusterEngineType;
        this.foundationReferenceUID = builder.foundationReferenceUID;
        this.oldFoundationReferenceUID = builder.oldFoundationReferenceUID;
        this.oldProductVersionUID = builder.oldProductVersionUID;
        this.packageContentType = builder.packageContentType;
        this.packageToolType = builder.packageToolType;
        this.packageType = builder.packageType;
        this.platform = builder.platform;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProductVersionPackageRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return clusterEngineType
     */
    public String getClusterEngineType() {
        return this.clusterEngineType;
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
     * @return packageToolType
     */
    public String getPackageToolType() {
        return this.packageToolType;
    }

    /**
     * @return packageType
     */
    public String getPackageType() {
        return this.packageType;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    public static final class Builder extends Request.Builder<CreateProductVersionPackageRequest, Builder> {
        private String uid; 
        private String clientToken; 
        private String clusterEngineType; 
        private String foundationReferenceUID; 
        private String oldFoundationReferenceUID; 
        private String oldProductVersionUID; 
        private String packageContentType; 
        private String packageToolType; 
        private String packageType; 
        private String platform; 

        private Builder() {
            super();
        } 

        private Builder(CreateProductVersionPackageRequest request) {
            super(request);
            this.uid = request.uid;
            this.clientToken = request.clientToken;
            this.clusterEngineType = request.clusterEngineType;
            this.foundationReferenceUID = request.foundationReferenceUID;
            this.oldFoundationReferenceUID = request.oldFoundationReferenceUID;
            this.oldProductVersionUID = request.oldProductVersionUID;
            this.packageContentType = request.packageContentType;
            this.packageToolType = request.packageToolType;
            this.packageType = request.packageType;
            this.platform = request.platform;
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
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putHeaderParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * clusterEngineType.
         */
        public Builder clusterEngineType(String clusterEngineType) {
            this.putQueryParameter("clusterEngineType", clusterEngineType);
            this.clusterEngineType = clusterEngineType;
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
         * packageToolType.
         */
        public Builder packageToolType(String packageToolType) {
            this.putQueryParameter("packageToolType", packageToolType);
            this.packageToolType = packageToolType;
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
         * platform.
         */
        public Builder platform(String platform) {
            this.putQueryParameter("platform", platform);
            this.platform = platform;
            return this;
        }

        @Override
        public CreateProductVersionPackageRequest build() {
            return new CreateProductVersionPackageRequest(this);
        } 

    } 

}
