// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
         * <p>The date when the suggestion is generated. Specify the date in the yyyyMMdd format. The date must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>20221115</p>
         */
        public Builder adviceDate(Long adviceDate) {
            this.putQueryParameter("AdviceDate", adviceDate);
            this.adviceDate = adviceDate;
            return this;
        }

        /**
         * <p>The IDs of the suggestions to be applied. Separate multiple IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>c2589ff3-e86c-4f19-80c8-2aeb7dd9****,53414470-ebf4-4a53-a312-8a1ad8fd****,6e8dce84-fec8-4b0b-9c04-b0cea12c****,b3b9703d-55ca-47e0-96dd-6a4a9dbf****</p>
         */
        public Builder adviceIdList(String adviceIdList) {
            this.putQueryParameter("AdviceIdList", adviceIdList);
            this.adviceIdList = adviceIdList;
            return this;
        }

        /**
         * <p>The ID of the cluster.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the IDs of Data Warehouse Edition (V3.0) clusters.</p>
         * </blockquote>
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
         * <p>The region ID of the cluster. You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
