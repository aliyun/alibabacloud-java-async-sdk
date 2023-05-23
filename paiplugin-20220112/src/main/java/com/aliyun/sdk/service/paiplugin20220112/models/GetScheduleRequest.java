// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetScheduleRequest} extends {@link RequestModel}
 *
 * <p>GetScheduleRequest</p>
 */
public class GetScheduleRequest extends Request {
    @Path
    @NameInMap("Id")
    private String id;

    private GetScheduleRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScheduleRequest create() {
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

    public static final class Builder extends Request.Builder<GetScheduleRequest, Builder> {
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(GetScheduleRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * 短信触达计划ID，可通过ListSchedules查询账号下的短信触达计划列表，获取短信触达计划ID。
         */
        public Builder id(String id) {
            this.putPathParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public GetScheduleRequest build() {
            return new GetScheduleRequest(this);
        } 

    } 

}
