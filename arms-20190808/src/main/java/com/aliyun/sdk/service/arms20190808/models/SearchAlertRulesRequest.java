// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchAlertRulesRequest} extends {@link RequestModel}
 *
 * <p>SearchAlertRulesRequest</p>
 */
public class SearchAlertRulesRequest extends Request {
    @Query
    @NameInMap("AlertRuleId")
    private String alertRuleId;

    @Query
    @NameInMap("AppType")
    private String appType;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Pid")
    private String pid;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("SystemRegionId")
    private String systemRegionId;

    @Query
    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    @Query
    @NameInMap("Title")
    private String title;

    @Query
    @NameInMap("Type")
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
         * AlertRuleId.
         */
        public Builder alertRuleId(String alertRuleId) {
            this.putQueryParameter("AlertRuleId", alertRuleId);
            this.alertRuleId = alertRuleId;
            return this;
        }

        /**
         * The type of the application that is associated with the alert rule. Valid values:
         * <p>
         * 
         * *   `TRACE`: application
         * *   `RETCODE`: browser
         */
        public Builder appType(String appType) {
            this.putQueryParameter("AppType", appType);
            this.appType = appType;
            return this;
        }

        /**
         * The page number of the page to return. Default value: `1`.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The number of entries to return per page. Default value: `10`.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The process identifier (PID) of the application that is associated with the alert rule. For more information about how to obtain the PID, see [Obtain the PID of an application](https://help.aliyun.com/document_detail/186100.html?spm=a2c4g.11186623.6.792.1b50654cqcDPyk#title-imy-7gj-qhr).
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * The region ID of the alert data. For more information about the mappings between **RegionId** and **SystemRegionId**, see the detailed description below the table.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The region ID of the alert rule. For more information about the mappings between **RegionId** and **SystemRegionId**, see the detailed description below the table.
         */
        public Builder systemRegionId(String systemRegionId) {
            this.putQueryParameter("SystemRegionId", systemRegionId);
            this.systemRegionId = systemRegionId;
            return this;
        }

        /**
         * The list of tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * The alert rule name.
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * The alert rule type. Valid values:
         * <p>
         * 
         * *   `1`: custom alert rules that are used to monitor drill-down data sets
         * *   `3`: custom alert rules that are used to monitor tiled data sets
         * *   `4`: alert rules that are used to monitor the browser, including the default frontend alert rules
         * *   `5`: alert rules that are used to monitor applications, including the default application alert rules
         * *   `6`: the default browser alert rules
         * *   `7`: the default application alert rules
         * *   `8`: Tracing Analysis alert rules
         * *   `101`: Prometheus alert rules
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

    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * The key of the tag. The following system preset fields are provided:
             * <p>
             * 
             * *   traceId: the ID of the trace.
             * *   serverApp: the name of the server application.
             * *   clientApp: the name of the client application.
             * *   service: the name of the operation.
             * *   rpc: the type of the call.
             * *   msOfSpan: the duration exceeds a specific value.
             * *   clientIp: the IP address of the client.
             * *   serverIp: the IP address of the server.
             * *   isError: specifies whether the call is abnormal.
             * *   hasTprof: contains only thread profiling.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
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
