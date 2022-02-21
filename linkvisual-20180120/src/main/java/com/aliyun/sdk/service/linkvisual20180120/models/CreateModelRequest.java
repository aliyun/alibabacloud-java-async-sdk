// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateModelRequest} extends {@link RequestModel}
 *
 * <p>CreateModelRequest</p>
 */
public class CreateModelRequest extends Request {
    @Query
    @NameInMap("AlgorithmId")
    @Validation(required = true)
    private Long algorithmId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Hardware")
    @Validation(required = true)
    private String hardware;

    @Query
    @NameInMap("ModelPackageStandard")
    @Validation(required = true)
    private String modelPackageStandard;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("NeedEncrypt")
    @Validation(required = true)
    private Boolean needEncrypt;

    @Query
    @NameInMap("UploadModelPath")
    @Validation(required = true)
    private String uploadModelPath;

    private CreateModelRequest(Builder builder) {
        super(builder);
        this.algorithmId = builder.algorithmId;
        this.description = builder.description;
        this.hardware = builder.hardware;
        this.modelPackageStandard = builder.modelPackageStandard;
        this.name = builder.name;
        this.needEncrypt = builder.needEncrypt;
        this.uploadModelPath = builder.uploadModelPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateModelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithmId
     */
    public Long getAlgorithmId() {
        return this.algorithmId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return hardware
     */
    public String getHardware() {
        return this.hardware;
    }

    /**
     * @return modelPackageStandard
     */
    public String getModelPackageStandard() {
        return this.modelPackageStandard;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return needEncrypt
     */
    public Boolean getNeedEncrypt() {
        return this.needEncrypt;
    }

    /**
     * @return uploadModelPath
     */
    public String getUploadModelPath() {
        return this.uploadModelPath;
    }

    public static final class Builder extends Request.Builder<CreateModelRequest, Builder> {
        private Long algorithmId; 
        private String description; 
        private String hardware; 
        private String modelPackageStandard; 
        private String name; 
        private Boolean needEncrypt; 
        private String uploadModelPath; 

        private Builder() {
            super();
        } 

        private Builder(CreateModelRequest response) {
            super(response);
            this.algorithmId = response.algorithmId;
            this.description = response.description;
            this.hardware = response.hardware;
            this.modelPackageStandard = response.modelPackageStandard;
            this.name = response.name;
            this.needEncrypt = response.needEncrypt;
            this.uploadModelPath = response.uploadModelPath;
        } 

        /**
         * AlgorithmId.
         */
        public Builder algorithmId(Long algorithmId) {
            this.putQueryParameter("AlgorithmId", algorithmId);
            this.algorithmId = algorithmId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Hardware.
         */
        public Builder hardware(String hardware) {
            this.putQueryParameter("Hardware", hardware);
            this.hardware = hardware;
            return this;
        }

        /**
         * ModelPackageStandard.
         */
        public Builder modelPackageStandard(String modelPackageStandard) {
            this.putQueryParameter("ModelPackageStandard", modelPackageStandard);
            this.modelPackageStandard = modelPackageStandard;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * NeedEncrypt.
         */
        public Builder needEncrypt(Boolean needEncrypt) {
            this.putQueryParameter("NeedEncrypt", needEncrypt);
            this.needEncrypt = needEncrypt;
            return this;
        }

        /**
         * UploadModelPath.
         */
        public Builder uploadModelPath(String uploadModelPath) {
            this.putQueryParameter("UploadModelPath", uploadModelPath);
            this.uploadModelPath = uploadModelPath;
            return this;
        }

        @Override
        public CreateModelRequest build() {
            return new CreateModelRequest(this);
        } 

    } 

}
