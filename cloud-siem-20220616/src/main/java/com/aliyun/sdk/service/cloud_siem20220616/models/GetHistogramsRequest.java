// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHistogramsRequest} extends {@link RequestModel}
 *
 * <p>GetHistogramsRequest</p>
 */
public class GetHistogramsRequest extends Request {
    @Body
    @NameInMap("From")
    @Validation(required = true)
    private Integer from;

    @Body
    @NameInMap("Query")
    private String query;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("To")
    @Validation(required = true)
    private Integer to;

    private GetHistogramsRequest(Builder builder) {
        super(builder);
        this.from = builder.from;
        this.query = builder.query;
        this.regionId = builder.regionId;
        this.to = builder.to;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHistogramsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return to
     */
    public Integer getTo() {
        return this.to;
    }

    public static final class Builder extends Request.Builder<GetHistogramsRequest, Builder> {
        private Integer from; 
        private String query; 
        private String regionId; 
        private Integer to; 

        private Builder() {
            super();
        } 

        private Builder(GetHistogramsRequest request) {
            super(request);
            this.from = request.from;
            this.query = request.query;
            this.regionId = request.regionId;
            this.to = request.to;
        } 

        /**
         * The start time of the subinterval. The value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC. The time range that is specified in this operation is a left-closed, right-open interval. The interval includes the start time specified by the from parameter, but does not include the end time specified by the to parameter. If you specify the same value for the from and to parameters, the interval is invalid, and an error message is returned.
         */
        public Builder from(Integer from) {
            this.putBodyParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * The SQL statement. Only search statements are supported. Analytic statements are not supported. For more information about the syntax and limits of search statements, see [Log search overview](https://help.aliyun.com/zh/sls/user-guide/search-syntax?spm=a2c4g.11186623.0.i2#concept-tnd-1jq-zdb).
         */
        public Builder query(String query) {
            this.putBodyParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the region where your assets reside. Valid values:
         * <p>
         * 
         * *   cn-hangzhou: Your assets reside in regions inside the Chinese mainland or in the China (Hong Kong) region.
         * *   ap-southeast-1: Your assets reside in regions outside the Chinese mainland, excluding the China (Hong Kong) region.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The end time of the subinterval. The value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC. The time range that is specified in this operation is a left-closed, right-open interval. The interval includes the start time specified by the from parameter, but does not include the end time specified by the to parameter. If you specify the same value for the from and to parameters, the interval is invalid, and an error message is returned.
         */
        public Builder to(Integer to) {
            this.putBodyParameter("To", to);
            this.to = to;
            return this;
        }

        @Override
        public GetHistogramsRequest build() {
            return new GetHistogramsRequest(this);
        } 

    } 

}
