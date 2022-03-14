// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPushAllTaskRequest} extends {@link RequestModel}
 *
 * <p>ModifyPushAllTaskRequest</p>
 */
public class ModifyPushAllTaskRequest extends Request {
    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("Tasks")
    private String tasks;

    @Query
    @NameInMap("Uuids")
    private String uuids;

    private ModifyPushAllTaskRequest(Builder builder) {
        super(builder);
        this.sourceIp = builder.sourceIp;
        this.tasks = builder.tasks;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPushAllTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return tasks
     */
    public String getTasks() {
        return this.tasks;
    }

    /**
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<ModifyPushAllTaskRequest, Builder> {
        private String sourceIp; 
        private String tasks; 
        private String uuids; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPushAllTaskRequest request) {
            super(request);
            this.sourceIp = request.sourceIp;
            this.tasks = request.tasks;
            this.uuids = request.uuids;
        } 

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * Tasks.
         */
        public Builder tasks(String tasks) {
            this.putQueryParameter("Tasks", tasks);
            this.tasks = tasks;
            return this;
        }

        /**
         * Uuids.
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public ModifyPushAllTaskRequest build() {
            return new ModifyPushAllTaskRequest(this);
        } 

    } 

}
