// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetModelOssPolicyRequest} extends {@link RequestModel}
 *
 * <p>GetModelOssPolicyRequest</p>
 */
public class GetModelOssPolicyRequest extends Request {
    @Query
    @NameInMap("AlgorithmId")
    @Validation(required = true)
    private Long algorithmId;

    @Query
    @NameInMap("Hardware")
    private String hardware;

    @Query
    @NameInMap("ModelPackageStandard")
    private String modelPackageStandard;

    private GetModelOssPolicyRequest(Builder builder) {
        super(builder);
        this.algorithmId = builder.algorithmId;
        this.hardware = builder.hardware;
        this.modelPackageStandard = builder.modelPackageStandard;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModelOssPolicyRequest create() {
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

    public static final class Builder extends Request.Builder<GetModelOssPolicyRequest, Builder> {
        private Long algorithmId; 
        private String hardware; 
        private String modelPackageStandard; 

        private Builder() {
            super();
        } 

        private Builder(GetModelOssPolicyRequest response) {
            super(response);
            this.algorithmId = response.algorithmId;
            this.hardware = response.hardware;
            this.modelPackageStandard = response.modelPackageStandard;
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

        @Override
        public GetModelOssPolicyRequest build() {
            return new GetModelOssPolicyRequest(this);
        } 

    } 

}
