// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetQualityWatchByObjectIdRequest} extends {@link RequestModel}
 *
 * <p>GetQualityWatchByObjectIdRequest</p>
 */
public class GetQualityWatchByObjectIdRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WatchObjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String watchObjectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WatchType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String watchType;

    private GetQualityWatchByObjectIdRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.watchObjectId = builder.watchObjectId;
        this.watchType = builder.watchType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQualityWatchByObjectIdRequest create() {
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
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return watchObjectId
     */
    public String getWatchObjectId() {
        return this.watchObjectId;
    }

    /**
     * @return watchType
     */
    public String getWatchType() {
        return this.watchType;
    }

    public static final class Builder extends Request.Builder<GetQualityWatchByObjectIdRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private String watchObjectId; 
        private String watchType; 

        private Builder() {
            super();
        } 

        private Builder(GetQualityWatchByObjectIdRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.watchObjectId = request.watchObjectId;
            this.watchType = request.watchType;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cc</p>
         */
        public Builder watchObjectId(String watchObjectId) {
            this.putQueryParameter("WatchObjectId", watchObjectId);
            this.watchObjectId = watchObjectId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        public Builder watchType(String watchType) {
            this.putQueryParameter("WatchType", watchType);
            this.watchType = watchType;
            return this;
        }

        @Override
        public GetQualityWatchByObjectIdRequest build() {
            return new GetQualityWatchByObjectIdRequest(this);
        } 

    } 

}
