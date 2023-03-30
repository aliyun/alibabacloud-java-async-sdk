// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSwimmingLaneRequest} extends {@link RequestModel}
 *
 * <p>DeleteSwimmingLaneRequest</p>
 */
public class DeleteSwimmingLaneRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("LaneId")
    @Validation(required = true)
    private Long laneId;

    @Query
    @NameInMap("Namespace")
    @Validation(maxLength = 64)
    private String namespace;

    private DeleteSwimmingLaneRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.laneId = builder.laneId;
        this.namespace = builder.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSwimmingLaneRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return laneId
     */
    public Long getLaneId() {
        return this.laneId;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    public static final class Builder extends Request.Builder<DeleteSwimmingLaneRequest, Builder> {
        private String acceptLanguage; 
        private Long laneId; 
        private String namespace; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSwimmingLaneRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.laneId = request.laneId;
            this.namespace = request.namespace;
        } 

        /**
         * The language of the response. Valid values:
         * <p>
         * 
         * *   zh: Chinese
         * *   en: English
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * The ID of the lane.
         */
        public Builder laneId(Long laneId) {
            this.putQueryParameter("LaneId", laneId);
            this.laneId = laneId;
            return this;
        }

        /**
         * MSE命名空间名字
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        @Override
        public DeleteSwimmingLaneRequest build() {
            return new DeleteSwimmingLaneRequest(this);
        } 

    } 

}
