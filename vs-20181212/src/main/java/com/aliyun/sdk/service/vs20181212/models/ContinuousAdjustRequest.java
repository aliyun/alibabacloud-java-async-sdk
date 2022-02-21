// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ContinuousAdjustRequest} extends {@link RequestModel}
 *
 * <p>ContinuousAdjustRequest</p>
 */
public class ContinuousAdjustRequest extends Request {
    @Query
    @NameInMap("Focus")
    private String focus;

    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    @Query
    @NameInMap("Iris")
    private String iris;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private ContinuousAdjustRequest(Builder builder) {
        super(builder);
        this.focus = builder.focus;
        this.id = builder.id;
        this.iris = builder.iris;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ContinuousAdjustRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return focus
     */
    public String getFocus() {
        return this.focus;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return iris
     */
    public String getIris() {
        return this.iris;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<ContinuousAdjustRequest, Builder> {
        private String focus; 
        private String id; 
        private String iris; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(ContinuousAdjustRequest response) {
            super(response);
            this.focus = response.focus;
            this.id = response.id;
            this.iris = response.iris;
            this.ownerId = response.ownerId;
        } 

        /**
         * Focus.
         */
        public Builder focus(String focus) {
            this.putQueryParameter("Focus", focus);
            this.focus = focus;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Iris.
         */
        public Builder iris(String iris) {
            this.putQueryParameter("Iris", iris);
            this.iris = iris;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public ContinuousAdjustRequest build() {
            return new ContinuousAdjustRequest(this);
        } 

    } 

}
