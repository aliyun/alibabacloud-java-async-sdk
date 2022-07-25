// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSceneResponseBody} extends {@link TeaModel}
 *
 * <p>ListSceneResponseBody</p>
 */
public class ListSceneResponseBody extends TeaModel {
    @NameInMap("Code")
    private Long code;

    @NameInMap("Count")
    private Long count;

    @NameInMap("CurrentPage")
    private Long currentPage;

    @NameInMap("HasNext")
    private Boolean hasNext;

    @NameInMap("List")
    private java.util.List < List> list;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalPage")
    private Long totalPage;

    private ListSceneResponseBody(Builder builder) {
        this.code = builder.code;
        this.count = builder.count;
        this.currentPage = builder.currentPage;
        this.hasNext = builder.hasNext;
        this.list = builder.list;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSceneResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return hasNext
     */
    public Boolean getHasNext() {
        return this.hasNext;
    }

    /**
     * @return list
     */
    public java.util.List < List> getList() {
        return this.list;
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

    /**
     * @return totalPage
     */
    public Long getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private Long code; 
        private Long count; 
        private Long currentPage; 
        private Boolean hasNext; 
        private java.util.List < List> list; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private Long totalPage; 

        /**
         * 返回码
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * 数据总数
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * 当前页
         */
        public Builder currentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * 是否有下一页
         */
        public Builder hasNext(Boolean hasNext) {
            this.hasNext = hasNext;
            return this;
        }

        /**
         * 主场景数据
         */
        public Builder list(java.util.List < List> list) {
            this.list = list;
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
         * 请求ID，与入参requestId对应
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         * 总页数
         */
        public Builder totalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public ListSceneResponseBody build() {
            return new ListSceneResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("CoverUrl")
        private String coverUrl;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
        private String name;

        @NameInMap("PreviewToken")
        private String previewToken;

        @NameInMap("Published")
        private Boolean published;

        @NameInMap("SourceNum")
        private Long sourceNum;

        @NameInMap("Status")
        private String status;

        @NameInMap("StatusName")
        private String statusName;

        @NameInMap("SubSceneNum")
        private Long subSceneNum;

        @NameInMap("Type")
        private String type;

        private List(Builder builder) {
            this.coverUrl = builder.coverUrl;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.name = builder.name;
            this.previewToken = builder.previewToken;
            this.published = builder.published;
            this.sourceNum = builder.sourceNum;
            this.status = builder.status;
            this.statusName = builder.statusName;
            this.subSceneNum = builder.subSceneNum;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return coverUrl
         */
        public String getCoverUrl() {
            return this.coverUrl;
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
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String coverUrl; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String id; 
            private String name; 
            private String previewToken; 
            private Boolean published; 
            private Long sourceNum; 
            private String status; 
            private String statusName; 
            private Long subSceneNum; 
            private String type; 

            /**
             * 封面地址
             */
            public Builder coverUrl(String coverUrl) {
                this.coverUrl = coverUrl;
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
             * 场景类型 3D模型：MODEL_3D  全景图片：PIC  全景视频：VIDEO
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
