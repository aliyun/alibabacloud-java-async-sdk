// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSmartContractJobsByNameRequest} extends {@link RequestModel}
 *
 * <p>DescribeSmartContractJobsByNameRequest</p>
 */
public class DescribeSmartContractJobsByNameRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("Size")
    private Integer size;

    @Body
    @NameInMap("Start")
    @Validation(required = true)
    private Integer start;

    private DescribeSmartContractJobsByNameRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.name = builder.name;
        this.size = builder.size;
        this.start = builder.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSmartContractJobsByNameRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return start
     */
    public Integer getStart() {
        return this.start;
    }

    public static final class Builder extends Request.Builder<DescribeSmartContractJobsByNameRequest, Builder> {
        private String regionId; 
        private String name; 
        private Integer size; 
        private Integer start; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSmartContractJobsByNameRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.name = request.name;
            this.size = request.size;
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
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(Integer size) {
            this.putBodyParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * Start.
         */
        public Builder start(Integer start) {
            this.putBodyParameter("Start", start);
            this.start = start;
            return this;
        }

        @Override
        public DescribeSmartContractJobsByNameRequest build() {
            return new DescribeSmartContractJobsByNameRequest(this);
        } 

    } 

}
