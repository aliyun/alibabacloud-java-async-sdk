// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricOrdererLogsRequest} extends {@link RequestModel}
 *
 * <p>DescribeFabricOrdererLogsRequest</p>
 */
public class DescribeFabricOrdererLogsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsortiumId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String consortiumId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lines")
    private String lines;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrdererName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ordererName;

    private DescribeFabricOrdererLogsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.consortiumId = builder.consortiumId;
        this.lines = builder.lines;
        this.ordererName = builder.ordererName;
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

    public static final class Builder extends Request.Builder<DescribeFabricOrdererLogsRequest, Builder> {
        private String regionId; 
        private String consortiumId; 
        private String lines; 
        private String ordererName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFabricOrdererLogsRequest request) {
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
        public DescribeFabricOrdererLogsRequest build() {
            return new DescribeFabricOrdererLogsRequest(this);
        } 

    } 

}
