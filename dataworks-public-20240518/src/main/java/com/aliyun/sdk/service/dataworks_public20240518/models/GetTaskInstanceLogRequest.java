// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetTaskInstanceLogRequest} extends {@link RequestModel}
 *
 * <p>GetTaskInstanceLogRequest</p>
 */
public class GetTaskInstanceLogRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RunNumber")
    private Integer runNumber;

    private GetTaskInstanceLogRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.id = builder.id;
        this.runNumber = builder.runNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTaskInstanceLogRequest create() {
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
     * @return runNumber
     */
    public Integer getRunNumber() {
        return this.runNumber;
    }

    public static final class Builder extends Request.Builder<GetTaskInstanceLogRequest, Builder> {
        private String regionId; 
        private Long id; 
        private Integer runNumber; 

        private Builder() {
            super();
        } 

        private Builder(GetTaskInstanceLogRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.id = request.id;
            this.runNumber = request.runNumber;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The sequence number of an instance run. Minimum value: 1. By default, the latest run is used.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder runNumber(Integer runNumber) {
            this.putQueryParameter("RunNumber", runNumber);
            this.runNumber = runNumber;
            return this;
        }

        @Override
        public GetTaskInstanceLogRequest build() {
            return new GetTaskInstanceLogRequest(this);
        } 

    } 

}
