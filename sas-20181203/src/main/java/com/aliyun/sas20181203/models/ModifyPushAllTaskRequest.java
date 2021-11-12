// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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

    public static final class Builder extends Request.Builder {
        private String sourceIp; 
        private String tasks; 
        private String uuids; 

        /**
         * <p>SourceIp.</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>Tasks.</p>
         */
        public Builder tasks(String tasks) {
            this.putQueryParameter("Tasks", tasks);
            this.tasks = tasks;
            return this;
        }

        /**
         * <p>Uuids.</p>
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        public ModifyPushAllTaskRequest build() {
            return new ModifyPushAllTaskRequest(this);
        } 

    } 

}
