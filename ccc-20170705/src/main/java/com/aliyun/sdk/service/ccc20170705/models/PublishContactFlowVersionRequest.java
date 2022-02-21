// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishContactFlowVersionRequest} extends {@link RequestModel}
 *
 * <p>PublishContactFlowVersionRequest</p>
 */
public class PublishContactFlowVersionRequest extends Request {
    @Query
    @NameInMap("ContactFlowVersionId")
    @Validation(required = true)
    private String contactFlowVersionId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("UseTianGong")
    private Boolean useTianGong;

    private PublishContactFlowVersionRequest(Builder builder) {
        super(builder);
        this.contactFlowVersionId = builder.contactFlowVersionId;
        this.instanceId = builder.instanceId;
        this.useTianGong = builder.useTianGong;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishContactFlowVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactFlowVersionId
     */
    public String getContactFlowVersionId() {
        return this.contactFlowVersionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return useTianGong
     */
    public Boolean getUseTianGong() {
        return this.useTianGong;
    }

    public static final class Builder extends Request.Builder<PublishContactFlowVersionRequest, Builder> {
        private String contactFlowVersionId; 
        private String instanceId; 
        private Boolean useTianGong; 

        private Builder() {
            super();
        } 

        private Builder(PublishContactFlowVersionRequest response) {
            super(response);
            this.contactFlowVersionId = response.contactFlowVersionId;
            this.instanceId = response.instanceId;
            this.useTianGong = response.useTianGong;
        } 

        /**
         * ContactFlowVersionId.
         */
        public Builder contactFlowVersionId(String contactFlowVersionId) {
            this.putQueryParameter("ContactFlowVersionId", contactFlowVersionId);
            this.contactFlowVersionId = contactFlowVersionId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * UseTianGong.
         */
        public Builder useTianGong(Boolean useTianGong) {
            this.putQueryParameter("UseTianGong", useTianGong);
            this.useTianGong = useTianGong;
            return this;
        }

        @Override
        public PublishContactFlowVersionRequest build() {
            return new PublishContactFlowVersionRequest(this);
        } 

    } 

}
