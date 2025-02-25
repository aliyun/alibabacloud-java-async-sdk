// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainTransactionStatisticsNewRequest} extends {@link RequestModel}
 *
 * <p>DescribeAntChainTransactionStatisticsNewRequest</p>
 */
public class DescribeAntChainTransactionStatisticsNewRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AntChainId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String antChainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConsortiumId")
    private String consortiumId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("End")
    @com.aliyun.core.annotation.Validation()
    private Long end;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Start")
    @com.aliyun.core.annotation.Validation()
    private Long start;

    private DescribeAntChainTransactionStatisticsNewRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.antChainId = builder.antChainId;
        this.consortiumId = builder.consortiumId;
        this.end = builder.end;
        this.start = builder.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAntChainTransactionStatisticsNewRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return antChainId
     */
    public String getAntChainId() {
        return this.antChainId;
    }

    /**
     * @return consortiumId
     */
    public String getConsortiumId() {
        return this.consortiumId;
    }

    /**
     * @return end
     */
    public Long getEnd() {
        return this.end;
    }

    /**
     * @return start
     */
    public Long getStart() {
        return this.start;
    }

    public static final class Builder extends Request.Builder<DescribeAntChainTransactionStatisticsNewRequest, Builder> {
        private String regionId; 
        private String antChainId; 
        private String consortiumId; 
        private Long end; 
        private Long start; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAntChainTransactionStatisticsNewRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.antChainId = request.antChainId;
            this.consortiumId = request.consortiumId;
            this.end = request.end;
            this.start = request.start;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AntChainId.
         */
        public Builder antChainId(String antChainId) {
            this.putBodyParameter("AntChainId", antChainId);
            this.antChainId = antChainId;
            return this;
        }

        /**
         * ConsortiumId.
         */
        public Builder consortiumId(String consortiumId) {
            this.putBodyParameter("ConsortiumId", consortiumId);
            this.consortiumId = consortiumId;
            return this;
        }

        /**
         * End.
         */
        public Builder end(Long end) {
            this.putBodyParameter("End", end);
            this.end = end;
            return this;
        }

        /**
         * Start.
         */
        public Builder start(Long start) {
            this.putBodyParameter("Start", start);
            this.start = start;
            return this;
        }

        @Override
        public DescribeAntChainTransactionStatisticsNewRequest build() {
            return new DescribeAntChainTransactionStatisticsNewRequest(this);
        } 

    } 

}
