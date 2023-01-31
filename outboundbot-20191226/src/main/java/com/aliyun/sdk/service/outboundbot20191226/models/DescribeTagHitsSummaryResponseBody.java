// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTagHitsSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTagHitsSummaryResponseBody</p>
 */
public class DescribeTagHitsSummaryResponseBody extends TeaModel {
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

    @NameInMap("TagHitsList")
    private java.util.List < TagHitsList> tagHitsList;

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
     * @return tagHitsList
     */
    public java.util.List < TagHitsList> getTagHitsList() {
        return this.tagHitsList;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private java.util.List < TagGroups> tagGroups; 
        private java.util.List < TagHitsList> tagHitsList; 

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
         * TagHitsList.
         */
        public Builder tagHitsList(java.util.List < TagHitsList> tagHitsList) {
            this.tagHitsList = tagHitsList;
            return this;
        }

        public DescribeTagHitsSummaryResponseBody build() {
            return new DescribeTagHitsSummaryResponseBody(this);
        } 

    } 

    public static class TagGroups extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("ScriptId")
        private String scriptId;

        @NameInMap("TagGroup")
        private String tagGroup;

        @NameInMap("TagGroupIndex")
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

            /**
             * ID
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

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
    public static class TagHitsList extends TeaModel {
        @NameInMap("HitCount")
        private Integer hitCount;

        @NameInMap("TagGroup")
        private String tagGroup;

        @NameInMap("TagName")
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

            /**
             * HitCount.
             */
            public Builder hitCount(Integer hitCount) {
                this.hitCount = hitCount;
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
             * TagName.
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
