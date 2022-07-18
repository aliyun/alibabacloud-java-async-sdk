// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateStressResponseBody} extends {@link TeaModel}
 *
 * <p>CreateStressResponseBody</p>
 */
public class CreateStressResponseBody extends TeaModel {
    @NameInMap("Message")
    private String message;

    @NameInMap("Name")
    private String name;

    @NameInMap("Region")
    private String region;

    @NameInMap("RequestId")
    private String requestId;

    private CreateStressResponseBody(Builder builder) {
        this.message = builder.message;
        this.name = builder.name;
        this.region = builder.region;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStressResponseBody create() {
        return builder().build();
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String message; 
        private String name; 
        private String region; 
        private String requestId; 

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateStressResponseBody build() {
            return new CreateStressResponseBody(this);
        } 

    } 

}
