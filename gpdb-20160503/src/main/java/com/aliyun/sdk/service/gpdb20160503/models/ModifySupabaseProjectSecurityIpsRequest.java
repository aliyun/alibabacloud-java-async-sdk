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
 * {@link ModifySupabaseProjectSecurityIpsRequest} extends {@link RequestModel}
 *
 * <p>ModifySupabaseProjectSecurityIpsRequest</p>
 */
public class ModifySupabaseProjectSecurityIpsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityIPList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String securityIPList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpdateDb")
    private Boolean updateDb;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpdateWeb")
    private Boolean updateWeb;

    private ModifySupabaseProjectSecurityIpsRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.securityIPList = builder.securityIPList;
        this.updateDb = builder.updateDb;
        this.updateWeb = builder.updateWeb;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySupabaseProjectSecurityIpsRequest create() {
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

    /**
     * @return securityIPList
     */
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    /**
     * @return updateDb
     */
    public Boolean getUpdateDb() {
        return this.updateDb;
    }

    /**
     * @return updateWeb
     */
    public Boolean getUpdateWeb() {
        return this.updateWeb;
    }

    public static final class Builder extends Request.Builder<ModifySupabaseProjectSecurityIpsRequest, Builder> {
        private String projectId; 
        private String regionId; 
        private String securityIPList; 
        private Boolean updateDb; 
        private Boolean updateWeb; 

        private Builder() {
            super();
        } 

        private Builder(ModifySupabaseProjectSecurityIpsRequest request) {
            super(request);
            this.projectId = request.projectId;
            this.regionId = request.regionId;
            this.securityIPList = request.securityIPList;
            this.updateDb = request.updateDb;
            this.updateWeb = request.updateWeb;
        } 

        /**
         * <p>The Supabase project ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sbp-407****</p>
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The region ID of the cluster.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> operation to query the most recent region list.</p>
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

        /**
         * <p>A comma-separated list of IP addresses and CIDR blocks to set as the whitelist. You can specify up to 1,000 entries. Supported formats:</p>
         * <ul>
         * <li>Single IP: 10.23.12.24</li>
         * <li>CIDR Block: 10.23.12.0/24 (the prefix<code>/24</code> indicates the length must be between 1 and 32)``</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        public Builder securityIPList(String securityIPList) {
            this.putQueryParameter("SecurityIPList", securityIPList);
            this.securityIPList = securityIPList;
            return this;
        }

        /**
         * UpdateDb.
         */
        public Builder updateDb(Boolean updateDb) {
            this.putQueryParameter("UpdateDb", updateDb);
            this.updateDb = updateDb;
            return this;
        }

        /**
         * UpdateWeb.
         */
        public Builder updateWeb(Boolean updateWeb) {
            this.putQueryParameter("UpdateWeb", updateWeb);
            this.updateWeb = updateWeb;
            return this;
        }

        @Override
        public ModifySupabaseProjectSecurityIpsRequest build() {
            return new ModifySupabaseProjectSecurityIpsRequest(this);
        } 

    } 

}
