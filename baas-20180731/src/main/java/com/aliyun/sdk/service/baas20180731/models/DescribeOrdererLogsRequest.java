// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOrdererLogsRequest} extends {@link RequestModel}
 *
 * <p>DescribeOrdererLogsRequest</p>
 */
public class DescribeOrdererLogsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ConsortiumId")
    @Validation(required = true)
    private String consortiumId;

    @Query
    @NameInMap("Lines")
    private String lines;

    @Query
    @NameInMap("OrdererName")
    @Validation(required = true)
    private String ordererName;

    private DescribeOrdererLogsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.consortiumId = builder.consortiumId;
        this.lines = builder.lines;
        this.ordererName = builder.ordererName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOrdererLogsRequest create() {
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
     * @return consortiumId
     */
    public String getConsortiumId() {
        return this.consortiumId;
    }

    /**
     * @return lines
     */
    public String getLines() {
        return this.lines;
    }

    /**
     * @return ordererName
     */
    public String getOrdererName() {
        return this.ordererName;
    }

    public static final class Builder extends Request.Builder<DescribeOrdererLogsRequest, Builder> {
        private String regionId; 
        private String consortiumId; 
        private String lines; 
        private String ordererName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOrdererLogsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.consortiumId = request.consortiumId;
            this.lines = request.lines;
            this.ordererName = request.ordererName;
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
         * ConsortiumId.
         */
        public Builder consortiumId(String consortiumId) {
            this.putQueryParameter("ConsortiumId", consortiumId);
            this.consortiumId = consortiumId;
            return this;
        }

        /**
         * Lines.
         */
        public Builder lines(String lines) {
            this.putQueryParameter("Lines", lines);
            this.lines = lines;
            return this;
        }

        /**
         * OrdererName.
         */
        public Builder ordererName(String ordererName) {
            this.putQueryParameter("OrdererName", ordererName);
            this.ordererName = ordererName;
            return this;
        }

        @Override
        public DescribeOrdererLogsRequest build() {
            return new DescribeOrdererLogsRequest(this);
        } 

    } 

}
