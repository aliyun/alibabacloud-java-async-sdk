// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRobotAllResponseBody} extends {@link TeaModel}
 *
 * <p>ListRobotAllResponseBody</p>
 */
public class ListRobotAllResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListRobotAllResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRobotAllResponseBody create() {
        return builder().build();
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
    public java.util.List < Data> getData() {
        return this.data;
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
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

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
        public Builder data(java.util.List < Data> data) {
            this.data = data;
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

        public ListRobotAllResponseBody build() {
            return new ListRobotAllResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AtProfession")
        private String atProfession;

        @NameInMap("AtSence")
        private String atSence;

        @NameInMap("Id")
        private Long id;

        @NameInMap("RobotName")
        private String robotName;

        @NameInMap("RobotType")
        private String robotType;

        private Data(Builder builder) {
            this.atProfession = builder.atProfession;
            this.atSence = builder.atSence;
            this.id = builder.id;
            this.robotName = builder.robotName;
            this.robotType = builder.robotType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return atProfession
         */
        public String getAtProfession() {
            return this.atProfession;
        }

        /**
         * @return atSence
         */
        public String getAtSence() {
            return this.atSence;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return robotName
         */
        public String getRobotName() {
            return this.robotName;
        }

        /**
         * @return robotType
         */
        public String getRobotType() {
            return this.robotType;
        }

        public static final class Builder {
            private String atProfession; 
            private String atSence; 
            private Long id; 
            private String robotName; 
            private String robotType; 

            /**
             * AtProfession.
             */
            public Builder atProfession(String atProfession) {
                this.atProfession = atProfession;
                return this;
            }

            /**
             * AtSence.
             */
            public Builder atSence(String atSence) {
                this.atSence = atSence;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * RobotName.
             */
            public Builder robotName(String robotName) {
                this.robotName = robotName;
                return this;
            }

            /**
             * RobotType.
             */
            public Builder robotType(String robotType) {
                this.robotType = robotType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
