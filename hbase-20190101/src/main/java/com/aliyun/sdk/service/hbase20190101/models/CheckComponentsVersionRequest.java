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
 * {@link CheckComponentsVersionRequest} extends {@link RequestModel}
 *
 * <p>CheckComponentsVersionRequest</p>
 */
public class CheckComponentsVersionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Components")
    @com.aliyun.core.annotation.Validation(required = true)
    private String components;

    private CheckComponentsVersionRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.components = builder.components;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckComponentsVersionRequest create() {
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
     * @return components
     */
    public String getComponents() {
        return this.components;
    }

    public static final class Builder extends Request.Builder<CheckComponentsVersionRequest, Builder> {
        private String clusterId; 
        private String components; 

        private Builder() {
            super();
        } 

        private Builder(CheckComponentsVersionRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.components = request.components;
        } 

        /**
         * <p>The cluster ID. You can call the <a href="https://help.aliyun.com/document_detail/144595.html">DescribeInstances</a> operation to obtain the cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hb-t4naqsay5gn****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The component to check. Valid values:</p>
         * <ul>
         * <li><strong>HBASE</strong></li>
         * <li><strong>HADOOP</strong></li>
         * <li><strong>PHOENIX</strong></li>
         * <li><strong>SOLR</strong></li>
         * <li><strong>THRIFT</strong>.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HBASE,HADOOP</p>
         */
        public Builder components(String components) {
            this.putQueryParameter("Components", components);
            this.components = components;
            return this;
        }

        @Override
        public CheckComponentsVersionRequest build() {
            return new CheckComponentsVersionRequest(this);
        } 

    } 

}
