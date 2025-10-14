// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link DescribeSqlFlashbackTaskListRequest} extends {@link RequestModel}
 *
 * <p>DescribeSqlFlashbackTaskListRequest</p>
 */
public class DescribeSqlFlashbackTaskListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolardbxInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String polardbxInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DescribeSqlFlashbackTaskListRequest(Builder builder) {
        super(builder);
        this.polardbxInstanceId = builder.polardbxInstanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSqlFlashbackTaskListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return polardbxInstanceId
     */
    public String getPolardbxInstanceId() {
        return this.polardbxInstanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeSqlFlashbackTaskListRequest, Builder> {
        private String polardbxInstanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSqlFlashbackTaskListRequest request) {
            super(request);
            this.polardbxInstanceId = request.polardbxInstanceId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-**********</p>
         */
        public Builder polardbxInstanceId(String polardbxInstanceId) {
            this.putQueryParameter("PolardbxInstanceId", polardbxInstanceId);
            this.polardbxInstanceId = polardbxInstanceId;
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
        public DescribeSqlFlashbackTaskListRequest build() {
            return new DescribeSqlFlashbackTaskListRequest(this);
        } 

    } 

}
