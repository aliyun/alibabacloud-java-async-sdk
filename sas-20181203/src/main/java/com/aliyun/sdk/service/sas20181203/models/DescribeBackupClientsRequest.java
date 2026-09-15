// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeBackupClientsRequest} extends {@link RequestModel}
 *
 * <p>DescribeBackupClientsRequest</p>
 */
public class DescribeBackupClientsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupportRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String supportRegionId;

    private DescribeBackupClientsRequest(Builder builder) {
        super(builder);
        this.supportRegionId = builder.supportRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupClientsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return supportRegionId
     */
    public String getSupportRegionId() {
        return this.supportRegionId;
    }

    public static final class Builder extends Request.Builder<DescribeBackupClientsRequest, Builder> {
        private String supportRegionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBackupClientsRequest request) {
            super(request);
            this.supportRegionId = request.supportRegionId;
        } 

        /**
         * <p>The region supported by the anti-ransomware feature. You can call <a href="~~DescribeSupportRegion~~">DescribeSupportRegion</a> to query the regions supported by the anti-ransomware feature.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder supportRegionId(String supportRegionId) {
            this.putQueryParameter("SupportRegionId", supportRegionId);
            this.supportRegionId = supportRegionId;
            return this;
        }

        @Override
        public DescribeBackupClientsRequest build() {
            return new DescribeBackupClientsRequest(this);
        } 

    } 

}
