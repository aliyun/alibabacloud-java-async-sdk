// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDownloadFileRequest} extends {@link RequestModel}
 *
 * <p>GetDownloadFileRequest</p>
 */
public class GetDownloadFileRequest extends Request {
    @Body
    @NameInMap("Context")
    private java.util.Map < String, ? > context;

    @Body
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("LongJobId")
    @Validation(required = true)
    private String longJobId;

    private GetDownloadFileRequest(Builder builder) {
        super(builder);
        this.context = builder.context;
        this.iotInstanceId = builder.iotInstanceId;
        this.longJobId = builder.longJobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDownloadFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return context
     */
    public java.util.Map < String, ? > getContext() {
        return this.context;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return longJobId
     */
    public String getLongJobId() {
        return this.longJobId;
    }

    public static final class Builder extends Request.Builder<GetDownloadFileRequest, Builder> {
        private java.util.Map < String, ? > context; 
        private String iotInstanceId; 
        private String longJobId; 

        private Builder() {
            super();
        } 

        private Builder(GetDownloadFileRequest request) {
            super(request);
            this.context = request.context;
            this.iotInstanceId = request.iotInstanceId;
            this.longJobId = request.longJobId;
        } 

        /**
         * Context.
         */
        public Builder context(java.util.Map < String, ? > context) {
            String contextShrink = shrink(context, "Context", "json");
            this.putBodyParameter("Context", contextShrink);
            this.context = context;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putBodyParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * LongJobId.
         */
        public Builder longJobId(String longJobId) {
            this.putQueryParameter("LongJobId", longJobId);
            this.longJobId = longJobId;
            return this;
        }

        @Override
        public GetDownloadFileRequest build() {
            return new GetDownloadFileRequest(this);
        } 

    } 

}
