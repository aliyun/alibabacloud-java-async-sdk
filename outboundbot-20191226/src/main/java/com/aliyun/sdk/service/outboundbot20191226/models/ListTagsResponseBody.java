// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link ListTagsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTagsResponseBody</p>
 */
public class ListTagsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TagGroups")
    private java.util.List<TagGroups> tagGroups;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    private ListTagsResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.tagGroups = builder.tagGroups;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTagsResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
     * @return tagGroups
     */
    public java.util.List<TagGroups> getTagGroups() {
        return this.tagGroups;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private java.util.List<TagGroups> tagGroups; 
        private java.util.List<Tags> tags; 

        private Builder() {
        } 

        private Builder(ListTagsResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.tagGroups = model.tagGroups;
            this.tags = model.tags;
        } 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The list of tag groups.</p>
         */
        public Builder tagGroups(java.util.List<TagGroups> tagGroups) {
            this.tagGroups = tagGroups;
            return this;
        }

        /**
         * <p>The list of tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        public ListTagsResponseBody build() {
            return new ListTagsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTagsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTagsResponseBody</p>
     */
    public static class TagGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ScriptId")
        private String scriptId;

        @com.aliyun.core.annotation.NameInMap("TagGroup")
        private String tagGroup;

        @com.aliyun.core.annotation.NameInMap("TagGroupId")
        private String tagGroupId;

        @com.aliyun.core.annotation.NameInMap("TagGroupIndex")
        private Integer tagGroupIndex;

        private TagGroups(Builder builder) {
            this.scriptId = builder.scriptId;
            this.tagGroup = builder.tagGroup;
            this.tagGroupId = builder.tagGroupId;
            this.tagGroupIndex = builder.tagGroupIndex;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagGroups create() {
            return builder().build();
        }

        /**
         * @return scriptId
         */
        public String getScriptId() {
            return this.scriptId;
        }

        /**
         * @return tagGroup
         */
        public String getTagGroup() {
            return this.tagGroup;
        }

        /**
         * @return tagGroupId
         */
        public String getTagGroupId() {
            return this.tagGroupId;
        }

        /**
         * @return tagGroupIndex
         */
        public Integer getTagGroupIndex() {
            return this.tagGroupIndex;
        }

        public static final class Builder {
            private String scriptId; 
            private String tagGroup; 
            private String tagGroupId; 
            private Integer tagGroupIndex; 

            private Builder() {
            } 

            private Builder(TagGroups model) {
                this.scriptId = model.scriptId;
                this.tagGroup = model.tagGroup;
                this.tagGroupId = model.tagGroupId;
                this.tagGroupIndex = model.tagGroupIndex;
            } 

            /**
             * <p>The ID of the script.</p>
             * 
             * <strong>example:</strong>
             * <p>365b955d-6f4d-4ab5-a6e1-9a301307f4b1</p>
             */
            public Builder scriptId(String scriptId) {
                this.scriptId = scriptId;
                return this;
            }

            /**
             * <p>The name of the tag group.</p>
             * 
             * <strong>example:</strong>
             * <p>当前学历</p>
             */
            public Builder tagGroup(String tagGroup) {
                this.tagGroup = tagGroup;
                return this;
            }

            /**
             * <p>The ID of the tag group.</p>
             * 
             * <strong>example:</strong>
             * <p>38c03261-9fe8-4b9b-8c3b-983a60319012</p>
             */
            public Builder tagGroupId(String tagGroupId) {
                this.tagGroupId = tagGroupId;
                return this;
            }

            /**
             * <p>The index of the tag group.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder tagGroupIndex(Integer tagGroupIndex) {
                this.tagGroupIndex = tagGroupIndex;
                return this;
            }

            public TagGroups build() {
                return new TagGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTagsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTagsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ScriptId")
        private String scriptId;

        @com.aliyun.core.annotation.NameInMap("TagGroup")
        private String tagGroup;

        @com.aliyun.core.annotation.NameInMap("TagId")
        private String tagId;

        @com.aliyun.core.annotation.NameInMap("TagIndex")
        private Integer tagIndex;

        @com.aliyun.core.annotation.NameInMap("TagName")
        private String tagName;

        private Tags(Builder builder) {
            this.scriptId = builder.scriptId;
            this.tagGroup = builder.tagGroup;
            this.tagId = builder.tagId;
            this.tagIndex = builder.tagIndex;
            this.tagName = builder.tagName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return scriptId
         */
        public String getScriptId() {
            return this.scriptId;
        }

        /**
         * @return tagGroup
         */
        public String getTagGroup() {
            return this.tagGroup;
        }

        /**
         * @return tagId
         */
        public String getTagId() {
            return this.tagId;
        }

        /**
         * @return tagIndex
         */
        public Integer getTagIndex() {
            return this.tagIndex;
        }

        /**
         * @return tagName
         */
        public String getTagName() {
            return this.tagName;
        }

        public static final class Builder {
            private String scriptId; 
            private String tagGroup; 
            private String tagId; 
            private Integer tagIndex; 
            private String tagName; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.scriptId = model.scriptId;
                this.tagGroup = model.tagGroup;
                this.tagId = model.tagId;
                this.tagIndex = model.tagIndex;
                this.tagName = model.tagName;
            } 

            /**
             * <p>The ID of the script.</p>
             * 
             * <strong>example:</strong>
             * <p>8a4c6d3d-5ed6-44ca-b779-16c20f8862be</p>
             */
            public Builder scriptId(String scriptId) {
                this.scriptId = scriptId;
                return this;
            }

            /**
             * <p>The name of the tag group.</p>
             * 
             * <strong>example:</strong>
             * <p>当前学历</p>
             */
            public Builder tagGroup(String tagGroup) {
                this.tagGroup = tagGroup;
                return this;
            }

            /**
             * <p>The ID of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>d62be647-6202-4b1f-9708-0baeec552635</p>
             */
            public Builder tagId(String tagId) {
                this.tagId = tagId;
                return this;
            }

            /**
             * <p>The index of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder tagIndex(Integer tagIndex) {
                this.tagIndex = tagIndex;
                return this;
            }

            /**
             * <p>The name of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>本科</p>
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
