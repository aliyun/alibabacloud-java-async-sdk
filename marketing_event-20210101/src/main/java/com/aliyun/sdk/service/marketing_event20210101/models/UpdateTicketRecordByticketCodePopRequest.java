// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketing_event20210101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateTicketRecordByticketCodePopRequest} extends {@link RequestModel}
 *
 * <p>UpdateTicketRecordByticketCodePopRequest</p>
 */
public class UpdateTicketRecordByticketCodePopRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgendaId")
    private String agendaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Event")
    private String event;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneId")
    private String sceneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Time")
    private String time;

    private UpdateTicketRecordByticketCodePopRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agendaId = builder.agendaId;
        this.code = builder.code;
        this.event = builder.event;
        this.sceneId = builder.sceneId;
        this.time = builder.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTicketRecordByticketCodePopRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return agendaId
     */
    public String getAgendaId() {
        return this.agendaId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return event
     */
    public String getEvent() {
        return this.event;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    /**
     * @return time
     */
    public String getTime() {
        return this.time;
    }

    public static final class Builder extends Request.Builder<UpdateTicketRecordByticketCodePopRequest, Builder> {
        private String regionId; 
        private String agendaId; 
        private String code; 
        private String event; 
        private String sceneId; 
        private String time; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTicketRecordByticketCodePopRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agendaId = request.agendaId;
            this.code = request.code;
            this.event = request.event;
            this.sceneId = request.sceneId;
            this.time = request.time;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AgendaId.
         */
        public Builder agendaId(String agendaId) {
            this.putQueryParameter("AgendaId", agendaId);
            this.agendaId = agendaId;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.putQueryParameter("Code", code);
            this.code = code;
            return this;
        }

        /**
         * Event.
         */
        public Builder event(String event) {
            this.putQueryParameter("Event", event);
            this.event = event;
            return this;
        }

        /**
         * SceneId.
         */
        public Builder sceneId(String sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * Time.
         */
        public Builder time(String time) {
            this.putQueryParameter("Time", time);
            this.time = time;
            return this;
        }

        @Override
        public UpdateTicketRecordByticketCodePopRequest build() {
            return new UpdateTicketRecordByticketCodePopRequest(this);
        } 

    } 

}
