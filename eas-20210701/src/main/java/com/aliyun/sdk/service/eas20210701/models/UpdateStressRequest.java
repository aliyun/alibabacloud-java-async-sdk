// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateStressRequest} extends {@link RequestModel}
 *
 * <p>UpdateStressRequest</p>
 */
public class UpdateStressRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Path
    @NameInMap("StressName")
    @Validation(required = true)
    private String stressName;

    @Body
    @NameInMap("body")
    private String body;

    private UpdateStressRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.stressName = builder.stressName;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateStressRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return stressName
     */
    public String getStressName() {
        return this.stressName;
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateStressRequest, Builder> {
        private String clusterId; 
        private String stressName; 
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateStressRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.stressName = request.stressName;
            this.body = request.body;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * StressName.
         */
        public Builder stressName(String stressName) {
            this.putPathParameter("StressName", stressName);
            this.stressName = stressName;
            return this;
        }

        /**
         * body.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateStressRequest build() {
            return new UpdateStressRequest(this);
        } 

    } 

}
