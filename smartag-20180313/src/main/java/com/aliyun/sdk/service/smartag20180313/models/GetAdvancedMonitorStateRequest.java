// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link GetAdvancedMonitorStateRequest} extends {@link RequestModel}
 *
 * <p>GetAdvancedMonitorStateRequest</p>
 */
public class GetAdvancedMonitorStateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SagId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sagId;

    private GetAdvancedMonitorStateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.sagId = builder.sagId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAdvancedMonitorStateRequest create() {
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
     * @return sagId
     */
    public String getSagId() {
        return this.sagId;
    }

    public static final class Builder extends Request.Builder<GetAdvancedMonitorStateRequest, Builder> {
        private String regionId; 
        private String sagId; 

        private Builder() {
            super();
        } 

        private Builder(GetAdvancedMonitorStateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.sagId = request.sagId;
        } 

        /**
         * <p>The region ID of the SAG instance.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/69813.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the SAG instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sag-asdfz6ac74oj5v****</p>
         */
        public Builder sagId(String sagId) {
            this.putQueryParameter("SagId", sagId);
            this.sagId = sagId;
            return this;
        }

        @Override
        public GetAdvancedMonitorStateRequest build() {
            return new GetAdvancedMonitorStateRequest(this);
        } 

    } 

}
