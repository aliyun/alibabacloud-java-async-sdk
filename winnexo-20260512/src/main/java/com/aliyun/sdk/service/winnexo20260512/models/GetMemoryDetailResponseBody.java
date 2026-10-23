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
         * <p>The business status code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The list of groups for automatically collected memories. If no automatic memories exist, an empty array is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;type&quot;:&quot;user&quot;,&quot;items&quot;:[{&quot;id&quot;:&quot;user/example.md&quot;,&quot;title&quot;:&quot;Sample preference&quot;,&quot;content&quot;:&quot;Prefers concise answers&quot;,&quot;description&quot;:&quot;Preference summary from recent conversations&quot;}],&quot;gmtModified&quot;:1720000000}]</p>
         */
        public Builder groups(java.util.List<Groups> groups) {
            this.groups = groups;
            return this;
        }

        /**
         * <p>The error description.</p>
         * 
         * <strong>example:</strong>
         * <p>The current user is not an active member of the group cg_12345</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The manually added memory from profile.md. It includes the full content, existence status, and modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;content&quot;:&quot;Sample manual memory&quot;,&quot;exists&quot;:true,&quot;gmtModified&quot;:1720000000}</p>
         */
        public Builder profile(Profile profile) {
            this.profile = profile;
            return this;
        }

        /**
         * <p>The request tracking ID.</p>
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
             * <p>The body of the automatic memory, excluding the YAML frontmatter.</p>
             * 
             * <strong>example:</strong>
             * <p>Prefers concise answers</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The additional description of the automatic memory. If no description is available, an empty string is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>Preference summary from recent conversations</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The unique identifier of the automatic memory entry, which is a relative OSS path.</p>
             * 
             * <strong>example:</strong>
             * <p>user/example.md</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The title of the automatic memory, which is derived from the file metadata or file name.</p>
             * 
             * <strong>example:</strong>
             * <p>Sample preference</p>
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
             * <p>The last modification time of the group. The value is a UNIX timestamp in seconds. If no files exist, null is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1720000000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The list of automatic memory entries under this type. If no entries exist, an empty array is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;id&quot;:&quot;user/example.md&quot;,&quot;title&quot;:&quot;Sample preference&quot;,&quot;content&quot;:&quot;Prefers concise answers&quot;,&quot;description&quot;:&quot;Preference summary from recent conversations&quot;}]</p>
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The type of the automatic memory. Valid values: user, feedback, reference, and project.</p>
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
             * <p>The full body of the manual memory. If the memory has never been saved, an empty string is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>Sample manual memory</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>Indicates whether profile.md exists. If the memory has never been saved, false is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder exists(Boolean exists) {
                this.exists = exists;
                return this;
            }

            /**
             * <p>The last modification time of profile.md. The value is a UNIX timestamp in seconds. If the file does not exist or its metadata cannot be obtained, null is returned.</p>
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
