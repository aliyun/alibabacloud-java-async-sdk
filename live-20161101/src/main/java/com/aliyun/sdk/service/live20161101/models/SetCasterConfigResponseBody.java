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
 * {@link SetCasterConfigResponseBody} extends {@link TeaModel}
 *
 * <p>SetCasterConfigResponseBody</p>
 */
public class SetCasterConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CasterId")
    private String casterId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SetCasterConfigResponseBody(Builder builder) {
        this.casterId = builder.casterId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetCasterConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return casterId
     */
    public String getCasterId() {
        return this.casterId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String casterId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(SetCasterConfigResponseBody model) {
            this.casterId = model.casterId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the production studio. You can specify the ID in a request to query the streaming URLs of the production studio, start the production studio, add a video resource, a layout, a component, or a playlist to the production studio, or query layouts of the production studio.</p>
         * 
         * <strong>example:</strong>
         * <p>b4810848-bcf9-4aef-bd4a-e6bba2d9****</p>
         */
        public Builder casterId(String casterId) {
            this.casterId = casterId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SetCasterConfigResponseBody build() {
            return new SetCasterConfigResponseBody(this);
        } 

    } 

}
