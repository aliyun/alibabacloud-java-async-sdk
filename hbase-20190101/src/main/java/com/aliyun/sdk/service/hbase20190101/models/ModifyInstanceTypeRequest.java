// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

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
 * {@link ModifyInstanceTypeRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceTypeRequest</p>
 */
public class ModifyInstanceTypeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoreInstanceType")
    private String coreInstanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterInstanceType")
    private String masterInstanceType;

    private ModifyInstanceTypeRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.coreInstanceType = builder.coreInstanceType;
        this.masterInstanceType = builder.masterInstanceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceTypeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return coreInstanceType
     */
    public String getCoreInstanceType() {
        return this.coreInstanceType;
    }

    /**
     * @return masterInstanceType
     */
    public String getMasterInstanceType() {
        return this.masterInstanceType;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceTypeRequest, Builder> {
        private String clusterId; 
        private String coreInstanceType; 
        private String masterInstanceType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceTypeRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.coreInstanceType = request.coreInstanceType;
            this.masterInstanceType = request.masterInstanceType;
        } 

        /**
         * <p>The ID of target instance. You can call <a href="https://help.aliyun.com/document_detail/144595.html">DescribeInstances</a> to obtain target instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hb-bp1x940uh********</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The new node specifications of the core node. You can invoke <a href="https://help.aliyun.com/document_detail/145796.html">DescribeInstanceType</a> to obtain the available node specifications.</p>
         * <blockquote>
         * <p>You must specify either the MasterInstanceType parameter or the CoreInstanceType parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hbase.sn1.8xlarge</p>
         */
        public Builder coreInstanceType(String coreInstanceType) {
            this.putQueryParameter("CoreInstanceType", coreInstanceType);
            this.coreInstanceType = coreInstanceType;
            return this;
        }

        /**
         * <p>The new node specifications of the master node. You can invoke <a href="https://help.aliyun.com/document_detail/145796.html">DescribeInstanceType</a> to obtain the available node specifications.</p>
         * <blockquote>
         * <p>You must specify either the MasterInstanceType parameter or the CoreInstanceType parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hbase.sn1.large</p>
         */
        public Builder masterInstanceType(String masterInstanceType) {
            this.putQueryParameter("MasterInstanceType", masterInstanceType);
            this.masterInstanceType = masterInstanceType;
            return this;
        }

        @Override
        public ModifyInstanceTypeRequest build() {
            return new ModifyInstanceTypeRequest(this);
        } 

    } 

}
