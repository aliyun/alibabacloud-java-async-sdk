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
 * {@link GetImageByIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetImageByIdResponseBody</p>
 */
public class GetImageByIdResponseBody extends TeaModel {
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

    private GetImageByIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImageByIdResponseBody create() {
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

        private Builder(GetImageByIdResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code. 200 indicates success. If the call fails, the corresponding error code is returned.</p>
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
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message returned by the API.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate and troubleshoot the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8737D130-BFD0-5D51-96F6-C08EB1139A25</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the API call is successful. Valid values:</p>
         * <ul>
         * <li>true: Successful.</li>
         * <li>false: Failed.</li>
         * </ul>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetImageByIdResponseBody build() {
            return new GetImageByIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetImageByIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageByIdResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("Aid")
        private Long aid;

        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("AppIconUrl")
        private String appIconUrl;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AppScript")
        private String appScript;

        @com.aliyun.core.annotation.NameInMap("AppThemeColor")
        private String appThemeColor;

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

        @com.aliyun.core.annotation.NameInMap("DiskId")
        private String diskId;

        @com.aliyun.core.annotation.NameInMap("ExecuteFileAddress")
        private String executeFileAddress;

        @com.aliyun.core.annotation.NameInMap("Extend")
        private String extend;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FilePath")
        private String filePath;

        @com.aliyun.core.annotation.NameInMap("FileSize")
        private Long fileSize;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("OptimizeParam")
        private String optimizeParam;

        @com.aliyun.core.annotation.NameInMap("OriginAppType")
        private String originAppType;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

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

        private AdaptorInfoBOList(Builder builder) {
            this.adaptorId = builder.adaptorId;
            this.adaptorMessage = builder.adaptorMessage;
            this.adaptorMode = builder.adaptorMode;
            this.adaptorStep = builder.adaptorStep;
            this.aid = builder.aid;
            this.aliUid = builder.aliUid;
            this.appIconUrl = builder.appIconUrl;
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.appScript = builder.appScript;
            this.appThemeColor = builder.appThemeColor;
            this.appType = builder.appType;
            this.appVersionId = builder.appVersionId;
            this.appVersionName = builder.appVersionName;
            this.appVersionNumber = builder.appVersionNumber;
            this.bizType = builder.bizType;
            this.bucketName = builder.bucketName;
            this.categoryId = builder.categoryId;
            this.categoryType = builder.categoryType;
            this.controlParam = builder.controlParam;
            this.diskId = builder.diskId;
            this.executeFileAddress = builder.executeFileAddress;
            this.extend = builder.extend;
            this.fileName = builder.fileName;
            this.filePath = builder.filePath;
            this.fileSize = builder.fileSize;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.optimizeParam = builder.optimizeParam;
            this.originAppType = builder.originAppType;
            this.osType = builder.osType;
            this.productType = builder.productType;
            this.runtimeEnv = builder.runtimeEnv;
            this.silenceFlag = builder.silenceFlag;
            this.silenceParam = builder.silenceParam;
            this.status = builder.status;
            this.subAppType = builder.subAppType;
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
         * @return aid
         */
        public Long getAid() {
            return this.aid;
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
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
         * @return appThemeColor
         */
        public String getAppThemeColor() {
            return this.appThemeColor;
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
         * @return diskId
         */
        public String getDiskId() {
            return this.diskId;
        }

        /**
         * @return executeFileAddress
         */
        public String getExecuteFileAddress() {
            return this.executeFileAddress;
        }

        /**
         * @return extend
         */
        public String getExtend() {
            return this.extend;
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

        public static final class Builder {
            private String adaptorId; 
            private String adaptorMessage; 
            private String adaptorMode; 
            private String adaptorStep; 
            private Long aid; 
            private Long aliUid; 
            private String appIconUrl; 
            private String appId; 
            private String appName; 
            private String appScript; 
            private String appThemeColor; 
            private String appType; 
            private String appVersionId; 
            private String appVersionName; 
            private String appVersionNumber; 
            private Integer bizType; 
            private String bucketName; 
            private Integer categoryId; 
            private Integer categoryType; 
            private String controlParam; 
            private String diskId; 
            private String executeFileAddress; 
            private String extend; 
            private String fileName; 
            private String filePath; 
            private Long fileSize; 
            private String gmtCreate; 
            private String gmtModified; 
            private String optimizeParam; 
            private String originAppType; 
            private String osType; 
            private String productType; 
            private String runtimeEnv; 
            private String silenceFlag; 
            private String silenceParam; 
            private String status; 
            private String subAppType; 

            private Builder() {
            } 

            private Builder(AdaptorInfoBOList model) {
                this.adaptorId = model.adaptorId;
                this.adaptorMessage = model.adaptorMessage;
                this.adaptorMode = model.adaptorMode;
                this.adaptorStep = model.adaptorStep;
                this.aid = model.aid;
                this.aliUid = model.aliUid;
                this.appIconUrl = model.appIconUrl;
                this.appId = model.appId;
                this.appName = model.appName;
                this.appScript = model.appScript;
                this.appThemeColor = model.appThemeColor;
                this.appType = model.appType;
                this.appVersionId = model.appVersionId;
                this.appVersionName = model.appVersionName;
                this.appVersionNumber = model.appVersionNumber;
                this.bizType = model.bizType;
                this.bucketName = model.bucketName;
                this.categoryId = model.categoryId;
                this.categoryType = model.categoryType;
                this.controlParam = model.controlParam;
                this.diskId = model.diskId;
                this.executeFileAddress = model.executeFileAddress;
                this.extend = model.extend;
                this.fileName = model.fileName;
                this.filePath = model.filePath;
                this.fileSize = model.fileSize;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.optimizeParam = model.optimizeParam;
                this.originAppType = model.originAppType;
                this.osType = model.osType;
                this.productType = model.productType;
                this.runtimeEnv = model.runtimeEnv;
                this.silenceFlag = model.silenceFlag;
                this.silenceParam = model.silenceParam;
                this.status = model.status;
                this.subAppType = model.subAppType;
            } 

            /**
             * <p>The adaptor ID.</p>
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
             * <p>The execution mode.</p>
             * 
             * <strong>example:</strong>
             * <p>MANUAL</p>
             */
            public Builder adaptorMode(String adaptorMode) {
                this.adaptorMode = adaptorMode;
                return this;
            }

            /**
             * <p>The execution step.</p>
             * 
             * <strong>example:</strong>
             * <p>FINISH_ADAPT</p>
             */
            public Builder adaptorStep(String adaptorStep) {
                this.adaptorStep = adaptorStep;
                return this;
            }

            /**
             * <p>The numeric ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder aid(Long aid) {
                this.aid = aid;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the application belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
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
             * <p>The theme color.</p>
             * 
             * <strong>example:</strong>
             * <p>#FFFFFF</p>
             */
            public Builder appThemeColor(String appThemeColor) {
                this.appThemeColor = appThemeColor;
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
             * <p>The number of the business line to which the application belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder bizType(Integer bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * <p>The name of the OSS bucket where the application file is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>appstream-example</p>
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * <p>The level-2 category of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder categoryId(Integer categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * <p>The level-1 category of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder categoryType(Integer categoryType) {
                this.categoryType = categoryType;
                return this;
            }

            /**
             * <p>The control parameters that can be configured by tenants and administrators.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder controlParam(String controlParam) {
                this.controlParam = controlParam;
                return this;
            }

            /**
             * <p>The ID of the disk where the application file is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>d-bp1example****</p>
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * <p>The path of the executable file after the cloud application is installed.</p>
             * 
             * <strong>example:</strong>
             * <p>abc.text</p>
             */
            public Builder executeFileAddress(String executeFileAddress) {
                this.executeFileAddress = executeFileAddress;
                return this;
            }

            /**
             * <p>The extension information of the adapted application.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder extend(String extend) {
                this.extend = extend;
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
             * <p>The file size.</p>
             * 
             * <strong>example:</strong>
             * <p>102400</p>
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-04-25 15:13:57</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The last update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-04-25 15:13:57</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The optimization parameters that can be configured by administrators in the backend.</p>
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
             * <p>The product type to which the application belongs.</p>
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
             * <p>Specifies whether to skip installation. This parameter can be configured by tenants and administrators.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder silenceFlag(String silenceFlag) {
                this.silenceFlag = silenceFlag;
                return this;
            }

            /**
             * <p>The installation parameters that can be configured by tenants and administrators.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder silenceParam(String silenceParam) {
                this.silenceParam = silenceParam;
                return this;
            }

            /**
             * <p>The application adaptation status. For example, ADAPT_DONE indicates that the adaptation is complete.</p>
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

            public AdaptorInfoBOList build() {
                return new AdaptorInfoBOList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetImageByIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageByIdResponseBody</p>
     */
    public static class ImageExtendInfoModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("DataDiskSize")
        private Integer dataDiskSize;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("GpuCategory")
        private Integer gpuCategory;

        @com.aliyun.core.annotation.NameInMap("GpuDriverVersion")
        private String gpuDriverVersion;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("PackageType")
        private String packageType;

        @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
        private Integer systemDiskSize;

        @com.aliyun.core.annotation.NameInMap("VersionId")
        private String versionId;

        private ImageExtendInfoModel(Builder builder) {
            this.aliUid = builder.aliUid;
            this.dataDiskSize = builder.dataDiskSize;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.gpuCategory = builder.gpuCategory;
            this.gpuDriverVersion = builder.gpuDriverVersion;
            this.imageId = builder.imageId;
            this.packageType = builder.packageType;
            this.systemDiskSize = builder.systemDiskSize;
            this.versionId = builder.versionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageExtendInfoModel create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return dataDiskSize
         */
        public Integer getDataDiskSize() {
            return this.dataDiskSize;
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
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return packageType
         */
        public String getPackageType() {
            return this.packageType;
        }

        /**
         * @return systemDiskSize
         */
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        /**
         * @return versionId
         */
        public String getVersionId() {
            return this.versionId;
        }

        public static final class Builder {
            private Long aliUid; 
            private Integer dataDiskSize; 
            private String gmtCreate; 
            private String gmtModified; 
            private Integer gpuCategory; 
            private String gpuDriverVersion; 
            private String imageId; 
            private String packageType; 
            private Integer systemDiskSize; 
            private String versionId; 

            private Builder() {
            } 

            private Builder(ImageExtendInfoModel model) {
                this.aliUid = model.aliUid;
                this.dataDiskSize = model.dataDiskSize;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.gpuCategory = model.gpuCategory;
                this.gpuDriverVersion = model.gpuDriverVersion;
                this.imageId = model.imageId;
                this.packageType = model.packageType;
                this.systemDiskSize = model.systemDiskSize;
                this.versionId = model.versionId;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account to which the image belongs. The account ID for system images is 0.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
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
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-04-25 15:13:57</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The last update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-04-25 15:13:57</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
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
             * <p>The image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>imgc-xxxx</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The image package type. Valid values:</p>
             * <ul>
             * <li>Ecs: ECS image</li>
             * <li>Vhd: Virtual disk image</li>
             * <li>Container: Container image</li>
             * <li>Ecs_Container: ECS and container composite image</li>
             * <li>K8s_Node: Kubernetes node image</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ECS</p>
             */
            public Builder packageType(String packageType) {
                this.packageType = packageType;
                return this;
            }

            /**
             * <p>The size of the system cloud disk. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
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

            public ImageExtendInfoModel build() {
                return new ImageExtendInfoModel(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetImageByIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageByIdResponseBody</p>
     */
    public static class ImageRegionDistributeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("EcsImageId")
        private String ecsImageId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

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

        @com.aliyun.core.annotation.NameInMap("VersionId")
        private String versionId;

        private ImageRegionDistributeList(Builder builder) {
            this.aliUid = builder.aliUid;
            this.ecsImageId = builder.ecsImageId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.imageId = builder.imageId;
            this.message = builder.message;
            this.progress = builder.progress;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.unitImageId = builder.unitImageId;
            this.versionId = builder.versionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageRegionDistributeList create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return ecsImageId
         */
        public String getEcsImageId() {
            return this.ecsImageId;
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
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
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

        /**
         * @return versionId
         */
        public String getVersionId() {
            return this.versionId;
        }

        public static final class Builder {
            private Long aliUid; 
            private String ecsImageId; 
            private String gmtCreate; 
            private String gmtModified; 
            private String imageId; 
            private String message; 
            private String progress; 
            private String regionId; 
            private String status; 
            private String unitImageId; 
            private String versionId; 

            private Builder() {
            } 

            private Builder(ImageRegionDistributeList model) {
                this.aliUid = model.aliUid;
                this.ecsImageId = model.ecsImageId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.imageId = model.imageId;
                this.message = model.message;
                this.progress = model.progress;
                this.regionId = model.regionId;
                this.status = model.status;
                this.unitImageId = model.unitImageId;
                this.versionId = model.versionId;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account to which the image belongs. The account ID for system images is 0.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The ID of the ECS image corresponding to the region.</p>
             * 
             * <strong>example:</strong>
             * <p>m-bp1example****</p>
             */
            public Builder ecsImageId(String ecsImageId) {
                this.ecsImageId = ecsImageId;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-04-25 15:13:57</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The last update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-04-25 15:13:57</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>imgc-xxxx</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The processing message reported by the region distribution task.</p>
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
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The region distribution status. Valid values:</p>
             * <ul>
             * <li>CREATING: Distributing</li>
             * <li>AVAILABLE: Available</li>
             * <li>CREATE_FAILED: Distribution failed</li>
             * <li>DELETE: Deleted</li>
             * </ul>
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

            public ImageRegionDistributeList build() {
                return new ImageRegionDistributeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetImageByIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageByIdResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdaptorInfoBOList")
        private java.util.List<AdaptorInfoBOList> adaptorInfoBOList;

        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

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

        @com.aliyun.core.annotation.NameInMap("ImageRegionDistributeList")
        private java.util.List<ImageRegionDistributeList> imageRegionDistributeList;

        @com.aliyun.core.annotation.NameInMap("ImageRegionList")
        private java.util.List<String> imageRegionList;

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

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VersionId")
        private String versionId;

        private Data(Builder builder) {
            this.adaptorInfoBOList = builder.adaptorInfoBOList;
            this.aliUid = builder.aliUid;
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
            this.imageRegionDistributeList = builder.imageRegionDistributeList;
            this.imageRegionList = builder.imageRegionList;
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
            this.status = builder.status;
            this.versionId = builder.versionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
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
         * @return imageRegionDistributeList
         */
        public java.util.List<ImageRegionDistributeList> getImageRegionDistributeList() {
            return this.imageRegionDistributeList;
        }

        /**
         * @return imageRegionList
         */
        public java.util.List<String> getImageRegionList() {
            return this.imageRegionList;
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
            private java.util.List<ImageRegionDistributeList> imageRegionDistributeList; 
            private java.util.List<String> imageRegionList; 
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
            private String status; 
            private String versionId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.adaptorInfoBOList = model.adaptorInfoBOList;
                this.aliUid = model.aliUid;
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
                this.imageRegionDistributeList = model.imageRegionDistributeList;
                this.imageRegionList = model.imageRegionList;
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
             * <p>The ID of the Alibaba Cloud account to which the image belongs. The account ID for system images is 0.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The ID of the base image.</p>
             * 
             * <strong>example:</strong>
             * <p>imgc-xxx</p>
             */
            public Builder baseImageId(String baseImageId) {
                this.baseImageId = baseImageId;
                return this;
            }

            /**
             * <p>The base image version ID.</p>
             * 
             * <strong>example:</strong>
             * <p>iv-xxx</p>
             */
            public Builder baseImageVersion(String baseImageVersion) {
                this.baseImageVersion = baseImageVersion;
                return this;
            }

            /**
             * <p>The business line to which the image belongs. Valid values:</p>
             * <ul>
             * <li>1: basic business</li>
             * <li>2: personal edition</li>
             * <li>3: cloud office</li>
             * <li>4: cloud streaming</li>
             * <li>10: standard edition</li>
             * </ul>
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
             * <p>appstream-example</p>
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * <p>The description of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>Description</p>
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
             * <p>2.3.0-xxx</p>
             */
            public Builder fotaVersion(String fotaVersion) {
                this.fotaVersion = fotaVersion;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-04-25 15:13:57</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The last update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-04-25 15:13:57</p>
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
             * <p>The image extended information, which includes cloud disk specifications and GPU driver information. For VHD or container images, the extended information of the base image and base version is used.</p>
             */
            public Builder imageExtendInfoModel(ImageExtendInfoModel imageExtendInfoModel) {
                this.imageExtendInfoModel = imageExtendInfoModel;
                return this;
            }

            /**
             * <p>The image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>imgc-xxxx</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The name of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>DemoImage</p>
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * <p>The list of region distribution information for the image version.</p>
             */
            public Builder imageRegionDistributeList(java.util.List<ImageRegionDistributeList> imageRegionDistributeList) {
                this.imageRegionDistributeList = imageRegionDistributeList;
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
             * <p>The source of the image. For example, center indicates the central image service.</p>
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
             * <li>System: system image</li>
             * <li>User: custom image</li>
             * <li>Shared: shared image</li>
             * <li>Community: community image</li>
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
             * <p>The image language. If the packaging type is VHD or Container, this property is inherited from the image with the ECS packaging type in the same image combination.</p>
             * 
             * <strong>example:</strong>
             * <p>zh-CN</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * <p>The ID of the latest image version.</p>
             * 
             * <strong>example:</strong>
             * <p>iv-xxx</p>
             */
            public Builder latestVersionId(String latestVersionId) {
                this.latestVersionId = latestVersionId;
                return this;
            }

            /**
             * <p>Indicates whether the returned version is the online version. Valid values:</p>
             * <ul>
             * <li>true: Yes.</li>
             * <li>false: No.</li>
             * </ul>
             */
            public Builder onlineVersion(Boolean onlineVersion) {
                this.onlineVersion = onlineVersion;
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
             * <p>The operating system type of the image. Valid values:</p>
             * <ul>
             * <li>Windows: Windows system</li>
             * <li>Linux: Linux system</li>
             * <li>Android: Android system</li>
             * <li>Unknown: unknown system</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Windows</p>
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * <p>The image package type. Valid values:</p>
             * <ul>
             * <li>Ecs: ECS image</li>
             * <li>Vhd: Virtual disk image</li>
             * <li>Container: Container image</li>
             * <li>Ecs_Container: ECS and container composite image</li>
             * <li>K8s_Node: Kubernetes node image</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ECS</p>
             */
            public Builder packageType(String packageType) {
                this.packageType = packageType;
                return this;
            }

            /**
             * <p>The ID of the parent image, which indicates the image inheritance relationship. System images do not have parent images.</p>
             * 
             * <strong>example:</strong>
             * <p>imgc-xxx</p>
             */
            public Builder parentImageId(String parentImageId) {
                this.parentImageId = parentImageId;
                return this;
            }

            /**
             * <p>The parent image version ID.</p>
             * 
             * <strong>example:</strong>
             * <p>iv-xxx</p>
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
             * <p>The name of the operating system platform, which corresponds to Platform.</p>
             * 
             * <strong>example:</strong>
             * <p>Windows Server 2022</p>
             */
            public Builder platformName(String platformName) {
                this.platformName = platformName;
                return this;
            }

            /**
             * <p>The product type to which the image belongs, such as CloudDesktop (Cloud Desktop), CloudApp (cloud application), and WuyingServer (WUYING Workspace Enterprise Edition workstation).</p>
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
             * <p>The connection protocol used by the image. Valid values:</p>
             * <ul>
             * <li>ASP: Alibaba Cloud Streaming Protocol</li>
             * <li>HDX: HDX protocol</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ASP</p>
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * <p>The image status. Valid values:</p>
             * <ul>
             * <li>INIT: Initial.</li>
             * <li>CREATING: Creating.</li>
             * <li>AVAILABLE: Available.</li>
             * <li>CREATE_FAILED: Creation failed.</li>
             * <li>DELETE: Deleted.</li>
             * </ul>
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
