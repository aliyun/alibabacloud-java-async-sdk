// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWorkitemTimeTypeListResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkitemTimeTypeListResponseBody</p>
 */
public class GetWorkitemTimeTypeListResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMsg")
    private String errorMsg;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private String success;

    @NameInMap("timeType")
    private java.util.List < TimeType> timeType;

    private GetWorkitemTimeTypeListResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.timeType = builder.timeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkitemTimeTypeListResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
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
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return timeType
     */
    public java.util.List < TimeType> getTimeType() {
        return this.timeType;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMsg; 
        private String requestId; 
        private String success; 
        private java.util.List < TimeType> timeType; 

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * timeType.
         */
        public Builder timeType(java.util.List < TimeType> timeType) {
            this.timeType = timeType;
            return this;
        }

        public GetWorkitemTimeTypeListResponseBody build() {
            return new GetWorkitemTimeTypeListResponseBody(this);
        } 

    } 

    public static class TimeType extends TeaModel {
        @NameInMap("description")
        private String description;

        @NameInMap("displayName")
        private String displayName;

        @NameInMap("identifier")
        private String identifier;

        @NameInMap("name")
        private String name;

        @NameInMap("position")
        private Long position;

        private TimeType(Builder builder) {
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.identifier = builder.identifier;
            this.name = builder.name;
            this.position = builder.position;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeType create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return position
         */
        public Long getPosition() {
            return this.position;
        }

        public static final class Builder {
            private String description; 
            private String displayName; 
            private String identifier; 
            private String name; 
            private Long position; 

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * displayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * identifier.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * position.
             */
            public Builder position(Long position) {
                this.position = position;
                return this;
            }

            public TimeType build() {
                return new TimeType(this);
            } 

        } 

    }
}
