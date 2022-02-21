// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccountRelationResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccountRelationResponseBody</p>
 */
public class GetAccountRelationResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetAccountRelationResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccountRelationResponseBody create() {
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
    public Data getData() {
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
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * code
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAccountRelationResponseBody build() {
            return new GetAccountRelationResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ChildUserId")
        private Long childUserId;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("ParentUserId")
        private Long parentUserId;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
        private String type;

        private Data(Builder builder) {
            this.childUserId = builder.childUserId;
            this.endTime = builder.endTime;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.parentUserId = builder.parentUserId;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return childUserId
         */
        public Long getChildUserId() {
            return this.childUserId;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return parentUserId
         */
        public Long getParentUserId() {
            return this.parentUserId;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long childUserId; 
            private Long endTime; 
            private Long gmtModified; 
            private Long id; 
            private Long parentUserId; 
            private Long startTime; 
            private String status; 
            private String type; 

            /**
             * ChildUserId.
             */
            public Builder childUserId(Long childUserId) {
                this.childUserId = childUserId;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * id
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * parentUserId
             */
            public Builder parentUserId(Long parentUserId) {
                this.parentUserId = parentUserId;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
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
             * type
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
