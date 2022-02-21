// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReEncryptRequest} extends {@link RequestModel}
 *
 * <p>ReEncryptRequest</p>
 */
public class ReEncryptRequest extends Request {
    @Query
    @NameInMap("CiphertextBlob")
    @Validation(required = true)
    private String ciphertextBlob;

    @Query
    @NameInMap("DestinationEncryptionContext")
    private java.util.Map < String, ? > destinationEncryptionContext;

    @Query
    @NameInMap("DestinationKeyId")
    @Validation(required = true)
    private String destinationKeyId;

    @Query
    @NameInMap("SourceEncryptionAlgorithm")
    private String sourceEncryptionAlgorithm;

    @Query
    @NameInMap("SourceEncryptionContext")
    private java.util.Map < String, ? > sourceEncryptionContext;

    @Query
    @NameInMap("SourceKeyId")
    private String sourceKeyId;

    @Query
    @NameInMap("SourceKeyVersionId")
    private String sourceKeyVersionId;

    private ReEncryptRequest(Builder builder) {
        super(builder);
        this.ciphertextBlob = builder.ciphertextBlob;
        this.destinationEncryptionContext = builder.destinationEncryptionContext;
        this.destinationKeyId = builder.destinationKeyId;
        this.sourceEncryptionAlgorithm = builder.sourceEncryptionAlgorithm;
        this.sourceEncryptionContext = builder.sourceEncryptionContext;
        this.sourceKeyId = builder.sourceKeyId;
        this.sourceKeyVersionId = builder.sourceKeyVersionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReEncryptRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ciphertextBlob
     */
    public String getCiphertextBlob() {
        return this.ciphertextBlob;
    }

    /**
     * @return destinationEncryptionContext
     */
    public java.util.Map < String, ? > getDestinationEncryptionContext() {
        return this.destinationEncryptionContext;
    }

    /**
     * @return destinationKeyId
     */
    public String getDestinationKeyId() {
        return this.destinationKeyId;
    }

    /**
     * @return sourceEncryptionAlgorithm
     */
    public String getSourceEncryptionAlgorithm() {
        return this.sourceEncryptionAlgorithm;
    }

    /**
     * @return sourceEncryptionContext
     */
    public java.util.Map < String, ? > getSourceEncryptionContext() {
        return this.sourceEncryptionContext;
    }

    /**
     * @return sourceKeyId
     */
    public String getSourceKeyId() {
        return this.sourceKeyId;
    }

    /**
     * @return sourceKeyVersionId
     */
    public String getSourceKeyVersionId() {
        return this.sourceKeyVersionId;
    }

    public static final class Builder extends Request.Builder<ReEncryptRequest, Builder> {
        private String ciphertextBlob; 
        private java.util.Map < String, ? > destinationEncryptionContext; 
        private String destinationKeyId; 
        private String sourceEncryptionAlgorithm; 
        private java.util.Map < String, ? > sourceEncryptionContext; 
        private String sourceKeyId; 
        private String sourceKeyVersionId; 

        private Builder() {
            super();
        } 

        private Builder(ReEncryptRequest response) {
            super(response);
            this.ciphertextBlob = response.ciphertextBlob;
            this.destinationEncryptionContext = response.destinationEncryptionContext;
            this.destinationKeyId = response.destinationKeyId;
            this.sourceEncryptionAlgorithm = response.sourceEncryptionAlgorithm;
            this.sourceEncryptionContext = response.sourceEncryptionContext;
            this.sourceKeyId = response.sourceKeyId;
            this.sourceKeyVersionId = response.sourceKeyVersionId;
        } 

        /**
         * CiphertextBlob.
         */
        public Builder ciphertextBlob(String ciphertextBlob) {
            this.putQueryParameter("CiphertextBlob", ciphertextBlob);
            this.ciphertextBlob = ciphertextBlob;
            return this;
        }

        /**
         * DestinationEncryptionContext.
         */
        public Builder destinationEncryptionContext(java.util.Map < String, ? > destinationEncryptionContext) {
            this.putQueryParameter("DestinationEncryptionContext", destinationEncryptionContext);
            this.destinationEncryptionContext = destinationEncryptionContext;
            return this;
        }

        /**
         * DestinationKeyId.
         */
        public Builder destinationKeyId(String destinationKeyId) {
            this.putQueryParameter("DestinationKeyId", destinationKeyId);
            this.destinationKeyId = destinationKeyId;
            return this;
        }

        /**
         * SourceEncryptionAlgorithm.
         */
        public Builder sourceEncryptionAlgorithm(String sourceEncryptionAlgorithm) {
            this.putQueryParameter("SourceEncryptionAlgorithm", sourceEncryptionAlgorithm);
            this.sourceEncryptionAlgorithm = sourceEncryptionAlgorithm;
            return this;
        }

        /**
         * SourceEncryptionContext.
         */
        public Builder sourceEncryptionContext(java.util.Map < String, ? > sourceEncryptionContext) {
            this.putQueryParameter("SourceEncryptionContext", sourceEncryptionContext);
            this.sourceEncryptionContext = sourceEncryptionContext;
            return this;
        }

        /**
         * SourceKeyId.
         */
        public Builder sourceKeyId(String sourceKeyId) {
            this.putQueryParameter("SourceKeyId", sourceKeyId);
            this.sourceKeyId = sourceKeyId;
            return this;
        }

        /**
         * SourceKeyVersionId.
         */
        public Builder sourceKeyVersionId(String sourceKeyVersionId) {
            this.putQueryParameter("SourceKeyVersionId", sourceKeyVersionId);
            this.sourceKeyVersionId = sourceKeyVersionId;
            return this;
        }

        @Override
        public ReEncryptRequest build() {
            return new ReEncryptRequest(this);
        } 

    } 

}
