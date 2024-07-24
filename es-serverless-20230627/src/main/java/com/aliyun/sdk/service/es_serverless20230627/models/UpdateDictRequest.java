// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20230627.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDictRequest} extends {@link RequestModel}
 *
 * <p>UpdateDictRequest</p>
 */
public class UpdateDictRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("allowCover")
    private Boolean allowCover;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("files")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Files> files;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceType")
    private String sourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dryRun")
    private Boolean dryRun;

    private UpdateDictRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.allowCover = builder.allowCover;
        this.files = builder.files;
        this.sourceType = builder.sourceType;
        this.type = builder.type;
        this.dryRun = builder.dryRun;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDictRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return allowCover
     */
    public Boolean getAllowCover() {
        return this.allowCover;
    }

    /**
     * @return files
     */
    public java.util.List < Files> getFiles() {
        return this.files;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static final class Builder extends Request.Builder<UpdateDictRequest, Builder> {
        private String appName; 
        private Boolean allowCover; 
        private java.util.List < Files> files; 
        private String sourceType; 
        private String type; 
        private Boolean dryRun; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDictRequest request) {
            super(request);
            this.appName = request.appName;
            this.allowCover = request.allowCover;
            this.files = request.files;
            this.sourceType = request.sourceType;
            this.type = request.type;
            this.dryRun = request.dryRun;
        } 

        /**
         * appName.
         */
        public Builder appName(String appName) {
            this.putPathParameter("appName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * allowCover.
         */
        public Builder allowCover(Boolean allowCover) {
            this.putQueryParameter("allowCover", allowCover);
            this.allowCover = allowCover;
            return this;
        }

        /**
         * files.
         */
        public Builder files(java.util.List < Files> files) {
            this.putBodyParameter("files", files);
            this.files = files;
            return this;
        }

        /**
         * sourceType.
         */
        public Builder sourceType(String sourceType) {
            this.putBodyParameter("sourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * dryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        @Override
        public UpdateDictRequest build() {
            return new UpdateDictRequest(this);
        } 

    } 

    public static class OssObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        private OssObject(Builder builder) {
            this.bucketName = builder.bucketName;
            this.key = builder.key;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OssObject create() {
            return builder().build();
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        public static final class Builder {
            private String bucketName; 
            private String key; 

            /**
             * bucketName.
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            public OssObject build() {
                return new OssObject(this);
            } 

        } 

    }
    public static class Files extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ossObject")
        private OssObject ossObject;

        private Files(Builder builder) {
            this.name = builder.name;
            this.ossObject = builder.ossObject;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Files create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ossObject
         */
        public OssObject getOssObject() {
            return this.ossObject;
        }

        public static final class Builder {
            private String name; 
            private OssObject ossObject; 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ossObject.
             */
            public Builder ossObject(OssObject ossObject) {
                this.ossObject = ossObject;
                return this;
            }

            public Files build() {
                return new Files(this);
            } 

        } 

    }
}
