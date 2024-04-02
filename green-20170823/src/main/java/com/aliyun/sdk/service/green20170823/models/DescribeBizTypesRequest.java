// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBizTypesRequest} extends {@link RequestModel}
 *
 * <p>DescribeBizTypesRequest</p>
 */
public class DescribeBizTypesRequest extends Request {
    @Query
    @NameInMap("ImportFlag")
    private Boolean importFlag;

    private DescribeBizTypesRequest(Builder builder) {
        super(builder);
        this.importFlag = builder.importFlag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBizTypesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return importFlag
     */
    public Boolean getImportFlag() {
        return this.importFlag;
    }

    public static final class Builder extends Request.Builder<DescribeBizTypesRequest, Builder> {
        private Boolean importFlag; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBizTypesRequest request) {
            super(request);
            this.importFlag = request.importFlag;
        } 

        /**
         * ImportFlag.
         */
        public Builder importFlag(Boolean importFlag) {
            this.putQueryParameter("ImportFlag", importFlag);
            this.importFlag = importFlag;
            return this;
        }

        @Override
        public DescribeBizTypesRequest build() {
            return new DescribeBizTypesRequest(this);
        } 

    } 

}
