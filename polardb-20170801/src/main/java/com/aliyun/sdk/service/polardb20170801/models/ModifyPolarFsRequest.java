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
 * {@link ModifyPolarFsRequest} extends {@link RequestModel}
 *
 * <p>ModifyPolarFsRequest</p>
 */
public class ModifyPolarFsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomOssAk")
    private String customOssAk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomOssSk")
    private String customOssSk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolarFsInstanceId")
    private String polarFsInstanceId;

    private ModifyPolarFsRequest(Builder builder) {
        super(builder);
        this.customOssAk = builder.customOssAk;
        this.customOssSk = builder.customOssSk;
        this.DBClusterId = builder.DBClusterId;
        this.polarFsInstanceId = builder.polarFsInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPolarFsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customOssAk
     */
    public String getCustomOssAk() {
        return this.customOssAk;
    }

    /**
     * @return customOssSk
     */
    public String getCustomOssSk() {
        return this.customOssSk;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return polarFsInstanceId
     */
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    public static final class Builder extends Request.Builder<ModifyPolarFsRequest, Builder> {
        private String customOssAk; 
        private String customOssSk; 
        private String DBClusterId; 
        private String polarFsInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPolarFsRequest request) {
            super(request);
            this.customOssAk = request.customOssAk;
            this.customOssSk = request.customOssSk;
            this.DBClusterId = request.DBClusterId;
            this.polarFsInstanceId = request.polarFsInstanceId;
        } 

        /**
         * <p>The custom OSS AccessKey ID. You must specify this parameter together with CustomOssSk when you call the ModifyPolarFs operation. Otherwise, the InvalidCustomIdentityInfo.Malformed (400) error is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>LTAI5tExample1234</p>
         */
        public Builder customOssAk(String customOssAk) {
            this.putQueryParameter("CustomOssAk", customOssAk);
            this.customOssAk = customOssAk;
            return this;
        }

        /**
         * <p>The custom OSS AccessKey Secret. You must specify this parameter together with CustomOssAk when you call the ModifyPolarFs operation. Otherwise, the InvalidCustomIdentityInfo.Malformed (400) error is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>example-oss-secret</p>
         */
        public Builder customOssSk(String customOssSk) {
            this.putQueryParameter("CustomOssSk", customOssSk);
            this.customOssSk = customOssSk;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query information about all clusters in the specified region, including cluster IDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pc-**************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The PolarFs instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pfs-2ze0i74ka607*****</p>
         */
        public Builder polarFsInstanceId(String polarFsInstanceId) {
            this.putQueryParameter("PolarFsInstanceId", polarFsInstanceId);
            this.polarFsInstanceId = polarFsInstanceId;
            return this;
        }

        @Override
        public ModifyPolarFsRequest build() {
            return new ModifyPolarFsRequest(this);
        } 

    } 

}
