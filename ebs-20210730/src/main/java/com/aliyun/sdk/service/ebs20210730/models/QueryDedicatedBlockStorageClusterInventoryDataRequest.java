// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryDedicatedBlockStorageClusterInventoryDataRequest} extends {@link RequestModel}
 *
 * <p>QueryDedicatedBlockStorageClusterInventoryDataRequest</p>
 */
public class QueryDedicatedBlockStorageClusterInventoryDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DbscId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbscId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Period")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer period;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    private QueryDedicatedBlockStorageClusterInventoryDataRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dbscId = builder.dbscId;
        this.endTime = builder.endTime;
        this.period = builder.period;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDedicatedBlockStorageClusterInventoryDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dbscId
     */
    public String getDbscId() {
        return this.dbscId;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<QueryDedicatedBlockStorageClusterInventoryDataRequest, Builder> {
        private String clientToken; 
        private String dbscId; 
        private Long endTime; 
        private Integer period; 
        private String regionId; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(QueryDedicatedBlockStorageClusterInventoryDataRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dbscId = request.dbscId;
            this.endTime = request.endTime;
            this.period = request.period;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests.</p>
         * <p>The ClientToken value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How do I ensure idempotence </a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The ID of the dedicated block storage cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dbsc-xxx</p>
         */
        public Builder dbscId(String dbscId) {
            this.putBodyParameter("DbscId", dbscId);
            this.dbscId = dbscId;
            return this;
        }

        /**
         * <p>End timestamp of trend data.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1606403800</p>
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The time interval (seconds) between data retrieval points.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder period(Integer period) {
            this.putBodyParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The region ID of the dedicated block storage cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Start timestamp of trend data.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1606303800</p>
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public QueryDedicatedBlockStorageClusterInventoryDataRequest build() {
            return new QueryDedicatedBlockStorageClusterInventoryDataRequest(this);
        } 

    } 

}
