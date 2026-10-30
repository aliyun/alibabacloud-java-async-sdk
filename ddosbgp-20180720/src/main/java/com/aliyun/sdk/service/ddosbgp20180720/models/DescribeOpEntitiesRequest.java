// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

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
 * {@link DescribeOpEntitiesRequest} extends {@link RequestModel}
 *
 * <p>DescribeOpEntitiesRequest</p>
 */
public class DescribeOpEntitiesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpAction")
    private Integer opAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderDir")
    private String orderDir;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    private DescribeOpEntitiesRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.opAction = builder.opAction;
        this.orderBy = builder.orderBy;
        this.orderDir = builder.orderDir;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOpEntitiesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return opAction
     */
    public Integer getOpAction() {
        return this.opAction;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return orderDir
     */
    public String getOrderDir() {
        return this.orderDir;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeOpEntitiesRequest, Builder> {
        private Integer currentPage; 
        private Long endTime; 
        private String instanceId; 
        private Integer opAction; 
        private String orderBy; 
        private String orderDir; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceGroupId; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOpEntitiesRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.opAction = request.opAction;
            this.orderBy = request.orderBy;
            this.orderDir = request.orderDir;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The paging Settings for the current page number in a paged query.</p>
         * <p>This parameter is required.</p>
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
         * <p>The end of the time range to query. The value is a UNIX timestamp in milliseconds. Operation logs generated before this time are queried.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1640880000000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the Anti-DDoS Origin instance to query.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/118698.html">DescribeInstanceList</a> operation to query the IDs of all Anti-DDoS Origin instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ddosbgp-cn-n6w1r7nz****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The operation type. Valid values:</p>
         * <ul>
         * <li><strong>3</strong>: attach an IP address</li>
         * <li><strong>4</strong>: unbind an IP address</li>
         * <li><strong>5</strong>: decrease the quota</li>
         * <li><strong>6</strong>: deactivate blackhole filtering</li>
         * <li><strong>7</strong>: Reset quota on blackhole filtering deactivation</li>
         * <li><strong>8</strong>: recover burstable protection</li>
         * <li><strong>9</strong>: add an Asset group</li>
         * <li><strong>10</strong>: delete an Asset group</li>
         * <li><strong>11</strong>: enable daily 95th percentile bandwidth</li>
         * <li><strong>12</strong>: enable monthly 95th percentile bandwidth</li>
         * <li><strong>13</strong>: periodically switch between daily and monthly 95th percentile bandwidth patterns</li>
         * <li><strong>14</strong>: shutdown daily 95th percentile bandwidth</li>
         * <li><strong>15</strong>: shutdown monthly 95th percentile bandwidth</li>
         * <li><strong>16</strong>: shutdown burstable clean bandwidth due to overdue payments</li>
         * <li><strong>17</strong>: shutdown burstable clean bandwidth when they expire</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder opAction(Integer opAction) {
            this.putQueryParameter("OpAction", opAction);
            this.opAction = opAction;
            return this;
        }

        /**
         * <p>The field by which to sort the operation logs. Set the value to <strong>opdate</strong>, which indicates that the operation logs are sorted by operation time.</p>
         * 
         * <strong>example:</strong>
         * <p>opdate</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The sort order of the operation logs. Valid values:</p>
         * <ul>
         * <li><strong>ASC</strong>: ascending order</li>
         * <li><strong>DESC</strong>: descending order</li>
         * </ul>
         * <p>Default value: <strong>DESC</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>ASC</p>
         */
        public Builder orderDir(String orderDir) {
            this.putQueryParameter("OrderDir", orderDir);
            this.orderDir = orderDir;
            return this;
        }

        /**
         * <p>The paging Settings for the number of Operation logs per page in a paged query. Maximum value: 50.</p>
         * <p>This parameter is required.</p>
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
         * <p>The region ID of the Anti-DDoS Origin instance.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/118703.html">DescribeRegions</a> operation to query the IDs of all regions supported by Anti-DDoS Origin.</p>
         * </blockquote>
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
         * <p>The ID of the resource group to which the Anti-DDoS Origin instance belongs in Resource Management.</p>
         * <p>If you do not specify this parameter, the default resource group is used.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm2pz25js****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. The value is a UNIX timestamp in milliseconds. Operation logs generated after this time are queried.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1609430400000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeOpEntitiesRequest build() {
            return new DescribeOpEntitiesRequest(this);
        } 

    } 

}
