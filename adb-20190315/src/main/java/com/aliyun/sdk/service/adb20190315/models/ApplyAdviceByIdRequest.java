// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ApplyAdviceByIdRequest} extends {@link RequestModel}
 *
 * <p>ApplyAdviceByIdRequest</p>
 */
public class ApplyAdviceByIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdviceDate")
    private Long adviceDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdviceId")
    private String adviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ApplyAdviceByIdRequest(Builder builder) {
        super(builder);
        this.adviceDate = builder.adviceDate;
        this.adviceId = builder.adviceId;
        this.DBClusterId = builder.DBClusterId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyAdviceByIdRequest create() {
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
     * @return adviceId
     */
    public String getAdviceId() {
        return this.adviceId;
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

    public static final class Builder extends Request.Builder<ApplyAdviceByIdRequest, Builder> {
        private Long adviceDate; 
        private String adviceId; 
        private String DBClusterId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ApplyAdviceByIdRequest request) {
            super(request);
            this.adviceDate = request.adviceDate;
            this.adviceId = request.adviceId;
            this.DBClusterId = request.DBClusterId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The date when the suggestion is generated. Specify the date in the yyyyMMdd format. The date must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>20221101</p>
         */
        public Builder adviceDate(Long adviceDate) {
            this.putQueryParameter("AdviceDate", adviceDate);
            this.adviceDate = adviceDate;
            return this;
        }

        /**
         * <p>The suggestion ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0baf1f52-53df-487f-8292-99a03716****</p>
         */
        public Builder adviceId(String adviceId) {
            this.putQueryParameter("AdviceId", adviceId);
            this.adviceId = adviceId;
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
         * <p>The region ID of the cluster.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * </blockquote>
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
        public ApplyAdviceByIdRequest build() {
            return new ApplyAdviceByIdRequest(this);
        } 

    } 

}
