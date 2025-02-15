// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DetachDbfsRequest} extends {@link RequestModel}
 *
 * <p>DetachDbfsRequest</p>
 */
public class DetachDbfsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ECSInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ECSInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FsId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fsId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DetachDbfsRequest(Builder builder) {
        super(builder);
        this.ECSInstanceId = builder.ECSInstanceId;
        this.fsId = builder.fsId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachDbfsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ECSInstanceId
     */
    public String getECSInstanceId() {
        return this.ECSInstanceId;
    }

    /**
     * @return fsId
     */
    public String getFsId() {
        return this.fsId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DetachDbfsRequest, Builder> {
        private String ECSInstanceId; 
        private String fsId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DetachDbfsRequest request) {
            super(request);
            this.ECSInstanceId = request.ECSInstanceId;
            this.fsId = request.fsId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp67acfmxazb4ph***</p>
         */
        public Builder ECSInstanceId(String ECSInstanceId) {
            this.putQueryParameter("ECSInstanceId", ECSInstanceId);
            this.ECSInstanceId = ECSInstanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d-bp131n0q38u3a4zi*****</p>
         */
        public Builder fsId(String fsId) {
            this.putQueryParameter("FsId", fsId);
            this.fsId = fsId;
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

        @Override
        public DetachDbfsRequest build() {
            return new DetachDbfsRequest(this);
        } 

    } 

}
