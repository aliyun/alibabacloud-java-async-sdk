// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link DsgUpdateDesensStatusListRequest} extends {@link RequestModel}
 *
 * <p>DsgUpdateDesensStatusListRequest</p>
 */
public class DsgUpdateDesensStatusListRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesensStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer desensStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ids")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Integer> ids;

    private DsgUpdateDesensStatusListRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.desensStatus = builder.desensStatus;
        this.ids = builder.ids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DsgUpdateDesensStatusListRequest create() {
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
     * @return desensStatus
     */
    public Integer getDesensStatus() {
        return this.desensStatus;
    }

    /**
     * @return ids
     */
    public java.util.List<Integer> getIds() {
        return this.ids;
    }

    public static final class Builder extends Request.Builder<DsgUpdateDesensStatusListRequest, Builder> {
        private String regionId; 
        private Integer desensStatus; 
        private java.util.List<Integer> ids; 

        private Builder() {
            super();
        } 

        private Builder(DsgUpdateDesensStatusListRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.desensStatus = request.desensStatus;
            this.ids = request.ids;
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
         * <p>1</p>
         */
        public Builder desensStatus(Integer desensStatus) {
            this.putQueryParameter("DesensStatus", desensStatus);
            this.desensStatus = desensStatus;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder ids(java.util.List<Integer> ids) {
            String idsShrink = shrink(ids, "Ids", "json");
            this.putQueryParameter("Ids", idsShrink);
            this.ids = ids;
            return this;
        }

        @Override
        public DsgUpdateDesensStatusListRequest build() {
            return new DsgUpdateDesensStatusListRequest(this);
        } 

    } 

}
