// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mindlive20210301.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReportLiveStateRequest} extends {@link RequestModel}
 *
 * <p>ReportLiveStateRequest</p>
 */
public class ReportLiveStateRequest extends Request {
    @Query
    @NameInMap("AnchorId")
    @Validation(required = true)
    private String anchorId;

    @Query
    @NameInMap("Id")
    private String id;

    @Query
    @NameInMap("LiveMode")
    private String liveMode;

    @Query
    @NameInMap("LiveState")
    @Validation(required = true)
    private String liveState;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private Long startTime;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private ReportLiveStateRequest(Builder builder) {
        super(builder);
        this.anchorId = builder.anchorId;
        this.id = builder.id;
        this.liveMode = builder.liveMode;
        this.liveState = builder.liveState;
        this.startTime = builder.startTime;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReportLiveStateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return anchorId
     */
    public String getAnchorId() {
        return this.anchorId;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return liveMode
     */
    public String getLiveMode() {
        return this.liveMode;
    }

    /**
     * @return liveState
     */
    public String getLiveState() {
        return this.liveState;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ReportLiveStateRequest, Builder> {
        private String anchorId; 
        private String id; 
        private String liveMode; 
        private String liveState; 
        private Long startTime; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ReportLiveStateRequest request) {
            super(request);
            this.anchorId = request.anchorId;
            this.id = request.id;
            this.liveMode = request.liveMode;
            this.liveState = request.liveState;
            this.startTime = request.startTime;
            this.type = request.type;
        } 

        /**
         * AnchorId.
         */
        public Builder anchorId(String anchorId) {
            this.putQueryParameter("AnchorId", anchorId);
            this.anchorId = anchorId;
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
         * LiveMode.
         */
        public Builder liveMode(String liveMode) {
            this.putQueryParameter("LiveMode", liveMode);
            this.liveMode = liveMode;
            return this;
        }

        /**
         * LiveState.
         */
        public Builder liveState(String liveState) {
            this.putQueryParameter("LiveState", liveState);
            this.liveState = liveState;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ReportLiveStateRequest build() {
            return new ReportLiveStateRequest(this);
        } 

    } 

}
