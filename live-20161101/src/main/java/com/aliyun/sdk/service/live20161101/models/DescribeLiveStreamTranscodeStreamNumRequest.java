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
 * {@link DescribeLiveStreamTranscodeStreamNumRequest} extends {@link RequestModel}
 *
 * <p>DescribeLiveStreamTranscodeStreamNumRequest</p>
 */
public class DescribeLiveStreamTranscodeStreamNumRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SplitType")
    private String splitType;

    private DescribeLiveStreamTranscodeStreamNumRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.splitType = builder.splitType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamTranscodeStreamNumRequest create() {
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
     * @return splitType
     */
    public String getSplitType() {
        return this.splitType;
    }

    public static final class Builder extends Request.Builder<DescribeLiveStreamTranscodeStreamNumRequest, Builder> {
        private String domainName; 
        private Long ownerId; 
        private String regionId; 
        private String splitType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLiveStreamTranscodeStreamNumRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.splitType = request.splitType;
        } 

        /**
         * <p>The streaming domain.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
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
         * <p>The grouping method.</p>
         * <ul>
         * <li>Domain name (default)</li>
         * <li>Template</li>
         * </ul>
         * <p>Valid values:</p>
         * <ul>
         * <li>domain</li>
         * <li>template</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>domain</p>
         */
        public Builder splitType(String splitType) {
            this.putQueryParameter("SplitType", splitType);
            this.splitType = splitType;
            return this;
        }

        @Override
        public DescribeLiveStreamTranscodeStreamNumRequest build() {
            return new DescribeLiveStreamTranscodeStreamNumRequest(this);
        } 

    } 

}
