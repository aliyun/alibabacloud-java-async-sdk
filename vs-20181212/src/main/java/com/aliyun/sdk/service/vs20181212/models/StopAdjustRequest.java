// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link StopAdjustRequest} extends {@link RequestModel}
 *
 * <p>StopAdjustRequest</p>
 */
public class StopAdjustRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Focus")
    private Boolean focus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Iris")
    private Boolean iris;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    private StopAdjustRequest(Builder builder) {
        super(builder);
        this.focus = builder.focus;
        this.id = builder.id;
        this.iris = builder.iris;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopAdjustRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return focus
     */
    public Boolean getFocus() {
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
    public Boolean getIris() {
        return this.iris;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<StopAdjustRequest, Builder> {
        private Boolean focus; 
        private String id; 
        private Boolean iris; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(StopAdjustRequest request) {
            super(request);
            this.focus = request.focus;
            this.id = request.id;
            this.iris = request.iris;
            this.ownerId = request.ownerId;
        } 

        /**
         * Focus.
         */
        public Builder focus(Boolean focus) {
            this.putQueryParameter("Focus", focus);
            this.focus = focus;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>348*****380-cn-qingdao</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Iris.
         */
        public Builder iris(Boolean iris) {
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
        public StopAdjustRequest build() {
            return new StopAdjustRequest(this);
        } 

    } 

}
