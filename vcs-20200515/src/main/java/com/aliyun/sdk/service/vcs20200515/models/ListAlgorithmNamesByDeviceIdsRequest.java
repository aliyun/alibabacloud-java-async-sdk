// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAlgorithmNamesByDeviceIdsRequest} extends {@link RequestModel}
 *
 * <p>ListAlgorithmNamesByDeviceIdsRequest</p>
 */
public class ListAlgorithmNamesByDeviceIdsRequest extends Request {
    @Query
    @NameInMap("GbIds")
    @Validation(required = true)
    private String gbIds;

    private ListAlgorithmNamesByDeviceIdsRequest(Builder builder) {
        super(builder);
        this.gbIds = builder.gbIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlgorithmNamesByDeviceIdsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gbIds
     */
    public String getGbIds() {
        return this.gbIds;
    }

    public static final class Builder extends Request.Builder<ListAlgorithmNamesByDeviceIdsRequest, Builder> {
        private String gbIds; 

        private Builder() {
            super();
        } 

        private Builder(ListAlgorithmNamesByDeviceIdsRequest response) {
            super(response);
            this.gbIds = response.gbIds;
        } 

        /**
         * 设备ID集合，多个的话以逗号分隔，最大支持200个
         */
        public Builder gbIds(String gbIds) {
            this.putQueryParameter("GbIds", gbIds);
            this.gbIds = gbIds;
            return this;
        }

        @Override
        public ListAlgorithmNamesByDeviceIdsRequest build() {
            return new ListAlgorithmNamesByDeviceIdsRequest(this);
        } 

    } 

}
