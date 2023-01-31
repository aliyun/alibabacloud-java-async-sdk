// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTagGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyTagGroupsResponseBody</p>
 */
public class ModifyTagGroupsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TagGroups")
    private java.util.List < TagGroups> tagGroups;

    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    private ModifyTagGroupsResponseBody(Builder builder) {
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

    public static ModifyTagGroupsResponseBody create() {
        return builder().build();
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
    public java.util.List < TagGroups> getTagGroups() {
        return this.tagGroups;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private java.util.List < TagGroups> tagGroups; 
        private java.util.List < Tags> tags; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         * TagGroups.
         */
        public Builder tagGroups(java.util.List < TagGroups> tagGroups) {
            this.tagGroups = tagGroups;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.tags = tags;
            return this;
        }

        public ModifyTagGroupsResponseBody build() {
            return new ModifyTagGroupsResponseBody(this);
        } 

    } 

    public static class TagGroups extends TeaModel {
        @NameInMap("ScriptId")
        private String scriptId;

        @NameInMap("TagGroup")
        private String tagGroup;

        @NameInMap("TagGroupId")
        private String tagGroupId;

        @NameInMap("TagGroupIndex")
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

            /**
             * ScriptId.
             */
            public Builder scriptId(String scriptId) {
                this.scriptId = scriptId;
                return this;
            }

            /**
             * TagGroup.
             */
            public Builder tagGroup(String tagGroup) {
                this.tagGroup = tagGroup;
                return this;
            }

            /**
             * TagGroupId.
             */
            public Builder tagGroupId(String tagGroupId) {
                this.tagGroupId = tagGroupId;
                return this;
            }

            /**
             * TagGroupIndex.
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
    public static class Tags extends TeaModel {
        @NameInMap("ScriptId")
        private String scriptId;

        @NameInMap("TagGroup")
        private String tagGroup;

        @NameInMap("TagId")
        private String tagId;

        @NameInMap("TagIndex")
        private Integer tagIndex;

        @NameInMap("TagName")
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

            /**
             * ScriptId.
             */
            public Builder scriptId(String scriptId) {
                this.scriptId = scriptId;
                return this;
            }

            /**
             * TagGroup.
             */
            public Builder tagGroup(String tagGroup) {
                this.tagGroup = tagGroup;
                return this;
            }

            /**
             * TagId.
             */
            public Builder tagId(String tagId) {
                this.tagId = tagId;
                return this;
            }

            /**
             * TagIndex.
             */
            public Builder tagIndex(Integer tagIndex) {
                this.tagIndex = tagIndex;
                return this;
            }

            /**
             * TagName.
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
