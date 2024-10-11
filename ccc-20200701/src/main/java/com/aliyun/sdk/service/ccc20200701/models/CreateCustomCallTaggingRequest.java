// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateCustomCallTaggingRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomCallTaggingRequest</p>
 */
public class CreateCustomCallTaggingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomNumberList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String customNumberList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private CreateCustomCallTaggingRequest(Builder builder) {
        super(builder);
        this.customNumberList = builder.customNumberList;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomCallTaggingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customNumberList
     */
    public String getCustomNumberList() {
        return this.customNumberList;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<CreateCustomCallTaggingRequest, Builder> {
        private String customNumberList; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCustomCallTaggingRequest request) {
            super(request);
            this.customNumberList = request.customNumberList;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder customNumberList(String customNumberList) {
            this.putQueryParameter("CustomNumberList", customNumberList);
            this.customNumberList = customNumberList;
            return this;
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

        @Override
        public CreateCustomCallTaggingRequest build() {
            return new CreateCustomCallTaggingRequest(this);
        } 

    } 

}
