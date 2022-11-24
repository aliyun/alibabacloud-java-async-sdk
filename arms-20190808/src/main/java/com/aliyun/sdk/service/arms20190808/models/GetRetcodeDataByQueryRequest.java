// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRetcodeDataByQueryRequest} extends {@link RequestModel}
 *
 * <p>GetRetcodeDataByQueryRequest</p>
 */
public class GetRetcodeDataByQueryRequest extends Request {
    @Query
    @NameInMap("From")
    @Validation(required = true)
    private Long from;

    @Query
    @NameInMap("Pid")
    @Validation(required = true)
    private String pid;

    @Query
    @NameInMap("Query")
    @Validation(required = true)
    private String query;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("To")
    @Validation(required = true)
    private Long to;

    private GetRetcodeDataByQueryRequest(Builder builder) {
        super(builder);
        this.from = builder.from;
        this.pid = builder.pid;
        this.query = builder.query;
        this.regionId = builder.regionId;
        this.to = builder.to;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRetcodeDataByQueryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return from
     */
    public Long getFrom() {
        return this.from;
    }

    /**
     * @return pid
     */
    public String getPid() {
        return this.pid;
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
    public Long getTo() {
        return this.to;
    }

    public static final class Builder extends Request.Builder<GetRetcodeDataByQueryRequest, Builder> {
        private Long from; 
        private String pid; 
        private String query; 
        private String regionId; 
        private Long to; 

        private Builder() {
            super();
        } 

        private Builder(GetRetcodeDataByQueryRequest request) {
            super(request);
            this.from = request.from;
            this.pid = request.pid;
            this.query = request.query;
            this.regionId = request.regionId;
            this.to = request.to;
        } 

        /**
         * From.
         */
        public Builder from(Long from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * Pid.
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * Query.
         */
        public Builder query(String query) {
            this.putQueryParameter("Query", query);
            this.query = query;
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
         * To.
         */
        public Builder to(Long to) {
            this.putQueryParameter("To", to);
            this.to = to;
            return this;
        }

        @Override
        public GetRetcodeDataByQueryRequest build() {
            return new GetRetcodeDataByQueryRequest(this);
        } 

    } 

}
