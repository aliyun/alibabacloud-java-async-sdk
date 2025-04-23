// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DescribeGtmInstanceRequest} extends {@link RequestModel}
 *
 * <p>DescribeGtmInstanceRequest</p>
 */
public class DescribeGtmInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedDetailAttributes")
    private Boolean needDetailAttributes;

    private DescribeGtmInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.needDetailAttributes = builder.needDetailAttributes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGtmInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return needDetailAttributes
     */
    public Boolean getNeedDetailAttributes() {
        return this.needDetailAttributes;
    }

    public static final class Builder extends Request.Builder<DescribeGtmInstanceRequest, Builder> {
        private String instanceId; 
        private String lang; 
        private Boolean needDetailAttributes; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGtmInstanceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.needDetailAttributes = request.needDetailAttributes;
        } 

        /**
         * <p>The ID of the GTM instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>instance1</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The language of the values of specific response parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Specifies whether additional information is required. Default value: <strong>false</strong>. If the value is <strong>true</strong>, the AccessStrategyNum and AddressPoolNum parameters are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder needDetailAttributes(Boolean needDetailAttributes) {
            this.putQueryParameter("NeedDetailAttributes", needDetailAttributes);
            this.needDetailAttributes = needDetailAttributes;
            return this;
        }

        @Override
        public DescribeGtmInstanceRequest build() {
            return new DescribeGtmInstanceRequest(this);
        } 

    } 

}
