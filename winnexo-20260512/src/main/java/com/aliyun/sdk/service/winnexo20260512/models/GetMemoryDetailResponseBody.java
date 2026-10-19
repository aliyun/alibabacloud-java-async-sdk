// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link GetMemoryDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetMemoryDetailResponseBody</p>
 */
public class GetMemoryDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("groups")
    private java.util.List<Groups> groups;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("profile")
    private Profile profile;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetMemoryDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.groups = builder.groups;
        this.message = builder.message;
        this.profile = builder.profile;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMemoryDetailResponseBody create() {
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
     * @return groups
     */
    public java.util.List<Groups> getGroups() {
        return this.groups;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return profile
     */
    public Profile getProfile() {
        return this.profile;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Groups> groups; 
        private String message; 
        private Profile profile; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetMemoryDetailResponseBody model) {
            this.code = model.code;
            this.groups = model.groups;
            this.message = model.message;
            this.profile = model.profile;
            this.requestId = model.requestId;
        } 

        /**
         * <p>业务状态码；成功为 200，失败时为对应错误码</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>自动拾取记忆的分组列表；无自动记忆时为空数组</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;type&quot;:&quot;user&quot;,&quot;items&quot;:[{&quot;id&quot;:&quot;user/example.md&quot;,&quot;title&quot;:&quot;示例偏好&quot;,&quot;content&quot;:&quot;喜欢简洁的回答&quot;,&quot;description&quot;:&quot;来自近期会话的偏好总结&quot;}],&quot;gmtModified&quot;:1720000000}]</p>
         */
        public Builder groups(java.util.List<Groups> groups) {
            this.groups = groups;
            return this;
        }

        /**
         * <p>错误描述；成功时为空字符串，失败时返回具体原因</p>
         * 
         * <strong>example:</strong>
         * <p>当前用户不是群组 cg_12345 的活跃成员</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>手动添加的记忆，来自 profile.md；包含完整内容、存在状态和修改时间</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;content&quot;:&quot;示例手动记忆&quot;,&quot;exists&quot;:true,&quot;gmtModified&quot;:1720000000}</p>
         */
        public Builder profile(Profile profile) {
            this.profile = profile;
            return this;
        }

        /**
         * <p>请求追踪 ID，用于定位本次调用</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMemoryDetailResponseBody build() {
            return new GetMemoryDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMemoryDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetMemoryDetailResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private Items(Builder builder) {
            this.content = builder.content;
            this.description = builder.description;
            this.id = builder.id;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String content; 
            private String description; 
            private String id; 
            private String title; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.content = model.content;
                this.description = model.description;
                this.id = model.id;
                this.title = model.title;
            } 

            /**
             * <p>自动记忆正文，不包含 YAML frontmatter</p>
             * 
             * <strong>example:</strong>
             * <p>喜欢简洁的回答</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>自动记忆的附加描述；没有时为空字符串</p>
             * 
             * <strong>example:</strong>
             * <p>来自近期会话的偏好总结</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>自动记忆条目的唯一标识，为相对 OSS 路径</p>
             * 
             * <strong>example:</strong>
             * <p>user/example.md</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>自动记忆标题，来自文件元数据或文件名</p>
             * 
             * <strong>example:</strong>
             * <p>示例偏好</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMemoryDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetMemoryDetailResponseBody</p>
     */
    public static class Groups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Groups(Builder builder) {
            this.gmtModified = builder.gmtModified;
            this.items = builder.items;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Groups create() {
            return builder().build();
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long gmtModified; 
            private java.util.List<Items> items; 
            private String type; 

            private Builder() {
            } 

            private Builder(Groups model) {
                this.gmtModified = model.gmtModified;
                this.items = model.items;
                this.type = model.type;
            } 

            /**
             * <p>该分组最近修改时间，Unix 秒级时间戳；无文件时为 null</p>
             * 
             * <strong>example:</strong>
             * <p>1720000000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>该类型下的自动记忆条目列表；没有条目时为空数组</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;id&quot;:&quot;user/example.md&quot;,&quot;title&quot;:&quot;示例偏好&quot;,&quot;content&quot;:&quot;喜欢简洁的回答&quot;,&quot;description&quot;:&quot;来自近期会话的偏好总结&quot;}]</p>
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>自动记忆类型：user、feedback、reference 或 project</p>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Groups build() {
                return new Groups(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMemoryDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetMemoryDetailResponseBody</p>
     */
    public static class Profile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("exists")
        private Boolean exists;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private Long gmtModified;

        private Profile(Builder builder) {
            this.content = builder.content;
            this.exists = builder.exists;
            this.gmtModified = builder.gmtModified;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Profile create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return exists
         */
        public Boolean getExists() {
            return this.exists;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public static final class Builder {
            private String content; 
            private Boolean exists; 
            private Long gmtModified; 

            private Builder() {
            } 

            private Builder(Profile model) {
                this.content = model.content;
                this.exists = model.exists;
                this.gmtModified = model.gmtModified;
            } 

            /**
             * <p>手动记忆的完整正文；未保存过时为空字符串</p>
             * 
             * <strong>example:</strong>
             * <p>示例手动记忆</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>profile.md 是否存在；未保存过时为 false</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder exists(Boolean exists) {
                this.exists = exists;
                return this;
            }

            /**
             * <p>profile.md 最近修改时间，Unix 秒级时间戳；文件不存在或无法取得元数据时为 null</p>
             * 
             * <strong>example:</strong>
             * <p>1720000000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            public Profile build() {
                return new Profile(this);
            } 

        } 

    }
}
