// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20221111.models;

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
 * {@link ListProjectResponseBody} extends {@link TeaModel}
 *
 * <p>ListProjectResponseBody</p>
 */
public class ListProjectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Current")
    private Integer current;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Pages")
    private Integer pages;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Size")
    private Integer size;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private ListProjectResponseBody(Builder builder) {
        this.code = builder.code;
        this.current = builder.current;
        this.data = builder.data;
        this.message = builder.message;
        this.pages = builder.pages;
        this.requestId = builder.requestId;
        this.size = builder.size;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectResponseBody create() {
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
     * @return current
     */
    public Integer getCurrent() {
        return this.current;
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
     * @return pages
     */
    public Integer getPages() {
        return this.pages;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private Integer current; 
        private java.util.List<Data> data; 
        private String message; 
        private Integer pages; 
        private String requestId; 
        private Integer size; 
        private Boolean success; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListProjectResponseBody model) {
            this.code = model.code;
            this.current = model.current;
            this.data = model.data;
            this.message = model.message;
            this.pages = model.pages;
            this.requestId = model.requestId;
            this.size = model.size;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Current.
         */
        public Builder current(Integer current) {
            this.current = current;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
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
         * Pages.
         */
        public Builder pages(Integer pages) {
            this.pages = pages;
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
         * Size.
         */
        public Builder size(Integer size) {
            this.size = size;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListProjectResponseBody build() {
            return new ListProjectResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListProjectResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectResponseBody</p>
     */
    public static class Dataset extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BuildResultUrl")
        private java.util.Map<String, ?> buildResultUrl;

        @com.aliyun.core.annotation.NameInMap("CoverUrl")
        private String coverUrl;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("GlbModelUrl")
        private String glbModelUrl;

        @com.aliyun.core.annotation.NameInMap("ModelUrl")
        private String modelUrl;

        @com.aliyun.core.annotation.NameInMap("OriginResultUrl")
        private String originResultUrl;

        @com.aliyun.core.annotation.NameInMap("OssKey")
        private String ossKey;

        @com.aliyun.core.annotation.NameInMap("PoseUrl")
        private String poseUrl;

        @com.aliyun.core.annotation.NameInMap("PreviewUrl")
        private String previewUrl;

        private Dataset(Builder builder) {
            this.buildResultUrl = builder.buildResultUrl;
            this.coverUrl = builder.coverUrl;
            this.errorMessage = builder.errorMessage;
            this.glbModelUrl = builder.glbModelUrl;
            this.modelUrl = builder.modelUrl;
            this.originResultUrl = builder.originResultUrl;
            this.ossKey = builder.ossKey;
            this.poseUrl = builder.poseUrl;
            this.previewUrl = builder.previewUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dataset create() {
            return builder().build();
        }

        /**
         * @return buildResultUrl
         */
        public java.util.Map<String, ?> getBuildResultUrl() {
            return this.buildResultUrl;
        }

        /**
         * @return coverUrl
         */
        public String getCoverUrl() {
            return this.coverUrl;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return glbModelUrl
         */
        public String getGlbModelUrl() {
            return this.glbModelUrl;
        }

        /**
         * @return modelUrl
         */
        public String getModelUrl() {
            return this.modelUrl;
        }

        /**
         * @return originResultUrl
         */
        public String getOriginResultUrl() {
            return this.originResultUrl;
        }

        /**
         * @return ossKey
         */
        public String getOssKey() {
            return this.ossKey;
        }

        /**
         * @return poseUrl
         */
        public String getPoseUrl() {
            return this.poseUrl;
        }

        /**
         * @return previewUrl
         */
        public String getPreviewUrl() {
            return this.previewUrl;
        }

        public static final class Builder {
            private java.util.Map<String, ?> buildResultUrl; 
            private String coverUrl; 
            private String errorMessage; 
            private String glbModelUrl; 
            private String modelUrl; 
            private String originResultUrl; 
            private String ossKey; 
            private String poseUrl; 
            private String previewUrl; 

            private Builder() {
            } 

            private Builder(Dataset model) {
                this.buildResultUrl = model.buildResultUrl;
                this.coverUrl = model.coverUrl;
                this.errorMessage = model.errorMessage;
                this.glbModelUrl = model.glbModelUrl;
                this.modelUrl = model.modelUrl;
                this.originResultUrl = model.originResultUrl;
                this.ossKey = model.ossKey;
                this.poseUrl = model.poseUrl;
                this.previewUrl = model.previewUrl;
            } 

            /**
             * BuildResultUrl.
             */
            public Builder buildResultUrl(java.util.Map<String, ?> buildResultUrl) {
                this.buildResultUrl = buildResultUrl;
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
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * GlbModelUrl.
             */
            public Builder glbModelUrl(String glbModelUrl) {
                this.glbModelUrl = glbModelUrl;
                return this;
            }

            /**
             * ModelUrl.
             */
            public Builder modelUrl(String modelUrl) {
                this.modelUrl = modelUrl;
                return this;
            }

            /**
             * OriginResultUrl.
             */
            public Builder originResultUrl(String originResultUrl) {
                this.originResultUrl = originResultUrl;
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
             * PoseUrl.
             */
            public Builder poseUrl(String poseUrl) {
                this.poseUrl = poseUrl;
                return this;
            }

            /**
             * PreviewUrl.
             */
            public Builder previewUrl(String previewUrl) {
                this.previewUrl = previewUrl;
                return this;
            }

            public Dataset build() {
                return new Dataset(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProjectResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectResponseBody</p>
     */
    public static class Clothes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CoverUrl")
        private String coverUrl;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OssKey")
        private String ossKey;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Clothes(Builder builder) {
            this.coverUrl = builder.coverUrl;
            this.name = builder.name;
            this.ossKey = builder.ossKey;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Clothes create() {
            return builder().build();
        }

        /**
         * @return coverUrl
         */
        public String getCoverUrl() {
            return this.coverUrl;
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
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String coverUrl; 
            private String name; 
            private String ossKey; 
            private String type; 

            private Builder() {
            } 

            private Builder(Clothes model) {
                this.coverUrl = model.coverUrl;
                this.name = model.name;
                this.ossKey = model.ossKey;
                this.type = model.type;
            } 

            /**
             * CoverUrl.
             */
            public Builder coverUrl(String coverUrl) {
                this.coverUrl = coverUrl;
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Clothes build() {
                return new Clothes(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProjectResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectResponseBody</p>
     */
    public static class Files extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CoverUrl")
        private String coverUrl;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Files(Builder builder) {
            this.coverUrl = builder.coverUrl;
            this.fileName = builder.fileName;
            this.id = builder.id;
            this.size = builder.size;
            this.type = builder.type;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Files create() {
            return builder().build();
        }

        /**
         * @return coverUrl
         */
        public String getCoverUrl() {
            return this.coverUrl;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String coverUrl; 
            private String fileName; 
            private String id; 
            private Long size; 
            private String type; 
            private String url; 

            private Builder() {
            } 

            private Builder(Files model) {
                this.coverUrl = model.coverUrl;
                this.fileName = model.fileName;
                this.id = model.id;
                this.size = model.size;
                this.type = model.type;
                this.url = model.url;
            } 

            /**
             * CoverUrl.
             */
            public Builder coverUrl(String coverUrl) {
                this.coverUrl = coverUrl;
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
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Files build() {
                return new Files(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProjectResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectResponseBody</p>
     */
    public static class Source extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Clothes")
        private java.util.List<Clothes> clothes;

        @com.aliyun.core.annotation.NameInMap("Files")
        private java.util.List<Files> files;

        @com.aliyun.core.annotation.NameInMap("OssKey")
        private String ossKey;

        private Source(Builder builder) {
            this.clothes = builder.clothes;
            this.files = builder.files;
            this.ossKey = builder.ossKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Source create() {
            return builder().build();
        }

        /**
         * @return clothes
         */
        public java.util.List<Clothes> getClothes() {
            return this.clothes;
        }

        /**
         * @return files
         */
        public java.util.List<Files> getFiles() {
            return this.files;
        }

        /**
         * @return ossKey
         */
        public String getOssKey() {
            return this.ossKey;
        }

        public static final class Builder {
            private java.util.List<Clothes> clothes; 
            private java.util.List<Files> files; 
            private String ossKey; 

            private Builder() {
            } 

            private Builder(Source model) {
                this.clothes = model.clothes;
                this.files = model.files;
                this.ossKey = model.ossKey;
            } 

            /**
             * Clothes.
             */
            public Builder clothes(java.util.List<Clothes> clothes) {
                this.clothes = clothes;
                return this;
            }

            /**
             * Files.
             */
            public Builder files(java.util.List<Files> files) {
                this.files = files;
                return this;
            }

            /**
             * OssKey.
             */
            public Builder ossKey(String ossKey) {
                this.ossKey = ossKey;
                return this;
            }

            public Source build() {
                return new Source(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProjectResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectResponseBody</p>
     */
    public static class User extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunUid")
        private String aliyunUid;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("Nickname")
        private String nickname;

        private User(Builder builder) {
            this.aliyunUid = builder.aliyunUid;
            this.createTime = builder.createTime;
            this.modifiedTime = builder.modifiedTime;
            this.nickname = builder.nickname;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static User create() {
            return builder().build();
        }

        /**
         * @return aliyunUid
         */
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return nickname
         */
        public String getNickname() {
            return this.nickname;
        }

        public static final class Builder {
            private String aliyunUid; 
            private String createTime; 
            private String modifiedTime; 
            private String nickname; 

            private Builder() {
            } 

            private Builder(User model) {
                this.aliyunUid = model.aliyunUid;
                this.createTime = model.createTime;
                this.modifiedTime = model.modifiedTime;
                this.nickname = model.nickname;
            } 

            /**
             * AliyunUid.
             */
            public Builder aliyunUid(String aliyunUid) {
                this.aliyunUid = aliyunUid;
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
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * Nickname.
             */
            public Builder nickname(String nickname) {
                this.nickname = nickname;
                return this;
            }

            public User build() {
                return new User(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProjectResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizUsage")
        private String bizUsage;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Dataset")
        private Dataset dataset;

        @com.aliyun.core.annotation.NameInMap("Ext")
        private String ext;

        @com.aliyun.core.annotation.NameInMap("ExtInfo")
        private java.util.Map<String, ?> extInfo;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Intro")
        private String intro;

        @com.aliyun.core.annotation.NameInMap("MaterialCoverUrl")
        private String materialCoverUrl;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("Source")
        private Source source;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("User")
        private User user;

        private Data(Builder builder) {
            this.bizUsage = builder.bizUsage;
            this.createTime = builder.createTime;
            this.dataset = builder.dataset;
            this.ext = builder.ext;
            this.extInfo = builder.extInfo;
            this.id = builder.id;
            this.intro = builder.intro;
            this.materialCoverUrl = builder.materialCoverUrl;
            this.modifiedTime = builder.modifiedTime;
            this.source = builder.source;
            this.status = builder.status;
            this.title = builder.title;
            this.type = builder.type;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bizUsage
         */
        public String getBizUsage() {
            return this.bizUsage;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataset
         */
        public Dataset getDataset() {
            return this.dataset;
        }

        /**
         * @return ext
         */
        public String getExt() {
            return this.ext;
        }

        /**
         * @return extInfo
         */
        public java.util.Map<String, ?> getExtInfo() {
            return this.extInfo;
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
         * @return materialCoverUrl
         */
        public String getMaterialCoverUrl() {
            return this.materialCoverUrl;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return source
         */
        public Source getSource() {
            return this.source;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return user
         */
        public User getUser() {
            return this.user;
        }

        public static final class Builder {
            private String bizUsage; 
            private String createTime; 
            private Dataset dataset; 
            private String ext; 
            private java.util.Map<String, ?> extInfo; 
            private String id; 
            private String intro; 
            private String materialCoverUrl; 
            private String modifiedTime; 
            private Source source; 
            private String status; 
            private String title; 
            private String type; 
            private User user; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.bizUsage = model.bizUsage;
                this.createTime = model.createTime;
                this.dataset = model.dataset;
                this.ext = model.ext;
                this.extInfo = model.extInfo;
                this.id = model.id;
                this.intro = model.intro;
                this.materialCoverUrl = model.materialCoverUrl;
                this.modifiedTime = model.modifiedTime;
                this.source = model.source;
                this.status = model.status;
                this.title = model.title;
                this.type = model.type;
                this.user = model.user;
            } 

            /**
             * BizUsage.
             */
            public Builder bizUsage(String bizUsage) {
                this.bizUsage = bizUsage;
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
             * Dataset.
             */
            public Builder dataset(Dataset dataset) {
                this.dataset = dataset;
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
             * ExtInfo.
             */
            public Builder extInfo(java.util.Map<String, ?> extInfo) {
                this.extInfo = extInfo;
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
             * MaterialCoverUrl.
             */
            public Builder materialCoverUrl(String materialCoverUrl) {
                this.materialCoverUrl = materialCoverUrl;
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
             * Source.
             */
            public Builder source(Source source) {
                this.source = source;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * User.
             */
            public Builder user(User user) {
                this.user = user;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
