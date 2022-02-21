// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAssistActionDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAssistActionDetailsResponseBody</p>
 */
public class ListAssistActionDetailsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Results")
    private java.util.List < Results> results;

    private ListAssistActionDetailsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.results = builder.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAssistActionDetailsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return results
     */
    public java.util.List < Results> getResults() {
        return this.results;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Results> results; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Results.
         */
        public Builder results(java.util.List < Results> results) {
            this.results = results;
            return this;
        }

        public ListAssistActionDetailsResponseBody build() {
            return new ListAssistActionDetailsResponseBody(this);
        } 

    } 

    public static class Results extends TeaModel {
        @NameInMap("Action")
        private String action;

        @NameInMap("CreatedAt")
        private Long createdAt;

        @NameInMap("Data")
        private String data;

        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("ID")
        private String ID;

        @NameInMap("Timestamp")
        private String timestamp;

        @NameInMap("Type")
        private String type;

        @NameInMap("UpdatedAt")
        private Long updatedAt;

        private Results(Builder builder) {
            this.action = builder.action;
            this.createdAt = builder.createdAt;
            this.data = builder.data;
            this.deviceId = builder.deviceId;
            this.ID = builder.ID;
            this.timestamp = builder.timestamp;
            this.type = builder.type;
            this.updatedAt = builder.updatedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return createdAt
         */
        public Long getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return data
         */
        public String getData() {
            return this.data;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return ID
         */
        public String getID() {
            return this.ID;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return updatedAt
         */
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public static final class Builder {
            private String action; 
            private Long createdAt; 
            private String data; 
            private String deviceId; 
            private String ID; 
            private String timestamp; 
            private String type; 
            private Long updatedAt; 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * CreatedAt.
             */
            public Builder createdAt(Long createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * Data.
             */
            public Builder data(String data) {
                this.data = data;
                return this;
            }

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * ID.
             */
            public Builder ID(String ID) {
                this.ID = ID;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UpdatedAt.
             */
            public Builder updatedAt(Long updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
