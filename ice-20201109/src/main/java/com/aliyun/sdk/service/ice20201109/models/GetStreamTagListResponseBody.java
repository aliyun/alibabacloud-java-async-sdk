// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link GetStreamTagListResponseBody} extends {@link TeaModel}
 *
 * <p>GetStreamTagListResponseBody</p>
 */
public class GetStreamTagListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StreamTagList")
    private java.util.List<StreamTagList> streamTagList;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private GetStreamTagListResponseBody(Builder builder) {
        this.code = builder.code;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.streamTagList = builder.streamTagList;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStreamTagListResponseBody create() {
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
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return streamTagList
     */
    public java.util.List<StreamTagList> getStreamTagList() {
        return this.streamTagList;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<StreamTagList> streamTagList; 
        private String success; 
        private Long total; 

        private Builder() {
        } 

        private Builder(GetStreamTagListResponseBody model) {
            this.code = model.code;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.streamTagList = model.streamTagList;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StreamTagList.
         */
        public Builder streamTagList(java.util.List<StreamTagList> streamTagList) {
            this.streamTagList = streamTagList;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public GetStreamTagListResponseBody build() {
            return new GetStreamTagListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetStreamTagListResponseBody} extends {@link TeaModel}
     *
     * <p>GetStreamTagListResponseBody</p>
     */
    public static class StreamTagList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private StreamTagList(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StreamTagList create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        public static final class Builder {
            private String endTime; 
            private String startTime; 
            private String userData; 

            private Builder() {
            } 

            private Builder(StreamTagList model) {
                this.endTime = model.endTime;
                this.startTime = model.startTime;
                this.userData = model.userData;
            } 

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * UserData.
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            public StreamTagList build() {
                return new StreamTagList(this);
            } 

        } 

    }
}
