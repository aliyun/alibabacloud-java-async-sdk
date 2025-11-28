// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lto20210707.models;

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
 * {@link DescribeEdgeStatInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeEdgeStatInfoRequest</p>
 */
public class DescribeEdgeStatInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EdgeDn")
    private String edgeDn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EdgePk")
    @com.aliyun.core.annotation.Validation(required = true)
    private String edgePk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DescribeEdgeStatInfoRequest(Builder builder) {
        super(builder);
        this.edgeDn = builder.edgeDn;
        this.edgePk = builder.edgePk;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEdgeStatInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return edgeDn
     */
    public String getEdgeDn() {
        return this.edgeDn;
    }

    /**
     * @return edgePk
     */
    public String getEdgePk() {
        return this.edgePk;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeEdgeStatInfoRequest, Builder> {
        private String edgeDn; 
        private String edgePk; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEdgeStatInfoRequest request) {
            super(request);
            this.edgeDn = request.edgeDn;
            this.edgePk = request.edgePk;
            this.regionId = request.regionId;
        } 

        /**
         * EdgeDn.
         */
        public Builder edgeDn(String edgeDn) {
            this.putQueryParameter("EdgeDn", edgeDn);
            this.edgeDn = edgeDn;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder edgePk(String edgePk) {
            this.putQueryParameter("EdgePk", edgePk);
            this.edgePk = edgePk;
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

        @Override
        public DescribeEdgeStatInfoRequest build() {
            return new DescribeEdgeStatInfoRequest(this);
        } 

    } 

}
