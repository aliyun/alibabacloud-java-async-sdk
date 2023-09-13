// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePlayQoeListRequest} extends {@link RequestModel}
 *
 * <p>DescribePlayQoeListRequest</p>
 */
public class DescribePlayQoeListRequest extends Request {
    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("BeginTs")
    @Validation(required = true)
    private Long beginTs;

    @Query
    @NameInMap("Definition")
    private String definition;

    @Query
    @NameInMap("EndTs")
    @Validation(required = true)
    private Long endTs;

    @Query
    @NameInMap("ItemConfigs")
    private String itemConfigs;

    @Query
    @NameInMap("MetricTypes")
    private java.util.List < String > metricTypes;

    @Query
    @NameInMap("Network")
    private String network;

    @Query
    @NameInMap("OrderName")
    private String orderName;

    @Query
    @NameInMap("OrderType")
    private String orderType;

    @Query
    @NameInMap("Os")
    private String os;

    @Query
    @NameInMap("PageNo")
    @Validation(required = true)
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("TerminalType")
    private String terminalType;

    private DescribePlayQoeListRequest(Builder builder) {
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

    public static DescribePlayQoeListRequest create() {
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
    public java.util.List < String > getMetricTypes() {
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
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return terminalType
     */
    public String getTerminalType() {
        return this.terminalType;
    }

    public static final class Builder extends Request.Builder<DescribePlayQoeListRequest, Builder> {
        private String appName; 
        private Long beginTs; 
        private String definition; 
        private Long endTs; 
        private String itemConfigs; 
        private java.util.List < String > metricTypes; 
        private String network; 
        private String orderName; 
        private String orderType; 
        private String os; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String terminalType; 

        private Builder() {
            super();
        } 

        private Builder(DescribePlayQoeListRequest request) {
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
         * BeginTs.
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
         * EndTs.
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
        public Builder metricTypes(java.util.List < String > metricTypes) {
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
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
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
        public DescribePlayQoeListRequest build() {
            return new DescribePlayQoeListRequest(this);
        } 

    } 

}
