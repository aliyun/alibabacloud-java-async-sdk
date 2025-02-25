// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link BatchApplyAdviceByIdListRequest} extends {@link RequestModel}
 *
 * <p>BatchApplyAdviceByIdListRequest</p>
 */
public class BatchApplyAdviceByIdListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdviceDate")
    private Long adviceDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdviceIdList")
    private String adviceIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>am-uf6g8w25jacm7****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
