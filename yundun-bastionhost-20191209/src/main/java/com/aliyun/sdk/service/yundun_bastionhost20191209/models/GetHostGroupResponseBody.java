// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHostGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetHostGroupResponseBody</p>
 */
public class GetHostGroupResponseBody extends TeaModel {
    @NameInMap("HostGroup")
    private HostGroup hostGroup;

    @NameInMap("RequestId")
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
         * The ID of the host group that you want to query.
         * <p>
         * 
         * >  You can call the [ListHostGroups](~~201307~~) operation to query the ID of the host group.
         */
        public Builder hostGroup(HostGroup hostGroup) {
            this.hostGroup = hostGroup;
            return this;
        }

        /**
         * my host group.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetHostGroupResponseBody build() {
            return new GetHostGroupResponseBody(this);
        } 

    } 

    public static class HostGroup extends TeaModel {
        @NameInMap("Comment")
        private String comment;

        @NameInMap("HostGroupId")
        private String hostGroupId;

        @NameInMap("HostGroupName")
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
             * The details of the host group returned.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * The description of the host group.
             */
            public Builder hostGroupId(String hostGroupId) {
                this.hostGroupId = hostGroupId;
                return this;
            }

            /**
             * The ID of the host group.
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
