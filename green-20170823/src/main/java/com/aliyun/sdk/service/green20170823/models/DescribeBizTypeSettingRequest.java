// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBizTypeSettingRequest} extends {@link RequestModel}
 *
 * <p>DescribeBizTypeSettingRequest</p>
 */
public class DescribeBizTypeSettingRequest extends Request {
    @Query
    @NameInMap("BizTypeName")
    @Validation(required = true)
    private String bizTypeName;

    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    private DescribeBizTypeSettingRequest(Builder builder) {
        super(builder);
        this.bizTypeName = builder.bizTypeName;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBizTypeSettingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizTypeName
     */
    public String getBizTypeName() {
        return this.bizTypeName;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<DescribeBizTypeSettingRequest, Builder> {
        private String bizTypeName; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBizTypeSettingRequest request) {
            super(request);
            this.bizTypeName = request.bizTypeName;
            this.resourceType = request.resourceType;
        } 

        /**
         * BizTypeName.
         */
        public Builder bizTypeName(String bizTypeName) {
            this.putQueryParameter("BizTypeName", bizTypeName);
            this.bizTypeName = bizTypeName;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public DescribeBizTypeSettingRequest build() {
            return new DescribeBizTypeSettingRequest(this);
        } 

    } 

}
