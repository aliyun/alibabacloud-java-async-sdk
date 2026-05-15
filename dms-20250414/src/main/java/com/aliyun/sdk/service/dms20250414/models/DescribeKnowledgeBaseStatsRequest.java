// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link DescribeKnowledgeBaseStatsRequest} extends {@link RequestModel}
 *
 * <p>DescribeKnowledgeBaseStatsRequest</p>
 */
public class DescribeKnowledgeBaseStatsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KbUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String kbUuid;

    private DescribeKnowledgeBaseStatsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.kbUuid = builder.kbUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKnowledgeBaseStatsRequest create() {
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
     * @return kbUuid
     */
    public String getKbUuid() {
        return this.kbUuid;
    }

    public static final class Builder extends Request.Builder<DescribeKnowledgeBaseStatsRequest, Builder> {
        private String regionId; 
        private String kbUuid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeKnowledgeBaseStatsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.kbUuid = request.kbUuid;
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
         * <p>kb-***</p>
         */
        public Builder kbUuid(String kbUuid) {
            this.putQueryParameter("KbUuid", kbUuid);
            this.kbUuid = kbUuid;
            return this;
        }

        @Override
        public DescribeKnowledgeBaseStatsRequest build() {
            return new DescribeKnowledgeBaseStatsRequest(this);
        } 

    } 

}
