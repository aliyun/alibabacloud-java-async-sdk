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
 * {@link ListAppResponseBody} extends {@link TeaModel}
 *
 * <p>ListAppResponseBody</p>
 */
public class ListAppResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNmuber")
    private Integer pageNmuber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListAppResponseBody(Builder builder) {
        this.code = builder.code;
        this.count = builder.count;
        this.data = builder.data;
        this.message = builder.message;
        this.pageNmuber = builder.pageNmuber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppResponseBody create() {
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
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNmuber
     */
    public Integer getPageNmuber() {
        return this.pageNmuber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
        private Integer count; 
        private java.util.List<Data> data; 
        private String message; 
        private Integer pageNmuber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListAppResponseBody model) {
            this.code = model.code;
            this.count = model.count;
            this.data = model.data;
            this.message = model.message;
            this.pageNmuber = model.pageNmuber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code. This field is returned when the request fails. A successful response may not contain this field.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalError</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The total number of application records that meet the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The application records on the current page.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error or result message. This field describes the cause when the request fails. A successful response may not contain this field.</p>
         * 
         * <strong>example:</strong>
         * <p>Internal error.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number of the current query. The name of this response field is PageNmuber.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNmuber(Integer pageNmuber) {
            this.pageNmuber = pageNmuber;
            return this;
        }

        /**
         * <p>The number of records per page in the paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The unique identifier of the request. You can provide this value when troubleshooting issues.</p>
         * 
         * <strong>example:</strong>
         * <p>01A1A962-5503-107B-AC8F-EBA85DF905AC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was processed successfully. A value of true indicates that the current request was processed successfully. To check whether an asynchronous task is completed, you must query the task status separately.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListAppResponseBody build() {
            return new ListAppResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAppResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("AppIconUrl")
        private String appIconUrl;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AppThemeColor")
        private String appThemeColor;

        @com.aliyun.core.annotation.NameInMap("AppType")
        private String appType;

        @com.aliyun.core.annotation.NameInMap("BizType")
        private Integer bizType;

        @com.aliyun.core.annotation.NameInMap("Deletable")
        private Boolean deletable;

        @com.aliyun.core.annotation.NameInMap("ExecuteFileAddress")
        private String executeFileAddress;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("OriginAppType")
        private String originAppType;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("SilenceParam")
        private String silenceParam;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubAppType")
        private String subAppType;

        private Data(Builder builder) {
            this.aliUid = builder.aliUid;
            this.appIconUrl = builder.appIconUrl;
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.appThemeColor = builder.appThemeColor;
            this.appType = builder.appType;
            this.bizType = builder.bizType;
            this.deletable = builder.deletable;
            this.executeFileAddress = builder.executeFileAddress;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.originAppType = builder.originAppType;
            this.osType = builder.osType;
            this.productType = builder.productType;
            this.silenceParam = builder.silenceParam;
            this.status = builder.status;
            this.subAppType = builder.subAppType;
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
         * @return bizType
         */
        public Integer getBizType() {
            return this.bizType;
        }

        /**
         * @return deletable
         */
        public Boolean getDeletable() {
            return this.deletable;
        }

        /**
         * @return executeFileAddress
         */
        public String getExecuteFileAddress() {
            return this.executeFileAddress;
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
            private Long aliUid; 
            private String appIconUrl; 
            private String appId; 
            private String appName; 
            private String appThemeColor; 
            private String appType; 
            private Integer bizType; 
            private Boolean deletable; 
            private String executeFileAddress; 
            private String gmtCreate; 
            private String gmtModified; 
            private String originAppType; 
            private String osType; 
            private String productType; 
            private String silenceParam; 
            private String status; 
            private String subAppType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.aliUid = model.aliUid;
                this.appIconUrl = model.appIconUrl;
                this.appId = model.appId;
                this.appName = model.appName;
                this.appThemeColor = model.appThemeColor;
                this.appType = model.appType;
                this.bizType = model.bizType;
                this.deletable = model.deletable;
                this.executeFileAddress = model.executeFileAddress;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.originAppType = model.originAppType;
                this.osType = model.osType;
                this.productType = model.productType;
                this.silenceParam = model.silenceParam;
                this.status = model.status;
                this.subAppType = model.subAppType;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>100931896542****</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The URL used to access the application icon.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/apps/business/icon.png">https://example.com/apps/business/icon.png</a></p>
             */
            public Builder appIconUrl(String appIconUrl) {
                this.appIconUrl = appIconUrl;
                return this;
            }

            /**
             * <p>The application ID, which is used for subsequent application queries or unbinding the image.</p>
             * 
             * <strong>example:</strong>
             * <p>app-bp1example****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The display name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>Business management platform</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The theme color saved for the application. If no theme color is specified when the application is created, #FFFFFF (white) is saved by default. The saved value is returned during a query. This field may not be configured for legacy applications.</p>
             * 
             * <strong>example:</strong>
             * <p>#FFFFFF</p>
             */
            public Builder appThemeColor(String appThemeColor) {
                this.appThemeColor = appThemeColor;
                return this;
            }

            /**
             * <p>The source type of the application. Valid values:</p>
             * <ul>
             * <li><strong>USER_APP</strong>: user-created application</li>
             * <li><strong>SYS_APP</strong>: system-provided application</li>
             * <li><strong>VIRTUAL_APP</strong>: virtual application</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>USER_APP</p>
             */
            public Builder appType(String appType) {
                this.appType = appType;
                return this;
            }

            /**
             * <p>The business type to which the application belongs. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: basic product</li>
             * <li><strong>2</strong>: personal cloud</li>
             * <li><strong>3</strong>: cloud office</li>
             * <li><strong>4</strong>: cloud flow</li>
             * <li><strong>10</strong>: personal edition</li>
             * <li><strong>20</strong>: business edition</li>
             * <li><strong>60</strong>: Linggou team edition</li>
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
             * <p>Indicates whether the current application is not referenced by any image. A value of true indicates that no image references the application. A value of false indicates that the application is still referenced by an image, and the reference must be removed before deletion.</p>
             */
            public Builder deletable(Boolean deletable) {
                this.deletable = deletable;
                return this;
            }

            /**
             * <p>The path of the executable file saved when the application is created or modified. This field is returned only if the path is configured for the application. An example is the installation path of a Windows business application.</p>
             * 
             * <strong>example:</strong>
             * <p>C:\Program Files\BusinessApp\BusinessApp.exe</p>
             */
            public Builder executeFileAddress(String executeFileAddress) {
                this.executeFileAddress = executeFileAddress;
                return this;
            }

            /**
             * <p>The time when the application was created. The time is in ISO 8601 format, accurate to milliseconds, and the time zone offset is +00:00.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-25T07:41:30.000+00:00</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the application was last modified. The time is in ISO 8601 format, accurate to milliseconds, and the time zone offset is +00:00.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-25T07:41:30.000+00:00</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The form of the application. Valid values:</p>
             * <ul>
             * <li><strong>CLIENT_BASE</strong>: client application</li>
             * <li><strong>WEB_BASE</strong>: browser application</li>
             * <li><strong>CLOUD_NATIVE_BASE</strong>: cloud-native application</li>
             * <li><strong>PORT_SERVICE_BASE</strong>: port service application</li>
             * <li><strong>AGENT_SERVICE_BASE</strong>: agent application</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>WEB_BASE</p>
             */
            public Builder originAppType(String originAppType) {
                this.originAppType = originAppType;
                return this;
            }

            /**
             * <p>The type of the operating system used by the application. Valid values:</p>
             * <ul>
             * <li><strong>Unknown</strong>: unknown operating system</li>
             * <li><strong>Windows</strong>: Windows operating system</li>
             * <li><strong>Linux</strong>: Linux operating system</li>
             * <li><strong>Android</strong>: Android operating system</li>
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
             * <p>The product to which the resource belongs. Valid values:</p>
             * <ul>
             * <li><strong>CloudGame</strong>: cloud game</li>
             * <li><strong>CloudApp</strong>: Wuying cloud application</li>
             * <li><strong>CloudBrowser</strong>: secure browser</li>
             * <li><strong>CloudDesktop</strong>: Wuying cloud computer</li>
             * <li><strong>ImageBuilder</strong>: image building resource</li>
             * <li><strong>ImageValidate</strong>: image validation resource</li>
             * <li><strong>AndroidCloud</strong>: Android cloud</li>
             * <li><strong>GpuRender</strong>: GPU rendering</li>
             * <li><strong>AndroidGpuRender</strong>: Android cloud GPU rendering</li>
             * <li><strong>WuyingServer</strong>: enterprise edition workstation</li>
             * <li><strong>GpuProxy</strong>: GPU remote rendering proxy</li>
             * <li><strong>GpuCache</strong>: GPU remote rendering cache</li>
             * <li><strong>AIAgent</strong>: AI agent service</li>
             * <li><strong>HostedDesktop</strong>: hosted computer</li>
             * <li><strong>WuyingWorkstation</strong>: personal edition container workstation</li>
             * <li><strong>WuyingWorkstationBusiness</strong>: business edition container workstation</li>
             * <li><strong>WuyingWorkstationTeam</strong>: Linggou team edition container workstation</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CloudApp</p>
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * <p>The command-line parameters used when the application is started.</p>
             * 
             * <strong>example:</strong>
             * <p>--lang=zh-CN</p>
             */
            public Builder silenceParam(String silenceParam) {
                this.silenceParam = silenceParam;
                return this;
            }

            /**
             * <p>The status of the application record. The current list queries only valid and undeleted applications.</p>
             * 
             * <strong>example:</strong>
             * <p>VALID</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The subtype of the application. Valid values:</p>
             * <ul>
             * <li><strong>PWA</strong>: progressive web application</li>
             * <li><strong>SAAS</strong>: software as a service (SaaS) application</li>
             * <li><strong>SANDBOX</strong>: sandbox application</li>
             * <li><strong>CONTAINER</strong>: container application</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SAAS</p>
             */
            public Builder subAppType(String subAppType) {
                this.subAppType = subAppType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
