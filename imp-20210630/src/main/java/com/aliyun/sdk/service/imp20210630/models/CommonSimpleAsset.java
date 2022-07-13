// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CommonSimpleAsset} extends {@link TeaModel}
 *
 * <p>CommonSimpleAsset</p>
 */
public class CommonSimpleAsset extends TeaModel {
    @NameInMap("Address")
    private CommonAddress address;

    @NameInMap("AppId")
    private String appId;

    @NameInMap("AuditStatus")
    private String auditStatus;

    @NameInMap("Author")
    private String author;

    @NameInMap("Description")
    private String description;

    @NameInMap("Extends")
    private java.util.Map < String, ? > _extends;

    @NameInMap("Id")
    private String id;

    @NameInMap("Image")
    private CommonMediaResource image;

    @NameInMap("Labels")
    private java.util.Map < String, ? > labels;

    @NameInMap("Location")
    private TypeLatLng location;

    @NameInMap("Source")
    private String source;

    @NameInMap("Status")
    private String status;

    @NameInMap("Synopsis")
    private String synopsis;

    @NameInMap("Tags")
    private java.util.List < String > tags;

    @NameInMap("Title")
    private String title;

    @NameInMap("Video")
    private CommonMediaResource video;

    private CommonSimpleAsset(Builder builder) {
        this.address = builder.address;
        this.appId = builder.appId;
        this.auditStatus = builder.auditStatus;
        this.author = builder.author;
        this.description = builder.description;
        this._extends = builder._extends;
        this.id = builder.id;
        this.image = builder.image;
        this.labels = builder.labels;
        this.location = builder.location;
        this.source = builder.source;
        this.status = builder.status;
        this.synopsis = builder.synopsis;
        this.tags = builder.tags;
        this.title = builder.title;
        this.video = builder.video;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CommonSimpleAsset create() {
        return builder().build();
    }

    /**
     * @return address
     */
    public CommonAddress getAddress() {
        return this.address;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return auditStatus
     */
    public String getAuditStatus() {
        return this.auditStatus;
    }

    /**
     * @return author
     */
    public String getAuthor() {
        return this.author;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return _extends
     */
    public java.util.Map < String, ? > get_extends() {
        return this._extends;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return image
     */
    public CommonMediaResource getImage() {
        return this.image;
    }

    /**
     * @return labels
     */
    public java.util.Map < String, ? > getLabels() {
        return this.labels;
    }

    /**
     * @return location
     */
    public TypeLatLng getLocation() {
        return this.location;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return synopsis
     */
    public String getSynopsis() {
        return this.synopsis;
    }

    /**
     * @return tags
     */
    public java.util.List < String > getTags() {
        return this.tags;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return video
     */
    public CommonMediaResource getVideo() {
        return this.video;
    }

    public static final class Builder {
        private CommonAddress address; 
        private String appId; 
        private String auditStatus; 
        private String author; 
        private String description; 
        private java.util.Map < String, ? > _extends; 
        private String id; 
        private CommonMediaResource image; 
        private java.util.Map < String, ? > labels; 
        private TypeLatLng location; 
        private String source; 
        private String status; 
        private String synopsis; 
        private java.util.List < String > tags; 
        private String title; 
        private CommonMediaResource video; 

        /**
         * 行政区域地址
         */
        public Builder address(CommonAddress address) {
            this.address = address;
            return this;
        }

        /**
         * 应用ID
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * 审核状态
         */
        public Builder auditStatus(String auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }

        /**
         * 审核状态
         */
        public Builder auditStatus(CommonAuditStatus auditStatus) {
            this.auditStatus = auditStatus.getValue();
            return this;
        }

        /**
         * 作者
         */
        public Builder author(String author) {
            this.author = author;
            return this;
        }

        /**
         * 资产描述
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * 扩展字段
         */
        public Builder _extends(java.util.Map < String, ? > _extends) {
            this._extends = _extends;
            return this;
        }

        /**
         * 资产ID
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * 图像资源
         */
        public Builder image(CommonMediaResource image) {
            this.image = image;
            return this;
        }

        /**
         * 定义Label， eg:type:advertise 支持广告类型的label
         */
        public Builder labels(java.util.Map < String, ? > labels) {
            this.labels = labels;
            return this;
        }

        /**
         * 经纬度地理位置
         */
        public Builder location(TypeLatLng location) {
            this.location = location;
            return this;
        }

        /**
         * 资产来源
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * 资产来源
         */
        public Builder source(CommonAssetSource source) {
            this.source = source.getValue();
            return this;
        }

        /**
         * 资产状态
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * 资产状态
         */
        public Builder status(CommonAssetStatus status) {
            this.status = status.getValue();
            return this;
        }

        /**
         * 概要
         */
        public Builder synopsis(String synopsis) {
            this.synopsis = synopsis;
            return this;
        }

        /**
         * 标签
         */
        public Builder tags(java.util.List < String > tags) {
            this.tags = tags;
            return this;
        }

        /**
         * 标题
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * 视频资源
         */
        public Builder video(CommonMediaResource video) {
            this.video = video;
            return this;
        }

        public CommonSimpleAsset build() {
            return new CommonSimpleAsset(this);
        } 

    } 

}
