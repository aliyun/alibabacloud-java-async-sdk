// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetHostGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetHostGroupResponseBody</p>
 */
public class GetHostGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HostGroup")
    private HostGroup hostGroup;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetHostGroupResponseBody(Builder builder) {
        this.hostGroup = builder.hostGroup;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHostGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return hostGroup
     */
    public HostGroup getHostGroup() {
        return this.hostGroup;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private HostGroup hostGroup; 
        private String requestId; 

        /**
         * <p>The returned detailed information about the asset group.</p>
         */
        public Builder hostGroup(HostGroup hostGroup) {
            this.hostGroup = hostGroup;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetHostGroupResponseBody build() {
            return new GetHostGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetHostGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetHostGroupResponseBody</p>
     */
    public static class HostGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("HostGroupId")
        private String hostGroupId;

        @com.aliyun.core.annotation.NameInMap("HostGroupName")
        private String hostGroupName;

        private HostGroup(Builder builder) {
            this.comment = builder.comment;
            this.hostGroupId = builder.hostGroupId;
            this.hostGroupName = builder.hostGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostGroup create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return hostGroupId
         */
        public String getHostGroupId() {
            return this.hostGroupId;
        }

        /**
         * @return hostGroupName
         */
        public String getHostGroupName() {
            return this.hostGroupName;
        }

        public static final class Builder {
            private String comment; 
            private String hostGroupId; 
            private String hostGroupName; 

            /**
             * <p>The remarks of the asset group.</p>
             * 
             * <strong>example:</strong>
             * <p>Description</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The asset group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder hostGroupId(String hostGroupId) {
                this.hostGroupId = hostGroupId;
                return this;
            }

            /**
             * <p>The name of the asset group.</p>
             * 
             * <strong>example:</strong>
             * <p>Host group 1</p>
             */
            public Builder hostGroupName(String hostGroupName) {
                this.hostGroupName = hostGroupName;
                return this;
            }

            public HostGroup build() {
                return new HostGroup(this);
            } 

        } 

    }
}
