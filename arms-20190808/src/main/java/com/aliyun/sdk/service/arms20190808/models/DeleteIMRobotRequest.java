// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteIMRobotRequest} extends {@link RequestModel}
 *
 * <p>DeleteIMRobotRequest</p>
 */
public class DeleteIMRobotRequest extends Request {
    @Query
    @NameInMap("RobotId")
    @Validation(required = true)
    private Long robotId;

    private DeleteIMRobotRequest(Builder builder) {
        super(builder);
        this.robotId = builder.robotId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteIMRobotRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return robotId
     */
    public Long getRobotId() {
        return this.robotId;
    }

    public static final class Builder extends Request.Builder<DeleteIMRobotRequest, Builder> {
        private Long robotId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteIMRobotRequest request) {
            super(request);
            this.robotId = request.robotId;
        } 

        /**
         * The ID of the IM chatbot.
         */
        public Builder robotId(Long robotId) {
            this.putQueryParameter("RobotId", robotId);
            this.robotId = robotId;
            return this;
        }

        @Override
        public DeleteIMRobotRequest build() {
            return new DeleteIMRobotRequest(this);
        } 

    } 

}
