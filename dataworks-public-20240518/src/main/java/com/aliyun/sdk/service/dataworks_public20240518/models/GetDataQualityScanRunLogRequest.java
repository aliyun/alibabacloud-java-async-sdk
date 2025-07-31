// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDataQualityScanRunLogRequest} extends {@link RequestModel}
 *
 * <p>GetDataQualityScanRunLogRequest</p>
 */
public class GetDataQualityScanRunLogRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Offset")
    private Long offset;

    private GetDataQualityScanRunLogRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.id = builder.id;
        this.offset = builder.offset;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataQualityScanRunLogRequest create() {
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
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return offset
     */
    public Long getOffset() {
        return this.offset;
    }

    public static final class Builder extends Request.Builder<GetDataQualityScanRunLogRequest, Builder> {
        private String regionId; 
        private Long id; 
        private Long offset; 

        private Builder() {
            super();
        } 

        private Builder(GetDataQualityScanRunLogRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.id = request.id;
            this.offset = request.offset;
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
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Offset.
         */
        public Builder offset(Long offset) {
            this.putQueryParameter("Offset", offset);
            this.offset = offset;
            return this;
        }

        @Override
        public GetDataQualityScanRunLogRequest build() {
            return new GetDataQualityScanRunLogRequest(this);
        } 

    } 

}
