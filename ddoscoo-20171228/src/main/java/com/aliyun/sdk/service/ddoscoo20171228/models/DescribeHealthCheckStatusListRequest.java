// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHealthCheckStatusListRequest} extends {@link RequestModel}
 *
 * <p>DescribeHealthCheckStatusListRequest</p>
 */
public class DescribeHealthCheckStatusListRequest extends Request {
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

    private DescribeHealthCheckStatusListRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.listeners = builder.listeners;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHealthCheckStatusListRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeHealthCheckStatusListRequest, Builder> {
        private String regionId; 
        private String listeners; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHealthCheckStatusListRequest request) {
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
        public DescribeHealthCheckStatusListRequest build() {
            return new DescribeHealthCheckStatusListRequest(this);
        } 

    } 

}
