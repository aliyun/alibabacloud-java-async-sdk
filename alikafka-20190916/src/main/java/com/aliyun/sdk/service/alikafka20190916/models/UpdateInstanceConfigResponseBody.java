// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateInstanceConfigResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateInstanceConfigResponseBody</p>
 */
public class UpdateInstanceConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private UpdateInstanceConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInstanceConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
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
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Indicates whether the request is successful.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * ## **Permissions**
         * <p>
         * 
         * If a RAM user wants to call the **UpdateInstanceConfig** operation, the RAM user must be granted the required permissions. For more information about how to grant permissions, see [RAM policies](~~185815~~).
         * 
         * |API|Action|Resource|
         * |---|---|---|
         * |UpdateInstanceConfig|alikafka: UpdateInstance|acs:alikafka:*:*:{instanceId}|
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * ### Config parameters
         * <p>
         * 
         * |Parameter|Type|Valid values|Default value|Description|
         * |---|---|---|---|---|
         * |enable.vpc\_sasl\_ssl|Boolean|true/false|false|Specifies whether to enable virtual private cloud (VPC) transmission encryption. If VPC transmission encryption is enabled, you must also enable the access control list (ACL) feature.|
         * |enable.acl|Boolean|true/false|false|Specifies whether to enable the ACL feature.|
         * |kafka.log.retention.hours|Integer|24~480|72|The retention period of messages. Unit: hours.|
         * |kafka.message.max.bytes|Integer|1048576~10485760|1048576|The maximum size of a message. Unit: bytes.|
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Modifies the configuration of a Message Queue for Apache Kafka instance.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public UpdateInstanceConfigResponseBody build() {
            return new UpdateInstanceConfigResponseBody(this);
        } 

    } 

}
