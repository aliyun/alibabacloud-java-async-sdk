// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link GetCloudResourceDataRequest} extends {@link RequestModel}
 *
 * <p>GetCloudResourceDataRequest</p>
 */
public class GetCloudResourceDataRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("from")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("query")
    @com.aliyun.core.annotation.Validation(required = true)
    private String query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("to")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer to;

    private GetCloudResourceDataRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.from = builder.from;
        this.query = builder.query;
        this.to = builder.to;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCloudResourceDataRequest create() {
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
     * @return from
     */
    public Integer getFrom() {
        return this.from;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return to
     */
    public Integer getTo() {
        return this.to;
    }

    public static final class Builder extends Request.Builder<GetCloudResourceDataRequest, Builder> {
        private String regionId; 
        private Integer from; 
        private String query; 
        private Integer to; 

        private Builder() {
            super();
        } 

        private Builder(GetCloudResourceDataRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.from = request.from;
            this.query = request.query;
            this.to = request.to;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1721767203</p>
         */
        public Builder from(Integer from) {
            this.putQueryParameter("from", from);
            this.from = from;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>.entity with(domain=&quot;acs&quot;, type=&quot;acs.k8s.node&quot;) | limit 0, 10</p>
         */
        public Builder query(String query) {
            this.putQueryParameter("query", query);
            this.query = query;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1721767203</p>
         */
        public Builder to(Integer to) {
            this.putQueryParameter("to", to);
            this.to = to;
            return this;
        }

        @Override
        public GetCloudResourceDataRequest build() {
            return new GetCloudResourceDataRequest(this);
        } 

    } 

}
