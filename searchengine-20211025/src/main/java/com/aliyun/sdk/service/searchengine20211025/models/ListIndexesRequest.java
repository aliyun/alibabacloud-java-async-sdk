// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIndexesRequest} extends {@link RequestModel}
 *
 * <p>ListIndexesRequest</p>
 */
public class ListIndexesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("newMode")
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
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Specifies whether the OpenSearch Vector Search Edition instance is of the new version.
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
