package com.aliyun.sdk.service.oss20190517.presigner.models;

import java.net.URL;
import java.time.Instant;
import java.util.Map;

public abstract class PresignResponse {
    private final Instant expiration;
    private final URL url;
    private final Map<String, String> signedHeaders;

    protected PresignResponse(BuilderImpl<?, ?> builder) {
        this.expiration = builder.expiration;
        this.url = builder.url;
        this.signedHeaders = builder.signedHeaders;
    }

    public URL getUrl() {
        return url;
    }

    public Instant getExpiration() {
        return expiration;
    }

    public Map<String, String> getSignedHeaders() {
        return signedHeaders;
    }

    public interface Builder<ProviderT extends PresignResponse, BuilderT extends Builder> {
        BuilderT expiration(Instant expiration);
        BuilderT url(URL url);
        BuilderT signedHeaders(Map<String, String> signedHeaders);
        ProviderT build();
    }

    protected abstract static class BuilderImpl<ProviderT extends PresignResponse, BuilderT extends Builder>
            implements Builder<ProviderT, BuilderT> {
        private Instant expiration;
        private URL url;
        private  Map<String, String> signedHeaders;

        protected BuilderImpl() {
        }

        protected BuilderImpl(PresignResponse response) {
            this.expiration = response.expiration;
            this.url = response.url;
        }

        @Override
        public BuilderT expiration(Instant expiration) {
            this.expiration = expiration;
            return (BuilderT)this;
        }

        @Override
        public BuilderT url(URL url) {
            this.url = url;
            return (BuilderT)this;
        }

        @Override
        public BuilderT signedHeaders(Map<String, String> signedHeaders) {
            this.signedHeaders = signedHeaders;
            return (BuilderT)this;
        }
    }
}