// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Manifest")
    private Manifest manifest;


    private GetRepoTagManifestResponseBody(Builder builder) {
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.requestId = builder.requestId;
        this.manifest = builder.manifest;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return manifest
     */
    public Manifest getManifest() {
        return this.manifest;
    }

    public static final class Builder {
        private String code; 
        private Boolean isSuccess; 
        private String requestId; 
        private Manifest manifest; 

        /**
         * <p>Return value</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Successful</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>Request ID</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Manifest information</p>
         */
        public Builder manifest(Manifest manifest) {
            this.manifest = manifest;
            return this;
        }

        public GetRepoTagManifestResponseBody build() {
            return new GetRepoTagManifestResponseBody(this);
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
             * <p>Block sum</p>
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
             * <p>v1 compatible</p>
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
    public static class Signatures extends TeaModel {
        @NameInMap("Signature")
        private String signature;

        @NameInMap("Header")
        private java.util.Map < String, ? > header;

        @NameInMap("Protected")
        private String _protected;


        private Signatures(Builder builder) {
            this.signature = builder.signature;
            this.header = builder.header;
            this._protected = builder._protected;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Signatures create() {
            return builder().build();
        }

        /**
         * @return signature
         */
        public String getSignature() {
            return this.signature;
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

        public static final class Builder {
            private String signature; 
            private java.util.Map < String, ? > header; 
            private String _protected; 

            /**
             * <p>Signature information</p>
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            /**
             * <p>Header information</p>
             */
            public Builder header(java.util.Map < String, ? > header) {
                this.header = header;
                return this;
            }

            /**
             * <p>Protected</p>
             */
            public Builder _protected(String _protected) {
                this._protected = _protected;
                return this;
            }

            public Signatures build() {
                return new Signatures(this);
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
             * <p>digest value</p>
             */
            public Builder digest(String digest) {
                this.digest = digest;
                return this;
            }

            /**
             * <p>File type</p>
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            /**
             * <p>Size</p>
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
             * <p>digest value</p>
             */
            public Builder digest(String digest) {
                this.digest = digest;
                return this;
            }

            /**
             * <p>File type</p>
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            /**
             * <p>Size</p>
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
    public static class Manifest extends TeaModel {
        @NameInMap("Tag")
        private String tag;

        @NameInMap("Name")
        private String name;

        @NameInMap("MediaType")
        private String mediaType;

        @NameInMap("SchemaVersion")
        private Integer schemaVersion;

        @NameInMap("Architecture")
        private String architecture;

        @NameInMap("FsLayers")
        private java.util.List < FsLayers> fsLayers;

        @NameInMap("History")
        private java.util.List < History> history;

        @NameInMap("Signatures")
        private java.util.List < Signatures> signatures;

        @NameInMap("Layers")
        private java.util.List < Layers> layers;

        @NameInMap("Config")
        private Config config;


        private Manifest(Builder builder) {
            this.tag = builder.tag;
            this.name = builder.name;
            this.mediaType = builder.mediaType;
            this.schemaVersion = builder.schemaVersion;
            this.architecture = builder.architecture;
            this.fsLayers = builder.fsLayers;
            this.history = builder.history;
            this.signatures = builder.signatures;
            this.layers = builder.layers;
            this.config = builder.config;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Manifest create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return mediaType
         */
        public String getMediaType() {
            return this.mediaType;
        }

        /**
         * @return schemaVersion
         */
        public Integer getSchemaVersion() {
            return this.schemaVersion;
        }

        /**
         * @return architecture
         */
        public String getArchitecture() {
            return this.architecture;
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
         * @return signatures
         */
        public java.util.List < Signatures> getSignatures() {
            return this.signatures;
        }

        /**
         * @return layers
         */
        public java.util.List < Layers> getLayers() {
            return this.layers;
        }

        /**
         * @return config
         */
        public Config getConfig() {
            return this.config;
        }

        public static final class Builder {
            private String tag; 
            private String name; 
            private String mediaType; 
            private Integer schemaVersion; 
            private String architecture; 
            private java.util.List < FsLayers> fsLayers; 
            private java.util.List < History> history; 
            private java.util.List < Signatures> signatures; 
            private java.util.List < Layers> layers; 
            private Config config; 

            /**
             * <p>Image TAG</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>Name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Type</p>
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            /**
             * <p>schema version</p>
             */
            public Builder schemaVersion(Integer schemaVersion) {
                this.schemaVersion = schemaVersion;
                return this;
            }

            /**
             * <p>Architecture</p>
             */
            public Builder architecture(String architecture) {
                this.architecture = architecture;
                return this;
            }

            /**
             * <p>File layer information</p>
             */
            public Builder fsLayers(java.util.List < FsLayers> fsLayers) {
                this.fsLayers = fsLayers;
                return this;
            }

            /**
             * <p>Historical information</p>
             */
            public Builder history(java.util.List < History> history) {
                this.history = history;
                return this;
            }

            /**
             * <p>Signature list</p>
             */
            public Builder signatures(java.util.List < Signatures> signatures) {
                this.signatures = signatures;
                return this;
            }

            /**
             * <p>Layer list</p>
             */
            public Builder layers(java.util.List < Layers> layers) {
                this.layers = layers;
                return this;
            }

            /**
             * <p>Configuration information</p>
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            public Manifest build() {
                return new Manifest(this);
            } 

        } 

    }
}
