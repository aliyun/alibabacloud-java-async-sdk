// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link StartWuyingServerRequest} extends {@link RequestModel}
 *
 * <p>StartWuyingServerRequest</p>
 */
public class StartWuyingServerRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WuyingServerIdList")
    private java.util.List<String> wuyingServerIdList;

    private StartWuyingServerRequest(Builder builder) {
        super(builder);
        this.wuyingServerIdList = builder.wuyingServerIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartWuyingServerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return wuyingServerIdList
     */
    public java.util.List<String> getWuyingServerIdList() {
        return this.wuyingServerIdList;
    }

    public static final class Builder extends Request.Builder<StartWuyingServerRequest, Builder> {
        private java.util.List<String> wuyingServerIdList; 

        private Builder() {
            super();
        } 

        private Builder(StartWuyingServerRequest request) {
            super(request);
            this.wuyingServerIdList = request.wuyingServerIdList;
        } 

        /**
         * <p>The list of workstation IDs.</p>
         */
        public Builder wuyingServerIdList(java.util.List<String> wuyingServerIdList) {
            this.putBodyParameter("WuyingServerIdList", wuyingServerIdList);
            this.wuyingServerIdList = wuyingServerIdList;
            return this;
        }

        @Override
        public StartWuyingServerRequest build() {
            return new StartWuyingServerRequest(this);
        } 

    } 

}
