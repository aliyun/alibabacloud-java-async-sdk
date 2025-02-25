// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClassificationsRequest} extends {@link RequestModel}
 *
 * <p>ListClassificationsRequest</p>
 */
public class ListClassificationsRequest extends Request {
    @Query
    @NameInMap("ParentCode")
    private String parentCode;

    private ListClassificationsRequest(Builder builder) {
        super(builder);
        this.parentCode = builder.parentCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClassificationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return parentCode
     */
    public String getParentCode() {
        return this.parentCode;
    }

    public static final class Builder extends Request.Builder<ListClassificationsRequest, Builder> {
        private String parentCode; 

        private Builder() {
            super();
        } 

        private Builder(ListClassificationsRequest request) {
            super(request);
            this.parentCode = request.parentCode;
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
        public ListClassificationsRequest build() {
            return new ListClassificationsRequest(this);
        } 

    } 

}
