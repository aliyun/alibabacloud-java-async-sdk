// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLogSourceRequest} extends {@link RequestModel}
 *
 * <p>DescribeLogSourceRequest</p>
 */
public class DescribeLogSourceRequest extends Request {
    @Body
    @NameInMap("LogType")
    private String logType;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    private DescribeLogSourceRequest(Builder builder) {
        super(builder);
        this.logType = builder.logType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLogSourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logType
     */
    public String getLogType() {
        return this.logType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeLogSourceRequest, Builder> {
        private String logType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLogSourceRequest request) {
            super(request);
            this.logType = request.logType;
            this.regionId = request.regionId;
        } 

        /**
         * LogType.
         */
        public Builder logType(String logType) {
            this.putBodyParameter("LogType", logType);
            this.logType = logType;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeLogSourceRequest build() {
            return new DescribeLogSourceRequest(this);
        } 

    } 

}
