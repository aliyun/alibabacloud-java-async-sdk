// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link GetRealtimeInstanceStatesRequest} extends {@link RequestModel}
 *
 * <p>GetRealtimeInstanceStatesRequest</p>
 */
public class GetRealtimeInstanceStatesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaType")
    private String mediaType;

    private GetRealtimeInstanceStatesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.mediaType = builder.mediaType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRealtimeInstanceStatesRequest create() {
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
     * @return mediaType
     */
    public String getMediaType() {
        return this.mediaType;
    }

    public static final class Builder extends Request.Builder<GetRealtimeInstanceStatesRequest, Builder> {
        private String instanceId; 
        private String mediaType; 

        private Builder() {
            super();
        } 

        private Builder(GetRealtimeInstanceStatesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.mediaType = request.mediaType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * MediaType.
         */
        public Builder mediaType(String mediaType) {
            this.putQueryParameter("MediaType", mediaType);
            this.mediaType = mediaType;
            return this;
        }

        @Override
        public GetRealtimeInstanceStatesRequest build() {
            return new GetRealtimeInstanceStatesRequest(this);
        } 

    } 

}
