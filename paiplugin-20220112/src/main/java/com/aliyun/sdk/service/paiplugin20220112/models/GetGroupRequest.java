// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetGroupRequest} extends {@link RequestModel}
 *
 * <p>GetGroupRequest</p>
 */
public class GetGroupRequest extends Request {
    @Path
    @NameInMap("Id")
    private String id;

    private GetGroupRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<GetGroupRequest, Builder> {
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(GetGroupRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * 人群Id，可通过ListGroups查询账号下的人群列表，获取人群Id。
         */
        public Builder id(String id) {
            this.putPathParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public GetGroupRequest build() {
            return new GetGroupRequest(this);
        } 

    } 

}
