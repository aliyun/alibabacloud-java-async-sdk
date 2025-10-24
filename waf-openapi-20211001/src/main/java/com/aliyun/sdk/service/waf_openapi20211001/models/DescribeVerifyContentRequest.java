// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeVerifyContentRequest} extends {@link RequestModel}
 *
 * <p>DescribeVerifyContentRequest</p>
 */
public class DescribeVerifyContentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessOrigin")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessOrigin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private DescribeVerifyContentRequest(Builder builder) {
        super(builder);
        this.accessOrigin = builder.accessOrigin;
        this.domainName = builder.domainName;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVerifyContentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessOrigin
     */
    public String getAccessOrigin() {
        return this.accessOrigin;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<DescribeVerifyContentRequest, Builder> {
        private String accessOrigin; 
        private String domainName; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVerifyContentRequest request) {
            super(request);
            this.accessOrigin = request.accessOrigin;
            this.domainName = request.domainName;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>share</p>
         */
        public Builder accessOrigin(String accessOrigin) {
            this.putQueryParameter("AccessOrigin", accessOrigin);
            this.accessOrigin = accessOrigin;
            return this;
        }

        /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_v2_public_cn-***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public DescribeVerifyContentRequest build() {
            return new DescribeVerifyContentRequest(this);
        } 

    } 

}
