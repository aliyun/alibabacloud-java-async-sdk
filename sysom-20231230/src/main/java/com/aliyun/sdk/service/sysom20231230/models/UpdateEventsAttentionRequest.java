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
    @com.aliyun.core.annotation.NameInMap("X-Debug-Id")
    private String xDebugId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("mode")
    private Integer mode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("range")
    private String range;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("uuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("x-sysom-invoke-source")
    private String xSysomInvokeSource;

    private UpdateEventsAttentionRequest(Builder builder) {
        super(builder);
        this.xDebugId = builder.xDebugId;
        this.mode = builder.mode;
        this.range = builder.range;
        this.uuid = builder.uuid;
        this.xSysomInvokeSource = builder.xSysomInvokeSource;
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
     * @return xDebugId
     */
    public String getXDebugId() {
        return this.xDebugId;
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

    /**
     * @return xSysomInvokeSource
     */
    public String getXSysomInvokeSource() {
        return this.xSysomInvokeSource;
    }

    public static final class Builder extends Request.Builder<UpdateEventsAttentionRequest, Builder> {
        private String xDebugId; 
        private Integer mode; 
        private String range; 
        private String uuid; 
        private String xSysomInvokeSource; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEventsAttentionRequest request) {
            super(request);
            this.xDebugId = request.xDebugId;
            this.mode = request.mode;
            this.range = request.range;
            this.uuid = request.uuid;
            this.xSysomInvokeSource = request.xSysomInvokeSource;
        } 

        /**
         * X-Debug-Id.
         */
        public Builder xDebugId(String xDebugId) {
            this.putQueryParameter("X-Debug-Id", xDebugId);
            this.xDebugId = xDebugId;
            return this;
        }

        /**
         * mode.
         */
        public Builder mode(Integer mode) {
            this.putBodyParameter("mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * range.
         */
        public Builder range(String range) {
            this.putBodyParameter("range", range);
            this.range = range;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder uuid(String uuid) {
            this.putBodyParameter("uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        /**
         * x-sysom-invoke-source.
         */
        public Builder xSysomInvokeSource(String xSysomInvokeSource) {
            this.putQueryParameter("x-sysom-invoke-source", xSysomInvokeSource);
            this.xSysomInvokeSource = xSysomInvokeSource;
            return this;
        }

        @Override
        public UpdateEventsAttentionRequest build() {
            return new UpdateEventsAttentionRequest(this);
        } 

    } 

}
