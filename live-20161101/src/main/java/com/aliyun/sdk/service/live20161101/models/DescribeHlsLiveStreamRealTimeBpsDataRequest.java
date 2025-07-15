// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeHlsLiveStreamRealTimeBpsDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeHlsLiveStreamRealTimeBpsDataRequest</p>
 */
public class DescribeHlsLiveStreamRealTimeBpsDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Time")
    @com.aliyun.core.annotation.Validation(required = true)
    private String time;

    private DescribeHlsLiveStreamRealTimeBpsDataRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.time = builder.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHlsLiveStreamRealTimeBpsDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return time
     */
    public String getTime() {
        return this.time;
    }

    public static final class Builder extends Request.Builder<DescribeHlsLiveStreamRealTimeBpsDataRequest, Builder> {
        private String domainName; 
        private Long ownerId; 
        private String regionId; 
        private String time; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHlsLiveStreamRealTimeBpsDataRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.time = request.time;
        } 

        /**
         * <p>The domain names to query. Separate them with commas (,). A domain name cannot contain double-byte characters.</p>
         * 
         * <strong>example:</strong>
         * <p>live.aiyun.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The timestamp.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-08-08T00:00:00Z</p>
         */
        public Builder time(String time) {
            this.putQueryParameter("Time", time);
            this.time = time;
            return this;
        }

        @Override
        public DescribeHlsLiveStreamRealTimeBpsDataRequest build() {
            return new DescribeHlsLiveStreamRealTimeBpsDataRequest(this);
        } 

    } 

}
