// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link InstanceOperateResponse} extends {@link TeaModel}
 *
 * <p>InstanceOperateResponse</p>
 */
public class InstanceOperateResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    private InstanceOperateResponse(BuilderImpl builder) {
        super(builder);
        this.code = builder.code;
        this.instanceId = builder.instanceId;
        this.message = builder.message;
    }

    public static InstanceOperateResponse create() {
        return new BuilderImpl().build();
    }

@Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    public interface Builder extends Response.Builder<InstanceOperateResponse, Builder> {

        Builder code(Long code);

        Builder instanceId(String instanceId);

        Builder message(String message);

        @Override
        InstanceOperateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InstanceOperateResponse, Builder>
            implements Builder {
        private Long code; 
        private String instanceId; 
        private String message; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InstanceOperateResponse response) {
            super(response);
            this.code = response.code;
            this.instanceId = response.instanceId;
            this.message = response.message;
        } 

        /**
         * Code.
         */
        @Override
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * InstanceId.
         */
        @Override
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Message.
         */
        @Override
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        @Override
        public InstanceOperateResponse build() {
            return new InstanceOperateResponse(this);
        } 

    } 

}
