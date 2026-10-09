// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link DescribeSupabaseBackupPolicyRequest} extends {@link RequestModel}
 *
 * <p>DescribeSupabaseBackupPolicyRequest</p>
 */
public class DescribeSupabaseBackupPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DescribeSupabaseBackupPolicyRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSupabaseBackupPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeSupabaseBackupPolicyRequest, Builder> {
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSupabaseBackupPolicyRequest request) {
            super(request);
            this.projectId = request.projectId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>Instance ID of the Supabase instance. You can obtain instance ID from the Supabase page in the console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sbp-263****</p>
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> operation to query available region IDs.</p>
         * </blockquote>
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
        public DescribeSupabaseBackupPolicyRequest build() {
            return new DescribeSupabaseBackupPolicyRequest(this);
        } 

    } 

}
