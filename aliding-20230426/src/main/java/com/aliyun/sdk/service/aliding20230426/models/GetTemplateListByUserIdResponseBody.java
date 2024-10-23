// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetTemplateListByUserIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetTemplateListByUserIdResponseBody</p>
 */
public class GetTemplateListByUserIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("nextCursor")
    private Long nextCursor;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("templateList")
    private java.util.List < TemplateList> templateList;

    private GetTemplateListByUserIdResponseBody(Builder builder) {
        this.nextCursor = builder.nextCursor;
        this.requestId = builder.requestId;
        this.templateList = builder.templateList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTemplateListByUserIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextCursor
     */
    public Long getNextCursor() {
        return this.nextCursor;
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
    public java.util.List < TemplateList> getTemplateList() {
        return this.templateList;
    }

    public static final class Builder {
        private Long nextCursor; 
        private String requestId; 
        private java.util.List < TemplateList> templateList; 

        /**
         * nextCursor.
         */
        public Builder nextCursor(Long nextCursor) {
            this.nextCursor = nextCursor;
            return this;
        }

        /**
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * templateList.
         */
        public Builder templateList(java.util.List < TemplateList> templateList) {
            this.templateList = templateList;
            return this;
        }

        public GetTemplateListByUserIdResponseBody build() {
            return new GetTemplateListByUserIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTemplateListByUserIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetTemplateListByUserIdResponseBody</p>
     */
    public static class TemplateList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IconUrl")
        private String iconUrl;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ReportCode")
        private String reportCode;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private TemplateList(Builder builder) {
            this.iconUrl = builder.iconUrl;
            this.name = builder.name;
            this.reportCode = builder.reportCode;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateList create() {
            return builder().build();
        }

        /**
         * @return iconUrl
         */
        public String getIconUrl() {
            return this.iconUrl;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return reportCode
         */
        public String getReportCode() {
            return this.reportCode;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String iconUrl; 
            private String name; 
            private String reportCode; 
            private String url; 

            /**
             * IconUrl.
             */
            public Builder iconUrl(String iconUrl) {
                this.iconUrl = iconUrl;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ReportCode.
             */
            public Builder reportCode(String reportCode) {
                this.reportCode = reportCode;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public TemplateList build() {
                return new TemplateList(this);
            } 

        } 

    }
}
