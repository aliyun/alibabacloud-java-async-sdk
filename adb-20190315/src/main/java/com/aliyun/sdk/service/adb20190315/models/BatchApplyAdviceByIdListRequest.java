// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchApplyAdviceByIdListRequest} extends {@link RequestModel}
 *
 * <p>BatchApplyAdviceByIdListRequest</p>
 */
public class BatchApplyAdviceByIdListRequest extends Request {
    @Query
    @NameInMap("AdviceDate")
    private Long adviceDate;

    @Query
    @NameInMap("AdviceIdList")
    private String adviceIdList;

    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private BatchApplyAdviceByIdListRequest(Builder builder) {
        super(builder);
        this.adviceDate = builder.adviceDate;
        this.adviceIdList = builder.adviceIdList;
        this.DBClusterId = builder.DBClusterId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchApplyAdviceByIdListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adviceDate
     */
    public Long getAdviceDate() {
        return this.adviceDate;
    }

    /**
     * @return adviceIdList
     */
    public String getAdviceIdList() {
        return this.adviceIdList;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<BatchApplyAdviceByIdListRequest, Builder> {
        private Long adviceDate; 
        private String adviceIdList; 
        private String DBClusterId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(BatchApplyAdviceByIdListRequest request) {
            super(request);
            this.adviceDate = request.adviceDate;
            this.adviceIdList = request.adviceIdList;
            this.DBClusterId = request.DBClusterId;
            this.regionId = request.regionId;
        } 

        /**
         * AdviceDate.
         */
        public Builder adviceDate(Long adviceDate) {
            this.putQueryParameter("AdviceDate", adviceDate);
            this.adviceDate = adviceDate;
            return this;
        }

        /**
         * AdviceIdList.
         */
        public Builder adviceIdList(String adviceIdList) {
            this.putQueryParameter("AdviceIdList", adviceIdList);
            this.adviceIdList = adviceIdList;
            return this;
        }

        /**
         * The message returned for the operation. Valid values:
         * <p>
         * 
         * *   **SUCCESS** is returned if the operation is successful.
         * *   An error message is returned if the operation fails.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public BatchApplyAdviceByIdListRequest build() {
            return new BatchApplyAdviceByIdListRequest(this);
        } 

    } 

}
