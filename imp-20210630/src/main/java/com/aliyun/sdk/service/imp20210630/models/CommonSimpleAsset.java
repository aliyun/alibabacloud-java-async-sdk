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
         * ??????????????????
         */
        public Builder address(CommonAddress address) {
            this.address = address;
            return this;
        }

        /**
         * ??????ID
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * ????????????
         */
        public Builder auditStatus(String auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }

        /**
         * ????????????
         */
        public Builder auditStatus(CommonAuditStatus auditStatus) {
            this.auditStatus = auditStatus.getValue();
            return this;
        }

        /**
         * ??????
         */
        public Builder author(String author) {
            this.author = author;
            return this;
        }

        /**
         * ????????????
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * ????????????
         */
        public Builder _extends(java.util.Map < String, ? > _extends) {
            this._extends = _extends;
            return this;
        }

        /**
         * ??????ID
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * ????????????
         */
        public Builder image(CommonMediaResource image) {
            this.image = image;
            return this;
        }

        /**
         * ??????Label??? eg:type:advertise ?????????????????????label
         */
        public Builder labels(java.util.Map < String, ? > labels) {
            this.labels = labels;
            return this;
        }

        /**
         * ?????????????????????
         */
        public Builder location(TypeLatLng location) {
            this.location = location;
            return this;
        }

        /**
         * ????????????
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * ????????????
         */
        public Builder source(CommonAssetSource source) {
            this.source = source.getValue();
            return this;
        }

        /**
         * ????????????
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * ????????????
         */
        public Builder status(CommonAssetStatus status) {
            this.status = status.getValue();
            return this;
        }

        /**
         * ??????
         */
        public Builder synopsis(String synopsis) {
            this.synopsis = synopsis;
            return this;
        }

        /**
         * ??????
         */
        public Builder tags(java.util.List < String > tags) {
            this.tags = tags;
            return this;
        }

        /**
         * ??????
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * ????????????
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
