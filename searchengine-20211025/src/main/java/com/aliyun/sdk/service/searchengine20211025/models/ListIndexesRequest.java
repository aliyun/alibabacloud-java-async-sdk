// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIndexesRequest} extends {@link RequestModel}
 *
 * <p>ListIndexesRequest</p>
 */
public class ListIndexesRequest extends Request {
    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("newMode")
    private Boolean newMode;

    private ListIndexesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.newMode = builder.newMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIndexesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return newMode
     */
    public Boolean getNewMode() {
        return this.newMode;
    }

    public static final class Builder extends Request.Builder<ListIndexesRequest, Builder> {
        private String instanceId; 
        private Boolean newMode; 

        private Builder() {
            super();
        } 

        private Builder(ListIndexesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.newMode = request.newMode;
        } 

        /**
         * The ID of the instance
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 是否为新版本控制台页面
         */
        public Builder newMode(Boolean newMode) {
            this.putQueryParameter("newMode", newMode);
            this.newMode = newMode;
            return this;
        }

        @Override
        public ListIndexesRequest build() {
            return new ListIndexesRequest(this);
        } 

    } 

}
