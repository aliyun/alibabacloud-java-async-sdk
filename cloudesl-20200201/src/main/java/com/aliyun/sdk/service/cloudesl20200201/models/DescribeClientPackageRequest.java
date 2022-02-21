// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClientPackageRequest} extends {@link RequestModel}
 *
 * <p>DescribeClientPackageRequest</p>
 */
public class DescribeClientPackageRequest extends Request {
    @Body
    @NameInMap("ClientType")
    private String clientType;

    @Body
    @NameInMap("ExtraParams")
    private String extraParams;

    private DescribeClientPackageRequest(Builder builder) {
        super(builder);
        this.clientType = builder.clientType;
        this.extraParams = builder.extraParams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClientPackageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientType
     */
    public String getClientType() {
        return this.clientType;
    }

    /**
     * @return extraParams
     */
    public String getExtraParams() {
        return this.extraParams;
    }

    public static final class Builder extends Request.Builder<DescribeClientPackageRequest, Builder> {
        private String clientType; 
        private String extraParams; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClientPackageRequest response) {
            super(response);
            this.clientType = response.clientType;
            this.extraParams = response.extraParams;
        } 

        /**
         * ClientType.
         */
        public Builder clientType(String clientType) {
            this.putBodyParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        /**
         * ExtraParams.
         */
        public Builder extraParams(String extraParams) {
            this.putBodyParameter("ExtraParams", extraParams);
            this.extraParams = extraParams;
            return this;
        }

        @Override
        public DescribeClientPackageRequest build() {
            return new DescribeClientPackageRequest(this);
        } 

    } 

}
