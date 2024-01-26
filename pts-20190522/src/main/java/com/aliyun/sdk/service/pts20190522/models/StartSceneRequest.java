// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20190522.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartSceneRequest} extends {@link RequestModel}
 *
 * <p>StartSceneRequest</p>
 */
public class StartSceneRequest extends Request {
    @Query
    @NameInMap("SceneId")
    @Validation(required = true)
    private Long sceneId;

    @Query
    @NameInMap("TaskId")
    @Validation(required = true)
    private Long taskId;

    @Query
    @NameInMap("TeamId")
    @Validation(required = true)
    private Long teamId;

    @Query
    @NameInMap("UserId")
    @Validation(required = true)
    private Long userId;

    private StartSceneRequest(Builder builder) {
        super(builder);
        this.sceneId = builder.sceneId;
        this.taskId = builder.taskId;
        this.teamId = builder.teamId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartSceneRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sceneId
     */
    public Long getSceneId() {
        return this.sceneId;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    /**
     * @return teamId
     */
    public Long getTeamId() {
        return this.teamId;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<StartSceneRequest, Builder> {
        private Long sceneId; 
        private Long taskId; 
        private Long teamId; 
        private Long userId; 

        private Builder() {
            super();
        } 

        private Builder(StartSceneRequest request) {
            super(request);
            this.sceneId = request.sceneId;
            this.taskId = request.taskId;
            this.teamId = request.teamId;
            this.userId = request.userId;
        } 

        /**
         * SceneId.
         */
        public Builder sceneId(Long sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * TeamId.
         */
        public Builder teamId(Long teamId) {
            this.putQueryParameter("TeamId", teamId);
            this.teamId = teamId;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(Long userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public StartSceneRequest build() {
            return new StartSceneRequest(this);
        } 

    } 

}
