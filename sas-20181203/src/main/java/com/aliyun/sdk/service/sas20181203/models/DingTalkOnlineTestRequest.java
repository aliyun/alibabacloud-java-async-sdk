// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DingTalkOnlineTestRequest} extends {@link RequestModel}
 *
 * <p>DingTalkOnlineTestRequest</p>
 */
public class DingTalkOnlineTestRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    private DingTalkOnlineTestRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DingTalkOnlineTestRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<DingTalkOnlineTestRequest, Builder> {
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(DingTalkOnlineTestRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2373</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DingTalkOnlineTestRequest build() {
            return new DingTalkOnlineTestRequest(this);
        } 

    } 

}
