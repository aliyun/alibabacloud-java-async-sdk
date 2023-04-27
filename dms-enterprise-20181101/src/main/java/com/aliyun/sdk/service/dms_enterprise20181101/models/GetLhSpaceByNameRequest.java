// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLhSpaceByNameRequest} extends {@link RequestModel}
 *
 * <p>GetLhSpaceByNameRequest</p>
 */
public class GetLhSpaceByNameRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SpaceName")
    @Validation(required = true)
    private String spaceName;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    private GetLhSpaceByNameRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.spaceName = builder.spaceName;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLhSpaceByNameRequest create() {
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
     * @return spaceName
     */
    public String getSpaceName() {
        return this.spaceName;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<GetLhSpaceByNameRequest, Builder> {
        private String regionId; 
        private String spaceName; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(GetLhSpaceByNameRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.spaceName = request.spaceName;
            this.tid = request.tid;
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
         * Indicates whether the workspace is deleted. Valid values:
         * <p>
         * 
         * *   **true**: The workspace is deleted.
         * *   **false**: The workspace is not deleted.
         */
        public Builder spaceName(String spaceName) {
            this.putQueryParameter("SpaceName", spaceName);
            this.spaceName = spaceName;
            return this;
        }

        /**
         * The type of the database. Valid values:
         * <p>
         * 
         * *   **14**: AnalyticDB for MySQL
         * *   **18**: AnalyticDB for PostgreSQL
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public GetLhSpaceByNameRequest build() {
            return new GetLhSpaceByNameRequest(this);
        } 

    } 

}
