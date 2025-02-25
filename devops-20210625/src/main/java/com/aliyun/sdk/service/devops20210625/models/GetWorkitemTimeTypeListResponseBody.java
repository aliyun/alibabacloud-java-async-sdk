// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link GetWorkitemTimeTypeListResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkitemTimeTypeListResponseBody</p>
 */
public class GetWorkitemTimeTypeListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("timeType")
    private java.util.List<TimeType> timeType;

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
    public java.util.List<TimeType> getTimeType() {
        return this.timeType;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMsg; 
        private String requestId; 
        private String success; 
        private java.util.List<TimeType> timeType; 

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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>HC93CE1A-8D7A-13A9-8306-7465DE2E5C0F</p>
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
        public Builder timeType(java.util.List<TimeType> timeType) {
            this.timeType = timeType;
            return this;
        }

        public GetWorkitemTimeTypeListResponseBody build() {
            return new GetWorkitemTimeTypeListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetWorkitemTimeTypeListResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkitemTimeTypeListResponseBody</p>
     */
    public static class TimeType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("displayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("identifier")
        private String identifier;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("position")
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
