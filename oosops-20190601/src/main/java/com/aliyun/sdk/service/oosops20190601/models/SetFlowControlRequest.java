// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oosops20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetFlowControlRequest} extends {@link RequestModel}
 *
 * <p>SetFlowControlRequest</p>
 */
public class SetFlowControlRequest extends Request {
    @Query
    @NameInMap("Api")
    private String api;

    @Query
    @NameInMap("Service")
    private String service;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private Integer type;

    @Query
    @NameInMap("Uid")
    private String uid;

    @Query
    @NameInMap("Value")
    @Validation(required = true)
    private Integer value;

    private SetFlowControlRequest(Builder builder) {
        super(builder);
        this.api = builder.api;
        this.service = builder.service;
        this.type = builder.type;
        this.uid = builder.uid;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetFlowControlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return api
     */
    public String getApi() {
        return this.api;
    }

    /**
     * @return service
     */
    public String getService() {
        return this.service;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return value
     */
    public Integer getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<SetFlowControlRequest, Builder> {
        private String api; 
        private String service; 
        private Integer type; 
        private String uid; 
        private Integer value; 

        private Builder() {
            super();
        } 

        private Builder(SetFlowControlRequest request) {
            super(request);
            this.api = request.api;
            this.service = request.service;
            this.type = request.type;
            this.uid = request.uid;
            this.value = request.value;
        } 

        /**
         * Api.
         */
        public Builder api(String api) {
            this.putQueryParameter("Api", api);
            this.api = api;
            return this;
        }

        /**
         * Service.
         */
        public Builder service(String service) {
            this.putQueryParameter("Service", service);
            this.service = service;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(Integer type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * Uid.
         */
        public Builder uid(String uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * Value.
         */
        public Builder value(Integer value) {
            this.putQueryParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public SetFlowControlRequest build() {
            return new SetFlowControlRequest(this);
        } 

    } 

}
