// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMessageGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetMessageGroupResponseBody</p>
 */
public class GetMessageGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private GetMessageGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMessageGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetMessageGroupResponseBody build() {
            return new GetMessageGroupResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("CreatorId")
        private String creatorId;

        @NameInMap("Extension")
        private java.util.Map < String, ? > extension;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("IsMuteAll")
        private Boolean isMuteAll;

        @NameInMap("Status")
        private Integer status;

        private Result(Builder builder) {
            this.createTime = builder.createTime;
            this.creatorId = builder.creatorId;
            this.extension = builder.extension;
            this.groupId = builder.groupId;
            this.isMuteAll = builder.isMuteAll;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return extension
         */
        public java.util.Map < String, ? > getExtension() {
            return this.extension;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return isMuteAll
         */
        public Boolean getIsMuteAll() {
            return this.isMuteAll;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long createTime; 
            private String creatorId; 
            private java.util.Map < String, ? > extension; 
            private String groupId; 
            private Boolean isMuteAll; 
            private Integer status; 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreatorId.
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * Extension.
             */
            public Builder extension(java.util.Map < String, ? > extension) {
                this.extension = extension;
                return this;
            }

            /**
             * 用于长连接建连的token
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * IsMuteAll.
             */
            public Builder isMuteAll(Boolean isMuteAll) {
                this.isMuteAll = isMuteAll;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
