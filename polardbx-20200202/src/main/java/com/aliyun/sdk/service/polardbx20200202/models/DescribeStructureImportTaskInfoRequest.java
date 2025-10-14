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
 * {@link DescribeStructureImportTaskInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeStructureImportTaskInfoRequest</p>
 */
public class DescribeStructureImportTaskInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlinkTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String slinkTaskId;

    private DescribeStructureImportTaskInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.slinkTaskId = builder.slinkTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStructureImportTaskInfoRequest create() {
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
     * @return slinkTaskId
     */
    public String getSlinkTaskId() {
        return this.slinkTaskId;
    }

    public static final class Builder extends Request.Builder<DescribeStructureImportTaskInfoRequest, Builder> {
        private String regionId; 
        private String slinkTaskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeStructureImportTaskInfoRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.slinkTaskId = request.slinkTaskId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>etx-szr2rr6i*****</p>
         */
        public Builder slinkTaskId(String slinkTaskId) {
            this.putQueryParameter("SlinkTaskId", slinkTaskId);
            this.slinkTaskId = slinkTaskId;
            return this;
        }

        @Override
        public DescribeStructureImportTaskInfoRequest build() {
            return new DescribeStructureImportTaskInfoRequest(this);
        } 

    } 

}
