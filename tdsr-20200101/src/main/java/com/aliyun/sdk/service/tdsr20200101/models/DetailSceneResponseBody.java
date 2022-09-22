// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetailSceneResponseBody} extends {@link TeaModel}
 *
 * <p>DetailSceneResponseBody</p>
 */
public class DetailSceneResponseBody extends TeaModel {
    @NameInMap("Captures")
    private java.util.List < Captures> captures;

    @NameInMap("Code")
    private Long code;

    @NameInMap("CoverUrl")
    private String coverUrl;

    @NameInMap("FloorPlans")
    private java.util.List < FloorPlans> floorPlans;

    @NameInMap("GmtCreate")
    private Long gmtCreate;

    @NameInMap("GmtModified")
    private Long gmtModified;

    @NameInMap("Id")
    private String id;

    @NameInMap("Message")
    private String message;

    @NameInMap("Name")
    private String name;

    @NameInMap("PreviewToken")
    private String previewToken;

    @NameInMap("Published")
    private Boolean published;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SourceNum")
    private Long sourceNum;

    @NameInMap("Status")
    private String status;

    @NameInMap("StatusName")
    private String statusName;

    @NameInMap("SubSceneNum")
    private Long subSceneNum;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Type")
    private String type;

    private DetailSceneResponseBody(Builder builder) {
        this.captures = builder.captures;
        this.code = builder.code;
        this.coverUrl = builder.coverUrl;
        this.floorPlans = builder.floorPlans;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
        this.message = builder.message;
        this.name = builder.name;
        this.previewToken = builder.previewToken;
        this.published = builder.published;
        this.requestId = builder.requestId;
        this.sourceNum = builder.sourceNum;
        this.status = builder.status;
        this.statusName = builder.statusName;
        this.subSceneNum = builder.subSceneNum;
        this.success = builder.success;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetailSceneResponseBody create() {
        return builder().build();
    }

    /**
     * @return captures
     */
    public java.util.List < Captures> getCaptures() {
        return this.captures;
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return coverUrl
     */
    public String getCoverUrl() {
        return this.coverUrl;
    }

    /**
     * @return floorPlans
     */
    public java.util.List < FloorPlans> getFloorPlans() {
        return this.floorPlans;
    }

    /**
     * @return gmtCreate
     */
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public Long getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return previewToken
     */
    public String getPreviewToken() {
        return this.previewToken;
    }

    /**
     * @return published
     */
    public Boolean getPublished() {
        return this.published;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sourceNum
     */
    public Long getSourceNum() {
        return this.sourceNum;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return statusName
     */
    public String getStatusName() {
        return this.statusName;
    }

    /**
     * @return subSceneNum
     */
    public Long getSubSceneNum() {
        return this.subSceneNum;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private java.util.List < Captures> captures; 
        private Long code; 
        private String coverUrl; 
        private java.util.List < FloorPlans> floorPlans; 
        private Long gmtCreate; 
        private Long gmtModified; 
        private String id; 
        private String message; 
        private String name; 
        private String previewToken; 
        private Boolean published; 
        private String requestId; 
        private Long sourceNum; 
        private String status; 
        private String statusName; 
        private Long subSceneNum; 
        private Boolean success; 
        private String type; 

        /**
         * 实勘图列表
         */
        public Builder captures(java.util.List < Captures> captures) {
            this.captures = captures;
            return this;
        }

        /**
         * 返回码
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * 封面地址
         */
        public Builder coverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }

        /**
         * FloorPlans.
         */
        public Builder floorPlans(java.util.List < FloorPlans> floorPlans) {
            this.floorPlans = floorPlans;
            return this;
        }

        /**
         * 创建时间
         */
        public Builder gmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * 最后修改时间
         */
        public Builder gmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * 主场景Id
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * 错误消息
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 场景名称
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * 预览Token
         */
        public Builder previewToken(String previewToken) {
            this.previewToken = previewToken;
            return this;
        }

        /**
         * 是否已发布 true：已发布：false：未发布
         */
        public Builder published(Boolean published) {
            this.published = published;
            return this;
        }

        /**
         * 请求ID，与入参requestId对应
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 资源数
         */
        public Builder sourceNum(Long sourceNum) {
            this.sourceNum = sourceNum;
            return this;
        }

        /**
         * 场景状态，init：初始化，published：已发布，publishing：发布中，copying：复制中，making：制作中，publishable：构建成功，makeFailed：制作失败
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * 状态名称
         */
        public Builder statusName(String statusName) {
            this.statusName = statusName;
            return this;
        }

        /**
         * 子场景数
         */
        public Builder subSceneNum(Long subSceneNum) {
            this.subSceneNum = subSceneNum;
            return this;
        }

        /**
         * 是否请求成功
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * 场景类型
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public DetailSceneResponseBody build() {
            return new DetailSceneResponseBody(this);
        } 

    } 

    public static class Captures extends TeaModel {
        @NameInMap("Title")
        private String title;

        @NameInMap("Url")
        private String url;

        private Captures(Builder builder) {
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Captures create() {
            return builder().build();
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String title; 
            private String url; 

            /**
             * 图片名称
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * 实勘图url
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Captures build() {
                return new Captures(this);
            } 

        } 

    }
    public static class FloorPlans extends TeaModel {
        @NameInMap("ColorMapUrl")
        private String colorMapUrl;

        @NameInMap("FloorLabel")
        private String floorLabel;

        @NameInMap("FloorName")
        private String floorName;

        @NameInMap("MiniMapUrl")
        private String miniMapUrl;

        private FloorPlans(Builder builder) {
            this.colorMapUrl = builder.colorMapUrl;
            this.floorLabel = builder.floorLabel;
            this.floorName = builder.floorName;
            this.miniMapUrl = builder.miniMapUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FloorPlans create() {
            return builder().build();
        }

        /**
         * @return colorMapUrl
         */
        public String getColorMapUrl() {
            return this.colorMapUrl;
        }

        /**
         * @return floorLabel
         */
        public String getFloorLabel() {
            return this.floorLabel;
        }

        /**
         * @return floorName
         */
        public String getFloorName() {
            return this.floorName;
        }

        /**
         * @return miniMapUrl
         */
        public String getMiniMapUrl() {
            return this.miniMapUrl;
        }

        public static final class Builder {
            private String colorMapUrl; 
            private String floorLabel; 
            private String floorName; 
            private String miniMapUrl; 

            /**
             * 彩色图地址
             */
            public Builder colorMapUrl(String colorMapUrl) {
                this.colorMapUrl = colorMapUrl;
                return this;
            }

            /**
             * 楼层索引
             */
            public Builder floorLabel(String floorLabel) {
                this.floorLabel = floorLabel;
                return this;
            }

            /**
             * 楼层名称
             */
            public Builder floorName(String floorName) {
                this.floorName = floorName;
                return this;
            }

            /**
             * 黑白图地址
             */
            public Builder miniMapUrl(String miniMapUrl) {
                this.miniMapUrl = miniMapUrl;
                return this;
            }

            public FloorPlans build() {
                return new FloorPlans(this);
            } 

        } 

    }
}
