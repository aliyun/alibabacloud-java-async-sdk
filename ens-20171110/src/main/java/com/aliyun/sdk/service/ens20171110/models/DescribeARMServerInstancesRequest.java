// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeARMServerInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeARMServerInstancesRequest</p>
 */
public class DescribeARMServerInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AICSpecs")
    private java.util.List < String > AICSpecs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DescribeAICInstances")
    private Boolean describeAICInstances;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionIds")
    private java.util.List < String > ensRegionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxDate")
    private String maxDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinDate")
    private String minDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderByParams")
    private String orderByParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerIds")
    private java.util.List < String > serverIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerSpecs")
    private java.util.List < String > serverSpecs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("States")
    private java.util.List < String > states;

    private DescribeARMServerInstancesRequest(Builder builder) {
        super(builder);
        this.AICSpecs = builder.AICSpecs;
        this.describeAICInstances = builder.describeAICInstances;
        this.ensRegionIds = builder.ensRegionIds;
        this.maxDate = builder.maxDate;
        this.minDate = builder.minDate;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.orderByParams = builder.orderByParams;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.serverIds = builder.serverIds;
        this.serverSpecs = builder.serverSpecs;
        this.states = builder.states;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeARMServerInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AICSpecs
     */
    public java.util.List < String > getAICSpecs() {
        return this.AICSpecs;
    }

    /**
     * @return describeAICInstances
     */
    public Boolean getDescribeAICInstances() {
        return this.describeAICInstances;
    }

    /**
     * @return ensRegionIds
     */
    public java.util.List < String > getEnsRegionIds() {
        return this.ensRegionIds;
    }

    /**
     * @return maxDate
     */
    public String getMaxDate() {
        return this.maxDate;
    }

    /**
     * @return minDate
     */
    public String getMinDate() {
        return this.minDate;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return orderByParams
     */
    public String getOrderByParams() {
        return this.orderByParams;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return serverIds
     */
    public java.util.List < String > getServerIds() {
        return this.serverIds;
    }

    /**
     * @return serverSpecs
     */
    public java.util.List < String > getServerSpecs() {
        return this.serverSpecs;
    }

    /**
     * @return states
     */
    public java.util.List < String > getStates() {
        return this.states;
    }

    public static final class Builder extends Request.Builder<DescribeARMServerInstancesRequest, Builder> {
        private java.util.List < String > AICSpecs; 
        private Boolean describeAICInstances; 
        private java.util.List < String > ensRegionIds; 
        private String maxDate; 
        private String minDate; 
        private String name; 
        private String namespace; 
        private String orderByParams; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List < String > serverIds; 
        private java.util.List < String > serverSpecs; 
        private java.util.List < String > states; 

        private Builder() {
            super();
        } 

        private Builder(DescribeARMServerInstancesRequest request) {
            super(request);
            this.AICSpecs = request.AICSpecs;
            this.describeAICInstances = request.describeAICInstances;
            this.ensRegionIds = request.ensRegionIds;
            this.maxDate = request.maxDate;
            this.minDate = request.minDate;
            this.name = request.name;
            this.namespace = request.namespace;
            this.orderByParams = request.orderByParams;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.serverIds = request.serverIds;
            this.serverSpecs = request.serverSpecs;
            this.states = request.states;
        } 

        /**
         * <p>The container specifications.</p>
         */
        public Builder AICSpecs(java.util.List < String > AICSpecs) {
            String AICSpecsShrink = shrink(AICSpecs, "AICSpecs", "json");
            this.putQueryParameter("AICSpecs", AICSpecsShrink);
            this.AICSpecs = AICSpecs;
            return this;
        }

        /**
         * <p>Spcifies whether the result contains the container information. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder describeAICInstances(Boolean describeAICInstances) {
            this.putQueryParameter("DescribeAICInstances", describeAICInstances);
            this.describeAICInstances = describeAICInstances;
            return this;
        }

        /**
         * <p>The IDs of the Edge Node Service (ENS) nodes.</p>
         */
        public Builder ensRegionIds(java.util.List < String > ensRegionIds) {
            String ensRegionIdsShrink = shrink(ensRegionIds, "EnsRegionIds", "json");
            this.putQueryParameter("EnsRegionIds", ensRegionIdsShrink);
            this.ensRegionIds = ensRegionIds;
            return this;
        }

        /**
         * <p>The end of the time range to query. Specify the time in the 2006-01-02 format. By default, the time range to query is not restricted.</p>
         * 
         * <strong>example:</strong>
         * <p>2006-01-03</p>
         */
        public Builder maxDate(String maxDate) {
            this.putQueryParameter("MaxDate", maxDate);
            this.maxDate = maxDate;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the 2006-01-02 format. By default, the time range to query is not restricted.</p>
         * 
         * <strong>example:</strong>
         * <p>2006-01-02</p>
         */
        public Builder minDate(String minDate) {
            this.putQueryParameter("MinDate", minDate);
            this.minDate = minDate;
            return this;
        }

        /**
         * <p>The name of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>Server-Name</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The sorting order of the results to return. Valid values: ServerIdSort, ServerNameSort, ExpireTimeSort, CreationTimeSort, and EnsRegionIdSort.</p>
         * <p>asc: ascending order. desc: descending order.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ServerIdSort&quot;:&quot;desc&quot;,&quot;ServerNameSort&quot;:&quot;desc&quot;,&quot;ExpireTimeSort&quot;:&quot;asc&quot;,&quot;CreationTimeSort&quot;:&quot;asc&quot;,&quot;EnsRegionIdSort&quot;:&quot;asc&quot;}</p>
         */
        public Builder orderByParams(String orderByParams) {
            this.putQueryParameter("OrderByParams", orderByParams);
            this.orderByParams = orderByParams;
            return this;
        }

        /**
         * <p>The page number. Pages start from page <strong>1</strong>.</p>
         * <p>Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. The maximum value is <strong>100</strong>.</p>
         * <p>Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The IDs of the ARM servers.</p>
         */
        public Builder serverIds(java.util.List < String > serverIds) {
            String serverIdsShrink = shrink(serverIds, "ServerIds", "json");
            this.putQueryParameter("ServerIds", serverIdsShrink);
            this.serverIds = serverIds;
            return this;
        }

        /**
         * <p>The server specifications.</p>
         */
        public Builder serverSpecs(java.util.List < String > serverSpecs) {
            String serverSpecsShrink = shrink(serverSpecs, "ServerSpecs", "json");
            this.putQueryParameter("ServerSpecs", serverSpecsShrink);
            this.serverSpecs = serverSpecs;
            return this;
        }

        /**
         * <p>The operation statuses.</p>
         */
        public Builder states(java.util.List < String > states) {
            String statesShrink = shrink(states, "States", "json");
            this.putQueryParameter("States", statesShrink);
            this.states = states;
            return this;
        }

        @Override
        public DescribeARMServerInstancesRequest build() {
            return new DescribeARMServerInstancesRequest(this);
        } 

    } 

}
