// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ModifyLakebaseS3AccountPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyLakebaseS3AccountPolicyRequest</p>
 */
public class ModifyLakebaseS3AccountPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PfsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pfsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserAccAk")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userAccAk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserAccPolicy")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userAccPolicy;

    private ModifyLakebaseS3AccountPolicyRequest(Builder builder) {
        super(builder);
        this.pfsInstanceId = builder.pfsInstanceId;
        this.regionId = builder.regionId;
        this.userAccAk = builder.userAccAk;
        this.userAccPolicy = builder.userAccPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyLakebaseS3AccountPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pfsInstanceId
     */
    public String getPfsInstanceId() {
        return this.pfsInstanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return userAccAk
     */
    public String getUserAccAk() {
        return this.userAccAk;
    }

    /**
     * @return userAccPolicy
     */
    public String getUserAccPolicy() {
        return this.userAccPolicy;
    }

    public static final class Builder extends Request.Builder<ModifyLakebaseS3AccountPolicyRequest, Builder> {
        private String pfsInstanceId; 
        private String regionId; 
        private String userAccAk; 
        private String userAccPolicy; 

        private Builder() {
            super();
        } 

        private Builder(ModifyLakebaseS3AccountPolicyRequest request) {
            super(request);
            this.pfsInstanceId = request.pfsInstanceId;
            this.regionId = request.regionId;
            this.userAccAk = request.userAccAk;
            this.userAccPolicy = request.userAccPolicy;
        } 

        /**
         * <p>The PolarFS instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pfs-xxx</p>
         */
        public Builder pfsInstanceId(String pfsInstanceId) {
            this.putQueryParameter("PfsInstanceId", pfsInstanceId);
            this.pfsInstanceId = pfsInstanceId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query the regions of all clusters under the target account.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The access key of the S3 account whose policy you want to modify.</p>
         * <blockquote>
         * <p>You cannot modify the default account.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>accname</p>
         */
        public Builder userAccAk(String userAccAk) {
            this.putQueryParameter("UserAccAk", userAccAk);
            this.userAccAk = userAccAk;
            return this;
        }

        /**
         * <p>The user account policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Version&quot;:&quot;2012-10-17&quot;,&quot;Statement&quot;:[{&quot;Effect&quot;:&quot;Allow&quot;,&quot;Action&quot;:[&quot;s3:GetObject&quot;,&quot;s3:PutObject&quot;],&quot;Resource&quot;:[&quot;arn:aws:s3:::my-bucket/*&quot;]}]}</p>
         */
        public Builder userAccPolicy(String userAccPolicy) {
            this.putQueryParameter("UserAccPolicy", userAccPolicy);
            this.userAccPolicy = userAccPolicy;
            return this;
        }

        @Override
        public ModifyLakebaseS3AccountPolicyRequest build() {
            return new ModifyLakebaseS3AccountPolicyRequest(this);
        } 

    } 

}
