// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushVoiceBoxCommandsRequest} extends {@link RequestModel}
 *
 * <p>PushVoiceBoxCommandsRequest</p>
 */
public class PushVoiceBoxCommandsRequest extends Request {
    @Body
    @NameInMap("Commands")
    @Validation(required = true)
    private java.util.List < Commands> commands;

    @Body
    @NameInMap("HotelId")
    @Validation(required = true)
    private String hotelId;

    @Body
    @NameInMap("RoomNo")
    @Validation(required = true)
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
    public java.util.List < Commands> getCommands() {
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
        private java.util.List < Commands> commands; 
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
         * Commands.
         */
        public Builder commands(java.util.List < Commands> commands) {
            String commandsShrink = shrink(commands, "Commands", "json");
            this.putBodyParameter("Commands", commandsShrink);
            this.commands = commands;
            return this;
        }

        /**
         * HotelId.
         */
        public Builder hotelId(String hotelId) {
            this.putBodyParameter("HotelId", hotelId);
            this.hotelId = hotelId;
            return this;
        }

        /**
         * RoomNo.
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

    public static class Commands extends TeaModel {
        @NameInMap("CommandDomain")
        @Validation(required = true)
        private String commandDomain;

        @NameInMap("CommandName")
        @Validation(required = true)
        private String commandName;

        @NameInMap("Payload")
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

            /**
             * CommandDomain.
             */
            public Builder commandDomain(String commandDomain) {
                this.commandDomain = commandDomain;
                return this;
            }

            /**
             * CommandName.
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
