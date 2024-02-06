// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeARMServerInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeARMServerInstancesRequest</p>
 */
public class DescribeARMServerInstancesRequest extends Request {
    @Query
    @NameInMap("AICSpecs")
    private java.util.List < String > AICSpecs;

    @Query
    @NameInMap("DescribeAICInstances")
    private Boolean describeAICInstances;

    @Query
    @NameInMap("EnsRegionIds")
    private java.util.List < String > ensRegionIds;

    @Query
    @NameInMap("MaxDate")
    private String maxDate;

    @Query
    @NameInMap("MinDate")
    private String minDate;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("Namespace")
    private String namespace;

    @Query
    @NameInMap("OrderByParams")
    private String orderByParams;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100)
    private Integer pageSize;

    @Query
    @NameInMap("ServerIds")
    private java.util.List < String > serverIds;

    @Query
    @NameInMap("ServerSpecs")
    private java.util.List < String > serverSpecs;

    @Query
    @NameInMap("States")
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
         * The container specifications.
         */
        public Builder AICSpecs(java.util.List < String > AICSpecs) {
            String AICSpecsShrink = shrink(AICSpecs, "AICSpecs", "json");
            this.putQueryParameter("AICSpecs", AICSpecsShrink);
            this.AICSpecs = AICSpecs;
            return this;
        }

        /**
         * Spcifies whether the result contains the container information. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder describeAICInstances(Boolean describeAICInstances) {
            this.putQueryParameter("DescribeAICInstances", describeAICInstances);
            this.describeAICInstances = describeAICInstances;
            return this;
        }

        /**
         * The IDs of the Edge Node Service (ENS) nodes.
         */
        public Builder ensRegionIds(java.util.List < String > ensRegionIds) {
            String ensRegionIdsShrink = shrink(ensRegionIds, "EnsRegionIds", "json");
            this.putQueryParameter("EnsRegionIds", ensRegionIdsShrink);
            this.ensRegionIds = ensRegionIds;
            return this;
        }

        /**
         * The end of the time range to query. Specify the time in the 2006-01-02 format. By default, the time range to query is not restricted.
         */
        public Builder maxDate(String maxDate) {
            this.putQueryParameter("MaxDate", maxDate);
            this.maxDate = maxDate;
            return this;
        }

        /**
         * The beginning of the time range to query. Specify the time in the 2006-01-02 format. By default, the time range to query is not restricted.
         */
        public Builder minDate(String minDate) {
            this.putQueryParameter("MinDate", minDate);
            this.minDate = minDate;
            return this;
        }

        /**
         * The name of the server.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The sorting order of the results to return. Valid values: ServerIdSort, ServerNameSort, ExpireTimeSort, CreationTimeSort, and EnsRegionIdSort.
         * <p>
         * 
         * asc: ascending order. desc: descending order.
         */
        public Builder orderByParams(String orderByParams) {
            this.putQueryParameter("OrderByParams", orderByParams);
            this.orderByParams = orderByParams;
            return this;
        }

        /**
         * The page number. Pages start from page **1**.
         * <p>
         * 
         * Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. The maximum value is **100**.
         * <p>
         * 
         * Default value: **10**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The IDs of the ARM servers.
         */
        public Builder serverIds(java.util.List < String > serverIds) {
            String serverIdsShrink = shrink(serverIds, "ServerIds", "json");
            this.putQueryParameter("ServerIds", serverIdsShrink);
            this.serverIds = serverIds;
            return this;
        }

        /**
         * The server specifications.
         */
        public Builder serverSpecs(java.util.List < String > serverSpecs) {
            String serverSpecsShrink = shrink(serverSpecs, "ServerSpecs", "json");
            this.putQueryParameter("ServerSpecs", serverSpecsShrink);
            this.serverSpecs = serverSpecs;
            return this;
        }

        /**
         * The operation statuses.
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
