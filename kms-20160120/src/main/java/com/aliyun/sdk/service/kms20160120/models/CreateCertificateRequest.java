// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCertificateRequest} extends {@link RequestModel}
 *
 * <p>CreateCertificateRequest</p>
 */
public class CreateCertificateRequest extends Request {
    @Query
    @NameInMap("ExportablePrivateKey")
    private Boolean exportablePrivateKey;

    @Query
    @NameInMap("KeySpec")
    @Validation(required = true)
    private String keySpec;

    @Query
    @NameInMap("Subject")
    @Validation(required = true)
    private String subject;

    @Query
    @NameInMap("SubjectAlternativeNames")
    private java.util.Map < String, ? > subjectAlternativeNames;

    private CreateCertificateRequest(Builder builder) {
        super(builder);
        this.exportablePrivateKey = builder.exportablePrivateKey;
        this.keySpec = builder.keySpec;
        this.subject = builder.subject;
        this.subjectAlternativeNames = builder.subjectAlternativeNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCertificateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return exportablePrivateKey
     */
    public Boolean getExportablePrivateKey() {
        return this.exportablePrivateKey;
    }

    /**
     * @return keySpec
     */
    public String getKeySpec() {
        return this.keySpec;
    }

    /**
     * @return subject
     */
    public String getSubject() {
        return this.subject;
    }

    /**
     * @return subjectAlternativeNames
     */
    public java.util.Map < String, ? > getSubjectAlternativeNames() {
        return this.subjectAlternativeNames;
    }

    public static final class Builder extends Request.Builder<CreateCertificateRequest, Builder> {
        private Boolean exportablePrivateKey; 
        private String keySpec; 
        private String subject; 
        private java.util.Map < String, ? > subjectAlternativeNames; 

        private Builder() {
            super();
        } 

        private Builder(CreateCertificateRequest request) {
            super(request);
            this.exportablePrivateKey = request.exportablePrivateKey;
            this.keySpec = request.keySpec;
            this.subject = request.subject;
            this.subjectAlternativeNames = request.subjectAlternativeNames;
        } 

        /**
         * ExportablePrivateKey.
         */
        public Builder exportablePrivateKey(Boolean exportablePrivateKey) {
            this.putQueryParameter("ExportablePrivateKey", exportablePrivateKey);
            this.exportablePrivateKey = exportablePrivateKey;
            return this;
        }

        /**
         * KeySpec.
         */
        public Builder keySpec(String keySpec) {
            this.putQueryParameter("KeySpec", keySpec);
            this.keySpec = keySpec;
            return this;
        }

        /**
         * Subject.
         */
        public Builder subject(String subject) {
            this.putQueryParameter("Subject", subject);
            this.subject = subject;
            return this;
        }

        /**
         * SubjectAlternativeNames.
         */
        public Builder subjectAlternativeNames(java.util.Map < String, ? > subjectAlternativeNames) {
            String subjectAlternativeNamesShrink = shrink(subjectAlternativeNames, "SubjectAlternativeNames", "json");
            this.putQueryParameter("SubjectAlternativeNames", subjectAlternativeNamesShrink);
            this.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }

        @Override
        public CreateCertificateRequest build() {
            return new CreateCertificateRequest(this);
        } 

    } 

}
