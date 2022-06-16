// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindGroupRequest} extends {@link RequestModel}
 *
 * <p>BindGroupRequest</p>
 */
public class BindGroupRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private Long appId;

    @Query
    @NameInMap("BizCode")
    @Validation(required = true)
    private String bizCode;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    private BindGroupRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.bizCode = builder.bizCode;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public Long getAppId() {
        return this.appId;
    }

    /**
     * @return bizCode
     */
    public String getBizCode() {
        return this.bizCode;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<BindGroupRequest, Builder> {
        private Long appId; 
        private String bizCode; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(BindGroupRequest request) {
            super(request);
            this.appId = request.appId;
            this.bizCode = request.bizCode;
            this.name = request.name;
        } 

        /**
         * AppId.
         */
        public Builder appId(Long appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * BizCode.
         */
        public Builder bizCode(String bizCode) {
            this.putQueryParameter("BizCode", bizCode);
            this.bizCode = bizCode;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public BindGroupRequest build() {
            return new BindGroupRequest(this);
        } 

    } 

}
