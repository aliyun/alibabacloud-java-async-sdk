// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainTransactionStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAntChainTransactionStatisticsRequest</p>
 */
public class DescribeAntChainTransactionStatisticsRequest extends Request {
    @Body
    @NameInMap("AntChainId")
    @Validation(required = true)
    private String antChainId;

    @Body
    @NameInMap("End")
    @Validation(required = true)
    private Long end;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Start")
    @Validation(required = true)
    private Long start;

    private DescribeAntChainTransactionStatisticsRequest(Builder builder) {
        super(builder);
        this.antChainId = builder.antChainId;
        this.end = builder.end;
        this.regionId = builder.regionId;
        this.start = builder.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAntChainTransactionStatisticsRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeAntChainTransactionStatisticsRequest, Builder> {
        private String antChainId; 
        private Long end; 
        private String regionId; 
        private Long start; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAntChainTransactionStatisticsRequest response) {
            super(response);
            this.antChainId = response.antChainId;
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
        public DescribeAntChainTransactionStatisticsRequest build() {
            return new DescribeAntChainTransactionStatisticsRequest(this);
        } 

    } 

}
