// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetLiveChannelInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetLiveChannelInfoResponseBody</p>
 */
public class GetLiveChannelInfoResponseBody extends TeaModel {
    @ParentIgnore("LiveChannelConfiguration")
    @NameInMap("Description")
    private String description;

    @ParentIgnore("LiveChannelConfiguration")
    @NameInMap("Status")
    private String status;

    @ParentIgnore("LiveChannelConfiguration")
    @NameInMap("Target")
    private LiveChannelTarget target;


    private GetLiveChannelInfoResponseBody(Builder builder) {
        this.description = builder.description;
        this.status = builder.status;
        this.target = builder.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLiveChannelInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return target
     */
    public LiveChannelTarget getTarget() {
        return this.target;
    }

    public static final class Builder {
        private String description; 
        private String status; 
        private LiveChannelTarget target; 

        /**
         * <p>Description.</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>Status.</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Target.</p>
         */
        public Builder target(LiveChannelTarget target) {
            this.target = target;
            return this;
        }

        public GetLiveChannelInfoResponseBody build() {
            return new GetLiveChannelInfoResponseBody(this);
        } 

    } 

}
