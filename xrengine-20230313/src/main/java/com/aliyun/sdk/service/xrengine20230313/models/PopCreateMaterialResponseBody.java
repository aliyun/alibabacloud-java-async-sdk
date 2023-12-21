// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PopCreateMaterialResponseBody} extends {@link TeaModel}
 *
 * <p>PopCreateMaterialResponseBody</p>
 */
public class PopCreateMaterialResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private PopCreateMaterialResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PopCreateMaterialResponseBody create() {
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

        public PopCreateMaterialResponseBody build() {
            return new PopCreateMaterialResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CheckStatus")
        private String checkStatus;

        @NameInMap("Common")
        private Boolean common;

        @NameInMap("CoverUrl")
        private String coverUrl;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Deleted")
        private Boolean deleted;

        @NameInMap("Ext")
        private String ext;

        @NameInMap("FileUrl")
        private String fileUrl;

        @NameInMap("Id")
        private String id;

        @NameInMap("Intro")
        private String intro;

        @NameInMap("ListStatus")
        private String listStatus;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("OssKey")
        private String ossKey;

        @NameInMap("PreviewUrl")
        private String previewUrl;

        @NameInMap("Type")
        private String type;

        private Data(Builder builder) {
            this.checkStatus = builder.checkStatus;
            this.common = builder.common;
            this.coverUrl = builder.coverUrl;
            this.createTime = builder.createTime;
            this.deleted = builder.deleted;
            this.ext = builder.ext;
            this.fileUrl = builder.fileUrl;
            this.id = builder.id;
            this.intro = builder.intro;
            this.listStatus = builder.listStatus;
            this.modifiedTime = builder.modifiedTime;
            this.name = builder.name;
            this.ossKey = builder.ossKey;
            this.previewUrl = builder.previewUrl;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return checkStatus
         */
        public String getCheckStatus() {
            return this.checkStatus;
        }

        /**
         * @return common
         */
        public Boolean getCommon() {
            return this.common;
        }

        /**
         * @return coverUrl
         */
        public String getCoverUrl() {
            return this.coverUrl;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deleted
         */
        public Boolean getDeleted() {
            return this.deleted;
        }

        /**
         * @return ext
         */
        public String getExt() {
            return this.ext;
        }

        /**
         * @return fileUrl
         */
        public String getFileUrl() {
            return this.fileUrl;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return intro
         */
        public String getIntro() {
            return this.intro;
        }

        /**
         * @return listStatus
         */
        public String getListStatus() {
            return this.listStatus;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ossKey
         */
        public String getOssKey() {
            return this.ossKey;
        }

        /**
         * @return previewUrl
         */
        public String getPreviewUrl() {
            return this.previewUrl;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String checkStatus; 
            private Boolean common; 
            private String coverUrl; 
            private String createTime; 
            private Boolean deleted; 
            private String ext; 
            private String fileUrl; 
            private String id; 
            private String intro; 
            private String listStatus; 
            private String modifiedTime; 
            private String name; 
            private String ossKey; 
            private String previewUrl; 
            private String type; 

            /**
             * CheckStatus.
             */
            public Builder checkStatus(String checkStatus) {
                this.checkStatus = checkStatus;
                return this;
            }

            /**
             * Common.
             */
            public Builder common(Boolean common) {
                this.common = common;
                return this;
            }

            /**
             * CoverUrl.
             */
            public Builder coverUrl(String coverUrl) {
                this.coverUrl = coverUrl;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Deleted.
             */
            public Builder deleted(Boolean deleted) {
                this.deleted = deleted;
                return this;
            }

            /**
             * Ext.
             */
            public Builder ext(String ext) {
                this.ext = ext;
                return this;
            }

            /**
             * FileUrl.
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Intro.
             */
            public Builder intro(String intro) {
                this.intro = intro;
                return this;
            }

            /**
             * ListStatus.
             */
            public Builder listStatus(String listStatus) {
                this.listStatus = listStatus;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OssKey.
             */
            public Builder ossKey(String ossKey) {
                this.ossKey = ossKey;
                return this;
            }

            /**
             * PreviewUrl.
             */
            public Builder previewUrl(String previewUrl) {
                this.previewUrl = previewUrl;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
