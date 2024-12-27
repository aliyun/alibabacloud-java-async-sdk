// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link UpdateEventsAttentionRequest} extends {@link RequestModel}
 *
 * <p>UpdateEventsAttentionRequest</p>
 */
public class UpdateEventsAttentionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateEventsAttentionRequestBody body;

    private UpdateEventsAttentionRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEventsAttentionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public UpdateEventsAttentionRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateEventsAttentionRequest, Builder> {
        private UpdateEventsAttentionRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEventsAttentionRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(UpdateEventsAttentionRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putQueryParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public UpdateEventsAttentionRequest build() {
            return new UpdateEventsAttentionRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateEventsAttentionRequest} extends {@link TeaModel}
     *
     * <p>UpdateEventsAttentionRequest</p>
     */
    public static class UpdateEventsAttentionRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("mode")
        private Integer mode;

        @com.aliyun.core.annotation.NameInMap("range")
        private String range;

        @com.aliyun.core.annotation.NameInMap("uuid")
        @com.aliyun.core.annotation.Validation(required = true)
        private String uuid;

        private UpdateEventsAttentionRequestBody(Builder builder) {
            this.mode = builder.mode;
            this.range = builder.range;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateEventsAttentionRequestBody create() {
            return builder().build();
        }

        /**
         * @return mode
         */
        public Integer getMode() {
            return this.mode;
        }

        /**
         * @return range
         */
        public String getRange() {
            return this.range;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private Integer mode; 
            private String range; 
            private String uuid; 

            /**
             * mode.
             */
            public Builder mode(Integer mode) {
                this.mode = mode;
                return this;
            }

            /**
             * range.
             */
            public Builder range(String range) {
                this.range = range;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>03de78af-f49f-433d-b5b1-0f6a70c493ba</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public UpdateEventsAttentionRequestBody build() {
                return new UpdateEventsAttentionRequestBody(this);
            } 

        } 

    }
}
