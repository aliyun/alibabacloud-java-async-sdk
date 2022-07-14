// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEnsServiceRequest} extends {@link RequestModel}
 *
 * <p>CreateEnsServiceRequest</p>
 */
public class CreateEnsServiceRequest extends Request {
    @Query
    @NameInMap("EnsServiceId")
    @Validation(required = true)
    private String ensServiceId;

    @Query
    @NameInMap("OrderType")
    @Validation(required = true)
    private String orderType;

    @Query
    @NameInMap("Version")
    @Validation(required = true)
    private String version;

    private CreateEnsServiceRequest(Builder builder) {
        super(builder);
        this.ensServiceId = builder.ensServiceId;
        this.orderType = builder.orderType;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEnsServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ensServiceId
     */
    public String getEnsServiceId() {
        return this.ensServiceId;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<CreateEnsServiceRequest, Builder> {
        private String ensServiceId; 
        private String orderType; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(CreateEnsServiceRequest request) {
            super(request);
            this.ensServiceId = request.ensServiceId;
            this.orderType = request.orderType;
            this.version = request.version;
        } 

        /**
         * EnsServiceId.
         */
        public Builder ensServiceId(String ensServiceId) {
            this.putQueryParameter("EnsServiceId", ensServiceId);
            this.ensServiceId = ensServiceId;
            return this;
        }

        /**
         * OrderType.
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public CreateEnsServiceRequest build() {
            return new CreateEnsServiceRequest(this);
        } 

    } 

}
