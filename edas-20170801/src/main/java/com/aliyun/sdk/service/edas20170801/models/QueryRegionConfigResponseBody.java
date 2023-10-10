// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRegionConfigResponseBody} extends {@link TeaModel}
 *
 * <p>QueryRegionConfigResponseBody</p>
 */
public class QueryRegionConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RegionConfig")
    private RegionConfig regionConfig;

    @NameInMap("RequestId")
    private String requestId;

    private QueryRegionConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.regionConfig = builder.regionConfig;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRegionConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return regionConfig
     */
    public RegionConfig getRegionConfig() {
        return this.regionConfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private RegionConfig regionConfig; 
        private String requestId; 

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The additional information that is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The information about region configurations.
         */
        public Builder regionConfig(RegionConfig regionConfig) {
            this.regionConfig = regionConfig;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryRegionConfigResponseBody build() {
            return new QueryRegionConfigResponseBody(this);
        } 

    } 

    public static class FileServerConfig extends TeaModel {
        @NameInMap("Bucket")
        private String bucket;

        @NameInMap("InternalUrl")
        private String internalUrl;

        @NameInMap("PublicUrl")
        private String publicUrl;

        @NameInMap("VpcUrl")
        private String vpcUrl;

        private FileServerConfig(Builder builder) {
            this.bucket = builder.bucket;
            this.internalUrl = builder.internalUrl;
            this.publicUrl = builder.publicUrl;
            this.vpcUrl = builder.vpcUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileServerConfig create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return internalUrl
         */
        public String getInternalUrl() {
            return this.internalUrl;
        }

        /**
         * @return publicUrl
         */
        public String getPublicUrl() {
            return this.publicUrl;
        }

        /**
         * @return vpcUrl
         */
        public String getVpcUrl() {
            return this.vpcUrl;
        }

        public static final class Builder {
            private String bucket; 
            private String internalUrl; 
            private String publicUrl; 
            private String vpcUrl; 

            /**
             * The Object Storage Service (OSS) bucket of the file server.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * The internal endpoint of the file server.
             */
            public Builder internalUrl(String internalUrl) {
                this.internalUrl = internalUrl;
                return this;
            }

            /**
             * The public endpoint of the file server.
             */
            public Builder publicUrl(String publicUrl) {
                this.publicUrl = publicUrl;
                return this;
            }

            /**
             * The virtual private cloud (VPC) endpoint of the file server.
             */
            public Builder vpcUrl(String vpcUrl) {
                this.vpcUrl = vpcUrl;
                return this;
            }

            public FileServerConfig build() {
                return new FileServerConfig(this);
            } 

        } 

    }
    public static class RegionConfig extends TeaModel {
        @NameInMap("AddressServerHost")
        private String addressServerHost;

        @NameInMap("AgentInstallScript")
        private String agentInstallScript;

        @NameInMap("FileServerConfig")
        private FileServerConfig fileServerConfig;

        @NameInMap("FileServerType")
        private String fileServerType;

        @NameInMap("Id")
        private String id;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("Name")
        private String name;

        @NameInMap("No")
        private Integer no;

        @NameInMap("Tag")
        private String tag;

        private RegionConfig(Builder builder) {
            this.addressServerHost = builder.addressServerHost;
            this.agentInstallScript = builder.agentInstallScript;
            this.fileServerConfig = builder.fileServerConfig;
            this.fileServerType = builder.fileServerType;
            this.id = builder.id;
            this.imageId = builder.imageId;
            this.name = builder.name;
            this.no = builder.no;
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionConfig create() {
            return builder().build();
        }

        /**
         * @return addressServerHost
         */
        public String getAddressServerHost() {
            return this.addressServerHost;
        }

        /**
         * @return agentInstallScript
         */
        public String getAgentInstallScript() {
            return this.agentInstallScript;
        }

        /**
         * @return fileServerConfig
         */
        public FileServerConfig getFileServerConfig() {
            return this.fileServerConfig;
        }

        /**
         * @return fileServerType
         */
        public String getFileServerType() {
            return this.fileServerType;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return no
         */
        public Integer getNo() {
            return this.no;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        public static final class Builder {
            private String addressServerHost; 
            private String agentInstallScript; 
            private FileServerConfig fileServerConfig; 
            private String fileServerType; 
            private String id; 
            private String imageId; 
            private String name; 
            private Integer no; 
            private String tag; 

            /**
             * The domain name of Address Server.
             */
            public Builder addressServerHost(String addressServerHost) {
                this.addressServerHost = addressServerHost;
                return this;
            }

            /**
             * The installation path of the script for EDAS Agent.
             */
            public Builder agentInstallScript(String agentInstallScript) {
                this.agentInstallScript = agentInstallScript;
                return this;
            }

            /**
             * The information about the file server.
             */
            public Builder fileServerConfig(FileServerConfig fileServerConfig) {
                this.fileServerConfig = fileServerConfig;
                return this;
            }

            /**
             * The type of the file server.
             */
            public Builder fileServerType(String fileServerType) {
                this.fileServerType = fileServerType;
                return this;
            }

            /**
             * The configured ID of the region.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The ID of the official image.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * The configured name of the region.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The serial number of the region. This parameter is deprecated.
             */
            public Builder no(Integer no) {
                this.no = no;
                return this;
            }

            /**
             * The tag of the region. The value is fixed to `ALIYUN_SHARE`.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            public RegionConfig build() {
                return new RegionConfig(this);
            } 

        } 

    }
}
