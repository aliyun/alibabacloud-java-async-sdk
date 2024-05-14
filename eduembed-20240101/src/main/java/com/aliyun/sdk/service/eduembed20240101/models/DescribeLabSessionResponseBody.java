// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eduembed20240101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLabSessionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLabSessionResponseBody</p>
 */
public class DescribeLabSessionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("LabSession")
    private LabSession labSession;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeLabSessionResponseBody(Builder builder) {
        this.code = builder.code;
        this.labSession = builder.labSession;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLabSessionResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return labSession
     */
    public LabSession getLabSession() {
        return this.labSession;
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
        private LabSession labSession; 
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
         * LabSession.
         */
        public Builder labSession(LabSession labSession) {
            this.labSession = labSession;
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

        public DescribeLabSessionResponseBody build() {
            return new DescribeLabSessionResponseBody(this);
        } 

    } 

    public static class LabSession extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Finished")
        private Boolean finished;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("LabId")
        private Long labId;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private LabSession(Builder builder) {
            this.createTime = builder.createTime;
            this.finished = builder.finished;
            this.id = builder.id;
            this.labId = builder.labId;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LabSession create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return finished
         */
        public Boolean getFinished() {
            return this.finished;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return labId
         */
        public Long getLabId() {
            return this.labId;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String createTime; 
            private Boolean finished; 
            private String id; 
            private Long labId; 
            private String url; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Finished.
             */
            public Builder finished(Boolean finished) {
                this.finished = finished;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * LabId.
             */
            public Builder labId(Long labId) {
                this.labId = labId;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public LabSession build() {
                return new LabSession(this);
            } 

        } 

    }
}
