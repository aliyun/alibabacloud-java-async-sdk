// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

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
 * {@link PushVoiceBoxCommandsRequest} extends {@link RequestModel}
 *
 * <p>PushVoiceBoxCommandsRequest</p>
 */
public class PushVoiceBoxCommandsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Commands")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Commands> commands;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HotelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hotelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoomNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String roomNo;

    private PushVoiceBoxCommandsRequest(Builder builder) {
        super(builder);
        this.commands = builder.commands;
        this.hotelId = builder.hotelId;
        this.roomNo = builder.roomNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushVoiceBoxCommandsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commands
     */
    public java.util.List<Commands> getCommands() {
        return this.commands;
    }

    /**
     * @return hotelId
     */
    public String getHotelId() {
        return this.hotelId;
    }

    /**
     * @return roomNo
     */
    public String getRoomNo() {
        return this.roomNo;
    }

    public static final class Builder extends Request.Builder<PushVoiceBoxCommandsRequest, Builder> {
        private java.util.List<Commands> commands; 
        private String hotelId; 
        private String roomNo; 

        private Builder() {
            super();
        } 

        private Builder(PushVoiceBoxCommandsRequest request) {
            super(request);
            this.commands = request.commands;
            this.hotelId = request.hotelId;
            this.roomNo = request.roomNo;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder commands(java.util.List<Commands> commands) {
            String commandsShrink = shrink(commands, "Commands", "json");
            this.putBodyParameter("Commands", commandsShrink);
            this.commands = commands;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder hotelId(String hotelId) {
            this.putBodyParameter("HotelId", hotelId);
            this.hotelId = hotelId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder roomNo(String roomNo) {
            this.putBodyParameter("RoomNo", roomNo);
            this.roomNo = roomNo;
            return this;
        }

        @Override
        public PushVoiceBoxCommandsRequest build() {
            return new PushVoiceBoxCommandsRequest(this);
        } 

    } 

    /**
     * 
     * {@link PushVoiceBoxCommandsRequest} extends {@link TeaModel}
     *
     * <p>PushVoiceBoxCommandsRequest</p>
     */
    public static class Commands extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommandDomain")
        @com.aliyun.core.annotation.Validation(required = true)
        private String commandDomain;

        @com.aliyun.core.annotation.NameInMap("CommandName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String commandName;

        @com.aliyun.core.annotation.NameInMap("Payload")
        private String payload;

        private Commands(Builder builder) {
            this.commandDomain = builder.commandDomain;
            this.commandName = builder.commandName;
            this.payload = builder.payload;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Commands create() {
            return builder().build();
        }

        /**
         * @return commandDomain
         */
        public String getCommandDomain() {
            return this.commandDomain;
        }

        /**
         * @return commandName
         */
        public String getCommandName() {
            return this.commandName;
        }

        /**
         * @return payload
         */
        public String getPayload() {
            return this.payload;
        }

        public static final class Builder {
            private String commandDomain; 
            private String commandName; 
            private String payload; 

            private Builder() {
            } 

            private Builder(Commands model) {
                this.commandDomain = model.commandDomain;
                this.commandName = model.commandName;
                this.payload = model.payload;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder commandDomain(String commandDomain) {
                this.commandDomain = commandDomain;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder commandName(String commandName) {
                this.commandName = commandName;
                return this;
            }

            /**
             * Payload.
             */
            public Builder payload(String payload) {
                this.payload = payload;
                return this;
            }

            public Commands build() {
                return new Commands(this);
            } 

        } 

    }
}
