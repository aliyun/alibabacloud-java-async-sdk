// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeAssetsScaProcessNumRequest} extends {@link RequestModel}
 *
 * <p>DescribeAssetsScaProcessNumRequest</p>
 */
public class DescribeAssetsScaProcessNumRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UuidList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> uuidList;

    private DescribeAssetsScaProcessNumRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.uuidList = builder.uuidList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAssetsScaProcessNumRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return uuidList
     */
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

    public static final class Builder extends Request.Builder<DescribeAssetsScaProcessNumRequest, Builder> {
        private String bizType; 
        private java.util.List<String> uuidList; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAssetsScaProcessNumRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.uuidList = request.uuidList;
        } 

        /**
         * <p>The type of the application process. Default value: java. Valid values:</p>
         * <ul>
         * <li><strong>java</strong></li>
         * <li><strong>php</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>java</p>
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>The UUIDs of the servers.</p>
         * <p>This parameter is required.</p>
         */
        public Builder uuidList(java.util.List<String> uuidList) {
            this.putQueryParameter("UuidList", uuidList);
            this.uuidList = uuidList;
            return this;
        }

        @Override
        public DescribeAssetsScaProcessNumRequest build() {
            return new DescribeAssetsScaProcessNumRequest(this);
        } 

    } 

}
