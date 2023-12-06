// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateProductInstanceDeploymentConfigRequest} extends {@link RequestModel}
 *
 * <p>GenerateProductInstanceDeploymentConfigRequest</p>
 */
public class GenerateProductInstanceDeploymentConfigRequest extends Request {
    @Body
    @NameInMap("environmentUID")
    @Validation(required = true)
    private String environmentUID;

    @Body
    @NameInMap("packageContentType")
    private String packageContentType;

    @Body
    @NameInMap("packageUID")
    private String packageUID;

    @Body
    @NameInMap("productVersionUID")
    private String productVersionUID;

    @Body
    @NameInMap("productVersionUIDList")
    private java.util.List < String > productVersionUIDList;

    private GenerateProductInstanceDeploymentConfigRequest(Builder builder) {
        super(builder);
        this.environmentUID = builder.environmentUID;
        this.packageContentType = builder.packageContentType;
        this.packageUID = builder.packageUID;
        this.productVersionUID = builder.productVersionUID;
        this.productVersionUIDList = builder.productVersionUIDList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateProductInstanceDeploymentConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return environmentUID
     */
    public String getEnvironmentUID() {
        return this.environmentUID;
    }

    /**
     * @return packageContentType
     */
    public String getPackageContentType() {
        return this.packageContentType;
    }

    /**
     * @return packageUID
     */
    public String getPackageUID() {
        return this.packageUID;
    }

    /**
     * @return productVersionUID
     */
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

    /**
     * @return productVersionUIDList
     */
    public java.util.List < String > getProductVersionUIDList() {
        return this.productVersionUIDList;
    }

    public static final class Builder extends Request.Builder<GenerateProductInstanceDeploymentConfigRequest, Builder> {
        private String environmentUID; 
        private String packageContentType; 
        private String packageUID; 
        private String productVersionUID; 
        private java.util.List < String > productVersionUIDList; 

        private Builder() {
            super();
        } 

        private Builder(GenerateProductInstanceDeploymentConfigRequest request) {
            super(request);
            this.environmentUID = request.environmentUID;
            this.packageContentType = request.packageContentType;
            this.packageUID = request.packageUID;
            this.productVersionUID = request.productVersionUID;
            this.productVersionUIDList = request.productVersionUIDList;
        } 

        /**
         * environmentUID.
         */
        public Builder environmentUID(String environmentUID) {
            this.putBodyParameter("environmentUID", environmentUID);
            this.environmentUID = environmentUID;
            return this;
        }

        /**
         * packageContentType.
         */
        public Builder packageContentType(String packageContentType) {
            this.putBodyParameter("packageContentType", packageContentType);
            this.packageContentType = packageContentType;
            return this;
        }

        /**
         * packageUID.
         */
        public Builder packageUID(String packageUID) {
            this.putBodyParameter("packageUID", packageUID);
            this.packageUID = packageUID;
            return this;
        }

        /**
         * productVersionUID.
         */
        public Builder productVersionUID(String productVersionUID) {
            this.putBodyParameter("productVersionUID", productVersionUID);
            this.productVersionUID = productVersionUID;
            return this;
        }

        /**
         * productVersionUIDList.
         */
        public Builder productVersionUIDList(java.util.List < String > productVersionUIDList) {
            this.putBodyParameter("productVersionUIDList", productVersionUIDList);
            this.productVersionUIDList = productVersionUIDList;
            return this;
        }

        @Override
        public GenerateProductInstanceDeploymentConfigRequest build() {
            return new GenerateProductInstanceDeploymentConfigRequest(this);
        } 

    } 

}
