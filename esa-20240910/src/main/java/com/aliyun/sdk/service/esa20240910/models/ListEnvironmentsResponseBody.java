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
 * {@link ListEnvironmentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEnvironmentsResponseBody</p>
 */
public class ListEnvironmentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EnvironmentList")
    private java.util.List<EnvironmentList> environmentList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListEnvironmentsResponseBody(Builder builder) {
        this.environmentList = builder.environmentList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnvironmentsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return environmentList
     */
    public java.util.List<EnvironmentList> getEnvironmentList() {
        return this.environmentList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<EnvironmentList> environmentList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListEnvironmentsResponseBody model) {
            this.environmentList = model.environmentList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of environments.</p>
         */
        public Builder environmentList(java.util.List<EnvironmentList> environmentList) {
            this.environmentList = environmentList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C370DAF1-C838-4288-A1A0-9A87633D248E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListEnvironmentsResponseBody build() {
            return new ListEnvironmentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEnvironmentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEnvironmentsResponseBody</p>
     */
    public static class EnvironmentList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EnvironmentName")
        private String environmentName;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("PreSiteVersion")
        private Integer preSiteVersion;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("ReadOnly")
        private Boolean readOnly;

        @com.aliyun.core.annotation.NameInMap("Rule")
        private String rule;

        @com.aliyun.core.annotation.NameInMap("SiteVersion")
        private Integer siteVersion;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private EnvironmentList(Builder builder) {
            this.createTime = builder.createTime;
            this.environmentName = builder.environmentName;
            this.isDefault = builder.isDefault;
            this.preSiteVersion = builder.preSiteVersion;
            this.priority = builder.priority;
            this.readOnly = builder.readOnly;
            this.rule = builder.rule;
            this.siteVersion = builder.siteVersion;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnvironmentList create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return environmentName
         */
        public String getEnvironmentName() {
            return this.environmentName;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return preSiteVersion
         */
        public Integer getPreSiteVersion() {
            return this.preSiteVersion;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return readOnly
         */
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        /**
         * @return rule
         */
        public String getRule() {
            return this.rule;
        }

        /**
         * @return siteVersion
         */
        public Integer getSiteVersion() {
            return this.siteVersion;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String environmentName; 
            private Boolean isDefault; 
            private Integer preSiteVersion; 
            private Integer priority; 
            private Boolean readOnly; 
            private String rule; 
            private Integer siteVersion; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(EnvironmentList model) {
                this.createTime = model.createTime;
                this.environmentName = model.environmentName;
                this.isDefault = model.isDefault;
                this.preSiteVersion = model.preSiteVersion;
                this.priority = model.priority;
                this.readOnly = model.readOnly;
                this.rule = model.rule;
                this.siteVersion = model.siteVersion;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-08-15T08:15:30Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The environment name.</p>
             * 
             * <strong>example:</strong>
             * <p>yichao-test-yctest</p>
             */
            public Builder environmentName(String environmentName) {
                this.environmentName = environmentName;
                return this;
            }

            /**
             * <p>Indicates whether this is the default environment.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>The previous version number.</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder preSiteVersion(Integer preSiteVersion) {
                this.preSiteVersion = preSiteVersion;
                return this;
            }

            /**
             * <p>The priority.</p>
             * 
             * <strong>example:</strong>
             * <p>56</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>Indicates whether the environment is read-only.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            /**
             * <p>The environment rule.</p>
             * 
             * <strong>example:</strong>
             * <p>(&quot;ip&quot; eq &quot;1.1.1.1&quot;)</p>
             */
            public Builder rule(String rule) {
                this.rule = rule;
                return this;
            }

            /**
             * <p>The site version number.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder siteVersion(Integer siteVersion) {
                this.siteVersion = siteVersion;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-09-15T08:16:04Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public EnvironmentList build() {
                return new EnvironmentList(this);
            } 

        } 

    }
}
