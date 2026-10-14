// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeARMServerInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeARMServerInstancesRequest</p>
 */
public class DescribeARMServerInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AICSpecs")
    private java.util.List<String> AICSpecs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DescribeAICInstances")
    private Boolean describeAICInstances;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionIds")
    private java.util.List<String> ensRegionIds;

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
    private java.util.List<String> serverIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerSpecs")
    private java.util.List<String> serverSpecs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("States")
    private java.util.List<String> states;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

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
        this.tags = builder.tags;
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
    public java.util.List<String> getAICSpecs() {
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
    public java.util.List<String> getEnsRegionIds() {
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
    public java.util.List<String> getServerIds() {
        return this.serverIds;
    }

    /**
     * @return serverSpecs
     */
    public java.util.List<String> getServerSpecs() {
        return this.serverSpecs;
    }

    /**
     * @return states
     */
    public java.util.List<String> getStates() {
        return this.states;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<DescribeARMServerInstancesRequest, Builder> {
        private java.util.List<String> AICSpecs; 
        private Boolean describeAICInstances; 
        private java.util.List<String> ensRegionIds; 
        private String maxDate; 
        private String minDate; 
        private String name; 
        private String namespace; 
        private String orderByParams; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List<String> serverIds; 
        private java.util.List<String> serverSpecs; 
        private java.util.List<String> states; 
        private java.util.List<Tags> tags; 

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
            this.tags = request.tags;
        } 

        /**
         * <p>The list of container specifications.</p>
         */
        public Builder AICSpecs(java.util.List<String> AICSpecs) {
            String AICSpecsShrink = shrink(AICSpecs, "AICSpecs", "json");
            this.putQueryParameter("AICSpecs", AICSpecsShrink);
            this.AICSpecs = AICSpecs;
            return this;
        }

        /**
         * <p>Specifies whether the query results include container information. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Included.</p>
         * </li>
         * <li><p><strong>false</strong>: Not included.</p>
         * </li>
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
         * <p>The list of ENS edge zone IDs.</p>
         */
        public Builder ensRegionIds(java.util.List<String> ensRegionIds) {
            String ensRegionIdsShrink = shrink(ensRegionIds, "EnsRegionIds", "json");
            this.putQueryParameter("EnsRegionIds", ensRegionIdsShrink);
            this.ensRegionIds = ensRegionIds;
            return this;
        }

        /**
         * <p>The end time of the query. Format: &quot;2006-01-02&quot;. By default, no time limit is applied.</p>
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
         * <p>The start time of the query. Format: &quot;2006-01-02&quot;. By default, no time limit is applied.</p>
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
         * <p>The server name.</p>
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
         * <p>The sorting method for query results. You can sort results by one or more of the following fields: ServerIdSort (server ID), ServerNameSort (server name), ExpireTimeSort (expiration time), CreationTimeSort (creation time), and EnsRegionIdSort (edge zone ID).</p>
         * <p>Valid values: asc (ascending order) and desc (descending order).</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ServerIdSort&quot;:&quot;desc&quot;,&quot;ServerNameSort&quot;:&quot;desc&quot;,&quot;ExpireTimeSort&quot;:&quot;asc&quot;}</p>
         */
        public Builder orderByParams(String orderByParams) {
            this.putQueryParameter("OrderByParams", orderByParams);
            this.orderByParams = orderByParams;
            return this;
        }

        /**
         * <p>The page number of the query list. Minimum value: <strong>1</strong>.</p>
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
         * <p>The number of entries per page for a paged query. Maximum value: <strong>100</strong>.</p>
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
         * <p>The list of server instance IDs.</p>
         */
        public Builder serverIds(java.util.List<String> serverIds) {
            String serverIdsShrink = shrink(serverIds, "ServerIds", "json");
            this.putQueryParameter("ServerIds", serverIdsShrink);
            this.serverIds = serverIds;
            return this;
        }

        /**
         * <p>The list of server specifications.</p>
         */
        public Builder serverSpecs(java.util.List<String> serverSpecs) {
            String serverSpecsShrink = shrink(serverSpecs, "ServerSpecs", "json");
            this.putQueryParameter("ServerSpecs", serverSpecsShrink);
            this.serverSpecs = serverSpecs;
            return this;
        }

        /**
         * <p>The list of operation states.</p>
         */
        public Builder states(java.util.List<String> states) {
            String statesShrink = shrink(states, "States", "json");
            this.putQueryParameter("States", statesShrink);
            this.states = states;
            return this;
        }

        /**
         * <p>The list of tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        @Override
        public DescribeARMServerInstancesRequest build() {
            return new DescribeARMServerInstancesRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeARMServerInstancesRequest} extends {@link TeaModel}
     *
     * <p>DescribeARMServerInstancesRequest</p>
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>key-1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>value-1</p>
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
