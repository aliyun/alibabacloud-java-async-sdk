// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitSparkJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitSparkJobRequest</p>
 */
public class SubmitSparkJobRequest extends Request {
    @Body
    @NameInMap("AppCode")
    @Validation(required = true)
    private String appCode;

    @Body
    @NameInMap("Arguments")
    private java.util.List < String > arguments;

    @Body
    @NameInMap("Configuration")
    private java.util.Map < String, ? > configuration;

    @Body
    @NameInMap("Files")
    private java.util.List < String > files;

    @Body
    @NameInMap("MainClass")
    @Validation(required = true)
    private String mainClass;

    @Body
    @NameInMap("MainFile")
    @Validation(required = true)
    private String mainFile;

    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("OssInfo")
    private OssInfo ossInfo;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    private SubmitSparkJobRequest(Builder builder) {
        super(builder);
        this.appCode = builder.appCode;
        this.arguments = builder.arguments;
        this.configuration = builder.configuration;
        this.files = builder.files;
        this.mainClass = builder.mainClass;
        this.mainFile = builder.mainFile;
        this.name = builder.name;
        this.ossInfo = builder.ossInfo;
        this.regionId = builder.regionId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitSparkJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appCode
     */
    public String getAppCode() {
        return this.appCode;
    }

    /**
     * @return arguments
     */
    public java.util.List < String > getArguments() {
        return this.arguments;
    }

    /**
     * @return configuration
     */
    public java.util.Map < String, ? > getConfiguration() {
        return this.configuration;
    }

    /**
     * @return files
     */
    public java.util.List < String > getFiles() {
        return this.files;
    }

    /**
     * @return mainClass
     */
    public String getMainClass() {
        return this.mainClass;
    }

    /**
     * @return mainFile
     */
    public String getMainFile() {
        return this.mainFile;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ossInfo
     */
    public OssInfo getOssInfo() {
        return this.ossInfo;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<SubmitSparkJobRequest, Builder> {
        private String appCode; 
        private java.util.List < String > arguments; 
        private java.util.Map < String, ? > configuration; 
        private java.util.List < String > files; 
        private String mainClass; 
        private String mainFile; 
        private String name; 
        private OssInfo ossInfo; 
        private String regionId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(SubmitSparkJobRequest response) {
            super(response);
            this.appCode = response.appCode;
            this.arguments = response.arguments;
            this.configuration = response.configuration;
            this.files = response.files;
            this.mainClass = response.mainClass;
            this.mainFile = response.mainFile;
            this.name = response.name;
            this.ossInfo = response.ossInfo;
            this.regionId = response.regionId;
            this.tid = response.tid;
        } 

        /**
         * AppCode.
         */
        public Builder appCode(String appCode) {
            this.putBodyParameter("AppCode", appCode);
            this.appCode = appCode;
            return this;
        }

        /**
         * Arguments.
         */
        public Builder arguments(java.util.List < String > arguments) {
            this.putBodyParameter("Arguments", arguments);
            this.arguments = arguments;
            return this;
        }

        /**
         * Configuration.
         */
        public Builder configuration(java.util.Map < String, ? > configuration) {
            this.putBodyParameter("Configuration", configuration);
            this.configuration = configuration;
            return this;
        }

        /**
         * Files.
         */
        public Builder files(java.util.List < String > files) {
            this.putBodyParameter("Files", files);
            this.files = files;
            return this;
        }

        /**
         * MainClass.
         */
        public Builder mainClass(String mainClass) {
            this.putBodyParameter("MainClass", mainClass);
            this.mainClass = mainClass;
            return this;
        }

        /**
         * MainFile.
         */
        public Builder mainFile(String mainFile) {
            this.putBodyParameter("MainFile", mainFile);
            this.mainFile = mainFile;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OssInfo.
         */
        public Builder ossInfo(OssInfo ossInfo) {
            this.putBodyParameter("OssInfo", ossInfo);
            this.ossInfo = ossInfo;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public SubmitSparkJobRequest build() {
            return new SubmitSparkJobRequest(this);
        } 

    } 

    public static class OssInfo extends TeaModel {
        @NameInMap("AccessKeyId")
        private String accessKeyId;

        @NameInMap("AccessKeySecret")
        private String accessKeySecret;

        @NameInMap("Endpoint")
        private String endpoint;

        private OssInfo(Builder builder) {
            this.accessKeyId = builder.accessKeyId;
            this.accessKeySecret = builder.accessKeySecret;
            this.endpoint = builder.endpoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OssInfo create() {
            return builder().build();
        }

        /**
         * @return accessKeyId
         */
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        /**
         * @return accessKeySecret
         */
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        public static final class Builder {
            private String accessKeyId; 
            private String accessKeySecret; 
            private String endpoint; 

            /**
             * AccessKeyId.
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * AccessKeySecret.
             */
            public Builder accessKeySecret(String accessKeySecret) {
                this.accessKeySecret = accessKeySecret;
                return this;
            }

            /**
             * Endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            public OssInfo build() {
                return new OssInfo(this);
            } 

        } 

    }
}
