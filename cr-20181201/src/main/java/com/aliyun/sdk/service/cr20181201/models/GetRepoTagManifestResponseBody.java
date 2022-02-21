// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRepoTagManifestResponseBody} extends {@link TeaModel}
 *
 * <p>GetRepoTagManifestResponseBody</p>
 */
public class GetRepoTagManifestResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("Manifest")
    private Manifest manifest;

    @NameInMap("RequestId")
    private String requestId;

    private GetRepoTagManifestResponseBody(Builder builder) {
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.manifest = builder.manifest;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRepoTagManifestResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return manifest
     */
    public Manifest getManifest() {
        return this.manifest;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Boolean isSuccess; 
        private Manifest manifest; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * IsSuccess.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * Manifest.
         */
        public Builder manifest(Manifest manifest) {
            this.manifest = manifest;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRepoTagManifestResponseBody build() {
            return new GetRepoTagManifestResponseBody(this);
        } 

    } 

    public static class Config extends TeaModel {
        @NameInMap("Digest")
        private String digest;

        @NameInMap("MediaType")
        private String mediaType;

        @NameInMap("Size")
        private Long size;

        private Config(Builder builder) {
            this.digest = builder.digest;
            this.mediaType = builder.mediaType;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return digest
         */
        public String getDigest() {
            return this.digest;
        }

        /**
         * @return mediaType
         */
        public String getMediaType() {
            return this.mediaType;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        public static final class Builder {
            private String digest; 
            private String mediaType; 
            private Long size; 

            /**
             * Digest.
             */
            public Builder digest(String digest) {
                this.digest = digest;
                return this;
            }

            /**
             * MediaType.
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    public static class FsLayers extends TeaModel {
        @NameInMap("BlobSum")
        private String blobSum;

        private FsLayers(Builder builder) {
            this.blobSum = builder.blobSum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FsLayers create() {
            return builder().build();
        }

        /**
         * @return blobSum
         */
        public String getBlobSum() {
            return this.blobSum;
        }

        public static final class Builder {
            private String blobSum; 

            /**
             * BlobSum.
             */
            public Builder blobSum(String blobSum) {
                this.blobSum = blobSum;
                return this;
            }

            public FsLayers build() {
                return new FsLayers(this);
            } 

        } 

    }
    public static class History extends TeaModel {
        @NameInMap("V1Compatibility")
        private java.util.Map < String, ? > v1Compatibility;

        private History(Builder builder) {
            this.v1Compatibility = builder.v1Compatibility;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static History create() {
            return builder().build();
        }

        /**
         * @return v1Compatibility
         */
        public java.util.Map < String, ? > getV1Compatibility() {
            return this.v1Compatibility;
        }

        public static final class Builder {
            private java.util.Map < String, ? > v1Compatibility; 

            /**
             * V1Compatibility.
             */
            public Builder v1Compatibility(java.util.Map < String, ? > v1Compatibility) {
                this.v1Compatibility = v1Compatibility;
                return this;
            }

            public History build() {
                return new History(this);
            } 

        } 

    }
    public static class Layers extends TeaModel {
        @NameInMap("Digest")
        private String digest;

        @NameInMap("MediaType")
        private String mediaType;

        @NameInMap("Size")
        private Long size;

        private Layers(Builder builder) {
            this.digest = builder.digest;
            this.mediaType = builder.mediaType;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Layers create() {
            return builder().build();
        }

        /**
         * @return digest
         */
        public String getDigest() {
            return this.digest;
        }

        /**
         * @return mediaType
         */
        public String getMediaType() {
            return this.mediaType;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        public static final class Builder {
            private String digest; 
            private String mediaType; 
            private Long size; 

            /**
             * Digest.
             */
            public Builder digest(String digest) {
                this.digest = digest;
                return this;
            }

            /**
             * MediaType.
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            public Layers build() {
                return new Layers(this);
            } 

        } 

    }
    public static class Signatures extends TeaModel {
        @NameInMap("Header")
        private java.util.Map < String, ? > header;

        @NameInMap("Protected")
        private String _protected;

        @NameInMap("Signature")
        private String signature;

        private Signatures(Builder builder) {
            this.header = builder.header;
            this._protected = builder._protected;
            this.signature = builder.signature;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Signatures create() {
            return builder().build();
        }

        /**
         * @return header
         */
        public java.util.Map < String, ? > getHeader() {
            return this.header;
        }

        /**
         * @return _protected
         */
        public String get_protected() {
            return this._protected;
        }

        /**
         * @return signature
         */
        public String getSignature() {
            return this.signature;
        }

        public static final class Builder {
            private java.util.Map < String, ? > header; 
            private String _protected; 
            private String signature; 

            /**
             * Header.
             */
            public Builder header(java.util.Map < String, ? > header) {
                this.header = header;
                return this;
            }

            /**
             * Protected.
             */
            public Builder _protected(String _protected) {
                this._protected = _protected;
                return this;
            }

            /**
             * Signature.
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            public Signatures build() {
                return new Signatures(this);
            } 

        } 

    }
    public static class Manifest extends TeaModel {
        @NameInMap("Architecture")
        private String architecture;

        @NameInMap("Config")
        private Config config;

        @NameInMap("FsLayers")
        private java.util.List < FsLayers> fsLayers;

        @NameInMap("History")
        private java.util.List < History> history;

        @NameInMap("Layers")
        private java.util.List < Layers> layers;

        @NameInMap("MediaType")
        private String mediaType;

        @NameInMap("Name")
        private String name;

        @NameInMap("SchemaVersion")
        private Integer schemaVersion;

        @NameInMap("Signatures")
        private java.util.List < Signatures> signatures;

        @NameInMap("Tag")
        private String tag;

        private Manifest(Builder builder) {
            this.architecture = builder.architecture;
            this.config = builder.config;
            this.fsLayers = builder.fsLayers;
            this.history = builder.history;
            this.layers = builder.layers;
            this.mediaType = builder.mediaType;
            this.name = builder.name;
            this.schemaVersion = builder.schemaVersion;
            this.signatures = builder.signatures;
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Manifest create() {
            return builder().build();
        }

        /**
         * @return architecture
         */
        public String getArchitecture() {
            return this.architecture;
        }

        /**
         * @return config
         */
        public Config getConfig() {
            return this.config;
        }

        /**
         * @return fsLayers
         */
        public java.util.List < FsLayers> getFsLayers() {
            return this.fsLayers;
        }

        /**
         * @return history
         */
        public java.util.List < History> getHistory() {
            return this.history;
        }

        /**
         * @return layers
         */
        public java.util.List < Layers> getLayers() {
            return this.layers;
        }

        /**
         * @return mediaType
         */
        public String getMediaType() {
            return this.mediaType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return schemaVersion
         */
        public Integer getSchemaVersion() {
            return this.schemaVersion;
        }

        /**
         * @return signatures
         */
        public java.util.List < Signatures> getSignatures() {
            return this.signatures;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        public static final class Builder {
            private String architecture; 
            private Config config; 
            private java.util.List < FsLayers> fsLayers; 
            private java.util.List < History> history; 
            private java.util.List < Layers> layers; 
            private String mediaType; 
            private String name; 
            private Integer schemaVersion; 
            private java.util.List < Signatures> signatures; 
            private String tag; 

            /**
             * Architecture.
             */
            public Builder architecture(String architecture) {
                this.architecture = architecture;
                return this;
            }

            /**
             * Config.
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * FsLayers.
             */
            public Builder fsLayers(java.util.List < FsLayers> fsLayers) {
                this.fsLayers = fsLayers;
                return this;
            }

            /**
             * History.
             */
            public Builder history(java.util.List < History> history) {
                this.history = history;
                return this;
            }

            /**
             * Layers.
             */
            public Builder layers(java.util.List < Layers> layers) {
                this.layers = layers;
                return this;
            }

            /**
             * MediaType.
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * SchemaVersion.
             */
            public Builder schemaVersion(Integer schemaVersion) {
                this.schemaVersion = schemaVersion;
                return this;
            }

            /**
             * Signatures.
             */
            public Builder signatures(java.util.List < Signatures> signatures) {
                this.signatures = signatures;
                return this;
            }

            /**
             * Tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            public Manifest build() {
                return new Manifest(this);
            } 

        } 

    }
}
