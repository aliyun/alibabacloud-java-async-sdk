// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetailSubSceneResponseBody} extends {@link TeaModel}
 *
 * <p>DetailSubSceneResponseBody</p>
 */
public class DetailSubSceneResponseBody extends TeaModel {
    @NameInMap("Code")
    private Long code;

    @NameInMap("CoverUrl")
    private String coverUrl;

    @NameInMap("CubemapPath")
    private String cubemapPath;

    @NameInMap("GmtCreate")
    private Long gmtCreate;

    @NameInMap("GmtModified")
    private Long gmtModified;

    @NameInMap("Id")
    private String id;

    @NameInMap("ImageUrl")
    private String imageUrl;

    @NameInMap("LayoutData")
    private String layoutData;

    @NameInMap("Message")
    private String message;

    @NameInMap("Name")
    private String name;

    @NameInMap("OriginUrl")
    private String originUrl;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceId")
    private String resourceId;

    @NameInMap("Status")
    private Long status;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Type")
    private String type;

    @NameInMap("Url")
    private String url;

    private DetailSubSceneResponseBody(Builder builder) {
        this.code = builder.code;
        this.coverUrl = builder.coverUrl;
        this.cubemapPath = builder.cubemapPath;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
        this.imageUrl = builder.imageUrl;
        this.layoutData = builder.layoutData;
        this.message = builder.message;
        this.name = builder.name;
        this.originUrl = builder.originUrl;
        this.requestId = builder.requestId;
        this.resourceId = builder.resourceId;
        this.status = builder.status;
        this.success = builder.success;
        this.type = builder.type;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetailSubSceneResponseBody create() {
        return builder().build();
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
     * @return cubemapPath
     */
    public String getCubemapPath() {
        return this.cubemapPath;
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
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return layoutData
     */
    public String getLayoutData() {
        return this.layoutData;
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
     * @return originUrl
     */
    public String getOriginUrl() {
        return this.originUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return status
     */
    public Long getStatus() {
        return this.status;
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

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private Long code; 
        private String coverUrl; 
        private String cubemapPath; 
        private Long gmtCreate; 
        private Long gmtModified; 
        private String id; 
        private String imageUrl; 
        private String layoutData; 
        private String message; 
        private String name; 
        private String originUrl; 
        private String requestId; 
        private String resourceId; 
        private Long status; 
        private Boolean success; 
        private String type; 
        private String url; 

        /**
         * 返回码
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * 图片路径/视频封面路径
         */
        public Builder coverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }

        /**
         * 切图路径
         */
        public Builder cubemapPath(String cubemapPath) {
            this.cubemapPath = cubemapPath;
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
         * 子场景id
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * 矫正后图的路径
         */
        public Builder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * 墙线标注数据
         */
        public Builder layoutData(String layoutData) {
            this.layoutData = layoutData;
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
         * 子场景名称
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * 原图路径
         */
        public Builder originUrl(String originUrl) {
            this.originUrl = originUrl;
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
         * 图片ID/视频ID
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * 子场景状态
         */
        public Builder status(Long status) {
            this.status = status;
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
         * 资源类型
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * 图片路径/视频路径
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public DetailSubSceneResponseBody build() {
            return new DetailSubSceneResponseBody(this);
        } 

    } 

}
