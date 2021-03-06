// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetExploreUrlRequest} extends {@link RequestModel}
 *
 * <p>GetExploreUrlRequest</p>
 */
public class GetExploreUrlRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("Expression")
    private String expression;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
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

        private Builder(GetExploreUrlRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.expression = response.expression;
            this.regionId = response.regionId;
            this.type = response.type;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Expression.
         */
        public Builder expression(String expression) {
            this.putQueryParameter("Expression", expression);
            this.expression = expression;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Type.
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
