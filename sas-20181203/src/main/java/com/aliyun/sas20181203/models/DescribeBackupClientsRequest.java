// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeBackupClientsRequest} extends {@link RequestModel}
 *
 * <p>DescribeBackupClientsRequest</p>
 */
public class DescribeBackupClientsRequest extends Request {
    @Query
    @NameInMap("SupportRegionId")
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

    /**
     * @return supportRegionId
     */
    public String getSupportRegionId() {
        return this.supportRegionId;
    }

    public static final class Builder extends Request.Builder {
        private String supportRegionId; 

        /**
         * <p>SupportRegionId.</p>
         */
        public Builder supportRegionId(String supportRegionId) {
            this.putQueryParameter("SupportRegionId", supportRegionId);
            this.supportRegionId = supportRegionId;
            return this;
        }

        public DescribeBackupClientsRequest build() {
            return new DescribeBackupClientsRequest(this);
        } 

    } 

}
