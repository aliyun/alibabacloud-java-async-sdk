// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcIcBasicRequest} extends {@link RequestModel}
 *
 * <p>GetOcIcBasicRequest</p>
 */
public class GetOcIcBasicRequest extends Request {
    @Body
    @NameInMap("SearchKey")
    @Validation(required = true)
    private String searchKey;

    private GetOcIcBasicRequest(Builder builder) {
        super(builder);
        this.searchKey = builder.searchKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOcIcBasicRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return searchKey
     */
    public String getSearchKey() {
        return this.searchKey;
    }

    public static final class Builder extends Request.Builder<GetOcIcBasicRequest, Builder> {
        private String searchKey; 

        private Builder() {
            super();
        } 

        private Builder(GetOcIcBasicRequest request) {
            super(request);
            this.searchKey = request.searchKey;
        } 

        /**
         * 查询参数：企业名称/注册号/统一社会信用编码
         */
        public Builder searchKey(String searchKey) {
            this.putBodyParameter("SearchKey", searchKey);
            this.searchKey = searchKey;
            return this;
        }

        @Override
        public GetOcIcBasicRequest build() {
            return new GetOcIcBasicRequest(this);
        } 

    } 

}
