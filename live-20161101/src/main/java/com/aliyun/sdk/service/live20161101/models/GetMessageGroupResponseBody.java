// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link GetMessageGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetMessageGroupResponseBody</p>
 */
public class GetMessageGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetMessageGroupResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-****-CB92E68F4CD8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned result.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetMessageGroupResponseBody build() {
            return new GetMessageGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMessageGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetMessageGroupResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("Extension")
        private java.util.Map<String, ?> extension;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("IsMuteAll")
        private Boolean isMuteAll;

        @com.aliyun.core.annotation.NameInMap("Status")
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
        public java.util.Map<String, ?> getExtension() {
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
            private java.util.Map<String, ?> extension; 
            private String groupId; 
            private Boolean isMuteAll; 
            private Integer status; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.createTime = model.createTime;
                this.creatorId = model.creatorId;
                this.extension = model.extension;
                this.groupId = model.groupId;
                this.isMuteAll = model.isMuteAll;
                this.status = model.status;
            } 

            /**
             * <p>The time when the message group was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1502280113</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>as****hs</p>
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * <p>The extended field.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder extension(java.util.Map<String, ?> extension) {
                this.extension = extension;
                return this;
            }

            /**
             * <p>The ID of the message group.</p>
             * 
             * <strong>example:</strong>
             * <p>AE35-****-T95F</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>Indicates whether the message group is muted.</p>
             * <ul>
             * <li>true: The message group is muted.</li>
             * <li>false: The message group is not muted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isMuteAll(Boolean isMuteAll) {
                this.isMuteAll = isMuteAll;
                return this;
            }

            /**
             * <p>The status of the message group. The default value is <strong>1</strong>, which indicates that the message group is normal.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
