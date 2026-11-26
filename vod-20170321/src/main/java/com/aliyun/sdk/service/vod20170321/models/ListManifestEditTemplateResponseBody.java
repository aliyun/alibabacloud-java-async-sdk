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
 * {@link ListManifestEditTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>ListManifestEditTemplateResponseBody</p>
 */
public class ListManifestEditTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TemplateList")
    private java.util.List<TemplateList> templateList;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListManifestEditTemplateResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.templateList = builder.templateList;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListManifestEditTemplateResponseBody create() {
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
     * @return templateList
     */
    public java.util.List<TemplateList> getTemplateList() {
        return this.templateList;
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
        private java.util.List<TemplateList> templateList; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListManifestEditTemplateResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.templateList = model.templateList;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The maximum number of entries returned for the current request.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The position to which the current call returns. An empty value indicates that all data has been retrieved.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>page_2</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4AF6-D7393642CA58****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of ManifestEdit templates.</p>
         */
        public Builder templateList(java.util.List<TemplateList> templateList) {
            this.templateList = templateList;
            return this;
        }

        /**
         * <p>The total number of entries that meet the query conditions. This parameter is optional and is not returned by default.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListManifestEditTemplateResponseBody build() {
            return new ListManifestEditTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListManifestEditTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>ListManifestEditTemplateResponseBody</p>
     */
    public static class TemplateList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        private TemplateList(Builder builder) {
            this.appId = builder.appId;
            this.creationTime = builder.creationTime;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.status = builder.status;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateList create() {
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
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private String appId; 
            private String creationTime; 
            private String modifyTime; 
            private String name; 
            private Integer status; 
            private String templateId; 

            private Builder() {
            } 

            private Builder(TemplateList model) {
                this.appId = model.appId;
                this.creationTime = model.creationTime;
                this.modifyTime = model.modifyTime;
                this.name = model.name;
                this.status = model.status;
                this.templateId = model.templateId;
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
             * <p>The creation time. The time is displayed in the yyyy-MM-ddTHH:mm:ssZ format in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-10T08:00:00Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The modification time. The time is displayed in the yyyy-MM-ddTHH:mm:ssZ format in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-10T08:00:00Z</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The name of the track template group.</p>
             * 
             * <strong>example:</strong>
             * <p>multilang-tracks</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The status of the template. Valid values: <strong>1</strong>: enabled. <strong>0</strong>: disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the ManifestEdit template.</p>
             * 
             * <strong>example:</strong>
             * <p>9c6581d59240de5e258ffa4c71a3e01b</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            public TemplateList build() {
                return new TemplateList(this);
            } 

        } 

    }
}
