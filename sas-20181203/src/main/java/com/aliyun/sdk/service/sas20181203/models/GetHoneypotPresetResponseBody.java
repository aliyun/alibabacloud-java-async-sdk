// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHoneypotPresetResponseBody} extends {@link TeaModel}
 *
 * <p>GetHoneypotPresetResponseBody</p>
 */
public class GetHoneypotPresetResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
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
        @NameInMap("FileId")
        private String fileId;

        @NameInMap("FileName")
        private String fileName;

        @NameInMap("OssUrl")
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
             * FileId.
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * OssUrl.
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
        @NameInMap("ControlNodeName")
        private String controlNodeName;

        @NameInMap("FileInfoList")
        private java.util.List < FileInfoList> fileInfoList;

        @NameInMap("HoneypotImageDisplayName")
        private String honeypotImageDisplayName;

        @NameInMap("HoneypotImageName")
        private String honeypotImageName;

        @NameInMap("HoneypotPresetId")
        private String honeypotPresetId;

        @NameInMap("Meta")
        private String meta;

        @NameInMap("NodeId")
        private String nodeId;

        @NameInMap("PresetName")
        private String presetName;

        @NameInMap("PresetType")
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
             * 蜜罐管理节点名称
             */
            public Builder controlNodeName(String controlNodeName) {
                this.controlNodeName = controlNodeName;
                return this;
            }

            /**
             * 文件参数
             */
            public Builder fileInfoList(java.util.List < FileInfoList> fileInfoList) {
                this.fileInfoList = fileInfoList;
                return this;
            }

            /**
             * 蜜罐镜像展示名称
             */
            public Builder honeypotImageDisplayName(String honeypotImageDisplayName) {
                this.honeypotImageDisplayName = honeypotImageDisplayName;
                return this;
            }

            /**
             * 蜜罐镜像名称
             */
            public Builder honeypotImageName(String honeypotImageName) {
                this.honeypotImageName = honeypotImageName;
                return this;
            }

            /**
             * 蜜罐模板唯一ID
             */
            public Builder honeypotPresetId(String honeypotPresetId) {
                this.honeypotPresetId = honeypotPresetId;
                return this;
            }

            /**
             * 蜜罐模板自定义参数
             */
            public Builder meta(String meta) {
                this.meta = meta;
                return this;
            }

            /**
             * 管理节点唯一id
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * 蜜罐模板自定义名称
             */
            public Builder presetName(String presetName) {
                this.presetName = presetName;
                return this;
            }

            /**
             * 模板类型
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
