// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteScheduleRequest} extends {@link RequestModel}
 *
 * <p>DeleteScheduleRequest</p>
 */
public class DeleteScheduleRequest extends Request {
    @Path
    @NameInMap("Id")
    private String id;

    private DeleteScheduleRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteScheduleRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteScheduleRequest, Builder> {
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(DeleteScheduleRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * 触达计划Id，可通过ListSchedules查询账号下的触达计划列表，获取触达计划Id。
         */
        public Builder id(String id) {
            this.putPathParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DeleteScheduleRequest build() {
            return new DeleteScheduleRequest(this);
        } 

    } 

}
