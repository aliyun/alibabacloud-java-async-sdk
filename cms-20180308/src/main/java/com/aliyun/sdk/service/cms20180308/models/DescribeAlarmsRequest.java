// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20180308.models;

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
 * {@link DescribeAlarmsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAlarmsRequest</p>
 */
public class DescribeAlarmsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertState")
    private String alertState;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableState")
    private Boolean enableState;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupBy")
    private String groupBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricName")
    private String metricName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NameKeyword")
    private String nameKeyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Names")
    private String names;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Page")
    private String page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    private DescribeAlarmsRequest(Builder builder) {
        super(builder);
        this.alertState = builder.alertState;
        this.displayName = builder.displayName;
        this.enableState = builder.enableState;
        this.groupBy = builder.groupBy;
        this.groupId = builder.groupId;
        this.metricName = builder.metricName;
        this.nameKeyword = builder.nameKeyword;
        this.names = builder.names;
        this.namespace = builder.namespace;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlarmsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertState
     */
    public String getAlertState() {
        return this.alertState;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return enableState
     */
    public Boolean getEnableState() {
        return this.enableState;
    }

    /**
     * @return groupBy
     */
    public String getGroupBy() {
        return this.groupBy;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return metricName
     */
    public String getMetricName() {
        return this.metricName;
    }

    /**
     * @return nameKeyword
     */
    public String getNameKeyword() {
        return this.nameKeyword;
    }

    /**
     * @return names
     */
    public String getNames() {
        return this.names;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return page
     */
    public String getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<DescribeAlarmsRequest, Builder> {
        private String alertState; 
        private String displayName; 
        private Boolean enableState; 
        private String groupBy; 
        private String groupId; 
        private String metricName; 
        private String nameKeyword; 
        private String names; 
        private String namespace; 
        private String page; 
        private String pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAlarmsRequest request) {
            super(request);
            this.alertState = request.alertState;
            this.displayName = request.displayName;
            this.enableState = request.enableState;
            this.groupBy = request.groupBy;
            this.groupId = request.groupId;
            this.metricName = request.metricName;
            this.nameKeyword = request.nameKeyword;
            this.names = request.names;
            this.namespace = request.namespace;
            this.page = request.page;
            this.pageSize = request.pageSize;
        } 

        /**
         * AlertState.
         */
        public Builder alertState(String alertState) {
            this.putQueryParameter("AlertState", alertState);
            this.alertState = alertState;
            return this;
        }

        /**
         * DisplayName.
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * EnableState.
         */
        public Builder enableState(Boolean enableState) {
            this.putQueryParameter("EnableState", enableState);
            this.enableState = enableState;
            return this;
        }

        /**
         * GroupBy.
         */
        public Builder groupBy(String groupBy) {
            this.putQueryParameter("GroupBy", groupBy);
            this.groupBy = groupBy;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * MetricName.
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * NameKeyword.
         */
        public Builder nameKeyword(String nameKeyword) {
            this.putQueryParameter("NameKeyword", nameKeyword);
            this.nameKeyword = nameKeyword;
            return this;
        }

        /**
         * Names.
         */
        public Builder names(String names) {
            this.putQueryParameter("Names", names);
            this.names = names;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(String page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public DescribeAlarmsRequest build() {
            return new DescribeAlarmsRequest(this);
        } 

    } 

}
