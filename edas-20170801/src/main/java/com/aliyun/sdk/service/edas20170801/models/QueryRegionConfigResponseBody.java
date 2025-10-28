// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryRegionConfigResponseBody} extends {@link TeaModel}
 *
 * <p>QueryRegionConfigResponseBody</p>
 */
public class QueryRegionConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RegionConfig")
    private RegionConfig regionConfig;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(QueryRegionConfigResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.regionConfig = model.regionConfig;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The additional information that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The information about region configurations.</p>
         */
        public Builder regionConfig(RegionConfig regionConfig) {
            this.regionConfig = regionConfig;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>b197-40ab-9155-7ca7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryRegionConfigResponseBody build() {
            return new QueryRegionConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryRegionConfigResponseBody} extends {@link TeaModel}
     *
     * <p>QueryRegionConfigResponseBody</p>
     */
    public static class FileServerConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("InternalUrl")
        private String internalUrl;

        @com.aliyun.core.annotation.NameInMap("PublicUrl")
        private String publicUrl;

        @com.aliyun.core.annotation.NameInMap("VpcUrl")
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

            private Builder() {
            } 

            private Builder(FileServerConfig model) {
                this.bucket = model.bucket;
                this.internalUrl = model.internalUrl;
                this.publicUrl = model.publicUrl;
                this.vpcUrl = model.vpcUrl;
            } 

            /**
             * <p>The Object Storage Service (OSS) bucket of the file server.</p>
             * 
             * <strong>example:</strong>
             * <p>edas-bj</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The internal endpoint of the file server.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-cn-beijing-****.aliyuncs.com</p>
             */
            public Builder internalUrl(String internalUrl) {
                this.internalUrl = internalUrl;
                return this;
            }

            /**
             * <p>The public endpoint of the file server.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-cn-beijing.aliyuncs.com</p>
             */
            public Builder publicUrl(String publicUrl) {
                this.publicUrl = publicUrl;
                return this;
            }

            /**
             * <p>The virtual private cloud (VPC) endpoint of the file server.</p>
             * 
             * <strong>example:</strong>
             * <p>v*****-oss-cn-beijing.aliyuncs.com</p>
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
    /**
     * 
     * {@link QueryRegionConfigResponseBody} extends {@link TeaModel}
     *
     * <p>QueryRegionConfigResponseBody</p>
     */
    public static class RegionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressServerHost")
        private String addressServerHost;

        @com.aliyun.core.annotation.NameInMap("AgentInstallScript")
        private String agentInstallScript;

        @com.aliyun.core.annotation.NameInMap("FileServerConfig")
        private FileServerConfig fileServerConfig;

        @com.aliyun.core.annotation.NameInMap("FileServerType")
        private String fileServerType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("No")
        private Integer no;

        @com.aliyun.core.annotation.NameInMap("Tag")
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

            private Builder() {
            } 

            private Builder(RegionConfig model) {
                this.addressServerHost = model.addressServerHost;
                this.agentInstallScript = model.agentInstallScript;
                this.fileServerConfig = model.fileServerConfig;
                this.fileServerType = model.fileServerType;
                this.id = model.id;
                this.imageId = model.imageId;
                this.name = model.name;
                this.no = model.no;
                this.tag = model.tag;
            } 

            /**
             * <p>The domain name of Address Server.</p>
             * 
             * <strong>example:</strong>
             * <p>****.edas.aliyun.com</p>
             */
            public Builder addressServerHost(String addressServerHost) {
                this.addressServerHost = addressServerHost;
                return this;
            }

            /**
             * <p>The installation path of the script for EDAS Agent.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://edas-qd.oss-cn-****-internal.aliyuncs.com/****sh">http://edas-qd.oss-cn-****-internal.aliyuncs.com/****sh</a></p>
             */
            public Builder agentInstallScript(String agentInstallScript) {
                this.agentInstallScript = agentInstallScript;
                return this;
            }

            /**
             * <p>The information about the file server.</p>
             */
            public Builder fileServerConfig(FileServerConfig fileServerConfig) {
                this.fileServerConfig = fileServerConfig;
                return this;
            }

            /**
             * <p>The type of the file server.</p>
             * 
             * <strong>example:</strong>
             * <p>oss</p>
             */
            public Builder fileServerType(String fileServerType) {
                this.fileServerType = fileServerType;
                return this;
            }

            /**
             * <p>The configured ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The ID of the official image.</p>
             * 
             * <strong>example:</strong>
             * <p>m-2zea4hx8f9zxqah2****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The configured name of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>China (Beijing)</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The serial number of the region. This parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder no(Integer no) {
                this.no = no;
                return this;
            }

            /**
             * <p>The tag of the region. The value is fixed to <code>ALIYUN_SHARE</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN_SHARE</p>
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
