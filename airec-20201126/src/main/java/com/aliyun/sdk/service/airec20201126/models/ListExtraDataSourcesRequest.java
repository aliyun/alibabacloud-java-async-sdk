// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListExtraDataSourcesRequest} extends {@link RequestModel}
 *
 * <p>ListExtraDataSourcesRequest</p>
 */
public class ListExtraDataSourcesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private ListExtraDataSourcesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExtraDataSourcesRequest create() {
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListExtraDataSourcesRequest, Builder> {
        private String instanceId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListExtraDataSourcesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.type = request.type;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>airec-cn-shdjkgkeog</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListExtraDataSourcesRequest build() {
            return new ListExtraDataSourcesRequest(this);
        } 

    } 

}
