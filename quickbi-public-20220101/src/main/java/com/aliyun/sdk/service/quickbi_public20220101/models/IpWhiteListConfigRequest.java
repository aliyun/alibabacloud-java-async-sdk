// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link IpWhiteListConfigRequest} extends {@link RequestModel}
 *
 * <p>IpWhiteListConfigRequest</p>
 */
public class IpWhiteListConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpWhiteList")
    private String ipWhiteList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Operation")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operation;

    private IpWhiteListConfigRequest(Builder builder) {
        super(builder);
        this.ipWhiteList = builder.ipWhiteList;
        this.operation = builder.operation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IpWhiteListConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipWhiteList
     */
    public String getIpWhiteList() {
        return this.ipWhiteList;
    }

    /**
     * @return operation
     */
    public String getOperation() {
        return this.operation;
    }

    public static final class Builder extends Request.Builder<IpWhiteListConfigRequest, Builder> {
        private String ipWhiteList; 
        private String operation; 

        private Builder() {
            super();
        } 

        private Builder(IpWhiteListConfigRequest request) {
            super(request);
            this.ipWhiteList = request.ipWhiteList;
            this.operation = request.operation;
        } 

        /**
         * IpWhiteList.
         */
        public Builder ipWhiteList(String ipWhiteList) {
            this.putQueryParameter("IpWhiteList", ipWhiteList);
            this.ipWhiteList = ipWhiteList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder operation(String operation) {
            this.putQueryParameter("Operation", operation);
            this.operation = operation;
            return this;
        }

        @Override
        public IpWhiteListConfigRequest build() {
            return new IpWhiteListConfigRequest(this);
        } 

    } 

}
