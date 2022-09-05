// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetRetcodeShareStatusRequest} extends {@link RequestModel}
 *
 * <p>SetRetcodeShareStatusRequest</p>
 */
public class SetRetcodeShareStatusRequest extends Request {
    @Query
    @NameInMap("Pid")
    @Validation(required = true)
    private String pid;

    @Query
    @NameInMap("Status")
    @Validation(required = true)
    private Boolean status;

    private SetRetcodeShareStatusRequest(Builder builder) {
        super(builder);
        this.pid = builder.pid;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetRetcodeShareStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pid
     */
    public String getPid() {
        return this.pid;
    }

    /**
     * @return status
     */
    public Boolean getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<SetRetcodeShareStatusRequest, Builder> {
        private String pid; 
        private Boolean status; 

        private Builder() {
            super();
        } 

        private Builder(SetRetcodeShareStatusRequest request) {
            super(request);
            this.pid = request.pid;
            this.status = request.status;
        } 

        /**
         * Pid.
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Boolean status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public SetRetcodeShareStatusRequest build() {
            return new SetRetcodeShareStatusRequest(this);
        } 

    } 

}
