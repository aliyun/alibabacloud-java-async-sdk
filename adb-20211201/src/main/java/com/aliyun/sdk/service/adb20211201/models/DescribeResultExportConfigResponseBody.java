// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeResultExportConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResultExportConfigResponseBody</p>
 */
public class DescribeResultExportConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeResultExportConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResultExportConfigResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeResultExportConfigResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>API status or POP error code.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidInput</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP response status code. A value of 200 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The returned message. Valid values:</p>
         * <ul>
         * <li>The request succeeded, and the server returns <strong>OK</strong>.</li>
         * <li>The request failed, and the server returns an error message.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values: Valid values:</p>
         * <ul>
         * <li><strong>True: Succeeded.</strong></li>
         * <li>**False: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeResultExportConfigResponseBody build() {
            return new DescribeResultExportConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeResultExportConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResultExportConfigResponseBody</p>
     */
    public static class OssInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExportBasePath")
        private String exportBasePath;

        @com.aliyun.core.annotation.NameInMap("ResourceGroup")
        private String resourceGroup;

        @com.aliyun.core.annotation.NameInMap("ResultFileTtl")
        private Integer resultFileTtl;

        private OssInfo(Builder builder) {
            this.exportBasePath = builder.exportBasePath;
            this.resourceGroup = builder.resourceGroup;
            this.resultFileTtl = builder.resultFileTtl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OssInfo create() {
            return builder().build();
        }

        /**
         * @return exportBasePath
         */
        public String getExportBasePath() {
            return this.exportBasePath;
        }

        /**
         * @return resourceGroup
         */
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        /**
         * @return resultFileTtl
         */
        public Integer getResultFileTtl() {
            return this.resultFileTtl;
        }

        public static final class Builder {
            private String exportBasePath; 
            private String resourceGroup; 
            private Integer resultFileTtl; 

            private Builder() {
            } 

            private Builder(OssInfo model) {
                this.exportBasePath = model.exportBasePath;
                this.resourceGroup = model.resourceGroup;
                this.resultFileTtl = model.resultFileTtl;
            } 

            /**
             * <p>The path of the OSS bucket to which the result sets are exported.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://testBucketName/data_result</p>
             */
            public Builder exportBasePath(String exportBasePath) {
                this.exportBasePath = exportBasePath;
                return this;
            }

            /**
             * <p>The name of the resource group that runs the export SQL.</p>
             * 
             * <strong>example:</strong>
             * <p>aps</p>
             */
            public Builder resourceGroup(String resourceGroup) {
                this.resourceGroup = resourceGroup;
                return this;
            }

            /**
             * <p>The expiration period (in days) for the OSS file. The returned value is between 1 and 30 days (inclusive).</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder resultFileTtl(Integer resultFileTtl) {
                this.resultFileTtl = resultFileTtl;
                return this;
            }

            public OssInfo build() {
                return new OssInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeResultExportConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResultExportConfigResponseBody</p>
     */
    public static class SlsInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogstoreTtl")
        private Integer logstoreTtl;

        @com.aliyun.core.annotation.NameInMap("ResourceGroup")
        private String resourceGroup;

        @com.aliyun.core.annotation.NameInMap("SlsProject")
        private String slsProject;

        private SlsInfo(Builder builder) {
            this.logstoreTtl = builder.logstoreTtl;
            this.resourceGroup = builder.resourceGroup;
            this.slsProject = builder.slsProject;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlsInfo create() {
            return builder().build();
        }

        /**
         * @return logstoreTtl
         */
        public Integer getLogstoreTtl() {
            return this.logstoreTtl;
        }

        /**
         * @return resourceGroup
         */
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        /**
         * @return slsProject
         */
        public String getSlsProject() {
            return this.slsProject;
        }

        public static final class Builder {
            private Integer logstoreTtl; 
            private String resourceGroup; 
            private String slsProject; 

            private Builder() {
            } 

            private Builder(SlsInfo model) {
                this.logstoreTtl = model.logstoreTtl;
                this.resourceGroup = model.resourceGroup;
                this.slsProject = model.slsProject;
            } 

            /**
             * <p>The expiration period (in days) for the temporary Logstore automatically created during result set export. The Logstore is automatically deleted after expiration. The returned value is between 1 and 30 days (inclusive).</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder logstoreTtl(Integer logstoreTtl) {
                this.logstoreTtl = logstoreTtl;
                return this;
            }

            /**
             * <p>The name of the resource group that runs the export SQL.</p>
             * 
             * <strong>example:</strong>
             * <p>aps</p>
             */
            public Builder resourceGroup(String resourceGroup) {
                this.resourceGroup = resourceGroup;
                return this;
            }

            /**
             * <p>The name of the SLS project.</p>
             * 
             * <strong>example:</strong>
             * <p>test-project</p>
             */
            public Builder slsProject(String slsProject) {
                this.slsProject = slsProject;
                return this;
            }

            public SlsInfo build() {
                return new SlsInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeResultExportConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResultExportConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExportType")
        private String exportType;

        @com.aliyun.core.annotation.NameInMap("OssInfo")
        private OssInfo ossInfo;

        @com.aliyun.core.annotation.NameInMap("SlsInfo")
        private SlsInfo slsInfo;

        private Data(Builder builder) {
            this.exportType = builder.exportType;
            this.ossInfo = builder.ossInfo;
            this.slsInfo = builder.slsInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return exportType
         */
        public String getExportType() {
            return this.exportType;
        }

        /**
         * @return ossInfo
         */
        public OssInfo getOssInfo() {
            return this.ossInfo;
        }

        /**
         * @return slsInfo
         */
        public SlsInfo getSlsInfo() {
            return this.slsInfo;
        }

        public static final class Builder {
            private String exportType; 
            private OssInfo ossInfo; 
            private SlsInfo slsInfo; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.exportType = model.exportType;
                this.ossInfo = model.ossInfo;
                this.slsInfo = model.slsInfo;
            } 

            /**
             * <p>The export type. Valid values:</p>
             * <ul>
             * <li>SLS: Indicates that the export destination is SLS.</li>
             * <li>OSS: Indicates that the export destination is OSS.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder exportType(String exportType) {
                this.exportType = exportType;
                return this;
            }

            /**
             * <p>The configured OSS export settings, returned when the export destination is OSS.</p>
             */
            public Builder ossInfo(OssInfo ossInfo) {
                this.ossInfo = ossInfo;
                return this;
            }

            /**
             * <p>The configured SLS export settings, returned when the export destination is SLS.</p>
             */
            public Builder slsInfo(SlsInfo slsInfo) {
                this.slsInfo = slsInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
