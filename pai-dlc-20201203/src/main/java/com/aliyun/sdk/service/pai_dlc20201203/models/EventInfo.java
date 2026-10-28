// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link EventInfo} extends {@link TeaModel}
 *
 * <p>EventInfo</p>
 */
public class EventInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("PodId")
    private String podId;

    @com.aliyun.core.annotation.NameInMap("PodUid")
    private String podUid;

    @com.aliyun.core.annotation.NameInMap("Time")
    private String time;

    private EventInfo(Builder builder) {
        this.content = builder.content;
        this.id = builder.id;
        this.podId = builder.podId;
        this.podUid = builder.podUid;
        this.time = builder.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EventInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return podId
     */
    public String getPodId() {
        return this.podId;
    }

    /**
     * @return podUid
     */
    public String getPodUid() {
        return this.podUid;
    }

    /**
     * @return time
     */
    public String getTime() {
        return this.time;
    }

    public static final class Builder {
        private String content; 
        private String id; 
        private String podId; 
        private String podUid; 
        private String time; 

        private Builder() {
        } 

        private Builder(EventInfo model) {
            this.content = model.content;
            this.id = model.id;
            this.podId = model.podId;
            this.podUid = model.podUid;
            this.time = model.time;
        } 

        /**
         * <p>The text content of the event.</p>
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The ID of the event, which is used to obtain the related context.</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The ID of the pod to which the event belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>dlc*****-master-0</p>
         */
        public Builder podId(String podId) {
            this.podId = podId;
            return this;
        }

        /**
         * <p>The UID of the pod to which the event belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>94a7cc7c-0033-48b5-85bd-71c63592c268</p>
         */
        public Builder podUid(String podUid) {
            this.podUid = podUid;
            return this;
        }

        /**
         * <p>The timestamp of the event in UTC.</p>
         */
        public Builder time(String time) {
            this.time = time;
            return this;
        }

        public EventInfo build() {
            return new EventInfo(this);
        } 

    } 

}
