// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link GetQpsStatsRequest} extends {@link RequestModel}
 *
 * <p>GetQpsStatsRequest</p>
 */
public class GetQpsStatsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Query")
    private String query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private GetQpsStatsRequest(Builder builder) {
        super(builder);
        this.query = builder.query;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQpsStatsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetQpsStatsRequest, Builder> {
        private String query; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetQpsStatsRequest request) {
            super(request);
            this.query = request.query;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The query condition. The value is a string in JSON format.</p>
         * <blockquote>
         * <p>Different query conditions return different protected objects. For more information, see <strong>Query parameter description</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder query(String query) {
            this.putQueryParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetQpsStatsRequest build() {
            return new GetQpsStatsRequest(this);
        } 

    } 

}
