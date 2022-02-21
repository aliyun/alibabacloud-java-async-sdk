// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDbscInstanceRequest} extends {@link RequestModel}
 *
 * <p>DescribeDbscInstanceRequest</p>
 */
public class DescribeDbscInstanceRequest extends Request {
    @Query
    @NameInMap("Azone")
    @Validation(required = true)
    private String azone;

    @Query
    @NameInMap("DbscId")
    @Validation(required = true)
    private String dbscId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DescribeDbscInstanceRequest(Builder builder) {
        super(builder);
        this.azone = builder.azone;
        this.dbscId = builder.dbscId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDbscInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return azone
     */
    public String getAzone() {
        return this.azone;
    }

    /**
     * @return dbscId
     */
    public String getDbscId() {
        return this.dbscId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeDbscInstanceRequest, Builder> {
        private String azone; 
        private String dbscId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDbscInstanceRequest response) {
            super(response);
            this.azone = response.azone;
            this.dbscId = response.dbscId;
            this.regionId = response.regionId;
        } 

        /**
         * Azone.
         */
        public Builder azone(String azone) {
            this.putQueryParameter("Azone", azone);
            this.azone = azone;
            return this;
        }

        /**
         * DbscId.
         */
        public Builder dbscId(String dbscId) {
            this.putQueryParameter("DbscId", dbscId);
            this.dbscId = dbscId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeDbscInstanceRequest build() {
            return new DescribeDbscInstanceRequest(this);
        } 

    } 

}
