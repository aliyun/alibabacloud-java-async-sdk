// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

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
 * {@link DescribeScenesRequest} extends {@link RequestModel}
 *
 * <p>DescribeScenesRequest</p>
 */
public class DescribeScenesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchCode")
    private String searchCode;

    private DescribeScenesRequest(Builder builder) {
        super(builder);
        this.searchCode = builder.searchCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScenesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return searchCode
     */
    public String getSearchCode() {
        return this.searchCode;
    }

    public static final class Builder extends Request.Builder<DescribeScenesRequest, Builder> {
        private String searchCode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeScenesRequest request) {
            super(request);
            this.searchCode = request.searchCode;
        } 

        /**
         * SearchCode.
         */
        public Builder searchCode(String searchCode) {
            this.putQueryParameter("SearchCode", searchCode);
            this.searchCode = searchCode;
            return this;
        }

        @Override
        public DescribeScenesRequest build() {
            return new DescribeScenesRequest(this);
        } 

    } 

}
