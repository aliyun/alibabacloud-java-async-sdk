// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link GetEffectiveImageByIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetEffectiveImageByIdResponseBody</p>
 */
public class GetEffectiveImageByIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetEffectiveImageByIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEffectiveImageByIdResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetEffectiveImageByIdResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code returned by the API. A value of 200 indicates success. If the call fails, the corresponding error code is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The image information returned by the query.</p>
         * 
         * <strong>example:</strong>
         * <p>Object</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message returned by the API.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate and troubleshoot the request.</p>
         * 
         * <strong>example:</strong>
         * <p>50158E8B-992E-1286-B174-**********</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the API call is successful. Valid values: true: Successful. false: Failed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetEffectiveImageByIdResponseBody build() {
            return new GetEffectiveImageByIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetEffectiveImageByIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetEffectiveImageByIdResponseBody</p>
     */
    public static class AdaptorInfoBOList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdaptorId")
        private String adaptorId;

        @com.aliyun.core.annotation.NameInMap("AdaptorMessage")
        private String adaptorMessage;

        @com.aliyun.core.annotation.NameInMap("AdaptorMode")
        private String adaptorMode;

        @com.aliyun.core.annotation.NameInMap("AdaptorStep")
        private String adaptorStep;

        @com.aliyun.core.annotation.NameInMap("AppIconUrl")
        private String appIconUrl;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AppScript")
        private String appScript;

        @com.aliyun.core.annotation.NameInMap("AppType")
        private String appType;

        @com.aliyun.core.annotation.NameInMap("AppVersionId")
        private String appVersionId;

        @com.aliyun.core.annotation.NameInMap("AppVersionName")
        private String appVersionName;

        @com.aliyun.core.annotation.NameInMap("AppVersionNumber")
        private String appVersionNumber;

        @com.aliyun.core.annotation.NameInMap("BizType")
        private Integer bizType;

        @com.aliyun.core.annotation.NameInMap("BucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private Integer categoryId;

        @com.aliyun.core.annotation.NameInMap("CategoryType")
        private Integer categoryType;

        @com.aliyun.core.annotation.NameInMap("ControlParam")
        private String controlParam;

        @com.aliyun.core.annotation.NameInMap("ExecuteFileAddress")
        private String executeFileAddress;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FilePath")
        private String filePath;

        @com.aliyun.core.annotation.NameInMap("FileSize")
        private Long fileSize;

        @com.aliyun.core.annotation.NameInMap("OptimizeParam")
        private String optimizeParam;

        @com.aliyun.core.annotation.NameInMap("OriginAppType")
        private String originAppType;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("RuntimeEnv")
        private String runtimeEnv;

        @com.aliyun.core.annotation.NameInMap("SilenceFlag")
        private String silenceFlag;

        @com.aliyun.core.annotation.NameInMap("SilenceParam")
        private String silenceParam;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubAppType")
        private String subAppType;

        @com.aliyun.core.annotation.NameInMap("UrlSuffix")
        private String urlSuffix;

        private AdaptorInfoBOList(Builder builder) {
            this.adaptorId = builder.adaptorId;
            this.adaptorMessage = builder.adaptorMessage;
            this.adaptorMode = builder.adaptorMode;
            this.adaptorStep = builder.adaptorStep;
            this.appIconUrl = builder.appIconUrl;
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.appScript = builder.appScript;
            this.appType = builder.appType;
            this.appVersionId = builder.appVersionId;
            this.appVersionName = builder.appVersionName;
            this.appVersionNumber = builder.appVersionNumber;
            this.bizType = builder.bizType;
            this.bucketName = builder.bucketName;
            this.categoryId = builder.categoryId;
            this.categoryType = builder.categoryType;
            this.controlParam = builder.controlParam;
            this.executeFileAddress = builder.executeFileAddress;
            this.fileName = builder.fileName;
            this.filePath = builder.filePath;
            this.fileSize = builder.fileSize;
            this.optimizeParam = builder.optimizeParam;
            this.originAppType = builder.originAppType;
            this.osType = builder.osType;
            this.port = builder.port;
            this.productType = builder.productType;
            this.runtimeEnv = builder.runtimeEnv;
            this.silenceFlag = builder.silenceFlag;
            this.silenceParam = builder.silenceParam;
            this.status = builder.status;
            this.subAppType = builder.subAppType;
            this.urlSuffix = builder.urlSuffix;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdaptorInfoBOList create() {
            return builder().build();
        }

        /**
         * @return adaptorId
         */
        public String getAdaptorId() {
            return this.adaptorId;
        }

        /**
         * @return adaptorMessage
         */
        public String getAdaptorMessage() {
            return this.adaptorMessage;
        }

        /**
         * @return adaptorMode
         */
        public String getAdaptorMode() {
            return this.adaptorMode;
        }

        /**
         * @return adaptorStep
         */
        public String getAdaptorStep() {
            return this.adaptorStep;
        }

        /**
         * @return appIconUrl
         */
        public String getAppIconUrl() {
            return this.appIconUrl;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return appScript
         */
        public String getAppScript() {
            return this.appScript;
        }

        /**
         * @return appType
         */
        public String getAppType() {
            return this.appType;
        }

        /**
         * @return appVersionId
         */
        public String getAppVersionId() {
            return this.appVersionId;
        }

        /**
         * @return appVersionName
         */
        public String getAppVersionName() {
            return this.appVersionName;
        }

        /**
         * @return appVersionNumber
         */
        public String getAppVersionNumber() {
            return this.appVersionNumber;
        }

        /**
         * @return bizType
         */
        public Integer getBizType() {
            return this.bizType;
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return categoryId
         */
        public Integer getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return categoryType
         */
        public Integer getCategoryType() {
            return this.categoryType;
        }

        /**
         * @return controlParam
         */
        public String getControlParam() {
            return this.controlParam;
        }

        /**
         * @return executeFileAddress
         */
        public String getExecuteFileAddress() {
            return this.executeFileAddress;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return filePath
         */
        public String getFilePath() {
            return this.filePath;
        }

        /**
         * @return fileSize
         */
        public Long getFileSize() {
            return this.fileSize;
        }

        /**
         * @return optimizeParam
         */
        public String getOptimizeParam() {
            return this.optimizeParam;
        }

        /**
         * @return originAppType
         */
        public String getOriginAppType() {
            return this.originAppType;
        }

        /**
         * @return osType
         */
        public String getOsType() {
            return this.osType;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return runtimeEnv
         */
        public String getRuntimeEnv() {
            return this.runtimeEnv;
        }

        /**
         * @return silenceFlag
         */
        public String getSilenceFlag() {
            return this.silenceFlag;
        }

        /**
         * @return silenceParam
         */
        public String getSilenceParam() {
            return this.silenceParam;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subAppType
         */
        public String getSubAppType() {
            return this.subAppType;
        }

        /**
         * @return urlSuffix
         */
        public String getUrlSuffix() {
            return this.urlSuffix;
        }

        public static final class Builder {
            private String adaptorId; 
            private String adaptorMessage; 
            private String adaptorMode; 
            private String adaptorStep; 
            private String appIconUrl; 
            private String appId; 
            private String appName; 
            private String appScript; 
            private String appType; 
            private String appVersionId; 
            private String appVersionName; 
            private String appVersionNumber; 
            private Integer bizType; 
            private String bucketName; 
            private Integer categoryId; 
            private Integer categoryType; 
            private String controlParam; 
            private String executeFileAddress; 
            private String fileName; 
            private String filePath; 
            private Long fileSize; 
            private String optimizeParam; 
            private String originAppType; 
            private String osType; 
            private String port; 
            private String productType; 
            private String runtimeEnv; 
            private String silenceFlag; 
            private String silenceParam; 
            private String status; 
            private String subAppType; 
            private String urlSuffix; 

            private Builder() {
            } 

            private Builder(AdaptorInfoBOList model) {
                this.adaptorId = model.adaptorId;
                this.adaptorMessage = model.adaptorMessage;
                this.adaptorMode = model.adaptorMode;
                this.adaptorStep = model.adaptorStep;
                this.appIconUrl = model.appIconUrl;
                this.appId = model.appId;
                this.appName = model.appName;
                this.appScript = model.appScript;
                this.appType = model.appType;
                this.appVersionId = model.appVersionId;
                this.appVersionName = model.appVersionName;
                this.appVersionNumber = model.appVersionNumber;
                this.bizType = model.bizType;
                this.bucketName = model.bucketName;
                this.categoryId = model.categoryId;
                this.categoryType = model.categoryType;
                this.controlParam = model.controlParam;
                this.executeFileAddress = model.executeFileAddress;
                this.fileName = model.fileName;
                this.filePath = model.filePath;
                this.fileSize = model.fileSize;
                this.optimizeParam = model.optimizeParam;
                this.originAppType = model.originAppType;
                this.osType = model.osType;
                this.port = model.port;
                this.productType = model.productType;
                this.runtimeEnv = model.runtimeEnv;
                this.silenceFlag = model.silenceFlag;
                this.silenceParam = model.silenceParam;
                this.status = model.status;
                this.subAppType = model.subAppType;
                this.urlSuffix = model.urlSuffix;
            } 

            /**
             * <p>The adapter ID.</p>
             * 
             * <strong>example:</strong>
             * <p>adt-13ff3****</p>
             */
            public Builder adaptorId(String adaptorId) {
                this.adaptorId = adaptorId;
                return this;
            }

            /**
             * <p>The adaptor message.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder adaptorMessage(String adaptorMessage) {
                this.adaptorMessage = adaptorMessage;
                return this;
            }

            /**
             * <p>The adaptation mode.</p>
             * 
             * <strong>example:</strong>
             * <p>MANUAL</p>
             */
            public Builder adaptorMode(String adaptorMode) {
                this.adaptorMode = adaptorMode;
                return this;
            }

            /**
             * <p>The adaptation phase.</p>
             * 
             * <strong>example:</strong>
             * <p>FINISH_ADAPT</p>
             */
            public Builder adaptorStep(String adaptorStep) {
                this.adaptorStep = adaptorStep;
                return this;
            }

            /**
             * <p>The application icon.</p>
             * 
             * <strong>example:</strong>
             * <p>https://****.jpg</p>
             */
            public Builder appIconUrl(String appIconUrl) {
                this.appIconUrl = appIconUrl;
                return this;
            }

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>app-0aae4rgle910jh689</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>idb-ent-console</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The application script.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;param&quot;:&quot;test&quot;, &quot;startCmd&quot;:&quot;test.exe&quot;}</p>
             */
            public Builder appScript(String appScript) {
                this.appScript = appScript;
                return this;
            }

            /**
             * <p>The application type.</p>
             * 
             * <strong>example:</strong>
             * <p>USER_APP</p>
             */
            public Builder appType(String appType) {
                this.appType = appType;
                return this;
            }

            /**
             * <p>The application version ID.</p>
             * 
             * <strong>example:</strong>
             * <p>apv-****</p>
             */
            public Builder appVersionId(String appVersionId) {
                this.appVersionId = appVersionId;
                return this;
            }

            /**
             * <p>The version name.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder appVersionName(String appVersionName) {
                this.appVersionName = appVersionName;
                return this;
            }

            /**
             * <p>The version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder appVersionNumber(String appVersionNumber) {
                this.appVersionNumber = appVersionNumber;
                return this;
            }

            /**
             * <p>The business line ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder bizType(Integer bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * <p>The name of the OSS bucket where the application files are located.</p>
             * 
             * <strong>example:</strong>
             * <p>xiaowutest-j</p>
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * <p>The level-2 application category, such as design software, office, and browsers. This parameter is not available to the public.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder categoryId(Integer categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * <p>The level-1 application category, such as cloud applications and cloud games. This parameter is not available to the public.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder categoryType(Integer categoryType) {
                this.categoryType = categoryType;
                return this;
            }

            /**
             * <p>The control parameters that can be configured by tenants and administrators. This parameter is not available to the public.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder controlParam(String controlParam) {
                this.controlParam = controlParam;
                return this;
            }

            /**
             * <p>The path of the executable file. This parameter is not available to the public.</p>
             * 
             * <strong>example:</strong>
             * <p>abc.text</p>
             */
            public Builder executeFileAddress(String executeFileAddress) {
                this.executeFileAddress = executeFileAddress;
                return this;
            }

            /**
             * <p>The file name.</p>
             * 
             * <strong>example:</strong>
             * <p>filename_install.exe</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The file path.</p>
             * 
             * <strong>example:</strong>
             * <p>/tenant/123</p>
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
                return this;
            }

            /**
             * <p>The file size. Unit: KB.</p>
             * 
             * <strong>example:</strong>
             * <p>102400</p>
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * <p>The optimization parameters configured in the backend by administrators.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder optimizeParam(String optimizeParam) {
                this.optimizeParam = optimizeParam;
                return this;
            }

            /**
             * <p>The original application type.</p>
             * 
             * <strong>example:</strong>
             * <p>CLIENT_BASE</p>
             */
            public Builder originAppType(String originAppType) {
                this.originAppType = originAppType;
                return this;
            }

            /**
             * <p>The operating system type applicable to the application.</p>
             * 
             * <strong>example:</strong>
             * <p>Windows</p>
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * <p>The application service port. For applications that require port-based access, specify the actual port number that the application listens on.</p>
             * 
             * <strong>example:</strong>
             * <p>9000</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The product type of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>CloudDesktop</p>
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * <p>The runtime environment.</p>
             * 
             * <strong>example:</strong>
             * <p>WINDOWS_MULTI_SESSION</p>
             */
            public Builder runtimeEnv(String runtimeEnv) {
                this.runtimeEnv = runtimeEnv;
                return this;
            }

            /**
             * <p>Specifies whether silent installation is enabled. This parameter can be configured by tenants and administrators, but is not available to the public.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder silenceFlag(String silenceFlag) {
                this.silenceFlag = silenceFlag;
                return this;
            }

            /**
             * <p>The silent installation parameters. This parameter is not available to the public.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder silenceParam(String silenceParam) {
                this.silenceParam = silenceParam;
                return this;
            }

            /**
             * <p>The application adaptation status. For example, ADAPT_DONE indicates that the adaptation is completed.</p>
             * 
             * <strong>example:</strong>
             * <p>ADAPT_DONE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The sub-application type.</p>
             * 
             * <strong>example:</strong>
             * <p>SAAS</p>
             */
            public Builder subAppType(String subAppType) {
                this.subAppType = subAppType;
                return this;
            }

            /**
             * <p>The URL path suffix for application access. This suffix and the application service port together describe the access entry point.</p>
             * 
             * <strong>example:</strong>
             * <p>/index</p>
             */
            public Builder urlSuffix(String urlSuffix) {
                this.urlSuffix = urlSuffix;
                return this;
            }

            public AdaptorInfoBOList build() {
                return new AdaptorInfoBOList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEffectiveImageByIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetEffectiveImageByIdResponseBody</p>
     */
    public static class AppList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        private AppList(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppList create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 

            private Builder() {
            } 

            private Builder(AppList model) {
                this.appId = model.appId;
                this.appName = model.appName;
            } 

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>app-0aae4rxw78****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>idb-ent-console</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            public AppList build() {
                return new AppList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEffectiveImageByIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetEffectiveImageByIdResponseBody</p>
     */
    public static class ImageExtendInfoModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataDiskSize")
        private Integer dataDiskSize;

        @com.aliyun.core.annotation.NameInMap("GpuCategory")
        private Integer gpuCategory;

        @com.aliyun.core.annotation.NameInMap("GpuDriverVersion")
        private String gpuDriverVersion;

        @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
        private Integer systemDiskSize;

        private ImageExtendInfoModel(Builder builder) {
            this.dataDiskSize = builder.dataDiskSize;
            this.gpuCategory = builder.gpuCategory;
            this.gpuDriverVersion = builder.gpuDriverVersion;
            this.systemDiskSize = builder.systemDiskSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageExtendInfoModel create() {
            return builder().build();
        }

        /**
         * @return dataDiskSize
         */
        public Integer getDataDiskSize() {
            return this.dataDiskSize;
        }

        /**
         * @return gpuCategory
         */
        public Integer getGpuCategory() {
            return this.gpuCategory;
        }

        /**
         * @return gpuDriverVersion
         */
        public String getGpuDriverVersion() {
            return this.gpuDriverVersion;
        }

        /**
         * @return systemDiskSize
         */
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public static final class Builder {
            private Integer dataDiskSize; 
            private Integer gpuCategory; 
            private String gpuDriverVersion; 
            private Integer systemDiskSize; 

            private Builder() {
            } 

            private Builder(ImageExtendInfoModel model) {
                this.dataDiskSize = model.dataDiskSize;
                this.gpuCategory = model.gpuCategory;
                this.gpuDriverVersion = model.gpuDriverVersion;
                this.systemDiskSize = model.systemDiskSize;
            } 

            /**
             * <p>The size of the data cloud disk. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder dataDiskSize(Integer dataDiskSize) {
                this.dataDiskSize = dataDiskSize;
                return this;
            }

            /**
             * <p>The GPU category.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder gpuCategory(Integer gpuCategory) {
                this.gpuCategory = gpuCategory;
                return this;
            }

            /**
             * <p>The GPU driver version.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder gpuDriverVersion(String gpuDriverVersion) {
                this.gpuDriverVersion = gpuDriverVersion;
                return this;
            }

            /**
             * <p>The size of the system cloud disk. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            public ImageExtendInfoModel build() {
                return new ImageExtendInfoModel(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEffectiveImageByIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetEffectiveImageByIdResponseBody</p>
     */
    public static class ImageRegionDistribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UnitImageId")
        private String unitImageId;

        private ImageRegionDistribute(Builder builder) {
            this.message = builder.message;
            this.progress = builder.progress;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.unitImageId = builder.unitImageId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageRegionDistribute create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return unitImageId
         */
        public String getUnitImageId() {
            return this.unitImageId;
        }

        public static final class Builder {
            private String message; 
            private String progress; 
            private String regionId; 
            private String status; 
            private String unitImageId; 

            private Builder() {
            } 

            private Builder(ImageRegionDistribute model) {
                this.message = model.message;
                this.progress = model.progress;
                this.regionId = model.regionId;
                this.status = model.status;
                this.unitImageId = model.unitImageId;
            } 

            /**
             * <p>The processing information reported by the region distribution task.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The distribution progress of the image in the region, expressed as a percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The ID of the region where the image is distributed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The region distribution status. Valid values: CREATING: distributing. AVAILABLE: available. CREATE_FAILED: distribution failed. DELETE: deleted.</p>
             * 
             * <strong>example:</strong>
             * <p>AVAILABLE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The logical ID of the image on the unit side, which can be different from the central image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>m-1bdedef****</p>
             */
            public Builder unitImageId(String unitImageId) {
                this.unitImageId = unitImageId;
                return this;
            }

            public ImageRegionDistribute build() {
                return new ImageRegionDistribute(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEffectiveImageByIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetEffectiveImageByIdResponseBody</p>
     */
    public static class ImageInfoRegionModelList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdaptorInfoBOList")
        private java.util.List<AdaptorInfoBOList> adaptorInfoBOList;

        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("AppList")
        private java.util.List<AppList> appList;

        @com.aliyun.core.annotation.NameInMap("BaseImageId")
        private String baseImageId;

        @com.aliyun.core.annotation.NameInMap("BaseImageVersion")
        private String baseImageVersion;

        @com.aliyun.core.annotation.NameInMap("BizType")
        private Integer bizType;

        @com.aliyun.core.annotation.NameInMap("BucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FeatureList")
        private java.util.List<String> featureList;

        @com.aliyun.core.annotation.NameInMap("FotaVersion")
        private String fotaVersion;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("ImageCreateMode")
        private String imageCreateMode;

        @com.aliyun.core.annotation.NameInMap("ImageExtendInfoModel")
        private ImageExtendInfoModel imageExtendInfoModel;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("ImageRegionDistribute")
        private ImageRegionDistribute imageRegionDistribute;

        @com.aliyun.core.annotation.NameInMap("ImageSource")
        private String imageSource;

        @com.aliyun.core.annotation.NameInMap("ImageType")
        private String imageType;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("LatestVersionId")
        private String latestVersionId;

        @com.aliyun.core.annotation.NameInMap("OnlineVersion")
        private Boolean onlineVersion;

        @com.aliyun.core.annotation.NameInMap("OnlineVersionId")
        private String onlineVersionId;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("PackageType")
        private String packageType;

        @com.aliyun.core.annotation.NameInMap("ParentImageId")
        private String parentImageId;

        @com.aliyun.core.annotation.NameInMap("ParentImageVersion")
        private String parentImageVersion;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private Integer platform;

        @com.aliyun.core.annotation.NameInMap("PlatformName")
        private String platformName;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("PropertyMap")
        private java.util.Map<String, String> propertyMap;

        @com.aliyun.core.annotation.NameInMap("ProtocolType")
        private String protocolType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VersionId")
        private String versionId;

        private ImageInfoRegionModelList(Builder builder) {
            this.adaptorInfoBOList = builder.adaptorInfoBOList;
            this.aliUid = builder.aliUid;
            this.appList = builder.appList;
            this.baseImageId = builder.baseImageId;
            this.baseImageVersion = builder.baseImageVersion;
            this.bizType = builder.bizType;
            this.bucketName = builder.bucketName;
            this.description = builder.description;
            this.featureList = builder.featureList;
            this.fotaVersion = builder.fotaVersion;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.imageCreateMode = builder.imageCreateMode;
            this.imageExtendInfoModel = builder.imageExtendInfoModel;
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
            this.imageRegionDistribute = builder.imageRegionDistribute;
            this.imageSource = builder.imageSource;
            this.imageType = builder.imageType;
            this.language = builder.language;
            this.latestVersionId = builder.latestVersionId;
            this.onlineVersion = builder.onlineVersion;
            this.onlineVersionId = builder.onlineVersionId;
            this.osType = builder.osType;
            this.packageType = builder.packageType;
            this.parentImageId = builder.parentImageId;
            this.parentImageVersion = builder.parentImageVersion;
            this.platform = builder.platform;
            this.platformName = builder.platformName;
            this.productType = builder.productType;
            this.propertyMap = builder.propertyMap;
            this.protocolType = builder.protocolType;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.versionId = builder.versionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageInfoRegionModelList create() {
            return builder().build();
        }

        /**
         * @return adaptorInfoBOList
         */
        public java.util.List<AdaptorInfoBOList> getAdaptorInfoBOList() {
            return this.adaptorInfoBOList;
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return appList
         */
        public java.util.List<AppList> getAppList() {
            return this.appList;
        }

        /**
         * @return baseImageId
         */
        public String getBaseImageId() {
            return this.baseImageId;
        }

        /**
         * @return baseImageVersion
         */
        public String getBaseImageVersion() {
            return this.baseImageVersion;
        }

        /**
         * @return bizType
         */
        public Integer getBizType() {
            return this.bizType;
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return featureList
         */
        public java.util.List<String> getFeatureList() {
            return this.featureList;
        }

        /**
         * @return fotaVersion
         */
        public String getFotaVersion() {
            return this.fotaVersion;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return imageCreateMode
         */
        public String getImageCreateMode() {
            return this.imageCreateMode;
        }

        /**
         * @return imageExtendInfoModel
         */
        public ImageExtendInfoModel getImageExtendInfoModel() {
            return this.imageExtendInfoModel;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return imageName
         */
        public String getImageName() {
            return this.imageName;
        }

        /**
         * @return imageRegionDistribute
         */
        public ImageRegionDistribute getImageRegionDistribute() {
            return this.imageRegionDistribute;
        }

        /**
         * @return imageSource
         */
        public String getImageSource() {
            return this.imageSource;
        }

        /**
         * @return imageType
         */
        public String getImageType() {
            return this.imageType;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return latestVersionId
         */
        public String getLatestVersionId() {
            return this.latestVersionId;
        }

        /**
         * @return onlineVersion
         */
        public Boolean getOnlineVersion() {
            return this.onlineVersion;
        }

        /**
         * @return onlineVersionId
         */
        public String getOnlineVersionId() {
            return this.onlineVersionId;
        }

        /**
         * @return osType
         */
        public String getOsType() {
            return this.osType;
        }

        /**
         * @return packageType
         */
        public String getPackageType() {
            return this.packageType;
        }

        /**
         * @return parentImageId
         */
        public String getParentImageId() {
            return this.parentImageId;
        }

        /**
         * @return parentImageVersion
         */
        public String getParentImageVersion() {
            return this.parentImageVersion;
        }

        /**
         * @return platform
         */
        public Integer getPlatform() {
            return this.platform;
        }

        /**
         * @return platformName
         */
        public String getPlatformName() {
            return this.platformName;
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return propertyMap
         */
        public java.util.Map<String, String> getPropertyMap() {
            return this.propertyMap;
        }

        /**
         * @return protocolType
         */
        public String getProtocolType() {
            return this.protocolType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return versionId
         */
        public String getVersionId() {
            return this.versionId;
        }

        public static final class Builder {
            private java.util.List<AdaptorInfoBOList> adaptorInfoBOList; 
            private Long aliUid; 
            private java.util.List<AppList> appList; 
            private String baseImageId; 
            private String baseImageVersion; 
            private Integer bizType; 
            private String bucketName; 
            private String description; 
            private java.util.List<String> featureList; 
            private String fotaVersion; 
            private String gmtCreate; 
            private String gmtModified; 
            private String imageCreateMode; 
            private ImageExtendInfoModel imageExtendInfoModel; 
            private String imageId; 
            private String imageName; 
            private ImageRegionDistribute imageRegionDistribute; 
            private String imageSource; 
            private String imageType; 
            private String language; 
            private String latestVersionId; 
            private Boolean onlineVersion; 
            private String onlineVersionId; 
            private String osType; 
            private String packageType; 
            private String parentImageId; 
            private String parentImageVersion; 
            private Integer platform; 
            private String platformName; 
            private String productType; 
            private java.util.Map<String, String> propertyMap; 
            private String protocolType; 
            private String regionId; 
            private String status; 
            private String versionId; 

            private Builder() {
            } 

            private Builder(ImageInfoRegionModelList model) {
                this.adaptorInfoBOList = model.adaptorInfoBOList;
                this.aliUid = model.aliUid;
                this.appList = model.appList;
                this.baseImageId = model.baseImageId;
                this.baseImageVersion = model.baseImageVersion;
                this.bizType = model.bizType;
                this.bucketName = model.bucketName;
                this.description = model.description;
                this.featureList = model.featureList;
                this.fotaVersion = model.fotaVersion;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.imageCreateMode = model.imageCreateMode;
                this.imageExtendInfoModel = model.imageExtendInfoModel;
                this.imageId = model.imageId;
                this.imageName = model.imageName;
                this.imageRegionDistribute = model.imageRegionDistribute;
                this.imageSource = model.imageSource;
                this.imageType = model.imageType;
                this.language = model.language;
                this.latestVersionId = model.latestVersionId;
                this.onlineVersion = model.onlineVersion;
                this.onlineVersionId = model.onlineVersionId;
                this.osType = model.osType;
                this.packageType = model.packageType;
                this.parentImageId = model.parentImageId;
                this.parentImageVersion = model.parentImageVersion;
                this.platform = model.platform;
                this.platformName = model.platformName;
                this.productType = model.productType;
                this.propertyMap = model.propertyMap;
                this.protocolType = model.protocolType;
                this.regionId = model.regionId;
                this.status = model.status;
                this.versionId = model.versionId;
            } 

            /**
             * <p>The list of adapted applications for the image version.</p>
             */
            public Builder adaptorInfoBOList(java.util.List<AdaptorInfoBOList> adaptorInfoBOList) {
                this.adaptorInfoBOList = adaptorInfoBOList;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the image belongs. The account ID for a system image is 0.</p>
             * 
             * <strong>example:</strong>
             * <p>13605346******</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The application list, which displays only the application names and IDs.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder appList(java.util.List<AppList> appList) {
                this.appList = appList;
                return this;
            }

            /**
             * <p>The base image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>imgc-dewgefwc******</p>
             */
            public Builder baseImageId(String baseImageId) {
                this.baseImageId = baseImageId;
                return this;
            }

            /**
             * <p>The base image version ID.</p>
             * 
             * <strong>example:</strong>
             * <p>iv-adbef134****</p>
             */
            public Builder baseImageVersion(String baseImageVersion) {
                this.baseImageVersion = baseImageVersion;
                return this;
            }

            /**
             * <p>The business line to which the image belongs. 1: basic business. 2: Personal Edition. 3: Cloud Office. 4: Cloud Streaming. 10: Standard Edition.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder bizType(Integer bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * <p>The name of the OSS bucket where the image file is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>monitor-record-sh-twg2is</p>
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * <p>The image description.</p>
             * 
             * <strong>example:</strong>
             * <p>this is test image</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The list of feature tags supported by the image.</p>
             */
            public Builder featureList(java.util.List<String> featureList) {
                this.featureList = featureList;
                return this;
            }

            /**
             * <p>The FOTA version.</p>
             * 
             * <strong>example:</strong>
             * <p>3.0.11-R-20260624.195825</p>
             */
            public Builder fotaVersion(String fotaVersion) {
                this.fotaVersion = fotaVersion;
                return this;
            }

            /**
             * <p>The creation time. The time is in RFC 3339 format. The Z in the example indicates the UTC time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-09-12T13:01:09Z</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The last update time. The time is in RFC 3339 format. The Z in the example indicates the UTC time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-07-16T07:39:43Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The image creation method. For example, BUILDER_MANUAL indicates manual creation.</p>
             * 
             * <strong>example:</strong>
             * <p>BUILDER_MANUAL</p>
             */
            public Builder imageCreateMode(String imageCreateMode) {
                this.imageCreateMode = imageCreateMode;
                return this;
            }

            /**
             * <p>The image extended information, including disk specifications and GPU driver information. VHD or Container images use the extended information of their base image and base version.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder imageExtendInfoModel(ImageExtendInfoModel imageExtendInfoModel) {
                this.imageExtendInfoModel = imageExtendInfoModel;
                return this;
            }

            /**
             * <p>The image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>imgc-0aae4rgk5yaa*****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The image name.</p>
             * 
             * <strong>example:</strong>
             * <p>image0625</p>
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * <p>The image distribution information for the current region.</p>
             */
            public Builder imageRegionDistribute(ImageRegionDistribute imageRegionDistribute) {
                this.imageRegionDistribute = imageRegionDistribute;
                return this;
            }

            /**
             * <p>The image source. For example, center indicates the central image service.</p>
             * 
             * <strong>example:</strong>
             * <p>center</p>
             */
            public Builder imageSource(String imageSource) {
                this.imageSource = imageSource;
                return this;
            }

            /**
             * <p>The image type. Valid values:</p>
             * <ul>
             * <li>System: system images.</li>
             * <li>User: custom images.</li>
             * <li>Shared: shared images.</li>
             * <li>Community: community images.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>System</p>
             */
            public Builder imageType(String imageType) {
                this.imageType = imageType;
                return this;
            }

            /**
             * <p>The image language.</p>
             * 
             * <strong>example:</strong>
             * <p>zh-CN</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * <p>The ID of the latest version of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>iv-1wder3ere****</p>
             */
            public Builder latestVersionId(String latestVersionId) {
                this.latestVersionId = latestVersionId;
                return this;
            }

            /**
             * <p>Indicates whether the returned version is the online version. Valid values: true: Yes. false: No.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder onlineVersion(Boolean onlineVersion) {
                this.onlineVersion = onlineVersion;
                return this;
            }

            /**
             * <p>The ID of the current online version of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>iv-1wder3ere****</p>
             */
            public Builder onlineVersionId(String onlineVersionId) {
                this.onlineVersionId = onlineVersionId;
                return this;
            }

            /**
             * <p>The operating system type of the image. Windows: Windows system. Linux: Linux system. Android: Android system. Unknown: unknown system.</p>
             * 
             * <strong>example:</strong>
             * <p>Windows</p>
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * <p>The image packaging type. Ecs: ECS image. Vhd: virtual disk image. Container: container image. Ecs_Container: combined ECS and container image. K8s_Node: Kubernetes node image.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS</p>
             */
            public Builder packageType(String packageType) {
                this.packageType = packageType;
                return this;
            }

            /**
             * <p>The parent image ID, which indicates the image inheritance relationship. System images do not have parent images.</p>
             * 
             * <strong>example:</strong>
             * <p>desktopimage-windows-11-64-asp</p>
             */
            public Builder parentImageId(String parentImageId) {
                this.parentImageId = parentImageId;
                return this;
            }

            /**
             * <p>The parent image version ID.</p>
             * 
             * <strong>example:</strong>
             * <p>iv-12ededgjj***</p>
             */
            public Builder parentImageVersion(String parentImageVersion) {
                this.parentImageVersion = parentImageVersion;
                return this;
            }

            /**
             * <p>The operating system platform ID. For example, 33 indicates Windows Server 2022.</p>
             * 
             * <strong>example:</strong>
             * <p>33</p>
             */
            public Builder platform(Integer platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>The operating system platform name, which corresponds to Platform.</p>
             * 
             * <strong>example:</strong>
             * <p>Windows Server 2022</p>
             */
            public Builder platformName(String platformName) {
                this.platformName = platformName;
                return this;
            }

            /**
             * <p>The product type to which the image belongs, such as CloudDesktop (Cloud Desktop), CloudApp (Cloud App), and WuyingServer (WUYING Workspace Enterprise Edition workstation).</p>
             * 
             * <strong>example:</strong>
             * <p>CloudApp</p>
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * <p>The extended properties of the image version in key-value pairs.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder propertyMap(java.util.Map<String, String> propertyMap) {
                this.propertyMap = propertyMap;
                return this;
            }

            /**
             * <p>The connection protocol used by the image. ASP: Alibaba Cloud Streaming Protocol. HDX: HDX protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>ASP</p>
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * <p>The ID of the region to which the image information belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The image status. INIT: initializing. CREATING: creating. AVAILABLE: available. CREATE_FAILED: creation failed. DELETE: deleted.</p>
             * 
             * <strong>example:</strong>
             * <p>INIT</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The image version ID.</p>
             * 
             * <strong>example:</strong>
             * <p>iv-xxx</p>
             */
            public Builder versionId(String versionId) {
                this.versionId = versionId;
                return this;
            }

            public ImageInfoRegionModelList build() {
                return new ImageInfoRegionModelList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEffectiveImageByIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetEffectiveImageByIdResponseBody</p>
     */
    public static class TagList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private TagList(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagList create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(TagList model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>env</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>inner</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TagList build() {
                return new TagList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEffectiveImageByIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetEffectiveImageByIdResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("BizType")
        private Integer bizType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Document")
        private String document;

        @com.aliyun.core.annotation.NameInMap("EnvironmentId")
        private String environmentId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("ImageIconUrl")
        private String imageIconUrl;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageInfoRegionModelList")
        private java.util.List<ImageInfoRegionModelList> imageInfoRegionModelList;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("ImageRegionList")
        private java.util.List<String> imageRegionList;

        @com.aliyun.core.annotation.NameInMap("ImageType")
        private String imageType;

        @com.aliyun.core.annotation.NameInMap("LatestVersionId")
        private String latestVersionId;

        @com.aliyun.core.annotation.NameInMap("OnlineVersionDataDiskSize")
        private Integer onlineVersionDataDiskSize;

        @com.aliyun.core.annotation.NameInMap("OnlineVersionId")
        private String onlineVersionId;

        @com.aliyun.core.annotation.NameInMap("OnlineVersionSystemDiskSize")
        private Integer onlineVersionSystemDiskSize;

        @com.aliyun.core.annotation.NameInMap("OnlineVersionVolumeEncryptionEnabled")
        private Boolean onlineVersionVolumeEncryptionEnabled;

        @com.aliyun.core.annotation.NameInMap("OnlineVersionVolumeEncryptionKey")
        private String onlineVersionVolumeEncryptionKey;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("PackageType")
        private String packageType;

        @com.aliyun.core.annotation.NameInMap("ParentImageId")
        private String parentImageId;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("ProtocolType")
        private String protocolType;

        @com.aliyun.core.annotation.NameInMap("Rating")
        private Integer rating;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TagList")
        private java.util.List<TagList> tagList;

        @com.aliyun.core.annotation.NameInMap("VersionId")
        private String versionId;

        private Data(Builder builder) {
            this.aliUid = builder.aliUid;
            this.bizType = builder.bizType;
            this.description = builder.description;
            this.document = builder.document;
            this.environmentId = builder.environmentId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.imageIconUrl = builder.imageIconUrl;
            this.imageId = builder.imageId;
            this.imageInfoRegionModelList = builder.imageInfoRegionModelList;
            this.imageName = builder.imageName;
            this.imageRegionList = builder.imageRegionList;
            this.imageType = builder.imageType;
            this.latestVersionId = builder.latestVersionId;
            this.onlineVersionDataDiskSize = builder.onlineVersionDataDiskSize;
            this.onlineVersionId = builder.onlineVersionId;
            this.onlineVersionSystemDiskSize = builder.onlineVersionSystemDiskSize;
            this.onlineVersionVolumeEncryptionEnabled = builder.onlineVersionVolumeEncryptionEnabled;
            this.onlineVersionVolumeEncryptionKey = builder.onlineVersionVolumeEncryptionKey;
            this.osType = builder.osType;
            this.packageType = builder.packageType;
            this.parentImageId = builder.parentImageId;
            this.productType = builder.productType;
            this.protocolType = builder.protocolType;
            this.rating = builder.rating;
            this.status = builder.status;
            this.tagList = builder.tagList;
            this.versionId = builder.versionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return bizType
         */
        public Integer getBizType() {
            return this.bizType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return document
         */
        public String getDocument() {
            return this.document;
        }

        /**
         * @return environmentId
         */
        public String getEnvironmentId() {
            return this.environmentId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return imageIconUrl
         */
        public String getImageIconUrl() {
            return this.imageIconUrl;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return imageInfoRegionModelList
         */
        public java.util.List<ImageInfoRegionModelList> getImageInfoRegionModelList() {
            return this.imageInfoRegionModelList;
        }

        /**
         * @return imageName
         */
        public String getImageName() {
            return this.imageName;
        }

        /**
         * @return imageRegionList
         */
        public java.util.List<String> getImageRegionList() {
            return this.imageRegionList;
        }

        /**
         * @return imageType
         */
        public String getImageType() {
            return this.imageType;
        }

        /**
         * @return latestVersionId
         */
        public String getLatestVersionId() {
            return this.latestVersionId;
        }

        /**
         * @return onlineVersionDataDiskSize
         */
        public Integer getOnlineVersionDataDiskSize() {
            return this.onlineVersionDataDiskSize;
        }

        /**
         * @return onlineVersionId
         */
        public String getOnlineVersionId() {
            return this.onlineVersionId;
        }

        /**
         * @return onlineVersionSystemDiskSize
         */
        public Integer getOnlineVersionSystemDiskSize() {
            return this.onlineVersionSystemDiskSize;
        }

        /**
         * @return onlineVersionVolumeEncryptionEnabled
         */
        public Boolean getOnlineVersionVolumeEncryptionEnabled() {
            return this.onlineVersionVolumeEncryptionEnabled;
        }

        /**
         * @return onlineVersionVolumeEncryptionKey
         */
        public String getOnlineVersionVolumeEncryptionKey() {
            return this.onlineVersionVolumeEncryptionKey;
        }

        /**
         * @return osType
         */
        public String getOsType() {
            return this.osType;
        }

        /**
         * @return packageType
         */
        public String getPackageType() {
            return this.packageType;
        }

        /**
         * @return parentImageId
         */
        public String getParentImageId() {
            return this.parentImageId;
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return protocolType
         */
        public String getProtocolType() {
            return this.protocolType;
        }

        /**
         * @return rating
         */
        public Integer getRating() {
            return this.rating;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tagList
         */
        public java.util.List<TagList> getTagList() {
            return this.tagList;
        }

        /**
         * @return versionId
         */
        public String getVersionId() {
            return this.versionId;
        }

        public static final class Builder {
            private Long aliUid; 
            private Integer bizType; 
            private String description; 
            private String document; 
            private String environmentId; 
            private String gmtCreate; 
            private String gmtModified; 
            private String imageIconUrl; 
            private String imageId; 
            private java.util.List<ImageInfoRegionModelList> imageInfoRegionModelList; 
            private String imageName; 
            private java.util.List<String> imageRegionList; 
            private String imageType; 
            private String latestVersionId; 
            private Integer onlineVersionDataDiskSize; 
            private String onlineVersionId; 
            private Integer onlineVersionSystemDiskSize; 
            private Boolean onlineVersionVolumeEncryptionEnabled; 
            private String onlineVersionVolumeEncryptionKey; 
            private String osType; 
            private String packageType; 
            private String parentImageId; 
            private String productType; 
            private String protocolType; 
            private Integer rating; 
            private String status; 
            private java.util.List<TagList> tagList; 
            private String versionId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.aliUid = model.aliUid;
                this.bizType = model.bizType;
                this.description = model.description;
                this.document = model.document;
                this.environmentId = model.environmentId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.imageIconUrl = model.imageIconUrl;
                this.imageId = model.imageId;
                this.imageInfoRegionModelList = model.imageInfoRegionModelList;
                this.imageName = model.imageName;
                this.imageRegionList = model.imageRegionList;
                this.imageType = model.imageType;
                this.latestVersionId = model.latestVersionId;
                this.onlineVersionDataDiskSize = model.onlineVersionDataDiskSize;
                this.onlineVersionId = model.onlineVersionId;
                this.onlineVersionSystemDiskSize = model.onlineVersionSystemDiskSize;
                this.onlineVersionVolumeEncryptionEnabled = model.onlineVersionVolumeEncryptionEnabled;
                this.onlineVersionVolumeEncryptionKey = model.onlineVersionVolumeEncryptionKey;
                this.osType = model.osType;
                this.packageType = model.packageType;
                this.parentImageId = model.parentImageId;
                this.productType = model.productType;
                this.protocolType = model.protocolType;
                this.rating = model.rating;
                this.status = model.status;
                this.tagList = model.tagList;
                this.versionId = model.versionId;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account to which the image belongs. The account ID for a system image is 0.</p>
             * 
             * <strong>example:</strong>
             * <p>100931896542****</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The business line to which the image belongs. 1: basic business. 2: Personal Edition. 3: Cloud Office. 4: Cloud Streaming. 10: Standard Edition.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder bizType(Integer bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * <p>The image description.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The description document of the image in Markdown format.</p>
             * 
             * <strong>example:</strong>
             * <h2>this is a test document</h2>
             */
            public Builder document(String document) {
                this.document = document;
                return this;
            }

            /**
             * <p>The environment ID.</p>
             * 
             * <strong>example:</strong>
             * <p>eid-***</p>
             */
            public Builder environmentId(String environmentId) {
                this.environmentId = environmentId;
                return this;
            }

            /**
             * <p>The creation time. The time is in RFC 3339 format. The Z in the example indicates the UTC time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-03-10T01:33:37Z</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The last update time. The time is in RFC 3339 format. The Z in the example indicates the UTC time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-12-11T02:19:27Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The URL of the image icon.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxx.jpg">https://xxx.jpg</a></p>
             */
            public Builder imageIconUrl(String imageIconUrl) {
                this.imageIconUrl = imageIconUrl;
                return this;
            }

            /**
             * <p>The image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>img-bp1234567890abcde</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The details of the image versions that actually take effect in each region. For the same region, the configured newer version takes precedence.</p>
             */
            public Builder imageInfoRegionModelList(java.util.List<ImageInfoRegionModelList> imageInfoRegionModelList) {
                this.imageInfoRegionModelList = imageInfoRegionModelList;
                return this;
            }

            /**
             * <p>The image name.</p>
             * 
             * <strong>example:</strong>
             * <p>DemoImage</p>
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * <p>The list of region IDs supported by the image.</p>
             */
            public Builder imageRegionList(java.util.List<String> imageRegionList) {
                this.imageRegionList = imageRegionList;
                return this;
            }

            /**
             * <p>The image type. Valid values:</p>
             * <ul>
             * <li>System: system images.</li>
             * <li>User: custom images.</li>
             * <li>Shared: shared images.</li>
             * <li>Community: community images.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>User</p>
             */
            public Builder imageType(String imageType) {
                this.imageType = imageType;
                return this;
            }

            /**
             * <p>The ID of the latest version of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>iv-xxx</p>
             */
            public Builder latestVersionId(String latestVersionId) {
                this.latestVersionId = latestVersionId;
                return this;
            }

            /**
             * <p>The data cloud disk size of the online version. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder onlineVersionDataDiskSize(Integer onlineVersionDataDiskSize) {
                this.onlineVersionDataDiskSize = onlineVersionDataDiskSize;
                return this;
            }

            /**
             * <p>The ID of the current online version of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>iv-xxxx</p>
             */
            public Builder onlineVersionId(String onlineVersionId) {
                this.onlineVersionId = onlineVersionId;
                return this;
            }

            /**
             * <p>The system cloud disk size of the online version. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder onlineVersionSystemDiskSize(Integer onlineVersionSystemDiskSize) {
                this.onlineVersionSystemDiskSize = onlineVersionSystemDiskSize;
                return this;
            }

            /**
             * <p>Indicates whether disk encryption is enabled for the online version. Valid values: true: Enabled. false: Disabled.</p>
             */
            public Builder onlineVersionVolumeEncryptionEnabled(Boolean onlineVersionVolumeEncryptionEnabled) {
                this.onlineVersionVolumeEncryptionEnabled = onlineVersionVolumeEncryptionEnabled;
                return this;
            }

            /**
             * <p>The KMS key ID used when disk encryption is enabled for the online version.</p>
             * 
             * <strong>example:</strong>
             * <p>a7b3c0c8-xxxx</p>
             */
            public Builder onlineVersionVolumeEncryptionKey(String onlineVersionVolumeEncryptionKey) {
                this.onlineVersionVolumeEncryptionKey = onlineVersionVolumeEncryptionKey;
                return this;
            }

            /**
             * <p>The operating system type of the image. Windows: Windows system. Linux: Linux system. Android: Android system. Unknown: unknown system.</p>
             * 
             * <strong>example:</strong>
             * <p>Windows</p>
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * <p>The image packaging type. Ecs: ECS image. Vhd: virtual disk image. Container: container image. Ecs_Container: combined ECS and container image. K8s_Node: Kubernetes node image.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS</p>
             */
            public Builder packageType(String packageType) {
                this.packageType = packageType;
                return this;
            }

            /**
             * <p>The parent image ID, which indicates the image inheritance relationship. System images do not have parent images.</p>
             * 
             * <strong>example:</strong>
             * <p>imgc-xxx</p>
             */
            public Builder parentImageId(String parentImageId) {
                this.parentImageId = parentImageId;
                return this;
            }

            /**
             * <p>The product type to which the image belongs, such as CloudDesktop (Cloud Desktop), CloudApp (Cloud App), and WuyingServer (WUYING Workspace Enterprise Edition workstation).</p>
             * 
             * <strong>example:</strong>
             * <p>WuyingServer</p>
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * <p>The connection protocol used by the image. ASP: Alibaba Cloud Streaming Protocol. HDX: HDX protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>ASP</p>
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * <p>The rating score of the image, with a maximum score of 100.</p>
             * 
             * <strong>example:</strong>
             * <p>95</p>
             */
            public Builder rating(Integer rating) {
                this.rating = rating;
                return this;
            }

            /**
             * <p>The image status. INIT: initializing. CREATING: creating. AVAILABLE: available. CREATE_FAILED: creation failed. DELETE: deleted.</p>
             * 
             * <strong>example:</strong>
             * <p>INIT</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The list of image tags.</p>
             */
            public Builder tagList(java.util.List<TagList> tagList) {
                this.tagList = tagList;
                return this;
            }

            /**
             * <p>The image version ID.</p>
             * 
             * <strong>example:</strong>
             * <p>iv-agde4****</p>
             */
            public Builder versionId(String versionId) {
                this.versionId = versionId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
