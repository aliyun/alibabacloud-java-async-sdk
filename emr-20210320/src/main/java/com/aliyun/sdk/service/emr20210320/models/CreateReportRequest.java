// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateReportRequest} extends {@link RequestModel}
 *
 * <p>CreateReportRequest</p>
 */
public class CreateReportRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SelectTimestamp")
    private Long selectTimestamp;

    private CreateReportRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.regionId = builder.regionId;
        this.selectTimestamp = builder.selectTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateReportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return selectTimestamp
     */
    public Long getSelectTimestamp() {
        return this.selectTimestamp;
    }

    public static final class Builder extends Request.Builder<CreateReportRequest, Builder> {
        private String clusterId; 
        private String regionId; 
        private Long selectTimestamp; 

        private Builder() {
            super();
        } 

        private Builder(CreateReportRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.regionId = request.regionId;
            this.selectTimestamp = request.selectTimestamp;
        } 

        /**
         * 集群ID。
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 地域ID。
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SelectTimestamp.
         */
        public Builder selectTimestamp(Long selectTimestamp) {
            this.putQueryParameter("SelectTimestamp", selectTimestamp);
            this.selectTimestamp = selectTimestamp;
            return this;
        }

        @Override
        public CreateReportRequest build() {
            return new CreateReportRequest(this);
        } 

    } 

}
