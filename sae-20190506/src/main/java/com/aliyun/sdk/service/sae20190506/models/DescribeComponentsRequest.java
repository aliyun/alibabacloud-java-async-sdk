// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeComponentsRequest} extends {@link RequestModel}
 *
 * <p>DescribeComponentsRequest</p>
 */
public class DescribeComponentsRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private DescribeComponentsRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeComponentsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeComponentsRequest, Builder> {
        private String appId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeComponentsRequest response) {
            super(response);
            this.appId = response.appId;
            this.type = response.type;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeComponentsRequest build() {
            return new DescribeComponentsRequest(this);
        } 

    } 

}
