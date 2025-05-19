// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20180308.models;

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
 * {@link DescribeContactResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeContactResponseBody</p>
 */
public class DescribeContactResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Datapoints")
    private Datapoints datapoints;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeContactResponseBody(Builder builder) {
        this.code = builder.code;
        this.datapoints = builder.datapoints;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContactResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return datapoints
     */
    public Datapoints getDatapoints() {
        return this.datapoints;
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
        private Integer code; 
        private Datapoints datapoints; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeContactResponseBody model) {
            this.code = model.code;
            this.datapoints = model.datapoints;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Datapoints.
         */
        public Builder datapoints(Datapoints datapoints) {
            this.datapoints = datapoints;
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

        public DescribeContactResponseBody build() {
            return new DescribeContactResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeContactResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContactResponseBody</p>
     */
    public static class Channel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Channel(Builder builder) {
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Channel create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(Channel model) {
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Channel build() {
                return new Channel(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeContactResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContactResponseBody</p>
     */
    public static class Channels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Channel")
        private java.util.List<Channel> channel;

        private Channels(Builder builder) {
            this.channel = builder.channel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Channels create() {
            return builder().build();
        }

        /**
         * @return channel
         */
        public java.util.List<Channel> getChannel() {
            return this.channel;
        }

        public static final class Builder {
            private java.util.List<Channel> channel; 

            private Builder() {
            } 

            private Builder(Channels model) {
                this.channel = model.channel;
            } 

            /**
             * Channel.
             */
            public Builder channel(java.util.List<Channel> channel) {
                this.channel = channel;
                return this;
            }

            public Channels build() {
                return new Channels(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeContactResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContactResponseBody</p>
     */
    public static class Datapoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Channels")
        private Channels channels;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Datapoints(Builder builder) {
            this.channels = builder.channels;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Datapoints create() {
            return builder().build();
        }

        /**
         * @return channels
         */
        public Channels getChannels() {
            return this.channels;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Channels channels; 
            private String name; 

            private Builder() {
            } 

            private Builder(Datapoints model) {
                this.channels = model.channels;
                this.name = model.name;
            } 

            /**
             * Channels.
             */
            public Builder channels(Channels channels) {
                this.channels = channels;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Datapoints build() {
                return new Datapoints(this);
            } 

        } 

    }
}
