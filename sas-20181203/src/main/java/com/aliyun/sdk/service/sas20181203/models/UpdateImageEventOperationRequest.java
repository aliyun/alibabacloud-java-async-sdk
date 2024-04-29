// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateImageEventOperationRequest} extends {@link RequestModel}
 *
 * <p>UpdateImageEventOperationRequest</p>
 */
public class UpdateImageEventOperationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scenarios")
    private String scenarios;

    private UpdateImageEventOperationRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.scenarios = builder.scenarios;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateImageEventOperationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return scenarios
     */
    public String getScenarios() {
        return this.scenarios;
    }

    public static final class Builder extends Request.Builder<UpdateImageEventOperationRequest, Builder> {
        private Long id; 
        private String scenarios; 

        private Builder() {
            super();
        } 

        private Builder(UpdateImageEventOperationRequest request) {
            super(request);
            this.id = request.id;
            this.scenarios = request.scenarios;
        } 

        /**
         * The ID of the alert handling rule.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The application scope of the rule. The value is in the JSON format. Valid values:
         * <p>
         * 
         * *   **type**
         * *   **value**
         */
        public Builder scenarios(String scenarios) {
            this.putQueryParameter("Scenarios", scenarios);
            this.scenarios = scenarios;
            return this;
        }

        @Override
        public UpdateImageEventOperationRequest build() {
            return new UpdateImageEventOperationRequest(this);
        } 

    } 

}
