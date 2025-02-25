// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link StartApsJobRequest} extends {@link RequestModel}
 *
 * <p>StartApsJobRequest</p>
 */
public class StartApsJobRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApsJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apsJobId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private StartApsJobRequest(Builder builder) {
        super(builder);
        this.apsJobId = builder.apsJobId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartApsJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apsJobId
     */
    public String getApsJobId() {
        return this.apsJobId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<StartApsJobRequest, Builder> {
        private String apsJobId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(StartApsJobRequest request) {
            super(request);
            this.apsJobId = request.apsJobId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aps-******</p>
         */
        public Builder apsJobId(String apsJobId) {
            this.putBodyParameter("ApsJobId", apsJobId);
            this.apsJobId = apsJobId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public StartApsJobRequest build() {
            return new StartApsJobRequest(this);
        } 

    } 

}
