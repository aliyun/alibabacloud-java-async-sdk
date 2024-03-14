// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGatewayStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribeGatewayStatisticsRequest</p>
 */
public class DescribeGatewayStatisticsRequest extends Request {
    @Query
    @NameInMap("EndTimestamp")
    private Long endTimestamp;

    @Query
    @NameInMap("GatewayCategory")
    private String gatewayCategory;

    @Query
    @NameInMap("GatewayLocation")
    private String gatewayLocation;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("StartTimestamp")
    private Long startTimestamp;

    @Query
    @NameInMap("TargetAccountId")
    private String targetAccountId;

    private DescribeGatewayStatisticsRequest(Builder builder) {
        super(builder);
        this.endTimestamp = builder.endTimestamp;
        this.gatewayCategory = builder.gatewayCategory;
        this.gatewayLocation = builder.gatewayLocation;
        this.securityToken = builder.securityToken;
        this.startTimestamp = builder.startTimestamp;
        this.targetAccountId = builder.targetAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGatewayStatisticsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTimestamp
     */
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    /**
     * @return gatewayCategory
     */
    public String getGatewayCategory() {
        return this.gatewayCategory;
    }

    /**
     * @return gatewayLocation
     */
    public String getGatewayLocation() {
        return this.gatewayLocation;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return startTimestamp
     */
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

    /**
     * @return targetAccountId
     */
    public String getTargetAccountId() {
        return this.targetAccountId;
    }

    public static final class Builder extends Request.Builder<DescribeGatewayStatisticsRequest, Builder> {
        private Long endTimestamp; 
        private String gatewayCategory; 
        private String gatewayLocation; 
        private String securityToken; 
        private Long startTimestamp; 
        private String targetAccountId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGatewayStatisticsRequest request) {
            super(request);
            this.endTimestamp = request.endTimestamp;
            this.gatewayCategory = request.gatewayCategory;
            this.gatewayLocation = request.gatewayLocation;
            this.securityToken = request.securityToken;
            this.startTimestamp = request.startTimestamp;
            this.targetAccountId = request.targetAccountId;
        } 

        /**
         * EndTimestamp.
         */
        public Builder endTimestamp(Long endTimestamp) {
            this.putQueryParameter("EndTimestamp", endTimestamp);
            this.endTimestamp = endTimestamp;
            return this;
        }

        /**
         * GatewayCategory.
         */
        public Builder gatewayCategory(String gatewayCategory) {
            this.putQueryParameter("GatewayCategory", gatewayCategory);
            this.gatewayCategory = gatewayCategory;
            return this;
        }

        /**
         * GatewayLocation.
         */
        public Builder gatewayLocation(String gatewayLocation) {
            this.putQueryParameter("GatewayLocation", gatewayLocation);
            this.gatewayLocation = gatewayLocation;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * StartTimestamp.
         */
        public Builder startTimestamp(Long startTimestamp) {
            this.putQueryParameter("StartTimestamp", startTimestamp);
            this.startTimestamp = startTimestamp;
            return this;
        }

        /**
         * TargetAccountId.
         */
        public Builder targetAccountId(String targetAccountId) {
            this.putQueryParameter("TargetAccountId", targetAccountId);
            this.targetAccountId = targetAccountId;
            return this;
        }

        @Override
        public DescribeGatewayStatisticsRequest build() {
            return new DescribeGatewayStatisticsRequest(this);
        } 

    } 

}
