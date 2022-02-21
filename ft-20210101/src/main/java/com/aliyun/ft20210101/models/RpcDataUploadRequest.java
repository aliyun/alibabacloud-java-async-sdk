// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RpcDataUploadRequest} extends {@link RequestModel}
 *
 * <p>RpcDataUploadRequest</p>
 */
public class RpcDataUploadRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("largeParam")
    private String largeParam;

    @Query
    @NameInMap("query1")
    private String query1;

    @Query
    @NameInMap("query2")
    private Long query2;

    private RpcDataUploadRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.largeParam = builder.largeParam;
        this.query1 = builder.query1;
        this.query2 = builder.query2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RpcDataUploadRequest create() {
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
     * @return largeParam
     */
    public String getLargeParam() {
        return this.largeParam;
    }

    /**
     * @return query1
     */
    public String getQuery1() {
        return this.query1;
    }

    /**
     * @return query2
     */
    public Long getQuery2() {
        return this.query2;
    }

    public static final class Builder extends Request.Builder<RpcDataUploadRequest, Builder> {
        private String regionId; 
        private String largeParam; 
        private String query1; 
        private Long query2; 

        private Builder() {
            super();
        } 

        private Builder(RpcDataUploadRequest response) {
            super(response);
            this.regionId = response.regionId;
            this.largeParam = response.largeParam;
            this.query1 = response.query1;
            this.query2 = response.query2;
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
         * largeParam.
         */
        public Builder largeParam(String largeParam) {
            this.putBodyParameter("largeParam", largeParam);
            this.largeParam = largeParam;
            return this;
        }

        /**
         * query1.
         */
        public Builder query1(String query1) {
            this.putQueryParameter("query1", query1);
            this.query1 = query1;
            return this;
        }

        /**
         * query2.
         */
        public Builder query2(Long query2) {
            this.putQueryParameter("query2", query2);
            this.query2 = query2;
            return this;
        }

        @Override
        public RpcDataUploadRequest build() {
            return new RpcDataUploadRequest(this);
        } 

    } 

}
