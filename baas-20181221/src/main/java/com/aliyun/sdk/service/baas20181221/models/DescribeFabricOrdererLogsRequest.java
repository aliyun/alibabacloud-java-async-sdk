// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricOrdererLogsRequest} extends {@link RequestModel}
 *
 * <p>DescribeFabricOrdererLogsRequest</p>
 */
public class DescribeFabricOrdererLogsRequest extends Request {
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

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DescribeFabricOrdererLogsRequest(Builder builder) {
        super(builder);
        this.consortiumId = builder.consortiumId;
        this.lines = builder.lines;
        this.ordererName = builder.ordererName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFabricOrdererLogsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeFabricOrdererLogsRequest, Builder> {
        private String consortiumId; 
        private String lines; 
        private String ordererName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFabricOrdererLogsRequest response) {
            super(response);
            this.consortiumId = response.consortiumId;
            this.lines = response.lines;
            this.ordererName = response.ordererName;
            this.regionId = response.regionId;
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

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeFabricOrdererLogsRequest build() {
            return new DescribeFabricOrdererLogsRequest(this);
        } 

    } 

}
