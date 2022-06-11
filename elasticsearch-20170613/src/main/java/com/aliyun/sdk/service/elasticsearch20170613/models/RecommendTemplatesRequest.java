// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecommendTemplatesRequest} extends {@link RequestModel}
 *
 * <p>RecommendTemplatesRequest</p>
 */
public class RecommendTemplatesRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("body")
    private String body;

    @Query
    @NameInMap("usageScenario")
    @Validation(required = true)
    private String usageScenario;

    private RecommendTemplatesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.body = builder.body;
        this.usageScenario = builder.usageScenario;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecommendTemplatesRequest create() {
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
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    /**
     * @return usageScenario
     */
    public String getUsageScenario() {
        return this.usageScenario;
    }

    public static final class Builder extends Request.Builder<RecommendTemplatesRequest, Builder> {
        private String instanceId; 
        private String body; 
        private String usageScenario; 

        private Builder() {
            super();
        } 

        private Builder(RecommendTemplatesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.body = request.body;
            this.usageScenario = request.usageScenario;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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

        /**
         * usageScenario.
         */
        public Builder usageScenario(String usageScenario) {
            this.putQueryParameter("usageScenario", usageScenario);
            this.usageScenario = usageScenario;
            return this;
        }

        @Override
        public RecommendTemplatesRequest build() {
            return new RecommendTemplatesRequest(this);
        } 

    } 

}
