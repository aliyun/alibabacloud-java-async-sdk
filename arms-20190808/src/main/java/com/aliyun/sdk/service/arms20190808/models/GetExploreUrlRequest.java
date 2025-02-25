// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link GetExploreUrlRequest} extends {@link RequestModel}
 *
 * <p>GetExploreUrlRequest</p>
 */
public class GetExploreUrlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Expression")
    private String expression;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private GetExploreUrlRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.expression = builder.expression;
        this.regionId = builder.regionId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExploreUrlRequest create() {
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
     * @return expression
     */
    public String getExpression() {
        return this.expression;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetExploreUrlRequest, Builder> {
        private String clusterId; 
        private String expression; 
        private String regionId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetExploreUrlRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.expression = request.expression;
            this.regionId = request.regionId;
            this.type = request.type;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c9cc4c5e220f8461f9d71b6ec6e******</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The query statement that corresponds to the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>{app=&quot;buy2&quot;}</p>
         */
        public Builder expression(String expression) {
            this.putQueryParameter("Expression", expression);
            this.expression = expression;
            return this;
        }

        /**
         * <p>The region ID.</p>
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
         * <p>The type of the Grafana data source.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>prometheus</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetExploreUrlRequest build() {
            return new GetExploreUrlRequest(this);
        } 

    } 

}
