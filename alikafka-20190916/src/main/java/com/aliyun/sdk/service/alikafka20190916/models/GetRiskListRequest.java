// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

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
 * {@link GetRiskListRequest} extends {@link RequestModel}
 *
 * <p>GetRiskListRequest</p>
 */
public class GetRiskListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartIndex")
    private Long startIndex;

    private GetRiskListRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.startIndex = builder.startIndex;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRiskListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return startIndex
     */
    public Long getStartIndex() {
        return this.startIndex;
    }

    public static final class Builder extends Request.Builder<GetRiskListRequest, Builder> {
        private String instanceId; 
        private Long pageSize; 
        private String regionId; 
        private Long startIndex; 

        private Builder() {
            super();
        } 

        private Builder(GetRiskListRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.startIndex = request.startIndex;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alikafka_pre-cn-pe335pgxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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

        /**
         * StartIndex.
         */
        public Builder startIndex(Long startIndex) {
            this.putQueryParameter("StartIndex", startIndex);
            this.startIndex = startIndex;
            return this;
        }

        @Override
        public GetRiskListRequest build() {
            return new GetRiskListRequest(this);
        } 

    } 

}
