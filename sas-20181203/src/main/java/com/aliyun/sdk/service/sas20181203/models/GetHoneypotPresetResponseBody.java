// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHoneypotPresetResponseBody} extends {@link TeaModel}
 *
 * <p>GetHoneypotPresetResponseBody</p>
 */
public class GetHoneypotPresetResponseBody extends TeaModel {
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

    private GetHoneypotPresetResponseBody(Builder builder) {
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

    public static GetHoneypotPresetResponseBody create() {
        return builder().build();
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

        /**
         * The status code returned. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The information about the honeypot template.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**: The request was successful.
         * *   **false**: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetHoneypotPresetResponseBody build() {
            return new GetHoneypotPresetResponseBody(this);
        } 

    } 

    public static class FileInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("OssUrl")
        private String ossUrl;

        private FileInfoList(Builder builder) {
            this.fileId = builder.fileId;
            this.fileName = builder.fileName;
            this.ossUrl = builder.ossUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileInfoList create() {
            return builder().build();
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return ossUrl
         */
        public String getOssUrl() {
            return this.ossUrl;
        }

        public static final class Builder {
            private String fileId; 
            private String fileName; 
            private String ossUrl; 

            /**
             * The ID of the uploaded file.
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * The name of the uploaded file.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * The download URL.
             */
            public Builder ossUrl(String ossUrl) {
                this.ossUrl = ossUrl;
                return this;
            }

            public FileInfoList build() {
                return new FileInfoList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ControlNodeName")
        private String controlNodeName;

        @com.aliyun.core.annotation.NameInMap("FileInfoList")
        private java.util.List < FileInfoList> fileInfoList;

        @com.aliyun.core.annotation.NameInMap("HoneypotImageDisplayName")
        private String honeypotImageDisplayName;

        @com.aliyun.core.annotation.NameInMap("HoneypotImageName")
        private String honeypotImageName;

        @com.aliyun.core.annotation.NameInMap("HoneypotPresetId")
        private String honeypotPresetId;

        @com.aliyun.core.annotation.NameInMap("Meta")
        private String meta;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("PresetName")
        private String presetName;

        @com.aliyun.core.annotation.NameInMap("PresetType")
        private String presetType;

        private Data(Builder builder) {
            this.controlNodeName = builder.controlNodeName;
            this.fileInfoList = builder.fileInfoList;
            this.honeypotImageDisplayName = builder.honeypotImageDisplayName;
            this.honeypotImageName = builder.honeypotImageName;
            this.honeypotPresetId = builder.honeypotPresetId;
            this.meta = builder.meta;
            this.nodeId = builder.nodeId;
            this.presetName = builder.presetName;
            this.presetType = builder.presetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return controlNodeName
         */
        public String getControlNodeName() {
            return this.controlNodeName;
        }

        /**
         * @return fileInfoList
         */
        public java.util.List < FileInfoList> getFileInfoList() {
            return this.fileInfoList;
        }

        /**
         * @return honeypotImageDisplayName
         */
        public String getHoneypotImageDisplayName() {
            return this.honeypotImageDisplayName;
        }

        /**
         * @return honeypotImageName
         */
        public String getHoneypotImageName() {
            return this.honeypotImageName;
        }

        /**
         * @return honeypotPresetId
         */
        public String getHoneypotPresetId() {
            return this.honeypotPresetId;
        }

        /**
         * @return meta
         */
        public String getMeta() {
            return this.meta;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return presetName
         */
        public String getPresetName() {
            return this.presetName;
        }

        /**
         * @return presetType
         */
        public String getPresetType() {
            return this.presetType;
        }

        public static final class Builder {
            private String controlNodeName; 
            private java.util.List < FileInfoList> fileInfoList; 
            private String honeypotImageDisplayName; 
            private String honeypotImageName; 
            private String honeypotPresetId; 
            private String meta; 
            private String nodeId; 
            private String presetName; 
            private String presetType; 

            /**
             * The name of the management node.
             */
            public Builder controlNodeName(String controlNodeName) {
                this.controlNodeName = controlNodeName;
                return this;
            }

            /**
             * An array that consists of the configurations of the uploaded file.
             */
            public Builder fileInfoList(java.util.List < FileInfoList> fileInfoList) {
                this.fileInfoList = fileInfoList;
                return this;
            }

            /**
             * The display name of the honeypot image.
             */
            public Builder honeypotImageDisplayName(String honeypotImageDisplayName) {
                this.honeypotImageDisplayName = honeypotImageDisplayName;
                return this;
            }

            /**
             * The name of the honeypot image.
             */
            public Builder honeypotImageName(String honeypotImageName) {
                this.honeypotImageName = honeypotImageName;
                return this;
            }

            /**
             * The ID of the honeypot template.
             */
            public Builder honeypotPresetId(String honeypotPresetId) {
                this.honeypotPresetId = honeypotPresetId;
                return this;
            }

            /**
             * The custom configuration of the honeypot template.
             */
            public Builder meta(String meta) {
                this.meta = meta;
                return this;
            }

            /**
             * The ID of the management node.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The custom name of the honeypot template.
             */
            public Builder presetName(String presetName) {
                this.presetName = presetName;
                return this;
            }

            /**
             * The type of the honeypot template. Valid values:
             * <p>
             * 
             * *   **TEMP**: automatically generated template
             * *   **CUSTOM**: custom template
             * *   **DEFAULT**: default template
             */
            public Builder presetType(String presetType) {
                this.presetType = presetType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
