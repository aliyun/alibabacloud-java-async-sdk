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
 * {@link GetLivePackageChannelGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetLivePackageChannelGroupResponseBody</p>
 */
public class GetLivePackageChannelGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LivePackageChannelGroup")
    private LivePackageChannelGroup livePackageChannelGroup;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetLivePackageChannelGroupResponseBody(Builder builder) {
        this.livePackageChannelGroup = builder.livePackageChannelGroup;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLivePackageChannelGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return livePackageChannelGroup
     */
    public LivePackageChannelGroup getLivePackageChannelGroup() {
        return this.livePackageChannelGroup;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LivePackageChannelGroup livePackageChannelGroup; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetLivePackageChannelGroupResponseBody model) {
            this.livePackageChannelGroup = model.livePackageChannelGroup;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Details of the channel group.</p>
         */
        public Builder livePackageChannelGroup(LivePackageChannelGroup livePackageChannelGroup) {
            this.livePackageChannelGroup = livePackageChannelGroup;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>req-abcdefg123456</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetLivePackageChannelGroupResponseBody build() {
            return new GetLivePackageChannelGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLivePackageChannelGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetLivePackageChannelGroupResponseBody</p>
     */
    public static class LivePackageChannelGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("LastModified")
        private String lastModified;

        @com.aliyun.core.annotation.NameInMap("OriginDomain")
        private String originDomain;

        private LivePackageChannelGroup(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.groupName = builder.groupName;
            this.lastModified = builder.lastModified;
            this.originDomain = builder.originDomain;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LivePackageChannelGroup create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return lastModified
         */
        public String getLastModified() {
            return this.lastModified;
        }

        /**
         * @return originDomain
         */
        public String getOriginDomain() {
            return this.originDomain;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String groupName; 
            private String lastModified; 
            private String originDomain; 

            private Builder() {
            } 

            private Builder(LivePackageChannelGroup model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.groupName = model.groupName;
                this.lastModified = model.lastModified;
                this.originDomain = model.originDomain;
            } 

            /**
             * <p>The time when the channel group was created. It is in the yyyy-MM-ddTHH:mm:ssZ format and displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-01T12:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The channel group description.</p>
             * 
             * <strong>example:</strong>
             * <p>Updated description of the channel group.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The channel group name.</p>
             * 
             * <strong>example:</strong>
             * <p>channel-group-1</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The time when the channel group was last modified. It is in the yyyy-MM-ddTHH:mm:ssZ format and displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-01T12:00:00Z</p>
             */
            public Builder lastModified(String lastModified) {
                this.lastModified = lastModified;
                return this;
            }

            /**
             * <p>The origin domain.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder originDomain(String originDomain) {
                this.originDomain = originDomain;
                return this;
            }

            public LivePackageChannelGroup build() {
                return new LivePackageChannelGroup(this);
            } 

        } 

    }
}
