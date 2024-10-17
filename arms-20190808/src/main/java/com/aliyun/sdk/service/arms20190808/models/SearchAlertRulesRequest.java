// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SearchAlertRulesRequest} extends {@link RequestModel}
 *
 * <p>SearchAlertRulesRequest</p>
 */
public class SearchAlertRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertRuleId")
    private String alertRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppType")
    private String appType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pid")
    private String pid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemRegionId")
    private String systemRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List < Tags> tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private SearchAlertRulesRequest(Builder builder) {
        super(builder);
        this.alertRuleId = builder.alertRuleId;
        this.appType = builder.appType;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.pid = builder.pid;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.systemRegionId = builder.systemRegionId;
        this.tags = builder.tags;
        this.title = builder.title;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchAlertRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertRuleId
     */
    public String getAlertRuleId() {
        return this.alertRuleId;
    }

    /**
     * @return appType
     */
    public String getAppType() {
        return this.appType;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pid
     */
    public String getPid() {
        return this.pid;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return systemRegionId
     */
    public String getSystemRegionId() {
        return this.systemRegionId;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<SearchAlertRulesRequest, Builder> {
        private String alertRuleId; 
        private String appType; 
        private Integer currentPage; 
        private Integer pageSize; 
        private String pid; 
        private String regionId; 
        private String resourceGroupId; 
        private String systemRegionId; 
        private java.util.List < Tags> tags; 
        private String title; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(SearchAlertRulesRequest request) {
            super(request);
            this.alertRuleId = request.alertRuleId;
            this.appType = request.appType;
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
            this.pid = request.pid;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.systemRegionId = request.systemRegionId;
            this.tags = request.tags;
            this.title = request.title;
            this.type = request.type;
        } 

        /**
         * <p>The id of AlertRule.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder alertRuleId(String alertRuleId) {
            this.putQueryParameter("AlertRuleId", alertRuleId);
            this.alertRuleId = alertRuleId;
            return this;
        }

        /**
         * <p>The type of the application that is associated with the alert rule. Valid values:</p>
         * <ul>
         * <li><code>TRACE</code>: application</li>
         * <li><code>RETCODE</code>: browser</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TRACE</p>
         */
        public Builder appType(String appType) {
            this.putQueryParameter("AppType", appType);
            this.appType = appType;
            return this;
        }

        /**
         * <p>The page number of the page to return. Default value: <code>1</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The number of entries to return per page. Default value: <code>10</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The process identifier (PID) of the application that is associated with the alert rule. For more information about how to obtain the PID, see <a href="https://help.aliyun.com/document_detail/186100.html?spm=a2c4g.11186623.6.792.1b50654cqcDPyk#title-imy-7gj-qhr">Obtain the PID of an application</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>atc889zkcf@d8deedfa9bf****</p>
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * <p>The region ID of the alert data. For more information about the mappings between <strong>RegionId</strong> and <strong>SystemRegionId</strong>, see the detailed description below the table.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group. You can obtain the resource group ID in the <strong>Resource Management</strong> console.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxyexli2****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The region ID of the alert rule. For more information about the mappings between <strong>RegionId</strong> and <strong>SystemRegionId</strong>, see the detailed description below the table.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder systemRegionId(String systemRegionId) {
            this.putQueryParameter("SystemRegionId", systemRegionId);
            this.systemRegionId = systemRegionId;
            return this;
        }

        /**
         * <p>The list of tags.</p>
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The alert rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>AlertRuleTitle</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * <p>The alert rule type. Valid values:</p>
         * <ul>
         * <li><code>1</code>: custom alert rules that are used to monitor drill-down data sets</li>
         * <li><code>3</code>: custom alert rules that are used to monitor tiled data sets</li>
         * <li><code>4</code>: alert rules that are used to monitor the browser, including the default frontend alert rules</li>
         * <li><code>5</code>: alert rules that are used to monitor applications, including the default application alert rules</li>
         * <li><code>6</code>: the default browser alert rules</li>
         * <li><code>7</code>: the default application alert rules</li>
         * <li><code>8</code>: Tracing Analysis alert rules</li>
         * <li><code>101</code>: Prometheus alert rules</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public SearchAlertRulesRequest build() {
            return new SearchAlertRulesRequest(this);
        } 

    } 

    /**
     * 
     * {@link SearchAlertRulesRequest} extends {@link TeaModel}
     *
     * <p>SearchAlertRulesRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The key of the tag. The following system preset fields are provided:</p>
             * <ul>
             * <li>traceId: the ID of the trace.</li>
             * <li>serverApp: the name of the server application.</li>
             * <li>clientApp: the name of the client application.</li>
             * <li>service: the name of the operation.</li>
             * <li>rpc: the type of the call.</li>
             * <li>msOfSpan: the duration exceeds a specific value.</li>
             * <li>clientIp: the IP address of the client.</li>
             * <li>serverIp: the IP address of the server.</li>
             * <li>isError: specifies whether the call is abnormal.</li>
             * <li>hasTprof: contains only thread profiling.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
