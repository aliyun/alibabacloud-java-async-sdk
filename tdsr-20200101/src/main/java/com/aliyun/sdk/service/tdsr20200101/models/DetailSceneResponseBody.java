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
    @NameInMap("Code")
    private Long code;

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

    @NameInMap("SubSceneNum")
    private Long subSceneNum;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Type")
    private String type;

    private DetailSceneResponseBody(Builder builder) {
        this.code = builder.code;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
        this.message = builder.message;
        this.name = builder.name;
        this.previewToken = builder.previewToken;
        this.published = builder.published;
        this.requestId = builder.requestId;
        this.sourceNum = builder.sourceNum;
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
     * @return code
     */
    public Long getCode() {
        return this.code;
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
        private Long code; 
        private Long gmtCreate; 
        private Long gmtModified; 
        private String id; 
        private String message; 
        private String name; 
        private String previewToken; 
        private Boolean published; 
        private String requestId; 
        private Long sourceNum; 
        private Long subSceneNum; 
        private Boolean success; 
        private String type; 

        /**
         * 返回码
         */
        public Builder code(Long code) {
            this.code = code;
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

}
