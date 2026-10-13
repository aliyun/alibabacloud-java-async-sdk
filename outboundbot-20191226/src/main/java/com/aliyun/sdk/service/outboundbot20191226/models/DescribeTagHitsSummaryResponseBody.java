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
 * {@link DescribeTagHitsSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTagHitsSummaryResponseBody</p>
 */
public class DescribeTagHitsSummaryResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("TagHitsList")
    private java.util.List<TagHitsList> tagHitsList;

    private DescribeTagHitsSummaryResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.tagGroups = builder.tagGroups;
        this.tagHitsList = builder.tagHitsList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTagHitsSummaryResponseBody create() {
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
     * @return tagHitsList
     */
    public java.util.List<TagHitsList> getTagHitsList() {
        return this.tagHitsList;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private java.util.List<TagGroups> tagGroups; 
        private java.util.List<TagHitsList> tagHitsList; 

        private Builder() {
        } 

        private Builder(DescribeTagHitsSummaryResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.tagGroups = model.tagGroups;
            this.tagHitsList = model.tagHitsList;
        } 

        /**
         * <p>The response code. <code>OK</code> indicates a successful request.</p>
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
         * <p>5391EB13-A0E7-402D-A407-B99D4ABAF22A</p>
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
         * <p>A list of tag groups.</p>
         */
        public Builder tagGroups(java.util.List<TagGroups> tagGroups) {
            this.tagGroups = tagGroups;
            return this;
        }

        /**
         * <p>A list of tag hit statistics.</p>
         */
        public Builder tagHitsList(java.util.List<TagHitsList> tagHitsList) {
            this.tagHitsList = tagHitsList;
            return this;
        }

        public DescribeTagHitsSummaryResponseBody build() {
            return new DescribeTagHitsSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTagHitsSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTagHitsSummaryResponseBody</p>
     */
    public static class TagGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("ScriptId")
        private String scriptId;

        @com.aliyun.core.annotation.NameInMap("TagGroup")
        private String tagGroup;

        @com.aliyun.core.annotation.NameInMap("TagGroupIndex")
        private Integer tagGroupIndex;

        private TagGroups(Builder builder) {
            this.id = builder.id;
            this.scriptId = builder.scriptId;
            this.tagGroup = builder.tagGroup;
            this.tagGroupIndex = builder.tagGroupIndex;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagGroups create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
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
         * @return tagGroupIndex
         */
        public Integer getTagGroupIndex() {
            return this.tagGroupIndex;
        }

        public static final class Builder {
            private String id; 
            private String scriptId; 
            private String tagGroup; 
            private Integer tagGroupIndex; 

            private Builder() {
            } 

            private Builder(TagGroups model) {
                this.id = model.id;
                this.scriptId = model.scriptId;
                this.tagGroup = model.tagGroup;
                this.tagGroupIndex = model.tagGroupIndex;
            } 

            /**
             * <p>The ID of the tag group.</p>
             * 
             * <strong>example:</strong>
             * <p>8bb6f8ca-85a3-49f8-86a5-3127902a2156</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The script ID.</p>
             * 
             * <strong>example:</strong>
             * <p>8a4c6d3d-5ed6-44ca-b779-16c20f8862be</p>
             */
            public Builder scriptId(String scriptId) {
                this.scriptId = scriptId;
                return this;
            }

            /**
             * <p>The tag group name.</p>
             * 
             * <strong>example:</strong>
             * <p>标签组</p>
             */
            public Builder tagGroup(String tagGroup) {
                this.tagGroup = tagGroup;
                return this;
            }

            /**
             * <p>The index of the tag group.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
     * {@link DescribeTagHitsSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTagHitsSummaryResponseBody</p>
     */
    public static class TagHitsList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HitCount")
        private Integer hitCount;

        @com.aliyun.core.annotation.NameInMap("TagGroup")
        private String tagGroup;

        @com.aliyun.core.annotation.NameInMap("TagName")
        private String tagName;

        private TagHitsList(Builder builder) {
            this.hitCount = builder.hitCount;
            this.tagGroup = builder.tagGroup;
            this.tagName = builder.tagName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagHitsList create() {
            return builder().build();
        }

        /**
         * @return hitCount
         */
        public Integer getHitCount() {
            return this.hitCount;
        }

        /**
         * @return tagGroup
         */
        public String getTagGroup() {
            return this.tagGroup;
        }

        /**
         * @return tagName
         */
        public String getTagName() {
            return this.tagName;
        }

        public static final class Builder {
            private Integer hitCount; 
            private String tagGroup; 
            private String tagName; 

            private Builder() {
            } 

            private Builder(TagHitsList model) {
                this.hitCount = model.hitCount;
                this.tagGroup = model.tagGroup;
                this.tagName = model.tagName;
            } 

            /**
             * <p>The hit count for the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder hitCount(Integer hitCount) {
                this.hitCount = hitCount;
                return this;
            }

            /**
             * <p>The tag group name.</p>
             * 
             * <strong>example:</strong>
             * <p>当前学历</p>
             */
            public Builder tagGroup(String tagGroup) {
                this.tagGroup = tagGroup;
                return this;
            }

            /**
             * <p>The tag name.</p>
             * 
             * <strong>example:</strong>
             * <p>本科</p>
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            public TagHitsList build() {
                return new TagHitsList(this);
            } 

        } 

    }
}
