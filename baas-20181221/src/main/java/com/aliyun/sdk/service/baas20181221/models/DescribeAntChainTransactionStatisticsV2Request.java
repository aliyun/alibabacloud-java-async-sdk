// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainTransactionStatisticsV2Request} extends {@link RequestModel}
 *
 * <p>DescribeAntChainTransactionStatisticsV2Request</p>
 */
public class DescribeAntChainTransactionStatisticsV2Request extends Request {
    @Body
    @NameInMap("AntChainId")
    @Validation(required = true)
    private String antChainId;

    @Body
    @NameInMap("ConsortiumId")
    private String consortiumId;

    @Body
    @NameInMap("End")
    @Validation()
    private Long end;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Start")
    @Validation()
    private Long start;

    private DescribeAntChainTransactionStatisticsV2Request(Builder builder) {
        super(builder);
        this.antChainId = builder.antChainId;
        this.consortiumId = builder.consortiumId;
        this.end = builder.end;
        this.regionId = builder.regionId;
        this.start = builder.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAntChainTransactionStatisticsV2Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return start
     */
    public Long getStart() {
        return this.start;
    }

    public static final class Builder extends Request.Builder<DescribeAntChainTransactionStatisticsV2Request, Builder> {
        private String antChainId; 
        private String consortiumId; 
        private Long end; 
        private String regionId; 
        private Long start; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAntChainTransactionStatisticsV2Request response) {
            super(response);
            this.antChainId = response.antChainId;
            this.consortiumId = response.consortiumId;
            this.end = response.end;
            this.regionId = response.regionId;
            this.start = response.start;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
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
        public DescribeAntChainTransactionStatisticsV2Request build() {
            return new DescribeAntChainTransactionStatisticsV2Request(this);
        } 

    } 

}
