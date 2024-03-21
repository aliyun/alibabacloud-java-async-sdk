// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAreasRequest} extends {@link RequestModel}
 *
 * <p>ListAreasRequest</p>
 */
public class ListAreasRequest extends Request {
    @Query
    @NameInMap("BizType")
    @Validation(required = true)
    private String bizType;

    @Query
    @NameInMap("ParentCode")
    private String parentCode;

    private ListAreasRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.parentCode = builder.parentCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAreasRequest create() {
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
     * @return parentCode
     */
    public String getParentCode() {
        return this.parentCode;
    }

    public static final class Builder extends Request.Builder<ListAreasRequest, Builder> {
        private String bizType; 
        private String parentCode; 

        private Builder() {
            super();
        } 

        private Builder(ListAreasRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.parentCode = request.parentCode;
        } 

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * ParentCode.
         */
        public Builder parentCode(String parentCode) {
            this.putQueryParameter("ParentCode", parentCode);
            this.parentCode = parentCode;
            return this;
        }

        @Override
        public ListAreasRequest build() {
            return new ListAreasRequest(this);
        } 

    } 

}
