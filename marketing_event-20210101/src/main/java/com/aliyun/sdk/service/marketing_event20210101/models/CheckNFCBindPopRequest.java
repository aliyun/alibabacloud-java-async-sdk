// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketing_event20210101.models;

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
 * {@link CheckNFCBindPopRequest} extends {@link RequestModel}
 *
 * <p>CheckNFCBindPopRequest</p>
 */
public class CheckNFCBindPopRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActivityId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long activityId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NfcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nfcId;

    private CheckNFCBindPopRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.activityId = builder.activityId;
        this.nfcId = builder.nfcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckNFCBindPopRequest create() {
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
     * @return activityId
     */
    public Long getActivityId() {
        return this.activityId;
    }

    /**
     * @return nfcId
     */
    public String getNfcId() {
        return this.nfcId;
    }

    public static final class Builder extends Request.Builder<CheckNFCBindPopRequest, Builder> {
        private String regionId; 
        private Long activityId; 
        private String nfcId; 

        private Builder() {
            super();
        } 

        private Builder(CheckNFCBindPopRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.activityId = request.activityId;
            this.nfcId = request.nfcId;
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
         * <p>4546</p>
         */
        public Builder activityId(Long activityId) {
            this.putQueryParameter("ActivityId", activityId);
            this.activityId = activityId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>asdojzopf</p>
         */
        public Builder nfcId(String nfcId) {
            this.putQueryParameter("NfcId", nfcId);
            this.nfcId = nfcId;
            return this;
        }

        @Override
        public CheckNFCBindPopRequest build() {
            return new CheckNFCBindPopRequest(this);
        } 

    } 

}
