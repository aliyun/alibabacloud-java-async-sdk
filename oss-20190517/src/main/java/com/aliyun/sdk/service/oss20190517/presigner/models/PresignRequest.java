package com.aliyun.sdk.service.oss20190517.presigner.models;

import com.aliyun.core.utils.Validate;

import java.time.Duration;
import java.time.Instant;

public class PresignRequest {
    private final Duration signatureDuration;
    private final Instant signatureExpiration;
    protected PresignRequest(BuilderImpl<?, ?> builder) {
        this.signatureDuration = builder.signatureDuration;
        this.signatureExpiration = builder.signatureExpiration;
        Validate.isTrue(this.signatureDuration != null || this.signatureExpiration != null,
                "signatureDuration or signatureExpiration must not be null");

    }

    public Duration getSignatureDuration() {
        return this.signatureDuration;
    }

    public Instant getSignatureExpiration() {
        return this.signatureExpiration;
    }

    public interface Builder<ProviderT extends PresignRequest, BuilderT extends Builder> {
        BuilderT signatureDuration(Duration signatureDuration);
        BuilderT signatureExpiration(Instant signatureExpiration);
        ProviderT build();
    }

    protected abstract static class BuilderImpl<ProviderT extends PresignRequest, BuilderT extends Builder>
            implements Builder<ProviderT, BuilderT> {
        private Duration signatureDuration;
        private Instant signatureExpiration;
        protected BuilderImpl() {
        }

        protected BuilderImpl(PresignRequest request) {
        }

        @Override
        public BuilderT signatureDuration(Duration signatureDuration) {
            this.signatureExpiration = null;
            this.signatureDuration = signatureDuration;
            return (BuilderT) this;
        }

        @Override
        public BuilderT signatureExpiration(Instant signatureExpiration) {
            this.signatureDuration = null;
            this.signatureExpiration = signatureExpiration;
            return (BuilderT) this;
        }
   }
}
