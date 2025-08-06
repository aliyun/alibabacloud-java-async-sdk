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
 * {@link DescribePlayQosListRequest} extends {@link RequestModel}
 *
 * <p>DescribePlayQosListRequest</p>
 */
public class DescribePlayQosListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginTs")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long beginTs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Definition")
    private String definition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTs")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ItemConfigs")
    private String itemConfigs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricTypes")
    private java.util.List<String> metricTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Network")
    private String network;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderName")
    private String orderName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderType")
    private String orderType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Os")
    private String os;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TerminalType")
    private String terminalType;

    private DescribePlayQosListRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.beginTs = builder.beginTs;
        this.definition = builder.definition;
        this.endTs = builder.endTs;
        this.itemConfigs = builder.itemConfigs;
        this.metricTypes = builder.metricTypes;
        this.network = builder.network;
        this.orderName = builder.orderName;
        this.orderType = builder.orderType;
        this.os = builder.os;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.terminalType = builder.terminalType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePlayQosListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return beginTs
     */
    public Long getBeginTs() {
        return this.beginTs;
    }

    /**
     * @return definition
     */
    public String getDefinition() {
        return this.definition;
    }

    /**
     * @return endTs
     */
    public Long getEndTs() {
        return this.endTs;
    }

    /**
     * @return itemConfigs
     */
    public String getItemConfigs() {
        return this.itemConfigs;
    }

    /**
     * @return metricTypes
     */
    public java.util.List<String> getMetricTypes() {
        return this.metricTypes;
    }

    /**
     * @return network
     */
    public String getNetwork() {
        return this.network;
    }

    /**
     * @return orderName
     */
    public String getOrderName() {
        return this.orderName;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    /**
     * @return os
     */
    public String getOs() {
        return this.os;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return terminalType
     */
    public String getTerminalType() {
        return this.terminalType;
    }

    public static final class Builder extends Request.Builder<DescribePlayQosListRequest, Builder> {
        private String appName; 
        private Long beginTs; 
        private String definition; 
        private Long endTs; 
        private String itemConfigs; 
        private java.util.List<String> metricTypes; 
        private String network; 
        private String orderName; 
        private String orderType; 
        private String os; 
        private Long pageNo; 
        private Long pageSize; 
        private String terminalType; 

        private Builder() {
            super();
        } 

        private Builder(DescribePlayQosListRequest request) {
            super(request);
            this.appName = request.appName;
            this.beginTs = request.beginTs;
            this.definition = request.definition;
            this.endTs = request.endTs;
            this.itemConfigs = request.itemConfigs;
            this.metricTypes = request.metricTypes;
            this.network = request.network;
            this.orderName = request.orderName;
            this.orderType = request.orderType;
            this.os = request.os;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.terminalType = request.terminalType;
        } 

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder beginTs(Long beginTs) {
            this.putQueryParameter("BeginTs", beginTs);
            this.beginTs = beginTs;
            return this;
        }

        /**
         * Definition.
         */
        public Builder definition(String definition) {
            this.putQueryParameter("Definition", definition);
            this.definition = definition;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder endTs(Long endTs) {
            this.putQueryParameter("EndTs", endTs);
            this.endTs = endTs;
            return this;
        }

        /**
         * ItemConfigs.
         */
        public Builder itemConfigs(String itemConfigs) {
            this.putQueryParameter("ItemConfigs", itemConfigs);
            this.itemConfigs = itemConfigs;
            return this;
        }

        /**
         * MetricTypes.
         */
        public Builder metricTypes(java.util.List<String> metricTypes) {
            String metricTypesShrink = shrink(metricTypes, "MetricTypes", "json");
            this.putQueryParameter("MetricTypes", metricTypesShrink);
            this.metricTypes = metricTypes;
            return this;
        }

        /**
         * Network.
         */
        public Builder network(String network) {
            this.putQueryParameter("Network", network);
            this.network = network;
            return this;
        }

        /**
         * OrderName.
         */
        public Builder orderName(String orderName) {
            this.putQueryParameter("OrderName", orderName);
            this.orderName = orderName;
            return this;
        }

        /**
         * OrderType.
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * Os.
         */
        public Builder os(String os) {
            this.putQueryParameter("Os", os);
            this.os = os;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * TerminalType.
         */
        public Builder terminalType(String terminalType) {
            this.putQueryParameter("TerminalType", terminalType);
            this.terminalType = terminalType;
            return this;
        }

        @Override
        public DescribePlayQosListRequest build() {
            return new DescribePlayQosListRequest(this);
        } 

    } 

}
