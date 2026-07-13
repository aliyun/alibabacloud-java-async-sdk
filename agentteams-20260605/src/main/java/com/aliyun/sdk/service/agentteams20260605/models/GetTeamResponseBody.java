// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentteams20260605.models;

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
 * {@link GetTeamResponseBody} extends {@link TeaModel}
 *
 * <p>GetTeamResponseBody</p>
 */
public class GetTeamResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetTeamResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTeamResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetTeamResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetTeamResponseBody build() {
            return new GetTeamResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTeamResponseBody} extends {@link TeaModel}
     *
     * <p>GetTeamResponseBody</p>
     */
    public static class Rooms extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RoomId")
        private String roomId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Rooms(Builder builder) {
            this.roomId = builder.roomId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rooms create() {
            return builder().build();
        }

        /**
         * @return roomId
         */
        public String getRoomId() {
            return this.roomId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String roomId; 
            private String type; 

            private Builder() {
            } 

            private Builder(Rooms model) {
                this.roomId = model.roomId;
                this.type = model.type;
            } 

            /**
             * RoomId.
             */
            public Builder roomId(String roomId) {
                this.roomId = roomId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Rooms build() {
                return new Rooms(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTeamResponseBody} extends {@link TeaModel}
     *
     * <p>GetTeamResponseBody</p>
     */
    public static class TeamMembers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private TeamMembers(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TeamMembers create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            private Builder() {
            } 

            private Builder(TeamMembers model) {
                this.name = model.name;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public TeamMembers build() {
                return new TeamMembers(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTeamResponseBody} extends {@link TeaModel}
     *
     * <p>GetTeamResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdminName")
        private String adminName;

        @com.aliyun.core.annotation.NameInMap("CreatedAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LeaderName")
        private String leaderName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Rooms")
        private java.util.List<Rooms> rooms;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TeamMembers")
        private java.util.List<TeamMembers> teamMembers;

        @com.aliyun.core.annotation.NameInMap("UpdatedAt")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("WorkerNames")
        private java.util.List<String> workerNames;

        private Data(Builder builder) {
            this.adminName = builder.adminName;
            this.createdAt = builder.createdAt;
            this.description = builder.description;
            this.instanceId = builder.instanceId;
            this.leaderName = builder.leaderName;
            this.name = builder.name;
            this.rooms = builder.rooms;
            this.status = builder.status;
            this.teamMembers = builder.teamMembers;
            this.updatedAt = builder.updatedAt;
            this.workerNames = builder.workerNames;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return adminName
         */
        public String getAdminName() {
            return this.adminName;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return leaderName
         */
        public String getLeaderName() {
            return this.leaderName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return rooms
         */
        public java.util.List<Rooms> getRooms() {
            return this.rooms;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return teamMembers
         */
        public java.util.List<TeamMembers> getTeamMembers() {
            return this.teamMembers;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        /**
         * @return workerNames
         */
        public java.util.List<String> getWorkerNames() {
            return this.workerNames;
        }

        public static final class Builder {
            private String adminName; 
            private String createdAt; 
            private String description; 
            private String instanceId; 
            private String leaderName; 
            private String name; 
            private java.util.List<Rooms> rooms; 
            private String status; 
            private java.util.List<TeamMembers> teamMembers; 
            private String updatedAt; 
            private java.util.List<String> workerNames; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.adminName = model.adminName;
                this.createdAt = model.createdAt;
                this.description = model.description;
                this.instanceId = model.instanceId;
                this.leaderName = model.leaderName;
                this.name = model.name;
                this.rooms = model.rooms;
                this.status = model.status;
                this.teamMembers = model.teamMembers;
                this.updatedAt = model.updatedAt;
                this.workerNames = model.workerNames;
            } 

            /**
             * AdminName.
             */
            public Builder adminName(String adminName) {
                this.adminName = adminName;
                return this;
            }

            /**
             * CreatedAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * LeaderName.
             */
            public Builder leaderName(String leaderName) {
                this.leaderName = leaderName;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Rooms.
             */
            public Builder rooms(java.util.List<Rooms> rooms) {
                this.rooms = rooms;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TeamMembers.
             */
            public Builder teamMembers(java.util.List<TeamMembers> teamMembers) {
                this.teamMembers = teamMembers;
                return this;
            }

            /**
             * UpdatedAt.
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * WorkerNames.
             */
            public Builder workerNames(java.util.List<String> workerNames) {
                this.workerNames = workerNames;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
