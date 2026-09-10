// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeConsumersRequest} extends {@link RequestModel}
 *
 * <p>DescribeConsumersRequest</p>
 */
public class DescribeConsumersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsumerGroupId")
    private String consumerGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsumerId")
    private String consumerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsumerName")
    private String consumerName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsumerNameList")
    private String consumerNameList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GwClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gwClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DescribeConsumersRequest(Builder builder) {
        super(builder);
        this.consumerGroupId = builder.consumerGroupId;
        this.consumerId = builder.consumerId;
        this.consumerName = builder.consumerName;
        this.consumerNameList = builder.consumerNameList;
        this.gwClusterId = builder.gwClusterId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConsumersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consumerGroupId
     */
    public String getConsumerGroupId() {
        return this.consumerGroupId;
    }

    /**
     * @return consumerId
     */
    public String getConsumerId() {
        return this.consumerId;
    }

    /**
     * @return consumerName
     */
    public String getConsumerName() {
        return this.consumerName;
    }

    /**
     * @return consumerNameList
     */
    public String getConsumerNameList() {
        return this.consumerNameList;
    }

    /**
     * @return gwClusterId
     */
    public String getGwClusterId() {
        return this.gwClusterId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeConsumersRequest, Builder> {
        private String consumerGroupId; 
        private String consumerId; 
        private String consumerName; 
        private String consumerNameList; 
        private String gwClusterId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeConsumersRequest request) {
            super(request);
            this.consumerGroupId = request.consumerGroupId;
            this.consumerId = request.consumerId;
            this.consumerName = request.consumerName;
            this.consumerNameList = request.consumerNameList;
            this.gwClusterId = request.gwClusterId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The user group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cg-xxxxxxxx</p>
         */
        public Builder consumerGroupId(String consumerGroupId) {
            this.putQueryParameter("ConsumerGroupId", consumerGroupId);
            this.consumerGroupId = consumerGroupId;
            return this;
        }

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c-mqveroemc***</p>
         */
        public Builder consumerId(String consumerId) {
            this.putQueryParameter("ConsumerId", consumerId);
            this.consumerId = consumerId;
            return this;
        }

        /**
         * ConsumerName.
         */
        public Builder consumerName(String consumerName) {
            this.putQueryParameter("ConsumerName", consumerName);
            this.consumerName = consumerName;
            return this;
        }

        /**
         * ConsumerNameList.
         */
        public Builder consumerNameList(String consumerNameList) {
            this.putQueryParameter("ConsumerNameList", consumerNameList);
            this.consumerNameList = consumerNameList;
            return this;
        }

        /**
         * <p>The gateway instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-xxxxxxxxxx</p>
         */
        public Builder gwClusterId(String gwClusterId) {
            this.putQueryParameter("GwClusterId", gwClusterId);
            this.gwClusterId = gwClusterId;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
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
         * <p>The number of entries per page. Valid values:</p>
         * <ul>
         * <li><strong>30</strong></li>
         * <li><strong>50</strong></li>
         * <li><strong>100</strong>
         * Default value: <strong>30</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeConsumersRequest build() {
            return new DescribeConsumersRequest(this);
        } 

    } 

}
