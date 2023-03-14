// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHealthCheckListRequest} extends {@link RequestModel}
 *
 * <p>DescribeHealthCheckListRequest</p>
 */
public class DescribeHealthCheckListRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Listeners")
    @Validation(required = true)
    private String listeners;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private DescribeHealthCheckListRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.listeners = builder.listeners;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHealthCheckListRequest create() {
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
     * @return listeners
     */
    public String getListeners() {
        return this.listeners;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DescribeHealthCheckListRequest, Builder> {
        private String regionId; 
        private String listeners; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHealthCheckListRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.listeners = request.listeners;
            this.sourceIp = request.sourceIp;
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
         * Listeners.
         */
        public Builder listeners(String listeners) {
            this.putQueryParameter("Listeners", listeners);
            this.listeners = listeners;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DescribeHealthCheckListRequest build() {
            return new DescribeHealthCheckListRequest(this);
        } 

    } 

}
