// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link ListMediaConvertTemplateGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListMediaConvertTemplateGroupResponseBody</p>
 */
public class ListMediaConvertTemplateGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TemplateGroupList")
    private java.util.List<TemplateGroupList> templateGroupList;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListMediaConvertTemplateGroupResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.templateGroupList = builder.templateGroupList;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMediaConvertTemplateGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return templateGroupList
     */
    public java.util.List<TemplateGroupList> getTemplateGroupList() {
        return this.templateGroupList;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<TemplateGroupList> templateGroupList; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListMediaConvertTemplateGroupResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.templateGroupList = model.templateGroupList;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The maximum number of entries returned in the current request.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination cursor for the next page, in the format of page_N. If this parameter is not returned, all data has been read.</p>
         * 
         * <strong>example:</strong>
         * <p>page_2</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4AF6-D7393642CA58****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of transcoding template groups.</p>
         */
        public Builder templateGroupList(java.util.List<TemplateGroupList> templateGroupList) {
            this.templateGroupList = templateGroupList;
            return this;
        }

        /**
         * <p>The total number of transcoding template groups that meet the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListMediaConvertTemplateGroupResponseBody build() {
            return new ListMediaConvertTemplateGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMediaConvertTemplateGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListMediaConvertTemplateGroupResponseBody</p>
     */
    public static class TemplateGroupList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("GroupConfig")
        private String groupConfig;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("TemplateType")
        private String templateType;

        @com.aliyun.core.annotation.NameInMap("TranscodeTemplateGroupId")
        private String transcodeTemplateGroupId;

        private TemplateGroupList(Builder builder) {
            this.appId = builder.appId;
            this.creationTime = builder.creationTime;
            this.groupConfig = builder.groupConfig;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.templateType = builder.templateType;
            this.transcodeTemplateGroupId = builder.transcodeTemplateGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateGroupList create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return groupConfig
         */
        public String getGroupConfig() {
            return this.groupConfig;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return templateType
         */
        public String getTemplateType() {
            return this.templateType;
        }

        /**
         * @return transcodeTemplateGroupId
         */
        public String getTranscodeTemplateGroupId() {
            return this.transcodeTemplateGroupId;
        }

        public static final class Builder {
            private String appId; 
            private String creationTime; 
            private String groupConfig; 
            private String modifyTime; 
            private String name; 
            private String templateType; 
            private String transcodeTemplateGroupId; 

            private Builder() {
            } 

            private Builder(TemplateGroupList model) {
                this.appId = model.appId;
                this.creationTime = model.creationTime;
                this.groupConfig = model.groupConfig;
                this.modifyTime = model.modifyTime;
                this.name = model.name;
                this.templateType = model.templateType;
                this.transcodeTemplateGroupId = model.transcodeTemplateGroupId;
            } 

            /**
             * <p>The application ID. Default value: <strong>app-1000000</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Multiple applications</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>app-****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The creation time. The time is displayed in UTC in the yyyy-MM-ddTHH:mm:ssZ format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-10T08:00:00Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The group-level configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;AutoStreamName&quot;:&quot;{RunId}_master&quot;}</p>
             */
            public Builder groupConfig(String groupConfig) {
                this.groupConfig = groupConfig;
                return this;
            }

            /**
             * <p>The modification time. The time is displayed in UTC in the yyyy-MM-ddTHH:mm:ssZ format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-10T08:00:00Z</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The name of the transcoding template group.</p>
             * 
             * <strong>example:</strong>
             * <p>mcTemplateGroup</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of the template group. Valid values: <strong>Normal</strong>: normal transcoding template group; <strong>VideoPackage</strong>: video packaging template group.</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            /**
             * <p>The ID of the transcoding template group.</p>
             * 
             * <strong>example:</strong>
             * <p>4c71a339fe52b4fa6f4527****</p>
             */
            public Builder transcodeTemplateGroupId(String transcodeTemplateGroupId) {
                this.transcodeTemplateGroupId = transcodeTemplateGroupId;
                return this;
            }

            public TemplateGroupList build() {
                return new TemplateGroupList(this);
            } 

        } 

    }
}
