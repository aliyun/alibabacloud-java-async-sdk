// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAccessPageStateRequest} extends {@link RequestModel}
 *
 * <p>UpdateAccessPageStateRequest</p>
 */
public class UpdateAccessPageStateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessPageId")
    private String accessPageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessPageState")
    private Integer accessPageState;

    private UpdateAccessPageStateRequest(Builder builder) {
        super(builder);
        this.accessPageId = builder.accessPageId;
        this.accessPageState = builder.accessPageState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAccessPageStateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessPageId
     */
    public String getAccessPageId() {
        return this.accessPageId;
    }

    /**
     * @return accessPageState
     */
    public Integer getAccessPageState() {
        return this.accessPageState;
    }

    public static final class Builder extends Request.Builder<UpdateAccessPageStateRequest, Builder> {
        private String accessPageId; 
        private Integer accessPageState; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAccessPageStateRequest request) {
            super(request);
            this.accessPageId = request.accessPageId;
            this.accessPageState = request.accessPageState;
        } 

        /**
         * AccessPageId.
         */
        public Builder accessPageId(String accessPageId) {
            this.putQueryParameter("AccessPageId", accessPageId);
            this.accessPageId = accessPageId;
            return this;
        }

        /**
         * AccessPageState.
         */
        public Builder accessPageState(Integer accessPageState) {
            this.putQueryParameter("AccessPageState", accessPageState);
            this.accessPageState = accessPageState;
            return this;
        }

        @Override
        public UpdateAccessPageStateRequest build() {
            return new UpdateAccessPageStateRequest(this);
        } 

    } 

}
