// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeVisibilityRequest} extends {@link RequestModel}
 *
 * <p>ChangeVisibilityRequest</p>
 */
public class ChangeVisibilityRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Invisible")
    private Boolean invisible;

    @Query
    @NameInMap("UserId")
    private String userId;

    private ChangeVisibilityRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.invisible = builder.invisible;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeVisibilityRequest create() {
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
     * @return invisible
     */
    public Boolean getInvisible() {
        return this.invisible;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<ChangeVisibilityRequest, Builder> {
        private String instanceId; 
        private Boolean invisible; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(ChangeVisibilityRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.invisible = request.invisible;
            this.userId = request.userId;
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
         * Invisible.
         */
        public Builder invisible(Boolean invisible) {
            this.putQueryParameter("Invisible", invisible);
            this.invisible = invisible;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public ChangeVisibilityRequest build() {
            return new ChangeVisibilityRequest(this);
        } 

    } 

}
