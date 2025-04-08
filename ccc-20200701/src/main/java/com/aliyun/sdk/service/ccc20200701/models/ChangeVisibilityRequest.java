// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link ChangeVisibilityRequest} extends {@link RequestModel}
 *
 * <p>ChangeVisibilityRequest</p>
 */
public class ChangeVisibilityRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Invisible")
    private Boolean invisible;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>szpczf</p>
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
