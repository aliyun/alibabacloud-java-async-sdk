// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListVersionsResponseBody</p>
 */
public class ListVersionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SiteVersionList")
    private java.util.List<SiteVersionList> siteVersionList;

    private ListVersionsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.siteVersionList = builder.siteVersionList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVersionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return siteVersionList
     */
    public java.util.List<SiteVersionList> getSiteVersionList() {
        return this.siteVersionList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<SiteVersionList> siteVersionList; 

        private Builder() {
        } 

        private Builder(ListVersionsResponseBody model) {
            this.requestId = model.requestId;
            this.siteVersionList = model.siteVersionList;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7EBEC214-805D-5FE9-AEED-258FE0F8850F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of versions for the site.</p>
         */
        public Builder siteVersionList(java.util.List<SiteVersionList> siteVersionList) {
            this.siteVersionList = siteVersionList;
            return this;
        }

        public ListVersionsResponseBody build() {
            return new ListVersionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListVersionsResponseBody</p>
     */
    public static class SiteVersionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EnvironmentNameList")
        private java.util.List<String> environmentNameList;

        @com.aliyun.core.annotation.NameInMap("ParentSiteVersion")
        private Integer parentSiteVersion;

        @com.aliyun.core.annotation.NameInMap("ReadOnly")
        private Boolean readOnly;

        @com.aliyun.core.annotation.NameInMap("SiteVersion")
        private Integer siteVersion;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private SiteVersionList(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.environmentNameList = builder.environmentNameList;
            this.parentSiteVersion = builder.parentSiteVersion;
            this.readOnly = builder.readOnly;
            this.siteVersion = builder.siteVersion;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SiteVersionList create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return environmentNameList
         */
        public java.util.List<String> getEnvironmentNameList() {
            return this.environmentNameList;
        }

        /**
         * @return parentSiteVersion
         */
        public Integer getParentSiteVersion() {
            return this.parentSiteVersion;
        }

        /**
         * @return readOnly
         */
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        /**
         * @return siteVersion
         */
        public Integer getSiteVersion() {
            return this.siteVersion;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private java.util.List<String> environmentNameList; 
            private Integer parentSiteVersion; 
            private Boolean readOnly; 
            private Integer siteVersion; 
            private String status; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(SiteVersionList model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.environmentNameList = model.environmentNameList;
                this.parentSiteVersion = model.parentSiteVersion;
                this.readOnly = model.readOnly;
                this.siteVersion = model.siteVersion;
                this.status = model.status;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The creation time. The time follows the ISO 8601 standard and includes a time zone offset. Example: 2024-06-15T17:41:27+08:00.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-06-15T17:41:27+08:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>Site A uses multiple environments</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The list of environments for the site version. No environment is configured, or one or more environments are configured, such as the default environment and Environment 2.</p>
             */
            public Builder environmentNameList(java.util.List<String> environmentNameList) {
                this.environmentNameList = environmentNameList;
                return this;
            }

            /**
             * <p>The parent version of the site version.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder parentSiteVersion(Integer parentSiteVersion) {
                this.parentSiteVersion = parentSiteVersion;
                return this;
            }

            /**
             * <p>Specifies whether the version is read-only. Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            /**
             * <p>The site version.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder siteVersion(Integer siteVersion) {
                this.siteVersion = siteVersion;
                return this;
            }

            /**
             * <p>The status. Valid values:</p>
             * <ul>
             * <li><p><strong>online</strong>: Available.</p>
             * </li>
             * <li><p><strong>configuring</strong>: Configuring.</p>
             * </li>
             * <li><p><strong>configure_faild</strong>: Configuration failed.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>online</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The update time. The time follows the ISO 8601 standard and includes a time zone offset. Example: 2024-06-15T17:41:27+08:00.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-06-15T17:41:27+08:00</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public SiteVersionList build() {
                return new SiteVersionList(this);
            } 

        } 

    }
}
