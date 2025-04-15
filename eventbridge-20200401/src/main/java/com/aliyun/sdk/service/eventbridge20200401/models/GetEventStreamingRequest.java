// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link GetEventStreamingRequest} extends {@link RequestModel}
 *
 * <p>GetEventStreamingRequest</p>
 */
public class GetEventStreamingRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EventStreamingName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 255, minLength = 2)
    private String eventStreamingName;

    private GetEventStreamingRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.eventStreamingName = builder.eventStreamingName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEventStreamingRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return eventStreamingName
     */
    public String getEventStreamingName() {
        return this.eventStreamingName;
    }

    public static final class Builder extends Request.Builder<GetEventStreamingRequest, Builder> {
        private String regionId; 
        private String eventStreamingName; 

        private Builder() {
            super();
        } 

        private Builder(GetEventStreamingRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.eventStreamingName = request.eventStreamingName;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The name of the event stream whose details you want to query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>myeventstreaming</p>
         */
        public Builder eventStreamingName(String eventStreamingName) {
            this.putBodyParameter("EventStreamingName", eventStreamingName);
            this.eventStreamingName = eventStreamingName;
            return this;
        }

        @Override
        public GetEventStreamingRequest build() {
            return new GetEventStreamingRequest(this);
        } 

    } 

}
