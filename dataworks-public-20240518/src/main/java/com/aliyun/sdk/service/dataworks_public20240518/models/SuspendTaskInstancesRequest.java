// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SuspendTaskInstancesRequest} extends {@link RequestModel}
 *
 * <p>SuspendTaskInstancesRequest</p>
 */
public class SuspendTaskInstancesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Ids")
    private java.util.List < Long > ids;

    private SuspendTaskInstancesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.comment = builder.comment;
        this.ids = builder.ids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SuspendTaskInstancesRequest create() {
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
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return ids
     */
    public java.util.List < Long > getIds() {
        return this.ids;
    }

    public static final class Builder extends Request.Builder<SuspendTaskInstancesRequest, Builder> {
        private String regionId; 
        private String comment; 
        private java.util.List < Long > ids; 

        private Builder() {
            super();
        } 

        private Builder(SuspendTaskInstancesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.comment = request.comment;
            this.ids = request.ids;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.putBodyParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * Ids.
         */
        public Builder ids(java.util.List < Long > ids) {
            String idsShrink = shrink(ids, "Ids", "json");
            this.putBodyParameter("Ids", idsShrink);
            this.ids = ids;
            return this;
        }

        @Override
        public SuspendTaskInstancesRequest build() {
            return new SuspendTaskInstancesRequest(this);
        } 

    } 

}
