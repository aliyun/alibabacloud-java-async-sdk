// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSchemaDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeSchemaDetailRequest</p>
 */
public class DescribeSchemaDetailRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Bizid")
    private String bizid;

    @Body
    @NameInMap("SchemaId")
    private Long schemaId;

    private DescribeSchemaDetailRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizid = builder.bizid;
        this.schemaId = builder.schemaId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSchemaDetailRequest create() {
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
     * @return bizid
     */
    public String getBizid() {
        return this.bizid;
    }

    /**
     * @return schemaId
     */
    public Long getSchemaId() {
        return this.schemaId;
    }

    public static final class Builder extends Request.Builder<DescribeSchemaDetailRequest, Builder> {
        private String regionId; 
        private String bizid; 
        private Long schemaId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSchemaDetailRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizid = request.bizid;
            this.schemaId = request.schemaId;
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
         * Bizid.
         */
        public Builder bizid(String bizid) {
            this.putBodyParameter("Bizid", bizid);
            this.bizid = bizid;
            return this;
        }

        /**
         * SchemaId.
         */
        public Builder schemaId(Long schemaId) {
            this.putBodyParameter("SchemaId", schemaId);
            this.schemaId = schemaId;
            return this;
        }

        @Override
        public DescribeSchemaDetailRequest build() {
            return new DescribeSchemaDetailRequest(this);
        } 

    } 

}
