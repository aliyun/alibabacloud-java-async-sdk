// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBatchMediaProducingJobRequest} extends {@link RequestModel}
 *
 * <p>GetBatchMediaProducingJobRequest</p>
 */
public class GetBatchMediaProducingJobRequest extends Request {
    @Query
    @NameInMap("JobId")
    private String jobId;

    @Query
    @NameInMap("Signature")
    private String signature;

    @Query
    @NameInMap("SignatureMehtod")
    private String signatureMehtod;

    @Query
    @NameInMap("SignatureNonce")
    private String signatureNonce;

    @Query
    @NameInMap("SignatureType")
    private String signatureType;

    @Query
    @NameInMap("SignatureVersion")
    private String signatureVersion;

    private GetBatchMediaProducingJobRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.signature = builder.signature;
        this.signatureMehtod = builder.signatureMehtod;
        this.signatureNonce = builder.signatureNonce;
        this.signatureType = builder.signatureType;
        this.signatureVersion = builder.signatureVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBatchMediaProducingJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return signature
     */
    public String getSignature() {
        return this.signature;
    }

    /**
     * @return signatureMehtod
     */
    public String getSignatureMehtod() {
        return this.signatureMehtod;
    }

    /**
     * @return signatureNonce
     */
    public String getSignatureNonce() {
        return this.signatureNonce;
    }

    /**
     * @return signatureType
     */
    public String getSignatureType() {
        return this.signatureType;
    }

    /**
     * @return signatureVersion
     */
    public String getSignatureVersion() {
        return this.signatureVersion;
    }

    public static final class Builder extends Request.Builder<GetBatchMediaProducingJobRequest, Builder> {
        private String jobId; 
        private String signature; 
        private String signatureMehtod; 
        private String signatureNonce; 
        private String signatureType; 
        private String signatureVersion; 

        private Builder() {
            super();
        } 

        private Builder(GetBatchMediaProducingJobRequest request) {
            super(request);
            this.jobId = request.jobId;
            this.signature = request.signature;
            this.signatureMehtod = request.signatureMehtod;
            this.signatureNonce = request.signatureNonce;
            this.signatureType = request.signatureType;
            this.signatureVersion = request.signatureVersion;
        } 

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * Signature.
         */
        public Builder signature(String signature) {
            this.putQueryParameter("Signature", signature);
            this.signature = signature;
            return this;
        }

        /**
         * SignatureMehtod.
         */
        public Builder signatureMehtod(String signatureMehtod) {
            this.putQueryParameter("SignatureMehtod", signatureMehtod);
            this.signatureMehtod = signatureMehtod;
            return this;
        }

        /**
         * SignatureNonce.
         */
        public Builder signatureNonce(String signatureNonce) {
            this.putQueryParameter("SignatureNonce", signatureNonce);
            this.signatureNonce = signatureNonce;
            return this;
        }

        /**
         * SignatureType.
         */
        public Builder signatureType(String signatureType) {
            this.putQueryParameter("SignatureType", signatureType);
            this.signatureType = signatureType;
            return this;
        }

        /**
         * SignatureVersion.
         */
        public Builder signatureVersion(String signatureVersion) {
            this.putQueryParameter("SignatureVersion", signatureVersion);
            this.signatureVersion = signatureVersion;
            return this;
        }

        @Override
        public GetBatchMediaProducingJobRequest build() {
            return new GetBatchMediaProducingJobRequest(this);
        } 

    } 

}
